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
    .when('/invoiceOverview',{
    	templateUrl: '/invoiceOverview.html',
    	controller: 'InvoiceOverviewController',
    	controllerAs: 'ctrl'
    })
    .when('/invoiceEdit/:invoiceId',{
    	templateUrl: '/invoiceEdit.html',
    	controller: 'InvoiceEditController',
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
}]);