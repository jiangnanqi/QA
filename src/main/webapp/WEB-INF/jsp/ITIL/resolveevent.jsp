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

                        <!-- 编辑信息 -->
                        <div class="panel-body" style="display: none" id="editInfo">
                            <form method="" class="form-horizontal"  action="">
                                <div class="form-group" style="display: none;">
                                    <div class="col-sm-10">
                                        <input type="text" name="UserName" class="form-control"  required="required" value="${event_answerView.USERQUESTIONID}" id="questionId" readonly="readonly">
                                    </div>
                                </div>


                                <div class="form-group">
                                    <span class="col-sm-2 control-label">问题标题</span>

                                    <div class="col-sm-10">
                                        <input type="text"  class="form-control"  aria-required="true"  required="required" value="${event_answerView.QUESTIONTITLE}" id="title" style="width: 80%;float: left;">
                                        <div class="validate_faqadd spa1"></div>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>


                                <div class="form-group">
                                    <label class="col-sm-2 control-label">关键字</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" id="keywords"  placeholder="在输入多个关键词时请使用半角逗号间隔" style="width: 80%;float: left;" >
                                        <div class="validate_faqadd spa3"></div>
                                    </div>
                                </div>
                                <div class="hr-line-dashed "></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">分类</label>

                                    <div class="col-sm-10">
                                        <select class="select" id="specialCategoryId" onchange="selectSecondChild()" style="height: 35px;width: 180px"></select>
                                        <select class="select" id="subspecialCategoryId" name="classifyName" style="height: 35px;width: 180px"></select>
                                        <div class="validate_faqadd spa4"></div>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">摘要说明</label>
                                    <div class="col-sm-10">
                                        <textarea class="form-control" id="description" style="width: 80%;height: 60px;float: left;" ></textarea>
                                        <div class="validate_faqadd spa5"></div>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group">
                                    <label class="col-sm-2 control-label">问题答案</label>

                                    <div class="col-sm-10" id="faqcontent">
                                        <p>${event_answerView.FAQANSWER}</p>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>
                            </form>

                            <div class="col-sm-4 col-sm-offset-2" id="f5725af1-0da8-4a3e-949d-6d9a47f45fe5">
                                <button class="btn btn-primary" onclick="window.history.back(-1)">返回</button>
                                <input  class="btn btn-primary" value="完成" id="sub" type="submit">
                            </div>



                        </div>

                        <%--显示信息--%>
                        <div class="panel-body" style="display: block" id="subinfo">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">问题标题</label>
                                <div class="col-sm-10">
                                    <p class="form-control-static" >${event_answerView.QUESTIONTITLE}</p>
                                </div>
                            </div>
                            <div class="hr-line-dashed"></div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label"提问用户></label>

                                <div class="col-sm-10">
                                    <p class="form-control-static">${event_answerView.USERNAME}</p>
                                </div>
                            </div>
                            <div class="hr-line-dashed"></div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">提问时间</label>

                                <div class="col-sm-10">
                                    <p class="form-control-static">${event_answerView.QUESTIONTIME}</p>
                                </div>
                            </div>
                            <div class="hr-line-dashed"></div>

                            <div class="form-group">
                                <label class="col-sm-2 control-label">问题答案</label>

                                <div class="col-sm-10">
                                    <p class="form-control-static">${event_answerView.FAQANSWER}</p>
                                </div>
                            </div>
                            <div class="hr-line-dashed"></div>

                            </form>
                            <div class="col-sm-4 col-sm-offset-2">
                                <button class="btn btn-primary" onclick="window.history.back(-1)">返回</button>
                                <input class="btn btn-primary" value="添加至知识库" id="addfaq" onclick="addfaq()" />
                            </div>

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


<script>
    $(document).ready(function () {
        $.ajax({
            type: "post",
            url: "/classfiy/getclassify",
            success: function (data) {
                console.log(data[0]["faqclassifyid"])
                for (var i = 0; i < data.length; i++) {
                    // alert("<option value='"+data[i]['faqclassifyid']+"'>"+data[i]['faqclassifyname']+"</option>");
                    $("#specialCategoryId").append("<option value='" + data[i]['faqclassifyid'] + "'>" + data[i]['faqclassifyname'] + "</option>");
                }
            },
            error: function (data) {
                alert("aaaaaaaaaa");
                alert("error");
            }
        });
    })

    function selectSecondChild() {
        var id = $('#specialCategoryId>option:selected').val();
        $.ajax({
            type: "post",
            url: "/classfiy/getclassifysecond",
            data:{
              "topid":id
            },
            success: function (data) {
                // console.log(data[0]["faqclassifyid"])
                $('#subspecialCategoryId').html("");
                for (var i = 0; i < data.length; i++) {
                    // alert("<option value='"+data[i]['faqclassifyid']+"'>"+data[i]['faqclassifyname']+"</option>");
                    $("#subspecialCategoryId").append("<option value='" + data[i]['faqclassifyid'] + "'>" + data[i]['faqclassifyname'] + "</option>");
                }
            },
            error: function (data) {
                alert("aaaaaaaaaa");
                alert("error");
            }
        });
    }

    function addfaq() {
        $('#subinfo').css("display",'none');
        $('#editInfo').css("display","block");
    }
</script>

</body>

</html>
