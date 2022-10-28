<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%--Admin Jsp file to add prducts and view users --%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="ISO-8859-1">
<title>Taviu Online Shop - Admin</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
 
</head>
<body>
<br>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div style="margin-left:400px;margin-right:400px;border:solid;align:center">
  <div class="container-fluid">
    <a class="navbar-brand" href="adminPage">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <a class="navbar-brand" href="usersPage">Users</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="contactusPage">Contact Us</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/">Logout</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
     <a class="navbar-brand" href="productsPage2">Products</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
     <a class="navbar-brand" href="deletingProduct">Delete Products</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
              
    </div> 
  </div>
 
</nav><br>
	<h1 style="margin-left: 350px">Welcome ${adminData.getUsername()} ${adminData.getFirstName()} ${adminData.getLastName()} ${adminData.getRole()}</h1>
	<br>
	<br>
	
	<h3 style="margin-left: 400px; color: Blue">Please add in the products</h3>

	<form action="addproduct" method="post">
		<div style="margin-left: 500px; margin-right: 500px"
			class="form-group">
			<div>
				<label for="exampleInputEmail1" style="margin-left:200">name</label> <input type="text"
					class="form-control" placeholder="Product name" name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1" style="margin-left:200">price</label> <input
					type="text" class="form-control" placeholder="Product price" name="price">
			</div>
			<div>
				<label for="exampleInputEmail1" style="margin-left:200">stock</label> <input 
					type="text" class="form-control" placeholder="Enter units" name="stock">
			</div> 
			<div>
				<label for="exampleInputEmail1" style="margin-left:200">id</label> <input type="text"
					class="form-control" placeholder="Enter product id" name="id">
			</div>
			 
		</div><br>
		<button style="margin-left: 600px;margin-right:600px" type="submit"
			class="btn btn-primary">Add</button>
		<br>
		<br>
	</form>
</body>
</html>