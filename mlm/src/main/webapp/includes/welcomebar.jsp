<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String userId = session.getAttribute("userid")==null?null:session.getAttribute("userid").toString();
	String userName = session.getAttribute("username")==null?null:session.getAttribute("username").toString();	
	if(userId==null || userId==""){
		Cookie[] cookies = request.getCookies();
		if(cookies!=null && cookies.length>0){
			for(Cookie c:cookies){
				if(c.getName().equals("userid")){
					userId = c.getValue();
				}
				if(c.getName().equals("username")){
					userName = c.getValue();
				}
			}
		}		
	}
%>    
<div class="row">
	<div class="h4 col-md-offset-9 col-md-3">
		<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;
		Welcome <strong style="color:red"><%=userName %></strong>&nbsp;<strong>(<span id="memberid"><%=userId %></span>)</strong>.
	</div>
</div>