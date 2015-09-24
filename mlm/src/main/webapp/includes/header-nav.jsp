<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String roleId = session.getAttribute("roleId")==null?null:session.getAttribute("roleId").toString();
	if(roleId==null || roleId==""){
		Cookie[] cookies = request.getCookies();
		if(cookies!=null && cookies.length>0){
			for(Cookie c:cookies){
				if(c.getName().equals("roleId")){
					roleId = c.getValue();
				}
			}
		}
	}
	System.out.println("roleid="+roleId);
%> 
<div class='row'>
 	<div class='navbar navbar-inverse' role='navigation'>
		<div class='navbar-header'> 
			<button class='navbar-toggle' type='button' data-toggle='collapse' data-target='.navbar-responsive-collapse'>
				<span class='sr-only'>Toggle Navigation</span>
				<span class='icon-bar'></span>
				<span class='icon-bar'></span>
				<span class='icon-bar'></span>
			</button>
			<a href='##' class='navbar-brand text-center'><img style='width: 25px; height: 30px' src='<%=request.getContextPath()%>/images/logo/logo-new.png' alt='Vital States Inc'>Vital States Inc</a>
 		</div>
 		<!-- when screen width less than 768px, the content of div.navbar-responsive-collapse will be hidden, show icon-bar, when click icon-bar, it will extend. when screen width greater than 768px, show as default. -->
		<div class='collapse navbar-collapse navbar-responsive-collapse'>
			<ul class='nav navbar-nav'>
		  		<li><a href='<%=request.getContextPath()%>/home'>Home</a></li>
<%
	if( roleId==null || !roleId.equals("1") )
	{
%>		  		
  				<li><a href='<%=request.getContextPath()%>/products'>Products</a></li>
<%
	}
%>
		 		<%-- <li><a href='<%=request.getContextPath()%>/common/aboutus'>Sites</a></li> --%>
		 		<li><a href='<%=request.getContextPath()%>/common/contactus'>Contact Us</a></li>
<%
	if( roleId==null || !roleId.equals("1") )
	{
%>			 	
  				<li><a href='<%=request.getContextPath()%>/selectAutoship'>Registration</a></li>
<%
	}
%> 
  				<li><a href='<%=request.getContextPath()%>/login'>Login</a></li>
  				<li><a href='<%=request.getContextPath()%>/logout'>Logout</a></li>
		 	</ul>
		</div>
	</div>		
</div>