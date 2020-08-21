package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.JobInfo;

/**
 * 职位接口
 * @author Administrator
 *
 */
public interface JobInfoDao {
	//查询所有的职位
	public List<JobInfo> getAllJob();
	
	//添加
	public int addJob(JobInfo ji);
	//删除
	public int delJob(int id);
	//分页、 条数
	public int getCount(int id,String name);
	//当前页集合
	public List<BigJobInfo> getJobInfoByPage(int id,String name,int from,int pageSize);
}
