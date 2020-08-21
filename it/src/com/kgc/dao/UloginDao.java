package com.kgc.dao;

import com.kgc.pojo.UserInfo;

/**
 * 普通用户数据访问层
 * @author Administrator
 *
 */
public interface UloginDao {
   //用户登陆
	public UserInfo Ulogin(String email,String pwd);
}