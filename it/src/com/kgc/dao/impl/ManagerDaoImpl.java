package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.ManagerDao;
import com.kgc.pojo.Manager;

/**
 * 数据访问层实现类
 * @author Administrator
 *
 */
public class ManagerDaoImpl extends BaseDao implements ManagerDao{
	//登录
	public Manager login(String maName, String maPwd) {
		Manager manger=null;
		//sql语句
		String sql="SELECT*FROM manager WHERE maname=? and mapwd=?";
		rs=this.executeQuery(sql, maName,maPwd);
		try {
			while(rs.next()){
				 manger=new Manager();
				manger.setMaId(rs.getInt("maId"));
				manger.setMaName(rs.getString("maName"));
				manger.setMaPwd(rs.getString("maPwd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return manger;
	}
	//修改密码
	public int updatePwd(Manager m) {
		//int n=0;
		String sql="UPDATE manager SET mapwd=?, maemail=? WHERE maid=?";
		int n=this.executeUpdate(sql, m.getMaPwd(),m.getMaEmail(),m.getMaId());
		return n;
	}
	//查询所有管理员信息
	public List<Manager> getAllManager() {
		List<Manager> list=new ArrayList<Manager>();
		String sql="SELECT*FROM manager";
		try {
			rs=this.executeQuery(sql);
			while(rs.next()){
				Manager m=new Manager();
				m.setMaId(rs.getInt(1));
				m.setMaName(rs.getString(2));
				m.setMaPwd(rs.getString(3));
				m.setMaEmail(rs.getString(4));
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}
	//更据id查询管理员
	public Manager getManagerById(int id) {
		Manager m=null;
		String sql="SELECT*FROM manager WHERE maid=?";
		try {
			rs=this.executeQuery(sql, id);
			while(rs.next()){
				m=new Manager();
				m.setMaId(rs.getInt(1));
				m.setMaName(rs.getString(2));
				m.setMaPwd(rs.getString(3));
				m.setMaEmail(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return m;
	}
}
