package com.kgc.service;

import java.util.List;

import com.kgc.dao.BusinessRecruitDao;
import com.kgc.dao.impl.BusinessRecruitDaoImpl;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessRecruit1;
import com.kgc.util.PageUtil;

/**
 * 公司职位业务逻辑层
 * @author Administrator
 *
 */
public class BusinessRecruitService {
	//调用公司职位数据访问层
	BusinessRecruitDao dao=new BusinessRecruitDaoImpl();
	public int addBusinessRecruit(BusinessRecruit b) {
			int n=dao.addBusinessRecruit(b);
			if(n>0){
				return 1;
			}
			else{
				return -1;
			}
	}
	
	
	public List<BusinessRecruit> getAllBusinessRecruit(Integer brbuid) {
			//调用数据访问层
			return dao.getAllBusinessRecruit(brbuid);

	}
	
	//根据公司职位id查询对象
	public BusinessRecruit getBusinessRecruitById(Integer brid) {
		return dao.getBusinessRecruitById(brid);
	}
	
	//删除职位
	public int delBusinessRecruit(Integer id) {
		//调用删除的方法
		int n=dao.delBusinessRecruit(id);
		return n;
	}
	
	//
	public PageUtil<BusinessRecruit1> getAlljobs(Integer pageIndex,Integer pageSize){
		PageUtil<BusinessRecruit1> page=new PageUtil<BusinessRecruit1>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		
		//调用数量
		int totalCount=dao.getCountBrt();
		page.setTotalCount(totalCount);
		//
		List<BusinessRecruit1> list=dao.getAlljobs((pageIndex-1)*pageSize, pageSize);
		page.setList(list);
		//返回page类
		return page;
	}
	
	
	
}
