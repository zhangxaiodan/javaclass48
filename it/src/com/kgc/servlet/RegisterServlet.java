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
		//ͨ������õ�session
		HttpSession session=request.getSession();
		
		PrintWriter out = response.getWriter();
		//������ͨ�û�ע��ҵ��
		UregisterService us=new UregisterService();
		//������ҵ�û�ע��ҵ��
		BregisterService bs=new BregisterService();
		//��ȡע�������
		String type=request.getParameter("type");
		//��ȡ�û���������
		String email=request.getParameter("email");
		String pwd=request.getParameter("password");
		
		if("0".equals(type)){
			//�����û�ע��				
			if(us.regist(email, pwd)>0){
				String msg="Uyes";
				//���͵��ͻ�������
				out.print(msg);	
				//System.out.println("�����û�ע��ɹ�");
			}else{
				String msg="no";
				//���͵��ͻ�������
				out.print(msg);	
				//System.out.println("�û����ظ�");
			}
			
		}else{
			//��ҵ�û�ע��
			if((bs.regist(email, pwd))!=0){//�����Ϊ0��δ����
				String msg="Byes";
				//���͵��ͻ�������
				out.print(msg);
				//System.out.println("��ҵ�û�ע��ɹ�");				
				session.setAttribute("email", email);
				session.setAttribute("pwd", pwd);
			}else{
				String msg="no";
				//���͵��ͻ�������
				out.print(msg);	
				//System.out.println("�û����ظ�");
			}
			
		}
	}

}
