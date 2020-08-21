package com.kgc.dao;

public interface PwdDao {
    ////用户修改密码
	public int Upwd(String email,String pwd);
	//企业用户修改密码
	public int Bpwd(String email,String pwd);
}
