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
<userInfo data-userid="<%=userId%>" data-username="<%=userName%>" id="get_userInfo"></userInfo>