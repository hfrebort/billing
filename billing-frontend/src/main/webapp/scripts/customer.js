angular.module('billing')
.controller('CustomerOverviewController', function($scope, $http, endpointUrls) {
    
    this.getAll = function() { 
		$http.get(endpointUrls.customers).then(function(response) {
	    	console.log("done: ", response);
	        $scope.customers = response.data;
		});
	};

    console.log("initialize overview controller");
    this.getAll();

})
.controller('CustomerEditController', function($scope, $http, $routeParams, endpointUrls) {
	var defaultCustomer = {paymentDate:28, reminderLock: "0"};
	
    // CRUD functions 
	this.get = function(customerId) {
		$http.get(endpointUrls.customers + '/' + customerId).then(function(response) {
	        $scope.customer = response.data;
		}, function(response) {
	        Object.assign($scope.customer, defaultCustomer);
		});
	};
	this.insert = function() {
		$http.post(endpointUrls.customers, $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
	};
	this.update = function() {
		$http.put(endpointUrls.customers, $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
	};
	
	// functions to improve usability
	this.determineNextCustomerId = function() {
		$http.get(endpointUrls.generate + '/customerid').then(function(response) {
			$scope.customer = {customerId: response.data};
	        Object.assign($scope.customer, defaultCustomer);
		}, function(response) {
	        Object.assign($scope.customer, defaultCustomer);
		});
	};
	this.getZipCodes = function() {
		$http.get(endpointUrls.zipCodes).then(function(response) {
			$scope.zipCodes = response.data;
		});
	};
	this.fillCity = function() {
		if ($scope.customer.zipCode !== undefined) {
			$scope.customer.city = $scope.zipCodes.filter(e => e.zipCode === $scope.customer.zipCode).map(e => e.city);			
		}
	};
	
	// initialization of customer edit
    if ($routeParams.customerId === 'new') {
    	$scope.mode = 'insert';
    	this.determineNextCustomerId();
    } else {
    	$scope.mode = 'update';
    	this.get($routeParams.customerId);
    }
    this.getZipCodes();
});