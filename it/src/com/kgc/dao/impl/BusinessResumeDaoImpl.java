package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.BusinessResumeDao;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessResume;
/**
 * 数据访问层 实现类 公司简历
 * @author Administrator
 *
 */
public class BusinessResumeDaoImpl extends BaseDao implements BusinessResumeDao{

	public List<BusinessResume> getAllBusinessResume(Integer burBuid) {
		List<BusinessResume> list=new ArrayList<BusinessResume>();
		String sql="SELECT * FROM businessResume WHERE burbuid=? ORDER BY burtime DESC ;";
		try {
			rs=this.executeQuery(sql,burBuid);
			while(rs.next()){
				BusinessResume bu=new BusinessResume();
				
				bu.setBurId(rs.getInt("burid"));
				bu.setBurName(rs.getString("burname"));
				bu.setBurSex(rs.getString("bursex"));
				bu.setBurEducation(rs.getString("bureducation"));
				bu.setBurExperience(rs.getString("burexperience"));
				bu.setBurCity(rs.getString("burcity"));
				bu.setBurJob(rs.getString("burjob"));
				bu.setBurPhone(rs.getString("burphone"));
				bu.setBurEmail(rs.getString("buremail"));
				bu.setBurNature(rs.getString("burnature"));
				
				bu.setBurMoney(rs.getString("burmoney"));
				bu.setBurProject(rs.getString("burproject"));
				bu.setBurYear(rs.getString("buryear"));
				bu.setBurSchool(rs.getString("burschool"));
				bu.setBurSubject(rs.getString("bursubject"));
				bu.setBurIntroduce(rs.getString("burintroduce"));
				bu.setBurAddress(rs.getString("buraddress"));
				bu.setBurDescribe(rs.getString("burdescribe"));
				bu.setBurTime(rs.getString("burtime"));
				bu.setBurPicture(rs.getString("burpicture"));
				bu.setBurBuid(rs.getInt("burbuid"));
				
				list.add(bu);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}

	public BusinessResume getBusinessResumeById(Integer burid) {
		BusinessResume bur=null;
		String sql="SELECT * FROM BusinessResume WHERE burid=?";
		try {
			this.rs=this.executeQuery(sql,burid);
			while(rs.next()){
				bur=new BusinessResume();
				bur.setBurId(rs.getInt("burid"));
				bur.setBurName(rs.getString("burname"));
				bur.setBurSex(rs.getString("bursex"));
				bur.setBurEducation(rs.getString("bureducation"));
				bur.setBurExperience(rs.getString("burexperience"));
				bur.setBurCity(rs.getString("burcity"));
				
				bur.setBurJob(rs.getString("burjob"));
				bur.setBurPhone(rs.getString("burphone"));
				bur.setBurEmail(rs.getString("buremail"));
				bur.setBurNature(rs.getString("burnature"));
				
				bur.setBurMoney(rs.getString("burmoney"));
				bur.setBurProject(rs.getString("burproject"));
				bur.setBurYear(rs.getString("buryear"));
				bur.setBurSchool(rs.getString("burschool"));
				bur.setBurSubject(rs.getString("bursubject"));
				bur.setBurIntroduce(rs.getString("burintroduce"));
				
				bur.setBurAddress(rs.getString("buraddress"));
				bur.setBurDescribe(rs.getString("burdescribe"));
				bur.setBurTime(rs.getString("burtime"));
				bur.setBurPicture(rs.getString("burpicture"));
				bur.setBurBuid(rs.getInt("burbuid"));		
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}	
		return bur;
	}
	//投递个人简历信息
		public int addBusinessResume(BusinessResume brs){
			//
			int n=-1;
			//sql语句
			String sql="INSERT INTO businessResume(burid,burname,bursex,bureducation,burexperience,burcity,burjob,burphone,buremail,burnature, burmoney,burproject,buryear,burschool,bursubject,burintroduce, buraddress,burdescribe,burtime,burpicture,burbuid,urid)"
	                +" VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now(),?,?,?)";
			//执行插入
			n=this.executeUpdate(sql,brs.getBurName(),brs.getBurSex(),brs.getBurEducation(),brs.getBurExperience(),
					brs.getBurCity(),brs.getBurJob(),brs.getBurPhone(),brs.getBurEmail(),brs.getBurNature()
					,brs.getBurMoney(),brs.getBurProject(),brs.getBurYear(),brs.getBurSchool(),brs.getBurSubject(),
					brs.getBurIntroduce(),brs.getBurAddress(),brs.getBurDescribe(),brs.getBurPicture(),brs.getBurBuid(),brs.getUrid());	
			return n;
		}

		public BusinessResume exeuqueryBusiResume(Integer id) {
			//获取所有的列
			BusinessResume br=null;
			//sql语句
			String sql="SELECT *FROM businessResume WHERE burid=?";
			try {
				//执行查询
				this.rs=this.executeQuery(sql, id);
				while(rs.next()){
					br=new BusinessResume();
					br.setBurId(rs.getInt(1));
					br.setBurName(rs.getString(2));
					br.setBurSex(rs.getString(3));
					br.setBurEducation(rs.getString(4));
					br.setBurExperience(rs.getString(5));
					br.setBurCity(rs.getString(6));
					br.setBurJob(rs.getString(7));
					br.setBurPhone(rs.getString(8));
					br.setBurEmail(rs.getString(9));
					br.setBurNature(rs.getString(10));
					br.setBurMoney(rs.getString(11));
					br.setBurProject(rs.getString(12));
					br.setBurYear(rs.getString(13));
					br.setBurSchool(rs.getString(14));
					br.setBurSubject(rs.getString(15));
					br.setBurIntroduce(rs.getString(16));
					br.setBurAddress(rs.getString(17));
					br.setBurDescribe(rs.getString(18));
					br.setBurTime(rs.getString(19));
					br.setBurPicture(rs.getString(20));
					br.setBurBuid(rs.getInt(21));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}

			return br;
		}

		
		public int addBresumePath(BusinessResume resume) {
			//
			int n=-1;
			//sql语句
			String sql="INSERT INTO  businessResume (burid,burtime,burPathjl,burbuid,urid) VALUES(?,?,?,?,?)";
			//执行sql语句
			n=this.executeUpdate(sql,resume.getBurId(),resume.getBurTime(),resume.getBurPathjl(),resume.getBurBuid(),resume.getUrid());
			return n;
		}
	
}
