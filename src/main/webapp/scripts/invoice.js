angular.module('billing')
.controller('InvoiceOverviewController', function($scope, $http, endpointUrls) {
    
    this.getAll = function() { 
		$http.get(endpointUrls.invoices).then(function(response) {
	    	console.log("invoice done: ", response);
	        $scope.invoices = response.data;
		});
	};

    console.log("initialize overview controller");
    this.getAll();

}).controller('InvoiceEditController', function($scope, $http, $routeParams, endpointUrls) {
	var uuid = Math.floor((1 + Math.random()) * 0x10000);
	console.log("initialize edit invoice controller. uuid: ", uuid);
	
	$scope.invoice = {invoiceId: uuid, number: '00001/20'};

	this.insert = function() {
		$http.post(endpointUrls.invoices, $scope.invoice).then(function(response) {
	    	console.log("saved invoice: ", response);
	    });
	};
	this.update = function() {
		$http.put(endpointUrls.invoices, $scope.invoice).then(function(response) {
	    	console.log("saved invoice: ", response);
	    });
	};
	
	// initialization of customer edit
    if ($routeParams.invoiceId === 'new') {
    	$scope.mode = 'insert';
    } else {
    	$scope.mode = 'update';
    }

});