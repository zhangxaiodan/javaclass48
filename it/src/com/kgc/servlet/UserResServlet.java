package com.kgc.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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

import com.kgc.pojo.BusinessRecruit1;
import com.kgc.pojo.BusinessResume;
import com.kgc.pojo.Collectionsjob;
import com.kgc.pojo.LikeInfo;
import com.kgc.pojo.UserInfo;
import com.kgc.pojo.UserResume;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.projectexperience;
import com.kgc.pojo.workexperience;

import com.kgc.service.BusinessRecruitService;
import com.kgc.service.BusinessResumeService;
import com.kgc.service.LikeInfoService;
import com.kgc.service.UloginService;
import com.kgc.service.UserInfoService;
import com.kgc.service.UserResuService;
import com.kgc.service.CollectionsjobService;
import com.kgc.service.projectService;
import com.kgc.service.workService;
import com.kgc.util.PageUtil;

public class UserResServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         doPost(request, response);
	}
	//
	public void doupdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		 HttpSession session=request.getSession();
		 UserInfo u=(UserInfo)session.getAttribute("user");
	    String expectCity=request.getParameter("expectCity");
	    String type=request.getParameter("type");
	    //
	    String expectPosition=request.getParameter("expectPosition");
	    //
	    String select_expectSalary=request.getParameter("select_expectSalary");
	    //
	    UserResuService urs=new UserResuService();
	    UserResume ur=new UserResume();
	    ur.setArid(expectCity);
	    ur.setBiid(expectPosition);
	    ur.setUrnature(type);
	    ur.setUrmoney(select_expectSalary);
	    ur.setUrid(u.getUrId());
	    //
	    if(urs.getuserresume(ur.getUrid())!=null){
	    	//         
	    	int n=urs.updateexceptjob(ur);
	            if(n>0){
	    	        out.print(1);
	            }else{
	    	        out.print(0);
	           }
	                out.flush();
	                out.close();
	           }
	}
	//
	public void doaddjingli(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
	    UserInfo u=(UserInfo)session.getAttribute("user");
		//
		String companyName=request.getParameter("companyName");
		String positionName=request.getParameter("positionName");
	    String companyYearStart=request.getParameter("companyYearStart");
	    String companyMonthStart=request.getParameter("companyMonthStart");
	    String companyYearEnd=request.getParameter("companyYearEnd");
	    String companyMonthEnd=request.getParameter("companyMonthEnd");
	    
	    String starttime=companyYearStart+"-"+companyMonthStart;
	    String overtime=companyYearEnd+"-"+companyMonthEnd;
	    //
	   // String urjingli=companyName+":"+positionName+","+companyYearStart+"-"+companyMonthStart+","+companyYearEnd+"-"+companyMonthEnd;
	    //
	    UserResuService urs=new UserResuService();
	    UserResume ur=new UserResume();
	    //ur.setUrjingli(urjingli);
	   // ur.setUrid(u.getUrId());
	    workService w=new workService();
	    workexperience ww=new workexperience();
	    ww.setUrid(u.getUrId());
	    ww.setCompany(companyName);
	    ww.setJobname(positionName);
	    ww.setStarttime(starttime);
	    ww.setOvertime(overtime);
	          int n=w.addwork(ww);
	          //
	            if(n>0){
	    	      out.print(1);//         
	    	      }else{
	    	      out.print(0);//
	           }
	              out.flush();
	              out.close();
	    }	
	public void doaddpj(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 PrintWriter out=response.getWriter();
		 HttpSession session=request.getSession();
		 UserInfo u=(UserInfo)session.getAttribute("user");
		//
		String projectName=request.getParameter("projectName");
	    String thePost=request.getParameter("thePost");
	    String projectYearStart=request.getParameter("projectYearStart");
	    String projectMonthStart=request.getParameter("projectMonthStart");
	    String projectYearEnd=request.getParameter("projectYearEnd");
	    String projectMonthEnd=request.getParameter("projectMonthEnd");
	    String projectDescription=request.getParameter("projectDescription");
	 
	   // String urproject=projectName+":"+thePost+","+projectYearStart+"-"+projectMonthStart+","+projectYearEnd+"-"+projectMonthEnd+","+projectDescription;
	    
	    String projectStartTime=projectYearStart+"-"+projectMonthStart;
	    String projectendTime=projectYearEnd+"-"+projectMonthEnd;
	    
	    UserResuService urs=new UserResuService();
	    UserResume ur=new UserResume();
	    //赋值
	    projectService p=new projectService();
		projectexperience j=new projectexperience();
		j.setProjectname(projectName);
		j.setTheposter(thePost);
		j.setProjectstarttime(projectStartTime);
		j.setProjectendtime(projectendTime);
		j.setProjectdescription(projectDescription);
		j.setUrid(u.getUrId());
	    //
	          int n=p.addproject(j);
			   //
			    if(n>0){
			    	out.print(1);
			    }else{
			    	out.print(0);
			    }
			    out.flush();
			    out.close();
			}

	//
	public void doaddedu(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  PrintWriter out=response.getWriter();
		  HttpSession session=request.getSession();
		  UserInfo u=(UserInfo)session.getAttribute("user");
		  //
		String schoolName=request.getParameter("schoolName");
		String degree=request.getParameter("degree");
		String professionalName=request.getParameter("professionalName");
		String schoolYearStart=request.getParameter("schoolYearStart");
		String schoolYearEnd=request.getParameter("schoolYearEnd");
	    //
		String uryear="开始时间："+schoolYearStart+"结束时间"+schoolYearEnd;
		//
		UserResuService urs=new UserResuService();
		
		UserResume ur=new UserResume();
		
		ur.setUrschool(schoolName);
		ur.setUreducation(degree);
		ur.setUrsubject(professionalName);
		ur.setUryear(uryear);
		ur.setUrid(u.getUrId());
		//
	    if(urs.getuserresume(ur.getUrid())!=null){
			int n=urs.updateedu(ur);
			//
			if(n>0){
				out.print(1);//
			}else{
				out.print(0);//
			}
			out.flush();
			out.close();
	}
}
	//
	public void doaddintroduce(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//
		String selfDescription=request.getParameter("selfDescription");
		HttpSession session=request.getSession();
	    UserInfo u=(UserInfo)session.getAttribute("user");
		//
		UserResuService urs=new UserResuService();
		UserResume ur=new UserResume();
		ur.setUrintroduce(selfDescription);
		ur.setUrid(u.getUrId());
		if(urs.getuserresume(ur.getUrid())!=null){
		   int n=urs.updateintroduce(ur);
				
				if(n>0){
				  out.print(1);//
				}else{
				  out.print(0);//
				}
				  out.flush();
				  out.close();
				}
	}
	//
	public void doaddshow(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	     	PrintWriter out=response.getWriter();
	    //
		String workLink=request.getParameter("workLink");
		String workDescription=request.getParameter("workDescription");
	    HttpSession session=request.getSession();
	    UserInfo u=(UserInfo)session.getAttribute("user");
		//
		UserResuService urs=new UserResuService();
		UserResume ur=new UserResume();
		ur.setUraddress(workLink);
		ur.setUrdescribe(workDescription);
		ur.setUrid(u.getUrId());
		//
		if(urs.getuserresume(ur.getUrid())!=null){
			int n=urs.updateshow(ur);
			//
			if(n>0){
			   out.print(1);//
			}else{
			   out.print(0);//
				}
			  out.flush();
			  out.close();
	   }
	}
	//
	public void dochange(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  PrintWriter out=response.getWriter();
		  //
		 String resumeName=request.getParameter("resumeName");
		  //
		 HttpSession session=request.getSession();
		 UserInfo u=(UserInfo)session.getAttribute("user");
		 UserResuService urs=new UserResuService();
		 UserResume ur=new UserResume();
		 ur.setUrname(resumeName);
		 ur.setUrid(u.getUrId());
		  //
		 int n=urs.updatename(ur);
		  //
			if(n>0){
			   out.print(1);//
			}else{
			   out.print(0);//
				}
			  out.flush();
			  out.close();  
	      }
	
	 //
	public void docheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		//
		UserResuService urs=new UserResuService();
		UserInfoService us=new UserInfoService();
		
		//
	    //int id=Integer.parseInt(request.getParameter("id"));
		//
		//UserInfo u=us.getJlid(7);
		//UserResume ur=urs.getuserresume(u.getUrid());
		UserInfo u=(UserInfo)session.getAttribute("user");
		UserResume ur=urs.getuserresume(u.getUrId());
		request.setAttribute("ur", ur);
		//Integer count=urs.countuser();
		//
		//request.setAttribute("count", count);
		//工作经历列表
		workService w=new workService();
		List<workexperience> list=w.getAllworks(u.getUrId());
		//保存到作用域
		request.setAttribute("worklist", list);
		//
	    //项目经验
		projectService s=new projectService();
		List<projectexperience>	list1=s.getAllprojects(u.getUrId());
		//保存到作用域
		request.setAttribute("plist", list1);
		//根据id查询头像地址
		
	}
	public void dodel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		//int id=Integer.parseInt(request.getParameter("jno"));
		CollectionsjobService cj=new CollectionsjobService();
		int jno=Integer.parseInt(request.getParameter("jno"));
		//System.out.println(jno);
		int n=cj.delcelljob(jno);
		if(n>0){
		   out.print(1);
		}else{
		   out.print(0);
			}
		  out.flush();
		  out.close(); 
	}
	//
	public void dosub(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//
		String  email=request.getParameter("email");
		String sendMailPer=request.getParameter("sendMailPer");
		String positionName=request.getParameter("positionName");
		String city=request.getParameter("city");
		String financeStage=request.getParameter("financeStage");
		String industryField=request.getParameter("industryField");
		String salary=request.getParameter("salary");
		//
		LikeInfoService lifs=new LikeInfoService();
		LikeInfo info=new LikeInfo();
		info.setLiEmail(email);
		info.setLiTime(sendMailPer);
		info.setLiJob(positionName);
		info.setLiWorkAddress(city);
		info.setLiDevelopment(financeStage);
		info.setBiid(industryField);
		info.setLiMoney(salary);
		int n=lifs.addLikeInfo(info);
		//
		if(n>0){
		  out.print(1);//
		}else{
		  out.print(0);//
		}
		  out.flush();
		  out.close(); 
	}
	public void doseldy(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//
		LikeInfoService lf=new LikeInfoService();
		int pageIndex=1;
		//	
		if(request.getParameter("index")!=null){
			pageIndex=Integer.parseInt(request.getParameter("index"));
		}
		//
		PageUtil<LikeInfo> page=lf.getAllLikeInfo(pageIndex, 3);
		//
		request.setAttribute("dylist", page);
	}
	
	public void dodeldy(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		LikeInfoService lf=new LikeInfoService();
		int id=Integer.parseInt(request.getParameter("liid"));
		int n=lf.delsubscribe(id);
		//
			if(n>0){
			     out.print(1);//
		    }else{
			      out.print(0);//
				}
				  out.flush();
				  out.close(); 
		
	}	
	public void douppjl(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session=request.getSession();
	    UserInfo u=(UserInfo)session.getAttribute("user");
		//
		UserResume ur=new UserResume();
		UserResuService urs=new UserResuService();
		ServletContext application = this.getServletContext();
		PrintWriter out = response.getWriter();
		
		FileItemFactory factory=new DiskFileItemFactory();
		 
        ServletFileUpload upload=new ServletFileUpload(factory);
        
        upload.setFileSizeMax(5*1024*1024);
        
        upload.setHeaderEncoding("UTF-8"); 
       
        List<FileItem> list=null;
        try {
        	
			list=upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //
        for(FileItem item:list){
        	//
        	if(!item.isFormField()){
        		 //
                String name=item.getName();
                String filename=name.substring(name.lastIndexOf("\\")+1);
                out.print("上传文件"+filename);
                 //
                String path=application.getRealPath("upload");
                 //  
                ur.setUrjlpath("upload\\"+filename); 
                    //
	                File file=new File(path,filename);
	                try {
						//
						item.write(file);
						out.println("上传成功");
					} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}          
        	}
      ur.setUrid(u.getUrId());
      int n=urs.addjlpath(ur);
      if(n>0){
    	  out.print("<script>alert('上传成功');location.href='jianli.jsp'</script>");  
      }else{
    	  out.print("<script>alert('上传失败');location.href='jianli.jsp'</script>");
      }
   }
}
	public void dologin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		   PrintWriter out = response.getWriter();
	       String email=request.getParameter("email");
	       String password=request.getParameter("password");
	       
			HttpSession session=request.getSession();
		   
	       
	       UloginService uus=new UloginService();
	      
	        UserInfo user=uus.login(email, password);
		   if(user!=null){ 
			   //request.getSession().setAttribute("user",user);
			   session.setAttribute("user",user);
			   out.print("<script>location.href='index1.jsp'</script>");   
		    }else{
		       out.print("<script>alert('登录失败');location.href='login.jsp'</script>");
		    }
	}
	public void dochangesz(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	      //
		 HttpSession session=request.getSession();
	     UserInfo u=(UserInfo)session.getAttribute("user");
		 UserResuService urs=new UserResuService();
		 UserResume ur=new UserResume();
		 int id=Integer.parseInt(request.getParameter("name"));
		 ur.setUrid(u.getUrId());
		 ur.setIs_default(id);
		 int n=urs.updateuserid(ur);
		 if(n>0){
			 out.print("<script>alert('设置成功');location.href='jianli.jsp'</script>");  
		 }else{
			 out.print("<script>alert('设置失败');location.href='jianli.jsp'</script>");  
		 }
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		
		String op=request.getParameter("op");
		
		if("sel".equals(op)){
			docheck(request,response);	
			
			request.getRequestDispatcher("jianli.jsp").forward(request, response);
		}else if("ajaxupdate".equals(op)){
			doupdate(request,response);
		}else if("ajaxupdatejl".equals(op)){
			doaddjingli(request,response);
		}else if("ajaxupdatepj".equals(op)){
			doaddpj(request,response);
		}else if("ajaxupdateedu".equals(op)){
			doaddedu(request,response);
		}else if("ajaxintroduce".equals(op)){
			doaddintroduce(request,response);
		}else if("ajaxshow".equals(op)){
			doaddshow(request,response);
		}else if("ajaxchange".equals(op)){
			dochange(request,response);
		}else if("showsel".equals(op)){
			docheck(request,response);
			//工作经历
		
			request.getRequestDispatcher("preview.jsp").forward(request, response);
		}else if("showcang".equals(op)){
			
			BusinessRecruitService brs=new BusinessRecruitService();
			int pageIndex=1;
			
			if(request.getParameter("index")!=null){
				pageIndex=Integer.parseInt(request.getParameter("index"));
			}
			
			PageUtil<BusinessRecruit1> page=brs.getAlljobs(pageIndex, 3);
			
			request.setAttribute("showlist", page);
			
			request.getRequestDispatcher("collections.jsp").forward(request, response);
		}else if("ajaxdel".equals(op)){
			dodel(request,response);
		}else if("ajaxsub".equals(op)){
			dosub(request,response);
		}else if("seldy".equals(op)){
			doseldy(request,response);
			request.getRequestDispatcher("subscribe01.jsp").forward(request, response);	
		}else if("ajaxdeldy".equals(op)){
			dodeldy(request,response);
		}else if("uppjl".equals(op)){
			douppjl(request,response);
		}else if("login".equals(op)){
			dologin(request,response);
		}else if("showfrom".equals(op)){
			//
			dochangesz(request,response);
		}else if("basicinfo".equals(op)){
			PrintWriter out = response.getWriter();
			HttpSession session=request.getSession();
		    UserInfo u=(UserInfo)session.getAttribute("user");
			String name=request.getParameter("name");
			String sex=request.getParameter("gender");
			String education=request.getParameter("topDegree");
			String experience=request.getParameter("workyear");
			String currentStateVal=request.getParameter("currentState");
			String email=request.getParameter("email");
			String phone=request.getParameter("tel");
			
			UserResuService urs=new UserResuService();
			UserResume ur=new UserResume();
			ur.setUrname(name);
			ur.setUrsex(sex);
			ur.setUreducation(education);
			ur.setUrexperience(experience);
			ur.setCurrentState(currentStateVal);
			ur.setUremail(email);
			ur.setUrphone(phone);
			ur.setUrid(u.getUrId());
			int n=urs.updateinfo(ur);
			if(n>0){
			     out.print(1);//
		    }else{
			      out.print(0);//
				}
				  out.flush();
				  out.close();
		}else if("addrem".equals(op)){
			//
			HttpSession session=request.getSession();
			 UserInfo uu=(UserInfo)session.getAttribute("user");
			UserResuService us=new UserResuService();
			UserResume u=us.exeuqueryUserResume(uu.getUrId());
			
			//保存到作用域
			request.setAttribute("u", u);
			//
			UserResume uis_default=us.is_defaultradio(uu.getUrId());
			request.setAttribute("uis_default", uis_default);
			//转发
			request.getRequestDispatcher("toudi.jsp").forward(request, response);
		}else if("Ajaxaddremm".equals(op)){
			PrintWriter out = response.getWriter();
			//
	    	 HttpSession session=request.getSession();
	    	 //
			 UserInfo u=(UserInfo)session.getAttribute("user");
			int anniu1 = Integer.parseInt(request.getParameter("resumeName"));
			BusinessResumeService bb=new BusinessResumeService();
			BusinessResume brs=new BusinessResume();
	      if(anniu1 == 1){
			//	
	    	  int id=Integer.parseInt(request.getParameter("urid"));
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			String education=request.getParameter("education");
			String experience=request.getParameter("experience");
			String city=request.getParameter("city");
			String job=request.getParameter("job");
			String phone=request.getParameter("phone");
			String email=request.getParameter("email");
			String nature=request.getParameter("nature");
			String money=request.getParameter("money");
			String project=request.getParameter("project");
			String address=request.getParameter("address");
			String year=request.getParameter("year");
			String school=request.getParameter("school");
			String subject=request.getParameter("subject");
			String introduce=request.getParameter("introduce");
			String describe=request.getParameter("describe");
			String time=request.getParameter("time");
			String picture=request.getParameter("picture");
		
			brs.setBurName(name);
			brs.setBurSex(sex);
			brs.setBurEducation(education);
			brs.setBurExperience(experience);
			brs.setBurCity(city);
			brs.setBurJob(job);
			brs.setBurPhone(phone);
			brs.setBurEmail(email);
			brs.setBurNature(nature);
			brs.setBurMoney(money);
			brs.setBurProject(project);
			brs.setBurYear(year);
			brs.setBurSchool(school);
			brs.setBurSubject(subject);
			brs.setBurIntroduce(introduce);
			brs.setBurAddress(address);
			brs.setBurDescribe(describe);
			brs.setBurTime(time);
			brs.setBurPicture(picture);
			brs.setBurBuid(1);
			brs.setUrid(id);
			
		    int n=bb.addBusinessResume(brs);
		    if(n>0){
		    	out.print("<script>alert('投递成功');location.href='toudi.jsp'</script>");
		    }else{
		    	out.print("<script>alert('投递失败');location.href='toudi.jsp'</script>");
				}
				  out.flush();
				  out.close();
	     }else{
	    	
	    	 UserResuService urs=new UserResuService();
			 //
			 UserResume u1=urs.chaxunjlpath(u.getUrId());
			 //
			 int id=Integer.parseInt(request.getParameter("urid"));
			 String time=request.getParameter("time");
			 String path=u1.getUrjlpath();
			 
			 brs.setUrid(id);
			 brs.setBurPathjl(path);
			 brs.setBurTime(time);
			 brs.setBurBuid(10);
			 
	 		 int n2=bb.addBresumePath(brs);
	 		  if(n2>0){
	 			 out.print("<script>alert('投递成功');location.href='toudi.jsp'</script>");
	 		 }else{
	 			out.print("<script>alert('投递失败');location.href='toudi.jsp'</script>");
	 			}
	 			out.flush();
	 		    out.close();
	    	 }

		}else if("show".equals(op)){
			PrintWriter out = response.getWriter();
					
			//int n=Integer.parseInt(request.getParameter("name"));
					
			CollectionsjobService cc=new CollectionsjobService();
			Collectionsjob c=new Collectionsjob();
			
			 HttpSession session=request.getSession();
		     UserInfo u=(UserInfo)session.getAttribute("user");
		    
			 c.setUiid(u.getUiId());
			 c.setBrid(1);
			
			 int n1=cc.addcelljob(c);
			 if(n1>0){
				 out.print("<script>alert('您已经成功收藏');location.href='collections.jsp'</script>"); 
			 }else{
				 out.print("<script>alert('收藏失败');location.href='toudi.jsp'</script>");
			 }
		}else if("upp".equals(op)){
			
			HttpSession session=request.getSession();
		    UserInfo u=(UserInfo)session.getAttribute("user");
			//
			UserResume ur=new UserResume();
			UserResuService urs=new UserResuService();
			ServletContext application = this.getServletContext();
			PrintWriter out = response.getWriter();
			
			FileItemFactory factory=new DiskFileItemFactory();
			 
	        ServletFileUpload upload=new ServletFileUpload(factory);
	        
	        upload.setFileSizeMax(5*1024*1024);
	        
	        upload.setHeaderEncoding("UTF-8"); 
	       
	        List<FileItem> list=null;
	        try {
	        	
				list=upload.parseRequest(request);
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        //
	        for(FileItem item:list){
	        	//
	        	if(!item.isFormField()){
	        		 //
	                String name=item.getName();
	                String filename=name.substring(name.lastIndexOf("\\")+1);
	                out.print("文件名："+filename);
	                 //
	                String path=application.getRealPath("upload");
	                 //  
	                ur.setUrpicture("upload\\"+filename); 
	                    //
		                File file=new File(path,filename);
		                try {
							//
							item.write(file);
							out.println("上传成功");
						} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						}          
	        	}
	     //
	      ur.setUrid(u.getUrId());
	      int n=urs.phonepath(ur);
	      if(n>0){
	    	
	  		  UserResume resume=urs.photopath(u.getUrId());
	  		  //保存到作用域
	  		session.setAttribute("resume", resume);
	  		session.setAttribute("success", "上传成功");
	  		  //
	  		response.sendRedirect("jianli.jsp");  
	      }else{
	    	  out.print("<script>alert('上传失败');location.href='jianli.jsp'</script>");
	      }
	   }
			
		}
	
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
