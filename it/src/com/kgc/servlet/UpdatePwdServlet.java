package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.UserInfo;
import com.kgc.service.BloginService;
import com.kgc.service.PwdService;
import com.kgc.service.UloginService;

public class UpdatePwdServlet extends HttpServlet {

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
		//通过请求得到session
		HttpSession session=request.getSession();		
		PrintWriter out = response.getWriter();
		//调用修改密码业务
		PwdService ps=new PwdService();
		//获取登录者身份
		String useratt=(String)session.getAttribute("useratt");
		//获取用户名，旧密码，新密码
		String email=(String)session.getAttribute("email");
		
		String oldPwd=request.getParameter("oldpassword");
		
		String newPwd=request.getParameter("newpassword");
		System.out.println("传入servlet"+useratt);
		//调用普通用户登录业务
		UloginService us=new UloginService();
		//调用企业用户登录业务
		BloginService bs=new BloginService();		
		
		if("p".equals(useratt)){
			UserInfo user=us.login(email, oldPwd);
			System.out.println(email);
			System.out.println(oldPwd);
			System.out.println(newPwd);
			if(user!=null){//用户旧密码登陆成功
				if(ps.Upwd(email, newPwd)>0){
					String msg="uyes";
					out.print(msg);
					System.out.println("用户密码修改成功");
				}
			}else{
				String msg="no";
				out.print(msg);
				System.out.println("用户当前密码错误");
			}
			
		}else{
			BusinessInfo user=bs.login(email, oldPwd);
			if(user!=null){//企业旧密码登陆成功
				if(ps.Bpwd(email, newPwd)>0){
					String msg="byes";
					out.print(msg);
					System.out.println("企业密码修改成功");
				}
			}else{
				String msg="no";
				out.print(msg);
				System.out.println("企业当前密码错误");
			}
			
		}
	}

}
