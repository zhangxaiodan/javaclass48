package com.kgc.service;

import java.util.List;

import com.kgc.dao.projectDao;
import com.kgc.dao.impl.projectimpl;
import com.kgc.pojo.projectexperience;

public class projectService {
    //创建对象
	projectDao pd=new projectimpl();
	//
	public int addproject(projectexperience project){
		//返回项目经验
		return pd.addproject(project);
	}
	
	public List<projectexperience> getAllprojects(int uid){
		
		return pd.getAllprojects(uid);
	}
	
	
	
}
