package com.kgc.dao.impl;

import java.sql.SQLException;

import com.kgc.dao.BregisterDao;


/**
 * ��ҵ�û�ע�����ݷ��ʲ�ʵ����
 * @author Administrator
 *
 */
public class BregisterDaoImpl extends BaseDao implements BregisterDao{
	     //��֤�Ƿ�������n=1��������n=-1��������
		 public int Bcheck(String email){
			 int n=-1;
			 String sql="SELECT * FROM businessInfo WHERE buemail=?";
			 //���ò�ѯ
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
		
		 
		// public void Bregist(String email,String pwd){//������������û������봫��֣����businessInfoServlet
			 
//			 int count = 0;
//			 String sql="INSERT INTO businessInfo (buemail,bupwd) VALUES(?,?)";
//			 Object [] objs={email,pwd};
//			 //������ɾ��
//			 count=this.executeUpdate(sql, objs);		
//			 return count;			 
		// }


}