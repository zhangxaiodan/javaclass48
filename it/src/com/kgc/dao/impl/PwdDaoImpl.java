package com.kgc.dao.impl;

import com.kgc.dao.PwdDao;

public class PwdDaoImpl extends BaseDao implements PwdDao {
    //�����û��޸�����
	public int Upwd(String email, String pwd) {
		// TODO Auto-generated method stub
		int n=-1;
		String sql="UPDATE userInfo SET uipwd=? WHERE uiemail=?";
		Object [] objs={pwd,email};			
		//������ɾ��
		n=this.executeUpdate(sql, objs);		
		return n;
	}
    //��ҵ�û��޸�����
	public int Bpwd(String email, String pwd) {
		// TODO Auto-generated method stub		
		int n=-1;
		String sql="UPDATE businessInfo SET bupwd=? WHERE buemail=?";
		Object [] objs={pwd,email};		
		//������ɾ��
		n=this.executeUpdate(sql, objs);		
		return n;		
	}  
}
