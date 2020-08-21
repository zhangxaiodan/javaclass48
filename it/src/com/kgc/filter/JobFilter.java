package com.kgc.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.service.ShowJobService;

public class JobFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain arg2) throws IOException, ServletException {
		
		System.out.println("进入过滤器");
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");		
		//out对象
		//PrintWriter out = response.getWriter();
		
		ShowJobService ss=new ShowJobService();
		
		List<BusinessInfo> jobList=ss.showAllJob();
		
		arg2.doFilter(request, response);
		System.out.println("离开过滤器");
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
