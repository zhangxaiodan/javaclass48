package com.kgc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.kgc.pojo.BusinessInfo;

/**
 * 数据访问工具层
 * @author 
 *
 */
public class BaseDao {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/it?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true";
	private String user="root";
	private String password="wulin";
	
	//对象变量
	protected Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	//创建连接
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
		//使用JNDI
		/*try {
			Context cxt=new InitialContext();
			//获取JNDI名字，获取数据源
			DataSource ds=(DataSource)cxt.lookup("java:comp/env/news");
			con=ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
	//增删改
	public int executeUpdate(String sql,Object...objs){
		int n=0;
		try {
			this.getConnection();
			ps=con.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1, objs[i]);//i+1为第一个问号的位置，objs[i]为占位符？的值
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
	
	//查询
	public ResultSet executeQuery(String sql,Object...objs ){
		//连接
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
	//关闭
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
