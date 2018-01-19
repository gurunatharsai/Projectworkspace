<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js" type="text/javascript"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"type="text/javascript"></script>
<style>
body
{
backgroud-color:#5CCCAB;
}
 .navbar-default {
    background-color:#0A0A2A;
    border-color: #D5D5D5;
}
#grad1 {
    height: 200px;
    background: red; /* For browsers that do not support gradients */
    background: linear-gradient(to bottom right, rgba(255,0,0,0), rgba(255,0,0,1)); /* Standard syntax (must be last) */
}
.navbar-default .navbar-nav > .dropdown > a:hover .caret,
.navbar-default .navbar-nav > .dropdown > a:focus .caret {
    border-top-color: #333;
    border-bottom-color: #333;
} 
</style>
</head>
<body>

<center>
<form:form action="saveProduct" method="post" modelAttribute="product" enctype="multipart/form-data" >
<!-- <tr>
<th>product id</th>
<td>
<form:input type ="hidden" path="id"/></td>
</tr> -->
<tr>
<th>Product Name</th>
<td><form:input type ="text" path ="name"/></td>
</tr><br><br>

<tr>
<th>Product Price</th>
 <td><form:input type ="text" path ="prize"/></td>
 </tr><br><br>
 <tr>
<th>Product Quantity</th>
<td><form:input type ="text" path ="quantity"/></td>
</tr><br><br>
<tr>
<th>Product Description</th>
 <td><form:input type ="text" path ="description"/></td>
 </tr><br><br>
 <!--  --><th>Category Name</th>
 <td><form:select name="CategoryId" path="CatId">
         <option value="-1" selected>select..</option>
         <c:forEach var="category" items="${catlist}">
         <option value="${category.catid}">${category.catname}</option></c:forEach></form:select>
</td><br><br>

<th>Supplier Name</th>
 <td><form:select path ="SupId">
         <option value="-1">select..</option>
         <c:forEach var="supplier" items="${suplist}">
         <option value="${supplier.supplierid}">${supplier.suppliername}</option></c:forEach>
         </form:select>
</td><br><br>
<tr>  
<td><h3>Upload an image</h3><input type="file" name="pimage"></td></tr> <br>
   
    
<tr>   
    
     <td><td colspan="2"><input type="submit" class="btn btn-success" value="Add"></td>
        
     </tr><br><br>


</form:form>
</center>
<table style="width:100%" border="1">
            <tr>
            		<th>Image</th>
                <th>product id</th>
                <th>product name</th>
                <th>product quantity</th>
                <th>product description</th>
                <th>product prize</th>
                 <th>delete</th>
                <th>edit</th>
            </tr>

            <c:forEach items="${prolist}" var="pro">
            <c:url value="/images/${pro.id}.jpg" var="imageurl"></c:url>
            
                <tr>
                	
           <td><img src="${imageurl}" height="50" width="50"></td>
                	
                    <td>${pro.id}</td>
                    <td>${pro.name}</td>
                    <td>${pro.quantity}</td>
                    <td>${pro.description}</td>
                    <td>${pro.prize}</td>
					<td><a href="deletepro?pid=${pro.id}">Delete</a></td>
					<td><a href="editpro?pid=${pro.id}">Edit</a></td>
					   
  				</tr>
  				</c:forEach>
  				
</table>
<%@include file="footer.jsp" %>
</body>
</html>