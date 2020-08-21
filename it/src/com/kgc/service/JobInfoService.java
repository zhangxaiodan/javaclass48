package com.kgc.service;

import java.util.List;

import com.kgc.dao.JobInfoDao;
import com.kgc.dao.impl.JobInfoDaoImpl;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.JobInfo;
import com.kgc.util.PageUtil;

public class JobInfoService {
	JobInfoDao jDao=new JobInfoDaoImpl();
	//��ҳ
	public PageUtil<BigJobInfo> getJobInfo(Integer id,String name,int pageIndex,int pageSize){
		//������ҳ����
		PageUtil<BigJobInfo> page=new PageUtil<BigJobInfo>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		//������
		int totalCount=jDao.getCount(id, name);
		page.setTotalCount(totalCount);
		List<BigJobInfo> list=jDao.getJobInfoByPage(id,name, (pageIndex-1)*pageSize, pageSize);
		page.setList(list);
		return page;
	}
	//���
		public int addJob(JobInfo ji) {
			return jDao.addJob(ji);
		}
	
}
