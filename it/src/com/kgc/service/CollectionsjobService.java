package com.kgc.service;

import java.util.List;

import com.kgc.dao.CollectionsjobDao;
import com.kgc.dao.impl.CollectionsJobimpl;

import com.kgc.pojo.Collectionsjob;

public class CollectionsjobService {
	CollectionsjobDao cj=new CollectionsJobimpl();
	//��ȡ���й���
	public List<Collectionsjob> getAlljobs(){
		
		return cj.getAlljobs();
	}
	//ɾ���ղر�
	public int delcelljob(Integer id){
		
		int n=cj.delcelljob(id);
		
		return n;
	}
	//����ղ�
		public int addcelljob(Collectionsjob cjob) {
			
			return cj.addcelljob(cjob);	
		}
}
