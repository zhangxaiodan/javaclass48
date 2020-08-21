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
       
       
       
       $(document).ready(function(){
              $("#stepBtn").click(function(){//点击事件
              var filename=$("#filename").val();
				if(filename==null||filename==""){
			  		$("#msg").css("color","#FF5151");
	  				$("#msg").html(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;☹请上传营业执照!");
	  				$("#stepBtn").attr("disabled",true);
  				return ;
  				}else{
  				
  				$("#msg").css("color","#3CB371");
	  			$("#msg").html(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;☺上传成功!");
  			}
  				
           }); 
       });

       
       function check(){
  		$("#stepBtn").attr("disabled",false);
  		var filename=$("#filename").val();
		  	if(filename==null||filename==""){
		  		$("#msg").css("color","#FF5151");
  				$("#msg").html(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;☹请上传营业执照!");
  				$("#stepBtn").attr("disabled",true);
  				$("#filename").focus();
  				return ;
  			}else{
  				
  				$("#msg").css("color","#3CB371");
	  			$("#msg").html(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;☺上传成功!");
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
    			<li><a href="index02.jsp">首页</a></li>
    			<li class="current"><a href="index02.jsp">公司</a></li>
    			
    				    			<li>
	    				<a rel="nofollow" href="index02.jsp">简历管理</a>
	    					    			</li>
	    							    			<li><a rel="nofollow" href="index02.jsp">发布职位</a></li>
	    		    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	<!-- <dd><a href="positions.html">我发布的职位</a></dd>
                	<dd><a href="positions.html">我收到的简历</a></dd>
                	<dd class="btm"><a href="myhome.html">我的公司主页</a></dd>
                	
                                                <dd><a href="accountBind.html">帐号设置</a></dd> -->
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
                
	                <form action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=add02" method="post" enctype="multipart/form-data">
	                	<div class="c_text_1">基本信息为必填项，是求职者加速了解公司的窗口，认真填写吧！</div>
	                	

	                    
	                    <h3>公司营业执照</h3> 
	                   	<div class="c_logo c_logo_pos">
	                    	<input type="file" title="上传公司营业执照" id="filename" name="filename" onblur="check();"/>
		                        <div id="logoNo">
		                    		<span>上传公司营业执照</span> <br>
							                            尺寸：190*190px  <br>
							                            大小：小于5M
								</div>
								
	                    </div>
	                    <span id="msg" style="font-family:'黑体';font-size: 17px"> </span>
	                    
	                    
	                    
	                    
	                    
	                    <h3>公司标签</h3>
	                    <div>
		                    <input type="hidden" value="" name="select_industry_hidden" id="select_industry_hidden"> 
	                    	<input type="button" value="请选择公司标签" name="select_industry" id="select_industry" class="select">
	                    <div class="dn" id="box_industry"  style="display: none;">
		                        <ul class="reset" id="tcontent1">
   			                        		<li>年终分红</li>
       		                        		<li>绩效奖金</li>
       		                        		<li>股票期权</li>
       		                        		<li>年底双薪</li>
       		                        		
       		                        		<li>五险一金</li>
       		                        		<li>通讯津贴</li>
       		                        		<li>交通补助</li>
       		                        		<li>带薪年假</li>
       		                        		
       		                        		<li>免费班车</li>
       		                        		<li>年度旅游</li>
       		                        		<li>弹性工作</li>
       		                        		<li>定期体检</li>
       		                        		
       		                        		<li>岗位晋升</li>
       		                        		<li>技能培训</li>
       		                        		<li>扁平管理</li>
       		                        		<li>专项奖金</li>
       		                        </ul>
		                    </div>	
	                    </div>
	                    
	                    
	                    
	                   
	                    
	                    
	                    
	                    
	              
	                    
	                    
	                    
	                    
	                   <!--  <input type="hidden" id="companyId" name="companyId" value="25927">
	                    <input type="hidden" id="companyName" name="companyName" value="福建平潭协创进出口贸易有限公司"> -->
	                    <input type="submit" value="保存，下一步" id="stepBtn" class="btn_big fr">
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