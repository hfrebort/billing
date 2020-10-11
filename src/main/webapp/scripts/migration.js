angular.module('billing')
.controller('MigrationController', function($scope, $http) {
	
	this.migrate = function() { 
		$http.get('http://localhost:8080/migrate').then(function(response) {
			console.log("done: ", response);
			$scope.statistics = response.data;
		});
	};
	
	this.migrate();
	
});