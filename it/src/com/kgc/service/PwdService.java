package com.kgc.service;

import com.kgc.dao.PwdDao;
import com.kgc.dao.impl.PwdDaoImpl;

public class PwdService {
	//�����û��޸�����
	public int Upwd(String email,String pwd){
		int n=0;
		PwdDao pd=new PwdDaoImpl();
		n=pd.Upwd(email, pwd);
		return n;//n>0:�޸ĳɹ�
	}
	//��ҵ�û��޸�����
	public int Bpwd(String email,String pwd){
		int n=0;
		PwdDao pd=new PwdDaoImpl();
		n=pd.Bpwd(email, pwd);
		return n;//n>0:�޸ĳɹ�
	}
	
}
