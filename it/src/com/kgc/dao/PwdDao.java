package com.kgc.dao;

public interface PwdDao {
    ////�û��޸�����
	public int Upwd(String email,String pwd);
	//��ҵ�û��޸�����
	public int Bpwd(String email,String pwd);
}
