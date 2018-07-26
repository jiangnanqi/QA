<%@page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>用户信息</title>
    <!-- Bootstrap Styles-->
    <link href="../../assets/css/bootstrap.css" rel="stylesheet"/>
    <link href="../../assets/css/jquery.dataTables.css" rel="stylesheet">
    <!-- FontAwesome Styles-->
    <link href="../../assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- Morris Chart Styles-->
    <%--<link href="../../../assets/js/morris/morris-0.4.3.min.css" rel="stylesheet"/>--%>
    <!-- Custom Styles-->
    <link href="../../assets/css/custom-styles.css" rel="stylesheet"/>
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
            <!-- /. ROW  -->
            <div class="row">
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-green">
                        <div class="panel-body">
                            <i class="fa fa-bar-chart-o fa-5x"></i>
                            <a href="/eventManager"><h3>${eventcount}</h3></a>
                        </div>
                        <div class="panel-footer back-footer-green">
                            待处理事件
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-blue">
                        <div class="panel-body">
                            <i class="fa fa-barcode fa-5x"></i>
                            <a href="/problemManager"><h3>${problemcount} </h3></a>
                        </div>
                        <div class="panel-footer back-footer-blue">
                            待处理问题
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-red">
                        <div class="panel-body">
                            <i class="fa fa fa-comments fa-5x"></i>
                            <a href="/FAQmanager"><h3>${faqcount} </h3></a>
                        </div>
                        <div class="panel-footer back-footer-red">
                            待审核FAQ
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-12 col-xs-12">
                    <div class="panel panel-primary text-center no-boder bg-color-brown">
                        <div class="panel-body">
                            <i class="fa fa-users fa-5x"></i>
                            <a href="/user"><h3>0 </h3></a>
                        </div>
                        <div class="panel-footer back-footer-brown">
                            待审核用户
                        </div>
                    </div>
                </div>
            </div>


            <div class="row" style="height: 400px">


                <div class="col-md-6 col-sm-12 col-xs-12" style="height: 100%">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Bar Chart Example
                        </div>
                        <div class="panel-body">
                            <div id="morris-bar-chart"></div>
                        </div>
                    </div>
                </div>

                <div class="col-md-6 col-sm-12 col-xs-12" style="height: 100%">
                    <div class="panel panel-default" style="height: 100%">
                        <div class="panel-heading">
                            faq分类
                        </div>
                        <div class="panel-body" style="height: 100%">
                            <div id="container" style="height: 100%;width: 100%"></div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="../../assets/js/jquery-1.10.2.js"></script>
<script src="../../assets/js/bootstrap.min.js"></script>
<script src="../../assets/js/jquery.metisMenu.js"></script>
<script src="../../assets/js/custom-scripts.js"></script>
<script src="../../assets/js/custom-scripts.js"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/echarts.min.js"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-gl/echarts-gl.min.js"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts-stat/ecStat.min.js"></script>
<script type="text/javascript"
        src="http://echarts.baidu.com/gallery/vendors/echarts/extension/dataTool.min.js"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/china.js"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/map/js/world.js"></script>
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=ZUONbpqGBsYGXNIYHicvbAbM"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/echarts/extension/bmap.min.js"></script>
<script type="text/javascript" src="http://echarts.baidu.com/gallery/vendors/simplex.js"></script>
<script type="text/javascript">
    var dom = document.getElementById("container");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    var data = genData(50);

    option = {

        tooltip: {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            type: 'scroll',
            orient: 'vertical',
            right: 10,
            top: 20,
            bottom: 20,
            data: data.legendData,

            selected: data.selected
        },
        series: [
            {
                name: '姓名',
                type: 'pie',
                radius: '70%',
                center: ['40%', '50%'],
                data: data.seriesData,
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };


    function genData(count) {
        // var legendData = [];
        // $.ajax({
        //     type:"post",
        //     url:"/classfiy/getclassify",
        //     success:function (data) {
        //         for(var i=0;i<data.length;i++){
        //             legendData.push(data[i]['faqclassifyname']);
        //         }
        //     },
        //     error:function (data) {
        //         alert("aaaaaaaaaa");
        //         alert("error");
        //     }
        // });
        //
        // var seriesData = [];
        // $.ajax({
        //     type: "post",
        //     url: "/faqclassifyall",
        //     success: function (data) {
        //         for (var i = 0; i < legendData.length; i++) {
        //             var d = {name: legendData[i], value: data[legendData[i]]};
        //             seriesData.push(d);
        //         }
        //     },
        //     error: function (data) {
        //         alert("aaaaaaaaaa");
        //         alert("error");
        //     }
        // });

        var legendData = ["烟草运维", "影音配置", "BIOS", "操作系统", "第三方软件", "显示故障", "驱动程序帮助", "一键恢复", "随机软件", "病毒与安全", "上网问题", "设备应用", "显卡切换与调试"];
        var seriesData = [
            {name: "烟草运维", value: 11},
            {name: "影音配置", value: 108},
            {name: "BIOS", value: 521},
            {name: "操作系统", value: 3957},
            {name: "第三方软件", value: 413},
            {name: "显示故障", value: 103},
            {name: "驱动程序帮助", value: 830},
            {name: "一键恢复", value: 181},
            {name: "随机软件", value: 2207},
            {name: "病毒与安全", value: 201},
            {name: "上网问题", value: 631},
            {name: "设备应用", value: 3486},
            {name: "显卡切换与调试", value: 147}
        ];
        // var seriesData = [
        //     {name: "柏凤戚·喻鲍", value: 1},
        //     {name: "危陈·费", value: 96142},
        //     {name: "强吴路", value: 81164},
        //     {name: "尹费茅", value: 10494},
        //     {name: "项戚", value: 16856},
        //
        // ];
        console.log(seriesData);
        console.log(legendData);

        var selected = {};

        return {
            legendData: legendData,
            seriesData: seriesData,
            selected: selected
        };

    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
</script>

</body>
</html>
