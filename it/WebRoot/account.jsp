<%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<!-- <meta content="text/html; charset=utf-8" http-equiv="Content-Type">// -->
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

 <% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	 %>
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="h/">
    			<img width="229" height="43" alt="拉勾招聘-专注互联网招聘" src="style/images/logo.png">
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
                                                <dd style="display: none;"><a href="account.jsp">帐号设置</a></dd>
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
     	        <dt STYLE="PADDING-bottom:20PX;PADDING-top:20PX;"><h3>帐号设置</h3></dt>
                <dd><a class="hover" href="account.jsp">个人信息设置</a></dd>
        <dd><a href="upPwd.jsp">修改密码</a></dd>
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
            					<input type="text" maxlength="16" id="name" name="username" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiName}" >
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX" VALIGN="MIDDLE">性别</td>
            				<td STYLE="PADDING-TOP:20PX" VALIGN="MIDDLE">
            				
            				    <label for="male">男:</label>            				    
            					<input type="radio" style="width:20px; height:15px;" checked  id="male" name="sex" value="男">&nbsp&nbsp&nbsp
            					<label for="female">女:</label>
            					<input type="radio" style="width:20px; height:15px;" id="female" name="sex" value="女">
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX" >生日</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text" id="birthday" name="birthday" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiBirthday}">
            				</td>            				
            			</tr>     
            			<%-- <tr>
            				<td STYLE="PADDING-TOP:20PX">身份证号</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text" id="pid" name="pid" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiidentification}">
            				</td>            				
            			</tr>  --%>      			
            			<tr>
            				<td STYLE="PADDING-TOP:20PX">联系电话</td>
            				<td STYLE="PADDING-TOP:0PX" VALIGN="MIDDLE">
            					<input type="text"  id="phone" name="phone" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiPhone}" >
            				</td>            				
            			</tr>
            			<tr>
            				<td STYLE="PADDING-TOP:20PX">联系地址</td>
            				<td STYLE="PADDING-TOP:0PX" valign="middle">
            					<input type="text"  id="address" name="address" style="width:400px; height:40px;" value="${sessionScope.userinfo.uiAddress}">
            				</td>            				
            			</tr>
            			<tr>
            				<td>&nbsp;</td>
            				<td><input type="submit" id='save' value="保 存"></td>
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
<script type="text/javascript">		
	$(function(){ 
$.validator.setDefaults({ 
submitHandler: function(form) { 
form.submit(); 
} 
}); 
// 身份证验证 
jQuery.validator.addMethod('idCard', function (value, element) {
    var vcity = {
        11: "北京", 12: "天津", 13: "河北", 14: "山西", 15: "内蒙古",
        21: "辽宁", 22: "吉林", 23: "黑龙江", 31: "上海", 32: "江苏",
        33: "浙江", 34: "安徽", 35: "福建", 36: "江西", 37: "山东", 41: "河南",
        42: "湖北", 43: "湖南", 44: "广东", 45: "广西", 46: "海南", 50: "重庆",
        51: "四川", 52: "贵州", 53: "云南", 54: "西藏", 61: "陕西", 62: "甘肃",
        63: "青海", 64: "宁夏", 65: "新疆", 71: "台湾", 81: "香港", 82: "澳门", 91: "国外"
    };

    // 判断是否为空
    isEmpty = function(card){
        if (/^\s*$/.test(card) === true) {
            return true;
        }
    }
    //检查号码是否符合规范，包括长度，类型  
    isCardNo = function (card) {
        if( isEmpty(card) ){
            return true;
        }
        //身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X  
        var reg = /(^\d{15}$)|(^\d{17}(\d|X)$)/;
        if (reg.test(card) === false) {
            return false;
        }
        return true;
    };

    //取身份证前两位,校验省份  
    checkProvince = function (card) {
       if( isEmpty(card) ){
            return true;
        }
       var province = card.substr(0, 2);
       if (vcity[province] == undefined) {
        return false;
    }
    return true;
};

    //检查生日是否正确  
    checkBirthday = function (card) {
      if( isEmpty(card) ){
            return true;
        }
      var len = card.length;
        //身份证15位时，次序为省（3位）市（3位）年（2位）月（2位）日（2位）校验位（3位），皆为数字  
        if (len == '15') {
            var re_fifteen = /^(\d{6})(\d{2})(\d{2})(\d{2})(\d{3})$/;
            var arr_data = card.match(re_fifteen);
            var year = arr_data[2];
            var month = arr_data[3];
            var day = arr_data[4];
            var birthday = new Date('19' + year + '/' + month + '/' + day);
            return verifyBirthday('19' + year, month, day, birthday);
        }
        //身份证18位时，次序为省（3位）市（3位）年（4位）月（2位）日（2位）校验位（4位），校验位末尾可能为X  
        if (len == '18') {
            var re_eighteen = /^(\d{6})(\d{4})(\d{2})(\d{2})(\d{3})([0-9]|X)$/;
            var arr_data = card.match(re_eighteen);
            var year = arr_data[2];
            var month = arr_data[3];
            var day = arr_data[4];
            var birthday = new Date(year + '/' + month + '/' + day);
            return verifyBirthday(year, month, day, birthday);
        }
        return false;
    };

    //校验日期  
    verifyBirthday = function (year, month, day, birthday) {
        var now = new Date();
        var now_year = now.getFullYear();
        //年月日是否合理  
        if (birthday.getFullYear() == year && (birthday.getMonth() + 1) == month && birthday.getDate() == day) {
            //判断年份的范围（3岁到100岁之间)  
            var time = now_year - year;
            if (time >= 3 && time <= 100) {
                return true;
            }
            return false;
        }
        return false;
    };

    //校验位的检测  
    checkParity = function (card) {
      if( isEmpty(card) ){
            return true;
        }
        //15位转18位  
        card = changeFivteenToEighteen(card);
        var len = card.length;
        if (len == '18') {
            var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
            var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
            var cardTemp = 0, i, valnum;
            for (i = 0; i < 17; i++) {
                cardTemp += card.substr(i, 1) * arrInt[i];
            }
            valnum = arrCh[cardTemp % 11];
            if (valnum == card.substr(17, 1)) {
                return true;
            }
            return false;
        }
        return false;
    };

    //15位转18位身份证号  
    changeFivteenToEighteen = function (card) {
      if( isEmpty(card) ){
            return true;
        }
      if (card.length == '15') {
        var arrInt = new Array(7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2);
        var arrCh = new Array('1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2');
        var cardTemp = 0, i;
        card = card.substr(0, 6) + '19' + card.substr(6, card.length - 6);
        for (i = 0; i < 17; i++) {
            cardTemp += card.substr(i, 1) * arrInt[i];
        }
        card += arrCh[cardTemp % 11];
        return card;
    }
    return card;
};

    //checkCard = function () {
        var card = value;
    //校验长度，类型  
    if (isCardNo(card) === false) {
        //alert('您输入的身份证号码不正确，请重新输入');
        //document.getElementById('card_no').focus;
        return false;
    }
    //检查省份  
    if (checkProvince(card) === false) {
        return false;
    }
    //校验生日  
    if (checkBirthday(card) === false) {
        return false;
    }
    //检验位的检测  
    if (checkParity(card) === false) {
        return false;
    }

    return true;
});

// 联系电话(手机/电话皆可)验证 
jQuery.validator.addMethod("isPhone", function(value,element) { 
var length = value.length; 
var mobile = /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/; 
var tel = /^\d{3,4}-?\d{7,9}$/; 
return this.optional(element) || (tel.test(value) || mobile.test(value)); 
}, "请正确填写您的联系电话"); 

//开始验证 
$('#updatePswForm').validate({ 
rules: { 
	username: { 
		required:true		
	},
	birthday: {
	 	required:true
	},
	phone:{ 
		required:true, 
		isPhone:true 
	},  
    address: {
	 	required:true
	}	 	 
}, 
messages:{ 
	username: { 
		required: "请填写用户名"		
	},
	birthday: {
	 	required: "请填写您的出生日期"
	},	 			
	phone:{ 
		required: "请输入您的联系电话", 
		isPhone: "请输入一个有效的联系电话" 
	},
	address: {
	 	required: "请填写您的联系地址"
	}	
  }
 }); 
});
function  checkbirthday(){
    var birthday=$("#birthday").val();
    if(birthday==null||birthday==""){
    
    $("#save").attr("disabled",false);
    }     
}; 


 function  check(){
      $("#msg").html("");
    } 
</script>


</html>