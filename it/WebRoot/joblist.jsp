<%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html xmlns:wb="http://open.weibo.com/wb">
<head>
<script id="allmobilize" charset="utf-8" src="style/js/allmobilize.min.js"></script>
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate" media="handheld"  />
<!-- end 云适配 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>职位搜索-最专业的互联网招聘平台</title>
<meta property="qc:admins" content="23635710066417756375" />
<meta content="前端开发招聘  全国地区招聘 紫色医疗招聘前端开发,月薪:10k-20k,要求:本科及以上学历,3-5年工作经验。职位诱惑：借移动医疗大势享受坐直升飞机的职场发展 公司规模:15-50人移动互联网 ,健康医疗类公司招聘信息汇总  最新最热门互联网行业招聘信息，尽在拉勾网" name="description">
<meta content="前端开发招聘,全国地区前端开发招聘,紫色医疗招聘前端开发,移动互联网 类公司招聘信息汇总,健康医疗类公司招聘信息汇总,拉勾招聘,拉勾网,互联网招聘" name="keywords">
<meta name="baidu-site-verification" content="QIQ6KC1oZ6" />

 <meta charset="utf-8">
  <!-- <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css"  media="all"> -->
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->

<!-- <div class="web_root"  style="display:none">h</div> -->
<script type="text/javascript">
var ctx = "h";
console.log(1);
</script>
<!-- <script type="text/javascript">
		//跳转方法
		function topage(pageIndex){
			
			//表单提交
			$("form").submit();
		}

	</script> -->
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
	 <script type="text/javascript">
       $(document).ready(function(){
              var Uarry=$("#workplaceSelect  a");//获取所有的a元素
              $("#workplaceSelect a").click(function(){//点击事件
              		
                   
                   var Tresult=$(this).text();
                   
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
              var Uarry=$("#h1 div");//获取所有的div元素
              $("#h1 div").click(function(){//点击事件                   
                   var Tresult=$(this).text();
                   $("#budevelopment2").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
       
       
        $(document).ready(function(){
              var Uarry=$("#h2 div");//获取所有的div元素
              $("#h1 div").click(function(){//点击事件                   
                   var Tresult=$(this).text();
                   $("#budevelopment2").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
       
           $(document).ready(function(){
              var Uarry=$("#h3 div");//获取所有的div元素
              $("#h1 div").click(function(){//点击事件                   
                   var Tresult=$(this).text();
                   $("#budevelopment2").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
           
           $(document).ready(function(){
              var Uarry=$("#h4 div");//获取所有的div元素
              $("#h1 div").click(function(){//点击事件                   
                   var Tresult=$(this).text();
                   $("#budevelopment2").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
       
          $(document).ready(function(){
              var Uarry=$("#h5 div");//获取所有的div元素
              $("#h1 div").click(function(){//点击事件                   
                   var Tresult=$(this).text();
                   $("#budevelopment2").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
                  $("form").submit();
              }); 
       }); 
       
       
      
   </script> 
<link rel="Shortcut Icon" href="http://www.lagou.com/h/images/favicon.ico">
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
</head>
  		 <% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	 %> 		
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a href="index.html" class="logo">
    			<img src="style/images/logo.png" width="229" height="43" alt="拉勾招聘-专注互联网招聘" />
    		</a>
    		<ul class="reset" id="navheader">
    			<li ><a href="index.jsp">首页</a></li>    			
	    		    		</ul>
        	           
        	           
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
        
       	<div class="sidebar">
       		            <div id="options" class="greybg">
                                <dl >
                   	<dt>月薪范围 <em ></em></dt>
	                <dd id="h1">
	                    	                    	<div>2k以下</div>
	                    	                    	<div>2k-5k</div>
	                    	                    	<div>5k-10k</div>
	                    	                    	<div>10k-15k</div>
	                    	                    	<div>15k-25k</div>
	                    	                    	<div>25k-50k</div>
	                    	                    	<div>50k以上</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>工作经验 <em ></em></dt>
	                <dd id="h2">
	                    	                    	<div>不限</div>
	                    	                    	<div>应届毕业生</div>
	                    	                    	<div>1年以下</div>
	                    	                    	<div>1-3年</div>
	                    	                    	<div>3-5年</div>
	                    	                    	<div>5-10年</div>
	                    	                    	<div>10年以上</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>最低学历 <em ></em></dt>
	                <dd id="h3">
	                    	                    	<div>不限</div>
	                    	                    	<div>大专</div>
	                    	                    	<div>本科</div>
	                    	                    	<div>硕士</div>
	                    	                    	<div>博士</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>工作性质 <em ></em></dt>
	                <dd id="h4">
	                    	                    	<div>全职</div>
	                    	                    	<div>兼职</div>
	                    	                    	<div>实习</div>
	                    	                </dd> 
                </dl>
                                <dl >
                   	<dt>发布时间 <em ></em></dt>
	                <dd id="h5">
	                    	                    	<div>今天</div>
	                    	                    	<div>3天内</div>
	                    	                    	<div>一周内</div>
	                    	                    	<div>一月内</div>
	                    	                </dd> 
                </dl>
                            </div>
            
            <!-- QQ群 -->
            	            		            <div class="qq_group">
		            	加入<span>前端</span>QQ群
		            	<div class="f18">跟同行聊聊</div>
		            	<p>160541839</p>
		            </div>
		                                
            <!-- 对外合作广告位  -->
             	            		        	<a href="http://www.w3cplus.com/" target="_blank" class="partnersAd">
		            	<img src="style/images/w3cplus.png" width="230" height="80" alt="w3cplus" />
		            </a>
		            <a href="" target="_blank" class="partnersAd">
		            	<img src="style/images/jquery_school.jpg" width="230" height="80" alt="JQ学校" />
		            </a>
		                                	            <a href="http://linux.cn/" target="_blank" class="partnersAd">
	            	<img src="style/images/linuxcn.png" width="230" height="80" alt="Linux中文社区"  />
	            </a>
	            <a href="http://zt.zhubajie.com/zt/makesite? utm_source=lagou.com&utm_medium=referral&utm_campaign=BD-yl" target="_blank" class="partnersAd">
	            	<img src="style/images/zhubajie.jpg" width="230" height="80" alt="猪八戒" />
	            </a>
	            <a href="http://www.imooc.com" target="_blank" class="partnersAd">
	            	<img src="style/images/muke.jpg" width="230" height="80" alt="幕课网" />
	            </a>
	        	       	<!-- 	            <a href="http://www.osforce.cn/" target="_blank" class="partnersAd">
	            	<img src="style/images/osf-lg.jpg" width="230" height="80" alt="开源力量"  />
	            </a>
	         -->
        </div>
        
        <div class="content">
        
        <%-- <form id="jobForm" name="jobForm" method="post" action="<%=request.getContextPath()%>/JobServlet.do"> --%>
        	<div id="search_box">
		<form id="search" name="search" action="<%=request.getContextPath()%>/JobsServlet.do" method="get">
		<input type="hidden" name="pageIndex" id="pageIndex" value="1"/>
	    <input type="hidden" name="bucity1" id="bucity1" />
	    <input type="hidden" name="budevelopment2" id="budevelopment2" />
	    <input type="hidden" name="bubigjob3" id="bubigjob3" />
	    
        <ul id="searchType">
        	        	<li data-searchtype="1" class="type_selected">职位</li>
        	<li data-searchtype="4">公司</li>
        	        </ul>
        <div class="searchtype_arrow"></div>
        <input type="text" id="search_input" name = "kd"  tabindex="1" value="前端开发"  placeholder="请输入职位名称，如：产品经理"  style="width:300px; height:35px;font-size:20px"/>
        <input type="hidden" name="spc" id="spcInput" value="1"/>
        <input type="hidden" name="pl" id="plInput" value=""/>
        <input type="hidden" name="gj" id="gjInput" value=""/>
        <input type="hidden" name="xl" id="xlInput" value=""/>
        <input type="hidden" name="yx" id="yxInput" value=""/>
        <input type="hidden" name="gx" id="gxInput" value="" />
        <input type="hidden" name="st" id="stInput" value="" />
        <input type="hidden" name="labelWords" id="labelWords" value="label" />
        <input type="hidden" name="lc" id="lc" value="" />
        <input type="hidden" name="workAddress" id="workAddress" value=""/>
                <input type="hidden" name="city" id="cityInput" value="全国"/>
                <input type="submit" id="search_button" value="搜索" />
  </form>
</div>
<style>
.ui-autocomplete{width:488px;background:#fafafa !important;position: relative;z-index:10;border: 2px solid #91cebe;}
.ui-autocomplete-category{font-size:16px;color:#999;width:50px;position: absolute;z-index:11; right: 0px;/*top: 6px; */text-align:center;border-top: 1px dashed #e5e5e5;padding:5px 0;}
.ui-menu-item{ *width:439px;vertical-align: middle;position: relative;margin: 0px;margin-right: 50px !important;background:#fff;border-right: 1px dashed #ededed;}
.ui-menu-item a{display:block;overflow:hidden;}
</style>
<script type="text/javascript" src="style/js/search.min.js"></script>
<!-- <dl class="hotSearch">
	<dt>热门搜索：</dt>
	<dd><a  href="javascript:void(0)">Java</a></dd>
	<dd><a  href="javascript:void(0)">PHP</a></dd>
	<dd><a  href="javascript:void(0)">Android</a></dd>
	<dd><a  href="javascript:void(0)">iOS</a></dd>
	<dd><a  href="javascript:void(0)">前端</a></dd>
	<dd><a  href="javascript:void(0)">产品经理</a></dd>
	<dd><a  href="javascript:void(0)">UI</a></dd>
	<dd><a  href="javascript:void(0)">运营</a></dd>
	<dd><a  href="javascript:void(0)">BD</a></dd>
	<dd><a  href="javascript:void(0)">实习</a></dd>
</dl>	 -->		<div class="breakline"></div>
            <dl class="workplace" id="workplaceSelect">
                <dt class="fl">工作地点：</dt>
               	               	<dd >
                	<a href="javascript:void(0)" class="current">全国</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >北京</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >上海</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >广州</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >深圳</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >成都</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >杭州</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >武汉</a> 
                	                	|
                	               	</dd>
               	               	<dd >
                	<a href="javascript:void(0)" >南京</a> 
                	                	|
                	               	</dd>
               	               	<dd  class="more" >
                	<a href="javascript:void(0)" >其他</a> 
                	                	<div class="triangle citymore_arrow"></div>
                	               	</dd>
               	                <dd id="box_expectCity" class="searchlist_expectCity dn">
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
			    	  				    				    </dd>  
            </dl>
         
            <div id="tip_didi" class="dn">
            	<span>亲，“嘀嘀打车”已更名为“滴滴打车”了哦，我们已帮您自动跳转~</span>
            	<a  href="javascript:void(0)">我知道了</a>
            </div>
            
        
            	            
            	             <c:forEach var="j" items="${jobList}">
            	            
            	            <a name="page">
	                    		                    			                <li class="odd clearfix">
			                			                				                	<div class="hot_pos_l">
			                        <div class="mb10">
			                            <a href="javascript:void(0)" title="前端开发" target="_blank">${j.recruit.brJob}</a> 
			                            &nbsp;
			                            <span class="c9">[${j.recruit.brCity}]</span>
			                            			                        </div>
			                        <span><em class="c7">月薪：</em>${j.recruit.brMoney}</span>
			                        <span><em class="c7">经验：</em>${j.recruit.brExperience}</span>
			                        <span><em class="c7">最低学历： </em>${j.recruit.brEducation}</span>
			                        <br />
			                        <span><em class="c7">职位诱惑：</em>${j.buLable}</span>
			                        <br />
			                        <span>${j.recruit.brTime}发布</span>
			                    </div> 
						        <div class="hot_pos_r">
			                        <!-- <div class="apply">
			                        <a href="toudi.html" target="_blank">投个简历</a>
			                        				                        </div> -->
			                        <div class="mb10"><a href="javascript:void(0)" title="" target="_blank">${j.bujName}</a></div>
			                        <span><em class="c7">领域： </em>${j.buBigJob}</span>
			                        			                        <span><em class="c7">创始人：</em>${j.orName}</span>
			                        			                        <br />
			                        <span><em class="c7">阶段： </em>${j.buDevelopment}</span>
			                        <span><em class="c7">规模： </em>${j.buSize}</span>
			                        <ul class="companyTags reset">
			                            			                            				                            		<li>五险一金</li>
			                            				                            			                            				                            		<li>股票期权</li>
			                            				                            			                            				                            		<li>年度旅游</li>
			                            				                            			                        </ul>
			                    </div>
			                 </li>
			                 
			                 </a>
			                 </c:forEach>
			                 
			                
			                
	                    		                    			                        
			                
	                    		                    			              


            



			<div class="clear"></div>
			<input type="hidden" id="resubmitToken" value="" />
	    	<a id="backtop" title="回到顶部" rel="nofollow"></a>
	    	
	    	</form>
	    </div><!-- end #container -->
	</div><!-- end #body -->
	<div id="footer">
		<div class="wrapper">
			<a href="h/about.html" target="_blank" rel="nofollow">联系我们</a>
		    <a href="h/af/zhaopin.html" target="_blank">互联网公司导航</a>
		    <a href="http://e.weibo.com/lagou720" target="_blank" rel="nofollow">微博</a>
		    <a class="footer_qr" href="javascript:void(0)" rel="nofollow">微信<i></i></a>
			<div class="copyright">&copy;2013-2014 Lagou <a target="_blank" href="http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action">京ICP备14023790号-2</a></div>
		</div>
	</div>


<script type="text/javascript" src="style/js/core.min.js"></script>
<!-- <script type="text/javascript" src="style/js/popup.min.js"></script> -->


</body>
</html>