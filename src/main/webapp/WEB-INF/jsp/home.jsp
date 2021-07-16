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

	<a href="/home" title="Return to Home Page"> <img id="logo"
		src="assets/image/logo.jpg" style="border-radius: 50%"
		alt="Moon Motor Cars company shield">
	</a>

	<div id="container">

		<div id="main-content">

			<h1>
				<strong>${loginUser.fname} ${loginUser.lname}'s</strong> Member
				Portal
			</h1>
			<br></br>
			<p class="lead">Welcome back! Feel free to browse current listings, post your vehicle for sale, review pending and past transactions, or just shoot the breeze with other members on all things MOON!</p><br>

			<div id="special-offer">
				<h2>
					<a href="/profile">About Me</a>
				</h2>
				<p class="lead2">
					<em>${loginUser.bio}</em>
					<h2>
						<a href="/pendingtransactions">Pending Transactions</a></h2>
						<p class="lead2">
					<em>Check the status of any open transactions.</em>
										<h2>
						<a href="/transactionhistory">Transaction History</a></h2>
						<p class="lead2">
					<em>View your past transactions.</em>
			</div>

			<br></br>
			<div class="img-container">
				<img src="assets/image/mooncompany.jpg" width="400" height="272"
					alt="Black and white photo of the St. Louis Moon Motor Car Company building.">
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
					<a href="/connect">Connect</a>
				</h3>
				<p>Connect with other members</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/buy">Buy</a>
				</h3>
				<p>Purchase your own piece of Moon Motor Car history</p>
			</div>

			<div class="widget">
				<h3>
					<a href="/sell">Sell</a>
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
