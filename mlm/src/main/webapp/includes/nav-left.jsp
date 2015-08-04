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
%> 
<%
	if(roleId=="1")
	{
%>
		<%@ include file="nav-left4admin.jsp"%>  
<%		
	}
	else
	{
%>    
		<%@ include file="nav-left4regular.jsp"%>  
<%
	}
%>		

    
   
