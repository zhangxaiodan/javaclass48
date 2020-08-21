package com.kgc.service;

import java.util.List;

import com.kgc.dao.CollectionsjobDao;
import com.kgc.dao.impl.CollectionsJobimpl;

import com.kgc.pojo.Collectionsjob;

public class CollectionsjobService {
	CollectionsjobDao cj=new CollectionsJobimpl();
	//获取所有工作
	public List<Collectionsjob> getAlljobs(){
		
		return cj.getAlljobs();
	}
	//删除收藏表
	public int delcelljob(Integer id){
		
		int n=cj.delcelljob(id);
		
		return n;
	}
	//添加收藏
		public int addcelljob(Collectionsjob cjob) {
			
			return cj.addcelljob(cjob);	
		}
}
