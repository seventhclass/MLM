<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class='row'>
 	<div class='navbar navbar-inverse' role='navigation'>
		<div class='navbar-header'> 
			<button class='navbar-toggle' type='button' data-toggle='collapse' data-target='.navbar-responsive-collapse'>
				<span class='sr-only'>Toggle Navigation</span>
				<span class='icon-bar'></span>
				<span class='icon-bar'></span>
				<span class='icon-bar'></span>
			</button>
			<a href='##' class='navbar-brand text-center'><img style='width: 25px; height: 30px' src='<%=request.getContextPath()%>/images/logo/logo-new.png' alt='milleans vie science'>Milleans Vie Sciences</a>
 		</div>
 		<!-- when screen width less than 768px, the content of div.navbar-responsive-collapse will be hidden, show icon-bar, when click icon-bar, it will extend. when screen width greater than 768px, show as default. -->
		<div class='collapse navbar-collapse navbar-responsive-collapse'>
			<ul class='nav navbar-nav'>
		  		<li><a href='<%=request.getContextPath()%>/um/home.jsp'>Home</a></li>
  				<li><a href='<%=request.getContextPath()%>/um/products.jsp'>Products</a></li>
		 		<li><a href='<%=request.getContextPath()%>/um/aboutus.jsp'>About Us</a></li>
		 		<li><a href='<%=request.getContextPath()%>/um/contactus.jsp'>Contact Us</a></li>
  				<li><a href='<%=request.getContextPath()%>/um/selectautoship.jsp'>Registration</a></li>
  				<li><a href='<%=request.getContextPath()%>/um/login.jsp'>Login</a></li>
  				<li><a href='<%=request.getContextPath()%>/um/logout.jsp'>Logout</a></li>
		 	</ul>
		</div>
	</div>		
</div>