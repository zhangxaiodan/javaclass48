package com.kgc.service;

import java.util.List;

import com.kgc.dao.ManagerDao;
import com.kgc.dao.impl.ManagerDaoImpl;
import com.kgc.pojo.Manager;

/**
 * ҵ���߼���
 * @author Administrator
 *
 */
public class ManagerService {
	ManagerDao mDao=new ManagerDaoImpl();
	//��½
	public Manager login(String maName, String maPwd) {
		Manager m=mDao.login(maName, maPwd);
			return m;
	}
	//�޸�����
	public int updatePwd(Manager m) {
		return mDao.updatePwd(m);
	}
	//��ѯ���й���Ա��Ϣ
	public List<Manager> getAllManager() {
		return mDao.getAllManager();
	}
	//����id��ѯ����Ա
	public Manager getManagerById(int id) {
		return mDao.getManagerById(id);
	}

}
