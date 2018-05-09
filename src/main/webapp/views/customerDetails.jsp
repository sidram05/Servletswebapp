<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Information Page</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Customer Details</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Customer First Name: </td>
				<td>${customer.fname}</td>
			</tr>
			<tr>
				<td>Customer Last Name: </td>
				<td>${customer.lname}</td>
			</tr>
			<tr>
				<td>Customer Email: </td>
				<td>${customer.email}</td>
			</tr>
			<tr>
				<td>Customer Card No: </td>
				<td>${customer.cardNo}</td>
			</tr>
			<tr>
				<td>Customer Card Name: </td>
				<td>${customer.cardName}</td>
			</tr>
			<tr>
				<td>Billing state: </td>
				<td>${customer.bstate}</td>
			</tr>
			<tr>
				<td>Billing zipcode: </td>
				<td>${customer.bzip}</td>
			</tr>
			<tr>
				<td>Billing country: </td>
				<td>${customer.bcountry}</td>
			</tr>
			<tr>
				<td>Shipping street: </td>
				<td>${customer.sstreet}</td>
			</tr>
			<tr>
				<td>Shipping city: </td>
				<td>${customer.scity}</td>
			</tr>
			<tr>
				<td>Shipping state: </td>
				<td>${customer.sstate}</td>
			</tr>
			<tr>
				<td>Shipping zipcode: </td>
				<td>${customer.szip}</td>
			</tr><tr>
				<td>Shipping country: </td>
				<td>${customer.scountry}</td>
			</tr>
			</tr><tr>
				<td>Other details: </td>
				<td>${customer.other}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>