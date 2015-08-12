
function _chooseAll(obj,name)
{
	var elms = document.getElementsByName(name);       
    if(elms.length<1)  
    {
    	return;   
	}
	for(var i=0;i<elms.length;i++)   
	{
		if(elms[i].type=="checkbox")  
		{                     
			if(obj.checked == true)
			{
				elms[i].checked = true;
			}
			else
			{
				elms[i].checked = false;
			}
		}  
	}           
}

$(document).ready(function () {
    var basePath = $('#basePath').attr("value");
    var userInfo_userId = $('#get_userInfo').attr("data-userid");
    var userInfo_userName = $('#get_userInfo').attr("data-username");

    $('.shippinglist_btn').click(function(){
    	var shippingDate = $('#ashipdate').val();
    	queryAutoShipListInfo(shippingDate);
    });

    $('.updshippingstatus_btn').click(function () {
        sendRequestOfUpdShipping();
    });
    
    function queryAutoShipListInfo(date) {
        //send requrest to server.
        $.ajax({
            url: basePath + 'ship/shipList',
            cache: false,
            async: false,
            type: 'POST',
            data: {
            	date: date
 			},
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
            },
            success: function (res) {
                queryAutoShipListInfoResponse(res);
            }
        });
    }

    function queryAutoShipListInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#autoShipList').html("");
            if (res.autoshipList && res.autoshipList.length > 0) {
                $.each(res.autoshipList, function (i, item) {
                    $('#autoShipList').append(
                        "<tr>"
                        + "	<td><input type='checkbox' id='shippingstatus[]' name='shippingstatus[]' value='"+item.orderIdL+"|"+item.isAutoShip+"'></td>"
                        + "	<td>" + item.userId + "</td>"
                        + "	<td>" + item.orderIdL + "</td>"
                        + "	<td>" + item.isAutoShip + "</td>"
                        + "	<td>" + item.autoShipDate + "</td>"
                        + "	<td>" + item.shipMethod + "</td>"
                        + "	<td>" + item.address + "</td>"
                        + "</tr>"
                    );
                });
                $('#autoShipList').append(
                	"<tr>"
					+"	<td colspan='7' align='center'>"
					+"		<button type='button' class='btn btn-success updshippingstatus_btn' >Update</button>"
					+"	</td>"
					+"</tr>"
                );
            } else {
                $("<div>No Shipping List info.</div>").insertAfter('#autoShipList');
            }
        } else {
            alert("Sorry, loading Shipping List info failed! Try again, please. ");
        }
    }
    
    function sendRequestOfUpdShipping()
    {
    	var orderids = "";
    	var elms = document.getElementsByName("shippingstatus[]");       
        if(elms.length<1)  
        {
        	alert("No record was selected.");
        	return;   
    	}
        var choose=false;
    	for(var i=0;i<elms.length;i++)   
    	{
    		if(elms[i].type=="checkbox" && elms[i].checked == true)  
    		{                     
    			if(orderids!="")
    			{
    				orderids += ";";
    			}
    			orderids += elms[i].value;
    			choose=true;
    		}  
    	}
    	if(!choose)
    	{
        	alert("No record was selected.");
        	return;   
    	}

    	var shippingDate = $('#ashipdate').val();
        $.ajax({
            url: basePath + 'ship/finishedShip',
            cache: false,
            async: false,
            type: 'POST',
            data: {
            	date: shippingDate,
                orderArr: orderids
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
            },
            success: function (res) {
            	sendRequestOfUpdShippingResponse(res);
            }
        });
    }
    function sendRequestOfUpdShippingResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
        	alert("Update shipping is successed.");
            window.location.href = basePath + "ship/autoshiplist";
        } else {
            if (message == null || message == "") {
                message = "Sorry, your request is failed.";
            }
            alert(message);
        }
    }
});

