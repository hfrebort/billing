angular.module('billing', [])
.controller('CustomerController', function($scope, $http) {
	
	console.log("initialize controller");
	$scope.customers = [{"customerId":3,"firstName":"Paul","lastName":"Kafka"},{"customerId":4,"firstName":"Harald","lastName":"Frebort"}];
	// $scope.customer = {"customerId":3,"firstName":"Paul","lastName":"Kafka"};
	
	$http.get('http://localhost:8080/customer/' + 3).then(function(response) {
    	console.log("done: ", response);
        $scope.customer = response.data;
	});
	
	
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

	this.getAll = function() { 
		$http.get('http://localhost:8080/customers').then(function(response) {
	    	console.log("done: ", response);
	        $scope.customers = response.data;
		});
	};
});
