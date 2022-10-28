<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>"Traviu Online Shop - Login" 
</title>



</head>


<body bgcolor="lightblue">
	<form action="login" method="post">
		<h3 style="margin-left: 500px; color: Blue; margin-right=500px;;margin-top: 50px">Welcome to Traviu</h3>
		<h3 style="margin-left: 350px; color: Blue; margin-right=280px;margin-top: 50px">The shopping application made easy for you, Shop anywhere, whenever</h3>
		<div style=margin-top:5px;margin-bottom:5px;margin-left:450px;margin-right:450>
		<h3>Please enter your credentials below</h3>
		</div>
		<div style="margin-left: 450px; margin-right: 450px;margin-top:30px">
			
			<div class="mb-3">
				username:<input type="text" class="form-control" id="username"
				placeholder="Enter your username"
					aria-describedby="username" name="username">
			</div> 
			<div class="mb-3">
				password:<input type="text" class="form-control"
					id="password" placeholder="Enter your password" name="password">
			</div>
			
			<button style="margin-left: 125px;margin-right:100px;margin-top:10px" type="submit" class="btn btn-primary">Login</button><br><br>
			<a style="margin-left: 100px" href="registrationPage">New User? Register Here!</a>
		</div>
		
	</form>
</body>

</html>