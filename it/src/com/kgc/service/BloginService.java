package com.kgc.service;

import com.kgc.dao.BloginDao;
import com.kgc.dao.impl.BloginDaoImpl;
import com.kgc.pojo.BusinessInfo;

/**
 * ҵ���߼���
 * @author Administrator
 *
 */
public class BloginService {
	//����һ�����ݷ��ʲ����
	BloginDao dao=new BloginDaoImpl();
	public BusinessInfo login(String email,String pwd){		
		BusinessInfo buser=dao.Blogin(email, pwd);		
		return buser;		
	}
}
