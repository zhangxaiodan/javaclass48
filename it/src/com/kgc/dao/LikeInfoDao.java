package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.LikeInfo;

public interface LikeInfoDao {
	//我的订阅职位
		public int addLikeInfo(LikeInfo info);
		 //查询我的订阅
		public List<LikeInfo> getAllLikeInfo(Integer from,Integer pageSize);
		//删除订阅职位
		public int delsubscribe(Integer id);
		//获取订阅数量
		public int getcountbyLikeInfo();
}