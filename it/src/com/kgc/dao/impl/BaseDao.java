package com.kgc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.kgc.pojo.BusinessInfo;

/**
 * ���ݷ��ʹ��߲�
 * @author 
 *
 */
public class BaseDao {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/it?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true";
	private String user="root";
	private String password="wulin";
	
	//�������
	protected Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	//��������
	public void getConnection(){
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ʹ��JNDI
		/*try {
			Context cxt=new InitialContext();
			//��ȡJNDI���֣���ȡ����Դ
			DataSource ds=(DataSource)cxt.lookup("java:comp/env/news");
			con=ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	//��ɾ��
	public int executeUpdate(String sql,Object...objs){
		int n=0;
		try {
			this.getConnection();
			ps=con.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1, objs[i]);//i+1Ϊ��һ���ʺŵ�λ�ã�objs[i]Ϊռλ������ֵ
				}
			}
			n=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		
		return n;
	}
	
	//��ѯ
	public ResultSet executeQuery(String sql,Object...objs ){
		//����
		try {
			this.getConnection();
			ps=con.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1, objs[i]);
				}
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	//�ر�
	public void close(Connection con,PreparedStatement ps,ResultSet rs){
		try {
			if(null!=rs){
				rs.close();
			}
			if(null!=ps){
				ps.close();
			}
			if(null!=con){
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
