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
    
	this.getZipCodes = function() {
		$http.get('http://localhost:8080/zipcodes').then(function(response) {
	    	console.log("getZipCodes: ", response);
	    	$scope.zipCodes = response.data;
		});
	};
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
		console.log("insert customer: ", $scope.customer);
		
		$http.post('http://localhost:8080/customers', $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
		
	};
	
	this.update = function() {
		console.log("update customer: ", $scope.customer);
		
		$http.put('http://localhost:8080/customers', $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
	};

	this.fillCity = function() {
		if ($scope.customer.zipCode !== undefined) {
			$scope.customer.city = $scope.zipCodes.filter(e => e.zipCode === $scope.customer.zipCode).map(e => e.city);			
		}
	};
	
    console.log("initialize edit controller");
    if ($routeParams.customerId === 'new') {
        $scope.customer = {customerId: 111};
        $scope.mode = 'insert';
    } else {
    	this.get($routeParams.customerId);
    	$scope.mode = 'update';
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