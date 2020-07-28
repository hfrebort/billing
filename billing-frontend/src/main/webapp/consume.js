angular.module('billing', [])
.controller('CustomerController', function($scope, $http) {
	
	console.log("initialize controller");
	$scope.customers = [{"customerId":3,"firstName":"Paul","lastName":"Kafka"},{"customerId":4,"firstName":"Harald","lastName":"Frebort"}];
	
	/**
    $http.get('http://localhost:8080/customers').then(function(response) {
    	console.log("done: ", response);
        //$scope.customers = response.data;
    });
    */
});
