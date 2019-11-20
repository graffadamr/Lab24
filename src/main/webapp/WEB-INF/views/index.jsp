<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css" rel="stylesheet" integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt" crossorigin="anonymous">
</head>
<body>
	<div class="container">

<h1>Welcome to La Dolce Cafe</h1>


	<a class="primary-btn"href="/register">Register Here</a>
	
		<br><br>
		<h5>Coffee Available to Purchase</h5>

		<table class="table">
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Quantity</th>
				<th>Price</th>
			</tr>
			<c:forEach var="p" items="${productList}">
				<tr>
					<td>${p.name}</td>
					<td>${p.description}</td>
					<td>${p.quantity}</td>
					<td>${p.price}</td>
				</tr>
			</c:forEach>
		</table>
	
	
	</div>
</body>
</html>