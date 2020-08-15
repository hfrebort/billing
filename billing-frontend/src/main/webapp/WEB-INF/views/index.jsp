<!doctype html>
<html ng-app="billing">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
	
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.0/angular.min.js"></script>
    <script src="consume.js"></script>	
<title>Billing</title>
</head>
<body>
	<jsp:include page="navigation.jsp"></jsp:include>
	<div class="jumbotron">
		<h1 class="lead">Haupt&uuml;bersicht</h1>
		<p>Hier k&ouml;nnten die zuletzt erfassten Eintr&auml;ge
			aufgelistet werden.</p>
			
		<div class="row">
			<div class="col-sm">
				<div class="table-responsive" data-ng-controller="CustomerController as ctrl">
					<table class="table table-striped"">
						<tr>
							<th>Kundennummer</th>
							<th>Vorname</th>
							<th>Nachname</th>
						</tr>

						<tr data-ng-repeat="customer in customers">
							<td data-title='Kundennummer'>{{customer.customerId}}</td>
							<td data-title='Vorname'>{{customer.firstName}}</td>
							<td data-title='Nachname'>{{customer.lastName}}</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
			
	</div>
	<div>
	
</body>
</html>