package com.kgc.service;

import com.kgc.dao.PwdDao;
import com.kgc.dao.impl.PwdDaoImpl;

public class PwdService {
	//个人用户修改密码
	public int Upwd(String email,String pwd){
		int n=0;
		PwdDao pd=new PwdDaoImpl();
		n=pd.Upwd(email, pwd);
		return n;//n>0:修改成功
	}
	//企业用户修改密码
	public int Bpwd(String email,String pwd){
		int n=0;
		PwdDao pd=new PwdDaoImpl();
		n=pd.Bpwd(email, pwd);
		return n;//n>0:修改成功
	}
	
}
