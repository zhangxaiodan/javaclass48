package com.kgc.service;

import java.util.List;

import com.kgc.dao.BusinessRecruitDao;
import com.kgc.dao.impl.BusinessRecruitDaoImpl;
import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessRecruit1;
import com.kgc.util.PageUtil;

/**
 * ��˾ְλҵ���߼���
 * @author Administrator
 *
 */
public class BusinessRecruitService {
	//���ù�˾ְλ���ݷ��ʲ�
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
			//�������ݷ��ʲ�
			return dao.getAllBusinessRecruit(brbuid);

	}
	
	//���ݹ�˾ְλid��ѯ����
	public BusinessRecruit getBusinessRecruitById(Integer brid) {
		return dao.getBusinessRecruitById(brid);
	}
	
	//ɾ��ְλ
	public int delBusinessRecruit(Integer id) {
		//����ɾ���ķ���
		int n=dao.delBusinessRecruit(id);
		return n;
	}
	
	//
	public PageUtil<BusinessRecruit1> getAlljobs(Integer pageIndex,Integer pageSize){
		PageUtil<BusinessRecruit1> page=new PageUtil<BusinessRecruit1>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		
		//��������
		int totalCount=dao.getCountBrt();
		page.setTotalCount(totalCount);
		//
		List<BusinessRecruit1> list=dao.getAlljobs((pageIndex-1)*pageSize, pageSize);
		page.setList(list);
		//����page��
		return page;
	}
	
	
	
}
