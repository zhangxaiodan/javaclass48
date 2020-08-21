package com.kgc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		//�õ�request��response����ΪServletRequest�Ǹ��࣬��Ҫ��ת��
		 HttpServletRequest request=(HttpServletRequest)arg0;
		 HttpServletResponse response=(HttpServletResponse)arg1;
		//��ȡsession
		HttpSession session=request.getSession();
		if(session!=null&&session.getAttribute("user")!=null){
			//����
		arg2.doFilter(arg0, arg1);
		}else{
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
