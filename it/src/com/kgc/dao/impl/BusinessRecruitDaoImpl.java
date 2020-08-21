package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.BusinessRecruitDao;
import com.kgc.pojo.AreaInfo;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessRecruit1;
import com.kgc.pojo.Collectionsjob;

public class BusinessRecruitDaoImpl extends BaseDao implements BusinessRecruitDao{

	public int addBusinessRecruit(BusinessRecruit b) {
		int n=0;
		String sql="INSERT INTO businessRecruit(brid,brjob,brnature,brmoney,brcity,brexperience,breducation,brlikejob,brjobdescribe,braddress,bremail,brtime,brbuid)"
				+"VALUES(NULL,?,?,?,?,?,?,?,?,?,?,NOW(),?)";
		
		Object objects[]={
				b.getBrJob(),
				b.getBrNature(),
				b.getBrMoney(),
				b.getBrCity(),
				b.getBrExperience(),
				b.getBrEducation(),
				b.getBrLikeJob(),
				b.getBrJobDescribe(),
				b.getBrAddress(),
				b.getBrEmail(),
				b.getBrBuId()
		};
		n=this.executeUpdate(sql,objects);
		return n;
	}
	
	//查询添加职位列表
	public List<BusinessRecruit> getAllBusinessRecruit(Integer brbuid) {
		List<BusinessRecruit> list=new ArrayList<BusinessRecruit>();
		String sql="SELECT * FROM businessRecruit WHERE brbuid=? ORDER BY brtime DESC ;";
		try {
			rs=this.executeQuery(sql,brbuid);
			while(rs.next()){
				BusinessRecruit br=new BusinessRecruit();
				
				br.setBrId(rs.getInt("brid"));
				
				br.setBrJob(rs.getString("brjob"));
				br.setBrNature(rs.getString("brnature"));
				br.setBrMoney(rs.getString("brmoney"));
				br.setBrCity(rs.getString("brcity"));
				br.setBrExperience(rs.getString("brexperience"));
				
				br.setBrEducation(rs.getString("breducation"));
				br.setBrLikeJob(rs.getString("brlikejob"));
				br.setBrJobDescribe(rs.getString("brjobdescribe"));
				br.setBrAddress(rs.getString("braddress"));
				br.setBrEmail(rs.getString("bremail"));
				
				br.setBrTime(rs.getString("brtime"));
				br.setBrBuId(rs.getInt("brbuid"));
				list.add(br);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}

	public BusinessRecruit getBusinessRecruitById(Integer brid) {
		BusinessRecruit br=null;
		String sql="SELECT * FROM BusinessRecruit WHERE brid=?";
		try {
			this.rs=this.executeQuery(sql,brid);
			while(rs.next()){
				br=new BusinessRecruit();
				br.setBrId(rs.getInt("brid"));
				br.setBrJob(rs.getString("brjob"));
				br.setBrNature(rs.getString("brnature"));
				br.setBrMoney(rs.getString("brmoney"));
				br.setBrCity(rs.getString("brcity"));
				br.setBrExperience(rs.getString("brexperience"));
				br.setBrEducation(rs.getString("breducation"));
				br.setBrLikeJob(rs.getString("brlikejob"));
				br.setBrJobDescribe(rs.getString("brjobdescribe"));
				br.setBrAddress(rs.getString("braddress"));
				br.setBrEmail(rs.getString("bremail"));
				br.setBrTime(rs.getString("brtime"));
				br.setBrBuId(rs.getInt("brbuid"));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}	
		return br;
	}

	public int delBusinessRecruit(Integer id) {
		String sql="DELETE FROM BusinessRecruit WHERE brid=?";
		//调用删除的方法
		int n=this.executeUpdate(sql, id);
		return n;
	}
	
	
	public List<BusinessRecruit1> getAlljobs(Integer from,Integer pageSize) {
		//获取所有的收藏职位
		List<BusinessRecruit1> list=new ArrayList<BusinessRecruit1>();
		//sql语句
		String sql="SELECT businessRecruit.brid,bigjobInfo.biid,bijob,brnature,brmoney,areaInfo.arid,arcity" 
			   +" brexperience,breducation,brlikejob,brjobdescribe,braddress,bremail,brtime,collectionsjob.jno,businessInfo.buid,bulogo"
               +" FROM collectionsjob"
               +" INNER JOIN  businessRecruit"
               +" ON collectionsjob.brid=businessRecruit.brid"
               +" INNER JOIN bigjobInfo " 
               +" ON bigjobInfo.biid=businessRecruit.biid"
               +" INNER JOIN areaInfo"
               +" ON areaInfo.arid=businessRecruit.arid"
               +" INNER JOIN businessInfo"
               +" ON businessInfo.buid=businessRecruit.brBuId"
               +" LIMIT ?,?";
		try {
			//执行查询
			this.rs=this.executeQuery(sql,from,pageSize);
			while(rs.next()){
				BusinessRecruit1 bis=new BusinessRecruit1();
				bis.setBrId(rs.getInt(1));
				//
				int b=rs.getInt(2);
				BigJobInfo bi=new BigJobInfo();
				String bjob=rs.getString("bijob");
				bi.setBiId(b);
				bi.setBiJob(bjob);
				bis.setBi(bi);
				//
				bis.setBrNature(rs.getString(4));
				bis.setBrMoney(rs.getString(5));
				//
				int ad=rs.getInt(6);
				AreaInfo a=new AreaInfo();
				String ac=rs.getString(7);
				a.setArid(ad);
				a.setArcity(ac);
				bis.setAi(a);
				//
				bis.setBrExperience(rs.getString(8));
			    bis.setBrEducation(rs.getString(9));
			    bis.setBrLikeJob(rs.getString(10));
			    bis.setBrJobDescribe(rs.getString(11));
			    bis.setBrAddress(rs.getString(12));
			    bis.setBrEmail(rs.getString(13));
			    bis.setBrTime(rs.getString("brtime"));
			    //
			    int no=rs.getInt("jno");
			    Collectionsjob j=new Collectionsjob();
			    j.setJno(no);
			    bis.setJid(j);
			   
			   //
			    int i=rs.getInt("businessInfo.buid");
			    BusinessInfo bb=new BusinessInfo();
			    String t=rs.getString("bulogo");
			    bb.setBuId(i);
			    bb.setBuLogo(t);
			    bis.setBd(bb);
			    //
			    list.add(bis);  
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}		
		return list;
	}

	public int getCountBrt() {
		int n=-1;
		//sql
		String sql="SELECT COUNT(*) FROM collectionsjob"
                  +" INNER JOIN  businessRecruit"
                  +" ON collectionsjob.brid=businessRecruit.brid"
                  +" INNER JOIN bigjobInfo "
                  +" ON bigjobInfo.biid=businessRecruit.biid"
                  +" INNER JOIN areaInfo"
                  +" ON areaInfo.arid=businessRecruit.arid"
                  +" INNER JOIN businessInfo"
                  +" ON businessInfo.buid=businessRecruit.brBuId";
		
		try {
			//执行查询
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

	public BusinessRecruit1 getjobsinfo(int id) {
		BusinessRecruit1 br=null;
		//sql语句
		String sql="SELECT brid,brnature,brmoney,brexperience,breducation,brlikejob,brjobdescribe,braddress,bremail,brtime,brJob,brCity" 
				+" FROM businessRecruit WHERE brid=?";
		try {
			//查询
			this.rs=this.executeQuery(sql, id);
			while(rs.next()){
				br=new BusinessRecruit1();
				br.setBrId(rs.getInt(1));
				br.setBrNature("brnature");
				br.setBrMoney("brmoney");
				br.setBrExperience("brexperience");
				br.setBrEducation("breducation");
				br.setBrLikeJob("brlikejob");
				br.setBrJobDescribe("brjobdescribe");
				br.setBrAddress("braddress");
				br.setBrEmail("bremail ");
				br.setBrTime("brtime");
				br.setBrJob("brJob");
				br.setBrCity("brCity");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		
		return br;
	}	
	

}
