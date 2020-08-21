package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.projectDao;
import com.kgc.pojo.projectexperience;

public class projectimpl extends BaseDao implements projectDao{
	//项目经验
	public int addproject(projectexperience project) {
		//增加项目经验
		int n=-1;
		//sql语句
		String sql="INSERT INTO projectexperience VALUES(null,?,?,?,?,?,?)";
		//执行sql
		n=this.executeUpdate(sql,project.getUrid(),project.getProjectname(),project.getTheposter()
				,project.getProjectstarttime(),project.getProjectendtime(),project.getProjectdescription());		
		return n;
	}

	public List<projectexperience> getAllprojects(int uid) {
		//获取所有的项目经验
		List<projectexperience> list=new ArrayList<projectexperience>();
		//SqL语句
		String sql="SELECT *FROM  projectexperience WHERE urid=?";
		//执行查询
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
