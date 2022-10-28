<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
     
  
     <%@ page import="java.util.*"%> 
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">  
<title>Traviu Online Shop - User deletion</title>  
</head>
<body>


<h1 align = "center">Please delete user account here</h1><br><br>

<h3 align = "center"; style = "color: Blue">Please confirm user's username for deletion</h3>

	<form align = "center" action="admindeletinguser" method="post">
		<div align= "center" style="margin-left: 500px; margin-right: 500px" class="form-group">
			<div class="form-group">
				<label for="exampleInputPassword1">Username</label> <input
					type="username" class="form-control"
					placeholder="Enter username" name="username">
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Confirm</button><br><br>
	</form>
	<h3 style="align:center"> If user wishes not to delete their account then please return to admin page on the link below</h3>
	
	<h4 align = "center" ><a href="adminPage"> Back to admin page</a></h4>


</body>
</html>