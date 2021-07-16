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

	<a href="/admin" title="Return to Home Page"> <img id="logo"
		src="assets/image/logo.jpg" style="border-radius: 50%"
		alt="Moon Motor Cars company shield">
	</a>

	<div id="container">

		<div id="main-content">

			<h1>Moon Motor Car Exchange Network</h1>
			<br>

			<h2>${success}</h2>
									<br>
						<hr>
						<br>

				<c:choose>
					<c:when test="${not empty users}">
						<c:forEach var="item" items="${users}">
							<h2>${item.fname} ${item.lname}</h2>
							<h3>
								<em><a href="mailto:${item.email}">${item.email}</a></em>
							</h3>
							<h2>${item.bio}</h2>
							<br>
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
					<form:form action="/adminconnect?email=${item.email}">
					<input type="submit" value="Remove User">
					</form:form>
					<br>
						<hr>
						<br>
						</c:forEach>
					</c:when>
					<c:otherwise>
						<h3>No users found</h3>
					</c:otherwise>
				</c:choose>
				
		</div>

		<div id="sidebar">
			<div class="widget">
				<h3>
					<a href="/logout">Logout</a>
				</h3>
				<p>Log out of your profile</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/adminconnect">Connect</a>
				</h3>
				<p>Connect with other members</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/adminbuy">Buy</a>
				</h3>
				<p>Purchase your own piece of Moon Motor Car history</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/adminsell">Sell</a>
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
