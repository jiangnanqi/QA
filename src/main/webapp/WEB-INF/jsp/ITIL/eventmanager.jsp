<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>事件管理</title>
    <!-- Bootstrap Styles-->
    <link href="../../../assets/css/bootstrap.css" rel="stylesheet"/>
    <link href="../../../assets/css/jquery.dataTables.css" rel="stylesheet">
    <!-- FontAwesome Styles-->
    <link href="../../../assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- Morris Chart Styles-->
    <%--<link href="../../../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet"/>--%>
    <!-- Custom Styles-->
    <link href="../../../assets/css/custom-styles.css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
</head>
<body>
<div id="wrapper">
    <%--<jsp:include page="/topbar.html"></jsp:include>--%>
    <%--<jsp:include page="/leftbar.html"></jsp:include>--%>
        <%@include file="/topbar.html"%>
        <%@include file="/leftbar.html"%>
    <%--<%@include file="/leftbar.html"%>--%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-md-12">
                <h1 class="page-header">
                    事件管理
                </h1>
            </div>
        </div>

        <div id="page-inner">

            <div class="row">
                <div class="col-sm-6" style="width: 100%;">
                    <div class="tabs-container">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#tab-31" aria-expanded="true">待处理事件</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-32" aria-expanded="false">已处理事件</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="tab-content">

                    <div id="tab-31" class="tab-pane active">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                    <tr>
                                        <th>序号</th>
                                        <th>问题名称</th>
                                        <th>提问用户</th>
                                        <th>问题时间</th>
                                        <th>查看</th>
                                        <th>忽略</th>
                                    </tr>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="event" items="${eventUnresolved}" varStatus="i">
                                        <tr class="odd gradeX">
                                            <td>${i.count}</td>
                                            <td>${event.userQuestionTitle}</td>
                                            <td>${event.userName}</td>
                                            <td>${event.userQuestionTime}</td>
                                            <td><a href="<%=request.getContextPath() %>/unresolveEventInfo?id=${event.userQuestionId}">详细信息</a></td>
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" onclick="ignoreevent('${event.userQuestionId}')">
                                                    <i class="glyphicon glyphicon-folder-close"></i>
                                                </button>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                    <!--End Advanced Tables -->
                    <div id="tab-32" class="tab-pane">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>序号</th>
                                        <th>问题名称</th>
                                        <th>提问用户</th>
                                        <th>问题时间</th>
                                        <th>查看</th>
                                        <th>忽略</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="event" items="${eventresolved}" varStatus="i">
                                        <tr class="odd gradeX">
                                            <td>${i.count}</td>
                                            <td>${event.userQuestionTitle}</td>
                                            <td>${event.userName}</td>
                                            <td>${event.userQuestionTime}</td>
                                            <td><a href="<%=request.getContextPath() %>/resolveevent?id=${event.userQuestionId}">详细信息</a></td>
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" onclick="ignoreevent('${event.userQuestionId}')">
                                                    <i class="glyphicon glyphicon-folder-close"></i>
                                                </button>
                                            </td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>


<!-- jQuery Js -->
<script src="../../../assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="../../../assets/js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="../../../assets/js/jquery.metisMenu.js"></script>

<script src="../../../assets/js/dataTables/jquery.dataTables.js"></script>
<script src="../../../assets/js/dataTables/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function () {
        // $('.table.table-striped.table-bordered.table-hover').dataTable();
        $('.table.table-striped.table-bordered.table-hover').dataTable();
    });


    function ignoreevent(id) {
        var present_row = event.target.parentNode.parentNode;
        if (confirm("确认忽略吗？")) {
            $.ajax({
                type: "post",
                url: "/ignoreevent",
                data: {
                    "id": id
                },
                dataType: "text",
                success: function (data) {
                    // alert(data);
                    alert("成功");
                    present_row.remove();
                },
                error: function (data) {
                    alert("error")
                }
            })
        }

    }
</script>
<%--<!-- Morris Chart Js -->--%>
<%--<script src="../../../assets/js/morris/raphael-2.1.0.min.js"></script>--%>
<%--<script src="../../../assets/js/morris/morris.js"></script>--%>
<!-- Custom Js -->
<script src="../../../assets/js/custom-scripts.js"></script>

<!-- Custom Js -->
<script src="../../../assets/js/custom-scripts.js"></script>


</body>
</html>
