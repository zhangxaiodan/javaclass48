package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.BigJobInfoDao;
import com.kgc.pojo.BigJobInfo;

/**
 * 行业领域数据访问层的实现类
 * @author Administrator
 *
 */
public class BigJobInfoDaoImpl extends BaseDao implements BigJobInfoDao{
	//查询所有职位
	public List<BigJobInfo> getAllInfo() {
		// 创建行业领域职位对象
		List<BigJobInfo> list=new ArrayList<BigJobInfo>();
		String sql="SELECT biid, bibigjob FROM bigjobinfo";
		try {
			rs=this.executeQuery(sql);
			while(rs.next()){
				BigJobInfo bj=new BigJobInfo();
				bj.setBiId(rs.getInt(1));
				bj.setBiBigJob(rs.getString(1));
				//bj.setBiJob(rs.getString(3));
				list.add(bj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}
	//添加职位
	public int addJob(BigJobInfo job) {
		String sql="INSERT INTO bigjobinfo VALUES(NULL,?,?)";
		int n=this.executeUpdate(sql, job.getBiBigJob(),job.getBiJob());
		return n;
	}
	//删除行业领域
	public int del(int biId) {
		String sql="DELETE FROM bigjobinfo WHERE biid=?";
		int n=this.executeUpdate(sql, biId);
		return n;
	}
//	//分页总页数
//	public int getCount(String name) {
//		int n=-1;
//		String sql="SELECT COUNT(*) FROM bigjobinfo where 1=1";
//		if(name!=null && name!=""){
//			sql+=" and bijob like '%"+name+"%'";
//			}
//		try {
//			rs=this.executeQuery(sql);
//			while(rs.next()){
//				n=rs.getInt(1);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return n;
//	}
//	//分页查询
//	public List<BigJobInfo> getBigJobInfoByPage(int biId,String name,int from, int pageSize) {
//		// 创建行业职位对象
//		List<BigJobInfo> list=new ArrayList<BigJobInfo>();
//		String sql="SELECT * FROM bigjobinfo  where 1=1";
//		if(biId!=-1){
//			sql+=" and biId="+biId;
//		}
//		if(name!=null&&name!=""){
//			sql+=" and bijob like '%"+name+"%'";
//		}
//		sql+=" limit ?,?";
//		try {
//			rs=this.executeQuery(sql, from,pageSize);
//			while(rs.next()){
//				BigJobInfo bj=new BigJobInfo();
//				bj.setBiId(rs.getInt(1));
//				bj.setBiBigJob(rs.getString(2));
//				bj.setBiJob(rs.getString(3));
//				list.add(bj);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			this.close(con, ps, rs);
//		}
//		return list;
//	}
//
	//获取行业领域不重复
	public List<BigJobInfo> getAllJobInfo() {
		// 创建行业领域职位对象
		List<BigJobInfo> list=new ArrayList<BigJobInfo>();
		String sql="SELECT DISTINCT bibigjob FROM bigjobinfo";
				try {
					rs=this.executeQuery(sql);
					while(rs.next()){
						BigJobInfo bj=new BigJobInfo();
						bj.setBiBigJob(rs.getString(1));
						list.add(bj);
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
