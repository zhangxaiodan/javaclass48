package com.kgc.service;

import java.util.List;

import com.kgc.dao.LikeInfoDao;
import com.kgc.dao.impl.LikeInfoimpl;
import com.kgc.pojo.LikeInfo;
import com.kgc.util.PageUtil;

public class LikeInfoService {
	private LikeInfoDao lif=new LikeInfoimpl();
	
	//添加订阅
	public int addLikeInfo(LikeInfo info) {
		
		return lif.addLikeInfo(info);
	}
	
   //删除订阅
   public int delsubscribe(Integer id) {
	  return lif.delsubscribe(id) ;
   }
   
 
 //查询所有的订阅
 	public PageUtil<LikeInfo> getAllLikeInfo(Integer pageIndex,Integer pageSize) {
 		PageUtil<LikeInfo> page=new PageUtil<LikeInfo>();
 		page.setPageIndex(pageIndex);
 		page.setPageSize(pageSize);
 		//获取数量
 		int totalCount=lif.getcountbyLikeInfo();
 		page.setTotalCount(totalCount);
 		//获取
 		List<LikeInfo> list=lif.getAllLikeInfo((pageIndex-1)*pageSize, pageSize);
 		page.setList(list);
 		return page;
 	}
}
