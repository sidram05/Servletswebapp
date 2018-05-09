<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order Information Page</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Order Details</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Product Name: </td>
				<td>${customer.pname}</td>
			</tr>
			<tr>
				<td>Customer Name: </td>
				<td>${customer.cname}</td>
			</tr>
			<tr>
				<td>Quantity: </td>
				<td>${customer.quantity}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>