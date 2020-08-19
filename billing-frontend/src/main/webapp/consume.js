angular.module('billing', ['ngRoute'])
.config(['$routeProvider', function($routeProvider) {
    $routeProvider
    .when('/customerOverview',{
        templateUrl: '/customerOverview.html',
        controller: 'CustomerOverviewController',
       	controllerAs: 'ctrl'
    })
    .when("/customerEdit/:customerId", {
        templateUrl: '/customerEdit.html',
        controller: 'CustomerEditController',
        controllerAs: 'ctrl'
    })
    .when("/migrate", {
    	templateUrl: '/migration.html',
    	controller: 'MigrationController',
    	controllerAs: 'ctrl'
    })
    .otherwise({
    	redirectTo: '/customerOverview'
    });
}])
.controller('CustomerOverviewController', function($scope, $http) {
    
    this.getAll = function() { 
		$http.get('http://localhost:8080/customers').then(function(response) {
	    	console.log("done: ", response);
	        $scope.customers = response.data;
		});
	};

    console.log("initialize overview controller");
    this.getAll();

})
.controller('CustomerEditController', function($scope, $http, $routeParams) {
	
    // CRUD functions 
	this.get = function(customerId) {
		$http.get('http://localhost:8080/customers/' + customerId).then(function(response) {
	    	console.log("get: ", response);
	        $scope.customer = response.data;
		}, function(response) {
	    	console.log("get failed: ", response);
	        $scope.customer = {customerId: 1};
		});
	};
	this.insert = function() {
		$http.post('http://localhost:8080/customers', $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
	};
	this.update = function() {
		$http.put('http://localhost:8080/customers', $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
	};
	
	// functions to improve usability
	this.determineNextCustomerId = function() {
		$http.get('http://localhost:8080/generate/customerid').then(function(response) {
			$scope.customer = {customerId: response.data};
		}, function(response) {
			$scope.customer = {customerId: 1};
		});
	};
	this.getZipCodes = function() {
		$http.get('http://localhost:8080/zipcodes').then(function(response) {
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
})
.controller('MigrationController', function($scope, $http) {
	
	this.migrate = function() { 
		$http.get('http://localhost:8080/migrate').then(function(response) {
			console.log("done: ", response);
			$scope.statistics = response.data;
		});
	};
	
	this.migrate();
	
});