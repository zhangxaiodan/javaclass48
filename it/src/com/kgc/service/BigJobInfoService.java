package com.kgc.service;

import java.util.List;

import com.kgc.dao.BigJobInfoDao;
import com.kgc.dao.impl.BigJobInfoDaoImpl;
import com.kgc.pojo.BigJobInfo;
import com.kgc.util.PageUtil;

/**
 * ҵ���߼���
 * @author Administrator
 *
 */
public class BigJobInfoService {
	//������ҵ����ְλ����
	BigJobInfoDao bDao=new BigJobInfoDaoImpl();
//	//��ҳ
//	public PageUtil<BigJobInfo> getJobInfo(int biId,String name,int pageIndex,int pageSize){
//		//������ҳ����
//		PageUtil<BigJobInfo> page=new PageUtil<BigJobInfo>();
//		page.setPageIndex(pageIndex);
//		page.setPageSize(pageSize);
//		//������
//		int totalCount=bDao.getCount(name);
//		page.setTotalCount(totalCount);
//		List<BigJobInfo> list=bDao.getBigJobInfoByPage(biId,name, (pageIndex-1)*pageSize, pageSize);
//		page.setList(list);
//		return page;
//	}
	
	//��ѯ������ҵ
	public List<BigJobInfo> getAllInfo() {
		List<BigJobInfo> list=bDao.getAllInfo();
		return list;
	}
	//���
	public int addJob(BigJobInfo job) {
		return bDao.addJob(job);
	}
	//ɾ��
	public int del(int biId) {
		return bDao.del(biId);
	}
//	
//	
	//��ȡ��ҵ�����ظ�
		public List<BigJobInfo> getAllJobInfo() {
			List<BigJobInfo> list=bDao.getAllJobInfo();
			return list;
		}



}
