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
	static Integer gongzhubuid=0;//��˾��Ϣid����
	static String buloginname=null;//�û���
	static String bupwd=null;//����
	static String buemail=null;//����
	
	static String buname=null;//��˾��ϸ����
	static String bujname=null;//��˾���
	static String bulogo=null;//��˾LOGO
	static String buhomepage=null;//��˾��ַ
	static String bucity=null;//��˾���ڳ���
	static String bubigjob=null;//��˾����
	static String busize=null;//��˾��ģ
	static String budevelopment=null;//��˾��չ�׶�
	static String buintroduce=null;//һ�仰���ܹ�˾
	static String butype=null;//��˾����
	static String buphone=null;//��˾�绰
	
	static String bulable=null;//��˾��ǩ
	static String bupicture=null;//��˾Ӫҵִ��
	
	static String orname=null;//��˾��ʼ������
	static String orjob=null;//��ʼ��ְλ
	static String orweibo=null;//��ʼ��΢��
	static String orintroduce=null;//��ʼ�˼��
	
	static String prPicture=null;//��ƷͼƬ��ַ
	static String prName=null;//��Ʒ����
	static String prAddress=null;//��Ʒ���ӵ�ַ
	static String printroduce=null;//��Ʒ���

	static String buxintroduce=null;//��˾��ϸ����
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
			//��ʼ��ҳ��
			int pageIndex=1;
			//�ж�ҳ���Ƿ�Ϊ��
			if(request.getParameter("index")!=null){
				pageIndex=Integer.parseInt(request.getParameter("index"));
			}
			Integer buid=-1;
			if(request.getParameter("sel")!=null&&!request.getParameter("sel").equals("")){
				buid=Integer.parseInt(request.getParameter("sel"));
			}
			String name=request.getParameter("name");
			//����ҵ���߼���
			PageUtil<BusinessInfo> page=bis.getBusiness(name, buid, pageIndex, 4);
			request.setAttribute("page", page);
			//��ȡ���е���ҵע����Ϣ
			List<BusinessInfo> list=bis.getAllBusiness();
			request.setAttribute("business", list);
			//ת��
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
			//1.����FileItemFactoryʵ��
			FileItemFactory factory=new DiskFileItemFactory();
			//2.����ServletFileUploadʵ��
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.����request�����е�����
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.�Լ��Ͻ��б���
				for(FileItem item:list){
					//�ж��Ƿ�Ϊ��ͨ�ļ�
					if(item.isFormField()){
						//��ȡ��ͨ��Ԫ�ص�����
						String name=item.getFieldName();
						//��˾����
						if(name.equals("buname")){
							bi.setBuName(item.getString("utf-8"));
							buname=bi.getBuName();
							
						//��˾���
						}else if(name.equals("bujname")){
							bi.setBujName(item.getString("utf-8"));
							bujname=bi.getBujName();
							
						//��˾��ַ
						}else if(name.equals("buhomepage")){
							bi.setBuHomePage(item.getString("utf-8"));
							buhomepage=bi.getBuHomePage();
							
						//��˾���ڳ���
						}else if(name.equals("bucity")){
							bi.setBuCity(item.getString("utf-8"));
							bucity=bi.getBuCity();
							
						//��˾��ҵ����
						}else if(name.equals("select_industry_hidden")){
							bi.setBuBigJob(item.getString("utf-8"));
							bubigjob=bi.getBuBigJob();
							
						//��˾��ģ
						}else if(name.equals("select_scale_hidden")){
							bi.setBuSize(item.getString("utf-8"));
							busize=bi.getBuSize();
							
					    //��˾��չ�׶�
						}else if(name.equals("s_radio_hidden")){
							bi.setBuDevelopment(item.getString("utf-8"));
							budevelopment=bi.getBuDevelopment();
							
						//һ�仰���ܹ�˾
						}else if(name.equals("temptation")){
							bi.setBuIntroduce(item.getString("utf-8"));
							buintroduce=bi.getBuIntroduce();
							
						//��˾����
						}else if(name.equals("butype")){
							bi.setBuType(item.getString("utf-8"));
							butype=bi.getBuType();
							
						//��˾��ϵ�绰
						}else if(name.equals("buphone")){
							bi.setBuPhone(item.getString("utf-8"));
							buphone=bi.getBuPhone();
							
						}
					}else{
						//��ȡ�ļ�Ԫ�ص�����
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//ȡ�ļ��ĺ�׺
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//��������ַ
						String path=application.getRealPath("upload");
						//ͼƬ��ַ�����ݿ��ַ
						bi.setBuLogo("upload\\"+name);
						bulogo=bi.getBuLogo();
						/*bi.setBuPicture("upload\\"+name);*/
						
						//�����ϴ��ļ�����
						File file=new File(path,name);
						//���浽������
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//����ҵ��㣬��ӹ�˾��Ϣ
				//bis.addBusinessInfo(bi);
				//��ת
			//session.setAttribute("add01", bi);
				
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("index02.jsp");	
		}else if("add02".equals(op)){
			BusinessInfo bi=new BusinessInfo();
			//1.����FileItemFactoryʵ��
			FileItemFactory factory=new DiskFileItemFactory();
			//2.����ServletFileUploadʵ��
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.����request�����е�����
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.�Լ��Ͻ��б���
				for(FileItem item:list){
					//�ж��Ƿ�Ϊ��ͨ�ļ�
					if(item.isFormField()){
						//��ȡ��ͨ��Ԫ�ص�����
						String name=item.getFieldName();
						//��˾��ǩ
						if(name.equals("select_industry_hidden")){
							bi.setBuLable(item.getString("utf-8"));
							bulable=bi.getBuLable();
							
						}
					}else{
						//��ȡ�ļ�Ԫ�ص�����
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//ȡ�ļ��ĺ�׺
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//��������ַ
						String path=application.getRealPath("upload");
						//ͼƬ��ַ�����ݿ��ַ
						bi.setBuPicture("upload\\"+name);
						bupicture=bi.getBuPicture();
						/*bi.setBuPicture("upload\\"+name);*/
						
						//�����ϴ��ļ�����
						File file=new File(path,name);
						//���浽������
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//����ҵ��㣬��ӹ�˾��Ϣ
				//bis.addBusinessInfo(bi);
				//��ת
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
			//1.����FileItemFactoryʵ��
			FileItemFactory factory=new DiskFileItemFactory();
			//2.����ServletFileUploadʵ��
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.����request�����е�����
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.�Լ��Ͻ��б���
				for(FileItem item:list){
					//�ж��Ƿ�Ϊ��ͨ�ļ�
					if(item.isFormField()){
						//��ȡ��ͨ��Ԫ�ص�����
						String name=item.getFieldName();
						//��Ʒ����
						if(name.equals("productInfos[0].product")){
							bi.setPrName(item.getString("utf-8"));
							prName=bi.getPrName();
							
						//��Ʒ���ӵ�ַ
						}else if(name.equals("productInfos[0].productUrl")){
							bi.setPrAddress(item.getString("utf-8"));
							prAddress=bi.getPrAddress();
							
						//��Ʒ����
						}else if(name.equals("productInfos[0].productProfile")){
							bi.setPrIntroduce(item.getString("utf-8"));
							printroduce=bi.getPrIntroduce();
							
						}
					}else{
						//��ȡ�ļ�Ԫ�ص�����
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//ȡ�ļ��ĺ�׺
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//��������ַ
						String path=application.getRealPath("upload");
						//ͼƬ��ַ�����ݿ��ַ
						bi.setPrPicture("upload\\"+name);
						prPicture=bi.getPrPicture();
						
						//�����ϴ��ļ�����
						File file=new File(path,name);
						//���浽������
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//����ҵ��㣬��ӹ�˾��Ϣ
				//bis.addBusinessInfo(bi);
				//��ת
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
			System.out.println("��С��"+id);*/
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("index07.jsp");
		}else if("update02".equals(op)){
			//�޸Ĺ�˾��ƺ�һ�仰���ܹ�˾ ��id����ȥ
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
				out.print("<script>alert('���³ɹ�');location.href='index07.jsp'</script>");
			}else if(n==-1){
				out.print("<script>alert('����ʧ��');location.href='index07.jsp'</script>");
			}*/
		}else if("update03".equals(op)){
			//2.�޸Ĺ�˾logo ��id����ȥ
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			BusinessInfo bi=new BusinessInfo();
			//1.����FileItemFactoryʵ��
			FileItemFactory factory=new DiskFileItemFactory();
			//2.����ServletFileUploadʵ��
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.����request�����е�����
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.�Լ��Ͻ��б���
				for(FileItem item:list){
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//ȡ�ļ��ĺ�׺
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//��������ַ
						String path=application.getRealPath("upload");
						//ͼƬ��ַ�����ݿ��ַ
						bi.setBuLogo("upload\\"+name);
						bulogo=bi.getBuLogo();
						
						/*bi.setBuPicture("upload\\"+name);*/
						
						//�����ϴ��ļ�����
						File file=new File(path,name);
						//���浽������
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					
				} 
				//����ҵ��㣬��ӹ�˾��Ϣ
				//bis.addBusinessInfo(bi);
				//��ת
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
			//3.�޸Ĺ�˾��Ʒ��Ϣ  ��id����ȥ
			int buid=Integer.parseInt(request.getParameter("id"));
			gongzhubuid=buid;
			BusinessInfo bi=new BusinessInfo();
			//1.����FileItemFactoryʵ��
			FileItemFactory factory=new DiskFileItemFactory();
			//2.����ServletFileUploadʵ��
			ServletFileUpload upload=new ServletFileUpload(factory);
			upload.setFileSizeMax(5*1024*1024);//5Mb
			//3.����request�����е�����
			List<FileItem> list;
			try {
				list = upload.parseRequest(request);
				//4.�Լ��Ͻ��б���
				for(FileItem item:list){
					//�ж��Ƿ�Ϊ��ͨ�ļ�
					if(item.isFormField()){
						//��ȡ��ͨ��Ԫ�ص�����
						String name=item.getFieldName();
						//��˾��Ʒ����
						if(name.equals("product")){
							bi.setPrName(item.getString("utf-8"));
							prName=bi.getPrName();
							
						//��˾���
						}else if(name.equals("productUrl")){
							bi.setPrAddress(item.getString("utf-8"));
							prAddress=bi.getPrAddress();
							
						//��˾��ַ
						}else if(name.equals("productProhaha")){
							bi.setPrIntroduce(item.getString("utf-8"));
							printroduce=bi.getPrIntroduce();
							
						}
					}else{
						//��ȡ�ļ�Ԫ�ص�����
						String filename=item.getName();
						if(filename==null || filename==""){
							continue;
						}	
						//ȡ�ļ��ĺ�׺
						String houzhui=filename.substring(filename.indexOf("."));
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						String name=sdf.format(date);
						name=name+houzhui;
						//��������ַ
						String path=application.getRealPath("upload");
						//ͼƬ��ַ�����ݿ��ַ
						bi.setPrPicture("upload\\"+name);
						prPicture=bi.getPrPicture();
						/*bi.setBuPicture("upload\\"+name);*/
						
						//�����ϴ��ļ�����
						File file=new File(path,name);
						//���浽������
						try {
							item.write(file);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				} 
				//����ҵ��㣬��ӹ�˾��Ϣ
				//bis.addBusinessInfo(bi);
				//��ת
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
			//�޸Ĺ�˾��ϸ���� ��id����ȥ
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
			//�޸Ĺ�˾�޸Ĺ�˾���У����򣬹�ģ����ҳ  ��id����ȥ
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
			//�޸Ĺ�˾�޸Ĺ�˾���У����򣬹�ģ����ҳ  ��id����ȥ
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

		}else if("zhiwei02".equals(op)){ //����ְλ ע��
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
		}else if("zhiweishouyelist".equals(op)){ //��˾�˺� ����ְλ����
			List<BusinessRecruit> businessRecruit=brs.getAllBusinessRecruit(gongzhubuid);
			session.setAttribute("businessRecruit", businessRecruit);
			response.sendRedirect("zhiweishouye.jsp");
		}else if("zhiweiyulan".equals(op)){  //ְλԤ��
			int id=Integer.parseInt(request.getParameter("id"));
			BusinessRecruit br=brs.getBusinessRecruitById(id);
			session.setAttribute("BusinessRecruit",br);
			response.sendRedirect("yulanzhiwei.jsp");
		}else if("zhiweishanchu".equals(op)){ //ɾ��ְλ
			int id=Integer.parseInt(request.getParameter("id"));
			int n=brs.delBusinessRecruit(id);
			if(n<1){
				out.print("<script>alert('����ʧ��');location.href='zhiweishouye.jsp'</script>");
			}else{
				out.print("<script>alert('���߳ɹ�');location.href='zhiweishouye.jsp'</script>");
			}
		}else if("zhiweidashouyelist".equals(op)){  //��˾��ѯ
			//����ҵ��
			
			int pageIndex=1;
			//��ȡ�û�ѡ��ҳ��
			if(request.getParameter("pageIndex")!=null){
				pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
				
			}
			
			
			String bucity1="";
			if(request.getParameter("bucity1")!=null){
				bucity1=request.getParameter("bucity1");//��������������������
			}
			
			
			
			String budevelopment2="";
			if(request.getParameter("budevelopment2")!=null){
				budevelopment2=request.getParameter("budevelopment2");//��������������������
			}
			
			String bubigjob3="";
			if(request.getParameter("bubigjob3")!=null){
				bubigjob3=request.getParameter("bubigjob3");//��������������������
			}

			//����ҵ��
			PageUtil<BusinessInfo> page=bis.getBusinessInfoByPage(bucity1,budevelopment2,bubigjob3, pageIndex, 6);
			session.setAttribute("page", page);
			//ת������ҳ
			response.sendRedirect("zhiweidashouye.jsp");
		}else if("zhiweidsy".equals(op)){
			String name=request.getParameter("name");
			BusinessInfo bi=bis.getBusinessInfoByName(name);
			gongzhubuid=bi.getBuId();
			session.setAttribute("BusinessInfo",bi);
			response.sendRedirect("zhiweidashouye.jsp");
		}else if("zhiweixijie".equals(op)){  //���ݹ�˾id��ѯ��˾������Ϣ(����ְλ��Ϣ)
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
			
			out.print("<script>alert('���ͳɹ�');location.href='gongsijianli.jsp'</script>");
		}else if("yulanjianli".equals(op)){
			int id=Integer.parseInt(request.getParameter("id"));
			BusinessResume businessresume=brs2.getBusinessResumeById(id);
			session.setAttribute("businessresume",businessresume);
			response.sendRedirect("yulanjianli.jsp");
		}else if("ajax".equals(op)){   //ajax�жϹ�˾ȫ��
			String buname=request.getParameter("buname");
			String msg="";
			if(bis.getBusinessInfoByBuName(buname)==-1){
				msg="not";//�Ѿ�ע��
			}else{
				msg="ok";//����ע��
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
		}else if("jianlishouyelist".equals(op)){ //��˾��������     �¼ӵ�  ���滹һ�� brs2
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
