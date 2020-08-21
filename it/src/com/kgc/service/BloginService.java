package com.kgc.service;

import com.kgc.dao.BloginDao;
import com.kgc.dao.impl.BloginDaoImpl;
import com.kgc.pojo.BusinessInfo;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
public class BloginService {
	//创建一个数据访问层对象
	BloginDao dao=new BloginDaoImpl();
	public BusinessInfo login(String email,String pwd){		
		BusinessInfo buser=dao.Blogin(email, pwd);		
		return buser;		
	}
}
