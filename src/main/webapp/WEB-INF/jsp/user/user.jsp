<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Track Material Design Bootstrap Admin Template</title>

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
    <link rel="stylesheet" href="../../../assets/css/dataTables/dataTables.bootstrap.css">
    <!--<link rel="stylesheet" href="../assets/css/dataTables/style.css">-->
</head>
<body>
<div id="wrapper">
    <jsp:include page="../../../topbar.html"></jsp:include>
    <!--/. NAV TOP  -->
    <!--/. NAV TOP  -->
    <jsp:include page="../../../leftbar.html"></jsp:include>
    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div class="header">
            <h1 class="page-header">
                用户列表
            </h1>
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


            <div class="tab-content">
                <div id="tab-31" class="tab-pane active">

                    <div class="row">
                        <div class="col-md-12">
                            <!-- Advanced Tables -->
                            <div class="card">
                                <div class="card-action">
                                    Advanced Tables
                                </div>
                                <div class="card-content">
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
                                                            <th><img src="${pend.AVATAR}" style="width: 50px;height: 50px"></th>
                                                            <th>${pend.USERNAME}</th>
                                                            <th>${pend.USEREMAIL}</th>
                                                            <th>${pend.GENDER}</th>
                                                            <th>${pend.USERBIRTHDAY}</th>
                                                            <th>${pend.USERADDRESS}</th>
                                                            <th>${pend.USERSIGNATURE}</th>
                                                            <th>${pend.CREATETIME}</th>
                                                            <th>${pend.ROLENAME}</th>
                                                            <th><button>i</button></th>
                                                            <th><button>c</button></th>
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
                </div>


                <div id="tab-32" class="tab-pane">

                    <div class="row">
                        <div class="col-md-12">
                            <!-- Advanced Tables -->
                            <div class="card">
                                <div class="card-action">
                                    Advanced Tables
                                </div>
                                <div class="card-content">
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
                                                    <th><img src="${pub.AVATAR}" style="width: 50px;height: 50px"></th>
                                                    <th>${pub.USERNAME}</th>
                                                    <th>${pub.USEREMAIL}</th>
                                                    <th>${pub.GENDER}</th>
                                                    <th>${pub.USERBIRTHDAY}</th>
                                                    <th>${pub.USERADDRESS}</th>
                                                    <th>${pub.USERSIGNATURE}</th>
                                                    <th>${pub.CREATETIME}</th>
                                                    <th>${pub.ROLENAME}</th>
                                                    <th><button>i</button></th>
                                                    <th><button>c</button></th>
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
                </div>


                <div id="tab-33" class="tab-pane">

                    <div class="row">
                        <div class="col-md-12">
                            <!-- Advanced Tables -->
                            <div class="card">
                                <div class="card-action">
                                    Advanced Tables
                                </div>
                                <div class="card-content">
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
                                                    <th><img src="${it.AVATAR}" style="width: 50px;height: 50px"></th>
                                                    <th>${it.USERNAME}</th>
                                                    <th>${it.USEREMAIL}</th>
                                                    <th>${it.GENDER}</th>
                                                    <th>${it.USERBIRTHDAY}</th>
                                                    <th>${it.USERADDRESS}</th>
                                                    <th>${it.USERSIGNATURE}</th>
                                                    <th>${it.CREATETIME}</th>
                                                    <th>${it.ROLENAME}</th>
                                                    <th><button>i</button></th>
                                                    <th><button>c</button></th>
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
                </div>


                <div id="tab-34" class="tab-pane">

                    <div class="row">
                        <div class="col-md-12">
                            <!-- Advanced Tables -->
                            <div class="card">
                                <div class="card-action">
                                    Advanced Tables
                                </div>
                                <div class="card-content">
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
                                                    <th><img src="${admin.AVATAR}" style="width: 50px;height: 50px"></th>
                                                    <th>${admin.USERNAME}</th>
                                                    <th>${admin.USEREMAIL}</th>
                                                    <th>${admin.GENDER}</th>
                                                    <th>${admin.USERBIRTHDAY}</th>
                                                    <th>${admin.USERADDRESS}</th>
                                                    <th>${admin.USERSIGNATURE}</th>
                                                    <th>${admin.CREATETIME}</th>
                                                    <th>${admin.ROLENAME}</th>
                                                    <th><button>i</button></th>
                                                    <th><button>c</button></th>
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
                </div>

            </div>


            <!-- /. ROW  -->
            <div class="row">
                <div class="col-md-6">
                    <!--   Kitchen Sink -->
                    <div class="card">
                        <div class="card-action">
                            Kitchen Sink
                        </div>
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!-- End  Kitchen Sink -->
                </div>
                <div class="col-md-6">
                    <!--   Basic Table  -->
                    <div class="card">
                        <div class="card-action">
                            Basic Table
                        </div>
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!-- End  Basic Table  -->
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row">
                <div class="col-md-6">
                    <!--    Striped Rows Table  -->
                    <div class="card">
                        <div class="card-action">
                            Striped Rows Table
                        </div>
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table table-striped">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!--  End  Striped Rows Table  -->
                </div>
                <div class="col-md-6">
                    <!--    Bordered Table  -->
                    <div class="card">
                        <div class="card-action">
                            Bordered Table
                        </div>
                        <!-- /.panel-heading -->
                        <div class="card-content">
                            <div class="table-responsive table-bordered">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!--  End  Bordered Table  -->
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row">
                <div class="col-md-6">
                    <!--    Hover Rows  -->
                    <div class="card">
                        <div class="card-action">
                            Hover Rows
                        </div>
                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!-- End  Hover Rows  -->
                </div>
                <div class="col-md-6">
                    <!--    Context Classes  -->
                    <div class="card">

                        <div class="card-action">
                            Context Classes
                        </div>

                        <div class="card-content">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Username</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="success">
                                        <td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td>@mdo</td>
                                    </tr>
                                    <tr class="info">
                                        <td>2</td>
                                        <td>Jacob</td>
                                        <td>Thornton</td>
                                        <td>@fat</td>
                                    </tr>
                                    <tr class="warning">
                                        <td>3</td>
                                        <td>Larry</td>
                                        <td>the Bird</td>
                                        <td>@twitter</td>
                                    </tr>
                                    <tr class="danger">
                                        <td>4</td>
                                        <td>John</td>
                                        <td>Smith</td>
                                        <td>@jsmith</td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <!--  end  Context Classes  -->
                </div>
            </div>
            <!-- /. ROW  -->

            <footer><p>All right reserved. Template by: <a href="http://www.mycodes.net/">WebThemez.com</a></p></footer>
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
    <!-- /. WRAPPER  -->
    <!-- JS Scripts-->


    <!-- jQuery Js -->
    <script src="../../../assets/js/jquery-1.10.2.js"></script>

    <!-- Bootstrap Js -->
    <script src="../../../assets/js/bootstrap.min.js"></script>

    <script src="../../../assets/materialize/js/materialize.min.js"></script>

    <!-- Metis Menu Js -->
    <script src="../../../assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="../../../assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="../../../assets/js/morris/morris.js"></script>


    <script src="../../../assets/js/easypiechart.js"></script>
    <script src="../../../assets/js/easypiechart-data.js"></script>

    <script src="../../../assets/js/Lightweight-Chart/jquery.chart.js"></script>
    <!-- DATA TABLE SCRIPTS -->
    <script src="../../../assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="../../../assets/js/dataTables/dataTables.bootstrap.js"></script>
    <script>
        $(document).ready(function () {
            $('.table.table-striped.table-bordered.table-hover').dataTable();
        });
    </script>
    <!-- Custom Js -->
    <script src="../../../assets/js/custom-scripts.js"></script>
</div>

</body>

</html>
