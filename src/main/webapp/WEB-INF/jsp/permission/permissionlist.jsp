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
                                <table class="table table-striped table-bordered table-hover"
                                       id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th style="text-align: center;">权限编号</th>
                                        <th style="text-align: center;">权限逻辑名：汉字</th>
                                        <th style="text-align: center;">权限物理名</th>
                                        <th style="text-align: center;">最新修改时间</th>
                                        <th style="text-align: center;">操作</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="per" items="${permissionList}" varStatus="i">
                                        <tr class="odd gradeX">
                                            <td>${i.count}</td>
                                            <td id="logicName${per.permissionId}">${per.permissionLogicName}</td>
                                            <td id="physicalName${per.permissionId}">${per.permissionPhysicalName}</td>
                                            <td class="center">${per.time}</td>
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
                    <!--End Advanced Tables -->
                    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModelLabel"
                         aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                        &times;
                                    </button>
                                    <h4 class="modal-title" id="myModalLabel">编辑系统权限</h4>
                                </div>
                                <div class="modal-body">
                                    <form class="form-horizontal" id="editModalForm">
                                        <div class="form-group" style="display: none;">
                                            <input type="text" id="editPermissionId" name="permissionId"
                                                   class="form-control" aria-required="true">
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">权限逻辑名</label>
                                            <div class="col-sm-8">
                                                <input class="form-control" id="editLogicName" minlength="2"
                                                       aria-required="true"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-3 control-label">权限物理名</label>
                                            <div class="col-sm-8">
                                                <input class="form-control" id="editPhysicalName" minlength="2"
                                                       aria-required="true"/>
                                            </div>
                                        </div>

                                    </form>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                    <button type="button" class="btn btn-primary">提交更改</button>
                                </div>
                            </div><!-- /.modal-content -->
                        </div><!-- /.modal -->
                    </div>
                </div>
            </div>
            <!-- /. ROW  -->
        </div>
        <!-- /. PAGE INNER  -->
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

<script>
    $(document).ready(function () {
        $('#dataTables-example').dataTable();
    });

    function editPermission(permissionid) {
        var editLogicName = document.getElementById("logicName" + permissionid).innerText;
        var editphysicalName = document.getElementById("physicalName" + permissionid).innerText;

        // alert(permissionid + "   " + editLogicName + "   " + editphysicalName);
        $("#editPermissionId").val(permissionid);
        $("#editLogicName").val(editLogicName);
        $("#editPhysicalName").val(editphysicalName);
    }
</script>

<!-- Custom Js -->
<script src="../../../assets/js/custom-scripts.js"></script>


</body>

</html>
