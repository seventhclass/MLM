/**
 *
 */

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

    queryOrderInfo();

    function queryOrderInfo() {
        //send request to server.
        $.ajax({
            url: basePath + '/orderdetail/process/admin/unpayidorders',
            cache: false,
            async: false,
            type: 'POST',
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
            },
            success: function (res) {
                //alert("222");
            	queryOrderInfoResponse(res);
            }
        });
    }

    //Process query shopping cart information response
    function queryOrderInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message
        //var item = res.item;
        
        if (result == "success") {
            $('#unpaidOrderList').html("");
            console.log("------");
            console.log(res.orderList);
            if (res.orderList && res.orderList.length > 0) {
                $.each(res.orderList, function (i, item) {
                	$('#unpaidOrderList').append(
                        "<tr>"
                			+ "	<td>" + item.ordlerIdL + "</td>"
                			+ "	<td>" + item.userIdL + "</td>"
                			+ "	<td>" + item.createDate + "</td>"
                        + "	<td>" + item.userName + "</td>"
                        + "	<td>" + item.amount + "</td>"
                			+ "	<td><input type='checkbox' id='payornot[]' name='payornot[]' value='"+item.ordlerIdL+"'></td>"
                        + "</tr>"
                    );
                });
            } else {
                $("<tr><td>No order list.</td></tr>").insertAfter('#unpaidOrderList');
            }
        }
    }
    
    $('.upd_payment_btn').click(function () {
        sendRequestOfUpdPayment();
    });
    
    function sendRequestOfUpdPayment()
    {
    	var orderids = "";
    	var elms = document.getElementsByName("payornot[]");       
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
    	//alert("orderids="+orderids);
        $.ajax({
            url: basePath + '/orderdetail/process/admin/paying',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                orderids: orderids
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
            },
            success: function (res) {
            	sendRequestOfUpdPaymentResponse(res);
            }
        });
    }
    function sendRequestOfUpdPaymentResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
        	alert("Update payment is successed.");
            window.location.href = basePath + "/orderdetail/process/view/unpaidorder";
        } else {
            if (message == null || message == "") {
                message = "Sorry, your request is failed.";
            }
            alert(message);
        }
    }
});

