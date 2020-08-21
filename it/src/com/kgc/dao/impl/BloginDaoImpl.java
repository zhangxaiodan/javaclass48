package com.kgc.dao.impl;

import java.sql.SQLException;

import com.kgc.dao.BloginDao;
import com.kgc.pojo.BusinessInfo;

/**
 * 企业用户登录数据访问层实现类
 * @author Administrator
 *
 */
public class BloginDaoImpl extends BaseDao implements BloginDao {
	public BusinessInfo Blogin (String email,String pwd){
		BusinessInfo buser=null;
		String sql="SELECT * FROM businessInfo WHERE buemail=? AND bupwd=?";
		//调用查询
		this.rs=this.executeQuery(sql, email,pwd);
		try {
			if(rs.next()){
				buser=new BusinessInfo();
				buser.setBuId(rs.getInt("buId"));
				buser.setBuLoginName(rs.getString("buLoginName"));
				buser.setBuPwd(rs.getString("buPwd"));
				buser.setBuEmail(rs.getString("buEmail"));
				buser.setBuName(rs.getString("buName"));
				buser.setBujName(rs.getString("bujName"));
				buser.setBuLogo(rs.getString("buLogo"));
				buser.setBuHomePage(rs.getString("buHomePage"));
				buser.setBuCity(rs.getString("buCity"));
				buser.setBuBigJob(rs.getString("buBigJob"));
				buser.setBuSize(rs.getString("buSize"));
				buser.setBuDevelopment(rs.getString("buDevelopment"));
				buser.setBuIntroduce(rs.getString("buIntroduce"));
				buser.setBuType(rs.getString("buType"));
				buser.setBuPhone(rs.getString("buPhone"));
				buser.setBuLable(rs.getString("buLable"));
				buser.setBuPicture(rs.getString("buPicture"));
				
				buser.setOrName(rs.getString("orName"));
				buser.setOrJob(rs.getString("orJob"));
				buser.setOrWeibo(rs.getString("orWeibo"));
				buser.setOrIntroduce(rs.getString("orIntroduce"));
				
				buser.setPrPicture(rs.getString("prPicture"));
				buser.setPrName(rs.getString("prName"));
				buser.setPrAddress(rs.getString("prAddress"));
				buser.setPrIntroduce(rs.getString("prIntroduce"));
				
				buser.setBuxIntroduce(rs.getString("buxIntroduce"));
				//buser.setBrId(rs.getInt("brId"));				
							
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		
		
		return buser;
	}
}
