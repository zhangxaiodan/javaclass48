package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.BigJobInfoDao;
import com.kgc.pojo.BigJobInfo;

/**
 * ��ҵ�������ݷ��ʲ��ʵ����
 * @author Administrator
 *
 */
public class BigJobInfoDaoImpl extends BaseDao implements BigJobInfoDao{
	//��ѯ����ְλ
	public List<BigJobInfo> getAllInfo() {
		// ������ҵ����ְλ����
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
	//���ְλ
	public int addJob(BigJobInfo job) {
		String sql="INSERT INTO bigjobinfo VALUES(NULL,?,?)";
		int n=this.executeUpdate(sql, job.getBiBigJob(),job.getBiJob());
		return n;
	}
	//ɾ����ҵ����
	public int del(int biId) {
		String sql="DELETE FROM bigjobinfo WHERE biid=?";
		int n=this.executeUpdate(sql, biId);
		return n;
	}
//	//��ҳ��ҳ��
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
//	//��ҳ��ѯ
//	public List<BigJobInfo> getBigJobInfoByPage(int biId,String name,int from, int pageSize) {
//		// ������ҵְλ����
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
	//��ȡ��ҵ�����ظ�
	public List<BigJobInfo> getAllJobInfo() {
		// ������ҵ����ְλ����
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
