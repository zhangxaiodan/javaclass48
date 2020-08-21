package com.kgc.dao.impl;

import java.sql.SQLException;

import com.kgc.dao.BregisterDao;


/**
 * 企业用户注册数据访问层实现类
 * @author Administrator
 *
 */
public class BregisterDaoImpl extends BaseDao implements BregisterDao{
	     //验证是否重名，n=1：重名，n=-1：不重名
		 public int Bcheck(String email){
			 int n=-1;
			 String sql="SELECT * FROM businessInfo WHERE buemail=?";
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

		public int Bregist(String email, String pwd) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		 
		// public void Bregist(String email,String pwd){//如果不重名，用户名密码传到郑秋枫的businessInfoServlet
			 
//			 int count = 0;
//			 String sql="INSERT INTO businessInfo (buemail,bupwd) VALUES(?,?)";
//			 Object [] objs={email,pwd};
//			 //调用增删改
//			 count=this.executeUpdate(sql, objs);		
//			 return count;			 
		// }


}