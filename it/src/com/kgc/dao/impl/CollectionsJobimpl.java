package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.CollectionsjobDao;
import com.kgc.pojo.Collectionsjob;

public class CollectionsJobimpl extends BaseDao implements CollectionsjobDao{

	public List<Collectionsjob> getAlljobs(){
		 //获取所有的收藏
		List<Collectionsjob> list=new ArrayList<Collectionsjob>();
		//sql语句
		String sql="SELECT *FROM collectionsjob";
		try {
			
			this.rs=this.executeQuery(sql);
			while(rs.next()){
				Collectionsjob ctj=new Collectionsjob();
				ctj.setJno(rs.getInt(1));
				ctj.setUiid(rs.getInt(2));
				ctj.setBrid(rs.getInt(3));
				list.add(ctj);
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}

	public int delcelljob(Integer id) {
		//根据id删除收藏表,sql语句
		String sql="DELETE FROM collectionsjob WHERE jno=?";
		//执行sql语句
		int n=this.executeUpdate(sql, id);
		return n;	
	}	
	public int addcelljob(Collectionsjob cjob) {
		//添加收藏
		int n=-1;
		//sql语句
		String sql="INSERT INTO collectionsjob VALUES(null,?,?)";
		//执行添加
		n=this.executeUpdate(sql,cjob.getUiid(),cjob.getBrid());
		//返回影响的行数
		return n;	
	}	


}
