<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<div class="row">
	<div class="h4 col-md-5">
		<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;
		Welcome <strong style="color:red" id="membername"></strong>&nbsp;<strong>&#40;<span id="memberid"></span>&#41;</strong>
	</div>
</div>
<script>
	$(document).ready(function(){		
		$('#memberid').val($('#get_userInfo').attr('data-userid'));
		$('#membername').val($('#get_userInfo').attr('data-username'));
	});
</script> 