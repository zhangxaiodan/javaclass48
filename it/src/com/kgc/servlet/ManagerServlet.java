package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.pojo.Manager;
import com.kgc.service.ManagerService;

public class ManagerServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerServlet() {
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
		//����ҵ���߼���
		ManagerService ms=new ManagerService();
		//ͨ������õ�session
	    HttpSession session=request.getSession();
		//�������
		String op=request.getParameter("op");
		//��ȡ�û���������
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		if("login".equals(op)){
			Manager m=ms.login(name, pwd);
			if(m!=null){
				session.setAttribute("m", m);
				//session.setAttribute("m1", m.getMaId());
				response.sendRedirect("gindex.jsp");
			}else{
				session.setAttribute("msg", "�û��������������");
				response.sendRedirect("glogin.jsp");
			}
		}else if("loginout".equals(op)){
			session.removeAttribute("m");
			response.sendRedirect("glogin.jsp");
		}else if("update".equals(op)){
			//��ȡ
			int id=Integer.parseInt(request.getParameter("id"));
			String upwd=request.getParameter("newpassword");
			//String jpwd=request.getParameter("newpassword1");
			String cpwd=request.getParameter("newpassword2");
			String email=request.getParameter("email");
			if(upwd.equalsIgnoreCase(cpwd)){
				Manager m=new Manager();
				m.setMaId(id);
				m.setMaPwd(cpwd);
				m.setMaEmail(email);
				int n=ms.updatePwd(m);
				if(n>0){
					out.print("<script>alert('�޸ĳɹ�');location.href='glogin.jsp'</script>");
				}else{
					out.print("<script>alert('�޸�ʧ��');location.href='password_edit.jsp'</script>");
				}
			}else{
				out.print("<script>alert('�������벻һ������������');location.href='password_edit.jsp'</script>");
			}
		}else if("list".equals(op)){
			List<Manager> list=ms.getAllManager();
			//�ŵ�session��������
			//HttpSession session=request.getSession();
			session.setAttribute("mm", list);
			response.sendRedirect("article-list.jsp");
		}else if("show".equals(op)){
			//��ȡid
			int id=Integer.parseInt(request.getParameter("id"));
			Manager m=ms.getManagerById(id);
			
			session.setAttribute("ma", m);
			response.sendRedirect("password_edit.jsp");
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
