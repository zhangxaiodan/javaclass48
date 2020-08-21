package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.UserInfo;

/**
 * 用户注册信息数据访问层
 * @author Administrator
 *
 */
public interface UserInfoDao {
	//查询所有的用户注册信息
	public List<UserInfo> getAllUser();
	
	//分页
	//参数注册编号和用户名
	public int getCount(String name,int uiId);
	//
	public List<UserInfo> getUserByPage(String name,int uiId,int from,int pageSize);
	
	//删除
	public int del(Integer biid);
	 //用户登录，验证用户名和密码
	public UserInfo getLoginAndPwd(String uiloginname,String uipwd);
	//查询用户的简历编号
	public UserInfo getJlid(Integer id);
		
}
