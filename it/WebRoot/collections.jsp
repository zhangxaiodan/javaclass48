<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="
">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>我收藏的职位-招聘服务-握手网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="握手网是3W旗下的互联网领域垂直招聘网站,互联网职业机会尽在握手网">
<meta name="keywords" content="握手,握手网,握手招聘,拉钩, 拉钩网 ,互联网招聘,握手互联网招聘, 移动互联网招聘, 垂直互联网招聘, 微信招聘, 微博招聘, 握手官网, 握手百科,跳槽, 高薪职位, 互联网圈子, IT招聘, 职场招聘, 猎头招聘,O2O招聘, LBS招聘, 社交招聘, 校园招聘, 校招,社会招聘,社招">
<meta content="QIQ6KC1oZ6" name="baidu-site-verification">

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jianli.js " charset="gb2312">
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
<script src="style/js/ajaxCross.json" charset="UTF-8"></script>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>

  <script type="text/javascript">
  $(function(){
  $("input").css("color","#019875").css("background-color","#ffffff");
  } );
  </script>
</head>
<body>
<%@include file="checkuser.jsp" %>
<c:if test="${empty requestScope.showlist}" >
   <script>location.href="UserResServlet.do?op=showcang";</script>
   return;
</c:if>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="h/">
    			<img width="229" height="43" alt="握手招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index.jsp">首页</a></li>
    			<li><a href="companylist.jsp">公司</a></li>
    				    			<li><a rel="nofollow" href="jianli.jsp">我的简历</a></li>
	    						    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span>${user.uiLoginName }&nbsp;</span> 
            		<span class="red dn" id="noticeDot-0"></span>
            		<i></i>
            	</dt>
                                	<dd><a rel="nofollow" href="jianli.html">我的简历</a></dd>
                	                	<dd><a href="collections.jsp">我收藏的职位</a></dd>
                	                	                	<dd class="btm"><a href="subscribe.jsp">我的订阅</a></dd>
                	<!-- <dd><a href="create.html">我要招人</a></dd> -->
                                               <!--  <dd><a href="accountBind.jsp">帐号设置</a></dd> -->
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                    <div class="dn" id="noticeTip">
            	<span class="bot"></span>
				<span class="top"></span>
				<a target="_blank" href="delivery.jsp"><strong>0</strong>条新投递反馈</a>
				<a class="closeNT" href="javascript:;"></a>
            </div>
                    </div>
    </div><!-- end #header -->
    <div id="container">
        <div class="clearfix">
            <div class="content_l">
            	<dl class="c_collections">
                    <dt>
                        <h1><em></em>我收藏的职位</h1>
                    </dt>
                    <dd>
                    <form id="collectionsForm" >
                    	                      
                            <ul class="reset my_collections">
                              
                            	 <c:forEach var="c" items="${showlist.list}">
                            	                             	<li data-id="148886">
                             		<a title="" target="_blank" href="toudi.jsp">
                             		
                             			<img  src="${c.bd.buLogo}">
                             		</a>
                             		
                             		<div class="co_item">
                             			<h2 title="${c.bi.biJob }">
                             		
	                                        <a target="_blank" href="toudi.jsp">
	                                        	<em>${c.bi.biJob }</em>  
	                                        	<span>${c.brMoney}</span>
	                                    	</a>
	                                    </h2>
	                                    <span class="co_time">发布时间：${c.brTime}</span>
	                                    <div class="co_cate">${c.brLikeJob }/ ${c.ai.arcity} / ${c.brExperience} /${c.brNature }/${c.brEducation }</div>
	                                    
	                                    <span class="co_youhuo c7">${c.brJobDescribe}</span>
                                       	   <a class="collection_link" target="_blank" href="toudi.jsp">投个简历</a>
                                          <i></i>
                                        <a class="collectionCancel collection_link collected" href="javascript:;">
                                            
                                           <!--  <input type="hidden" name="jno" value="${c.jid.jno }" id="jno"/> -->
                                            
                              
                                        	<input type="button" value="取消收藏" onclick="collectionsFormsava(${c.jid.jno })">
                                        	
                                        	
                                        	<span>已取消收藏</span>
                                        </a>
                               		</div>
                            	</li>
                            	      </c:forEach>      	
   <div align="center"> 
  <c:if test="${showlist.pageIndex>1 }">
     <a href="UserResServlet.do?op=showcang&index=1">首页</a>
     <a href="UserResServlet.do?op=showcang&index=${showlist.pageIndex-1}">上一页</a>
  </c:if>
  <c:if test="${showlist.pageIndex<showlist.totalPage }">
     <a href="UserResServlet.do?op=showcang&index=${showlist.pageIndex+1 } ">下一页</a>
     <a href="UserResServlet.do?op=showcang&index=${showlist.totalPage}">末页</a>
  </c:if>
  第${showlist.pageIndex }页/共${showlist.totalPage }页
  </div>
                            	                            </ul>
                 </form>
                                            </dd>
                </dl>
            </div>	
            

            <div class="content_r">
            	<div class="mycenterR" id="myInfo">
            		<h2>我的信息</h2>
            		<a href="collections.jsp">我收藏的职位</a>
            		<br>
            		            		<a target="_blank" href="subscribe.jsp">我订阅的职位</a>
            		            	</div><!--end #myInfo-->
            					<div class="greybg qrcode mt20">
                	<img width="242" height="242" alt="握手微信公众号二维码" src="style/images/qr_delivery.png">
                    <span class="c7">扫描握手二维码，微信轻松搜工作</span>
                </div>
            </div>
       	</div>
       	
  
       	
       	
<script src="style/js/collections.min.js"></script>
<script>
$(function(){
	$('.Pagination').pager({
	      currPage: 1,
	      pageNOName: "pageNo",
	      form: "collectionsForm",
	      pageCount: 1,
	      pageSize:  5
	});
});}
</script>

			<div class="clear"></div>
			<input type="hidden" value="4c6ae41d8c254f91becdb5f9ef2d4394" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a rel="nofollow" target="_blank" href="h/about.html">联系我们</a>
		    <a target="_blank" href="h/af/zhaopin.html">互联网公司导航</a>
		    <a rel="nofollow" target="_blank" href="http://e.weibo.com/lagou720">握手微博</a>
		    <a rel="nofollow" href="javascript:void(0)" class="footer_qr">握手微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action" target="_blank">京ICP备14023790号-2</a></div>
		</div>
	</div>

<script src="style/js/core.min.js" type="text/javascript"></script>
<script src="style/js/popup.min.js" type="text/javascript"></script>

<!--  -->

<script type="text/javascript">
/* $(function(){
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
} */
</script>

<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div>

</body></html>