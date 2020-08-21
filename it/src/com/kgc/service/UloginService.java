package com.kgc.service;

import com.kgc.dao.UloginDao;
import com.kgc.dao.impl.UloginDaoImpl;
import com.kgc.pojo.UserInfo;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
public class UloginService {
	//创建一个数据访问层对象
		UloginDao dao=new UloginDaoImpl();	
		public UserInfo login(String email,String pwd){		
			UserInfo user=dao.Ulogin(email, pwd);
			return user;
		}
}
