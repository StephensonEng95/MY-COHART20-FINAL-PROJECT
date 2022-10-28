<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script type="text/javascript" src="/webjars/jquery/jquery.min.js"></script>
<script type="text/javascript"
	src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Traviu Online Shop- Delete Account</title>
</head> 
<body> 
<h1 align = "center">Please delete your account here</h1><br><br>

<h3 align = "center" style = "color: Blue">Please confirm your username and password for deletion</h3>

	<form align="center" action="deleteuseraccount" method="post">
		<div align= "center" style="margin-left: 500px; margin-right: 500px" class="form-group">
		<div class="form-group">
				<label for="exampleInputPassword1">Username</label> <input
					type="text" class="form-control" 
					placeholder="Username" name="Username">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control"
					placeholder="Password" name="Password">
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Confirm</button><br><br>
	</form>
	<h3 style="align:center">If you don't want to delete your account, please click on the link below</h3>
	<h4 align = "center" ><a href="welcomePage"> Back to home page</a></h4>

</body>
</html> 