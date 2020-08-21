package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessRecruit1;
/**
 * 公司职位数据访问层接口
 * @author Administrator
 *
 */
public interface BusinessRecruitDao {
	//添加公司招聘职位
	public int addBusinessRecruit(BusinessRecruit b);
	
	//查询添加的职位
	public List<BusinessRecruit> getAllBusinessRecruit(Integer brbuid);
	
	//根据公司id查询对象
	public BusinessRecruit getBusinessRecruitById(Integer brid);
	
	//删除职位
	public int delBusinessRecruit(Integer id);
	//企业招聘信息表,分页
    public List<BusinessRecruit1> getAlljobs(Integer from,Integer pageSize);
	//
    public int getCountBrt();
	//
    public BusinessRecruit1 getjobsinfo(int id);
	
	
	
	
}
