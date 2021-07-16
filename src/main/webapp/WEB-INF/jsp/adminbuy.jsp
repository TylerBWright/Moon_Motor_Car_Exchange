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

			<form action="/adminbuy" method="get">

			<h1>Moon Motor Cars for Sale</h1>
			<br>
					<select
						name="carModel">
						<option value="">All</option>
						<option value="A">A</option>
						<option value="C">C</option>
						<option value="D">D</option>
						<option value="30">30</option>
						<option value="39">39</option>
						<option value="40">40</option>
						<option value="45">45</option>
						<option value="48">48</option>
						<option value="65">65</option>
						<option value="4-38">4-38</option>
						<option value="4-42">4-42</option>
						<option value="6-30">6-30</option>
						<option value="6-36">6-36</option>
						<option value="6-38">6-38</option>
						<option value="6-40">6-40</option>
						<option value="6-42">6-42</option>
						<option value="6-43">6-43</option>
						<option value="6-44">6-44</option>
						<option value="6-45">6-45</option>
						<option value="6-46">6-46</option>
						<option value="6-48">6-48</option>
						<option value="6-50">6-50</option>
						<option value="6-58">6-58</option>
						<option value="6-60">6-60</option>
						<option value="6-62">6-62</option>
						<option value="6-66">6-66</option>
						<option value="6-68">6-68</option>
						<option value="6-72">6-72</option>
						<option value="8-75">8-75</option>
						<option value="8-80">8-80</option>
						<option value="Series A">Series A</option>
						<option value="Series U">Series U</option>
						<option value="Newport">Newport</option>
						<option value="Metropolitan">Metropolitan</option>
						<option value="London">London</option>
						<option value="Other">Other</option>
					</select>
					<br></br>
					<input type="submit" value="Search">
					<br>
					</form>

			<br>
			<h2>${success1}</h2>
			<br>
			
			<p>${success}</p><br>
			
			<p>${success2}</p>
			<br>
			<hr>
			<br>

			<c:choose>
				<c:when test="${not empty cars}">
					<c:forEach var="item" items="${cars}">
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
						<br>
						<img src="../../assets/image/${item.carModel}.jpg" onerror="this.src='../../assets/image/none.jpg'" style="width:400px" />
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
					<h2><strong>Buyer Contact Information:</strong></h2>
					
					<form:form action="/adminbuy?number=${item.number}" modelAttribute="car" method="post">
								<br> First Name:
					<form:select type="text" id="inputFirstName" path="buyerFName"
								placeholder="${loginUser.fname}" required="true">
								<option value="${loginUser.fname}">${loginUser.fname}</option>
							</form:select>
							<br> Last Name:
					<form:select type="text" id="inputLastName" path="buyerLName"
								placeholder="${loginUser.lname}" required="true">
								<option value="${loginUser.lname}">${loginUser.lname}</option>
							</form:select>
							<br> Email:
					<form:select type="text" id="inputEmail" path="buyerEmail"
								placeholder="${loginUser.email}" required="true">
								<option value="${loginUser.email}">${loginUser.email}</option>
							</form:select>
							<br> Phone:
					<form:input type="text" id="inputPhone" path="buyerPhone"
								placeholder="555-555-5555" />
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
					<input type="submit" value="Buy Now">
					</form:form>
					<br>
					<form:form action="/removebuy?number=${item.number}">
					<input type="submit" value="Remove Listing">
					</form:form>
					<br>
					<hr>
					<br>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<h3>No cars for sale at this time. Check back again soon!</h3>
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
