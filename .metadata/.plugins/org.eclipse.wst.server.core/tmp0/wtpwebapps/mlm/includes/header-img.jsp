<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="row">
	<div class="col-md-12">
		<img style='width: 100%; height: 75px'
			 src='<%=request.getContextPath()%>/images/header7.jpg' alt='milleans vie science'/>
	</div>
	<%
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>
	<basePath value = "<%=basePath%>" id = "basePath"></basePath>	
</div>