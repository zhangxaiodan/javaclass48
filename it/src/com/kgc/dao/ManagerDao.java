package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.Manager;

/**
 * 管理员数据访问层接口
 * @author Administrator
 *
 */
public interface ManagerDao {
	//登陆
	public Manager login(String maName,String maPwd);
	
	//修改密码
	public int updatePwd(Manager m);
	
	//查询管理员
	public List<Manager> getAllManager();
	//根据id获取管理员
	public Manager getManagerById(int id);
}
