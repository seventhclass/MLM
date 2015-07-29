$(document).ready(function () {
    var basePath = $('#basePath').attr("value");
    var userInfo_userId = $('#get_userInfo').attr("data-userid");
    var userInfo_userName = $('#get_userInfo').attr("data-username");

    //queryUserPaymentMethodInfo();
    queryAutoShipListInfo();
    //queryShippingMethodInfo();
    //queryOrderSummaryInfo();


    function queryAutoShipListInfo() {
        //send requrest to server.
        $.ajax({
            url: basePath + 'autoshiplist',
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
                var isChecked = "";
                var name = "";
                $.each(res.autoshipList, function (i, item) {
                    if (i == 0) {
                        isChecked = "checked";
                    } else {
                        isChecked = "";
                    }
                    //if(item.firstname && item.firstname!=""){
                    if (item.name != "") {
                        //name = item.firstname + " " +item.lastname;
                        name = item.name;
                    } else {
                        name = item.companyname;
                    }

                    $('#autoShipList').append(
                        "<tr>"
                        + "	<td><input type='checkbox' value='' " + isChecked + "></td>"
                        + "	<td>" + item.id + "</td>"
                        + "	<td>" + item.name + "</td>"
                        + "	<td>" + item.volume + "</td>"
                        + "	<td>" + item.date + "</td>"
                        + "	<td>" + item.paymethod + "</td>"
                        + "</tr>"
                    );
                });
            } else {
                $("<div>No AutoShip List info.</div>").insertAfter('#autoShipList');
            }
        } else {
            alert("Sorry, loading AutoShip List info failed! Try again, please. ");
        }
    }

    function queryShippingMethodInfo() {
        //send requrest to server.
        $.ajax({
            url: basePath + '/shippingMethod',
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
                queryShippingMethodInfoResponse(res);
            }
        });
    }

    function queryShippingMethodInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#selectshipmethod').html("");
            if (res.shippingMethod && res.shippingMethod.length > 0) {
                $.each(res.shippingMethod, function (i, item) {
                    $('#selectshipmethod').append(
                        "<option value='" + item.id + "' " + isSelected + ">$" + item.fee + " - " + name + "</option>"
                    );
                });
            }
        } else {
            alert("Sorry, loading shipping method failed! Try again, please. ");
        }
    }

    function queryOrderSummaryInfo() {
        //send requrest to server.
        $.ajax({
            url: basePath + '/orderSummary',
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
                queryOrderSummaryInfoResponse(res);
            }
        });
    }

    function queryOrderSummaryInfoResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result == "success") {
            $('#ordersummary_subordertotal').html(res.orderSummary.subordertotal);
            $('#ordersummary_shippingfee').html();
            $('#ordersummary_tax').html();
            $('#ordersummary_ordertotal').html();
        }
    }

    $('#userTotalOrderForm').submit(function () {
        $.post(basePath + 'doOrderProcess', $(this).serialize(), function (res) {
            processOrderResponse(res);
        }).fail(function (xhr, ajaxOptions, thrownError) {
            // just in case posting your form failed
            alert(xhr.status + "\n" + xhr.responseText);
            alert("Send process order request failed.");
        });
        return false;
    });

    function processOrderResponse(res) {
        var result = res.result;			//response code
        var message = res.message;			//response message

        if (result != "success") {
            if (message == null || message == "") {
                message = "Sorry, process your order request failed.";
            }
            alert(message);
        }
    }

});

