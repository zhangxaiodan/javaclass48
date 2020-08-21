<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<script id="allmobilize" charset="utf-8" src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld"  />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录-最专业的互联网招聘平台</title>

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link rel="Shortcut Icon" href="h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css"/>

<script src="style/js/jquery.1.10.1.min.js" type="text/javascript"></script>

<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script type="text/javascript" src="style/js/core.min.js"></script>


<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script type="text/javascript" src="style/js/conv.js"></script>
</head>

<body id="login_bg">
	<div class="login_wrapper">
		<div class="login_header">
        	<a href="h/"><img src="style/images/logo_white.png" width="285" height="62" alt="拉勾招聘" /></a>
            <div id="cloud_s"><img src="style/images/cloud_s.png" width="81" height="52" alt="cloud" /></div>
            <div id="cloud_m"><img src="style/images/cloud_m.png" width="136" height="95"  alt="cloud" /></div>
        </div>
        
    	<input type="hidden" id="resubmitToken" value="" />		
		 <div class="login_box">
        	<form id="loginForm" >
        	    <label for="useratt"><input name="useratt" id="useratt"  type="checkbox" />我是企业用户</label>
				<input type="text" id="email" name="email" value="" tabindex="2" placeholder="请输入登录邮箱地址" onkeydown="check()" />
			  	<input type="password" id="password" name="password" tabindex="3" placeholder="请输入密码" />
			  	
				<span class="error" style="display:none;" id="beError"></span>
				
				<div id="msg" style="color:red"></div>
			    <label class="fl" for="remember"><input type="checkbox" id="remember" value="" checked="checked" name="autoLogin" /> 记住我</label>
			    <a href="reset.html" class="fr" target="_blank">忘记密码？</a>
			    
				<input type="submit" id="submitLogin" value="登 &nbsp; &nbsp; 录" />
				<%--<a style="color:#fff;" href="index.html" class="submitLogin" title="登 &nbsp; &nbsp; 录"/>登 &nbsp; &nbsp; 录</a>--%>

			    
			    <input type="hidden" id="callback" name="callback" value=""/>
                <input type="hidden" id="authType" name="authType" value=""/>
                <input type="hidden" id="signature" name="signature" value=""/>
                <input type="hidden" id="timestamp" name="timestamp" value=""/>
			</form>
			<div class="login_right">
				<div>还没有帐号？</div>
				<a  href="register.jsp"  class="registor_now">立即注册</a>			   
			</div>
        </div>
        <div class="login_box_btm"></div>
    </div>
 <script type="text/javascript">		
	$(function(){
	//验证表单
	 	$("#loginForm").validate({
	 		/* onkeyup: false,
	    	focusCleanup:true, */
	        rules: {
	    	   	email: {
	    	    	required: true,
	    	    	email: true
	    	   	},
	    	   	password: {
	    	    	required: true,
	    	    	minlength:6,
	    	    	maxlength:16
	    	   	}
	    	},
	    	messages: {
	    	   	email: {
	    	    	required: "请输入登录邮箱地址",
	    	    	email: "请输入有效的邮箱地址，如：vivi@163.com",
	    	    	
	    	   	},
	    	   	password: {
	    	    	required: "请输入密码",
	    	    	minlength: "请输入至少6位密码",
	    	    	maxlength: "密码不能超过16位"
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
	    		var email = $('#email').val();
	    		var password = $('#password').val();
	    		var remember = $('#remember').val();
	    		
	    		var callback = $('#callback').val();
	    		var authType = $('#authType').val();
	    		var signature = $('#signature').val();
	    		var timestamp = $('#timestamp').val(); 
	    			    		
	            $.ajax({
	            	type:"POST",
	            	data:{useratt:useratt,email:email,password:password,autoLogin:remember, callback:callback, authType:authType, signature:signature, timestamp:timestamp},
	            	url:"LoginServlet.do",
	            	success:function(msg){
	            	     if (msg=="uyes") {//根据返回值进行跳转
					            window.location.href = "index.jsp";
					     }else if(msg=="byes"){
					            alert("企业登录成功！");
					            $.ajax({					                
						  			url:"BusinessInfoServlet.do",
						  			type:"post",
						  			data: {email:email,password:password,op:"addlogin"},
						  			success:function(result){
						  			        
							                window.location.href="index.jsp";
							              }
						  			});
					     }else{
					            $("#msg").html("用户名或密码错误");
					     }
	            	}
	            	          	
	            })//end ajax()   
	      	}//end submitHandler	 
	    });	//end validate()    		
	     		
})//end function
function  check(){
      $("#msg").html("");
    }
</script>
</body>
</html>