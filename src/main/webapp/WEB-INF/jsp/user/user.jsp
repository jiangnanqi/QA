<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>用户信息</title>
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
                                            <td>
                                                <button>i</button>
                                            </td>
                                            <td>
                                                <button>c</button>
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
                                        <th>操作</th>
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
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#modalModifyRole"
                                                        onclick="modifyRole('${pub.USERID}')"><i
                                                        class="glyphicon glyphicon-pencil"></i></button>

                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#showModal"
                                                        onclick="showUser(this)"><i
                                                        class="glyphicon glyphicon-eye-open"></i></button>
                                            </td>
                                            <td>
                                                <button class="btn btn-white btn-md" type="button" onclick="resetPassword('${pub.USERID}')">重置密码</button>
                                            </td>
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
                                <table class="table table-bordered">
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
                                        <th>详细信息</th>
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
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#modalModifyRole"
                                                        onclick="modifyRole('${it.USERID}')"><i
                                                        class="glyphicon glyphicon-pencil"></i></button>
                                            </td>
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#showModal"
                                                        onclick="showUser(this)"><i
                                                        class="glyphicon glyphicon-eye-open"></i></button>
                                            </td>
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
                                        <th>详细信息</th>
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
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#modalModifyRole"
                                                        onclick="modifyRole('${admin.USERID}')"><i
                                                        class="glyphicon glyphicon-pencil"></i></button>
                                            </td>
                                            <td>
                                                <button class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#showModal"
                                                        onclick="showUser(this)"><i
                                                        class="glyphicon glyphicon-eye-open"></i></button>
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


            <div class="modal fade" id="modalModifyRole" tabindex="-1" role="dialog" aria-labelledby="myModelLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            </button>
                            <h4 class="modal-title" id="myModalLabel1">为该用户分配权限</h4>
                        </div>
                        <div class="modal-body">
                            <form class="form-horizontal" id="addModalForm">
                                <div>
                                    <input id="hiddenid" aria-hidden="true" style="display: none" value="">
                                    <table style="text-align: center;width: 87%" class="table tab-bordered" id="roles">
                                        <thead>
                                        <th style="text-align: center">角色名</th>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>

                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="submitModity()">
                                提交
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>


            <div class="modal fade" id="showModal" tabindex="-1" role="dialog" aria-labelledby="myModelLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title" id="myModalLabel">详细信息</h4>
                        </div>
                        <div class="modal-body">

                            <div class="form-group" style="display: none">
                                <div class="col-sm-8">
                                    <input id="editPermissionId" name="editPermissionId" minlength="2" type="text"
                                           class="form-control" aria-required="true">
                                </div>
                            </div>
                            <form class="form-horizontal" id="editModalForm">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">用户名:</label>
                                    <label class="control-label" id="modaluser"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">用户邮箱</label>
                                    <label class="control-label" id="modalmail"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">性别</label>
                                    <label class="control-label" id="modalsex"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">出生日期</label>
                                    <label class="control-label" id="modalbirthday"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">地址</label>
                                    <label class="control-label" id="modaladdress"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">用户签名</label>
                                    <label class="control-label" id="modalsignature"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">注册时间</label>
                                    <label class="control-label" id="modalcreatetime"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">角色名称</label>
                                    <label class="control-label" id="modalrolename"></label>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
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


    function resetPassword(id) {
        if (confirm("确认重置密码？")) {
            $.ajax({
                type: "post",
                url: "/resetPassword",
                data: {
                    "id": id
                },
                dataType: "text",
                success: function (data) {
                    // alert(data);
                    alert("重置成功");
                    window.location.reload();
                },
                error: function (data) {
                    alert("error")
                }
            })
        }

    }

    function modifyRole(id) {
        $('#hiddenid').val(id);
        $.ajax({
            type: "post",
            url: "/roleSelectAll",
            dataType: "json",
            success: function (data) {
                // alert("success");
                console.log(data);
                $('#roles tbody').html("");
                for (var i = 0; i < data.length; i++) {
                    $('#roles tbody').append('<tr><td><input type="radio" name="role" value="' + data[i]['roleid'] + '" />' + data[i]['rolename'] + '</td></tr>')
                }
            },
            error: function (data) {
                alert("error");
            }
        });
    }


    function submitModity() {
        var roleid = $("input[name='role']:checked").val();
        var userid = $("#hiddenid").val();
        alert(userid);
        $.ajax({
            type: "post",
            url: "/updateUserRole",
            data: {
                "userid": userid,
                "roleid": roleid
            },
            dataType: "text",
            success: function (data) {
                alert(data)
                alert(typeof data)
                // alert("success");
                alert("修改成功");
                window.location.reload();
            },
            error: function (data) {
                alert("error");
            }
        });
    }

    function showUser(obj) {
        var trlabel = obj.parentNode.parentNode;
        $('#modaluser').text($(trlabel).find('td').eq(1).text());
        $('#modalmail').text($(trlabel).find('td').eq(2).text());
        $('#modalsex').text($(trlabel).find('td').eq(3).text());
        $('#modalbirthday').text($(trlabel).find('td').eq(4).text());
        $('#modaladdress').text($(trlabel).find('td').eq(5).text());
        $('#modalsignature').text($(trlabel).find('td').eq(6).text());
        $('#modalcreatetime').text($(trlabel).find('td').eq(7).text());
        $('#modalrolename').text($(trlabel).find('td').eq(8).text());
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
