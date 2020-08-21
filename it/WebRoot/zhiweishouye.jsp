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
<script async="" src="style/js/analytics.js"></script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>我发布的职位-招聘服务-握手网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="握手网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在握手网">
<meta name="keywords" content="握手,握手网,握手招聘,拉钩, 拉钩网 ,互联网招聘,握手互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 握手官网, 握手百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
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

<script >	
         /* $(window).load(function() {   	
             $("#btntest").click();
        }); */
        
        

        </script> 


<% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	 %>

 <%-- <%
	List<BusinessRecruit> recruit=(ArrayList<BusinessRecruit>)request.getAttribute("BusinessRecruit");
	if(recruit==null){
		//从主题控制器获取
		response.sendRedirect("BusinessInfoServlet.do?op=zhiweishouyelist");
		return;
	} 

 %> --%>	  


<body>

		<c:if test="${businessRecruit==null}">
  			<script>location.href="BusinessInfoServlet.do?op=zhiweishouyelist";</script>
  			return;
  		</c:if>







<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="http://www.lagou.com/">
    			<img width="229" height="43" alt="握手招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=dadashouye&name=<%=bi.getBuName()%>">首页</a></li>
    			<li><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweidsy&name=<%=bi.getBuName()%>">公司</a></li>
    			<li><a  href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">简历管理</a></li>
    				    			<li><a rel="nofollow" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>">发布职位</a></li>
	    						    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<!-- <span class="red" id="noticeDot-0"></span> -->
            		<i></i>
            	</dt>
                                	<dd><a rel="nofollow" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>">发布的职位</a></dd>
                	                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">我收到的简历</a></dd>
                	                	                	<!-- <dd><a href="delivery.html">我的公司主页 <span id="noticeNo" class="red">(1)</span></a></dd> -->
                	                	<!-- <dd class="btm"><a href="subscribe.html">我的订阅</a></dd> -->
                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update01&name=<%=bi.getBuName()%>">我的公司主页</a></dd>
                                                <dd><a href="account.jsp">帐号设置</a></dd>
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
            	<a class="btn_create" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiwei01&name=<%=bi.getBuName()%>">发布新职位</a>
                <dl class="company_center_aside">
		<dt>我收到的简历</dt> 
		<dd>
		<a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">收到的简历</a> 
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
		<a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>">发布的职位</a>
	</dd>
	
	</dl>
                <div class="subscribe_side mt20">
   <div class="f14">想收到更多更好的简历？</div>
   <div class="f18 mb10">就用握手招聘加速助手 </div>
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
                            <form  action="BusinessInfoServlet.do?op=zhiweishouyelist" method="post">
    			发布的职位  &nbsp;<input id="btntest" type="submit"  style="background:#93CEC1;color:white;font-size:17px;"   value="刷新职位"/>
   			 </form>  <span><i style="color:#fff;font-style:normal" id="positionNumber"></i></span>                    </h1>
                    
                    
                     
                    
                    
                    
                    </dt>
                    
                    
                    
                    <dd>
                    
                  			
                    
               
                     <c:forEach var="br" items="${businessRecruit}">
                    		                    	<form id="searchForm">
	                    		<input type="hidden" value="Publish" name="type">
			                	<ul class="reset my_jobs">
				                			                            	<li >
		                                    <h3>
		                                        <a >${br.brCity}</a> 
		                                        <span>${br.brJob}</span>
		                                        						                        		                                    </h3>
		                                    		                                  		<!-- <span class="receivedResumeNo"><a href="unHandleResumes.html?positionId=149594">应聘简历（1）</a></span> -->
		                                  			                                    <div>${br.brNature} / ${br.brMoney} / ${br.brExperience} / ${br.brEducation}</div>
		                                    		                                    				                                    <div class="c9">发布时间：${br.brTime} </div>
			                                    		                                    		                                    		                                    <div class="links">
		                                    			                                       	<a class="job_refres"  href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweiyulan&id=${br.brId}">预览</a>
		                                    			                                       
																								     
		                                    			                                       	
		                                       			                                       	
														                                       	<a  href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweishanchu&id=${br.brId}">下线</a>                      
														                                        
		                                    </div>
		                                    		                                </li>								
	                                	                           	</ul>
			                    			                </form>
			                    			                
			                    			                
			               
			                    	</c:forEach> 			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
			                    			                
		                                    </dd>
                </dl>
            </div><!-- end .content -->
<script src="style/js/job_list.min.js" type="text/javascript"></script> 
			<div class="clear"></div>
			<input type="hidden" value="74fb1ce14ebf4e2495270b0fbad64704" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="about.html">联系我们</a>
		    <a target="_blank" href="http://www.lagou.com/af/zhaopin.html">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">握手微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">握手微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>

<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>

<!--  -->
<script src="style/js/analytics01.js" type="text/javascript"></script><script type="text/javascript" src="style/js/h.js"></script>
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

<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div></body></html>