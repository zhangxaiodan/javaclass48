package com.kgc.dao;


/**
 * ��ҵ�û����ݷ��ʲ�
 * @author Administrator
 *
 */
public interface BregisterDao{
	 //��ҵ�û�ע��
	public int Bregist(String email,String pwd);
	 //��ҵ�û���֤�û����Ƿ���ע��
	public int Bcheck(String email);
}