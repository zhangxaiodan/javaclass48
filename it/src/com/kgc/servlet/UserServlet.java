package com.kgc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kgc.pojo.UserInfo;
import com.kgc.service.UserInfoService;
import com.kgc.util.PageUtil;

public class UserServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public UserServlet() {
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
	//��ѯ
	public void doList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�����û�ҵ���߼������
		UserInfoService us=new UserInfoService();
		//��ʼ��ҳ��
		int pageIndex=1;
		//�ж�ҳ���Ƿ�Ϊ��
		if(request.getParameter("index")!=null){
			pageIndex=Integer.parseInt(request.getParameter("index"));
		}
		String name=request.getParameter("name");
		PageUtil<UserInfo> page=us.getUserByPage(name, -1, pageIndex, 2);
		request.setAttribute("page", page);
		//��ȡ���е��û�
		List<UserInfo> list=us.getAllUser();
		//����session������
		HttpSession session=request.getSession();
		session.setAttribute("user", list);
		request.getRequestDispatcher("user_list.jsp").forward(request, response);
	}
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
		String op=request.getParameter("op");
		if("list".equals(op)){
			doList(request, response);
		}else if("del".equals(op)){
			//�����û�ҵ���߼������
			UserInfoService us=new UserInfoService();
			int id=Integer.parseInt(request.getParameter("biid"));
			int n=us.del(id);
			if(n>0){
				out.print("<script>alert('ɾ���ɹ�');location.href='job_list.jsp'</script>");
			}else{
				out.print("<script>alert('ɾ��ʧ��');location.href='job_list.jsp'</script>");
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
