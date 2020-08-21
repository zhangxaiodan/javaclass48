package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.pojo.UserInfo;
import com.kgc.service.UinfoService;
import com.kgc.service.UloginService;

public class UinfoServlet extends HttpServlet {

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
	
		String name=request.getParameter("username");
		String sex=request.getParameter("sex");
		String birthday=request.getParameter("birthday");
		String phone=request.getParameter("phone");
		
		String address=request.getParameter("address");
		String email=(String)session.getAttribute("email");
		String pwd=(String)session.getAttribute("pwd");//新增11111111
		UserInfo ui=new UserInfo();
		ui.setUiName(name);
		ui.setUiSex(sex);
		ui.setUiBirthday(birthday);
		ui.setUiPhone(phone);
		
		ui.setUiAddress(address);
		ui.setUiEmail(email);
		//调用业务
		UinfoService us=new UinfoService();
		if(us.Uinfo(ui)>0){//更新成功
			String msg="yes";
			//out.print(msg);
			UloginService uls=new UloginService();//新增1111111111
			UserInfo user=uls.login(email, pwd);//新增111111111
			session.setAttribute("userinfo", user);	
			out.print("<Script>alert('个人资料修改成功');window.location.href='account.jsp';</Script>");
			System.out.println(msg);
		}else{
			String msg="no";
			out.print(msg);
			System.out.println(msg);
		}
	}

}
