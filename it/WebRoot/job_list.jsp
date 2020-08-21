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
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<title>职位列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 职位管理 <span class="c-gray en">&gt;</span> 职位列表 <a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="page-container">
<form action="BigJobInfoServlet.do?op=list" method="post" id="myForm">
<input type="hidden" name="index" id="index" value="1"/> 
	<div class="text-c"> 
		 <p>
          <input type="hidden" name="index" id="index" value="1"/>
           职位名称：<input type="text" name="name" placeholder="职位名称" value="${param.name }"/>     
<!--行业领域名称：<select name="sel">
             <option value="-1">全部</option>
             <c:forEach var="d" items="${session }">
                  <option  <c:if test="${p.biId==param.sel }">selected</c:if> value="${p.biId }">${d.biBigJob }</option>
             </c:forEach>
           </select>-->
           <input class="btn btn-primary radius" type="submit" value="查询"/>
           <input class="btn btn-primary radius" type="button" value="新增职位" onclick="javascrtpt:window.location.href='job_add.jsp'"/>
           <a href="gindex.jsp" ><input class="btn btn-primary radius" type="button"value="&nbsp;&nbsp;返回&nbsp;&nbsp;"></a>
	</div>
	</form>
	<table class="table table-border table-bordered table-bg" >
		<thead>
			<tr>
				<th scope="col" colspan="9" align="center">职位列表</th>
			</tr>
			<tr class="text-c">
				<th width="80">职位编号</th>
				<th width="150">岗位名称</th>
				<th width="90">职位名称</th>
				<!--  <th width="100">是否已启用</th>-->
				<th width="100">操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="p" items="${page.list }">
			<tr class="text-c">
				<td>${p.biId }</td>
				<td>${p.biBigJob } </td>
				<td>${p.biJob }</td>
				<!--  <td class="td-status"><span class="label label-success radius">已启用</span></td>-->
				<td class="td-manage">   <a title="删除" href="BigJobInfoServlet.do?op=del&biid=${p.biId }" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
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
/*
	参数解释：
	title	标题
	url		请求的url
	id		需要操作的数据id
	w		弹出层宽度（缺省调默认值）
	h		弹出层高度（缺省调默认值）
*/

   //跳转方法
    function topage(index){
       //给隐藏域赋值
         $("#index").val(index);
         //表单提交
         $("form").submit();
        }
/*管理员-增加*/
function admin_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*管理员-删除*/
function admin_del(obj,id){
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

/*管理员-编辑*/
function admin_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*管理员-停用*/
function admin_stop(obj,id){
	layer.confirm('确认要停用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_start(this,id)" href="javascript:;" title="启用" style="text-decoration:none"><i class="Hui-iconfont">&#xe615;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius" type="hidden">已禁用</span>');
		$(obj).remove();
		layer.msg('已停用!',{icon: 5,time:1000});
		
		});
}

/*管理员-启用*/
function admin_start(obj,id){
	layer.confirm('确认要启用吗？',function(index){
		//此处请求后台程序，下方是成功后的前台处理……
		
		
		$(obj).parents("tr").find(".td-manage").prepend('<a onClick="admin_stop(this,id)" href="javascript:;" title="停用" style="text-decoration:none"><i class="Hui-iconfont">&#xe631;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已启用</span>');
		$(obj).remove();
		layer.msg('已启用!', {icon: 6,time:1000});
	});
}
</script>
</body>
</html>