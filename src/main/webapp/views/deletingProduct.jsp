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

<h3 align = "center"; style = "color: Blue">Please confirm product id for deletion</h3>

	<form align = "center" action="admindeletingproduct" method="post">
		<div align= "center" style="margin-left: 500px; margin-right: 500px" class="form-group">
			<div class="form-group">
				<label for="exampleInputPassword1">id</label> <input
					type="text" class="form-control"
					placeholder="Enter username" name="id">
			</div>
		</div>
		
		<button type="submit" class="btn btn-primary">Confirm</button><br><br>
	</form>
	<h3 style="align:center"> If product is still in stock then please return to admin page on the link below</h3>
	
	<h4 align = "center" ><a href="adminPage"> Back to admin page</a></h4>


</body>
</html>