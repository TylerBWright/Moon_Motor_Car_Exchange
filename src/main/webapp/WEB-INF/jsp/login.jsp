<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<link rel="stylesheet" href="../../assets/css/moonmotor.css">

<head>
<title>Moon Motor Car Exchange</title>

<link href="../../assets/css/moonmotor.css" rel="stylesheet">

</head>
<body>

	<a href="/home" title="Return to Home Page"> <img id="logo"
		src="assets/image/logo.jpg" style="border-radius: 50%"
		alt="Moon Motor Cars company shield">
	</a>

	<div id="container">

		<div id="main-content">

			<h1>Log-in</h1>
			<br>

			<p>Please enter your email and password to log into the Moon Motor Car Exchange:</p><br>
			
			<p>${error}</p><br>

			<form:form action="/login" modelAttribute="user">

				<fieldset>
					<legend>Login</legend>
					<br>
					<br> Email:
					<form:input type="email" id="inputEmail" path="email"
						placeholder="you@email.com" required="true"/>
					<br></br> 
					Password:
					<form:input type="password" id="inputPassword" path="password"
						placeholder="password" required="true"/>
						<br></br>
<style>
input[type="submit"] {
	background: #42D9DA top left repeat;
	width: 125px;
	height: 30px;
	color: #fff;
    border-radius: 10px;
    cursor:pointer;
}
</style>
					
					<input type="submit" value="Submit">
					<br></br>
				</fieldset>
			</form:form>
			

		</div>

		<div id="sidebar">
			<div class="widget">
				<h3>
					<a href="/login">Login</a>
				</h3>
				<p>Log in today to access member services</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/login">Buy</a>
				</h3>
				<p>Purchase your own piece of Moon Motor Car history</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/login">Sell</a>
				</h3>
				<p>List your Moon Motor Car on our website</p>
			</div>

			<div class="widget">
				<h3>
					<a href="mailto:admin@mooncarexchange.com">Contact Us</a>
				</h3>
				<p>You may reach us at:</p>
				<a href="mailto:admin@mooncarexchange.com">admin@mooncarexchange.com</a>
			</div>

		</div>

	</div>
	<!-- end container -->

</body>
</html>
