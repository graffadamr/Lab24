<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/lux/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-hVpXlpdRmJ+uXGwD5W6HZMnR9ENcKVRn855pPbuI/mwPIEKAuKgTKgGksVGmlAvt"
	crossorigin="anonymous">
</head>
<body>

	<form action="/complete-page" method="post" name="myform"
		onsubmit="return validateForm()">
		
		<fieldset>
			<div class="form-group">
				<label for="firstName">First Name</label> <input type="text"
					class="form-control" name="fname" placeholder="First Name"
					required>
			</div>
			<div class="form-group">
				<label for="lastName">Last Name</label> <input type="text"
					class="form-control" name="lname" placeholder="Last Name"
					required>
			</div>
			<div class="form-group">
				<label for="Email">E-mail</label> <input type="text"
					class="form-control" id="email" name="email"
					placeholder="email@example.com" required>
			</div>
			<div class="form-group">
				<label for="phoneNumber">Phone Number</label> <input type="number"
					class="form-control" name="phone" placeholder="xxx-xxxx-xxxx"
					required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</fieldset>
	</form>
</body>

<script>
	function validateForm() {
		if (!validateEmail())
			return false
		if (!validatePassword())
			return false

		return true
	}

	function validateEmail() {
		var email = document.myform.email.value

		if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
			return (true)
		}
		alert("You have entered an invalid email address!")
		return (false)
	}

	function validatePassword() {
		var password1 = document.myform.password1.value
		var password2 = document.myform.password2.value

		if (password1 === password2) {
			return (true)
		}
		alert("Your passwords do not match! Try again!")
		return (false)

	}
</script>
</html>