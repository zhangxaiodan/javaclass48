package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.Collectionsjob;

public interface CollectionsjobDao {
	//��ѯ�ղص�ְλ
	  public List<Collectionsjob> getAlljobs();
	  //����idɾ���ղر�
	  public int delcelljob(Integer id);
	  public int addcelljob(Collectionsjob cjob);
}
