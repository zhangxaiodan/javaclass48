package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BigJobInfo;

/**
 * ְλ���ݷ��ʲ�ӿ�
 * @author Administrator
 *
 */
public interface BigJobInfoDao {
	public List<BigJobInfo> getAllJobInfo();
	//��ѯ������ҵ����
	public List<BigJobInfo> getAllInfo();
	//���
	public int addJob(BigJobInfo job);
	//ɾ��
	public int del(int biId);
	//
	//��ҳ�� ����
	//public int getCount(String name);
			
	//��ǰҳ����
	//public List<BigJobInfo> getBigJobInfoByPage(int biId,String name,int from,int pageSize);
}
