<%@page import="com.kgc.pojo.BusinessRecruit"%>
<%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
</script><script type="text/javascript" async="" src="style/js/conversion.js"></script>
<script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>拉勾网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="拉勾网是3W旗下的互联网领域垂直招聘网站">
<meta name="keywords" content="拉勾,拉勾网,拉勾招聘,拉钩, 拉钩网 ,互联网招聘,拉勾互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 拉勾官网, 拉勾百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">http://www.lagou.com</div> -->
<script type="text/javascript">
var ctx = "http://www.lagou.com";
console.log(1);
</script>
<link href="http://www.lagou.com/images/favicon.ico" rel="Shortcut Icon">
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
    		<a class="logo" href="http://www.lagou.com/">
    			<img width="229" height="43" alt="拉勾招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=dadashouye&name=<%=bi.getBuName()%>">首页</a></li>
    			<li><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweidsy&name=<%=bi.getBuName()%> ">公司</a></li>
    			<li><a  href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">简历管理</a></li>
    				    			<li><a rel="nofollow" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%> ">发布职位</a></li>
	    						    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<!-- <span class="red" id="noticeDot-0"></span> -->
            		<i></i>
            	</dt>
                                	<dd><a rel="nofollow" href=" <%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%> ">发布的职位</a></dd>
                	                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">我收到的简历</a></dd>
                	                	                	<!-- <dd><a href="delivery.html">我的公司主页 <span id="noticeNo" class="red">(1)</span></a></dd> -->
                	                	<!-- <dd class="btm"><a href="subscribe.html">我的订阅</a></dd> -->
                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update01&name=<%=bi.getBuName()%> ">我的公司主页</a></dd>
                                                <dd><a href="accountBind.html">帐号设置</a></dd>
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                  <!--   <div id="noticeTip">
            	<span class="bot"></span>
				<span class="top"></span>
				<a target="_blank" href="delivery.html"><strong>1</strong>条新投递反馈</a>
				<a class="closeNT" href="javascript:;"></a>
            </div> -->
                    </div>
    </div><!-- end #header -->
      <div id="container">
            
        	<div class="sidebar">
            	<a class="btn_create" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiwei01&name=<%=bi.getBuName()%> ">发布新职位</a>
                <dl class="company_center_aside">
		<dt>我收到的简历</dt> 
		<dd>
		<a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">收到的简历 </a> 
					<span></span>
			</dd>
	<!-- <dd>
		<a href="canInterviewResumes.html">待定简历</a>
	</dd>
	<dd>
		<a href="haveNoticeResumes.html">已通知面试简历</a>
	</dd>
	<dd>
		<a href="haveRefuseResumes.html">不合适简历</a>
	</dd>
	<dd class="btm">
		<a href="autoFilterResumes.html">自动过滤简历</a> 
					<span></span>
			</dd> -->
</dl>
<dl class="company_center_aside">
		<dt>我发布的职位</dt>
			<dd>
		<a href=" <%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%> ">发布的职位</a>
	</dd>
	
	</dl>
                <div class="subscribe_side mt20">
   <div class="f14">想收到更多更好的简历？</div>
   <div class="f18 mb10">就用拉勾招聘加速助手 </div>
    <div>咨询：<a class="f16" href="mailto:jessica@lagou.com">30720692@qq.com</a></div>
   <div class="f18 ti2em">15050823850</div>
</div>
<div class="subscribe_side mt20">
   <div class="f14">加入互联网HR交流群</div>
   <div class="f18 mb10">跟同行聊聊</div>
   <div class="f24">307220692</div>
</div>            </div>
   <!-- end .sidebar -->
            <div class="content">
            	<dl class="company_center_content">
            	
            	
            	
            	
            	
            	
            	
            	
            	
                    <dt>
                        <h1>
                            <em></em>
                            
                            <form  action="BusinessInfoServlet.do?op=jianlishouyelist&id=<%=bi.getBuId()%>" method="post">
    			收到的简历 &nbsp;<input id="btntest" type="submit"  style="background:#93CEC1;color:white;font-size:17px;"   value="刷新简历"/>
   			 </form>  <span><i style="color:#fff;font-style:normal" id="positionNumber"></i></span>                    </h1>
                    </dt>
                    
                    
                    
                    
                    
                    
                    
                    
                    <dd>
                    <c:forEach var="br2" items="${businessResume}">
                    	<form action="autoFilterResumes.html" method="get" id="filterForm">
	                    	
		                        <div class="filter_options  dn ">
     
          <input type="hidden" value="0" name="filterStatus" id="filterStatus">
     <input type="hidden" value="" name="positionId" id="positionId">
 </div><!-- end .filter_options -->	                        	                        		                        <ul class="reset resumeLists">
		                            			                            <li data-id="1686182" class="onlineResume">
			                                <label class="checkbox">
			                                    <input type="checkbox">
			                                    <i></i>
			                                </label>
			                                <div class="resumeShow">
			                                				                                    <a title="预览在线简历"  class="resumeImg" ">
			                                    	<img src="${br2.burPicture}">
			                                    </a>
			                                    			                                    <div class="resumeIntro">
			                                        <h3 class="unread">
			                                        	<a  title="预览${br2.burName}的简历">
			                                        		${br2.burName}的简历
		                                        		</a>
				                           	 			<em></em>
			                                        </h3>
			                                        <span class="fr">投递时间：${br2.burTime}</span>
			                                        <div> 
			                                        	${br2.burName} / ${br2.burSex} / ${br2.burEducation} / ${br2.burExperience} / ${br2.burCity}	<br>
			                                            	${br2.burJob} | ${br2.burEducation} · ${br2.burSchool}
			                                            			                                        </div>
			                                        <div class="jdpublisher">
				                                        <span>
				                                        	应聘职位：<a title="${br2.burJob}" >${br2.burJob}</a>
				                                       						                                        </span>
			                                        </div>
			                                    </div>
			                                    <div class="links">
			                                       	<a class="resume_notice" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=yulanjianli&id=${br2.burId}">预览</a>
			                                       	 <a data-resumename="郑秋枫的简历" data-positionname="随便写" data-deliverid="1686182" data-positionid="149594" data-resumekey="1ccca806e13637f7b1a4560f80f08057" data-forwardcount="1" class="resume_forward" href="javascript:void(0)">
                                                    	通知面试
                                                    	                                                    </a>
 													<a data-deliverid="1686182" class="resume_refuse" href="javascript:void(0)">下线</a>
 													
                                                   
			                                    </div>
			                                </div>
			                            </li>
		                            		                    	</ul><!-- end .resumeLists -->
		                    		                    				            </form>
		                    		    </c:forEach> 
                    </dd>
                </dl>
            </div><!-- end .content -->

<!------------------------------------- 弹窗lightbox ----------------------------------------->
<div style="display:none;">
	<!--通知面试弹窗-->	
    <div style="overflow:auto;" class="popup" id="noticeInterview">
	    <form id="noticeInterviewForm">
	     	<table width="100%" class="f16">
	         	<tbody><tr>
	         		<td width="20%" align="right" class="c9">收件人  </td>
	         		<td width="80%"> 
	         			<span class="c9" id="receiveEmail"></span> 
	         			<input type="hidden" value="" name="email">
	         		</td>
	         	</tr>
	         	<tr>
	             	<td align="right"><span class="redstar">*</span>主题</td>
	             	<td>
						<input type="text" placeholder="公司：职位名称面试通知" name="subject">
					</td>
	           	</tr>
	           	<tr>
	             	<td align="right"><span class="redstar">*</span>面试时间</td>
	             	<td>
						<input type="text" id="datetimepicker" name="interTime" class="hasDatepicker">
					</td>
	           	</tr>
	           	<tr>
	             	<td align="right"><span class="redstar">*</span>面试地点</td>
	             	<td>
						<input type="text" name="interAdd">
					</td>
	           	</tr>
	           	<tr>
	             	<td align="right">联系人</td>
	             	<td>
						<input type="text" name="linkMan">
					</td>
	           	</tr>
	           	<tr>
	             	<td align="right"><span class="redstar">*</span>联系电话</td>
	             	<td>
						<input type="text" name="linkPhone">
					</td>
	           	</tr>
	           	<tr>
	             	<td valign="top" align="right">补充内容</td>
	             	<td>
						<textarea name="content"></textarea>
					</td>
	           	</tr>
	            <tr>
	            	<td></td>
	             	<td>
	             		<input type="submit" value="发送" class="btn">
	             		<a class="emailPreview" href="javascript:;">预览</a>
	             	</td>
	             </tr>
	         </tbody></table>
			<input type="hidden" value="" name="name">
			<input type="hidden" value="" name="positionName">
			<input type="hidden" value="" name="companyName">
			<input type="hidden" value="" name="deliverId">
        </form>
    </div><!--/#noticeInterview-->
    
    <!--预览通知面试弹窗-->	
    <div class="popup" id="noticeInterviewPreview">
    	<div class="f18">拉勾网：产品经理面试通知 </div>
        <div class="c9">发给：<span>vivi@lagou.com</span></div>
		<div id="emailText"></div>      
        <input type="button" value="提交" class="btn fl">
        <a title="通知面试" class="inline fl cboxElement" href="#noticeInterview">返回修改</a>
    </div><!--/#noticeInterviewPreview-->
    
    <!--通知面试成功弹窗-->	
    <div class="popup" id="noticeInterviewSuccess">
	   	<table width="100%" class="f16">
         	<tbody><tr>
         		<td align="center" class="f16">
         			面试通知已发送成功<br>
         			 该简历已进入“已通知面试简历”列表
         		</td>
         	</tr>
         	 <tr>
             	<td align="center">
             		<input type="button" value="确认" class="btn">
             	</td>
             </tr>
        </tbody></table>
    </div><!--/#noticeInterviewSuccess-->
    
    <!--转发简历弹窗-->	
    <div class="popup" id="forwardResume" >
	     <form id="forwardResumeFor" action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=email" method="post">
	     	<table width="100%" class="f16">
	           	<tbody><tr>
	             	<td width="20%" align="right">收件人</td>
	             	<td width="80%">
						<input type="text" placeholder="最多可添加两个邮箱，用“；”隔开" value="307220692@qq.com" id="recipient" name="recipients">
						<span id="forwardResumeError" style="display:none" class="beError"></span>
					</td>					
	           	</tr>
	           	<tr>
	             	<td align="right">主题</td>
	             	<td>
						<input type="text" value="<%=bi.getBuName()%>的offer" name="title">
					</td>
	           	</tr>
	           	<tr>
	             	<td valign="top" align="right">正文</td>
	             	<td>
						<textarea name="content" >您诚意应聘本公司            职位，经初审合格，依本公司任用规定给预录取！</textarea>
						<span style="display:none;" class="beError error"></span>
					</td>
	           	</tr>
	            <tr>
	            	<td></td>
	             	<td>
	             		<input type="submit" value="发送" class="btn">
	             		<a class="emial_cancel" href="javascript:;">取消</a>
	             	</td>
	             </tr>
	        </tbody></table>
        </form>
    </div><!--/#forwardResume-->
    
    <!--转发简历成功弹窗-->	
    <div class="popup" id="forwardResumeSuccess">
	   	<table width="100%" class="f16">
         	<tbody><tr>
         		<td align="center" class="f16">简历已转发成功  </td>
         	</tr>
         	 <tr>
             	<td align="center">
             		<input type="button" value="确认" class="btn">
             	</td>
             </tr>
        </tbody></table>
    </div><!--/#forwardResumeSuccess-->
    
    <!--确认不合适弹窗-->	
    <div style="height:400px;" class="popup" id="confirmRefuse">
	    <form id="refuseMailForm">
	     	<table width="100%">
	         	<tbody><tr>
	         		<td>
	         			<div class="refuse_icon">
	         				<h3>确认这份简历不合适吗？</h3>
	         				<span>确认后，系统将自动发送以下内容至用户邮箱</span>
	         			</div>
	         		</td>
	         	</tr>
	         	<tr>
	             	<td>
	             		<textarea name="content">非常荣幸收到您的简历，在我们仔细阅读您的简历之后，却不得不很遗憾的通知您：
	您的简历与该职位的定位有些不匹配，因此无法进入面试。

	但您的信息已录入我司人才储备库，当有合适您的职位开放时我们将第一时间联系您，希望在未来我们有机会成为一起拼搏的同事；
	再次感谢您对我们的信任，祝您早日找到满意的工作。</textarea>
	             	</td>
	            </tr>
	            <tr>
	             	<td>
	             		<input type="submit" value="确认不合适" class="btn">
	             		<a class="emial_cancel" href="javascript:;">取消</a>
	             	</td>
	            </tr>
	        </tbody></table>
	        <input type="hidden" value="" name="deliverId">
        </form>
    </div><!--/#confirmRefuse-->
    
    <!--拒绝email成功弹窗-->	
    <div class="popup" id="refuseMailSuccess">
	   	<table width="100%" class="f16">
         	<tbody><tr>
         		<td align="center" class="f16">
         			不合适通知已发送成功<br>
         			该简历已进入“不合适简历”列表
         		</td>
         	</tr>
         	 <tr>
             	<td align="center">
             		<input type="button" value="确认" class="btn">
             	</td>
             </tr>
        </tbody></table>
    </div><!--/#refuseMailSuccess-->
</div>
<!------------------------------------- end -----------------------------------------> <script src="style/js/jquery.ui.datetimepicker.min.js" type="text/javascript"></script>
<script src="style/js/received_resumes.min.js" type="text/javascript"></script>
<script>
</script>    
			<div class="clear"></div>
			<input type="hidden" value="8e0aac9393b44b1f925b6be8130285be" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="about.html">联系我们</a>
		    <a target="_blank" href="http://www.lagou.com/af/zhaopin.html">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">拉勾微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">拉勾微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>

<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>

<!--  -->

<script type="text/javascript">
$(function(){
	$('#noticeDot-1').hide();
	$('#noticeTip a.closeNT').click(function(){
		$(this).parent().hide();
	});
});
var index = Math.floor(Math.random() * 2);
var ipArray = new Array('42.62.79.226','42.62.79.227');
var url = "ws://" + ipArray[index] + ":18080/wsServlet?code=314873";
var CallCenter = {
		init:function(url){
			var _websocket = new WebSocket(url);
			_websocket.onopen = function(evt) {
				console.log("Connected to WebSocket server.");
			};
			_websocket.onclose = function(evt) {
				console.log("Disconnected");
			};
			_websocket.onmessage = function(evt) {
				//alert(evt.data);
				var notice = jQuery.parseJSON(evt.data);
				if(notice.status[0] == 0){
					$('#noticeDot-0').hide();
					$('#noticeTip').hide();
					$('#noticeNo').text('').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
					$('#noticeNoPage').text('').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
				}else{
					$('#noticeDot-0').show();
					$('#noticeTip strong').text(notice.status[0]);
					$('#noticeTip').show();
					$('#noticeNo').text('('+notice.status[0]+')').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
					$('#noticeNoPage').text(' ('+notice.status[0]+')').show().parent('a').attr('href',ctx+'/mycenter/delivery.html');
				}
				$('#noticeDot-1').hide();
			};
			_websocket.onerror = function(evt) {
				console.log('Error occured: ' + evt);
			};
		}
};
CallCenter.init(url);
</script>

<div id="cboxOverlay" style="display: none;"></div>
<div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;">
<div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div>
div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div>
<div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div>
<div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div>
<div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button>
<button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div>
</div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div>
<div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div><div class="ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all" id="ui-datepicker-div"></div></body></html>