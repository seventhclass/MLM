<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1" %>
<%!
   String s = "Hello World";
   int sum(int x,int y)
   {
	   return x=y;
   }
%>

<%
   out.println("Result="+sum(10,28));
   out.println("<hr/>");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	It is a Jsp program Demo.
</body>
</html>