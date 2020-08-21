package com.kgc.service;

import com.kgc.dao.BregisterDao;
import com.kgc.dao.impl.BregisterDaoImpl;

public class BregisterService {
	BregisterDao bd=new BregisterDaoImpl();
	public int regist(String email,String pwd){
		int n=0;
		//调用查询是否重名
		if(bd.Bcheck(email)<0){//如果不重名：值<0
			n=bd.Bcheck(email);//合项目启用本句
			//n=bd.Bregist(email, pwd);//注册测试时启用本句
		}
		return n;//如果n！=0:未重名
	}
}
