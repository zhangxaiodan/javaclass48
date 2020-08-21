package com.kgc.service;

import java.util.List;

import com.kgc.dao.LikeInfoDao;
import com.kgc.dao.impl.LikeInfoimpl;
import com.kgc.pojo.LikeInfo;
import com.kgc.util.PageUtil;

public class LikeInfoService {
	private LikeInfoDao lif=new LikeInfoimpl();
	
	//��Ӷ���
	public int addLikeInfo(LikeInfo info) {
		
		return lif.addLikeInfo(info);
	}
	
   //ɾ������
   public int delsubscribe(Integer id) {
	  return lif.delsubscribe(id) ;
   }
   
 
 //��ѯ���еĶ���
 	public PageUtil<LikeInfo> getAllLikeInfo(Integer pageIndex,Integer pageSize) {
 		PageUtil<LikeInfo> page=new PageUtil<LikeInfo>();
 		page.setPageIndex(pageIndex);
 		page.setPageSize(pageSize);
 		//��ȡ����
 		int totalCount=lif.getcountbyLikeInfo();
 		page.setTotalCount(totalCount);
 		//��ȡ
 		List<LikeInfo> list=lif.getAllLikeInfo((pageIndex-1)*pageSize, pageSize);
 		page.setList(list);
 		return page;
 	}
}
