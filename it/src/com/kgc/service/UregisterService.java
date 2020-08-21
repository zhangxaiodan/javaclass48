package com.kgc.service;

import com.kgc.dao.UregisterDao;
import com.kgc.dao.impl.UregisterDaoImpl;

public class UregisterService {
	UregisterDao ud=new UregisterDaoImpl();
	public int regist(String email,String pwd){
		int n=0;
		//调用查询是否重名
		if(ud.Ucheck(email)<0){//如果不重名，为true
			n=ud.Uregist(email, pwd);			
		}
		return n;//如果n>0:注册成功，否则重名
	}
}
