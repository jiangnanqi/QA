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
    <%--<jsp:include page="/topbar.html"/>--%>
    <%--<jsp:include page="/leftbar.html"/>--%>
        <%@include file="/topbar.html"%>
        <%@include file="/leftbar.html"%>
    <div id="page-wrapper">
        <div id="page-inner">
            <div class="panel panel-default">
                <div class="row">
                    <div class="col-md-12">

                        <!-- 展示信息 -->
                        <div class="panel-body" style="display: block" id="subinfo">
                            <form method="get" class="form-horizontal">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">问题标题</label>

                                    <div class="col-sm-10">
                                        <p class="form-control-static">${problemView.problemTitle}</p>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">提问内容</label>

                                    <div class="col-sm-10">
                                        <p class="form-control-static">${problemView.problemContent}</p>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">问题类别</label>

                                    <div class="col-sm-10">
                                        <p class="form-control-static">${problemView.problemClassifyName}</p>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">提问用户</label>

                                    <div class="col-sm-10">
                                        <p class="form-control-static">${problemView.problemUserName}</p>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">提问时间</label>

                                    <div class="col-sm-10">
                                        <p class="form-control-static">${problemView.problemTime}</p>
                                    </div>
                                </div>
                                

                            </form>


                            <div class="col-sm-4 col-sm-offset-2">
                                <button class="btn btn-primary" onclick="window.history.back(-1)">返回</button>
                            </div>


                        </div>

                        <%--编辑信息--%>
                        <div class="panel-body" style="display: block" id="subinfo">

                        </div>
                    </div>
                </div>
            </div>
            <!--End Advanced Tables -->
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
