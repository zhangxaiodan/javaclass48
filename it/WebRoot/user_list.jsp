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
<title>用户管理</title>

<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	
	$(function(){
      //查询
		$.ajax({
		url:"UserServlet.do",
		type:"get",
		data:"op=list",
		dataType:"json",
		success:function(result){
			alert(result);
			var tbody="";
			for(var i=0;i<result.length;i++){
				tbody+="<tr><td>"+result[i].uiLoginName+"</td><td>"+result[i].uiPwd+
				"</td><td>"+result[i].uiName+"</td><td>"+result[i].uiSex+"</td><td>"+result[i].uiBirthday+"</td><td>"+result[i].uiPhone+
				"</td><td>"+result[i].uiEmail+"</td><td>"+result[i].uiiDentification+"</td><td>"+result[i].uiAddress+"</td></tr>";
			}
			$("#tbody").html(tbody);
		}
		});
});
$(document).ready(function(){
	$("#sub").submit();
});
		

</script>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 用户中心 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<form action="UserServlet.do?op=list" method="post" id="form">
<div class="page-container">
	<div class="text-c"> 
		<input type="hidden" name="index" id="index" value="1"/>
		<input type="text" class="input-text" style="width:250px" placeholder="输入姓名" id="" name="name" value="${param.name }">
		<button type="submit" class="btn btn-success radius" id="sub" name=""><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
		 <a href="gindex.jsp" ><input class="btn btn-primary radius" type="button"value="&nbsp;&nbsp;返回&nbsp;&nbsp;"></a>
	</div>
	</form>
	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> </span> <span class="r">共有数据：<strong>${page.totalCount }</strong> 条</span> </div>
	<div class="mt-20">
	<table class="table table-border table-bordered table-hover table-bg table-sort">
		<thead>
			<tr class="text-c">
				<th width="25"><input type="checkbox" name="" value=""></th>
				<th width="80">注册编号</th>
				<th width="80">用户名</th>
				<!--  <th width="70">密码</th>-->
				<th width="90">姓名</th>
				<th width="150">性别</th>
				<th width="100">出生日期</th>
				<th width="130">手机号码</th>
				<th width="170">电子邮箱</th>
				<th width="170">身份证号</th>
				<th width="70">住址</th>
				<th width="70">图片地址</th>
				<!--  <th width="100">状态</th>
				<th width="100">操作</th>-->
			</tr>
		</thead>
		<tbody>
		<c:forEach var="u" items="${page.list }">
		<tr class="text-c">
				<td><input type="checkbox" value="1" name=""></td>
				<td>${u.uiId }</td>
				<td>${u.uiLoginName }</td>
				<!--<td>${u.uiPwd }</td>-->
				<td>${u.uiName }</td>
				<td>${u.uiSex }</td>
				<td class="text-l">${u.uiBirthday }</td>
				<td>${u.uiPhone }</td>
				<td>${u.uiEmail }</td>
				<td>${u.uiiDentification }</td>
				<td>${u.uiAddress }</td>
				<td>${u.uiPicture }</td>
				<!--  <td class="td-status"><span class="label label-success radius">已启用</span></td>
				<td class="td-manage"><a style="text-decoration:none" onClick="member_stop(this,'10001')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> </td>-->
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

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script> 
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	//$('.table-sort').dataTable({
	//	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	//	"bStateSave": true,//状态保存
	//	"aoColumnDefs": [
	//	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	//	  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
	//	]
	//});
	
});

 //跳转方法
    function topage(index){
       //给隐藏域赋值
         $("#index").val(index);
         //表单提交
         $("form").submit();
        }
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*用户-停用*/
function member_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//$.ajax({
		//	type: 'POST',
		//	url: '',
		//	dataType: 'json',
		//	success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="Hui-iconfont">&#xe6e1;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已停用</span>');
				$(obj).remove();
				layer.msg('已停用!',{icon: 5,time:1000});
			////},
			//error:function(data) {
			//	console.log(data.msg);
			//},
		});		
	//});
}

/*用户-启用*/
function member_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		$.ajax({
			type: 'POST',
			url: '',
			dataType: 'json',
			success: function(data){
				$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a>');
				$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
				$(obj).remove();
				layer.msg('已启用!',{icon: 6,time:1000});
			},
			error:function(data) {
				console.log(data.msg);
			},
		});
	});
}
/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	layer_show(title,url,w,h);	
}
/*用户-删除*/
function member_del(obj,id){
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
