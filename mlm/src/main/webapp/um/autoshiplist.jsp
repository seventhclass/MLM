<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Welcome to milleans vie science</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='http://fonts.googleapis.com/css?family=Pacifico' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    <link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css"/>
    <link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css"/>
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/mlm.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/autoshiplist.js"></script>
</head>
<body>
<div class="container">
    <div id="header">
        <%@ include file="../includes/header.jsp" %>
    </div>
    <!-- end header -->
    <div id="functionbar">
        <%@ include file="../includes/functionbar.jsp" %>
    </div>
    <div id="page">
        <div class="row">
            <div class="col-md-3">
                <div id="left">
                    <%@ include file="../includes/nav-left.jsp" %>
                </div>
            </div>
            <div class="col-md-9">
                <div id="content">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="subtitle">Shipping List</div>
                        </div>
                    </div>
                    <div class="ashipdatebox">
                        <div class="row">
                            <div class="col-md-12">
                                <label for="ashipdate" class="col-sm-2">Choose Date:</label>

                                <div class="col-sm-3">
                                    <input type="date" id="ashipdate" name="ashipdate"
                                           value=<%=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()) %>>
                                </div>
                                <div class="col-sm-2">
                                    <button type="button" class="btn btn-info shippinglist_btn">Go</button>
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="table-responsive ordertable">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th class="text-center">Done&nbsp;&nbsp;<input type='checkbox'
                                                                                       onclick="_chooseAll(this,'shippingstatus[]')"/>
                                        </th>
                                        <th align="center">Member ID</th>
                                        <th align="center">Order ID</th>
                                        <th align="center">isAutoShip</th>
                                        <th align="center">Date of Shipping</th>
                                        <th align="center">Method of Payment</th>
                                        <th align="center">Address</th>
                                    </tr>
                                    </thead>
                                    <tbody id="autoShipList">
                                    
                                    </tbody>
                                </table>
                            </div>
                            <div class="table-responsive ordertable">
                                <table class="table">
                                    <tr>
                                        <td colspan="7" align="center">
                                            <button type="button" class="btn btn-success updshippingstatus_btn">Update
                                            </button>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- end content -->
            </div>
        </div>
    </div>
    <!-- end page -->
</div>
<!-- end container -->
<div id="footer">
    <div class="text-center">
        <%@ include file="../includes/footer.jsp" %>
    </div>
</div>

<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

</body>
</html>