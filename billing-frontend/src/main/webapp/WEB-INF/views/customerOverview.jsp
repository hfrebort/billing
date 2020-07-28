<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
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

<title>Kundendaten</title>
</head>
<body>
	<jsp:include page="navigation.jsp"></jsp:include>

	<div class="jumbotron">
		<h1 class="lead">&Uuml;bersicht Kundendaten</h1>
	</div>
	<div class="row">
		<div class="col-sm">
			<div class="table-responsive">
				<table class="table table-striped"">
					<tr>
						<th>Kundennummer</th>
						<th>Vorname</th>
						<th>Nachname</th>
					</tr>
					<c:forEach var="entry" items="${customerEntries}">
						<tr>
							<td>${entry.customerId}</td>
							<td>${entry.firstName}</td>
							<td>${entry.lastName}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>