package com.kgc.dao;

import com.kgc.pojo.UserInfo;

/**
 * ��ͨ�û����ݷ��ʲ�
 * @author Administrator
 *
 */
public interface UloginDao {
   //�û���½
	public UserInfo Ulogin(String email,String pwd);
}