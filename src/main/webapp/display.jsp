<%@page import="java.util.List"%>
<%@page import="com.user.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Management</title>
<style>
	body{
		background: #C6C6CA;
	}
	table {
		margin: 50px auto;
	}
	tr, th, td {
		padding: 5px 15px;
	}
	.add{
		margin-top: 120px;
		margin-left: 45%;
		font-size: 25px;
	}
</style>
</head>
<body>
	
	<div class="add">
		<a href="./customer.jsp">Add Customer</a>
	</div>
	
	<table border="auto">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer Email</th>
			<th>Customer Age</th>
			<th>Customer Address</th>
			<th>Update Customer</th>
			<th>Delete Customer</th>
		</tr>
		<% List<Customer> customers = (List)request.getAttribute("customers"); %>
		<% for(Customer customer: customers) { %>
		<tr>
			<td><%=customer.getCustomerId()%></td>
			<td><%=customer.getCustomerName()%></td>
			<td><%=customer.getCustomerEmail()%></td>
			<td><%=customer.getCustomerAge()%></td>
			<td><%=customer.getCustomerAddress()%></td>
			<td><a href="updateCustomer?customerId=<%=customer.getCustomerId()%>">Update</a></td>
			<td><a href="deleteCustomer?customerId=<%=customer.getCustomerId()%>">Delete</a></td>
		</tr>
		<%} %>
	</table>
	
</body>
</html>