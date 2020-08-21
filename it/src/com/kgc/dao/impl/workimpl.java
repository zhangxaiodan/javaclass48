package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.workDao;
import com.kgc.pojo.workexperience;

public class workimpl extends BaseDao implements workDao{

	public int addwork(workexperience work) {
		// 添加工作经历
		int n=-1;
		//sql语句
		String sql="INSERT INTO workexperience VALUES(null,?,?,?,?,?)";
		//执行添加
		n=this.executeUpdate(sql,work.getUrid(),work.getCompany(),work.getJobname(),
				work.getStarttime(),work.getOvertime());
		
		return n;
	}

	public List<workexperience> getAllworks(int uid) {
		//
		List<workexperience> list=new ArrayList<workexperience>();
		//sql���
		String sql="SELECT *FROM workexperience WHERE urid=?";
		//查询
		try {
			this.rs=this.executeQuery(sql, uid);
			while(rs.next()){
				workexperience w=new workexperience();
				w.setWid(rs.getInt(1));
				w.setUrid(rs.getInt(2));
				w.setCompany(rs.getString(3));
				w.setJobname(rs.getString(4));
				w.setStarttime(rs.getString(5));
				w.setOvertime(rs.getString(6));
				list.add(w);
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
