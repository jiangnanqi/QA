<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>faq管理</title>
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
    <link href="../../../assets/css/bootstrap-select.css" rel="stylesheet">
</head>
<body>
<div id="wrapper">
    <%--<jsp:include page="/topbar.html"></jsp:include>--%>
    <%--<jsp:include page="/leftbar.html"></jsp:include>--%>
        <%@include file="/topbar.html"%>
        <%@include file="/leftbar.html"%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-md-12">
                <h1 class="page-header">
                    faq管理
                </h1>
            </div>
        </div>

        <div id="page-inner">

            <div class="row">
                <div class="col-sm-6" style="width: 100%;">
                    <div class="tabs-container">
                        <ul class="nav nav-tabs">
                            <li class="active"><a data-toggle="tab" href="#tab-31" aria-expanded="true">所有FAQ</a></li>
                            <li class=""><a data-toggle="tab" href="#tab-32" aria-expanded="false">待审核FAQ</a></li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="panel panel-default">
                <div class="tab-content">

                    <div id="tab-31" class="tab-pane active">
                        <div class="panel-body">
                            <div class="col-sm-9 control-label">faq信息列表</div>
                            <div class="col-sm-3 form-group">
                                <label>选择分类</label>
                                <select id="classity1" class="" onchange="modifyTable()">

                                </select>
                            </div>
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="tableallfaq">
                                    <thead>
                                    <tr>
                                    <tr>
                                        <th>序号</th>
                                        <th>FAQ名称</th>
                                        <th>提交用户</th>
                                        <th>删除</th>
                                        <th>详情</th>
                                    </tr>
                                    </tr>
                                    </thead>
                                    <tbody></tbody>
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
                                        <th>FAQ名称</th>
                                        <th>FAQ分类名</th>
                                        <th>FAQ答案</th>
                                        <th>提交用户</th>
                                        <th>提交时间</th>
                                        <th>审核</th>
                                        <th>操作</th>
                                        <th>更多详情</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <c:forEach var="faqview" items="${faqListUnDeal}" varStatus="i">
                                        <tr class="odd gradeX">
                                            <td>${i.count}</td>
                                            <td>${faqview.FAQTITLE}</td>
                                            <td>${faqview.FAQCLASSIFYName}</td>
                                            <td>${faqview.faqAnswer}</td>
                                            <td>${faqview.USERNAME}</td>
                                            <td>${faqview.MODIFYTIME}</td>
                                            <td><a href="#" onclick="approveFaq('${faqview.FAQQUESTIONID}')">通过</a></td>
                                            <td><a id="${faqview.FAQQUESTIONID}" href="#" onclick="deletefaq(this)">删除</a></td>
                                            <td>
                                                <button id="${faqview.FAQQUESTIONID}" class="btn btn-white btn-sm" type="button" data-toggle="modal"
                                                        data-target="#showModal"
                                                        onclick="showInfo(this)"><i
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



            <div class="modal fade" id="showModal" tabindex="-1" role="dialog" aria-labelledby="myModelLabel"
                 aria-hidden="true">
                <div class="modal-dialog" style="width: 60%">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title" id="myModalLabel">更多信息</h4>
                        </div>
                        <div class="modal-body">

                            <div class="form-group" style="display: none">
                                <div class="col-sm-8">
                                    <input id="modalfaqquestionid" name="editPermissionId" minlength="2" type="text"
                                           class="form-control" aria-required="true">
                                </div>
                            </div>
                            <form class="form-horizontal" id="editModalForm">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">FAQ名称:</label>
                                    <label class="control-label" id="modalfaqname"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">FAQ分类名:</label>
                                    <label class="control-label" id="modalclassifyname"></label>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">FAQ答案:</label>
                                    <%--<label class="control-label" id="modalfaqanswer"></label>--%>
                                    <p class="form-control-static" id="modalfaqanswer"></p>
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
        $.ajax({
            type:"post",
            url:"/classfiy/getclassify",
            success:function (data) {
                console.log(data[0]["faqclassifyid"])
                for(var i=0;i<data.length;i++){
                    // alert("<option value='"+data[i]['faqclassifyid']+"'>"+data[i]['faqclassifyname']+"</option>");
                    $("#classity1").append("<option value='"+data[i]['faqclassifyid']+"'>"+data[i]['faqclassifyname']+"</option>");
                }
            },
            error:function (data) {
                alert("aaaaaaaaaa");
                alert("error");
            }
        });


        // alert($("#classity1").find("option:selected").val());

        $.ajax({
            type:"post",
            url:"/getFaqList",
            data:{
              "id":"016db053-b29c-44f9-875b-960b29ead9f2"
            },
            success:function (data) {
                console.log(data);

                for(var i=0;i<data.length;i++){
                    var tr = document.createElement("tr");
                    var tdindex = document.createElement("td");
                    tdindex.innerHTML = ""+(i+1);
                    var tdname = document.createElement("td");
                    tdname.innerHTML = data[i]['faqtitle'];
                    var tduser = document.createElement("td");
                    tduser.innerHTML = data[i]['username'];
                    var deleteindex = document.createElement('td');

                    var id = data[i]['faqquestionid'];

                    deleteindex.innerHTML = '<button id='+id+' class="btn btn-white btn-sm" type="button" onclick="deletefaq(this);">\n' +
                        '                        <i class="glyphicon glyphicon-trash"></i>\n' +
                        '                        </button>';
                    var showindex = document.createElement("td");
                    showindex.innerHTML = '<button id='+id+' class="btn btn-white btn-sm" data-toggle="modal" data-target="#showModal"  type="button" onclick="showInfo(this);">\n' +
                        '                        <i class="glyphicon glyphicon-eye-open"></i>\n' +
                        '                        </button>';

                    tr.appendChild(tdindex);
                    tr.appendChild(tdname);
                    tr.appendChild(tduser);
                    tr.appendChild(deleteindex);
                    tr.appendChild(showindex);

                    $('#tableallfaq>tbody').append(tr);
                }

                table = $('.table.table-striped.table-bordered.table-hover').dataTable({
                    "searching":false
                });
            },
            error:function (data) {
                alert("error1");
            }
        });
    });
    function deletefaq(obj) {
        // alert("hahahah");
        var id = $(obj).attr("id");
        var present_row = event.target.parentNode.parentNode;
        // alert(id);
        if (confirm("确认删除吗？")) {
            $.ajax({
                type: "post",
                url: "/deleteFaqById",
                data: {
                    "id": id
                },
                dataType: "text",
                success: function (data) {
                    // alert(data);
                    alert("success");
                    present_row.remove();
                },
                error: function (data) {
                    alert("aaaaaaaaaa");
                    alert("error");
                }
            });
            // alert(id)
        }
    }


    function showInfo(obj) {
        // alert("hahahah");
        var id = $(obj).attr("id");
        // alert(id);
        $.ajax({
            type:"post",
            url:"/showInfoFaq",
            data:{
                "id":id
            },
            success:function (data) {
               console.log(data)
               // console.log(data['faqanswername']);
               $('#modalfaqname').text(data['faqtitle']);
               $('#modalclassifyname').text(data['faqclassifyname']);
               $('#modalfaqanswer').html(data['faqanswername']);

            },
            error:function (data) {
                alert("aaaaaaaaaa");
                alert("error");
            }
        });

    }


    function modifyTable() {
        var topClassifyId = $('#classity1>option:selected').val();
        $.ajax({
            type:"post",
            url:"/getFaqList",
            data:{
                "id":topClassifyId
            },
            success:function (data) {
                // console.log(data);
                table.fnDestroy();
                $('#tableallfaq>tbody').html("");
                for(var i=0;i<data.length;i++){
                    var tr = document.createElement("tr");


                    var tdindex = document.createElement("td");
                    tdindex.innerHTML = ""+(i+1);
                    var tdname = document.createElement("td");
                    tdname.innerHTML = data[i]['faqtitle'];
                    var tduser = document.createElement("td");
                    tduser.innerHTML = data[i]['username'];
                    var deleteindex = document.createElement('td');

                    var id = data[i]['faqquestionid'];

                    deleteindex.innerHTML = '<button id='+id+' class="btn btn-white btn-sm" type="button" onclick="deletefaq(this);">\n' +
                        '                        <i class="glyphicon glyphicon-trash"></i>\n' +
                        '                        </button>';
                    var showindex = document.createElement("td");
                    showindex.innerHTML = '<button id='+id+' class="btn btn-white btn-sm" data-toggle="modal" data-target="#showModal"  type="button" onclick="showInfo(this);">\n' +
                        '                        <i class="glyphicon glyphicon-eye-open"></i>\n' +
                        '                        </button>';

                    tr.appendChild(tdindex);
                    tr.appendChild(tdname);
                    tr.appendChild(tduser);
                    tr.appendChild(deleteindex);
                    tr.appendChild(showindex);

                    $('#tableallfaq tbody').append(tr);
                }

                $('#tableallfaq').dataTable({
                    "searching":false
                });
            },
            error:function (data) {
                alert("aaaaaaaaaa");
                alert("error");
            }
        });
    }


    function approveFaq(id) {
        var present_row = event.target.parentNode.parentNode;
        console.log(present_row);

        $.ajax({
            type:"post",
            url:"/updateFaqState",
            data:{
                "id":id
            },
            dataType:"text",
            success:function (data) {
                console.log(data);
                alert("success");
                present_row.remove();
            },
            error:function (data) {
                alert("aaaaaaaaaa");
                alert("error");
            }
        });
    }
</script>
<script type="text/javascript">

</script>

<script src="../../../assets/js/bootstrap-select.js"></script>
<script>
    $('.selectpicker').selectpicker({
        size:6
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
