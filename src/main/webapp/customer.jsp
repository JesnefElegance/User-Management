<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>
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
		padding: 10px 30px;
		font-size: 14px;
	}
	b{
		font-size: 25px;
	}
</style>
</head>
<body>
	<div class="box">
		<p><b>Add Customer</b></p>
		<form action="manageUser">
			<input type="text" placeholder="enter name" name="customerName"/><br/>
			<input type="email" placeholder="enter email" name="customerEmail"/><br/>
			<input type="number" placeholder="enter age" name="customerAge"/><br/>
			<input type="text" placeholder="enter address" name="customerAddress"/><br/>
			<input type="submit" value="Save"/>
		</form>
	</div>
</body>
</html>