<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style><%@include file="../views/css/Login.css"%></style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Product Details</title>
</head>
<body>
<div class="jumbotron jumbotron-fluid">
<div class="container">
<h1>Enter Product Details</h1>
 
	<form action="${pageContext.request.contextPath}/customerDetails">
	 Product Name: <input type="text" class="form-control" placeholder="Product Name"><br><br>
	 Product Description: <input type="text" class="form-control" placeholder="Product Description"><br><br>
	 Price: <input type="number" class="form-control" placeholder="Price"><br><br>
     <button class="btn btn-lg btn-primary btn-block" type="submit">Save</button><br><br><br>
	</form>
	</div>
</div>
</body>
</html>