package com.kgc.dao.impl;

import java.sql.SQLException;

import com.kgc.dao.UregisterDao;


/**
 * 普通用户注册数据访问层实现类
 * @author Administrator
 *
 */
public class UregisterDaoImpl extends BaseDao implements UregisterDao{
	//验证是否重名，n=1：重名，n=-1：不重名
	 public int Ucheck(String email){
		 int n=-1;
		 String sql="SELECT * FROM userInfo WHERE  uiemail=?";
		 //调用查询
		 this.rs=this.executeQuery(sql, email);
		 try {
			if(rs.next()){
				n=1;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		 
	 }
	
	 
	 public int Uregist(String email,String pwd){
		 int count = 0;
		 String sql="INSERT INTO userInfo VALUES(NULL,'用户名',?,'用户姓名','男','出生日期','联系电话',?,'身份证号码','家庭住址','用户头像信息地址',1,1)";
		 Object [] objs={pwd,email};
		 //调用增删改
		 count=this.executeUpdate(sql, objs);		
		 return count;
		 
	 };
	
}
