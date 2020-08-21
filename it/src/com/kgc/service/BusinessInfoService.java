package com.kgc.service;

import java.util.List;

import com.kgc.dao.BusinessInfoDao;
import com.kgc.dao.impl.BusinessInfoDaoImpl;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.util.PageUtil;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
public class BusinessInfoService {
	BusinessInfoDao dao=new BusinessInfoDaoImpl();
	
	//查询所有的注册企业信息
	public List<BusinessInfo> getAllBusiness() {
			return dao.getAllBusiness();
		}
	
	//创建分页集合
	public PageUtil<BusinessInfo> getBusiness(String name,int buid,int pageIndex,int pageSize){
		//创建分页对象
		PageUtil<BusinessInfo> page=new PageUtil<BusinessInfo>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		int totalCount=dao.getCount(name, buid);
		page.setTotalCount(totalCount);
		List<BusinessInfo> list=dao.getBusPage(name, buid, (pageIndex-1)*pageSize, pageSize);	
		page.setList(list);
		return page;
	}
	public int addBusinessInfo(BusinessInfo b) {
		//判断是否重复
		if(dao.getBusinessInfoByBuName(b.getBuName())!=null){
			return 0;//重复
		}else{
			int n=dao.addBusinessInfo(b);
			if(n>0){
				return 1;
			}
			else{
				return -1;
			}
		}	
	}
	
	
	//根据公司全称查询对象
	public BusinessInfo getBusinessInfoByName(String name){
		return dao.getBusinessInfoByName(name);
	}
	
	//修改公司信息
	public int updateBusinessInfo(BusinessInfo b){
		
		if(dao.getBusinessInfoByBuName(b.getBuName())!=null){
			return 0;//重复
		}else{
			int n=dao.updateBusinessInfo(b);
			if(n>0){
				return 1;
			}
			else{
				return -1;
			}
		}	
	}
		
		/**
		 * 1.修改公司简称和一句话介绍公司 把id传进去
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo01(BusinessInfo b){
			int n=dao.updateBusinessInfo01(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}	
		
		/**
		 * 2.修改公司logo 把id传进去
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo02(BusinessInfo b){			
			int n=dao.updateBusinessInfo02(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}	
	
		/**
		 * 3.修改公司产品信息
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo03(BusinessInfo b){
			int n=dao.updateBusinessInfo03(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}
	
		/**
		 * 4.修改公司详细介绍
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo04(BusinessInfo b) {
			int n=dao.updateBusinessInfo04(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}
		
		/**
		 * 5.修改公司城市，电话，类型，领域，阶段，规模，主页
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo05(BusinessInfo b) {
			int n=dao.updateBusinessInfo05(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}

		/**
		 * 6.修改公司创始人，创始人职位，创始人微博，创始人简介
		 * @param b
		 * @return
		 */
		public int updateBusinessInfo06(BusinessInfo b) {
			int n=dao.updateBusinessInfo06(b);
			if(n>0){
				return 1;
			}else{
				return -1;
			}
		}
		
		
		//分页
		public PageUtil<BusinessInfo> getBusinessInfoByPage(String bucity,String budevelopment, String bubigjob, Integer pageIndex,Integer pageSize) {
			PageUtil<BusinessInfo> page=new PageUtil<BusinessInfo>();
			page.setPageIndex(pageIndex);
			page.setPageSize(pageSize);
			//总条数
			int totalCount=dao.getCountBusinessInfo(bucity, budevelopment, bubigjob);
			page.setTotalCount(totalCount);
			//当前页集合
			List<BusinessInfo> list=dao.getBusinessInfoByPage(bucity, budevelopment, bubigjob, (pageIndex-1)*pageSize, pageSize);
			page.setList(list);
			return page;
		}
		
		
		
		//根据公司id查询公司所有信息(包括职位信息)
		public BusinessInfo getAllById(Integer brid) {
			return dao.getAllById(brid);
		}
		
		
		
		public int getBusinessInfoByBuName(String name) {
			//判断是否重复
			if(dao.getBusinessInfoByBuName(name)!=null){
				return -1;//重复
			}else{
				return 1;
			}	
		}


		
		/*public static void main(String[] args) {
			String name="腾讯股份有限公司";
			if(dao.getBusinessInfoByBuName(name)!=null){
				System.out.println("重复");
			}else{
				System.out.println("不重复");;
			}
			
			
		}*/
		/**
		 * 根据公司用户名查询对象(已经注册公司使用)
		 * @param 
		 * @return
		 */
		public BusinessInfo getBusinessInfoByEmail(String email){
			return dao.getBusinessInfoByEmail(email);
		}
}
