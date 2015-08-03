<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<div class="row">
	<div class="h4 col-md-5">
		<span class="glyphicon glyphicon-user"></span>&nbsp;&nbsp;
		Welcome <strong style="color:green" id="membername"></strong>&nbsp;<strong>&#40;<span id="memberid"></span>&#41;</strong>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function(){		
		var id = $('#get_userInfo').attr('data-userid');
		var name = $('#get_userInfo').attr('data-username');
		//alert("id="+id+", name="+name);
		$('#memberid'). html(id);
		$('#membername').html(name);
	});
</script> 