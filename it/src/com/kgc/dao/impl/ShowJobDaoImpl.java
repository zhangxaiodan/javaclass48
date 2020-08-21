package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.kgc.dao.ShowJobDao;
import com.kgc.pojo.AreaInfo;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;

public class ShowJobDaoImpl extends BaseDao implements ShowJobDao{
	
	
	 //获取全部招聘信息
		public List<BusinessInfo> showAllJob() {
			// TODO Auto-generated method stub
			List<BusinessInfo> list=new ArrayList<BusinessInfo>();
			String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid";
			//调用查询
			this.rs=this.executeQuery(sql);
			try {
				while(rs.next()){
					BusinessInfo bi=new BusinessInfo();
					BusinessRecruit br=new BusinessRecruit();		
							
					br.setBrJob(rs.getString("brjob"));
					br.setBrNature(rs.getString("brNature"));
					br.setBrMoney(rs.getString("brMoney"));
					br.setBrCity(rs.getString("brcity"));
					br.setBrExperience(rs.getString("brExperience"));
					br.setBrEducation(rs.getString("brEducation"));
					br.setBrLikeJob(rs.getString("brLikeJob"));
					br.setBrJobDescribe(rs.getString("brJobDescribe"));
					br.setBrAddress(rs.getString("brAddress"));
					br.setBrEmail(rs.getString("brEmail"));
					br.setBrTime(rs.getString("brTime"));


					bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
					bi.setBuCity(rs.getString("buCity"));//所在城市
					bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
					bi.setBujName(rs.getString("bujName"));//简称
					bi.setBuSize(rs.getString("buSize"));//规模
					bi.setOrName(rs.getString("orName"));//创始人
					
					bi.setRecruit(br);
					
					list.add(bi);			
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return list;
		}

	    //获取招聘表根据公司
		public List<BusinessInfo> getJobByB(String bname) {
			// TODO Auto-generated method stub
			
			List<BusinessInfo> list=new ArrayList<BusinessInfo>();
			String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid where buName like \"%\"?\"%\" ";
			//调用查询
			this.rs=this.executeQuery(sql,bname);
			try {
				while(rs.next()){
					BusinessInfo bi=new BusinessInfo();
					BusinessRecruit br=new BusinessRecruit();		
							
					br.setBrJob(rs.getString("brjob"));
					br.setBrNature(rs.getString("brNature"));
					br.setBrMoney(rs.getString("brMoney"));
					br.setBrCity(rs.getString("brcity"));
					br.setBrExperience(rs.getString("brExperience"));
					br.setBrEducation(rs.getString("brEducation"));
					br.setBrLikeJob(rs.getString("brLikeJob"));
					br.setBrJobDescribe(rs.getString("brJobDescribe"));
					br.setBrAddress(rs.getString("brAddress"));
					br.setBrEmail(rs.getString("brEmail"));
					br.setBrTime(rs.getString("brTime"));


					bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
					bi.setBuCity(rs.getString("buCity"));//所在城市
					bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
					bi.setBujName(rs.getString("bujName"));//简称
					bi.setBuSize(rs.getString("buSize"));//规模
					bi.setOrName(rs.getString("orName"));//创始人
					
					bi.setRecruit(br);
					
					list.add(bi);			
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return list;
		}
		
		//获取招聘表根据职位
			public List<BusinessInfo> getJobByJ(String jname) {
				// TODO Auto-generated method stub
				
				List<BusinessInfo> list=new ArrayList<BusinessInfo>();
				String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid where businessRecruit.brjob like \"%\"?\"%\" ";
				//调用查询
				this.rs=this.executeQuery(sql,jname);
				try {
					while(rs.next()){
						BusinessInfo bi=new BusinessInfo();
						BusinessRecruit br=new BusinessRecruit();		
								
						br.setBrJob(rs.getString("brjob"));
						br.setBrNature(rs.getString("brNature"));
						br.setBrMoney(rs.getString("brMoney"));
						br.setBrCity(rs.getString("brcity"));
						br.setBrExperience(rs.getString("brExperience"));
						br.setBrEducation(rs.getString("brEducation"));
						br.setBrLikeJob(rs.getString("brLikeJob"));
						br.setBrJobDescribe(rs.getString("brJobDescribe"));
						br.setBrAddress(rs.getString("brAddress"));
						br.setBrEmail(rs.getString("brEmail"));
						br.setBrTime(rs.getString("brTime"));


						bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
						bi.setBuCity(rs.getString("buCity"));//所在城市
						bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
						bi.setBujName(rs.getString("bujName"));//简称
						bi.setBuSize(rs.getString("buSize"));//规模
						bi.setOrName(rs.getString("orName"));//创始人
						
						bi.setRecruit(br);
						
						list.add(bi);			
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				return list;
			}

		//获取招聘表根据薪资
		public List<BusinessInfo> getJobByP(String pname) {
			// TODO Auto-generated method stub
			
			List<BusinessInfo> list=new ArrayList<BusinessInfo>();
			String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid where BusinessRecruit.brmoney like \"%\"?\"%\" ";
			//调用查询
			this.rs=this.executeQuery(sql,pname);
			
			try {
				while(rs.next()){
					BusinessInfo bi=new BusinessInfo();
					BusinessRecruit br=new BusinessRecruit();		
							
					br.setBrJob(rs.getString("brjob"));
					br.setBrNature(rs.getString("brNature"));
					br.setBrMoney(rs.getString("brMoney"));
					br.setBrCity(rs.getString("brcity"));
					br.setBrExperience(rs.getString("brExperience"));
					br.setBrEducation(rs.getString("brEducation"));
					br.setBrLikeJob(rs.getString("brLikeJob"));
					br.setBrJobDescribe(rs.getString("brJobDescribe"));
					br.setBrAddress(rs.getString("brAddress"));
					br.setBrEmail(rs.getString("brEmail"));
					br.setBrTime(rs.getString("brTime"));


					bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
					bi.setBuCity(rs.getString("buCity"));//所在城市
					bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
					bi.setBujName(rs.getString("bujName"));//简称
					bi.setBuSize(rs.getString("buSize"));//规模
					bi.setOrName(rs.getString("orName"));//创始人
					
					bi.setRecruit(br);
					
					list.add(bi);			
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}

		
		//获取招聘表根据城市
		public List<BusinessInfo> getJobByC(String cname) {
				// TODO Auto-generated method stub
				
				List<BusinessInfo> list=new ArrayList<BusinessInfo>();
				String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid where BusinessRecruit.brcity like \"%\"?\"%\" ";
				//调用查询
				this.rs=this.executeQuery(sql,cname);
				
				try {
					while(rs.next()){
						BusinessInfo bi=new BusinessInfo();
						BusinessRecruit br=new BusinessRecruit();		
								
						br.setBrJob(rs.getString("brjob"));
						br.setBrNature(rs.getString("brNature"));
						br.setBrMoney(rs.getString("brMoney"));
						br.setBrCity(rs.getString("brcity"));
						br.setBrExperience(rs.getString("brExperience"));
						br.setBrEducation(rs.getString("brEducation"));
						br.setBrLikeJob(rs.getString("brLikeJob"));
						br.setBrJobDescribe(rs.getString("brJobDescribe"));
						br.setBrAddress(rs.getString("brAddress"));
						br.setBrEmail(rs.getString("brEmail"));
						br.setBrTime(rs.getString("brTime"));


						bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
						bi.setBuCity(rs.getString("buCity"));//所在城市
						bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
						bi.setBujName(rs.getString("bujName"));//简称
						bi.setBuSize(rs.getString("buSize"));//规模
						bi.setOrName(rs.getString("orName"));//创始人
						
						bi.setRecruit(br);
						
						list.add(bi);			
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return list;
			}

		 //获取招聘表根据学历
			public List<BusinessInfo> getJobByS(String sname) {
				// TODO Auto-generated method stub
				
				List<BusinessInfo> list=new ArrayList<BusinessInfo>();
				String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid where BusinessRecruit.breducation like \"%\"?\"%\" ";
				//调用查询
				this.rs=this.executeQuery(sql,sname);
				
				try {
					while(rs.next()){
						BusinessInfo bi=new BusinessInfo();
						BusinessRecruit br=new BusinessRecruit();		
								
						br.setBrJob(rs.getString("brjob"));
						br.setBrNature(rs.getString("brNature"));
						br.setBrMoney(rs.getString("brMoney"));
						br.setBrCity(rs.getString("brcity"));
						br.setBrExperience(rs.getString("brExperience"));
						br.setBrEducation(rs.getString("brEducation"));
						br.setBrLikeJob(rs.getString("brLikeJob"));
						br.setBrJobDescribe(rs.getString("brJobDescribe"));
						br.setBrAddress(rs.getString("brAddress"));
						br.setBrEmail(rs.getString("brEmail"));
						br.setBrTime(rs.getString("brTime"));


						bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
						bi.setBuCity(rs.getString("buCity"));//所在城市
						bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
						bi.setBujName(rs.getString("bujName"));//简称
						bi.setBuSize(rs.getString("buSize"));//规模
						bi.setOrName(rs.getString("orName"));//创始人
						
						bi.setRecruit(br);
						
						list.add(bi);			
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return list;
			}

		//获取招聘表根据经验
			public List<BusinessInfo> getJobByE(String ename) {
				// TODO Auto-generated method stub
				
				List<BusinessInfo> list=new ArrayList<BusinessInfo>();
				String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid where BusinessRecruit.brexperience like \"%\"?\"%\" ";
				//调用查询
				this.rs=this.executeQuery(sql,ename);
				
				try {
					while(rs.next()){
						BusinessInfo bi=new BusinessInfo();
						BusinessRecruit br=new BusinessRecruit();		
								
						br.setBrJob(rs.getString("brjob"));
						br.setBrNature(rs.getString("brNature"));
						br.setBrMoney(rs.getString("brMoney"));
						br.setBrCity(rs.getString("brcity"));
						br.setBrExperience(rs.getString("brExperience"));
						br.setBrEducation(rs.getString("brEducation"));
						br.setBrLikeJob(rs.getString("brLikeJob"));
						br.setBrJobDescribe(rs.getString("brJobDescribe"));
						br.setBrAddress(rs.getString("brAddress"));
						br.setBrEmail(rs.getString("brEmail"));
						br.setBrTime(rs.getString("brTime"));


						bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
						bi.setBuCity(rs.getString("buCity"));//所在城市
						bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
						bi.setBujName(rs.getString("bujName"));//简称
						bi.setBuSize(rs.getString("buSize"));//规模
						bi.setOrName(rs.getString("orName"));//创始人
						
						bi.setRecruit(br);
						
						list.add(bi);			
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return list;
			}
	 
		//获取招聘表根据多参数  b：公司名；j：职位名；p：月薪；c：城市；s：学历；e：工作经验；x：工作性质
		  public List<BusinessInfo> getJobBy(String b,String j,String p,String c,String s,String e,String x){
			  List<BusinessInfo> list=new ArrayList<BusinessInfo>();
			  String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid WHERE 1=1 AND buName LIKE ? AND businessRecruit.brjob LIKE ? AND BusinessRecruit.brmoney LIKE ? AND BusinessRecruit.brcity LIKE ? AND BusinessRecruit.breducation LIKE ? AND"
	                      +" BusinessRecruit.brexperience LIKE ? AND BusinessRecruit.brnature LIKE ?";
			  //调用查询
			  this.rs=this.executeQuery(sql,b,j,p,c,s,e,x);
			  try {
				while(rs.next()){
					    BusinessInfo bi=new BusinessInfo();
						BusinessRecruit br=new BusinessRecruit();		
						ps=con.prepareStatement(sql);
						ps.setString(1, "%"+b+"%");//公司名
						ps.setString(2, "%"+j+"%");//职位名
						ps.setString(3, "%"+p+"%");//月薪
						ps.setString(4, "%"+c+"%");//城市
						ps.setString(5, "%"+s+"%");//学历
						ps.setString(6, "%"+e+"%");//工作经验
						ps.setString(1, "%"+x+"%");//工作性质
						
						br.setBrJob(rs.getString("brjob"));
						br.setBrNature(rs.getString("brNature"));
						br.setBrMoney(rs.getString("brMoney"));
						br.setBrCity(rs.getString("brcity"));
						br.setBrExperience(rs.getString("brExperience"));
						br.setBrEducation(rs.getString("brEducation"));
						br.setBrLikeJob(rs.getString("brLikeJob"));
						br.setBrJobDescribe(rs.getString("brJobDescribe"));
						br.setBrAddress(rs.getString("brAddress"));
						br.setBrEmail(rs.getString("brEmail"));
						br.setBrTime(rs.getString("brTime"));


						bi.setBuBigJob(rs.getString("buBigJob"));//行业领域
						bi.setBuCity(rs.getString("buCity"));//所在城市
						bi.setBuDevelopment(rs.getString("buDevelopment"));//发展阶段
						bi.setBujName(rs.getString("bujName"));//简称
						bi.setBuSize(rs.getString("buSize"));//规模
						bi.setOrName(rs.getString("orName"));//创始人
						
						bi.setRecruit(br);
						
						list.add(bi);	
				  }
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  return list;
		  }
}
