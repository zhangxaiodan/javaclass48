package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.Manager;

/**
 * ����Ա���ݷ��ʲ�ӿ�
 * @author Administrator
 *
 */
public interface ManagerDao {
	//��½
	public Manager login(String maName,String maPwd);
	
	//�޸�����
	public int updatePwd(Manager m);
	
	//��ѯ����Ա
	public List<Manager> getAllManager();
	//����id��ȡ����Ա
	public Manager getManagerById(int id);
}
