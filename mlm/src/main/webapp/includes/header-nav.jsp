<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<%
	out.println(" <div class='row'>" );
	out.println(" 	<div class='navbar navbar-inverse' role='navigation'> ");
	out.println("		<div class='navbar-header'> ");
	out.println("			<button class='navbar-toggle' type='button' data-toggle='collapse' data-target='.navbar-responsive-collapse'>");
	out.println("				<span class='sr-only'>Toggle Navigation</span>");
	out.println("				<span class='icon-bar'></span>");
	out.println("				<span class='icon-bar'></span>");
	out.println("				<span class='icon-bar'></span>");
	out.println("			</button>");
	out.println("			<a href='##' class='navbar-brand text-center'><img style='width: 25px; height: 30px' src='../images/logo/logo-new.png' alt='milleans vie science'>Milleans Vie Sciences</a>");
	out.println(" 		</div>");
	out.println(" 		<!-- when screen width less than 768px, the content of div.navbar-responsive-collapse will be hidden, show icon-bar, when click icon-bar, it will extend. when screen width greater than 768px, show as default. -->");
	out.println("		<div class='collapse navbar-collapse navbar-responsive-collapse'>");
	out.println("			<ul class='nav navbar-nav'>");
	out.println("		  		<li><a href='../um/home.jsp'>Home</a></li>");
	out.println("  				<li><a href='../um/products.jsp'>Products</a></li>");
	out.println("		 		<li><a href='../um/aboutus.jsp'>About Us</a></li>");
	out.println("		 		<li><a href='../um/contactus.jsp'>Contact Us</a></li>");
	out.println("  				<li><a href='../um/selectautoship.jsp'>Registration</a></li>");
	out.println("  				<li><a href='../um/login.jsp'>Login</a></li>");
	out.println("  				<li><a href='../um/logout.jsp'>Logout</a></li>");
	out.println("		 	</ul>");
	out.println("		</div>");
	out.println("	</div>");			
	out.println("</div>");	
%>	