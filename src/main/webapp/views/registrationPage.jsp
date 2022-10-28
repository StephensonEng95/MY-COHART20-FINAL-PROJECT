<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1"> 
<title>Traviu Online Shop - Sign up</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"> 
  
</head>
         
<body>
        
	<h1 style="margin-left: 250px; ">Cohart20 Traviu Online Shopping Application</h1>
	<br>
	<br> 

	<h3 style="margin-left: 500px; color: Blue">Enter your Details to
		Register!</h3>

	<form action="register" method="post">
		<div style="margin-left: 500px; margin-right: 500px"
			class="form-group">
			<div>
				<label for="exampleInputEmail1">Username</label> <input type="text"
					class="form-control"  placeholder="Enter Username" name="username">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="text" class="form-control" placeholder="Password" name="password">
			</div>
			<div>
				<label for="exampleInputEmail1">First Name</label> <input
					type="text" class="form-control" placeholder="Enter First Name" name="firstName">
			</div>
			<div>
				<label for="exampleInputEmail1">Last Name</label> <input type="text"
					class="form-control" placeholder="Enter Last Name" name="lastName">
			</div>
			<div>
				<label for="exampleInputEmail1">Email</label> <input type="text"
					class="form-control" placeholder="Enter Email Address" name="email">
			</div>
			<div><label for="exampleInputEmail1" class="form-label">Role</label> <input type="text"
					class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
					placeholder="Please specify Admin or User" name="role">
			</div>
		</div><br>
		<button style="margin-left: 600px" type="submit"
			class="btn btn-primary">Register
		</button>
	</form>
	<h2><a style="margin-left: 500px;margin-bottom:10px" href="/"> Back to Login page</a></h2>
</body>
</html>