package com.kgc.dao;


/**
 * 企业用户数据访问层
 * @author Administrator
 *
 */
public interface BregisterDao{
	 //企业用户注册
	public int Bregist(String email,String pwd);
	 //企业用户验证用户名是否已注册
	public int Bcheck(String email);
}