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
import com.kgc.service.UloginService;

public class LoginServlet extends HttpServlet {

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
		//调用普通用户登录业务
		UloginService us=new UloginService();
		//调用企业用户登录业务
		BloginService bs=new BloginService();
		//获取登录者身份
		String useratt=request.getParameter("useratt");
		session.setAttribute("useratt", useratt);
		//获取用户名，密码
		String email=request.getParameter("email");
		session.setAttribute("email",email);
		String pwd=request.getParameter("password");
			
		
	if("p".equals(useratt)){
			//个人用户登陆			
			UserInfo user=us.login(email, pwd);
			if(user!=null){
				//登录成功
				//获取登录对象
				session.setAttribute("user", user);
				session.setAttribute("user1", user.getUiLoginName());
				session.setAttribute("email",  user.getUiEmail());	
				session.setAttribute("userinfo", user);	
				session.setAttribute("pwd",pwd);//新增111111111
				String msg="uyes";
				//发送到客户端数据
				out.print(msg);	
				//System.out.println("yeah");
				
			}else{
				
				session.setAttribute("msg", "用户名或密码错误");
				String msg="no";
				//发送到客户端数据
				out.print(msg);
				
			}
		}else{
			//企业用户登录
			BusinessInfo buser=bs.login(email, pwd);
			if(buser!=null){
				//登录成功
				//获取登录对象
				session.setAttribute("user", buser.getBuLoginName());
			
				String msg="byes";
				//发送到客户端数据
				out.print(msg);
				
				System.out.println(email);
				System.out.println(pwd);
				System.out.println("企业登陆成功");
			}else{				
				session.setAttribute("msg", "用户名或密码错误");
				String msg="no";
				//发送到客户端数据
				out.print(msg);			
				
			}
		}
		
	}
}