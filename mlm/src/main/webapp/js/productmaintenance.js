/**
 *
 */

$(document).ready(function () {
    var basePath = $('#basePath').attr("value");
    queryProductInfo();
    //Query category information
    function queryCategoryInfo() {

        //send requrest to server.
        $.ajax({
            url: basePath + 'common/category',
            cache: false,
            async: false,
            type: 'POST',
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                queryCategoryInfoResponse(res);
            }
        });
    }

    //Process query category information response
    function queryCategoryInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#categoryselect').html("");
            if (res.list && res.list.length > 0) {
                $.each(res.list, function (i, item) {
                    $('#categoryselect').append(
                        "<option value='" + item.id + "'>" + item.name + "</option>"
                    );
                });
            } else {
                $("<option>No Any Category Item</option>").insertAfter('#categoryselect');
            }
        }
    }

    //Query currency information
    function queryCurrencyInfo() {

        //send requrest to server.
        $.ajax({
            url: basePath + 'common/currency',
            cache: false,
            async: false,
            type: 'POST',
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                queryCurrencyInfoResponse(res);
            }
        });
    }

    //Process query currency information response
    function queryCurrencyInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#currencyselect').html("");
            if (res.symbol && res.symbol.length > 0) {
                $.each(res.symbol, function (i, item) {
                    $('#currencyselect').append(
                        "<option value='" + item.id + "'>" + item.symbol + " - " + item.name + "</option>"
                    );
                });
            } else {
                $("<tr><td>No items. </td></tr>").insertAfter('#currencylist');
            }
        }
    }

    //Query product information
    function queryProductInfo() {
        //send requrest to server.
        $.ajax({
            url: basePath + 'productList',
            cache: false,
            async: false,
            type: 'POST',
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                queryProductInfoResponse(res);
            }
        });
    }

    //Process query product information response
    function queryProductInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            if (res.productInfo && res.productInfo.length > 0) {
               	$('#productlist').html("");
                $.each(res.productInfo, function (i, item) {
                    $('#productlist').append(
                        "<tr>"
                        + "	<td data-value='" + item.id + "'>" + item.itemCode + "</td>"
                        + "	<td data-value='" + item.categoryId + "'>" + item.categoryName + "</td>"
                        + "	<td>" + item.name + "</td>"
                        + "	<td>" + parseFloat(item.wholesalePrice).toFixed(2) + "</td>"
                        + "	<td>" + parseFloat(item.retailPrice).toFixed(2) + "</td>"
                        + "	<td data-value='" + item.currencyId + "'>" + item.currencySymbol + "</td>"
                        + "	<td>" + item.capsuleNumber + "</td>"
                        + "	<td>" + item.volume + "</td>"
                        + "	<td>" + item.volume2 + "</td>"
                        + "  <td style='display:none;'>" + item.description + "</td>"
                        + "  <td>"
                        + "		<button type='button' class='btn btn-success btn-sm editproductbtn' data-toggle='modal' data-target='.productmaintenance' data-backdrop='static' >&nbsp;&nbsp;Edit&nbsp;&nbsp;</button>"
                        + "		<button type='button' class='btn btn-warning btn-sm delproductbtn' data-toggle='modal' data-productid='" + item.id + "' data-target='#productcancel' data-backdrop='static' >Delete</button>"
                        + "	 	<button type='button' class='btn btn-primary btn-sm editproductimgbtn' data-toggle='modal' data-productid='" + item.id + "' data-target='.productimg' data-backdrop='static' >Image</button>"
                        + "	</td>"
                        + " </tr>"
                    );
                });
            } else {
            	$('#productlist').html("");
                $("<tr><td colspan='10'>No items. </td></tr>").insertAfter('#productlist');
            }
        }
    }

    $('.pdt_maintenance').click( function(e) {
        queryCategoryInfo();
        queryCurrencyInfo();
        if ( $(e.target).is('.editproductbtn') ) {
            editProduct(e);
        } 
        else if ( $(e.target).is('.addproductbtn') ) 
        {
            addProduct(e);
        } 
        else if ( $(e.target).is('.delproductbtn') ) 
        {
            delProduct(e);
        } 
        else if ( $(e.target).is('.editproductimgbtn') ) 
        {
            editProductImage(e);
        }
    });

    function editProductImage(e) {
        var id = $(e.target).attr("data-productid");
        $('#msg').html("");        
        queryProductImages(id);
    }

    function queryProductImages(id) {
    	alert("productid="+id);
        $('#uploadFilebtn').attr("data-productid", id);
        $('#productId').val(id);
        //send requrest to server.
        $.ajax({
            url: basePath + 'productImages',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                productId: id
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                queryProductImagesResponse(res);
            }
        });
    }

    function queryProductImagesResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#editProductImgForm').html("");
            if (res.albumInfo && res.albumInfo.length > 0) {
                $.each(res.albumInfo, function (i, item) {
                    $('#editProductImgForm').append(
                        "<div class='form-group'>"
                        + "	<div class='col-sm-1'>"
                        + "		<input type='checkbox' name='productimage' value='" + item.id + "'>"
                        + "	</div>"
                        + "	<div class='col-sm-6'>"
                        + "		<img src='" + basePath + "images/products/" + item.imageName + "' style='height: 80px; width: 50px; display: block;' alt=''>"
                        + "	</div>"
                        + "</div>"
                    );
                });

                $('#editProductImgForm').append("<button type='submit' class='btn btn-primary'>Delete</button>");
            } else {
                $("<div class='form-group'><div>No items. </div>").insertAfter('#editProductImgForm');
            }
        }
    }

    function editProduct(e) {
        getAndSetData(e);
        $('#productid').attr("data-model", "upd");
    }

    function addProduct(e) {
        initData();
        $('#productid').attr("data-model", "add");
    }

    function delProduct(e) {
        getAndSetData(e);
        $('#productid').attr("data-model", "del");
    }

    $('#editProductbtn').click(function () {
        sendRequestOfEditProduct();
    });

    $('#delProductbtn').click(function () {
        sendRequestOfEditProduct();
    });

//    $('#uploadFilebtn').click(function(e){
//    	alert("zzzzzzzzzz");
//    	sendRequestOfUploadFile(e);
//    	uploadImage(e);
//    });

    /*	function sendRequestOfUploadFile(e){
     alert("1111");
     $.ajaxFileUpload({
     url:basePath+'uploadImageFile',
     secureuri:false,
     fileElementId:'uploadFile',
     dataType: 'json',
     error:	function(xhr, ajaxOptions, thrownError){
     alert(xhr.status+"\n"+xhr.responseText);
     },
     success:	function(res) {
     alert("success!!!!");
     sendRequestOfUploadFileResponse(res,id);
     }
     });
     }*/
//    function sendRequestOfUploadFile(e){
//    	var id = $('#uploadFilebtn').attr("data-productid");
//    	alert("id="+id);
//       formData = new FormData();
//       formData.append('file', $('input[name=uploadFile]').get(0).files[0]);
//    
//       alert("formData="+formData);
//        $.ajax({
//        	url: basePath+'uploadImageFile',
//           contentType: "multipart/form-data",
//    		cache:false,
//    		async: false,
//           processData: false,
//    		type:'POST',
//    		data: {
//    				productId: id,
//    				uploadFile: $('input[name=uploadFile]').get(0).files[0]
//    		},
//        	dataType:'json',
//        	timeout:5000,
//        	error:	function(xhr, ajaxOptions, thrownError){
//    	                alert(xhr.status+"\n"+xhr.responseText);
//        			},
//        	success:	function(res) {
//        		alert("success!!!!");
//        		sendRequestOfUploadFileResponse(res,id);
//        			}
//        });
//        return false;
//    }

//    function sendRequestOfUploadFileResponse(res, id) {
//        var result = res.result;			//response code
//        var message = res.message;			//response message
//
//        if (result == "success") {
//            queryProductImages(id);
//        } else {
//            if (message == null || message == "") {
//                message = "Sorry, your request is failed.";
//            }
//            alert(message);
//        }
//    }

    function sendRequestOfEditProduct() {
        var i_model = $('#productid').attr("data-model");
        var i_id = $('#productid').val();
        var i_itemcode = $('#itemcode').val();
        var i_name = $('#name').val();
        var i_categoryid = $('#categoryselect').val();
        var i_currencyid = $('#currencyselect').val();
        var i_wprice = $('#w_price').val();
        var i_rprice = $('#r_price').val();
        var i_numbers = $('#numbers').val();
        var i_volume = $('#volume').val();
        var i_volume2 = $('#volume2').val();
        var i_desc = $('#description').val();
        alert("model=" + i_model + ", id=" + i_id + ", itemcode=" + i_itemcode + ", name=" + i_name + ", categoryid=" + i_categoryid + ", currencyid=" + i_currencyid + ", wprice=" + i_wprice + ", rprice=" + i_rprice + ", numbers=" + i_numbers + ", volume=" + i_volume + ", volume2=" + i_volume2 + ", description=" + i_desc);
        $.ajax({
            url: basePath + 'editproduct',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                model: i_model,
                id: i_id,
                itemcode: i_itemcode,
                name: i_name,
                categoryid: i_categoryid,
                currencyid: i_currencyid,
                w_price: i_wprice,
                r_price: i_rprice,
                numbers: i_numbers,
                volume: i_volume,
                volume2: i_volume2,
                description: i_desc
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
            },
            success: function (res) {
                sendRequestOfEditProductResponse(res);
            }
        });
    }

    function sendRequestOfEditProductResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            window.location.href = basePath + "productmaintenance";
        } else {
            if (message == null || message == "") {
                message = "Sorry, your request is failed.";
            }
            //alert(message);
        }
    }

    function initData() {
        $('#itemcode').val("");
        $('#productid').val("");
        $('#name').val("");
        $('#w_price').val("0.00");
        $('#r_price').val("0.00");
        $('#numbers').val("0");
        $('#volume').val("0");
        $('#volume2').val("0");
        $('#description').val("");
    }

    function getAndSetData(e) {

        var $td = $(e.target).parents("tr").children("td");

        //alert("productid=" + $td.eq(0).attr("data-value") + ", itemcode=" + $td.eq(0).text());

        $('#productid').val($td.eq(0).attr("data-value"));
        $('#itemcode').val($td.eq(0).text());
        $("#categoryselect").val($td.eq(1).attr("data-value"));
        $('#name').val($td.eq(2).text());
        $('#w_price').val($td.eq(3).text());
        $('#r_price').val($td.eq(4).text());
        $('#currencyselect').val($td.eq(5).attr("data-value"));
        $('#numbers').val($td.eq(6).text());
        $('#volume').val($td.eq(7).text());
        $('#volume2').val($td.eq(8).text());
        $('#description').val($td.eq(9).text());
    }
    
/*    function callback(msg)
    {   
        document.getElementById("uploadFile").outerHTML = document.getElementById("uploadFile").outerHTML;   
        document.getElementById("msg").innerHTML = "<font color=red>Upload file "+msg+".</font>";   
    	if(msg=="Success"){
    		var productid = document.getElementById("productId").value;
    		alert("productid="+productid);
    		parent.queryProductImages(productid);
    	}
    } */   
});

