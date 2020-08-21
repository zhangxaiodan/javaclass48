package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.pojo.BusinessInfo;
import com.kgc.service.ShowJobService;

public class JobsServlet extends HttpServlet {

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

		//通过请求得到session
		HttpSession session=request.getSession();
		     
    	response.setContentType("text/html;charset=utf-8");
 		request.setCharacterEncoding("utf-8");
 		response.setCharacterEncoding("utf-8");		
 		//out对象
 		PrintWriter out = response.getWriter();
 		ShowJobService ss=new ShowJobService();
 		String kd=request.getParameter("kd");//搜索文本框内容
 		String spc=request.getParameter("spc");//公司/职位
 		String city=request.getParameter("city"); //城市
 		String yx=request.getParameter("yx");//月薪
 		String gj=request.getParameter("gj");//工作经验
 		String xl=request.getParameter("xl");//学历
 		String gx=request.getParameter("gx");//工作性质
 		String bucity1=request.getParameter("bucity1");
	    System.out.println("kd="+kd);
	    System.out.println("spc="+spc);
	    System.out.println("city="+city);
	    System.out.println("yx="+yx);
	    System.out.println("gj="+gj);
	    System.out.println("xl="+xl);
	    System.out.println("gx="+gx);
 		if(yx!=""){
 			System.out.println("进入yx");
 			List<BusinessInfo> list=new ArrayList<BusinessInfo>(); 		    	
 			list=ss.getJobByP(yx);
 			session.setAttribute("jobList", list);
 		    response.sendRedirect("joblist.jsp"); 			
 		}else if(gj!=""){
 			System.out.println("进入gj");
 			List<BusinessInfo> list=new ArrayList<BusinessInfo>(); 		    	
 			list=ss.getJobByE(gj);
 			session.setAttribute("jobList", list);
 		    response.sendRedirect("joblist.jsp"); 	
 			
 		}else if(xl!=""){
 			System.out.println("进入xl");
 			List<BusinessInfo> list=new ArrayList<BusinessInfo>(); 		    	
 			list=ss.getJobByS(xl);
 			session.setAttribute("jobList", list);
 		    response.sendRedirect("joblist.jsp"); 
 		}else{
 			if("1".equals(spc)){ 
 				System.out.println("进入spc=1");
	 			List<BusinessInfo> list=new ArrayList<BusinessInfo>(); 		    	
	 			list=ss.getJobByJ(kd);
	 			session.setAttribute("jobList", list);
	 		    response.sendRedirect("joblist.jsp");
	 		    
	 			
	 		}else if("4".equals(spc)){
	 			System.out.println("进入spc=4");
	 			List<BusinessInfo> list=new ArrayList<BusinessInfo>();
	 			list=ss.getJobByB(kd);
	 			session.setAttribute("jobList", list);
	 			response.sendRedirect("joblist.jsp");
	 			
	 		}
 		}
 			 		
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

		doGet(request, response);
	}

}
