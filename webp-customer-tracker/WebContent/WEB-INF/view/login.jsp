<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"><link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<title>Log In</title>
</head>
<body>
<div  style="padding:40px" class="container-fluid">
  
  
  
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#" style="color:white;">Customer Management Companion</a>
				</div>

			</div>
		</nav>
		
		
		<div class="container">
  <h2>Login to Your Account</h2>
  <form:form class="form-horizontal" action="verifyCredentials" modelAttribute="parameters"  method="POST">
   
   
    <div class="form-group">
      
      <div class="col-sm-10">
        <form:input name="Username"  placeholder="Username" id="Username" path="userName" />
      </div>
    </div>
    
    
    <div class="form-group">
      
      <div class="col-sm-10">          
        <form:input type="password" name="Password" placeholder="Password" id="Password" path="password"/>
      </div>
    </div>
    
    
     
    
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Log In</button>
      </div>
    </div>
  </form:form>
  
  <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <a href="register"  class="btn btn-default">Register</a>
      </div>
    </div>
</div>
		
		
</div>
</body>
</html>