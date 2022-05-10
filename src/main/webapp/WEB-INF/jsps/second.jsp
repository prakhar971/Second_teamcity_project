<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Second Jsp Page</h1>
	<table class="table table-dark table-bordered">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">Code</th>
				<th scope="col">Name</th>
				<th scope="col">Type</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th scope="row">${teamcity.id}</th>
				<td>${teamcity.code}</td>
				<td>${teamcity.name}</td>
				<td>${teamcity.type}</td>
			</tr>
			
		</tbody>
	</table>
</body>
</html>