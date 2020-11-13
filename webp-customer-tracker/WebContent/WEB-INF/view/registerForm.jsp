<!--
Author: Colorlib
Author URL: https://colorlib.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
<!-- //web font -->
</head>
<body>
	<!-- main -->
	<div class="main-w3layouts wrapper">
		<h1>Sign Up </h1>
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form:form action="registerUser" method="POST" modelAttribute="user">
				
				<form:hidden path="userId"/>
				
					<form:input 
							path="userName"
							class="text" 
							type="text" 
							name="userName" 
							placeholder="userName" 
							required=""/>
							
					<form:input 
							path="password" 
							class="text" 
							type="password" 
							name="password" 
							placeholder="Password" 
							required=""/>
							
					<form:input 
							path="email" 
							class="text email" 
							type="email" 
							name="email" 
							placeholder="Email" 
							required=""/>
							
					
							
					<%-- <form:input 
							path="confirmPassword"
							class="text w3lpass" 
							type="password" 
							name="password" 
							placeholder="Confirm Password" 
							required=""/> --%>
					<!-- 
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<div class="clear"> </div>
					</div> -->
					<button type="submit" value="SIGNUP">sign up</button>
				</form:form>
				<p>Don't have an Account? <a href="#"> Login Now!</a></p>
			</div>
		</div>
		<!-- copyright -->
		<div class="colorlibcopy-agile">
			<p>© 2018 Colorlib Signup Form. All rights reserved | Design by <a href="https://colorlib.com/" target="_blank">Colorlib</a></p>
		</div>
		<!-- //copyright -->
		<ul class="colorlib-bubbles">
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
	<!-- //main -->
</body>
</html>