<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%--Jsp file to show the products fetched in the database--%>
     <%@ page import="com.qa.cohart20.product.Product" %> 
     <%@ page import="java.util.*"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
<title>Traviu Online Shop - Products</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body bgcolor="lightblue">
<%
List<Product> prod =(List<Product>)request.getAttribute("dbProductData2");
%> 
<h3 style="margin-left:500px;margin-right:500px">products available<br> <%=prod.size()%></h3>
 <div style="margin-left:400px;margin-right:400px;border:solid;margin-top:50px">
<table class="table table-success table-striped" style="color:green" action="getproducts" method="post">
   <thead>
 
 <tr style="color:orange">
      <th scope="col">Product name</th>
      <th scope="col">Product price</th> 
      <th scope="col">Product stock</th>  
       <th scope="col">Product id</th>
       <th scope="col">Purchase product</th>
    </tr> 
</thead>
 <tbody> 
     <% for(int i = 0; i < prod.size(); i++) { %> 
     <tr>
      <td><%=prod.get(i).getProductName()%></td> 
       <td><%=prod.get(i).getProductPrice()%></td>
       <td><%=prod.get(i).getProductStock() %></td>
       <td><%=prod.get(i).getProductId() %></td>
       
    </tr> 
    <%} %>
    </tbody>
</table>
</div>

</body>
</html>