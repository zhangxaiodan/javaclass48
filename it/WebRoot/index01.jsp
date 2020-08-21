 <%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
</script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>基本信息-招聘服务-握手网-最专业的互联网招聘平台</title>
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
<script src="style/js/ajaxCross.json" charset="UTF-8"></script>

<script>
       $(document).ready(function(){
              var Uarry=$("#tcontent li");//获取所有的li元素
              $("#tcontent li").click(function(){//点击事件
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   $("#select_scale_hidden").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
              }); 
       });
       
       $(document).ready(function(){
              var Uarry=$("#tcontent1 li");//获取所有的li元素
              $("#tcontent1 li").click(function(){//点击事件
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   $("#select_industry_hidden").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
              }); 
       });
       
       
       
       
   </script>
  <script type="text/javascript">
  		$(document).ready(function(){
              $("#stepBtn").click(function(){//点击事件
              var buname=$("#buname").val();
				if(buname==null||buname==""){
			  		$("#msg").css("color","#FF5151");
	  				$("#msg").html(" &nbsp;☹公司全称不能为空!");
	  				$("#buname").focus();
	  				$("#stepBtn").attr("disabled",true);
	  				
  				return ;
  				}
  				
  			var buhomepage=$("#buhomepage").val();
		  	if(buhomepage==null||buhomepage==""){
		  		$("#msg1").css("color","#FF5151");
  				$("#msg1").html(" &nbsp;☹公司网址不能为空!");
  				$("#buhomepage").focus();
  				$("#stepBtn").attr("disabled",true);
  				
  				return ;
  			}	
  			
  			var buphone=$("#buphone").val();
		  	if(buphone==null||buphone==""){
		  		$("#msg2").css("color","#FF5151");
  				$("#msg2").html(" &nbsp;☹公司号码不能为空!");
  				$("#buphone").focus();
  				$("#stepBtn").attr("disabled",true);
  				
  				return ;
  			}	
  			
  				
           }); 
       });

  		function check(){
  		$("#stepBtn").attr("disabled",false);
  		var buname=$("#buname").val();
  		var sear=new RegExp('有限公司');
		  	if(buname==null||buname==""){
		  		$("#msg").css("color","#FF5151");
  				$("#msg").html(" &nbsp;☹公司全称不能为空!");
  				$("#stepBtn").attr("disabled",true);
  				$("#buname").focus();
  				return ;
  			}else if(sear.test(buname)==0){
		  		$("#msg").css("color","#FF5151");
  				$("#msg").html(" &nbsp;☹请输入正确的公司格式!如:北大青鸟信息技术有限公司");
  				$("#stepBtn").attr("disabled",true);
  				$("#buname").focus();
  				return ;
  			}
  			
		
	  		$.ajax({
	  			url:"BusinessInfoServlet.do",
	  			type:"post",
	  			data:"op=ajax&buname="+buname,//发送到servlet服务器的数据
	  			success:function(result){//成功执行回调函数
	  				if(result=="not"){
	  				
	  					$("#msg").css("color","#FF5151");
	  					$("#msg").html(" &nbsp;☹很抱歉，已经注册!");
	  					$("#stepBtn").attr("disabled",true);
	  					$("#buname").focus();
	  					
	  					return;
	  				}else{
	  					$("#msg").css("color","#3CB371");
	  					$("#msg").html(" &nbsp;☺未注册，可用！");
	  				}
	  			}
	  		});
  		}
  		
  		
  		
  		function check1(){
  		$("#stepBtn").attr("disabled",false);
  		var buhomepage=$("#buhomepage").val();
  		var sear=new RegExp('.com'||'www.');
		  	if(buhomepage==null||buhomepage==""){
		  		$("#msg1").css("color","#FF5151");
  				$("#msg1").html(" &nbsp;☹公司网址不能为空!");
  				$("#stepBtn").attr("disabled",true);
  				$("#buhomepage").focus();
  				return ;
  			}else if(sear.test(buhomepage)==0){
  				$("#msg1").css("color","#FF5151");
  				$("#msg1").html(" &nbsp;☹公司网址输入错误!请输入正确格式如:www.kgc.com");
  				$("#stepBtn").attr("disabled",true);
  				$("#buhomepage").focus();
  				return ;
  			}
  			else{
  				
  				$("#msg1").css("color","#3CB371");
	  			$("#msg1").html(" &nbsp;☺公司网址可用！");
  			}
	  		
  		}
  		
  		
  		
  		function check2(){
  		$("#stepBtn").attr("disabled",false);
  		var buphone=$("#buphone").val();
  		var sear=new RegExp('1'||'2'||'3'||'4'||'5'||'6'||'7'||'8'||'9'||'0'||'-'||'-');
		  	if(buphone==null||buphone==""){
		  		$("#msg2").css("color","#FF5151");
  				$("#msg2").html(" &nbsp;☹公司号码不能为空!");
  				$("#stepBtn").attr("disabled",true);
  				$("#buphone").focus();
  				return ;
  			}else if(sear.test(buphone)==0){
  				$("#msg2").css("color","#FF5151");
  				$("#msg2").html(" &nbsp;☹公司号码格式输入错误!");
  				$("#stepBtn").attr("disabled",true);
  				$("#buphone").focus();
  				return ;
  			}
  			else{
  				if(buphone.length>=8&&buphone.length<=11){
					$("#msg2").css("color","#3CB371");
					$("#msg2").html(" &nbsp;☺公司号码可用！");
	  			}else{
	  				$("#msg2").css("color","#FF5151");
	  				$("#msg2").html(" &nbsp;☹公司号码格式输入错误!");
	  				$("#stepBtn").attr("disabled",true);
	  				$("#buphone").focus();
  					return ;
	  			}
  			}
	  		
  		}
  		

  		
  		
  </script>




</head>



<% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	
	 %>
<body>
<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="index.html">
    			<img width="229" height="43" alt="握手招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="index01.jsp">首页</a></li>
    			<li class="current"><a href="index01.jsp" >公司</a></li>
    			
    				    			<li>
	    				<a rel="nofollow" href="index01.jsp">简历管理</a>
	    					    			</li>
	    				<li><a rel="nofollow" href="index01.jsp">发布职位</a></li>
	    		    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	<!-- <dd><a href="positions.html" disabled>我发布的职位</a></dd>
                	<dd><a href="positions.html" disabled>我收到的简历</a></dd>
                	<dd class="btm"><a href="myhome.html" disabled>我的公司主页</a></dd>
                	
                                                <dd><a href="accountBind.html" disabled>帐号设置</a></dd> -->
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                </div>
    </div><!-- end #header -->
    <div id="container">
          		

        <div class="content_mid">
        	<dl class="c_section c_section_mid">
                <dt>
                    <h2><em></em>填写公司信息</h2>
                </dt>
                <dd>
                
	                <form action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=add01" method="post" enctype="multipart/form-data">
	                	<div class="c_text_1">基本信息为必填项，是求职者加速了解公司的窗口，认真填写吧！</div>
	                	

	                	
	                	
	                    <h3>公司全称 </h3>
	                    <input type="text" name="buname" id="buname" placeholder="请输入公司详细名称" onblur="check();"/>
	                    <span id="msg" style="font-family:'黑体';font-size: 17px"> </span>
	                    
	                    <h3>公司简称</h3> 
	                    <input type="text" placeholder="请输入公司简称"  name="bujname" id="bujname" class="valid">	
	                    
	                    
	                    <h3>公司LOGO</h3> 
	                   	<div class="c_logo c_logo_pos">
	                    	<input type="file" title="上传公司LOGO" id="filename" name="filename"/>
		                        <div id="logoNo">
		                    		<span>上传公司LOGO</span> <br>
							                            尺寸：190*190px  <br>
							                            大小：小于5M
								</div>
								
	                    </div>
	                    
	                    
	                    
	                    <h3>公司网址</h3>
	                    <input type="text" placeholder="请输入公司网址" name="buhomepage" id="buhomepage"  onblur="check1();"/>	
	                    <span id="msg1" style="font-family:'黑体';font-size: 17px"> </span>
	                    
	                    
	                    <h3>所在城市</h3>
	                    <input type="text" placeholder="请输入工作城市，如：北京市" name="bucity" id="bucity">	
	                    
	                    
	                    
	                    <h3>行业领域</h3>
	                    <div>
		                    <input type="hidden" value="" name="select_industry_hidden" id="select_industry_hidden"> 
	                    	<input type="button" value="请选择行业领域" name="select_industry" id="select_industry" class="select">
	                    <div class="dn" id="box_industry"  style="display: none;">
		                        <ul class="reset" id="tcontent1">
   			                        		<li>移动互联网</li>
       		                        		<li>电子商务</li>
       		                        		<li>社交</li>
       		                        		<li>企业服务</li>
       		                        		<li>O2O</li>
       		                        		<li>教育</li>
       		                        		<li>文化艺术</li>
       		                        		<li>游戏</li>
       		                        		<li>在线旅游</li>
       		                        		<li>金融互联网</li>
       		                        		<li>健康医疗</li>
       		                        		<li>生活服务</li>
       		                        		<li>硬件</li>
       		                        		<li>搜索</li>
       		                        		<li>安全</li>
       		                        		<li>运动体育</li>
       		                        		<li>云计算\大数据</li>
       		                        		<li>移动广告</li>
       		                        		<li>社会化营销</li>
       		                        		<li>视频多媒体</li>
       		                        		<li>媒体</li>
       		                        		<li>智能家居</li>
       		                        		<li>分类信息</li>
       		                        		<li>招聘</li>
       		                        </ul>
		                    </div>	
	                    </div>
	                    
	                    
	                    
	                    <h3>公司规模</h3>
	                    <div>
		                    <input type="hidden" value="" name="select_scale_hidden" id="select_scale_hidden">
		                    <input type="button" value="请选择公司规模" id="select_scale" class="select">
		                    <div class="dn" id="box_scale" style="display: none;">
		                        <ul class="reset" id="tcontent">
	                            		<li>少于15人</li>
  		                            	<li>15-50人</li>
  		                            	<li>50-150人</li>
  		                            	<li>150-500人</li>
  		                            	<li>500-2000人</li>
  		                            	<li>2000人以上</li>
  		                        </ul>
		                    </div>	
	                    </div>
	                    
	                    
	                    
	                    <h3>发展阶段</h3> 
	                    <div>
		                    <input type="hidden" id="s_radio_hidden" name="s_radio_hidden" value="">
		                    <ul class="s_radio clearfix s_radio_ex">
   		                        	<li>初创型</li>
   		                        	<li>成长型</li>
   		                        	<li>成熟型</li>
   		                        	<li>已上市</li>
   		                        	
   		                    </ul>
	                    </div>
	                    
	              
	                    
	                    <h3>一句话介绍</h3> 
	                    <input type="text" placeholder="一句话概括公司亮点，如公司愿景、领导团队等，限50字" maxlength="50" name="temptation" id="temptation">	
	                    <span style="display:none;" class="error" id="beError"></span>
	                    
	                    
	                    
	                    
					<h3>公司类型</h3> 
                    <input type="text" placeholder="请输入公司公司类型，如股份有限公司"  name="butype" id="butype" class="valid">	

					
					

					<h3>公司联系电话</h3> 
                    <input type="text" placeholder="请输入公司联系电话"  name="buphone" id="buphone" class="valid" onblur="check2();"/>	
	                 <span id="msg2" style="font-family:'黑体';font-size: 17px"> </span>   
	                    
	                    
	                   <!--  <input type="hidden" id="companyId" name="companyId" value="25927">
	                    <input type="hidden" id="companyName" name="companyName" value="福建平潭协创进出口贸易有限公司"> -->
	                    <input type="submit"  value="保存，下一步" id="stepBtn" class="btn_big fr">
	                </form>
                </dd>
            </dl>
       	</div>











<!-------------------------------------弹窗lightbox  ----------------------------------------->
<div style="display:none;">
	<!--图片上传-->	
    <div style="width:650px;height:470px;" class="popup" id="logoUploader">
		<object width="650" height="470" classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" id="FlashID">
		  <param value="../../flash/avatar.swf?url=http://www.lagou.com/cd/saveProfileLogo.json" name="movie">
		  <param value="high" name="quality">
		  <param value="opaque" name="wmode">
		  <param value="111.0.0.0" name="swfversion">
		  <!-- 此 param 标签提示使用 Flash Player 6.0 r65 和更高版本的用户下载最新版本的 Flash Player。如果您不想让用户看到该提示，请将其删除。 -->
		  <param value="../../Scripts/expressInstall.swf" name="expressinstall">
		  <!-- 下一个对象标签用于非 IE 浏览器。所以使用 IECC 将其从 IE 隐藏。 -->
		  <!--[if !IE]>-->
		  <object width="650" height="470" data="../../flash/avatar.swf?url=http://www.lagou.com/cd/saveProfileLogo.json" type="application/x-shockwave-flash">
		    <!--<![endif]-->
		    <param value="high" name="quality">
		    <param value="opaque" name="wmode">
		    <param value="111.0.0.0" name="swfversion">
		    <param value="../../Scripts/expressInstall.swf" name="expressinstall">
		    <!-- 浏览器将以下替代内容显示给使用 Flash Player 6.0 和更低版本的用户。 -->
		    <div>
		      <h4>此页面上的内容需要较新版本的 Adobe Flash Player。</h4>
		      <p><a href="http://www.adobe.com/go/getflashplayer"><img width="112" height="33" src="style/images/get_flash_player.gif" alt="获取 Adobe Flash Player"></a></p>
		    </div>
		    <!--[if !IE]>-->
		  </object>
		  <!--<![endif]-->
		</object>
	</div><!-- #logoUploader -->
</div>
<!------------------------------------- end ----------------------------------------->

<script src="style/js/step1.min.js" type="text/javascript"></script>
<script>
var avatar = {};
avatar.uploadComplate = function( data ){
	var result = eval('('+ data +')');
	if(result.success){
		jQuery('#logoShow img').attr("src",ctx+ '/'+result.content);
		jQuery.colorbox.close();
		jQuery('#logoNo').hide();
		jQuery('#logoShow').show();
	}
};
</script>
			<div class="clear"></div>
			<input type="hidden" value="13ae35fedd9e45cdb66fb712318d7369" id="resubmitToken">
	    	<a rel="nofollow" title="回到顶部" id="backtop" style="display: none;"></a>
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


<div id="cboxOverlay" style="display: none;">
</div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;">
<div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div>
<div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div>
</div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div>
<div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div>
<div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious">
</button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button>
<div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;">
</div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;">
<div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;">
</div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div></body></html>