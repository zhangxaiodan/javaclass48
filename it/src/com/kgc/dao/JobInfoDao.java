package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.JobInfo;

/**
 * ְλ�ӿ�
 * @author Administrator
 *
 */
public interface JobInfoDao {
	//��ѯ���е�ְλ
	public List<JobInfo> getAllJob();
	
	//���
	public int addJob(JobInfo ji);
	//ɾ��
	public int delJob(int id);
	//��ҳ�� ����
	public int getCount(int id,String name);
	//��ǰҳ����
	public List<BigJobInfo> getJobInfoByPage(int id,String name,int from,int pageSize);
}
