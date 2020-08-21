package com.kgc.service;

import java.util.List;

import com.kgc.dao.JobInfoDao;
import com.kgc.dao.impl.JobInfoDaoImpl;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.JobInfo;
import com.kgc.util.PageUtil;

public class JobInfoService {
	JobInfoDao jDao=new JobInfoDaoImpl();
	//分页
	public PageUtil<BigJobInfo> getJobInfo(Integer id,String name,int pageIndex,int pageSize){
		//创建分页对象
		PageUtil<BigJobInfo> page=new PageUtil<BigJobInfo>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		//总条数
		int totalCount=jDao.getCount(id, name);
		page.setTotalCount(totalCount);
		List<BigJobInfo> list=jDao.getJobInfoByPage(id,name, (pageIndex-1)*pageSize, pageSize);
		page.setList(list);
		return page;
	}
	//添加
		public int addJob(JobInfo ji) {
			return jDao.addJob(ji);
		}
	
}
