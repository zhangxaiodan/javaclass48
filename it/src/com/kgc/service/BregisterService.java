package com.kgc.service;

import com.kgc.dao.BregisterDao;
import com.kgc.dao.impl.BregisterDaoImpl;

public class BregisterService {
	BregisterDao bd=new BregisterDaoImpl();
	public int regist(String email,String pwd){
		int n=0;
		//���ò�ѯ�Ƿ�����
		if(bd.Bcheck(email)<0){//�����������ֵ<0
			n=bd.Bcheck(email);//����Ŀ���ñ���
			//n=bd.Bregist(email, pwd);//ע�����ʱ���ñ���
		}
		return n;//���n��=0:δ����
	}
}
