<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String userId = session.getAttribute("userid")==null?null:session.getAttribute("userid").toString();
	String userName = session.getAttribute("username")==null?null:session.getAttribute("username").toString();	
%>    
<div class="row">
	<div class="h4 col-md-offset-9 col-md-3">
		<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;
		Welcome <strong style="color:red"><%=userName %></strong>&nbsp;<strong>(<span id="memberid"><%=userId %></span>)</strong>.
	</div>
</div>