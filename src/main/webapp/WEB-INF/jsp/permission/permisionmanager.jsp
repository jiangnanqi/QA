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
    <%--<jsp:include page="/topbar.html"></jsp:include>--%>
    <%--<jsp:include page="/leftbar.html"></jsp:include>--%>
    <%@include file="/topbar.html" %>
    <%@include file="/leftbar.html" %>
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-header">
                        权限分配
                    </h1>
                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="form-group">
                                <label>选择用户</label>
                                <select class="form-control" id="roleselect">
                                    <c:forEach items="${allRole}" var="role">
                                        <option value="${role.roleid}">${role.rolename}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
                                            <label>未选择</label>
                                            <select multiple="multiple" class="form-control" id="left">
                                                <c:forEach items="${permissionList}" var="list">
                                                    <option value="${list.permissionId}">${list.permissionLogicName}</option>
                                                </c:forEach>
                                            </select>
                                        </div>
                                        <button type="button" class="btn btn-default" id="selectOneToRight">&gt;&gt;
                                        </button>

                                        <button type="button" class="btn btn-default" id="selectAllToRight">
                                            &gt;&gt;&gt;
                                        </button>
                                    </form>
                                </div>

                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
                                            <label>已选择</label>
                                            <select multiple="multiple" class="form-control" id="right">

                                            </select>
                                        </div>
                                        <button type="button" class="btn btn-default" id="selectOneToLeft">&lt;&lt;
                                        </button>

                                        <button type="button" class="btn btn-default" id="selectAllToLeft">
                                            &lt;&lt;&lt;
                                        </button>
                                    </form>
                                </div>

                                <div class="row">
                                    <div class="col-lg-10"></div>
                                    <div class="con-lg-2">
                                        <button class="btn btn-primary" onclick="submitPrimission()">提交</button>
                                    </div>
                                </div>

                            </div>
                        </div>

                    </div>
                </div>

            </div>


        </div>
    </div>
</div>


<script src="../../../assets/js/jquery-1.10.2.js"></script>
<script src="../../../assets/js/bootstrap.min.js"></script>
<script src="../../../assets/js/jquery.metisMenu.js"></script>
<script src="../../../assets/js/custom-scripts.js"></script>
<script src="../../../assets/js/custom-scripts.js"></script>
<script>
    $(function () {
        /*1.选中单击去右边*/
        $("#selectOneToRight").click(function () {
            $("#left option:selected").appendTo($("#right"));
        });

        /*2.单击全部去右边*/
        $("#selectAllToRight").click(function () {
            $("#left option").appendTo($("#right"));
        });

        /*3.选中双击去右边*/
        $("#left option").dblclick(function () {
            $("#left option:selected").appendTo($("#right"));
        });

        $('#selectOneToLeft').click(function () {
            $("#right option:selected").appendTo($("#left"))
        });

        $("#selectAllToLeft").click(function () {
            $("#right option").appendTo($("#left"));
        });

        $("#right option").dblclick(function () {
            $("#right option:selected").appendTo($("#left"));
        });


        $('#roleselect').change(function () {
            var roleid = $('#roleselect>option:selected').val();
            $.ajax({
                type: "post",
                url: "/getPermissionByRole",
                data: {
                    "roleid":roleid
                },
                success: function (data) {
                    console.log(data);
                    $('#left').html("");
                    $('#right').html("");
                    for(var i=0;i<data[0].length;i++){
                        $('#left').append('<option value='+data[0][i]['permissionId']+'>'+data[0][i]['permissionLogicName']+'</option>')
                    }
                    for(var i=0;i<data[1].length;i++){
                        $('#right').append('<option value='+data[1][i]['permissionId']+'>'+data[1][i]['permissionLogicName']+'</option>')
                    }
                },
                error: function (data) {
                    alert("error")
                }
            });
        })

    });


    function submitPrimission() {
        var roleid = $('#roleselect>option:selected').val();
        var options = $('#right>option');
        var values = [];
        values.push(roleid);
        for (var i = 0; i < options.length; i++) {
            values.push(options[i]['value']);
        }
        $.ajax({
            type: "post",
            url: "/resetpermission",
            data: JSON.stringify(values),
            contentType:"application/json",
            success: function (data) {
                // alert(data);
                // alert("重置成功");
                // window.location.reload();
                alert("分配成功");
                window.location.reload();
            },
            error: function (data) {
                alert("error")
            }
        });
    }
</script>


</body>
</html>
