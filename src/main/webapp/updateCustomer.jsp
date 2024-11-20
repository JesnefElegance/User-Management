<%@page import="com.user.entity.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	body {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		height: 100vh;
		background-color: #C6C6CA;
	}
	.box {
		margin: 200px auto;
		width: 500px;
		display: flex;
		flex-direction: column;
		border: 2px solid black;
		border-radius: 20px;
		align-items: center;
		justify-content: space-around;
	}
	div {
		padding: 30px;
	}
	input{
		margin: 5px;
		outline: none;
		padding: 10px 20px;
		font-size: 16px;
	}
	b{
		font-size: 25px;
	}
</style>
</head>
<body>

	<% Customer customer = (Customer)request.getAttribute("customer"); %>
	
	<div class="box">
		<form action="updateUser">
			<p><b>Update Customer</b></p>
			<input type="number" name="customerId" value="<%=customer.getCustomerId()%>" readonly/><br/>
			<input type="text" name="customerName" value="<%=customer.getCustomerName()%>"/><br/>
			<input type="email" name="customerEmail" value="<%=customer.getCustomerEmail()%>"/><br/>
			<input type="number" name="customerAge" value="<%=customer.getCustomerAge()%>"/><br/>
			<input type="text" name="customerAddress" value="<%=customer.getCustomerAddress()%>"/><br/>
			<input type="submit" value="Save"/>
		</form>
	</div>
</body>
</html>