<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<center>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
   <div class="carousel-inner" role="listbox" style=" width:1271px; height: 650px ;">

    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      
    </ol>
    

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
     <img src="Resources/cgucci.jpg" alt="cgucci" "> 
     
      </div>
      <div class="item">
         <img src="Resources/rdio.jpg" alt="rdio" style="width:100%;">
       
      </div>
    
      <div class="item">
    <img src="Resources/rdio1.jpg" alt=" rdio1" style="width:100%;">
         
      </div>
     
    
      <div class="item">
    <img src="Resources/rdrio2.jpg" alt=" rdrio2" style="width:100" height:"50%";>
         
      </div>
      
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
      </a>
      </div>
      </center>
</body>
<%@include file="footer.jsp" %>
</html>