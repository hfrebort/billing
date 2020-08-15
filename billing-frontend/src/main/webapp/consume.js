angular.module('billing', ['ngRoute'])
.config(['$routeProvider', function($routeProvider) {
    $routeProvider.
    when('/customerOverview',{
        templateUrl : '/customerOverview.html',
        controller: 'CustomerController'
    }).
    when("/customerEdit", {
        templateUrl: '/customerEdit.html',
        controller: 'CustomerController'
    }).
    otherwise({
    	redirectTo: '/customerOverview'
    });
}])
.controller('CustomerController', function($scope, $http) {
    
    this.getAll = function() { 
		$http.get('http://localhost:8080/customers').then(function(response) {
	    	console.log("done: ", response);
	        $scope.customers = response.data;
		});
	};
		
	this.insert = function() {
		console.log("Das ist der customer: ", $scope.customer);
		
		$http.post('http://localhost:8080/customer', $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
		
	};
	
	this.update = function() {
		$http.put('http://localhost:8080/customer', $scope.customer).then(function(response) {
	    	console.log("saved: ", response);
	    });
		
	};

    console.log("initialize controller");
    $scope.customer = this.getAll();

});