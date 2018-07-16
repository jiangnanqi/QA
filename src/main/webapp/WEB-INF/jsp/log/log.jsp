<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>日志信息</title>

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="../../../assets/materialize/css/materialize.min.css" media="screen,projection"/>
    <!-- Bootstrap Styles-->
    <link href="../../../assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FontAwesome Styles-->
    <link href="../../../assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- Morris Chart Styles-->
    <link href="../../../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet"/>
    <!-- Custom Styles-->
    <link href="../../../assets/css/custom-styles.css" rel="stylesheet"/>
    <!-- Google Fonts-->
    <link rel="stylesheet" href="../../../assets/js/Lightweight-Chart/cssCharts.css">
</head>
<body>
<div id="wrapper">
    <%@include file="../../../topbar.html"%>
    <%--<jsp:include page="/topbar.html"></jsp:include>--%>
    <!--/. NAV TOP  -->
    <!--/. NAV TOP  -->
    <%@include file="../../../leftbar.html"%>
    <%--<jsp:include page="/leftbar.html"></jsp:include>--%>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div class="header">
            <h1 class="page-header">
               日志列表
            </h1>
        </div>

        <div id="page-inner">

            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="card">
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <%--<th><input type="checkbox"></th>--%>
                                        <th>用户</th>
                                        <th>操作</th>
                                        <th>操作时间</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="log" items="${loglist}">
                                        <tr class="odd gradeX">
                                            <%--<td><input type="checkbox" /></td>--%>
                                            <td>${log.logUser}</td>
                                            <td>${log.logMethod}</td>
                                            <td>${log.logTime}</td>
                                            <td class="center"><button onclick="deletelog('${log.logId}')">删除</button></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
            <!-- /. ROW  -->
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->

</div>
<!-- jQuery Js -->
<script src="/assets/js/jquery-1.10.2.js"></script>

<!-- Bootstrap Js -->
<script src="/assets/js/bootstrap.min.js"></script>

<script src="/assets/materialize/js/materialize.min.js"></script>

<!-- Metis Menu Js -->
<script src="/assets/js/jquery.metisMenu.js"></script>
<!-- Morris Chart Js -->
<script src="/assets/js/morris/raphael-2.1.0.min.js"></script>
<script src="/assets/js/morris/morris.js"></script>


<script src="/assets/js/easypiechart.js"></script>
<script src="/assets/js/easypiechart-data.js"></script>

<script src="/assets/js/Lightweight-Chart/jquery.chart.js"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="/assets/js/dataTables/jquery.dataTables.js"></script>
<script src="/assets/js/dataTables/dataTables.bootstrap.js"></script>
<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });
</script>
<!-- Custom Js -->
<script src="/assets/js/custom-scripts.js"></script>
<script type="text/javascript">
    function deletelog(id) {
        var present_row = event.target.parentNode.parentNode;
        // alert(id);
        if(confirm("确认删除？")){
            $.ajax({
                type:"post",
                url:"/log/deletelog",
                data:{
                    "id":id
                },
                dataType:"text",
                success:function (data) {
                    // alert("删除成功");
                    present_row.remove();
                },
                error:function (data) {
                    alert("error")
                }
            })
        }else {

        }
    }
</script>

</body>

</html>
