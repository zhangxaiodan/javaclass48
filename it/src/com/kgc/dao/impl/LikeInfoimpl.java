package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.LikeInfoDao;
import com.kgc.pojo.LikeInfo;

public class LikeInfoimpl extends BaseDao implements LikeInfoDao{

	public int addLikeInfo(LikeInfo info) {
		int n=-1;
		//sql”Ôæ‰
		String sql="INSERT INTO likeInfo(liid,liemail,litime,lijob,liworkaddress,lidevelopment,biid,limoney)"
+" VALUES(null,?,?,?,?,?,?,?)";
		//÷¥––sql”Ôæ‰
		n=this.executeUpdate(sql,info.getLiEmail(),info.getLiTime(),info.getLiJob(),info.getLiWorkAddress(),
				info.getLiDevelopment(),info.getBiid(),info.getLiMoney());	
		return n;
	}

	public List<LikeInfo> getAllLikeInfo(Integer from,Integer pageSize) {
		//
		List<LikeInfo> list=new ArrayList<LikeInfo>();
		//sql”Ôæ‰
		String sql="SELECT *FROM likeInfo ORDER BY liid DESC LIMIT ?,?";
		try {
			//÷¥––sql”Ôæ‰
			this.rs=this.executeQuery(sql,from,pageSize);
			while(rs.next()){
				LikeInfo l=new LikeInfo();
				l.setLiId(rs.getInt(1));
				l.setLiEmail(rs.getString(2));
				l.setLiTime(rs.getString(3));
				l.setLiJob(rs.getString(4));
				l.setLiWorkAddress(rs.getString(5));
				l.setLiDevelopment(rs.getString(6));
				l.setBiid(rs.getString(7));
				l.setLiMoney(rs.getString(8));
				list.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}

	public int delsubscribe(Integer id) {
		int n=-1;
		//sql”Ôæ‰
		String sql="DELETE FROM likeInfo WHERE liid=?";
		n=this.executeUpdate(sql, id);
		
		return n;
	}

	public int getcountbyLikeInfo() {
		int n=-1;
		//sql
		String sql="SELECT COUNT(*)FROM likeInfo";
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

}
