<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer Management Tool</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
</head>
<body style="padding:40px">

	<div class="container-fluid">
	
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#" style="color:white;">Customer Management Companion</a>
				</div>

			</div>
		</nav>

		<div>
			<a class="btn btn-primary" href='showFormForAdd'><span>Add
					New Customer</span></a>
		</div>

		<table class="table">
			<thead>
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Action</th>

				</tr>
			</thead>
			<tbody>

				<C:forEach var="tempCustomer" items="${customers}">

					<C:url var="updateLink" value="showFormForUpdate">
						<C:param name="customerId" value="${tempCustomer.id}" />
					</C:url>

					<C:url var="deleteLink" value="deleteCustomer">
						<C:param name="customerId" value="${tempCustomer.id}" />
					</C:url>
					<tr>
						<td>${tempCustomer.firstName }</td>
						<td>${tempCustomer.lastName }</td>
						<td>${tempCustomer.email }</td>
						<td><a class="btn btn-warning" href="${updateLink}">Update</a>
							<a class="btn btn-danger" href="${deleteLink}">Delete</a></td>
					</tr>
				</C:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>
