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

			<h1>List Your Moon Car on the Exchange</h1>
			<br>

			<br><p>${success}</p><br>

			<form:form action="/sell" modelAttribute="car">

				<fieldset>
					<legend>Sell</legend>
					<br> Seller Name:
					<form:select type="text" id="inputSellerName" path="seller"
						placeholder="${loginUser.fname} ${loginUser.lname}" required="true">
					<option value="${loginUser.fname} ${loginUser.lname}">${loginUser.fname} ${loginUser.lname}</option>
							</form:select>
					<br> Seller Email:
					<form:select type="text" id="inputSellerEmail" path="sellerEmail"
						placeholder="${loginUser.email}" required="true">
						<option value="${loginUser.email}">${loginUser.email}</option>
						</form:select>
					<form:input type="text" id="inputSellerPhone" path="sellerPhone"
						placeholder="555-555-5555" />
					<br></br>
					Make:
					<form:select type="text" id="inputMake" path="carMake"
						placeholder="Moon" required="true">
						<option selected>Moon</option>
					</form:select>
					Model:
					<form:select type="text" id="inputModel" path="carModel"
						placeholder="model" required="true">
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
						<option value="London">Other</option>
					</form:select>
					<br> Year:
					<form:input type="text" id="inputYear" path="carYear"
						placeholder="1926" />
					<br> Asking Price (in USD) $:
					<form:input type="number" id="inputAskingPrice" path="carPrice"
						placeholder="00000.00" required="true"/>
					<br></br>
					<form:label path="carDescription">Description:</form:label>
					<form:textarea path="carDescription" rows="5" cols="50"
						placeholder="Insert car description here." />
						<br></br>
					<p>By submitting a listing on the Moon Motor Car Exchange, you accept full responsibility to contact the buyer. Should your vehicle remain on the market for over 120 days, a 10% discount will be applied to the original asking price. You agree to notify the Moon Motor Car Exchange once the transaction is final so that we may close out our records.</p>
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
					
					<input type="submit" value="Add Listing">
					<br></br>
				</fieldset>
			</form:form>


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
