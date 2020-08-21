package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.projectDao;
import com.kgc.pojo.projectexperience;

public class projectimpl extends BaseDao implements projectDao{
	//��Ŀ����
	public int addproject(projectexperience project) {
		//������Ŀ����
		int n=-1;
		//sql���
		String sql="INSERT INTO projectexperience VALUES(null,?,?,?,?,?,?)";
		//ִ��sql
		n=this.executeUpdate(sql,project.getUrid(),project.getProjectname(),project.getTheposter()
				,project.getProjectstarttime(),project.getProjectendtime(),project.getProjectdescription());		
		return n;
	}

	public List<projectexperience> getAllprojects(int uid) {
		//��ȡ���е���Ŀ����
		List<projectexperience> list=new ArrayList<projectexperience>();
		//SqL���
		String sql="SELECT *FROM  projectexperience WHERE urid=?";
		//ִ�в�ѯ
		try {
			this.rs=this.executeQuery(sql,uid);
			while(rs.next()){
				projectexperience p=new projectexperience();
				p.setPid(rs.getInt(1));
				p.setUrid(rs.getInt(2));
				p.setProjectname(rs.getString(3));
				p.setTheposter(rs.getString(4));
				p.setProjectstarttime(rs.getString(5));
				p.setProjectendtime(rs.getString(6));
				p.setProjectdescription(rs.getString(7));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		
		return list;
	}
}
