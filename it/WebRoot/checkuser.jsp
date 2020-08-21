<%@page import="com.kgc.pojo.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   //用户登录用于拦截一些用户，登录之后才可以看到网页
   UserInfo ui=(UserInfo)session.getAttribute("user");
   //如果没登录
   if(ui==null){
      //跳转到登录的页面
      session.setAttribute("msg", "请先登录");
      response.sendRedirect("index.jsp");
      return;
   }
 %>