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

	<a href="/" title="Return to Home Page"> <img id="logo"
		src="assets/image/logo.jpg" style="border-radius: 50%"
		alt="Moon Motor Cars company shield">
	</a>

	<div id="container">

		<div id="main-content">

			<h1>Register to the Moon Motor Car Exchange</h1>
			<br>

			<p>${taken}</p>
			<br>

			<h2>Please complete the following information and hit 'Submit'
				to join:</h2>
			<br>

			<form:form action="/register" modelAttribute="user">

				<fieldset>
					<legend>Registration</legend>
					<br> First Name:
					<form:input type="text" id="inputFirstName" path="fname"
						placeholder="John" required="true" />
					<br> Last Name:
					<form:input type="text" id="inputLastName" path="lname"
						placeholder="Jackson" required="true" />
					<br> Email:
					<form:input type="email" id="inputEmail" path="email"
						placeholder="you@email.com" required="true" />
					<br> Password:
					<form:input type="password" id="inputPassword" path="password"
						placeholder="password" required="true" />
					<br></br> Street:
					<form:input type="text" id="inputStreet" path="street"
						placeholder="123 Main St." />
					<br> City:
					<form:input type="text" id="inputCity" path="city"
						placeholder="Springfield" />
					<br> State:
					<form:select type="text" id="inputState" path="state"
						placeholder="IL">
						<option value=""></option>
						<option value="AL">Alabama</option>
						<option value="AK">Alaska</option>
						<option value="AZ">Arizona</option>
						<option value="AR">Arkansas</option>
						<option value="CA">California</option>
						<option value="CO">Colorado</option>
						<option value="CT">Connecticut</option>
						<option value="DE">Delaware</option>
						<option value="DC">District Of Columbia</option>
						<option value="FL">Florida</option>
						<option value="GA">Georgia</option>
						<option value="HI">Hawaii</option>
						<option value="ID">Idaho</option>
						<option value="IL">Illinois</option>
						<option value="IN">Indiana</option>
						<option value="IA">Iowa</option>
						<option value="KS">Kansas</option>
						<option value="KY">Kentucky</option>
						<option value="LA">Louisiana</option>
						<option value="ME">Maine</option>
						<option value="MD">Maryland</option>
						<option value="MA">Massachusetts</option>
						<option value="MI">Michigan</option>
						<option value="MN">Minnesota</option>
						<option value="MS">Mississippi</option>
						<option value="MO">Missouri</option>
						<option value="MT">Montana</option>
						<option value="NE">Nebraska</option>
						<option value="NV">Nevada</option>
						<option value="NH">New Hampshire</option>
						<option value="NJ">New Jersey</option>
						<option value="NM">New Mexico</option>
						<option value="NY">New York</option>
						<option value="NC">North Carolina</option>
						<option value="ND">North Dakota</option>
						<option value="OH">Ohio</option>
						<option value="OK">Oklahoma</option>
						<option value="OR">Oregon</option>
						<option value="PA">Pennsylvania</option>
						<option value="RI">Rhode Island</option>
						<option value="SC">South Carolina</option>
						<option value="SD">South Dakota</option>
						<option value="TN">Tennessee</option>
						<option value="TX">Texas</option>
						<option value="UT">Utah</option>
						<option value="VT">Vermont</option>
						<option value="VA">Virginia</option>
						<option value="WA">Washington</option>
						<option value="WV">West Virginia</option>
						<option value="WI">Wisconsin</option>
						<option value="WY">Wyoming</option>
						<option value="AS">American Samoa</option>
						<option value="GU">Guam</option>
						<option value="MP">Northern Mariana Islands</option>
						<option value="PR">Puerto Rico</option>
						<option value="UM">United States Minor Outlying Islands</option>
						<option value="VI">Virgin Islands</option>
						<option value="AA">Armed Forces Americas</option>
						<option value="AP">Armed Forces Pacific</option>
						<option value="AE">Armed Forces Others</option>
					</form:select>
					<br> Country:
					<form:input type="text" id="inputCountry" path="country"
						placeholder="United States of America" />
					<br> Zip Code:
					<form:input type="text" id="inputZip" path="zipCode"
						placeholder="55555" />
					<br></br>
					<form:label path="bio">Personal Bio:</form:label>
					<form:textarea path="bio" rows="5" cols="50"
						placeholder="You may provide details about yourself here, including what got you into Moon in the first place." />
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


					<input type="submit" value="Register">
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
