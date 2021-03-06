/**
 *
 */

$(document).ready(function () {
    var basePath = $('#basePath').attr("value");

    //$('#memberId').val($('#get_userInfo').attr("data-userid"));
    //$('#memberName').val($('#get_userInfo').attr("data-username"));

    $('#memberId').text($('#get_userInfo').attr("data-userid"));
    $('#memberName').text($('#get_userInfo').attr("data-username"));

    $('#shoppingCartItemNumber').html($('.myshoppingcartitemnumber').html());
    $('#shoppingCartTotalAmt').html($('.myshoppingcartitemnumber').attr("data-totalamount"));

    queryOrderInfo();

    $('.table tr').hover(function (e) {
        $('.close_item').show();
    }, function () {
        $('.close_item').hide();
    });

    $('#clearShoppingCart').click(function () {
        processMyShoppingCart("clear");
    });

    $('#checkoutShoppingCart').click(function () {
        processMyShoppingCart("checkout");
    });

    $("input[type='number'][name='numbers']").change(function (e) {

        var i_id = $(this).attr("data-id");
        var i_seq = $(this).attr("data-seq");
        var i_qty = $(this).val();

        /* 		alert("id="+i_id);
         alert("seq="+i_seq);
         alert("qty="+i_qty);*/

        updateOrderItem(i_id, i_seq, i_qty);

    });

    $('.productsList_btn').click(function (e) {
        queryProductInfo();
    });

    $('.selectProducts').click(function (e) {
        addProduct2Order(e);
    });

    $('#cancel_order').click(function (e) {
        if(window.confirm("Are sure to cancel current order?")){
            cancelOrder(e);
        }
    });

    function cancelOrder() {
        var _orderId = $("#orderId").val();
        console.log("======"+_orderId);
        $.ajax({
            url: basePath + 'order/cancel/' + _orderId,
            cache: false,
            async: false,
            type: 'POST',
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
            },
            success: function (res) {
               // console.log(res);
               // queryOrderInfoResponse(res);
                var result = res.result;			//response code
                var message = res.message;
                if (result == "success") {
                    window.location.href=basePath+'/products';
                } else {
                    alert("Sorry, cancel fail! you can try again or go to other page. ");
                }
            }
        });
    };

    $('#addProductForm').submit(function () {
        var p_items = new Array();
        var p_item = new Array();

        p_item[0] = $('#itemcode').val();
        p_item[1] = $('#itemqty').val();

        if (p_item[0]) {
            p_items[0] = p_item;
            sendAddProduct2OrderRequest(p_items);
        }

        return false;
    });

    function queryOrderInfo() {
        //send requrest to server.
        var _orderId = $("#orderId").val();
        $.ajax({
            url: basePath + 'order/products/' + _orderId,
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
                console.log(res);
                queryOrderInfoResponse(res);
            }
        });
    }

    function processMyShoppingCart(action) {
        //send requrest to server.
        $.ajax({
            url: basePath + '/processCart',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                action: action
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                processMyShoppingCartResponse(res);
            }
        });
    }

    //Process query shopping cart information response
    function processMyShoppingCartResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            ;
        } else {
            alert("Sorry, process your shopping cart failed! Try again, please. ");
        }
    }

    //Process query shopping cart information response
    function queryOrderInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#myOrderList').html("");
            if (res.myOrderInfo && res.myOrderInfo.length > 0) {
                $.each(res.myOrderInfo, function (i, item) {
                    //<input class='numbers' type='number' name='numbers' data-id='"+item.id+"' data-seq='"+item.seq+"' min='1' max='9999' value='"+item.quantity+"'>
                    $('#myOrderList').append(
                        "<tr>"
                        + "	<td>" + item.id + "</td>"
                        + "	<td>" + item.itemCode + "</td>"
                        + "	<td>" + item.name + "</td>"
                        + "	<td>" + item.quantity + "</td>"
                        + "	<td>" + item.currency + "</td>"
                        + "	<td>$" + item.price + "</td>"
                        + "	<td>" + item.volume + "</td>"
                        + "	<td>" + item.volume2 + "</td>"
                        + "	<td id='subPriceTotal_id_" + item.id + item.seq + "'>$" + item.priceTotal + "</td>"
                        + "	<td id='subPointsTotal_id_" + item.id + item.seq + "'>" + item.pointsTotal + "</td>"
                        + "	<td style='width:30px'><span data-id='" + item.id + "' data-seq='" + item.seq + "' class='glyphicon glyphicon-remove-sign close_item' style='color:red's></span></td>"
                        + "</tr>"
                    );
                });
                $('#myOrderList').append(
                    "<td colspan='6' align='right'>Total:</td>"
                    + "<td id='VolumTotal' align='left' colspan='2'>" + res.volumeTotal + "</td>"
                    + "<td id='PriceTotal' align='left'>$" + res.priceTotal + "</td>"
                    + "<td id='PointsTotal' align='left'>" + res.pointsTotal + "</td>"
                );
            } else {
                $("<tr><td>No order item.</td></tr>").insertAfter('#myOrderList');
            }
        }
    }

    $('.close_item').click(function (e) {
        id = $(this).attr("data-id");
        seq = $(this).attr("data-seq");
        //alert("id="+id+", seq="+seq);
        delOrderItem(id, seq);
    });

    function delOrderItem(id, seq) {
        var $id = id;
        var $seq = seq;

        //send requrest to server.
        $.ajax({
            url: basePath + 'delOrderItem',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                id: $id,
                seq: $seq
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                delOrderItemResponse(res);
            }
        });
    }

    function delOrderItemResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            ;
        } else {
            alert("Sorry, delete item from order failed! Try again, please. ");
        }
    }

    function updateOrderItem(id, seq, qty) {
        //send requrest to server.
        $.ajax({
            url: basePath + '/updateOrderItem',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                id: id,
                sequence: seq,
                quantity: qty
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                updateOrderItemResponse(res);
            }
        });
    }

    function updateOrderItemResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        //get quantity from server and set back to front-end page.
        if (result == "success") {
            ;
        } else {
            alert("Sorry, update item from shopping cart failed! Try again, please. ");
        }

        $(this).val(res.orderItem.quantity);

        $('#subPriceTotal_id_' + res.orderItem.id + res.orderItem.seq).html("$" + res.subtotalPrice);
        $('#subPointsTotal_id_' + res.orderItem.id + res.orderItem.seq).html(res.subtotalPoints);

        $('#VolumTotal').html(res.orderItem.totalVolume);
        $('#PriceTotal').html("$" + res.orderItem.totalPrice);
        $('#PointsTotal').html(res.orderItem.totalPoints);
    }

    //Query product information
    function queryProductInfo() {

        //send requrest to server.
        $.ajax({
            url: basePath + '/product',
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
            $('#productsList').html("");
            if (res.productinfo && res.productinfo.length > 0) {
                $.each(res.productinfo, function (i, item) {
                    $('#productsList').append(
                        "<tr>"
                        + "	<td>" + item.productinfo.itemCode + "</td>"
                        + "	<td>" + item.productinfo.productName + "</td>"
                        + "	<td>$" + item.productinfo.wholeSalePrice + "</td>"
                        + "	<td>$" + item.productinfo.retailPrice + "</td>"
                        + "	<td>" + item.productinfo.currency + "</td>"
                        + "	<td>" + item.productinfo.number + "</td>"
                        + "	<td>" + item.productinfo.businessVolume + "BV</td>"
                        + "  <td><input type='number' name='quantity' min='1' max='999' value='1'></td>"
                        + "  <td><input type='checkbox' data-id='" + item.productinfo.id + "'></td>"
                        + "</tr>"
                    );
                });
            } else {
                $("<tr><td>No items. </td></tr>").insertAfter('#productlist');
            }
        }
    }

    function addProduct2Order(e) {
        var rowLength = $('#productsList tr').length;
        var colLength = $('#productsList tr:eq(0) td').length;

        var p_items = new Array();
        var p_item = new Array();

        var counter = 0;

        /* 		alert("tr length="+rowLength);
         alert("td length="+colLength);*/

        for (var i = 0; i < rowLength; i++) {
            var isChecked = $('#productsList tr:eq(' + i + ') td:eq(8) input').is(":checked");
            //alert("isChecked="+isChecked);
            if (isChecked) {
                //p_item[0] = $('#productsList tr:eq('+i+') td:eq(8) input').attr("data-id");	//id
                p_item[0] = $('#productsList tr:eq(' + i + ') td:eq(0)').text();			//itemcode
                p_item[1] = $('#productsList tr:eq(' + i + ') td:eq(7) input').val();		//quantity
                p_items[counter] = p_item;
                counter++;
            }
        }

        if (counter >= 1) {
            sendAddProduct2OrderRequest(p_items);
        } else {
            alert("No any product was selected.");
        }
    }

    function sendAddProduct2OrderRequest(p_items) {
        //send requrest to server.
        $.ajax({
            url: basePath + '/addProductToOrder',
            cache: false,
            async: false,
            type: 'POST',
            data: {
                items: p_items
            },
            dataType: 'json',
            timeout: 5000,
            error: function (xhr, ajaxOptions, thrownError) {
                alert(xhr.status + "\n" + xhr.responseText);
                //$('#content').html(xhr.responseText);
            },
            success: function (res) {
                sendAddProduct2OrderResponse(res);
            }
        });
    }

    function sendAddProduct2OrderResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            ;
        } else {
            alert("Sorry, adding products into your order failed! Try again, please. ");
        }
    }
});

