<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>企业注册列表</title>
<link rel="stylesheet" href="lib/zTree/v3/css/zTreeStyle/zTreeStyle.css" type="text/css">
</head>
<body class="pos-r">

<div>
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 企业管理 <span class="c-gray en">&gt;</span> 企业注册列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
	<div class="page-container">
	<form action="BusinessInfoServlet.do?op=list" method="post" id="myForm">
	<input type="hidden" name="index" id="index" value="1"/> 
		<div class="text-c">  
			<input type="text" name="name" id="" placeholder="公司简称" style="width:250px" class="input-text" value="${param.name }">
			<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
			 <a href="gindex.jsp" ><input class="btn btn-primary radius" type="button"value="&nbsp;&nbsp;返回&nbsp;&nbsp;"></a>
		</div>
		</form>
		<div class="mt-20">
			<table class="table table-border table-bordered table-bg table-hover table-sort">
				<thead>
					<tr class="text-c">
						<th width="110">企业用户编号</th>
						<th width="60">企业用户名</th>
						<!-- <th width="80">登陆密码</th>-->
						<th width="210">公司名称</th>
						<th width="70">公司简称</th>
						<th width="70">公司网址</th>
						<th width="100">公司所在城市</th>
						<th width="100">公司类型</th>
						<th width="70">行业类型</th>
						<th width="80">公司规模</th>
						<th width="120">公司发展阶段</th>
						<th width="90">公司创始人</th>
						<th width="90">当前职务</th>
						<th width="70">公司产品</th>
						<th width="70">公司营业执照地址</th>
                      <!--    <th width="40">状态</th>
						<th width="90">操作</th>-->
					</tr>
				</thead>
				<tbody>
				<c:forEach var="b" items="${page.list }">
					<tr class="text-c va-m">
						<td>${b.buId }</td>
						<td>${b.buLoginName }</td>
						<!--  <td class="text-l">${b.buPwd }</td>-->
                        <td class="text-l">${b.buName }</td>
                        <td class="text-l">${b.bujName }</td>
                        <td class="text-l"><a href="${b.buHomePage }"> ${b.buHomePage }</a></td>
                        <td class="text-l">${b.buCity }</td>
                        <td class="text-l">${b.buType }</td>
                        <td class="text-l">${b.buBigJob }</td>
                        <td class="text-l">${b.buSize }</td>
                        <td class="text-l">${b.buDevelopment }</td>
						<td class="text-l">${b.orName }</td>
                        <td class="text-l">${b.orJob }</td>
						<td class="text-l">${b.prName }</td>
						<td class="text-l">${b.buPicture}</td>
						<!--  <td class="td-status"><span class="label label-success radius">已发布</span></td>
						<td class="td-manage"><a style="text-decoration:none" onClick="product_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_edit('产品编辑','product-add.html','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="product_del(this,'10001')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>-->
					</tr>
					</c:forEach>
				</tbody>
			</table>
	<!-- 分页 -->
    <div align="center">
      <c:if test="${page.pageIndex>1 }">
         <a href="javascript:topage(1)">首页</a>
         <a href="javascript:topage(${page.pageIndex-1 })">上一页</a>
      </c:if>
      <c:if test="${page.pageIndex<page.totalPage }">
         <a href="javascript:topage(${page.pageIndex+1 })">下一页</a>
         <a href="javascript:topage(${page.totalPage})">末页</a>
      </c:if>
      第${page.pageIndex }页/共${page.totalPage }页
      </div>
		</div>
	</div>
</div>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
var setting = {
	view: {
		dblClickExpand: false,
		showLine: false,
		selectedMulti: false
	},
	data: {
		simpleData: {
			enable:true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: ""
		}
	},
	callback: {
		beforeClick: function(treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("tree");
			if (treeNode.isParent) {
				zTree.expandNode(treeNode);
				return false;
			} else {
				//demoIframe.attr("src",treeNode.file + ".html");
				return true;
			}
		}
	}
};
//跳转方法
    function topage(index){
       //给隐藏域赋值
         $("#index").val(index);
         //表单提交
         $("form").submit();
        }

/*var zNodes =[
	{ id:1, pId:0, name:"一级分类", open:true},
	{ id:11, pId:1, name:"二级分类"},
	{ id:111, pId:11, name:"三级分类"},
	{ id:112, pId:11, name:"三级分类"},
	{ id:113, pId:11, name:"三级分类"},
	{ id:114, pId:11, name:"三级分类"},
	{ id:115, pId:11, name:"三级分类"},
	{ id:12, pId:1, name:"二级分类 1-2"},
	{ id:121, pId:12, name:"三级分类 1-2-1"},
	{ id:122, pId:12, name:"三级分类 1-2-2"},
];*/
		
		
		
$(document).ready(function(){
	var t = $("#treeDemo");
	t = $.fn.zTree.init(t, setting, zNodes);
	//demoIframe = $("#testIframe");
	//demoIframe.on("load", loadReady);
	var zTree = $.fn.zTree.getZTreeObj("tree");
	//zTree.selectNode(zTree.getNodeByParam("id",'11'));
});

/*$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  {"orderable":false,"aTargets":[0,7]}// 制定列不参与排序
	]
});*/
/*产品-添加*/
function product_add(title,url){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-查看*/
function product_show(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*产品-审核*/
function product_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="product_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}
/*产品-下架*/
function product_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}

/*产品-发布*/
function product_start(obj,id){
	layer.confirm('确认要发布吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布!',{icon: 6,time:1000});
	});
}

/*产品-申请上线*/
function product_shenqing(obj,id){
	$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
	$(obj).parents("tr").find(".td-manage").html("");
	layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
}

/*产品-编辑*/
function product_edit(title,url,id){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}

/*产品-删除*/
function product_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").remove();
				layer.msg('已删除!',{icon:1,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});		
	});
}
</script>
</body>
</html>