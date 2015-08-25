/**
 * 
 */

$(document).ready(function(){
 	var basePath=$('#basePath').attr("value"); 	

 	initMap();
 	
	function initMap(){
		var myCenter=new google.maps.LatLng(45.5021677,-73.5740518);
		var mapProp = {
	    	      center:myCenter,
	    	      zoom:15,
	    	      mapTypeId:google.maps.MapTypeId.ROADMAP
	  	  };
	
	  	var map=new google.maps.Map(document.getElementById("google-maps"),mapProp);
	  	var marker=new google.maps.Marker({
	  		position:myCenter,
	  		animation:google.maps.Animation.BOUNCE
	  	});
	  	marker.setMap(map);
	}

});