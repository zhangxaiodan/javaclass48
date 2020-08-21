package com.kgc.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kgc.dao.BusinessInfoDao;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;

/**
 * 企业注册信息的实现类
 * @author Administrator
 *
 */
public class BusinessInfoDaoImpl extends BaseDao implements BusinessInfoDao{
	//查询所有的注册企业信息
	public List<BusinessInfo> getAllBusiness() {
		//创建企业注册信息集合对象
		List<BusinessInfo> list=new ArrayList<BusinessInfo>();
		String sql="SELECT*FROM businessinfo";
		try {
			rs=this.executeQuery(sql);
			while(rs.next()){
				BusinessInfo bi=new BusinessInfo();
				bi.setBuId(rs.getInt("buId"));
				bi.setBuBigJob(rs.getString("buBigJob"));
				bi.setBuCity(rs.getString("buCity"));
				bi.setBuDevelopment(rs.getString("buDevelopment"));
				bi.setBuHomePage(rs.getString("buHomePage"));
				bi.setBuIntroduce(rs.getString("buIntroduce"));
				bi.setBujName(rs.getString("bujName"));
				bi.setBuLable(rs.getString("buLable"));
				bi.setBuLoginName(rs.getString("buLoginName"));
				bi.setBuLogo(rs.getString("buLogo"));
				bi.setBuName(rs.getString("buName"));
				bi.setBuPhone(rs.getString("buPhone"));
				bi.setBuPicture(rs.getString("buPicture"));
				bi.setBuPwd(rs.getString("buPwd"));
				bi.setBuSize(rs.getString("buSize"));
				bi.setBuType(rs.getString("buType"));
				bi.setBuxIntroduce(rs.getString("buxIntroduce"));
				bi.setOrIntroduce(rs.getString("orIntroduce"));
				bi.setOrJob(rs.getString("orJob"));
				bi.setOrName(rs.getString("orName"));
				bi.setOrWeibo(rs.getString("orWeibo"));
				bi.setPrAddress(rs.getString("prAddress"));
				bi.setPrIntroduce(rs.getString("prIntroduce"));
				bi.setPrName(rs.getString("prName"));
				bi.setPrPicture(rs.getString("prPicture"));
				list.add(bi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.close(con, ps, rs);
		}
		return list;
	}
	//获取总条数
	public int getCount(String name, Integer buid) {
		int n=-1;
		String sql="SELECT COUNT(*) FROM businessinfo where 1=1";
		if(buid!=-1){
			   sql+=" and buid="+buid;
			}
			if(name!=null && name!=""){
				sql+=" and bujname like '%"+name+"%'";
			}
		try {
			rs=this.executeQuery(sql);
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
	//实现分页查询
	public List<BusinessInfo> getBusPage(String name, Integer buid, int from,
			int pageSize) {
		List<BusinessInfo> list=new ArrayList<BusinessInfo>();
		String sql="SELECT buid,buloginname,bupwd,buname,bujname,buhomepage,buCity,butype" 
				    +" ,buBigJob,busize,budevelopment,orname,orjob,prname  FROM businessinfo where 1=1";
		if(buid!=-1){
			sql+=" and buid="+buid;
		}
		if(name!=null&&!name.equals("")){
			sql+=" and bujname  like '%"+name+"%'";
		}
		sql+=" limit ?,?";
		try {
			rs=this.executeQuery(sql,from,pageSize);
			while(rs.next()){
				BusinessInfo bi=new BusinessInfo();
				bi.setBuId(rs.getInt("buId"));
				bi.setBuBigJob(rs.getString("buBigJob"));
				bi.setBuCity(rs.getString("buCity"));
				bi.setBuDevelopment(rs.getString("buDevelopment"));
				bi.setBuHomePage(rs.getString("buHomePage"));
				bi.setBujName(rs.getString("bujName"));
				bi.setBuLoginName(rs.getString("buLoginName"));
				bi.setBuName(rs.getString("buName"));
				bi.setBuPwd(rs.getString("buPwd"));
				bi.setBuSize(rs.getString("buSize"));
				bi.setBuType(rs.getString("buType"));
				bi.setOrJob(rs.getString("orJob"));
				bi.setOrName(rs.getString("orName"));
				bi.setPrName(rs.getString("prName"));
				list.add(bi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	//注册公司信息
	public int addBusinessInfo(BusinessInfo b) {
			int n=0;
			String sql="INSERT INTO businessInfo(buid,buloginname,bupwd,buemail,buname,bujname,bulogo,buhomepage,bucity," +
					" bubigjob,busize,budevelopment,buintroduce,butype,bupicture,buphone,bulable,orname,orjob,orweibo,orintroduce," +
					" prPicture,prName,prAddress,printroduce,buxintroduce) "
							+" VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				Object objects[]={
						b.getBuLoginName(),
						b.getBuPwd(),
						b.getBuEmail(),
						
						b.getBuName(),
						b.getBujName(),
						b.getBuLogo(),
						b.getBuHomePage(),
						b.getBuCity(),
						b.getBuBigJob(),
						b.getBuSize(),
						b.getBuDevelopment(),
						b.getBuIntroduce(),
						b.getBuType(),
						b.getBuPicture(),
						b.getBuPhone(),
						
						b.getBuLable(),
						
						b.getOrName(),
						b.getOrJob(),
						b.getOrWeibo(),
						b.getOrIntroduce(),
						
						b.getPrPicture(),
						b.getPrName(),
						b.getPrAddress(),
						b.getPrIntroduce(),
						
						b.getBuxIntroduce()
				};
				n=this.executeUpdate(sql,objects);
				return n;

		}
		
		//判断是否重复
		public BusinessInfo getBusinessInfoByBuName(String name) {
			BusinessInfo b=null;
			String sql="SELECT * FROM businessInfo WHERE buname=?";
			try {
				this.rs=this.executeQuery(sql, name);
				while(rs.next()){
					b=new BusinessInfo();
					b.setBuName(rs.getString(1));
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
			return b;
		}
		
		//根据公司全称查询对象
		public BusinessInfo getBusinessInfoByName(String name) {
			BusinessInfo bi=null;
			String sql="SELECT * FROM businessInfo WHERE buname=?";
			try {
				this.rs=this.executeQuery(sql,name);
				while(rs.next()){
					bi=new BusinessInfo();
					bi.setBuId(rs.getInt("buid"));
					bi.setBuLoginName(rs.getString("buloginname"));
					bi.setBuPwd(rs.getString("bupwd"));
					bi.setBuEmail(rs.getString("buemail"));
					
					bi.setBuName(rs.getString("buname"));
					bi.setBujName(rs.getString("bujname"));
					bi.setBuLogo(rs.getString("bulogo"));
					bi.setBuHomePage(rs.getString("buhomepage"));
					bi.setBuCity(rs.getString("bucity"));
					bi.setBuBigJob(rs.getString("bubigjob"));
					bi.setBuSize(rs.getString("busize"));
					bi.setBuDevelopment(rs.getString("budevelopment"));
					bi.setBuIntroduce(rs.getString("buintroduce"));
					bi.setBuType(rs.getString("butype"));
					bi.setBuPicture(rs.getString("bupicture"));
					bi.setBuPhone(rs.getString("buphone"));
					bi.setBuLable(rs.getString("bulable"));
					
					bi.setOrName(rs.getString("orname"));
					bi.setOrJob(rs.getString("orjob"));
					bi.setOrWeibo(rs.getString("orweibo"));
					bi.setOrIntroduce(rs.getString("orintroduce"));
					
					bi.setPrPicture(rs.getString("prPicture"));
					bi.setPrName(rs.getString("prName"));
					bi.setPrAddress(rs.getString("prAddress"));
					bi.setPrIntroduce(rs.getString("printroduce"));
					
					bi.setBuxIntroduce(rs.getString("buxintroduce"));
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}	
			return bi;
		}
		
		//修改公司信息
		public int updateBusinessInfo(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set buloginname=?,bupwd=?,buemail=?,buname=?, bujname=?,bulogo=?, " +
					" buhomepage=?,bucity=?,bubigjob=?,busize=?,budevelopment=?,buintroduce=?,butype=?," +
					" buphone=?, bulable=?,bupicture=?,  orname=?,orjob=?,orweibo=?,orintroduce=?," +
					" prPicture=?,prName=?,prAddress=?,printroduce=?,buxintroduce=?," +
					"  where buid=?";
			Object objects[]={
					b.getBuLoginName(),
					b.getBuPwd(),
					b.getBuEmail(),
					b.getBuName(),
					b.getBujName(),
					b.getBuLogo(),
					b.getBuHomePage(),
					b.getBuCity(),
					b.getBuBigJob(),
					b.getBuSize(),
					b.getBuDevelopment(),
					b.getBuIntroduce(),
					b.getBuType(),
					b.getBuPhone(),
					b.getBuLable(),
					b.getBuPicture(),
					b.getOrName(),
					b.getOrJob(),
					b.getOrWeibo(),
					b.getOrIntroduce(),
					b.getPrPicture(),
					b.getPrName(),
					b.getPrAddress(),
					b.getPrIntroduce(),
					b.getBuxIntroduce(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);

			return n;
		}
		
		//1.修改公司简称和一句话介绍公司 把id传进去
		public int updateBusinessInfo01(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set bujname=?,buintroduce=? where buid=?";
			Object objects[]={
					b.getBujName(),
					b.getBuIntroduce(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);

			return n;
		}
		
		//2.修改公司logo 把id传进去
		public int updateBusinessInfo02(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set bulogo=? where buid=?";
			Object objects[]={
					b.getBuLogo(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);
			return n;
		}
		
		//3.修改公司产品信息 把id传进去
		public int updateBusinessInfo03(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set prPicture=?,prName=?,prAddress=?,printroduce=?  where buid=?";
			Object objects[]={
					b.getPrPicture(),
					b.getPrName(),
					b.getPrAddress(),
					b.getPrIntroduce(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);
			return n;
		}
		
		//4.修改公司详细介绍
		public int updateBusinessInfo04(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set buxintroduce=? where buid=?";
			Object objects[]={
					b.getBuxIntroduce(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);
			return n;
		}
		
		//5.修改公司城市，电话，类型，领域，阶段，规模，主页
		public int updateBusinessInfo05(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set bucity=?,buphone=?,butype=?,bubigjob=?,budevelopment=?,busize=?,buhomepage=? where buid=?";
			Object objects[]={
					b.getBuCity(),
					b.getBuPhone(),
					b.getBuType(),
					b.getBuBigJob(),
					b.getBuDevelopment(),
					b.getBuSize(),
					b.getBuHomePage(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);
			return n;
		}

		//6.修改公司创始人，创始人职位，创始人微博，创始人简介
		public int updateBusinessInfo06(BusinessInfo b) {
			int n=0;
			String sql="update businessInfo set orname=?,orjob=?,orweibo=?,orintroduce=? where buid=?";
			Object objects[]={
					b.getOrName(),
					b.getOrJob(),
					b.getOrWeibo(),
					b.getOrIntroduce(),
					b.getBuId()
			};
			n=this.executeUpdate(sql, objects);
			return n;
		}

		public int getCountBusinessInfo(String bucity, String budevelopment,String bubigjob) {
			int n=-1;
			String sql="SELECT count(*)"
					+" FROM businessInfo INNER JOIN BusinessRecruit"
					+" ON businessInfo.buid=BusinessRecruit.brbuid"
					+" where 1=1";		
			if(bucity!=null){
				//不是全部
				sql+=" and bucity LIKE'%"+bucity+"%'";
			}
			if(budevelopment!=null){
				//不是全部
				sql+=" and budevelopment LIKE'%"+budevelopment+"%'";
			}
			if(bubigjob!=null){
				//不是全部
				sql+=" and bubigjob LIKE'%"+bubigjob+"%'";
			}

			//执行查询
			this.rs=this.executeQuery(sql);
			try {
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

		public List<BusinessInfo> getBusinessInfoByPage(String bucity,String budevelopment, String bubigjob, Integer from,Integer pageSize) {
			List<BusinessInfo> list=new ArrayList<BusinessInfo>();
			String sql="SELECT *"
					+" FROM businessInfo INNER JOIN BusinessRecruit"
					+" ON businessInfo.buid=BusinessRecruit.brbuid"
					+" where 1=1";	
			if(bucity!=null){
				//不是全部
				sql+=" and bucity LIKE'%"+bucity+"%'";
			}
			if(budevelopment!=null){
				//不是全部
				sql+=" and budevelopment LIKE'%"+budevelopment+"%'";
			}
			if(bubigjob!=null){
				//不是全部
				sql+=" and bubigjob LIKE'%"+bubigjob+"%'";
			}
			sql+=" limit ?,?";
			//调用查询
			try {
				this.rs=this.executeQuery(sql,from,pageSize);
				while(rs.next()){
					BusinessInfo bi=new BusinessInfo();
					bi.setBuId(rs.getInt("buid"));
					bi.setBuLoginName(rs.getString("buloginname"));
					bi.setBuPwd(rs.getString("bupwd"));
					bi.setBuEmail(rs.getString("buemail"));
					
					bi.setBuName(rs.getString("buname"));
					bi.setBujName(rs.getString("bujname"));
					bi.setBuLogo(rs.getString("bulogo"));
					bi.setBuHomePage(rs.getString("buhomepage"));
					bi.setBuCity(rs.getString("bucity"));
					bi.setBuBigJob(rs.getString("bubigjob"));
					bi.setBuSize(rs.getString("busize"));
					bi.setBuDevelopment(rs.getString("budevelopment"));
					bi.setBuIntroduce(rs.getString("buintroduce"));
					bi.setBuType(rs.getString("butype"));
					bi.setBuPhone(rs.getString("buphone"));
					bi.setBuLable(rs.getString("bulable"));
					bi.setBuPicture(rs.getString("bupicture"));
					
					bi.setOrName(rs.getString("orname"));
					bi.setOrJob(rs.getString("orjob"));
					bi.setOrWeibo(rs.getString("orweibo"));
					bi.setOrIntroduce(rs.getString("orintroduce"));
					
					bi.setPrPicture(rs.getString("prPicture"));
					bi.setPrName(rs.getString("prName"));
					bi.setPrAddress(rs.getString("prAddress"));
					bi.setPrIntroduce(rs.getString("printroduce"));
					
					bi.setBuIntroduce(rs.getString("buxintroduce"));
					
					//职位信息
					BusinessRecruit br=new BusinessRecruit();
					
					int brid=rs.getInt("brid");
					br.setBrId(brid);
					bi.setRecruit(br);
					
					String brjob=rs.getString("brjob");
					br.setBrJob(brjob);
					bi.setRecruit(br);
					
					String brnature=rs.getString("brnature");
					br.setBrNature(brnature);
					bi.setRecruit(br);
					
					String brmoney=rs.getString("brmoney");
					br.setBrMoney(brmoney);
					bi.setRecruit(br);
					
					String brcity=rs.getString("brcity");
					br.setBrCity(brcity);
					bi.setRecruit(br);
					
					String brexperience=rs.getString("brexperience");
					br.setBrExperience(brexperience);
					bi.setRecruit(br);
					
					String breducation=rs.getString("breducation");
					br.setBrEducation(breducation);
					bi.setRecruit(br);
					
					String brlikejob=rs.getString("brlikejob");
					br.setBrLikeJob(brlikejob);
					bi.setRecruit(br);
					
					String brjobdescribe=rs.getString("brjobdescribe");
					br.setBrJobDescribe(brjobdescribe);
					bi.setRecruit(br);
					
					String braddress=rs.getString("braddress");
					br.setBrAddress(braddress);
					bi.setRecruit(br);
					
					String bremail=rs.getString("bremail");
					br.setBrEmail(bremail);
					bi.setRecruit(br);
					
					String brtime=rs.getString("brtime");
					br.setBrTime(brtime);
					bi.setRecruit(br);
					
					int brbuid=rs.getInt("brbuid");
					br.setBrBuId(brbuid);
					bi.setRecruit(br);
					
					list.add(bi);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				this.close(con, ps, rs);
			}
			return list;
		}
		
		
		//根据公司id查询公司所有信息(包括职位信息)
			public BusinessInfo getAllById(Integer brid) {
				BusinessInfo bi=null;
				String sql="SELECT * FROM businessInfo INNER JOIN BusinessRecruit ON businessInfo.buid=BusinessRecruit.brbuid" 
							+" WHERE brid=?";
				try {
					this.rs=this.executeQuery(sql,brid);
					while(rs.next()){
						bi=new BusinessInfo();
						bi.setBuId(rs.getInt("buid"));
						bi.setBuLoginName(rs.getString("buloginname"));
						bi.setBuPwd(rs.getString("bupwd"));
						bi.setBuEmail(rs.getString("buemail"));
						
						bi.setBuName(rs.getString("buname"));
						bi.setBujName(rs.getString("bujname"));
						bi.setBuLogo(rs.getString("bulogo"));
						bi.setBuHomePage(rs.getString("buhomepage"));
						bi.setBuCity(rs.getString("bucity"));
						bi.setBuBigJob(rs.getString("bubigjob"));
						bi.setBuSize(rs.getString("busize"));
						bi.setBuDevelopment(rs.getString("budevelopment"));
						bi.setBuIntroduce(rs.getString("buintroduce"));
						bi.setBuType(rs.getString("butype"));
						bi.setBuPhone(rs.getString("buphone"));
						bi.setBuLable(rs.getString("bulable"));
						bi.setBuPicture(rs.getString("bupicture"));
						
						bi.setOrName(rs.getString("orname"));
						bi.setOrJob(rs.getString("orjob"));
						bi.setOrWeibo(rs.getString("orweibo"));
						bi.setOrIntroduce(rs.getString("orintroduce"));
						
						bi.setPrPicture(rs.getString("prPicture"));
						bi.setPrName(rs.getString("prName"));
						bi.setPrAddress(rs.getString("prAddress"));
						bi.setPrIntroduce(rs.getString("printroduce"));
						
						bi.setBuIntroduce(rs.getString("buxintroduce"));
						
						//职位信息
						BusinessRecruit br=new BusinessRecruit();
						
						int bd=rs.getInt("brid");
						br.setBrId(bd);
						bi.setRecruit(br);
						
						String brjob=rs.getString("brjob");
						br.setBrJob(brjob);
						bi.setRecruit(br);
						
						String brnature=rs.getString("brnature");
						br.setBrNature(brnature);
						bi.setRecruit(br);
						
						String brmoney=rs.getString("brmoney");
						br.setBrMoney(brmoney);
						bi.setRecruit(br);
						
						String brcity=rs.getString("brcity");
						br.setBrCity(brcity);
						bi.setRecruit(br);
						
						String brexperience=rs.getString("brexperience");
						br.setBrExperience(brexperience);
						bi.setRecruit(br);
						
						String breducation=rs.getString("breducation");
						br.setBrEducation(breducation);
						bi.setRecruit(br);
						
						String brlikejob=rs.getString("brlikejob");
						br.setBrLikeJob(brlikejob);
						bi.setRecruit(br);
						
						String brjobdescribe=rs.getString("brjobdescribe");
						br.setBrJobDescribe(brjobdescribe);
						bi.setRecruit(br);
						
						String braddress=rs.getString("braddress");
						br.setBrAddress(braddress);
						bi.setRecruit(br);
						
						String bremail=rs.getString("bremail");
						br.setBrEmail(bremail);
						bi.setRecruit(br);
						
						String brtime=rs.getString("brtime");
						br.setBrTime(brtime);
						bi.setRecruit(br);
						
						int brbuid=rs.getInt("brbuid");
						br.setBrBuId(brbuid);
						bi.setRecruit(br);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					this.close(con, ps, rs);
				}	
				return bi;
			}
			/**
			 * 根据公司用户名查询对象(已经注册公司使用)
			 * @param 
			 * @return
			 */
			public BusinessInfo getBusinessInfoByEmail(String email) {
				BusinessInfo bi=null;
				String sql="SELECT * FROM businessInfo WHERE buemail=?";
				try {
					this.rs=this.executeQuery(sql,email);
					while(rs.next()){
						bi=new BusinessInfo();
						bi.setBuId(rs.getInt("buid"));
						bi.setBuLoginName(rs.getString("buloginname"));
						bi.setBuPwd(rs.getString("bupwd"));
						bi.setBuEmail(rs.getString("buemail"));
						
						bi.setBuName(rs.getString("buname"));
						bi.setBujName(rs.getString("bujname"));
						bi.setBuLogo(rs.getString("bulogo"));
						bi.setBuHomePage(rs.getString("buhomepage"));
						bi.setBuCity(rs.getString("bucity"));
						bi.setBuBigJob(rs.getString("bubigjob"));
						bi.setBuSize(rs.getString("busize"));
						bi.setBuDevelopment(rs.getString("budevelopment"));
						bi.setBuIntroduce(rs.getString("buintroduce"));
						bi.setBuType(rs.getString("butype"));
						bi.setBuPicture(rs.getString("bupicture"));
						bi.setBuPhone(rs.getString("buphone"));
						bi.setBuLable(rs.getString("bulable"));
						
						bi.setOrName(rs.getString("orname"));
						bi.setOrJob(rs.getString("orjob"));
						bi.setOrWeibo(rs.getString("orweibo"));
						bi.setOrIntroduce(rs.getString("orintroduce"));
						
						bi.setPrPicture(rs.getString("prPicture"));
						bi.setPrName(rs.getString("prName"));
						bi.setPrAddress(rs.getString("prAddress"));
						bi.setPrIntroduce(rs.getString("printroduce"));
						
						bi.setBuxIntroduce(rs.getString("buxintroduce"));
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					this.close(con, ps, rs);
				}	
				return bi;
			}

}
