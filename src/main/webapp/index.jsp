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
		<p><b>SignUp</b></p>
		<form action="signUp">
			<input type="email" placeholder="enter email" name="userName"/><br/>
			<input type="password" placeholder="enter password" name="userPassword"/><br/>
			<input type="password" placeholder="confirm password" name="confirmPassword"/><br/>
			<input type="submit" value="Register"/>
		</form>
	</div>
</body>
</html>