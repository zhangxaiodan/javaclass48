package com.kgc.service;

import java.util.List;

import com.kgc.dao.workDao;
import com.kgc.dao.impl.workimpl;
import com.kgc.pojo.workexperience;

public class workService {
	
	workDao w=new workimpl();
   //
	public int addwork(workexperience work){
		
		return w.addwork(work);
	}
	//�õ��û��ľ���
	public List<workexperience> getAllworks(int uid) {
		
		return w.getAllworks(uid);
		
	}
}
