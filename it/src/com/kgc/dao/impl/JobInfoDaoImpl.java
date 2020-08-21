package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.JobInfoDao;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.JobInfo;

public class JobInfoDaoImpl extends BaseDao implements JobInfoDao {
	//查询所有职位
	public List<JobInfo> getAllJob() {
		List<JobInfo> list=new ArrayList<JobInfo>();
		String sql="SELECT *FROM jobinfo";
		try {
			rs=this.executeQuery(sql);
			while(rs.next()){
				JobInfo ji=new JobInfo();
				ji.setJiId(rs.getInt(1));
				ji.setJiJob(rs.getString(2));
				ji.setBiId(rs.getInt(3));
				list.add(ji);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}
	//添加
	public int addJob(JobInfo ji) {
		String sql="INSERT INTO jobinfo(jiid,jijob,biid) VALUES(NULL,?,?)";
		int n=this.executeUpdate(sql, ji.getJiJob(),ji.getBj().getBiId());
		return n;
	}

//	public int delJob(int id) {
//		String sql="";
//		return 0;
//	}
	//获取数量
	public int getCount(int id,String name) {
		int n=-1;
		String sql="SELECT COUNT(*) FROM bigjobinfo  INNER JOIN jobinfo"
                   +" ON bigjobinfo.biid=jobinfo.biid where 1=1";
		if(id!=-1){
			   sql+=" and bigjobinfo.biid="+id;
			}
			if(name!=null && name!=""){
				sql+=" and jijob like '%"+name+"%'";
			}
			try {
				this.rs=this.executeQuery(sql);
				while(rs.next()){
					n=rs.getInt(1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
		return n;
	}
	//分页
	public List<BigJobInfo> getJobInfoByPage(int id, String name, int from,
			int pageSize) {
		List<BigJobInfo> list=new ArrayList<BigJobInfo>();
		String sql="SELECT biid,bibigjob,bijob FROM bigjobinfo where 1=1";
		if(id!=-1){
			   sql+=" and biid="+id;
			}
			if(name!=null && name!=""){
				sql+=" and bijob  like '%"+name+"%'";
			}
			sql+=" limit ?,?";
			try {
				rs=this.executeQuery(sql, from,pageSize);
				while(rs.next()){
					//JobInfo ji=new JobInfo();
					//ji.setJiId(rs.getInt(1));
					//ji.setBiId(rs.getInt(2));
					//int biid=rs.getInt(2);
					//String bibigjob=rs.getString(3);
					//ji.setJiJob(rs.getString(4));
					BigJobInfo bji=new BigJobInfo();
					bji.setBiId(rs.getInt(1));
					bji.setBiBigJob(rs.getString(2));
					bji.setBiJob(rs.getString(3));
					list.add(bji);
					//ji.setBj(bji);
					//list.add(ji);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
		return list;
	}
	public int delJob(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
