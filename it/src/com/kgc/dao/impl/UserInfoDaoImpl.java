package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.UserInfoDao;
import com.kgc.pojo.UserInfo;

/**
 * ע����Ϣ���ݷ��ʲ��ʵ����
 * @author Administrator
 *
 */
public class UserInfoDaoImpl extends BaseDao implements UserInfoDao {
	//��ѯ���е�ע����Ϣ
	public List<UserInfo> getAllUser() {
		//�����û����϶���
		List<UserInfo> list=new ArrayList<UserInfo>();
		String sql="SELECT*FROM userinfo";
		try {
			rs=this.executeQuery(sql);
			while(rs.next()){
				UserInfo u=new UserInfo();
				u.setUiId(rs.getInt(1));
				u.setUiLoginName(rs.getString(2));
				u.setUiPwd(rs.getString(3));
				u.setUiName(rs.getString(4));
				u.setUiSex(rs.getString(5));
				u.setUiBirthday(rs.getString(6));
				u.setUiPhone(rs.getString(7));
				u.setUiEmail(rs.getString(8));
				u.setUiiDentification(rs.getString(9));
				u.setUiAddress(rs.getString(10));
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}
	//��ȡ������
	public int getCount(String name, int uiId) {
		int n=-1;
		String sql="SELECT COUNT(*) FROM userinfo where 1=1";
		if(uiId!=-1){
			sql+=" and uiId="+uiId;
		}
		if(name!=null && name!=""){
			sql+=" and uiLoginName or uiName  like '%"+name+"%'";
			}
			try {
				rs=this.executeQuery(sql);
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
	//��ҳ��ѯ����ע����Ϣ
	public List<UserInfo> getUserByPage(String name, int uiId, int from,
			int pageSize) {
		List<UserInfo> list=new ArrayList<UserInfo>();
		String sql="SELECT * FROM userinfo where 1=1";
		if(uiId!=-1){
			sql+=" and uiId="+uiId;
		}
		if(name!=null&&name!=""){
			sql+=" and  uiName like '%"+name+"%'";
		}
		sql+=" limit ?,?";
		try {
			rs=this.executeQuery(sql, from,pageSize);
			while(rs.next()){
				UserInfo u=new UserInfo();
				u.setUiId(rs.getInt(1));
				u.setUiLoginName(rs.getString(2));
				u.setUiPwd(rs.getString(3));
				u.setUiName(rs.getString(4));
				u.setUiSex(rs.getString(5));
				u.setUiBirthday(rs.getString(6));
				u.setUiPhone(rs.getString(7));
				u.setUiEmail(rs.getString(8));
				u.setUiiDentification(rs.getString(9));
				u.setUiAddress(rs.getString(10));
				u.setUiPicture(rs.getString(11));
				u.setLiId(rs.getInt(12));
				u.setUrId(rs.getInt(13));
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}
	//ɾ��
	public int del(Integer biid) {
		String sql="DELETE FROM bigjobinfo WHERE biid=?";
		int n=this.executeUpdate(sql, biid);
		return n;
	}
	
	//�û���¼
	public UserInfo getLoginAndPwd(String uiloginname, String uipwd) {
		//
		UserInfo ui=null;
		//sql���
		String sql="SELECT uiid,uiloginname,uipwd,urid,uiname FROM userInfo WHERE uiloginname=? AND uipwd=?";
		try {
			//ִ�в�ѯ
			this.rs=this.executeQuery(sql,uiloginname,uipwd);
			while(rs.next()){
				ui=new UserInfo();
				ui.setUiId(rs.getInt(1));
				ui.setUiLoginName(rs.getString(2));
				ui.setUiPwd(rs.getString(3));
				ui.setUrId(rs.getInt(4));
				ui.setUiName(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return ui;
	}
	//����id��ȡurid
	public UserInfo getJlid(Integer id) {
		UserInfo u=null;
		//sql���
		String sql="SELECT urid FROM userInfo WHERE uiid=?";
		try {
			//ִ�в�ѯ
			this.rs=this.executeQuery(sql, id);
			while(rs.next()){
				u=new UserInfo();
				u.setUrId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return u;
	}
}
