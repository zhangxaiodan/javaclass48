 <%@page import="com.kgc.pojo.BusinessRecruit"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE HTML>
<html><head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>简历预览-我的简历-握手网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="握手网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在握手网">
<meta name="keywords" content="握手,握手网,握手招聘,拉钩, 拉钩网 ,互联网招聘,握手互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 握手官网, 握手百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">

<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">h</div> -->
</script><script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link href="h/images/favicon.ico" rel="Shortcut Icon">
<link href="style/css/style.css" type="text/css" rel="stylesheet">
<link href="style/css/colorbox.min.css" type="text/css" rel="stylesheet">
<link href="style/css/popup.css" type="text/css" rel="stylesheet">

<script type="text/javascript" src="style/js/jquery.1.10.1.min.js"></script>

<script src="style/js/jquery.colorbox-min.js" type="text/javascript"></script>
<script>
$(function(){
	 $("body").on("click","a.btn_s",function(){
		$.colorbox.close();
		parent.jQuery.colorbox.close();
	});
	$(".inline").colorbox({
		inline:true
	});
});
</script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script></head>



<% BusinessRecruit bi=(BusinessRecruit)session.getAttribute("BusinessRecruit"); 
	 %>




<body>
  	<div id="previewWrapper">
        <div class="preview_header">
            <h1 title="发布的职位">职位信息</h1>
                        	<a title="返回"  href="javascript: history.go(-1)">X</a>
                    </div><!--end .preview_header-->

        <div class="preview_content">
            <div class="profile_box" id="basicInfo">
                <h2>基本信息</h2>
                <div class="basicShow">
                   <span><%=bi.getBrJob() %>&nbsp;&nbsp;|&nbsp;&nbsp;<%=bi.getBrCity() %>
            		            			<br>
            			            				 <%=bi.getBrNature() %>&nbsp;&nbsp;|&nbsp;&nbsp;<%=bi.getBrEducation()%>&nbsp;&nbsp;|&nbsp;&nbsp;<%=bi.getBrExperience() %> <br>
            			            			 <%=bi.getBrMoney()%>&nbsp;&nbsp;|&nbsp;&nbsp;<%=bi.getBrEmail() %>
            			
            		</span>
           			
                </div><!--end .basicShow-->
            </div><!--end #basicInfo-->
			
				            <div class="profile_box" id="expectJob">
	                <h2>工作详细地址</h2>
	                <div class="expectShow">
	                	 <%=bi.getBrAddress()%>
	                </div><!--end .expectShow-->
	            </div><!--end #expectJob-->
						
				            <div class="profile_box" id="workExperience">
	                <h2>职位要求与描述</h2>
	                <div class="experienceShow">
	                  <ul class="wlist clearfix">
	                  	                    	           				            				<li class="clear">
            					           					<span > <%=bi.getBrJobDescribe()%></span>
	           					<div>
	           						
	           					</div>
	           				</li>
	           					          				                  </ul>
	                </div><!--end .experienceShow-->
	            </div><!--end #workExperience-->
			
				            <div class="profile_box" id="projectExperience">
	                <h2>职位诱惑</h2>
	                <div class="projectShow">
	                  <ul class="plist clearfix">
	                  			            				            					            				<li class="noborder">
	            					            					<div class="projectList">
		            					<div class="f16 mb10"><%=bi.getBrLikeJob()%>
		            						
		            					</div>
		            							            					<div class="dl1"></div>
		            							            				</div>
	            				</li>
	            				            				                      </ul>
	               
					
	                </div><!--end .workShow-->
	            </div><!--end #worksShow-->
			        </div><!--end .preview_content-->
  	</div><!--end #previewWrapper-->

<!-------------------------------------弹窗lightbox ----------------------------------------->
<div style="display:none;">
	<!-- 下载简历 -->
	<div class="popup" id="downloadOnlineResume">
         <table width="100%">
             <tbody><tr>
                 <td class="c5 f18">请选择下载简历格式：</td>
             </tr>
         	<tr>
             	<td>
             		<a class="btn_s" href="h/resume/downloadResume?key=1ccca806e13637f7b1a4560f80f08057&amp;type=1">word格式</a>
             		<a class="btn_s" href="h/resume/downloadResume?key=1ccca806e13637f7b1a4560f80f08057&amp;type=2">html格式</a>
             		<a class="btn_s" href="h/resume/downloadResume?key=1ccca806e13637f7b1a4560f80f08057&amp;type=3">pdf格式</a>
             	</td>
             </tr>
         </tbody></table>
    </div><!--/#downloadOnlineResume-->   
</div>
<!------------------------------------- end ----------------------------------------->  




<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div></body></html>