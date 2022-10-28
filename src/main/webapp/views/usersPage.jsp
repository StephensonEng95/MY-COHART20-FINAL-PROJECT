<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.qa.cohart20.user.User" %>
     <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Traviu Online Shop - Users</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body bgcolor="lightblue">
<%
List<User> user =(List<User>)request.getAttribute("dbUserData");
%> 

<h3 style="margin-left:400px;margin-right:400px">Number of Users are <%=user.size() %></h3>
 <div style=margin-left:400px;margin-right:400px;border:solid;color:blue>
<table class="table table-success table-striped" style="color:green">
   <thead>

 <tr style="color:orange">
      <th scope="col">Username</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th> 
       <th scope="col">Role</th>
    </tr>
</thead>
 <tbody> 
     <% for(int i = 0; i < user.size(); i++) { %> 
     <tr>
      <td><%=user.get(i).getUsername() %></td>
      <td><%=user.get(i).getFirstName()%></td>
      <td><%=user.get(i).getLastName()%>></td> 
      <td><%=user.get(i).getRole() %></td>
      <td><a href="admindeleteuser">Delete User</a></td>  
    
    </tr>
    <%} %>
    </tbody> 
</table>
</div>
</body>
</html>