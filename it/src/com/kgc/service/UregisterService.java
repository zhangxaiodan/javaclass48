package com.kgc.service;

import com.kgc.dao.UregisterDao;
import com.kgc.dao.impl.UregisterDaoImpl;

public class UregisterService {
	UregisterDao ud=new UregisterDaoImpl();
	public int regist(String email,String pwd){
		int n=0;
		//���ò�ѯ�Ƿ�����
		if(ud.Ucheck(email)<0){//�����������Ϊtrue
			n=ud.Uregist(email, pwd);			
		}
		return n;//���n>0:ע��ɹ�����������
	}
}
