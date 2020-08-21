package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.projectexperience;

public interface projectDao {
   //项目经验
   public int addproject(projectexperience project);
   //所有项目经验列表
   public List<projectexperience> getAllprojects(int uid);
   
}
