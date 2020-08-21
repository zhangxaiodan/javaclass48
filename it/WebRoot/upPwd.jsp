<%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- <html xmlns:wb="http://open.weibo.com/wb"><head> -->

</script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>修改密码--最专业的互联网招聘平台</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script src="style/js/conv.js" type="text/javascript"></script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script></head>

 <% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	 %>

<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="h/">
    			<img width="229" height="43" src="style/images/logo.png">
    		</a>
    		
    		
    		
    			
    	  <c:choose>
           <c:when test="${useratt == 'b'}">	
    		<ul class="reset" id="navheader">
    			<li class="current"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=dadashouye&name=<%=bi.getBuName()%>">首页</a></li>
    			<li ><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweidsy&name=<%=bi.getBuName()%>" >公司</a></li>
    			
    			
    				    			<li ><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>" rel="nofollow">简历管理</a></li>
	    							    			<li ><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>" rel="nofollow">发布职位</a></li>
	    		    		</ul>
        	</c:when>
       <c:otherwise>   
                <ul class="reset" id="navheader">
    			   <li class="current"><a href="index.jsp">首页</a></li>
    			   <li ><a href="account.jsp">账号设置</a></li>                      			   
	    		    		</ul>
                 </c:otherwise>
    </c:choose>	  
	    		    		
	    		    		
	    		    	<c:choose>
     <c:when test="${useratt == 'b'}">		  
						  
						  <dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	<dd style="display: none;"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>">发布的职位</a></dd>
                	<dd style="display: none;"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">我收到的简历</a></dd>
                	<dd class="btm" style="display: none;"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update01&name=<%=bi.getBuName()%> ">我的公司主页</a></dd>
                	<!-- <dd style="display: none;"><a href="list.html">我要找工作</a></dd> -->
                                                <dd style="display: none;"><a href="upPwd.jsp">帐号设置</a></dd>
                                <dd class="logout" style="display: none;"><a rel="nofollow" href="login.jsp">退出</a></dd> 
          </dl> 	
             
	 </c:when>
       <c:otherwise>	 	
     
                     <dl class="collapsible_menu">
            	<dt>
           			<span>${sessionScope.email}&nbsp;</span> 
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	
                                                <dd style="display: none;"><a href="account.jsp">帐号设置</a></dd>
                                <dd class="logout" style="display: none;"><a rel="nofollow" href="login.jsp">退出</a></dd> 
          </dl> 	
     
       </c:otherwise>
    </c:choose>	
            
            
            
            
                                </div>
    </div><!-- end #header -->
    <div id="container">
        	<div class="user_bindSidebar">
    <dl id="user_sideBarmenu" class="user_sideBarmenu">
     	        <dt STYLE="PADDING-bottom:0PX"><h3>帐号设置</h3></dt>
     	        
     	        <c:if test="${useratt == 'p'}">
                <dd><a href="account.jsp">个人信息设置</a></dd>
                </c:if>
                
        <dd><a class="hover" href="upPwd.jsp">修改密码</a></dd>
            </dl>
</div>
<input type="hidden" id="hasSidebar" value="1">	<div class="content user_modifyContent">
        <dl class="c_section">
            <dt>
            	<h2><em></em>修改密码</h2>
            </dt>
            <dd>
            	            	<form id="updatePswForm">
            		<table class="savePassword">
            			<tbody><tr>
            				<td>登录邮箱</td>
            				<td class="c7"><%=session.getAttribute("email")%></td>
            			</tr>
            			<tr>
            				<td class="label">当前密码</td>
            				<td>
            					<input type="password" maxlength="16"  id="oldpassword" name="oldpassword" placeholder="请输入当前密码" style="width:400px; height:40px;" onmousedown="check()" onmousedown="check()" onkeydown="check()">            					
            					<div id="msg" style="color:red"></div>
            				</td>            				
            			</tr>
            			<tr>
            				<td class="label">新密码&nbsp&nbsp&nbsp&nbsp&nbsp</td>
            				<td><input type="password" maxlength="16"  id="newpassword" name="newpassword" placeholder="请输入新密码" style="width:400px; height:40px;" ></td>
            			</tr>
            			<tr>
            				<td class="label">确认密码&nbsp&nbsp&nbsp&nbsp&nbsp</td>
            				<td><input type="password" maxlength="16"  id="comfirmpassword" name="comfirmpassword" placeholder="请再次输入新密码" style="width:400px; height:40px;" ></td>
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
<script type="text/javascript">	
$(function(){
	//验证表单
	 	$("#updatePswForm").validate({
	 		/* onkeyup: false,
	    	focusCleanup:true, */
	        rules: {
	    	   	oldpassword: {
	    	    	required: true,
	    	    	minlength:6,
	    	    	maxlength:16
	    	   	},
	    	   	newpassword: {
	    	    	required: true,
	    	    	minlength:6,
	    	    	maxlength:16
	    	   	},
	    	   	comfirmpassword: {
	    	   	    required: true,
	    	    	minlength:6,
	    	    	maxlength:16,
	    	    	equalTo: "#newpassword"
	    	   	}
	    	},
	    	messages: {
	    	   	oldpassword: {
	    	    	required: "请输入密码",
	    	    	minlength: "请输入至少6位密码",
	    	    	maxlength: "密码不能超过16位"
	    	    	
	    	   	},
	    	   	newpassword: {
	    	    	required: "请输入密码",
	    	    	minlength: "请输入至少6位密码",
	    	    	maxlength: "密码不能超过16位"
	    	   	},
	    	   	comfirmpassword: {
	    	    	required: "请输入密码",
	    	    	minlength: "请输入至少6位密码",
	    	    	maxlength: "密码不能超过16位",
	    	    	equalTo: "两次密码输入不一致"
	    	   	}
	    	},
	     	submitHandler:function(form){
	    		if($('#remember').prop("checked")){
	      			$('#remember').val(1);
	      		}else{
	      			$('#remember').val(null);
	      		}
	      		if($('#useratt').prop("checked")){
	      		    $('#useratt').val("b");
	      		}else{
	      		    $('#useratt').val("p");
	      		}
	      		
	      		var useratt = $('#useratt').val();	    		
	    		var oldpassword = $('#oldpassword').val();
	    		var newpassword = $('#newpassword').val();
	    		var remember = $('#remember').val();	    		
	    		
	    			    		
	            $.ajax({
	            	type:"POST",
	            	data:{useratt:useratt,oldpassword:oldpassword,newpassword:newpassword,autoLogin:remember},
	            	url:"UpdatePwdServlet.do",
	            	success:function(msg){
	            	     if (msg=="uyes") {//根据返回值进行跳转
					            alert("密码修改成功！");
					     }else if(msg=="byes"){
					            alert("密码修改成功！");
					     }else{
					            $("#msg").html("当前密码错误");
					            $("#oldpassword").focus();
					     }
	            	}
	            	          	
	            });//end ajax()   
	      	}//end submitHandler	 
	    });	//end validate()    		
	     		
});//end function
function  check(){
      $("#msg").html("");
    }
</script>
<!------------------------------------- 弹窗lightbox ----------------------------------------->
</html>