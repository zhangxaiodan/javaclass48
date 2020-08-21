 
<%@page import="com.kgc.pojo.BusinessInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE HTML>
<html xmlns:wb="http://open.weibo.com/wb"><head>
</script><script type="text/javascript" async="" src="style/js/conversion.js"></script><script src="style/js/allmobilize.min.js" charset="utf-8" id="allmobilize"></script><style type="text/css"></style>
<meta content="no-siteapp" http-equiv="Cache-Control">
<link  media="handheld" rel="alternate">
<!-- end 云适配 -->
<meta content="text/html; charset=utf-8" http-equiv="Content-Type">
<title>平潭协创进出口贸易有限公司-握手网-最专业的互联网招聘平台</title>
<meta content="23635710066417756375" property="qc:admins">
<meta name="description" content="平潭协创进出口贸易有限公司 福建平潭协创进出口贸易有限公司 上海 移动互联网 天使轮 150-500人 测试的发打发打发大范德萨发">
<meta name="keywords" content="平潭协创进出口贸易有限公司 福建平潭协创进出口贸易有限公司 上海 移动互联网 天使轮 150-500人 测试的发打发打发大范德萨发">
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
<!-- <script src="style/js/additional-methods.js" type="text/javascript"></script> -->
<!--[if lte IE 8]>
    <script type="text/javascript" src="style/js/excanvas.js"></script>
<![endif]-->
<script type="text/javascript">
var youdao_conv_id = 271546; 
</script> 
<script src="style/js/conv.js" type="text/javascript"></script>
<script src="style/js/ajaxCross.json" charset="UTF-8"></script>


<script >
$(function() {
	/*原理是把本地图片路径："D(盘符):/image/..."转为"http://..."格式路径来进行显示图片*/
	$("#logo").change(function() {
		var $file = $(this);
		var objUrl = $file[0].files[0];
		//获得一个http格式的url路径:mozilla(firefox)||webkit or chrome
		var windowURL = window.URL || window.webkitURL;
		//createObjectURL创建一个指向该参数对象(图片)的URL
		var dataURL;
		dataURL = windowURL.createObjectURL(objUrl);
		$("#imageview").attr("src",dataURL);
		$("#imageview1").attr("src",dataURL);
	});
});
</script>

<script >
$(function() {
	/*原理是把本地图片路径："D(盘符):/image/..."转为"http://..."格式路径来进行显示图片*/
	$("#myfiles0").change(function() {
		var $file = $(this);
		var objUrl = $file[0].files[0];
		//获得一个http格式的url路径:mozilla(firefox)||webkit or chrome
		var windowURL = window.URL || window.webkitURL;
		//createObjectURL创建一个指向该参数对象(图片)的URL
		var dataURL;
		dataURL = windowURL.createObjectURL(objUrl);
		 $("#haha1").attr("src",dataURL); 
		 $("#haha2").attr("src",dataURL);
		 $("#haha3").attr("src",dataURL); 
	});
});
</script>



<script>
       $(document).ready(function(){
              var Uarry=$("#ren li");//获取所有的li元素
              $("#ren li").click(function(){//点击事件
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   $("#companySize").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
              }); 
       });
       
        $(document).ready(function(){
              var Uarry=$("#xing li");//获取所有的li元素
              $("#xing li").click(function(){//点击事件
                   var count=$(this).index();//获取li的下标
                   var Tresult=Uarry.eq(count).text();
                   $("#financeStage").val(Tresult);
                  /*  var v=$(this).text(); alert(v);  */
              }); 
       });
      
   </script>




</head>


<body>



<% 
	
	BusinessInfo bi=(BusinessInfo)session.getAttribute("BusinessInfo"); 
	 %>


<div id="body">
	<div id="header">
    	<div class="wrapper">
    		<a class="logo" href="index.html">
    			<img width="229" height="43" alt="握手招聘-专注互联网招聘" src="style/images/logo.png">
    		</a>
    		<ul id="navheader" class="reset">
    			<li><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=dadashouye&name=<%=bi.getBuName()%>">首页</a></li>
    			<li class="current"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweidsy&name=<%=bi.getBuName()%>">公司</a></li>
    				    			<li>
	    				<a rel="nofollow" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">简历管理</a>
	    					    			</li>
	    							    			<li><a rel="nofollow" href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiwei01&name=<%=bi.getBuName()%>">发布职位</a></li>
	    		    		</ul>
        	        	<dl class="collapsible_menu">
            	<dt>
           			<span><%=bi.getBuEmail()%>&nbsp;</span> 
            		<span class="red dn" id="noticeDot-1"></span>
            		<i></i>
            	</dt>
                                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=zhiweisy&name=<%=bi.getBuName()%>">我发布的职位</a></dd>
                	<dd><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=gongsijianli&name=<%=bi.getBuName()%>">我收到的简历</a></dd>
                	<dd class="btm"><a href="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update01&name=<%=bi.getBuName()%>">我的公司主页</a></dd>
                	 <!-- <dd><a href="jianli.html">我要找工作</a></dd>  -->
                                                <dd><a href="account.jsp">帐号设置</a></dd>
                                <dd class="logout"><a rel="nofollow" href="login.jsp">退出</a></dd>
            </dl>
                                </div>
    </div><!-- end #header -->
    
    
    
    
    
    
    
    
    
    
    <div id="container">
        <div class="clearfix">			
            <div class="content_l">           
	                <div class="c_detail">
	                	<div style="background-color:#fff;" class="c_logo">
		                	<a title="上传公司LOGO" id="logoShow" class="inline cboxElement" href="#logoUploader">
		                		<img width="190"  height="190" alt="公司logo" src="<%=bi.getBuLogo() %>">                        	
	                        	<span>更换公司LOGO<br>190px*190px 小于5M</span>
	                        </a>
		                </div>
		                
		                <div class="c_logo" style="background-color:#fff;">
			                <div id="logoShow">
			                	<img src="<%=bi.getBuLogo() %>" id="imageview1" width="190" height="190" alt="公司logo" />
		                        <span>更换公司LOGO<br />190px*190px 小于5M</span>
		                    </div>
		                    <input onchange="img_check(this,'<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update03&id=<%=bi.getBuId()%>',25927,'logo');" type="file" id="logo" name="logo" title="支持jpg、jpeg、gif、png格式，文件小于5M" />
			            </div>
		                <span class="error" id="logo_error" style="display:none;"></span>       
	                <div class="c_box companyName">	<br/>
	                    		                   			<h2 title="公司名称"><%=bi.getBuName() %></h2>
	                   			                        
	                        	                        	
                        		
	                        	
	                        	                        <div class="clear"></div>
	                       	
	                       		                   			<h1 title="<%=bi.getBuName() %>" class="fullname"><%=bi.getBuName() %></h1>
	                        	                        
	                        <form class="clear editDetail dn"  action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update02&id=<%=bi.getBuId()%>" method="post" >
	                            <input type="text" placeholder="请输入公司简称" maxlength="15" value="<%=bi.getBujName() %>" name="companyShortName" id="companyShortName" class="valid">
	                            <input type="text" placeholder="一句话描述公司优势，核心价值，限50字" maxlength="50" value="<%=bi.getBuIntroduce() %>" name="companyFeature" id="companyFeatures" class="valid">
	                            
	                            <input type="submit" value="保存" id="saveDetail" class="btn_small">
	                            <a id="cancelDetail" class="btn_cancel_s" >取消</a>
		                    </form>
	                            
	                        <div class="clear oneword" style="display: block;"><img width="17" height="15" src="style/images/quote_l.png">&nbsp; 
	                        <span><%=bi.getBuIntroduce() %></span> 
	                        &nbsp;<img width="17" height="15" src="style/images/quote_r.png"></div>
	                        <h3 class="dn">已选择标签</h3>
	                        <ul style="overflow:auto" id="hasLabels" class="reset clearfix">
	                        		<li><span><%=bi.getBuLable()%></span></li>
		                        		                      	
		                        	                            <!-- <li class="link">编辑</li> -->
	                        </ul>
	                        
	                    </div>
	                    <a title="编辑基本信息" class="c_edit" id="editCompanyDetail" href="javascript:void(0);" style="display: block;"></a>
	                	<div class="clear"></div>
	                </div>
                
                	<div class="c_breakline"></div>
       
       				<div id="Product">
        					        				
	        					<div class="product_wrap">

						    		 <!--无产品 -->
									<dl class="c_section dn">
					                	<dt>
					                    	<h2><em></em>公司产品</h2>
					                    </dt>
					                    <dd>
					                    	<div class="addnew">
					                        	酒香不怕巷子深已经过时啦！<br>
												把自己优秀的产品展示出来吸引人才围观吧！<br>
					                            <a class="product_edit" href="javascript:void(0)">+添加公司产品</a>
					                        </div>
					                    </dd>
					                </dl> 
	                
					            	<!--产品编辑-->
					                <dl id="newProduct" class="newProduct dn">
					                	<dt>
					                    	<h2><em></em>公司产品</h2>
					                    </dt>
					                    <dd>
					                        <form method="post" class="productForm" action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update04&id=<%=bi.getBuId()%>"   enctype="multipart/form-data">
					                            <div class="new_product">
					                            	
							                            <div class="product_upload dn productNo">
							                                <div style="background-color: rgb(147, 183, 187);">
							                                	<span>上传产品图片</span> 
							                                    <br>	
							                                   		 尺寸：380*220px  	大小：小于5M
							                                </div>
							                            </div>
							                            <div class="product_upload productShow">
							                            	<img width="380" height="220" id="haha1" src="<%=bi.getPrPicture()%>">
								                        	<span>更换产品图片<br>380*220px 小于5M</span>
								                        </div>
							                        <input type="file" title="支持jpg、jpeg、gif、png格式，文件小于5M"  name="myfiles" id="myfiles0">
							                    	
							                    </div>
					                            <div class="cp_intro">
					                               	<input type="text" placeholder="请输入产品名称" value="<%=bi.getPrName()%>" name="product" class="valid">	
					                                <input type="text" placeholder="请输入产品网址" value="<%=bi.getPrAddress()%>" name="productUrl" class="valid">	
					                                <textarea placeholder="请简短描述该产品定位、产品特色、用户群体等" maxlength="500" value="<%=bi.getPrIntroduce()%>" class="s_textarea valid" name="productProhaha"><%=bi.getPrIntroduce()%></textarea>	
					                                <div class="word_count fr">你还可以输入 <span>437</span> 字</div>
					                                <div class="clear"></div>
					                                <input type="submit" value="保存" class="btn_small">
					                               
					                        		<input type="hidden" value="11867" class="product_id">
					                            </div>
											</form>
					                    </dd>
					                </dl>
					                <!--有产品-->
					                <dl class="c_product">
					                	<dt>
					                    	<h2><em></em>公司产品</h2>
					                    </dt>
					                    <dd>
					                    	<img width="380" height="220" alt="" id="haha3" src="<%=bi.getPrPicture()%>">
				                        	<div class="cp_intro">
				                        						                        		<h3><a target="_blank" href="http://www.zmtpost.com"><%=bi.getPrName() %></a></h3>
					                            <div class="scroll-pane" style="overflow: hidden; padding: 0px; width: 260px;">
					                            	
					                            <div class="jspContainer" style="width: 260px; height: 140px;"><div class="jspPane" style="padding: 0px; top: 0px; width: 260px;"><div><%=bi.getPrIntroduce() %></div></div></div></div>
					                        </div>
					                        <a title="编辑公司产品" class="c_edit product_edit" href="javascript:void(0)"></a>
					            								            			<!-- <a title="新增公司产品" class="c_add product_add" href="javascript:void(0)"></a> -->
					            								                    </dd>
					                </dl>
	            
	              				</div>
       								        						    			        			</div>   <!-- end #Product --> 
       	
       				<div id="Profile">
			            				        	<div class="profile_wrap">
					             <!--无介绍 -->
									<dl class="c_section dn" style="display: none;">
					                	<dt>
					                    	<h2><em></em>公司介绍</h2>
					                    </dt>
					                    <dd>
					                    	<div class="addnew">
					                        	详细公司的发展历程、让求职者更加了解你!<br>
					                            <a id="addIntro" href="javascript:void(0)">+添加公司介绍</a>
					                        </div>
					                    </dd>
					                </dl>
					            <!--编辑介绍-->
					                <dl class="c_section newIntro dn" style="display: none;">
					                    <dt>
					                        <h2><em></em>公司介绍</h2>
					                    </dt>
					                    <dd>
						                    <form id="companyDesForm" action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update05&id=<%=bi.getBuId()%>" method="post">
						                        <textarea placeholder="请分段详细描述公司简介、企业文化等" name="companyProfile" id="companyProfile" class="valid"><%=bi.getBuxIntroduce() %></textarea>		                                        
						                        <div class="word_count fr">你还可以输入 <span>955</span> 字</div>
						                        <div class="clear"></div>
						                        <input type="submit" value="保存" id="submitProfile" class="btn_small">
						                        <a id="delProfile" class="btn_cancel_s" href="javascript:void(0)">取消</a>
						                    </form>
					                    </dd>
					                </dl>
					            
					            <!--有介绍-->
					               <dl class="c_section" style="display: block;">
					               		<dt>
					                   		<h2><em></em>公司介绍</h2>
					                   	</dt>
					                   	<dd>
					                   		<div class="c_intro"><%=bi.getBuxIntroduce() %></div>
					                   		<a title="编辑公司介绍" id="editIntro" class="c_edit" href="javascript:void(0)"></a>
					                   	</dd>
					               	</dl>
				            </div>
				                 	
	     			</div><!-- end #Profile -->
      	
      	<!--[if IE 7]> <br /> <![endif]-->
	    
	        	 		
	          	
	          	<input type="hidden" value="" name="hasNextPage" id="hasNextPage">
	          	<input type="hidden" value="" name="pageNo" id="pageNo">
	          	<input type="hidden" value="" name="pageSize" id="pageSize">
          		<div id="flag"></div>
            </div>	<!-- end .content_l -->
            
            <div class="content_r">
            	<div id="Tags">
	            	<div id="c_tags_show" class="c_tags solveWrap" style="display: block;">
	                    <table><tbody><tr><td>城市</td><td><%=bi.getBuCity() %></td></tr>
	                     <tr><td>电话</td><td><%=bi.getBuPhone() %></td></tr>
	                     <tr><td>类型</td><td><%=bi.getBuType() %></td></tr>      
	                    <tr><td>领域</td><td><%=bi.getBuBigJob() %></td></tr>
	                    <tr><td>阶段</td><td><%=bi.getBuDevelopment() %></td></tr>
	                    <tr><td>规模</td><td><%=bi.getBuSize() %></td></tr>
	                    <tr><td>主页</td><td><a target="_blank" href="<%=bi.getBuHomePage()%>"><%=bi.getBuHomePage()%></a></td></tr></tbody></table>
	                    <a id="editTags" class="c_edit" href="javascript:void(0)"></a>
	                </div>
	                <div id="c_tags_edit" class="c_tags editTags dn" style="display: none;">
		                <form id="tagForms" action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update06&id=<%=bi.getBuId()%>" method="post">
		                    <table>
		                        <tbody><tr>
		                            <td>城市</td>
		                            <td>
		                            	<input type="text" placeholder="请输入地点" value="<%=bi.getBuCity() %>" name="city" id="city" class="valid">	
		                            </td>
		                        </tr>
		                        <tr>
		                        
		                        <tr>
		                            <td>电话</td>
		                            <td>
		                            	<input type="text" placeholder="请输入地点" value="<%=bi.getBuPhone() %>" name="phone"  class="valid">	
		                            </td>
		                        </tr>
		                        <tr>
		                        
		                        <tr>
		                            <td>类型</td>
		                            <td>
		                            	<input type="text" placeholder="请输入地点" value="<%=bi.getBuType() %>" name="type"  class="valid">	
		                            </td>
		                        </tr>
		                        <tr>
		                        
		                        
		                        
		                        
		                        
		                        
		                            <td>领域</td><!-- 支持多选 -->
		                            <td>
		                            	<input type="hidden" value="<%=bi.getBuBigJob() %>" id="industryField" name="industryField" class="valid">
		                            	<input type="button" style="background:none;cursor:default;border:none !important;" disable="disable" value="<%=bi.getBuBigJob() %>" id="select_ind" class="select_tags">
		                                <!-- <div id="box_ind" class="selectBox dn">
		                                    <ul class="reset">
			                                    				                        							                            			<li class="current">移动互联网</li>
				                            							                            		                                    </ul>
		                                </div>	 -->
		                            </td>
		                        </tr>
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        
		                        <tr>
		                            <td>阶段</td>
		                            <td>
		                        <input type="hidden" value="<%=bi.getBuDevelopment() %>" id="financeStage" name="financeStage">
	                         	<input type="button" value="<%=bi.getBuDevelopment() %>" id="select_fin" class="select_tags">
	                            <div class="selectBox dn" id="box_fin" style="display: none;">
	                                 <ul class="reset" id="xing">
                                 		
			                           			<li>初创型</li>
	                                 		
			                           			<li class="current">成长型</li>
	                                 		
			                           			<li>成熟型</li>
	                                 		
			                           			<li>已上市</li>
	                                 		
                         		
	                                 </ul>
	                             </div>		
	                             
		                            </td>
		                        </tr>
		                        

		                        
		                        
		                        <tr>
		                            <td>规模</td>
		                            <td>
		                            	<input type="hidden" value="<%=bi.getBuSize() %>" id="companySize" name="companySize" class="valid">
		                            	<input type="button" value="<%=bi.getBuSize() %>" id="select_sca" class="select_tags">
		                                <div class="selectBox dn" id="box_sca" style="display: none;">
		                                    <ul class="reset" id="ren">
		                                    	<li>少于15人</li>
                     				            <li>15-50人</li>
                     				            <li>50-150人</li>
                     				           <li class="current">150-500人</li>
                     				           <li>500-2000人</li>
                     				           <li>2000人以上</li>
				                       </ul>			                                    						                            		
		                                </div>	
		                            </td>
		                        </tr>
		                        <tr>
		                            <td>主页</td>
		                            <td>
                            			<input type="text" placeholder="请输入网址" value="<%=bi.getBuHomePage() %>" name="companyUrl" id="companyUrl" class="valid">	
		                            </td>
		                        </tr>
		                    </tbody></table>
		                    <input type="hidden" id="comCity" value="<%=bi.getBuCity() %>">
		                    <input type="hidden" id="comInd" value="<%=bi.getBuBigJob() %>">
		                    <input type="hidden" id="comSize" value="<%=bi.getBuSize() %>">
		                    <input type="hidden" id="comUrl" value="<%=bi.getBuHomePage() %>">
		                    <input type="submit" value="保存" id="submitFeatures" class="btn_small">
		                    <a id="cancelFeatures" class="btn_cancel_s" href="javascript:void(0)">取消</a>
		                    <div class="clear"></div>
		            	</form>
	                </div>
       			</div><!-- end #Tags -->
       			
 
	       		<div id="Member">		
		       			       		<!--有创始团队-->
		                <dl class="c_section c_member">
		                	<dt>
		                    	<h2><em></em>创始团队</h2>
		                    		                    	
	                    				                    </dt>
		                    <dd> 
		                    			                    				                    
			       					<div class="member_wrap">
			       						
				                        <!-- 无创始人 -->
				                        <div class="member_info addnew_right dn">
				                        	展示公司的领导班子，<br>提升诱人指数！<br>
				                            <a class="member_edit" href="javascript:void(0)">+添加成员</a>
				                        </div>
				                        
				                        <!-- 编辑创始人 -->
		                        		<div class="member_info newMember dn">
		                        		<ul class="reset stageshow">
                    							
			                        		<form class="memberForm" action="<%=request.getContextPath()%>/BusinessInfoServlet.do?op=update07&id=<%=bi.getBuId()%>" method="post">
					                            
						                        <input type="text" placeholder="请输入创始人姓名" value="<%=bi.getOrName() %>" name="name" class="valid">	
					                            <input type="text" placeholder="请输入创始人当前职位" value="<%=bi.getOrJob() %>" name="position">	
					                            <input type="text" placeholder="请输入创始人新浪微博地址" value="<%=bi.getOrWeibo() %>" name="weibo" class="valid">
					                           <input type="text" placeholder="请输入创始人个人简介" value="<%=bi.getOrIntroduce()%>"    name="remar" class="s_textarea valid" >
					                           
					                           <textarea placeholder="请输入创始人个人简介" maxlength="500" class="s_textarea valid" name="remark" hidden>发放的发达范德萨范德萨范德萨发的复大发大水发生的</textarea>	
					                            
					                            <div class="clear"></div>
					                            <input type="submit" value="保存" class="btn_small">
				                                
				                        		<input type="hidden" value="11493" class="leader_id">
				                        	</form>
				                        </div>
				                        
				                        <!-- 显示创始人 -->
				                    	<div class="member_info">
				                    	<a title="编辑创始人" class="c_edit member_edit" href="javascript:void(0)"></a>
				                    		<ul class="reset stageshow">
                    							<li><h3>创始人:&nbsp;&nbsp;<%=bi.getOrName() %></h3></li>
                    		                </ul>
				                    		<ul class="reset stageshow">
                    							<li><h3>职位:&nbsp;&nbsp;<%=bi.getOrJob() %></h3></li>
                    		                </ul>

	                    					<ul class="reset stageshow">
                    							<li><h3>微博:&nbsp;&nbsp;<%=bi.getOrWeibo() %></h3></li>
                    		                </ul>
	                    					
	                    					<ul class="reset stageshow">
                    							<li><h3>简介:&nbsp;&nbsp;<%=bi.getOrIntroduce()%></h3></li>
                    		                </ul>
				                            
				                        </div>
				                        
				                     </div><!-- end .member_wrap -->
				                     				                 		                    </dd>
		                </dl>
		       			       	</div> <!-- end #Member -->
	       	
	       	
	     
	       	
        </div>
   	</div>

 <!-------------------------------------弹窗lightbox  ----------------------------------------->
<div style="display:none;">
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

<script src="style/js/company.min.js" type="text/javascript"></script>
<script>
var avatar = {};
avatar.uploadComplate = function( data ){
	var result = eval('('+ data +')');
	if(result.success){
		jQuery('#logoShow img').attr("src",ctx+ '/'+result.content);
		jQuery.colorbox.close();
	}
};
</script>
			<div class="clear"></div>
			<input type="hidden" value="af5b64a9520a4b7da6287ff3400dde11" id="resubmitToken">
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


<div id="cboxOverlay" style="display: none;"></div><div id="colorbox" class="" role="dialog" tabindex="-1" style="display: none;"><div id="cboxWrapper"><div><div id="cboxTopLeft" style="float: left;"></div><div id="cboxTopCenter" style="float: left;"></div><div id="cboxTopRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxMiddleLeft" style="float: left;"></div><div id="cboxContent" style="float: left;"><div id="cboxTitle" style="float: left;"></div><div id="cboxCurrent" style="float: left;"></div><button type="button" id="cboxPrevious"></button><button type="button" id="cboxNext"></button><button id="cboxSlideshow"></button><div id="cboxLoadingOverlay" style="float: left;"></div><div id="cboxLoadingGraphic" style="float: left;"></div></div><div id="cboxMiddleRight" style="float: left;"></div></div><div style="clear: left;"><div id="cboxBottomLeft" style="float: left;"></div><div id="cboxBottomCenter" style="float: left;"></div><div id="cboxBottomRight" style="float: left;"></div></div></div><div style="position: absolute; width: 9999px; visibility: hidden; display: none;"></div></div></body></html>