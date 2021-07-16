<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>

<link rel="stylesheet" href="../../assets/css/moonmotor.css">

<head>
<meta charset="ISO-8859-1">
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

			<h1>
				<strong>${loginUser.fname} ${loginUser.lname}'s</strong> Admin
				Portal
			</h1>
			<br></br>
			<p class="lead">You have special privileges as an administrator.  You may edit and remove vehicle listings, remove users, close out pending transactions, and review past sales.</p><br>

			<div id="special-offer">
				<h2>
					<a href="/adminprofile">About Me</a>
				</h2>
				<p class="lead2">
					<em>${loginUser.bio}</em> <br>
					<h2>
						<a href="/pending">Pending Sales</a></h2>
					<p class="lead2">
					<em>Review and close-out pending sales.</em>
					<br>
					<h2>
						<a href="/past">Past Sales</a></h2>
						<p class="lead2">
					<em>A log of all past transactions.</em>
				</div>

<br>

				<div class="img-container">
					<img src="assets/image/moonadmin.png" width="326" height="227"
						alt="Advertisement of the Model A Moon Car.">
				</div>

				<br>
				<blockquote>
					<p>"THE CAR OF COMFORT with the Reserve of Speed" ~ Moon Motor Car Company</p>
				</blockquote>
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
