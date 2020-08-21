package com.kgc.service;

import java.util.List;

import com.kgc.dao.BigJobInfoDao;
import com.kgc.dao.impl.BigJobInfoDaoImpl;
import com.kgc.pojo.BigJobInfo;
import com.kgc.util.PageUtil;

/**
 * 业务逻辑层
 * @author Administrator
 *
 */
public class BigJobInfoService {
	//创建行业领域职位对象
	BigJobInfoDao bDao=new BigJobInfoDaoImpl();
//	//分页
//	public PageUtil<BigJobInfo> getJobInfo(int biId,String name,int pageIndex,int pageSize){
//		//创建分页对象
//		PageUtil<BigJobInfo> page=new PageUtil<BigJobInfo>();
//		page.setPageIndex(pageIndex);
//		page.setPageSize(pageSize);
//		//总条数
//		int totalCount=bDao.getCount(name);
//		page.setTotalCount(totalCount);
//		List<BigJobInfo> list=bDao.getBigJobInfoByPage(biId,name, (pageIndex-1)*pageSize, pageSize);
//		page.setList(list);
//		return page;
//	}
	
	//查询所有行业
	public List<BigJobInfo> getAllInfo() {
		List<BigJobInfo> list=bDao.getAllInfo();
		return list;
	}
	//添加
	public int addJob(BigJobInfo job) {
		return bDao.addJob(job);
	}
	//删除
	public int del(int biId) {
		return bDao.del(biId);
	}
//	
//	
	//获取行业领域不重复
		public List<BigJobInfo> getAllJobInfo() {
			List<BigJobInfo> list=bDao.getAllJobInfo();
			return list;
		}



}
