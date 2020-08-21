package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.Collectionsjob;

public interface CollectionsjobDao {
	//查询收藏的职位
	  public List<Collectionsjob> getAlljobs();
	  //根据id删除收藏表
	  public int delcelljob(Integer id);
	  public int addcelljob(Collectionsjob cjob);
}
