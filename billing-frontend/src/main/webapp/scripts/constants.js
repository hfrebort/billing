angular.module('billing')
.constant('endpointUrls', {
		customers: 'http://localhost:8080/customers',
		generate: 'http://localhost:8080/generate',
		zipCodes: 'http://localhost:8080/zipcodes'
});