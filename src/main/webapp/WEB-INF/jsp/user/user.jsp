<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
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
<body>
<div id="wrapper">
    <jsp:include page="/topbar.html"></jsp:include>
    <jsp:include page="/leftbar.html"></jsp:include>
    <%--<%@include file="/leftbar.html"%>--%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-md-12">
                <h1 class="page-header">
                    用户列表
                </h1>
            </div>
        </div>

        <div id="page-inner">

            <div class="row">
                <div class="col-sm-6" style="width: 100%;">
                    <div class="tabs-container">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#tab-31" aria-expanded="true">待审核用户</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-32" aria-expanded="false">普通用户</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-33" aria-expanded="false">运维人员</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-34" aria-expanded="false">管理员</a></li>
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
                                        <th>头像</th>
                                        <th>用户名</th>
                                        <th>邮箱</th>
                                        <th>性别</th>
                                        <th>生日</th>
                                        <th>地址</th>
                                        <th>签名</th>
                                        <th>注册时间</th>
                                        <th>角色名称</th>
                                        <th>操作</th>
                                        <th>审核</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="pend" items="${pendingAuditUser}">
                                        <tr class="odd gradeX">
                                                <%--<td><input type="checkbox" /></td>--%>
                                            <td><img src="${pend.AVATAR}" style="width: 50px;height: 50px"></td>
                                            <td>${pend.USERNAME}</td>
                                            <td>${pend.USEREMAIL}</td>
                                            <td>${pend.GENDER}</td>
                                            <td>${pend.USERBIRTHDAY}</td>
                                            <td>${pend.USERADDRESS}</td>
                                            <td>${pend.USERSIGNATURE}</td>
                                            <td>${pend.CREATETIME}</td>
                                            <td>${pend.ROLENAME}</td>
                                            <td><button>i</button></td>
                                            <td><button>c</button></td>
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
                                        <th>头像</th>
                                        <th>用户名</th>
                                        <th>邮箱</th>
                                        <th>性别</th>
                                        <th>生日</th>
                                        <th>地址</th>
                                        <th>签名</th>
                                        <th>注册时间</th>
                                        <th>角色名称</th>
                                        <th>操作</th>
                                        <th>审核</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="pub" items="${publicUser}">
                                        <tr class="odd gradeX">
                                                <%--<td><input type="checkbox" /></td>--%>
                                            <td><img src="${pub.AVATAR}" style="width: 50px;height: 50px"></td>
                                            <td>${pub.USERNAME}</td>
                                            <td>${pub.USEREMAIL}</td>
                                            <td>${pub.GENDER}</td>
                                            <td>${pub.USERBIRTHDAY}</td>
                                            <td>${pub.USERADDRESS}</td>
                                            <td>${pub.USERSIGNATURE}</td>
                                            <td>${pub.CREATETIME}</td>
                                            <td>${pub.ROLENAME}</td>
                                            <td><button>i</button></td>
                                            <td><button>c</button></td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                    <!--End Advanced Tables -->
                    <div id="tab-33" class="tab-pane">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>头像</th>
                                        <th>用户名</th>
                                        <th>邮箱</th>
                                        <th>性别</th>
                                        <th>生日</th>
                                        <th>地址</th>
                                        <th>签名</th>
                                        <th>注册时间</th>
                                        <th>角色名称</th>
                                        <th>操作</th>
                                        <th>审核</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="it" items="${ITUser}">
                                        <tr class="odd gradeX">
                                                <%--<td><input type="checkbox" /></td>--%>
                                            <td><img src="${it.AVATAR}" style="width: 50px;height: 50px"></td>
                                            <td>${it.USERNAME}</td>
                                            <td>${it.USEREMAIL}</td>
                                            <td>${it.GENDER}</td>
                                            <td>${it.USERBIRTHDAY}</td>
                                            <td>${it.USERADDRESS}</td>
                                            <td>${it.USERSIGNATURE}</td>
                                            <td>${it.CREATETIME}</td>
                                            <td>${it.ROLENAME}</td>
                                            <td><button>i</button></td>
                                            <td><button>c</button></td>
                                        </tr>
                                    </c:forEach>

                                    </tbody>
                                </table>
                            </div>

                        </div>
                    </div>
                    <!--End Advanced Tables -->
                    <div id="tab-34" class="tab-pane">
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>头像</th>
                                        <th>用户名</th>
                                        <th>邮箱</th>
                                        <th>性别</th>
                                        <th>生日</th>
                                        <th>地址</th>
                                        <th>签名</th>
                                        <th>注册时间</th>
                                        <th>角色名称</th>
                                        <th>操作</th>
                                        <th>审核</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="admin" items="${adminUser}">
                                        <tr class="odd gradeX">
                                                <%--<td><input type="checkbox" /></td>--%>
                                            <td><img src="${admin.AVATAR}" style="width: 50px;height: 50px"></td>
                                            <td>${admin.USERNAME}</td>
                                            <td>${admin.USEREMAIL}</td>
                                            <td>${admin.GENDER}</td>
                                            <td>${admin.USERBIRTHDAY}</td>
                                            <td>${admin.USERADDRESS}</td>
                                            <td>${admin.USERSIGNATURE}</td>
                                            <td>${admin.CREATETIME}</td>
                                            <td>${admin.ROLENAME}</td>
                                            <td><button>i</button></td>
                                            <td><button>c</button></td>
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
