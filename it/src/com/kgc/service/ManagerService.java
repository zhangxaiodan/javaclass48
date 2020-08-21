package com.kgc.service;

import java.util.List;

import com.kgc.dao.ManagerDao;
import com.kgc.dao.impl.ManagerDaoImpl;
import com.kgc.pojo.Manager;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
public class ManagerService {
	ManagerDao mDao=new ManagerDaoImpl();
	//登陆
	public Manager login(String maName, String maPwd) {
		Manager m=mDao.login(maName, maPwd);
			return m;
	}
	//修改密码
	public int updatePwd(Manager m) {
		return mDao.updatePwd(m);
	}
	//查询所有管理员信息
	public List<Manager> getAllManager() {
		return mDao.getAllManager();
	}
	//更据id查询管理员
	public Manager getManagerById(int id) {
		return mDao.getManagerById(id);
	}

}
