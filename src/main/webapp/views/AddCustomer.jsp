<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style><%@include file="../views/css/Login.css"%></style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Customer Details</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
<div class="container">
<h1>Enter Customer Details</h1>
 	
 	<form action="${pageContext.request.contextPath}/customerServlet" method="get">
		 Customer First Name: <input type="text" name="fname" class="form-control" placeholder="First Name"><br><br>
		 Customer Last Name: <input type="text" name="lname" class="form-control" placeholder="Last Name"><br><br>
		 Email: <input type="email" name="email" class="form-control" placeholder="Email"><br><br>
		 Card Number: <input type="number" name="cardNo" class="form-control" placeholder="CardNo"><br><br>
		 Card Name: <input type="text" name="cardName" class="form-control" placeholder="CardName"><br><br>
		 Billing state: <input type="text" name="bstate" class="form-control" placeholder="Bstate"><br><br>
		 Billing zipcode: <input type="number" name="bzip" class="form-control" placeholder="Bzip"><br><br>
		 Billing country: <input type="text" name="bcountry" class="form-control" placeholder="Bcountry"><br><br>
		 Shipping street: <input type="text" name="sstreet" class="form-control" placeholder="Sstreet"><br><br>
		 Shipping city: <input type="text" name="scity" class="form-control" placeholder="Scity"><br><br>
		 Shipping state: <input type="text" name="sstate" class="form-control" placeholder="Sstate"><br><br>
		 Shipping zipcode: <input type="number" name="szip" class="form-control" placeholder="Szip"><br><br>
		 Shipping country: <input type="text" name="scountry" class="form-control" placeholder="Scountry"><br><br>
		 Other Details: <input type="textarea" name="other" class="form-control" placeholder="Other Details"><br><br>
	     <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button><br><br><br>
	</form>
	</div>
</div>
</body>
</html>