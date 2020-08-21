package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.kgc.dao.UserResumeDao;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.UserResume;

public class UserResumeimpl extends BaseDao implements UserResumeDao{

	public int addUserResume(UserResume resume) {
		int n=-1;
		//sql锟斤拷锟�
		String sql="INSERT INTO userResume VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		//执锟斤拷锟斤拷锟�
		n=this.executeUpdate(sql,resume.getUrname(),resume.getUrbirthday(),resume.getUrsex(),resume.getUrpolitical()
				,resume.getUrmarriage(),resume.getUreducation(),resume.getUrexperience(),resume.getUrphone(),resume.getUremail(),resume.getUrnature(),resume.getArid(),
				resume.getBiid(),resume.getUrmoney(),resume.getUrjingli(),resume.getUrproject(),
				resume.getUrschool(),resume.getUrsubject(),resume.getUryear(),resume.getUrintroduce(),resume.getUraddress(),
				resume.getUrdescribe(),resume.getUrtime(),resume.getUrpicture(),resume.getUrjob());
		return n;
	}

	
	//锟斤拷询锟斤拷锟斤拷锟斤拷锟斤拷锟�
	public int getCountById(Integer id) {
		//锟斤拷锟斤拷锟斤拷锟斤拷
		int n=-1;
		//通锟斤拷锟矫伙拷id锟斤拷询锟斤拷锟斤拷
		//sql
		String sql="SELECT COUNT(*)FROM userResume WHERE urid=?";
		// 执锟斤拷sql
		try {
			this.rs=this.executeQuery(sql,id);
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

    //锟斤拷取锟斤拷锟斤拷锟斤拷锟叫碉拷锟斤拷
	public UserResume getuserresume(Integer id) {
		//锟斤拷锟斤拷锟斤拷锟斤拷
		UserResume urs=null;
		//sql锟斤拷锟�
		String sql="SELECT *FROM userResume WHERE urid=?";
		try {
			//锟斤拷询
			this.rs=this.executeQuery(sql,id);
			while(rs.next()){
				urs=new UserResume();
				urs.setUrid(rs.getInt(1));
				urs.setUrname(rs.getString(2));
				urs.setUrbirthday(rs.getString(3));
				urs.setUrsex(rs.getString(4));
				urs.setUrpolitical(rs.getString(5));
				urs.setUrmarriage(rs.getString(6));
				urs.setUreducation(rs.getString(7));
				urs.setUrexperience(rs.getString(8));
				urs.setUrphone(rs.getString(9));
				urs.setUremail(rs.getString(10));
				urs.setUrnature(rs.getString(11)) ;

				urs.setArid(rs.getString(12));
				urs.setBiid(rs.getString(13));
				
				urs.setUrmoney(rs.getString(14));
				urs.setUrjingli(rs.getString(15));
				
				urs.setUrproject(rs.getString(16));
				urs.setUrschool(rs.getString(17)) ; 
				urs.setUrsubject(rs.getString(18));
				urs.setUryear(rs.getString(19));
				urs.setUrintroduce(rs.getString(20));
				urs.setUraddress(rs.getString(21));
				urs.setUrdescribe(rs.getString(22));
				urs.setUrtime(rs.getString(23));
				urs.setUrpicture(rs.getString(24));
				urs.setUrjob(rs.getString(25));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return urs;
	}

    //锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
	public int updateexceptjob(UserResume resume) {
		// 
		int n=-1;
		//sql锟斤拷锟�
		String sql="UPDATE userResume SET urnature=?,arid=?,biid=?,urmoney=? WHERE urid=?";
		//执锟叫革拷锟斤拷
		n=this.executeUpdate(sql,resume.getUrnature(),resume.getArid(),resume.getBiid(),resume.getUrmoney(),resume.getUrid());
		return n;
	}
	//锟斤拷锟铰癸拷锟斤拷锟斤拷锟斤拷
	public int updatejingli(UserResume resume){
		int n=-1;
		//sql锟斤拷锟�
		String sql="UPDATE userResume SET urjingli=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUrjingli(),resume.getUrid());
		return n;
	}
     
	//
	public int updateproject(UserResume resume) {
		int n=-1;
		String sql="UPDATE userResume SET urproject=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUrproject(),resume.getUrid());
		return n;
	}

   //
	public int updateedu(UserResume resume) {
		int n=-1;
		String sql="UPDATE userResume set urschool=?,ureducation=?,ursubject=?,uryear=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUrschool(),resume.getUreducation(),resume.getUrsubject(),resume.getUryear(),resume.getUrid());
		return n;
	}

    //
	public int updateintroduce(UserResume resume) {
		int n=-1;
		//sql
		String sql="UPDATE userResume set urintroduce=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUrintroduce(),resume.getUrid());
		return n;
	}
	
	//
	public int updateshow(UserResume resume) {
		int n=-1;
		//sql
		String sql="UPDATE userResume set uraddress=?,urdescribe=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUraddress(),resume.getUrdescribe(),resume.getUrid());
		return n;
	}

    //
	public int updatename(UserResume resume) {
		int n=-1;
		//sql
		String sql="UPDATE userResume SET urname=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUrname(),resume.getUrid());
		return n;
	}
	
	//
	public int addjlpath(UserResume resume) {
		// TODO Auto-generated method stub
		int n=-1;
		//sql
		String sql="UPDATE userResume SET urjlpath=? WHERE urid=?";
		//
		n=this.executeUpdate(sql,resume.getUrjlpath(),resume.getUrid());
		return n;
	}
   
	//头锟斤拷锟街�
	public int addurpicture(UserResume resume){
		int n=-1;
		//Sql
		String sql="INSERT INTO userResume(urid,urpicture) VALUES(?,?)";
		//执锟斤拷sql锟斤拷锟�
		n=this.executeUpdate(sql,resume.getUrid(),resume.getUrpicture());
		return n;
	}
	
	public int countuser() {
		//
		int n=-1;
		//sql锟斤拷锟�
		String sql="SELECT COUNT(*) FROM userResume";
		try {
			//执锟斤拷sql锟斤拷锟�
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
	
	//锟斤拷锟铰硷拷锟斤拷锟斤拷锟斤拷
	public int updateuserid(UserResume resume) {
				// TODO Auto-generated method stub
				int n=-1;
				//sql锟斤拷锟�
				String sql="UPDATE userResume SET is_default=? WHERE urid=?";
				//锟斤拷锟斤拷
				n=this.executeUpdate(sql,resume.getIs_default(),resume.getUrid());
				//锟斤拷锟斤拷
				return n;
			}

		public int updateinfo(UserResume resume) {
			//
			int n=-1;
			//sql
			String sql="UPDATE userResume SET urname=?,ursex=?,ureducation=?,urexperience=?,urphone=?,uremail=?,currentState=? WHERE urid=?";
			//锟斤拷锟斤拷
			n=this.executeUpdate(sql,resume.getUrname(),resume.getUrsex(),resume.getUreducation(),resume.getUrexperience(),resume.getUrphone(),
						resume.getUremail(),resume.getCurrentState(),resume.getUrid());
			//锟斤拷锟斤拷
			return n;
			}

         //投锟捷硷拷锟斤拷
		public UserResume exeuqueryUserResume(Integer id) {
			//
			UserResume u=null;
			//sql锟斤拷锟�
			String sql="SELECT urid,urname,ursex,ureducation,urexperience, urphone, uremail," +
					" urnature,arid,biid,urmoney,urproject,urschool,ursubject ,uryear,urintroduce," +
					" uraddress,urdescribe,urtime ,urpicture FROM userResume WHERE urid=?";
			try {
				//
				this.rs=this.executeQuery(sql, id);
				//执锟叫诧拷询
				while(rs.next()){
					u=new UserResume();
					u.setUrid(rs.getInt(1));
					u.setUrname(rs.getString(2));
					u.setUrsex(rs.getString(3));
					u.setUreducation(rs.getString(4));
					u.setUrexperience(rs.getString(5));
					u.setUrphone(rs.getString(6));
					u.setUremail(rs.getString(7));
					u.setUrnature(rs.getString(8));
					u.setArid(rs.getString(9));
					u.setBiid(rs.getString(10));
					u.setUrmoney(rs.getString(11));
					u.setUrproject(rs.getString(12));
					u.setUrschool(rs.getString(13));
					u.setUrsubject(rs.getString(14));
					u.setUryear(rs.getString(15));
					u.setUrintroduce(rs.getString(16));
                    u.setUraddress(rs.getString(17));
                    u.setUrdescribe(rs.getString(18));
                    u.setUrtime(rs.getString(19));
                    u.setUrpicture(rs.getString(20));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
			return u;
		}


		public UserResume chaxunjlpath(Integer id) {
			//
			UserResume u=null;
			//sql锟斤拷锟�
			String sql="SELECT urjlpath FROM userResume  WHERE urid=?";
//			//执锟叫诧拷询
			try {
				this.rs=this.executeQuery(sql, id);
				while(rs.next()){
					u=new UserResume();
					u.setUrjlpath(rs.getString(1));
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
			return u;
		}


		public int phonepath(UserResume resume) {
			// TODO Auto-generated method stub
			int n=-1;
			//sql
			String sql="UPDATE userResume SET  urpicture=? WHERE urid=?";
			//执行更新
			n=this.executeUpdate(sql, resume.getUrpicture(),resume.getUrid());
			return n;
		}


		public UserResume photopath(int uid) {
			//
			UserResume u=null;
			//sql
			String sql="SELECT urpicture FROM userResume WHERE urid=?";
			//查询
			try {
				this.rs=this.executeQuery(sql,uid);
				while(rs.next()){
					u=new UserResume();
					u.setUrpicture(rs.getString(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
			return u;
		}


		public UserResume is_defaultradio(Integer uid) {
			// TODO Auto-generated method stub
			UserResume u=null;
			//sql语句
			String sql="SELECT is_default FROM userResume  WHERE urid=?";
			//执行查询
			try {
				this.rs=this.executeQuery(sql, uid);
				while(rs.next()){
					u=new UserResume();
					u.setIs_default(rs.getInt(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
			return u;
		}


		public List<BusinessInfo> getAllphoto() {
			// 
			
			return null;
		}			
}