 <%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb">
<head>
<script id="allmobilize" charset="utf-8" src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld"  />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>全国-公司列表-握手网-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="全国condition-condition-公司列表-握手网-最专业的互联网招聘平台" name="description">
<meta content="全国condition-公司列表-握手网-最专业的互联网招聘平台" name="keywords">
<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<link rel="Shortcut Icon" href="h/images/favicon.ico">
<link rel="stylesheet" type="text/css" href="style/css/style.css"/>
<link rel="stylesheet" type="text/css" href="style/css/external.min.css"/>
<link rel="stylesheet" type="text/css" href="style/css/popup.css"/>
<script src="style/js/jquery.1.10.1.min.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/jquery.lib.min.js"></script>
<script src="style/js/ajaxfileupload.js" type="text/javascript"></script>
<script type="text/javascript" src="style/js/additional-methods.js"></script>
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script type="text/javascript" src="style/js/conv.js"></script>

<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
	<script type="text/javascript">
		//跳转方法
		function topage(pageIndex){
			//给隐藏域赋值
			$("#pageIndex").val(pageIndex);
			//表单提交
			$("form").submit();
		}

	</script>
	
	 <script type="text/javascript">
       $(document).ready(function(){
              var Uarry=$("#workplaceSelect li:lt(9)");//获取所有的li元素
              $("#workplaceSelect li:lt(9)").click(function(){//点击事件
              		/* $("#city li").addClass("current"); */
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   
                   if(Tresult=="全国"){
                   		$("#bucity1").val("");
                   		
                   }else{
                   		$("#bucity1").val(Tresult); 
                   }
                  
					/*alert(Tresult); */
                   $("form").submit();
                    
                  /*  var v=$(this).text(); alert(v);  */
              }); 
       });
       
       
       
        $(document).ready(function(){
              var Uarry=$("#haha1 a");//获取所有的li元素
              $("#haha1 a").click(function(){//点击事件
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   $("#budevelopment2").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
       
       
        $(document).ready(function(){
              var Uarry=$("#haha2 a");//获取所有的li元素
              $("#haha2 a").click(function(){//点击事件
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   $("#bubigjob3").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
       
       
      
   </script> 
</head>


<% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	 %> 

<body>

		 <c:if test="${page==null}">
  			<script>location.href="BusinessInfoServlet.do?op=zhiweidashouyelist";</script>
  			return;
  		</c:if> 


<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a href="index.html" class="logo">
    			<img src="style/images/logo.png" width="229" height="43" alt="专注互联网招聘" />
    		</a>
    		<ul class="reset" id="navheader">
    			<li ><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=dadashouye&name=<%=bi.getBuName()%>">首页</a></li>
    			<li class="current"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweidsy&name=<%=bi.getBuName()%>" >公司</a></li>
    			<!-- <li ><a href="h/toForum.html" target="_blank">论坛</a></li> -->
    				    			<li ><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>" rel="nofollow">简历管理</a></li>
	    							    			<li ><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiwei01&name=<%=bi.getBuName()%>" rel="nofollow">发布职位</a></li>
	    		    		</ul>
        	            <dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<!-- <span class="red" id="noticeDot-0"></span> -->
            		<i></i>
            	</dt>
                                	<dd><a rel="nofollow" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>">我发布的职位</a></dd>
                	                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">我收到的简历</a></dd>
                	                	                	<!-- <dd><a href="delivery.html">我的公司主页 <span id="noticeNo" class="red">(1)</span></a></dd> -->
                	                	<!-- <dd class="btm"><a href="subscribe.html">我的订阅</a></dd> -->
                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update01&name=<%=bi.getBuName()%>">我的公司主页</a></dd>
                                                <dd><a href="account.jsp">帐号设置</a></dd>
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                </div>
    </div><!-- end #header -->
    <div id="container">
        
        <div class="clearfix">
            <div class="content_l">
            	<form id="companyListForm" name="companyListForm" method="post" action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweidashouyelist">
	                <input type="hidden" name="pageIndex" id="pageIndex" value="1"/>
	                <input type="hidden" name="bucity1" id="bucity1" />
	                <input type="hidden" name="budevelopment2" id="budevelopment2" />
	                <input type="hidden" name="bubigjob3" id="bubigjob3" />
	                
	                
	                
	                <!-- <input type="hidden" id="city" name="city" value="全国" />
	                <input type="hidden" id="fs" name="fs" value="" />
	                <input type="hidden" id="ifs" name="ifs" value="" />
	                <input type="hidden" id="ol" name="ol" value="" /> -->
	                <dl class="hc_tag">
	                    <dt>
	                       <!--  <h2 class="fl">热门公司</h2> -->
	                        <ul class="workplace reset fr" id="workplaceSelect">
	                        	    <li ><a href="javascript:void(0)" >全国</a></li>
                                	<li ><a href="javascript:void(0)" >北京</a></li>
	                                <li ><a href="javascript:void(0)" >上海</a></li>
	                                <li ><a href="javascript:void(0)" >广州</a></li>
	                                <li ><a href="javascript:void(0)" >深圳</a></li>
	                                <li ><a href="javascript:void(0)" >成都</a></li>
	                                <li ><a href="javascript:void(0)" >杭州</a></li>
	                                <li ><a href="javascript:void(0)" >武汉</a></li>
	                                <li ><a href="javascript:void(0)" >南京</a></li>
	                                
	                                <li  class="more" ><a href="javascript:void(0)" >其他</a> 
                                	<div class="triangle citymore_arrow"></div></li>
	                            	<li id="box_expectCity" class="searchlist_expectCity dn">
					            	<span class="bot"></span>
					            	<span class="top"></span>
						    								    										    							    										    		<dl>
							    			<dt>ABCDEF</dt>
							    			<dd>
									     				<span>北京</span>
									     				<span>长春</span>
									     				<span>成都</span>
									     				<span>重庆</span>
									     				<span>长沙</span>
									     				<span>常州</span>
									     				<span>东莞</span>
									     				<span>大连</span>
									     				<span>佛山</span>
									     				<span>福州</span>
									    			</dd>
							    	  	</dl>
							    	  								    							    										    		<dl>
							    			<dt>GHIJ</dt>
					    				<dd>
										     				<span>贵阳</span>
										     				<span>广州</span>
										     				<span>哈尔滨</span>
										     				<span>合肥</span>
										     				<span>海口</span>
										     				<span>杭州</span>
										     				<span>惠州</span>
										     				<span>金华</span>
										     				<span>济南</span>
										     				<span>嘉兴</span>
										    			</dd>
							    	  	</dl>
							    	  								    							    										    		<dl>
							    			<dt>KLMN</dt>
							    			<dd>
   										     				<span>昆明</span>
   										     				<span>廊坊</span>
   										     				<span>宁波</span>
   										     				<span>南昌</span>
   										     				<span>南京</span>
   										     				<span>南宁</span>
   										     				<span>南通</span>
   										    			</dd>
							    	  	</dl>
							    	  								    							    										    		<dl>
							    			<dt>OPQR</dt>
							    			<dd>
   										     				<span>青岛</span>
   										     				<span>泉州</span>
   										    			</dd>
							    	  	</dl>
							    	  								    							    										    		<dl>
							    			<dt>STUV</dt>
							    			<dd>
							     				<span>上海</span>
							     				<span>石家庄</span>
							     				<span>绍兴</span>
							     				<span>沈阳</span>
							     				<span>深圳</span>
							     				<span>苏州</span>
							     				<span>天津</span>
							     				<span>太原</span>
							     				<span>台州</span>
							    			</dd>
							    	  	</dl>
							    	  								    							    										    		<dl>
							    			<dt>WXYZ</dt>
							    			<dd>
							     				<span>武汉</span>
							     				<span>无锡</span>
							     				<span>温州</span>
							     				<span>西安</span>
							     				<span>厦门</span>
							     				<span>烟台</span>
							     				<span>珠海</span>
							     				<span>中山</span>
							     				<span>郑州</span>
							    			</dd>
							    	  	</dl>
							    	  								    								    </li>
	                        </ul>
	                    </dt>
	                    <dd>
	                        <dl>
	                            <dt>发展阶段：</dt>
	                            <dd id="haha1">
                                <a href="javascript:void(0)">初创型</a>
 		                            			    <a href="javascript:void(0)">成长型</a>
 		                            			   <a href="javascript:void(0)">成熟型</a>
 		                            			   <a href="javascript:void(0)">已上市</a>
    	                            </dd>
	                        </dl>
	                        <dl>
	                            <dt>行业领域：</dt>
	                            <dd id="haha2">
                                			<a href="javascript:void(0)">移动互联网</a>
 			                                <a href="javascript:void(0)">电子商务</a>
 			                                <a href="javascript:void(0)">社交</a>
 			                                <a href="javascript:void(0)">企业服务</a>
 			                                <a href="javascript:void(0)">O2O</a>
 			                                <a href="javascript:void(0)">教育</a>
 			                                <a href="javascript:void(0)">文化艺术</a>
 			                                <a href="javascript:void(0)">游戏</a>
 			                                <a href="javascript:void(0)">在线旅游</a>
 			                                <a href="javascript:void(0)">金融互联网</a>
 			                                <a href="javascript:void(0)">健康医疗</a>
 			                                <a href="javascript:void(0)">生活服务</a>
 			                                <a href="javascript:void(0)">硬件</a>
 			                                <a href="javascript:void(0)">搜索</a>
 			                                <a href="javascript:void(0)">安全</a>
 			                                <a href="javascript:void(0)">运动体育</a>
 			                                <a href="javascript:void(0)">云计算\大数据</a>
 			                                <a href="javascript:void(0)">移动广告</a>
 			                                <a href="javascript:void(0)">社会化营销</a>
 			                                <a href="javascript:void(0)">视频多媒体</a>
 			                                <a href="javascript:void(0)">媒体</a>
 			                                <a href="javascript:void(0)">智能家居</a>
 			                                <a href="javascript:void(0)">智能电视</a>
 			                                <a href="javascript:void(0)">分类信息</a>
 			                                <a href="javascript:void(0)">招聘</a>
                           </dd>
	                        </dl>
	                        
	                    </dd>
	                </dl>
	               	                	<ul class="hc_list reset">
		                  		               		                        
		                        <c:forEach var="e" items="${page.list}">
		                         
		                       		                    		                      
		                         <li >
			                        <a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweixijie&id=${e.recruit.brId}&name=<%=bi.getBuName()%>" >
			                        	<h3 title="${e.buName }">${e.buName }</h3>
			                        	<div class="comLogo">
				                        	<img src="${e.buLogo}" width="190" height="190" alt="${e.bujName}" />
				                        	<ul>
				                        		<li>${e.buBigJob}</li>
				                        		<li>${e.buCity}</li>
				                        	</ul>
			                        	</div>
                  							 </a>
                   			                        	<a href="h/jobs/149014.html" target="_blank"> ${e.recruit.brJob}</a>
                   			                        <ul class="reset ctags">
                   				                        			<li>${e.buDevelopment}</li><li>${e.buLable}</li>
														
							                        </ul>
			                    </li>
			                   <%--  </c:if> --%>
			                    </c:forEach>
			                    
			                    
		                        		 </ul>
		                
		                		               	<div class="Pagination" align="center">
		                		               	
		                		               			
	   		<c:if test="${page.pageIndex>1 }">
	   			<a href="javascript:topage(1)">首页</a>
	   			<a href="javascript:topage(${page.pageIndex-1 })">上一页</a>
	   		</c:if>
	   		<c:if test="${page.pageIndex<page.totalPage }">
	   			<a href="javascript:topage(${page.pageIndex+1 })">下一页</a>
	   			<a href="javascript:topage(${page.totalPage })">末页</a>
	   		</c:if>
	   		<span>第${page.pageIndex }页 | 共${page.totalPage }页</span>
  				
		          </div>
		      		</form>
            </div>	
            <div class="content_r">
            	 
                <div class="greybg qrcode mt20">
                	<img src="style/images/companylist_qr.png" width="242" height="242" alt="握手微信公众号二维码" />
                    <span class="c7">扫描握手二维码，微信轻松搜工作</span>
                </div>
               	<!-- <a href="h/speed/speed3.html" target="_blank" class="adSpeed"></a> -->
                <a href="h/subject/jobguide.html" target="_blank" class="eventAd">
               		<img src="style/images/subject280.jpg" width="280" height="135" />
               	</a>
               	<a href="h/subject/risingPrice.html" target="_blank" class="eventAd">
               		<img src="style/images/rising280.png" width="280" height="135" />
               	</a>
            </div>
       	</div>
   	
   	<input type="hidden" value="" name="userid" id="userid" />
      
<script type="text/javascript" src="style/js/company_list.min.js"></script>
<!-- <script>
$(function(){
	/*分页 */
 	 	 $('.Pagination').pager({
	      currPage: 2,
	      pageNOName: "1",
	      form: "companyListForm",
	      pageCount: 1,
	      pageSize: 11
	});	
})
</script>       	
			 --><div class="clear"></div>
			<input type="hidden" id="resubmitToken" value="" />
	    	<a id="backtop" title="回到顶部" rel="nofollow"></a>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a href="h/about.html" target="_blank" rel="nofollow">联系我们</a>
		    <a href="h/af/zhaopin.html" target="_blank">互联网公司导航</a>
		    <a href="http://e.weibo.com/lagou720" target="_blank" rel="nofollow">握手微博</a>
		    <a class="footer_qr" href="javascript:void(0)" rel="nofollow">握手微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a target="_blank" href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action">京ICP备14023790号-2</a></div>
		</div>
	</div>

<script type="text/javascript" src="style/js/core.min.js"></script>
<script type="text/javascript" src="style/js/popup.min.js"></script>

<!--  -->

</body>
</html>
