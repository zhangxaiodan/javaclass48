package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BigJobInfo;

/**
 * 职位数据访问层接口
 * @author Administrator
 *
 */
public interface BigJobInfoDao {
	public List<BigJobInfo> getAllJobInfo();
	//查询所有行业领域
	public List<BigJobInfo> getAllInfo();
	//添加
	public int addJob(BigJobInfo job);
	//删除
	public int del(int biId);
	//
	//分页、 条数
	//public int getCount(String name);
			
	//当前页集合
	//public List<BigJobInfo> getBigJobInfoByPage(int biId,String name,int from,int pageSize);
}
