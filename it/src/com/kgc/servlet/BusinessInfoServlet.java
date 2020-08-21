package com.kgc.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessResume;
import com.kgc.service.BusinessInfoService;
import com.kgc.service.BusinessRecruitService;
import com.kgc.service.BusinessResumeService;
import com.kgc.service.EmailService;
import com.kgc.util.PageUtil;

public class BusinessInfoServlet extends HttpServlet {
	static Integer gongzhubuid=0;//公司信息id主键
	static String buloginname=null;//用户名
	static String bupwd=null;//密码
	static String buemail=null;//邮箱
	
	static String buname=null;//公司详细名称
	static String bujname=null;//公司简称
	static String bulogo=null;//公司LOGO
	static String buhomepage=null;//公司网址
	static String bucity=null;//公司所在城市
	static String bubigjob=null;//公司领域
	static String busize=null;//公司规模
	static String budevelopment=null;//公司发展阶段
	static String buintroduce=null;//一句话介绍公司
	static String butype=null;//公司类型
	static String buphone=null;//公司电话
	
	static String bulable=null;//公司标签
	static String bupicture=null;//公司营业执照
	
	static String orname=null;//公司创始人名字
	static String orjob=null;//创始人职位
	static String orweibo=null;//创始人微博
	static String orintroduce=null;//创始人简介
	
	static String prPicture=null;//产品图片地址
	static String prName=null;//产品名称
	static String prAddress=null;//产品链接地址
	static String printroduce=null;//产品简介

	static String buxintroduce=null;//公司详细介绍
	/**
	 * Constructor of the object.
	 */
	public BusinessInfoServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		ServletContext application=this.getServletContext();
		String op=request.getParameter("op");
		BusinessInfoService bis=new BusinessInfoService();
		BusinessRecruitService brs=new BusinessRecruitService();
		BusinessResumeService brs2=new BusinessResumeService();
		if("list".equals(op)){
			//初始化页码
			int pageIndex=1;
			//判断页码是否为空
			if(request.getParameter("index")!=null){
				pageIndex=Integer.parseInt(request.getParameter("index"));
			}
			Integer buid=-1;
			if(request.getParameter("sel")!=null&&!request.getParameter("sel").equals("")){
				buid=Integer.parseInt(request.getParameter("sel"));
			}
			String name=request.getParameter("name");
			//调用业务逻辑层
			PageUtil<BusinessInfo> page=bis.getBusiness(name, buid, pageIndex, 4);
			request.setAttribute("page", page);
			//获取所有的企业注册信息
			List<BusinessInfo> list=bis.getAllBusiness();
			request.setAttribute("business", list);
			//转发
			request.getRequestDispatcher("company_list.jsp").forward(request, response);
		}else if("add00".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			bi.setBuEmail(request.getParameter("email"));
			buemail=bi.getBuEmail();
			System.out.println(buemail);
			bi.setBuPwd(request.getParameter("password"));
			bupwd=bi.getBuPwd();
			System.out.println(bupwd);	
			
			bi.setBuEmail(buemail);
			bi.setBuPwd(bupwd);
		    session.setAttribute("BusinessInfo", bi);
		    response.sendRedirect("index01.jsp");

		}else if("add01".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			//1.创建FileItemFactory实例
			FileItemFactory factory=new DiskFileItemFactory();
			//2.创建ServletFileUpload实例
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.解析request请求中的数据
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.对集合进行遍历
				for(FileItem item:list){
					//判断是否为普通文件
					if(item.isFormField()){
						//获取普通表单元素的名称
						String name=item.getFieldName();
						//公司姓名
						if(name.equals("buname")){
							bi.setBuName(item.getString("utf-8"));
							buname=bi.getBuName();
							
						//公司简称
						}else if(name.equals("bujname")){
							bi.setBujName(item.getString("utf-8"));
							bujname=bi.getBujName();
							
						//公司网址
						}else if(name.equals("buhomepage")){
							bi.setBuHomePage(item.getString("utf-8"));
							buhomepage=bi.getBuHomePage();
							
						//公司所在城市
						}else if(name.equals("bucity")){
							bi.setBuCity(item.getString("utf-8"));
							bucity=bi.getBuCity();
							
						//公司行业领域
						}else if(name.equals("select_industry_hidden")){
							bi.setBuBigJob(item.getString("utf-8"));
							bubigjob=bi.getBuBigJob();
							
						//公司规模
						}else if(name.equals("select_scale_hidden")){
							bi.setBuSize(item.getString("utf-8"));
							busize=bi.getBuSize();
							
					    //公司发展阶段
						}else if(name.equals("s_radio_hidden")){
							bi.setBuDevelopment(item.getString("utf-8"));
							budevelopment=bi.getBuDevelopment();
							
						//一句话介绍公司
						}else if(name.equals("temptation")){
							bi.setBuIntroduce(item.getString("utf-8"));
							buintroduce=bi.getBuIntroduce();
							
						//公司类型
						}else if(name.equals("butype")){
							bi.setBuType(item.getString("utf-8"));
							butype=bi.getBuType();
							
						//公司联系电话
						}else if(name.equals("buphone")){
							bi.setBuPhone(item.getString("utf-8"));
							buphone=bi.getBuPhone();
							
						}
					}else{
						//读取文件元素的名称
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//取文件的后缀
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//服务器地址
						String path=application.getRealPath("upload");
						//图片地址和数据库地址
						bi.setBuLogo("upload\\"+name);
						bulogo=bi.getBuLogo();
						/*bi.setBuPicture("upload\\"+name);*/
						
						//创建上传文件对象
						File file=new File(path,name);
						//保存到服务器
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//调用业务层，添加公司信息
				//bis.addBusinessInfo(bi);
				//跳转
			//session.setAttribute("add01", bi);
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("index02.jsp");	
		}else if("add02".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			//1.创建FileItemFactory实例
			FileItemFactory factory=new DiskFileItemFactory();
			//2.创建ServletFileUpload实例
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.解析request请求中的数据
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.对集合进行遍历
				for(FileItem item:list){
					//判断是否为普通文件
					if(item.isFormField()){
						//获取普通表单元素的名称
						String name=item.getFieldName();
						//公司标签
						if(name.equals("select_industry_hidden")){
							bi.setBuLable(item.getString("utf-8"));
							bulable=bi.getBuLable();
							
						}
					}else{
						//读取文件元素的名称
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//取文件的后缀
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//服务器地址
						String path=application.getRealPath("upload");
						//图片地址和数据库地址
						bi.setBuPicture("upload\\"+name);
						bupicture=bi.getBuPicture();
						/*bi.setBuPicture("upload\\"+name);*/
						
						//创建上传文件对象
						File file=new File(path,name);
						//保存到服务器
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//调用业务层，添加公司信息
				//bis.addBusinessInfo(bi);
				//跳转
			//session.setAttribute("add01", bi);
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("index03.jsp");	
		}else if("add03".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			bi.setOrName(request.getParameter("leaderInfos[0].name"));
			orname=bi.getOrName();
			
			bi.setOrJob(request.getParameter("leaderInfos[0].position"));
			orjob=bi.getOrJob();
			
			bi.setOrWeibo(request.getParameter("leaderInfos[0].weibo"));
			orweibo=bi.getOrWeibo();
			
			bi.setOrIntroduce(request.getParameter("leaderInfos[0].remark"));
			orintroduce=bi.getOrIntroduce();

			response.sendRedirect("index04.jsp");	
		}else if("add04".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			//1.创建FileItemFactory实例
			FileItemFactory factory=new DiskFileItemFactory();
			//2.创建ServletFileUpload实例
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.解析request请求中的数据
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.对集合进行遍历
				for(FileItem item:list){
					//判断是否为普通文件
					if(item.isFormField()){
						//获取普通表单元素的名称
						String name=item.getFieldName();
						//产品名称
						if(name.equals("productInfos[0].product")){
							bi.setPrName(item.getString("utf-8"));
							prName=bi.getPrName();
							
						//产品链接地址
						}else if(name.equals("productInfos[0].productUrl")){
							bi.setPrAddress(item.getString("utf-8"));
							prAddress=bi.getPrAddress();
							
						//产品介绍
						}else if(name.equals("productInfos[0].productProfile")){
							bi.setPrIntroduce(item.getString("utf-8"));
							printroduce=bi.getPrIntroduce();
							
						}
					}else{
						//读取文件元素的名称
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//取文件的后缀
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//服务器地址
						String path=application.getRealPath("upload");
						//图片地址和数据库地址
						bi.setPrPicture("upload\\"+name);
						prPicture=bi.getPrPicture();
						
						//创建上传文件对象
						File file=new File(path,name);
						//保存到服务器
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//调用业务层，添加公司信息
				//bis.addBusinessInfo(bi);
				//跳转
			//session.setAttribute("add01", bi);
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("index05.jsp");	
		}else if("add05".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			bi.setBuxIntroduce(request.getParameter("companyProfile"));
			buxintroduce=bi.getBuxIntroduce();
			
			
			bi.setBuEmail(buemail);//###############
			bi.setBuPwd(bupwd);//###############
			bi.setBuName(buname);
			bi.setBujName(bujname);
			bi.setBuLogo(bulogo);
			bi.setBuHomePage(buhomepage);
			bi.setBuCity(bucity);
			bi.setBuBigJob(bubigjob);
			bi.setBuSize(busize);
			bi.setBuDevelopment(budevelopment);
			bi.setBuIntroduce(buintroduce);
			bi.setBuType(butype);
			bi.setBuPhone(buphone);
			
			bi.setBuLable(bulable);
			bi.setBuPicture(bupicture);
			
			bi.setOrName(orname);
			bi.setOrJob(orjob);
			bi.setOrWeibo(orweibo);
			bi.setOrIntroduce(orintroduce);
			
			bi.setPrPicture(prPicture);
			bi.setPrName(prName);
			bi.setPrAddress(prAddress);
			bi.setPrIntroduce(printroduce);
			bi.setBuxIntroduce(buxintroduce);
			bis.addBusinessInfo(bi);
			session.setAttribute("BusinessInfo", bi);
			response.sendRedirect("index06.jsp");	
		}else if("update01".equals(op)){
			/*int id=Integer.parseInt(request.getParameter("id"));
			System.out.println("李小龙"+id);*/
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("index07.jsp");
		}else if("update02".equals(op)){
			//修改公司简称和一句话介绍公司 把id传进去
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			String jname=request.getParameter("companyShortName");
			String introduce=request.getParameter("companyFeature");
			
			BusinessInfo bi=new BusinessInfo();
			
			bi.setBujName(jname);
			bujname=bi.getBujName();
			bi.setBuIntroduce(introduce);
			buintroduce=bi.getBuIntroduce();
			bi.setBuId(buid);
			bis.updateBusinessInfo01(bi);
			bi.setBuEmail(buemail);//###############
			bi.setBuPwd(bupwd);//##############
			bi.setBuName(buname);
			bi.setBuLogo(bulogo);
			bi.setBuHomePage(buhomepage);
			bi.setBuCity(bucity);
			bi.setBuBigJob(bubigjob);
			bi.setBuSize(busize);
			bi.setBuDevelopment(budevelopment);
			bi.setBuType(butype);
			bi.setBuPhone(buphone);
			
			bi.setBuLable(bulable);
			bi.setBuPicture(bupicture);
			
			bi.setOrName(orname);
			bi.setOrJob(orjob);
			bi.setOrWeibo(orweibo);
			bi.setOrIntroduce(orintroduce);
			
			bi.setPrPicture(prPicture);
			bi.setPrName(prName);
			bi.setPrAddress(prAddress);
			bi.setPrIntroduce(printroduce);
			
			bi.setBuxIntroduce(buxintroduce);
			
			session.setAttribute("BusinessInfo", bi);
			response.sendRedirect("index07.jsp");
			
			/*if(n==1){
				out.print("<script>alert('更新成功');location.href='index07.jsp'</script>");
			}else if(n==-1){
				out.print("<script>alert('更新失败');location.href='index07.jsp'</script>");
			}*/
		}else if("update03".equals(op)){
			//2.修改公司logo 把id传进去
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			BusinessInfo bi=new BusinessInfo();
			//1.创建FileItemFactory实例
			FileItemFactory factory=new DiskFileItemFactory();
			//2.创建ServletFileUpload实例
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.解析request请求中的数据
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.对集合进行遍历
				for(FileItem item:list){
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//取文件的后缀
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//服务器地址
						String path=application.getRealPath("upload");
						//图片地址和数据库地址
						bi.setBuLogo("upload\\"+name);
						bulogo=bi.getBuLogo();
						
						/*bi.setBuPicture("upload\\"+name);*/
						
						//创建上传文件对象
						File file=new File(path,name);
						//保存到服务器
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					
				} 
				//调用业务层，添加公司信息
				//bis.addBusinessInfo(bi);
				//跳转
				bi.setBuId(buid);
				bis.updateBusinessInfo02(bi);
				
				bi.setBuEmail(buemail);//###############
				bi.setBuPwd(bupwd);//##############
				bi.setBuName(buname);
				bi.setBujName(bujname);
				bi.setBuHomePage(buhomepage);
				bi.setBuCity(bucity);
				bi.setBuBigJob(bubigjob);
				bi.setBuSize(busize);
				bi.setBuDevelopment(budevelopment);
				bi.setBuIntroduce(buintroduce);
				bi.setBuType(butype);
				bi.setBuPhone(buphone);
				
				bi.setBuLable(bulable);
				bi.setBuPicture(bupicture);
				
				bi.setOrName(orname);
				bi.setOrJob(orjob);
				bi.setOrWeibo(orweibo);
				bi.setOrIntroduce(orintroduce);
				
				bi.setPrPicture(prPicture);
				bi.setPrName(prName);
				bi.setPrAddress(prAddress);
				bi.setPrIntroduce(printroduce);
				
				bi.setBuxIntroduce(buxintroduce);
				bi.setBuId(buid);
				session.setAttribute("BusinessInfo", bi);
				response.sendRedirect("index07.jsp");
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}else if("update04".equals(op)){
			//3.修改公司产品信息  把id传进去
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			BusinessInfo bi=new BusinessInfo();
			//1.创建FileItemFactory实例
			FileItemFactory factory=new DiskFileItemFactory();
			//2.创建ServletFileUpload实例
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.解析request请求中的数据
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.对集合进行遍历
				for(FileItem item:list){
					//判断是否为普通文件
					if(item.isFormField()){
						//获取普通表单元素的名称
						String name=item.getFieldName();
						//公司产品名称
						if(name.equals("product")){
							bi.setPrName(item.getString("utf-8"));
							prName=bi.getPrName();
							
						//公司简称
						}else if(name.equals("productUrl")){
							bi.setPrAddress(item.getString("utf-8"));
							prAddress=bi.getPrAddress();
							
						//公司网址
						}else if(name.equals("productProhaha")){
							bi.setPrIntroduce(item.getString("utf-8"));
							printroduce=bi.getPrIntroduce();
							
						}
					}else{
						//读取文件元素的名称
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//取文件的后缀
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//服务器地址
						String path=application.getRealPath("upload");
						//图片地址和数据库地址
						bi.setPrPicture("upload\\"+name);
						prPicture=bi.getPrPicture();
						/*bi.setBuPicture("upload\\"+name);*/
						
						//创建上传文件对象
						File file=new File(path,name);
						//保存到服务器
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//调用业务层，添加公司信息
				//bis.addBusinessInfo(bi);
				//跳转
			//session.setAttribute("add01", bi);
				bi.setBuId(buid);
				
				gongzhubuid=buid;
				
				bi.setBuEmail(buemail);//###############
				bi.setBuPwd(bupwd);//##############
				bi.setBuName(buname);
				bi.setBujName(bujname);
				bi.setBuLogo(bulogo);
				bi.setBuHomePage(buhomepage);
				bi.setBuCity(bucity);
				bi.setBuBigJob(bubigjob);
				bi.setBuSize(busize);
				bi.setBuDevelopment(budevelopment);
				bi.setBuIntroduce(buintroduce);
				bi.setBuType(butype);
				bi.setBuPhone(buphone);
				
				bi.setBuLable(bulable);
				bi.setBuPicture(bupicture);
				
				bi.setOrName(orname);
				bi.setOrJob(orjob);
				bi.setOrWeibo(orweibo);
				bi.setOrIntroduce(orintroduce);
				
				bi.setPrPicture(prPicture);
				bi.setPrName(prName);
				bi.setPrAddress(prAddress);
				bi.setPrIntroduce(printroduce);
				
				bi.setBuxIntroduce(buxintroduce);
				
				bis.updateBusinessInfo03(bi);
				
				session.setAttribute("BusinessInfo", bi);
				response.sendRedirect("index07.jsp");
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if("update05".equals(op)){
			//修改公司详细介绍 把id传进去
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			String xintroduce=request.getParameter("companyProfile");
			
			BusinessInfo bi=new BusinessInfo();
			
			bi.setBuxIntroduce(xintroduce);
			buxintroduce=bi.getBuxIntroduce();
			

			bi.setBuId(buid);
			

			bi.setBuEmail(buemail);//###############
			bi.setBuPwd(bupwd);//##############
			bi.setBuIntroduce(buintroduce);
			bi.setBujName(bujname);
			bi.setBuName(buname);
			bi.setBuLogo(bulogo);
			bi.setBuHomePage(buhomepage);
			bi.setBuCity(bucity);
			bi.setBuBigJob(bubigjob);
			bi.setBuSize(busize);
			bi.setBuDevelopment(budevelopment);
			bi.setBuType(butype);
			bi.setBuPhone(buphone);
			
			bi.setBuLable(bulable);
			bi.setBuPicture(bupicture);
			
			bi.setOrName(orname);
			bi.setOrJob(orjob);
			bi.setOrWeibo(orweibo);
			bi.setOrIntroduce(orintroduce);
			
			bi.setPrPicture(prPicture);
			bi.setPrName(prName);
			bi.setPrAddress(prAddress);
			bi.setPrIntroduce(printroduce);
			
			bi.setBuxIntroduce(buxintroduce);
			
			bis.updateBusinessInfo04(bi);
			session.setAttribute("BusinessInfo", bi);
			response.sendRedirect("index07.jsp");

		}else if("update06".equals(op)){
			//修改公司修改公司城市，领域，规模，主页  把id传进去
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			String city=request.getParameter("city");
			String phone=request.getParameter("phone");
			String type=request.getParameter("type");
			//String bigjob=request.getParameter("industryField");
			String development=request.getParameter("financeStage");
			String size=request.getParameter("companySize");
			String homepage=request.getParameter("companyUrl");
			

			BusinessInfo bi=new BusinessInfo();
			
			bi.setBuCity(city);
			bucity=bi.getBuCity();
			
			
			bi.setBuPhone(phone);
			buphone=bi.getBuPhone();
			
			
			bi.setBuType(type);
			butype=bi.getBuType();
			
			
			bi.setBuDevelopment(development);
			budevelopment=bi.getBuDevelopment();
			
			
			bi.setBuSize(size);
			busize=bi.getBuSize();
			
			
			bi.setBuHomePage(homepage);
			buhomepage=bi.getBuHomePage();
			

			bi.setBuId(buid);
			
			
			bi.setBuEmail(buemail);//###############
			bi.setBuPwd(bupwd);//##############
			bi.setBuIntroduce(buintroduce);
			bi.setBujName(bujname);
			bi.setBuName(buname);
			bi.setBuLogo(bulogo);
			bi.setBuHomePage(buhomepage);
			bi.setBuCity(bucity);
			bi.setBuBigJob(bubigjob);
			bi.setBuSize(busize);
			bi.setBuDevelopment(budevelopment);
			bi.setBuType(butype);
			bi.setBuPhone(buphone);
			
			bi.setBuLable(bulable);
			bi.setBuPicture(bupicture);
			
			bi.setOrName(orname);
			bi.setOrJob(orjob);
			bi.setOrWeibo(orweibo);
			bi.setOrIntroduce(orintroduce);
			
			bi.setPrPicture(prPicture);
			bi.setPrName(prName);
			bi.setPrAddress(prAddress);
			bi.setPrIntroduce(printroduce);
			
			bi.setBuxIntroduce(buxintroduce);
			
			bis.updateBusinessInfo05(bi);
			session.setAttribute("BusinessInfo", bi);
			response.sendRedirect("index07.jsp");

		}else if("update07".equals(op)){
			//修改公司修改公司城市，领域，规模，主页  把id传进去
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			String name=request.getParameter("name");
			String job=request.getParameter("position");
			String weibo=request.getParameter("weibo");
			String introduce=request.getParameter("remar");

			BusinessInfo bi=new BusinessInfo();
			
			bi.setOrName(name);
			orname=bi.getOrName();
			
			
			bi.setOrJob(job);
			orjob=bi.getOrJob();
			
			
			bi.setOrWeibo(weibo);
			orweibo=bi.getOrWeibo();
			
			
			bi.setOrIntroduce(introduce);
			orintroduce=bi.getOrIntroduce();
			
			

			bi.setBuId(buid);
			
			
			bi.setBuEmail(buemail);//###############
			bi.setBuPwd(bupwd);//##############
			bi.setBuIntroduce(buintroduce);
			bi.setBujName(bujname);
			bi.setBuName(buname);
			bi.setBuLogo(bulogo);
			bi.setBuHomePage(buhomepage);
			bi.setBuCity(bucity);
			bi.setBuBigJob(bubigjob);
			bi.setBuSize(busize);
			bi.setBuDevelopment(budevelopment);
			bi.setBuType(butype);
			bi.setBuPhone(buphone);
			
			bi.setBuLable(bulable);
			bi.setBuPicture(bupicture);
			
			bi.setOrName(orname);
			bi.setOrJob(orjob);
			bi.setOrWeibo(orweibo);
			bi.setOrIntroduce(orintroduce);
			
			bi.setPrPicture(prPicture);
			bi.setPrName(prName);
			bi.setPrAddress(prAddress);
			bi.setPrIntroduce(printroduce);
			
			bi.setBuxIntroduce(buxintroduce);
			
			bis.updateBusinessInfo06(bi);
			session.setAttribute("BusinessInfo", bi);
			response.sendRedirect("index07.jsp");

		}else if("zhiwei01".equals(op)){
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("index08.jsp");

		}else if("zhiwei02".equals(op)){ //发布职位 注册
			BusinessRecruit br=new BusinessRecruit();
			
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);

			int brbuid=Integer.parseInt(request.getParameter("id"));
			br.setBrBuId(brbuid);
			
			br.setBrJob(request.getParameter("positionName"));
			br.setBrNature(request.getParameter("jobNature"));
			
			String min=request.getParameter("salaryMi");
			String max=request.getParameter("salaryMa");
			String money=min+"k-"+max+"k";
			br.setBrMoney(money);
			
			br.setBrCity(request.getParameter("workAddres"));
			
			br.setBrExperience(request.getParameter("workYea"));
			br.setBrEducation(request.getParameter("educatio"));
			
			br.setBrLikeJob(request.getParameter("positionAdvantag"));
			br.setBrJobDescribe(request.getParameter("positionDetai"));
			br.setBrAddress(request.getParameter("positionAddres"));
			br.setBrEmail(request.getParameter("forwardEmai"));
			brs.addBusinessRecruit(br);
			
			session.setAttribute("BusinessRecruit",br);
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("zhiweichenggong.jsp");

		}else if("zhiweisy".equals(op)){
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("zhiweishouye.jsp");
		}else if("zhiweishouyelist".equals(op)){ //公司账号 发布职位集合
			List<BusinessRecruit> businessRecruit=brs.getAllBusinessRecruit(gongzhubuid);
			session.setAttribute("businessRecruit", businessRecruit);
			response.sendRedirect("zhiweishouye.jsp");
		}else if("zhiweiyulan".equals(op)){  //职位预览
			int id=Integer.parseInt(request.getParameter("id"));
			BusinessRecruit br=brs.getBusinessRecruitById(id);
			session.setAttribute("BusinessRecruit",br);
			response.sendRedirect("yulanzhiwei.jsp");
		}else if("zhiweishanchu".equals(op)){ //删除职位
			int id=Integer.parseInt(request.getParameter("id"));
			int n=brs.delBusinessRecruit(id);
			if(n<1){
				out.print("<script>alert('下线失败');location.href='zhiweishouye.jsp'</script>");
			}else{
				out.print("<script>alert('下线成功');location.href='zhiweishouye.jsp'</script>");
			}
		}else if("zhiweidashouyelist".equals(op)){  //公司查询
			//调用业务
			
			int pageIndex=1;
			//获取用户选择页码
			if(request.getParameter("pageIndex")!=null){
				pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
				
			}
			
			
			String bucity1="";
			if(request.getParameter("bucity1")!=null){
				bucity1=request.getParameter("bucity1");//、、、、、、、、、、
			}
			
			
			
			String budevelopment2="";
			if(request.getParameter("budevelopment2")!=null){
				budevelopment2=request.getParameter("budevelopment2");//、、、、、、、、、、
			}
			
			String bubigjob3="";
			if(request.getParameter("bubigjob3")!=null){
				bubigjob3=request.getParameter("bubigjob3");//、、、、、、、、、、
			}

			//调用业务
			PageUtil<BusinessInfo> page=bis.getBusinessInfoByPage(bucity1,budevelopment2,bubigjob3, pageIndex, 6);
			session.setAttribute("page", page);
			//转发到首页
			response.sendRedirect("zhiweidashouye.jsp");
		}else if("zhiweidsy".equals(op)){
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("zhiweidashouye.jsp");
		}else if("zhiweixijie".equals(op)){  //根据公司id查询公司所有信息(包括职位信息)
			int id=Integer.parseInt(request.getParameter("id"));
			
			
			BusinessInfo bi=bis.getAllById(id);
			
			String name=request.getParameter("name");
			BusinessInfo binfo=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",binfo);
			session.setAttribute("bi",bi);
			response.sendRedirect("zhiweixijie.jsp");
		}else if("gongsijianli".equals(op)){
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("gongsijianli.jsp");
		}else if("email".equals(op)){
			/*String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",bi);*/
			
			String recipients=request.getParameter("recipients");
			
			String title=request.getParameter("title");
			
			String content=request.getParameter("content");
			
			EmailService es=new EmailService();
			try {
				es.email(recipients, title, content);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			out.print("<script>alert('发送成功');location.href='gongsijianli.jsp'</script>");
		}else if("yulanjianli".equals(op)){
			int id=Integer.parseInt(request.getParameter("id"));
			BusinessResume businessresume=brs2.getBusinessResumeById(id);
			session.setAttribute("businessresume",businessresume);
			response.sendRedirect("yulanjianli.jsp");
		}else if("ajax".equals(op)){   //ajax判断公司全称
			String buname=request.getParameter("buname");
			String msg="";
			if(bis.getBusinessInfoByBuName(buname)==-1){
				msg="not";//已经注册
			}else{
				msg="ok";//可以注册
			}
			out.print(msg);
		}else if("addlogin".equals(op)){ 
			String email=request.getParameter("email");
			BusinessInfo bi=bis.getBusinessInfoByEmail(email);
			
		    gongzhubuid=bi.getBuId();
		    buloginname=bi.getBuLoginName();
			bupwd=bi.getBuPwd();
			buemail=bi.getBuEmail();
			
			buname=bi.getBuName();
			bujname=bi.getBujName();
			bulogo=bi.getBuLogo();
			buhomepage=bi.getBuHomePage();
			bucity=bi.getBuCity();
			bubigjob=bi.getBuBigJob();
			busize=bi.getBuSize();
			budevelopment=bi.getBuDevelopment();
			buintroduce=bi.getBuIntroduce();
			butype=bi.getBuType();
			buphone=bi.getBuPhone();
			
			bulable=bi.getBuLable();
			bupicture=bi.getBuPicture();
			
			orname=bi.getOrName();
			orjob=bi.getOrJob();
			orweibo=bi.getOrWeibo();
			orintroduce=bi.getOrIntroduce();
			
			prPicture=bi.getPrPicture();
			prName=bi.getPrName();
			prAddress=bi.getPrAddress();
			printroduce=bi.getPrIntroduce();

			buxintroduce=bi.getBuxIntroduce();
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("index.jsp");
		}else if("jianlishouyelist".equals(op)){ //公司简历集合     新加的  上面还一个 brs2
			int id=Integer.parseInt(request.getParameter("id"));
			List<BusinessResume> businessResume=brs2.getAllBusinessResume(id);
			session.setAttribute("businessResume", businessResume);
			response.sendRedirect("gongsijianli.jsp");
		}else if("dadashouye".equals(op)){
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("index.jsp");
		}
		

		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
