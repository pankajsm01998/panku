<!DOCTYPE html>
<html lang="en">
<head>
  <title>Customer Management Tool</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
</head>
<body>



<div class="container">
  <h2>Add New Customer</h2>
  <form:form class="form-horizontal" action="saveCustomer" modelAttribute="customer" method="POST">
   <form:hidden path="id"/>
    <div class="form-group">
      <label class="control-label col-sm-2" for="firstName">First Name :</label>
      <div class="col-sm-10">
        <form:input  class="form-control" id="firstName" placeholder="Enter FirstName" path="firstName" name="firstName"/>
      </div>
    </div>
    
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="lastName">Last Name :</label>
      <div class="col-sm-10">          
        <form:input  class="form-control" id="lastName" placeholder="Enter LastName" path="lastName" name="lastName"/>
      </div>
    </div>
    
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email :</label>
      <div class="col-sm-10">          
        <form:input class="form-control" id="email" placeholder="Enter Email" path="email" name="email"/>
      </div>
    </div>
    
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Save</button>
      </div>
    </div>
  </form:form>
</div>

</body>
</html>