package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.JobInfo;
import com.kgc.service.BigJobInfoService;
import com.kgc.service.JobInfoService;
import com.kgc.util.PageUtil;


public class BigJobInfoServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public BigJobInfoServlet() {
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
	
	public void doStop(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String stop=request.getParameter("stop");
		if(stop.equals("ok")){
			
		}
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String op=request.getParameter("op");
		BigJobInfoService bs=new BigJobInfoService();
		JobInfoService js=new JobInfoService();
		if("list".equals(op)){
			//初始化页码
			int pageIndex=1;
			//判断页码是否为空
			if(request.getParameter("index")!=null){
				pageIndex=Integer.parseInt(request.getParameter("index"));
			}
			//
			Integer id=-1;
			if(request.getParameter("sel")!=null&&!request.getParameter("sel").equals("")){
				id=Integer.parseInt(request.getParameter("sel"));
			}
			String name=request.getParameter("name");
			//调用业务逻辑层
			PageUtil<BigJobInfo> page=js.getJobInfo(id, name, pageIndex, 10);
			request.setAttribute("page", page);
			
			//获取所有行业领域
			List<BigJobInfo> list=bs.getAllInfo();
			//放在session作用域
			HttpSession session=request.getSession();
			session.setAttribute("departs", list);
			//获取所有行业领域
			List<BigJobInfo> list1=bs.getAllJobInfo();
			session.setAttribute("session", list1);
			
			//转发
			request.getRequestDispatcher("job_list.jsp").forward(request,response);
		}else if("add".equals(op)){
			//获取数据
			//int id=Integer.parseInt(request.getParameter("biid"));
			String name=request.getParameter("sel");
			String jname=request.getParameter("adminName");
			BigJobInfo bj=new BigJobInfo();
			JobInfo ji=new JobInfo();
			//bj.setBiId(id);
			bj.setBiBigJob(name);
			bj.setBiJob(jname);
			ji.setBj(bj);
			ji.setJiJob(jname);
			//ji.setBiId(id);
			//调用业务层
			int n=bs.addJob(bj);
			 n=js.addJob(ji);
			if(n>0){
				out.print("<script>alert('添加成功');location.href='job_list.jsp'</script>");
			}else{
				out.print("<script>alert('添加失败');location.href='job_add.jsp'</script>");
			}	
		}else if("del".equals(op)){
			int id=Integer.parseInt(request.getParameter("biid"));
			int n=bs.del(id);
			if(n>0){
				out.print("<script>alert('删除成功');location.href='job_list.jsp'</script>");
			}else{
				out.print("<script>alert('删除失败');location.href='job_list.jsp'</script>");
			}
		}else if("stop".equals(op)){
			doStop(request, response);
		}else if("update".equals(op)){
			
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
