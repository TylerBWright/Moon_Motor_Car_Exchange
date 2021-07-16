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

				<style>
input[type="submit"] {
	background: #42D9DA top left repeat;
	width: 125px;
	height: 30px;
	color: #fff;
	border-radius: 10px;
	cursor: pointer;
}
</style>

				<h1>Transaction History</h1>
			<br>
			<h2>Display all of your past sales:</h2>
			<br>
			
			<form action="/transactionhistorysell" method="get">
				<br> <select name="sellerEmail">
					<option value="${loginUser.email}">${loginUser.email}</option>
				</select> <br></br> <input type="submit" value="Submit"> <br>
			</form>
			
			<br></br>
			<h2>Display all of your past purchases:</h2>
			<br>
	
			<form action="/transactionhistorybuy" method="get">
			<br> <select name="buyerEmail">
					<option value="${loginUser.email}">${loginUser.email}</option>
				</select> <br></br> <input type="submit" value="Submit"> <br>
			</form>
			<br></br>
			<hr>
			<br>

			<c:choose>
				<c:when test="${not empty carsSold}">
					<c:forEach var="item" items="${carsSold}">
						<h2>
							<strong>Vehicle Information:</strong>
						</h2>
						<br>
						<h2>Make: ${item.carMake}</h2>
						<h2>Model: ${item.carModel}</h2>
						<h2>Year: ${item.carYear}</h2>
						<h2>Asking Price: $ ${item.carPrice}</h2>
						<h2>
							Discount:
							<mark class="red">${item.discount}</mark>
						</h2>
						<h2>
							Description: <em>${item.carDescription}</em>
						</h2>
						<h2><strong>Date Added:</strong> ${item.localDate}</h2>
						<h2><strong>Date Sold:</strong> ${item.dateSold}</h2>
						<br>
						<img src="../../assets/image/${item.carModel}.jpg"
							onerror="this.src='../../assets/image/none.jpg'"
							style="width: 400px" />
						<br></br>
						<h2>
							<strong>Seller Contact Information:</strong>
						</h2>
						<br>
						<h2>Seller: ${item.seller}</h2>
						<h2>Seller Phone: ${item.sellerPhone}</h2>
						<h3>
							<em><a href="mailto:${item.sellerEmail}">${item.sellerEmail}</a></em>
						</h3>
						<br>
						<h2>
							<strong>Buyer Contact Information:</strong>
						</h2>
						<br>
						<h2>Buyer: ${item.buyerFName} ${item.buyerLName}</h2>
						<h2>Buyer Phone: ${item.buyerPhone}</h2>
						<h3>
							<em><a href="mailto:${item.buyerEmail}">${item.buyerEmail}</a></em>
						</h3>
						<br>
						<hr>
						<br>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<h2></h2>
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
