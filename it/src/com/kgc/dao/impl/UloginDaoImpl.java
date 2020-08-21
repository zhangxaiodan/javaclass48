package com.kgc.dao.impl;

import java.sql.SQLException;

import com.kgc.dao.UloginDao;
import com.kgc.pojo.UserInfo;

/**
 * 普通用户登录数据访问层实现类
 * @author Administrator
 *
 */
public class UloginDaoImpl extends BaseDao implements UloginDao{
	
	public UserInfo Ulogin(String email,String pwd){		
		UserInfo user=null;
		String sql="SELECT * FROM UserInfo WHERE uiemail=? AND uipwd=?";
		//调用查询
		this.rs=this.executeQuery(sql, email,pwd);
		try {
			if(rs.next()){
            user=new UserInfo();
            user.setUiId(rs.getInt(1));
            user.setUiLoginName(rs.getString(2));
            user.setUiPwd(rs.getString(3));
            user.setUiName(rs.getString(4));
            user.setUiSex(rs.getString(5));
            user.setUiBirthday(rs.getString(6));
            user.setUiPhone(rs.getString(7));
            user.setUiEmail(rs.getString(8));
            user.setUiiDentification(rs.getString(9));
            user.setUiAddress(rs.getString(10));
            user.setUiPicture(rs.getString(11));
            user.setLiId(rs.getInt(12));
            user.setUrId(rs.getInt(13));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		
		return user;
	}
}