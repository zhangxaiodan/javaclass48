package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.projectexperience;

public interface projectDao {
   //��Ŀ����
   public int addproject(projectexperience project);
   //������Ŀ�����б�
   public List<projectexperience> getAllprojects(int uid);
   
}
