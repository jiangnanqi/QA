<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>日志信息</title>
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


</head>
<body>
<div id="wrapper">
    <jsp:include page="/topbar.html"/>
    <jsp:include page="/leftbar.html"/>

    <div id="page-wrapper">
        <div class="header">
            <h1 class="page-header">
                设备信息
            </h1>
        </div>

        <div id="page-inner">
            <div class="panel panel-default">
                <div class="row">
                    <div class="col-md-12">
                        <!-- Advanced Tables -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <%--<th><input type="checkbox"></th>--%>
                                        <th>序号</th>
                                        <th>显卡</th>
                                        <th>声卡</th>
                                        <th>网卡</th>
                                        <th>主板</th>
                                        <th>系统名称</th>
                                        <th>激活号</th>
                                        <th>操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="computer" items="${allComputer}" varStatus="i">
                                        <tr class="odd gradeX">
                                                <%--<td><input type="checkbox" /></td>--%>
                                            <td>${i.count}</td>
                                            <td>${computer.graphiccard}</td>
                                            <td>${computer.audiocard}</td>
                                            <td>${computer.networkcard}</td>
                                            <td>${computer.motherboard}</td>
                                            <td>${computer.osname}</td>
                                            <td>${computer.osid}</td>
                                            <td class="center">
                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#editModal"
                                                        onclick="editPermission('${per.permissionId}')"><i
                                                        class="glyphicon glyphicon-pencil"></i></button>
                                                <button class="btn btn-white btn-sm" type="button"
                                                        onclick="deletePermission('${per.permissionId}')"><i
                                                        class="glyphicon glyphicon-folder-close"></i></button>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
                <!--End Advanced Tables -->
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
        $('#dataTables-example').dataTable();
    });
</script>
<%--<!-- Morris Chart Js -->--%>
<%--<script src="../../../assets/js/morris/raphael-2.1.0.min.js"></script>--%>
<%--<script src="../../../assets/js/morris/morris.js"></script>--%>
<!-- Custom Js -->
<script src="../../../assets/js/custom-scripts.js"></script>

<script type="text/javascript">
    function deletelog(id) {
        var present_row = event.target.parentNode.parentNode;
        // alert(id);
        if (confirm("确认删除？")) {
            $.ajax({
                type: "post",
                url: "/log/deletelog",
                data: {
                    "id": id
                },
                dataType: "text",
                success: function (data) {
                    alert("删除成功");
                    present_row.remove();
                },
                error: function (data) {
                    alert("error")
                }
            })
        }
    }
</script>

</body>

</html>
