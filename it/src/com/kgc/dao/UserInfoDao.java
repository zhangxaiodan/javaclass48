package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.UserInfo;

/**
 * �û�ע����Ϣ���ݷ��ʲ�
 * @author Administrator
 *
 */
public interface UserInfoDao {
	//��ѯ���е��û�ע����Ϣ
	public List<UserInfo> getAllUser();
	
	//��ҳ
	//����ע���ź��û���
	public int getCount(String name,int uiId);
	//
	public List<UserInfo> getUserByPage(String name,int uiId,int from,int pageSize);
	
	//ɾ��
	public int del(Integer biid);
	 //�û���¼����֤�û���������
	public UserInfo getLoginAndPwd(String uiloginname,String uipwd);
	//��ѯ�û��ļ������
	public UserInfo getJlid(Integer id);
		
}
