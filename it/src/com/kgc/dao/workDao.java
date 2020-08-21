package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.workexperience;

public interface workDao {
    //
	public int addwork(workexperience work);
	//
	public List<workexperience> getAllworks(int uid);
	
}
