<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
     
  
     <%@ page import="java.util.*"%> 
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">  
<title>Traviu Online Shop - Welcome ${userData.getUsername()}</title>  
</head>
<body bgcolor="lightblue">
 
<h3 style="margin-left:550px ;margin-right:550px">Welcome ${userData.getUsername()} ${userData.getFirstname()} ${userData.getLastname()}
 ${userData.getRole()}</h3>
 
<br>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
<div style=margin-left:400px;margin-right:400px;border:solid>
  <div class="container-fluid">
    <a class="navbar-brand" href="userwelcomePage">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button> 
    
    <a class="navbar-brand" href="productsPage">Products</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <a class="navbar-brand" href="contactusPage">Contact Us</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="useraccountdeletePage">Delete Account</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/">Logout</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
               
    </div>
  </div>
 
</nav><br> 

 
 <h3 style="margin-left:450px;margin-right:400px;color:white"> Your current balance on your account is ${userData.getAccountBalance()}</h3>


</body>
</html>