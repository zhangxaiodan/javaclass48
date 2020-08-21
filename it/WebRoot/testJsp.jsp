<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns:wb="http://open.weibo.com/wb"><head>

<!-- </script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate"> -->
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">//
<title>修改密码-最专业的互联网招聘平台</title>
<!-- <meta content="23635710066417756375" property="qc:admins"> -->
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"><!-- layui关键配置 -->
 

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link href="h/images/favicon.ico" rel="Shortcut Icon">
<link href="style/css/style.css" type="text/css" rel="stylesheet">
<link href="style/css/external.min.css" type="text/css" rel="stylesheet">
<link href="style/css/popup.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="style/js/jquery.1.10.1.min.js"></script>
<script src="style/js/jquery.lib.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/ajaxfileupload.js"></script>
<script src="style/js/additional-methods.js" type="text/javascript"></script>
<link rel="stylesheet" href="layui/css/layui.css"  media="all">
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script src="style/js/conv.js" type="text/javascript"></script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script></head>
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="h/">
    			<img width="229" height="43" alt="握手招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index.html">首页</a></li>
    			<li><a href="companylist.html">公司</a></li>
    			<li><a target="_blank" href="h/toForum.html">论坛</a></li>
    				    			<li>
	    				<a rel="nofollow" href="h/corpResume/unHandleResumes.html">简历管理</a>
	    					    			</li>
	    							    			<li><a rel="nofollow" href="create.html">发布职位</a></li>
	    		    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%=session.getAttribute("user")%>&nbsp</span> 
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	<dd><a href="positions.html">我发布的职位</a></dd>
                	<dd><a href="positions.html">我收到的简历</a></dd>
                	<dd class="btm"><a href="myhome.html">我的公司主页</a></dd>
                	<dd><a href="list.html">我要找工作</a></dd>
                                                <dd><a href="Account.jsp">帐号设置</a></dd>
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                </div>
    </div><!-- end #header -->
    <div id="container">
        	<div class="user_bindSidebar">
    <dl id="user_sideBarmenu" class="user_sideBarmenu">
     	        <dt><h3>帐号设置</h3></dt>
                <dd><a class="hover" href="Account.jsp">个人信息设置</a></dd>
        <dd><a  href="upPwd.jsp">修改密码</a></dd>
            </dl>
</div>
<input type="hidden" id="hasSidebar" value="1">	<div class="content user_modifyContent">
        <dl class="c_section">
            <dt>
            	<h2><em></em>修改个人信息</h2>
            </dt>
            <dd>
            	            	<form id="updatePswForm" action="UinfoServlet.do" method="post">
            		<table class="savePassword">
            			<tbody><tr>
            				<td>登录邮箱</td>
            				<td class="c7"><%=session.getAttribute("email")%></td>
            			</tr>
            			
            			<tr>
            				<td STYLE="PADDING-TOP:20PX">用户姓名&nbsp&nbsp&nbsp&nbsp&nbsp</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text" maxlength="16" class="layui-input"  id="name" name="username" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiname}" >
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX" VALIGN="MIDDLE">性别</td>
            				<td STYLE="PADDING-TOP:20PX" VALIGN="MIDDLE">
            				
            				    <label for="male">男:</label>            				    
            					<input type="radio" style="width:20px; height:15px;" checked maxlength="16" id="male" name="sex" value="男">&nbsp&nbsp&nbsp
            					<label for="female">女:</label>
            					<input type="radio" style="width:20px; height:15px;" maxlength="16" id="female" name="sex" value="女">
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX" >生日</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text" class="layui-input" maxlength="16" id="birthday" name="birthday" style="width:400px; height:40px;" value="${sessionScope.userinfo.uibirthday}">
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX">身份证号</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text" class="layui-input" maxlength="16" id="pid" name="pid" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiidentification}">
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX">联系电话</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text" maxlength="16" class="layui-input" id="phone" name="phone" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiphone}">
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX">联系地址</td>
            				<td STYLE="PADDING-TOP:0PX" valign="middle">
            					<input type="text" maxlength="16" class="layui-input" id="address" name="address" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiaddress}">
            				</td>            				
            			</tr>
            			<tr>
            				<td>&nbsp;</td>
            				<td><input type="submit" value="保 存"></td>
            			</tr>
            		</tbody></table>
				</form>
				            </dd>
        </dl>
    </div>
<script src="style/js/core.min.js" type="text/javascript"></script>    
<!------------------------------------- 弹窗lightbox ----------------------------------------->
<script src="layui/layui.js" charset="utf-8"></script> <!-- 改成你的路径 -->


<script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  //常规用法
  laydate.render({
    elem: '#birthday'
  });
  });
</script>

</html>