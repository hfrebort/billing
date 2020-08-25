angular.module('billing')
.controller('PositionController', function($scope, $http) {
	
	$scope.positions = [
		{positionId:123, name: 'Lieferung', price: 200.00, tax: 0.2},
		{positionId:123, name: 'Entsorgung', price: 300.00, tax: 0.1},
	];
	
	this.insert = function() {
		$scope.positions.push($scope.position);
	};
});