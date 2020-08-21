package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.service.BregisterService;
import com.kgc.service.UregisterService;

public class RegisterServlet extends HttpServlet {

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
		//通过请求得到session
		HttpSession session=request.getSession();
		
		PrintWriter out = response.getWriter();
		//调用普通用户注册业务
		UregisterService us=new UregisterService();
		//调用企业用户注册业务
		BregisterService bs=new BregisterService();
		//获取注册者身份
		String type=request.getParameter("type");
		//获取用户名，密码
		String email=request.getParameter("email");
		String pwd=request.getParameter("password");
		
		if("0".equals(type)){
			//个人用户注册				
			if(us.regist(email, pwd)>0){
				String msg="Uyes";
				//发送到客户端数据
				out.print(msg);	
				//System.out.println("个人用户注册成功");
			}else{
				String msg="no";
				//发送到客户端数据
				out.print(msg);	
				//System.out.println("用户名重复");
			}
			
		}else{
			//企业用户注册
			if((bs.regist(email, pwd))!=0){//如果不为0：未重名
				String msg="Byes";
				//发送到客户端数据
				out.print(msg);
				//System.out.println("企业用户注册成功");				
				session.setAttribute("email", email);
				session.setAttribute("pwd", pwd);
			}else{
				String msg="no";
				//发送到客户端数据
				out.print(msg);	
				//System.out.println("用户名重复");
			}
			
		}
	}

}
