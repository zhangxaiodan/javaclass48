package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessInfo;

/**
 * 企业注册信息数据访问层
 * @author Administrator
 *
 */
public interface BusinessInfoDao {
	//查询所有的注册信息
	public List<BusinessInfo> getAllBusiness();
	//分页获取总条数
	public int getCount(String name,Integer buid);
	//分页获取注册信息
	public List<BusinessInfo> getBusPage(String name,Integer buid,int from,int pageSize);
	//注册公司信息
	public int addBusinessInfo(BusinessInfo b);	
	//判断是否重复
	public BusinessInfo getBusinessInfoByBuName(String name);
		
	//根据公司全称查询对象
	public BusinessInfo getBusinessInfoByName(String name);
		
	//修改公司信息
	public int updateBusinessInfo(BusinessInfo b);
		
	//1.修改公司简称和一句话介绍公司 把id传进去
	public int updateBusinessInfo01(BusinessInfo b);
		
	//2.修改公司logo 把id传进去
	public int updateBusinessInfo02(BusinessInfo b);
		
	//3.修改公司产品信息
	public int updateBusinessInfo03(BusinessInfo b);
		
	//4.修改公司详细介绍
	public int updateBusinessInfo04(BusinessInfo b);
		
	//5.修改公司城市，电话，类型，领域，阶段，规模，主页
	public int updateBusinessInfo05(BusinessInfo b);

	//6.修改公司创始人，创始人职位，创始人微博，创始人简介
	public int updateBusinessInfo06(BusinessInfo b);
		
	//分页
	public int getCountBusinessInfo(String bucity,String budevelopment,String bubigjob);
		
	public List<BusinessInfo> getBusinessInfoByPage(String bucity,String budevelopment,String bubigjob,Integer from,Integer pageSize);	
	//根据公司id查询公司所有信息(包括职位信息)
	public BusinessInfo getAllById(Integer brid);
	//根据公司邮箱查询公司对象信息
	public BusinessInfo getBusinessInfoByEmail(String email);
}
