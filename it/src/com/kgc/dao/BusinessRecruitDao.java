package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessRecruit1;
/**
 * ��˾ְλ���ݷ��ʲ�ӿ�
 * @author Administrator
 *
 */
public interface BusinessRecruitDao {
	//��ӹ�˾��Ƹְλ
	public int addBusinessRecruit(BusinessRecruit b);
	
	//��ѯ��ӵ�ְλ
	public List<BusinessRecruit> getAllBusinessRecruit(Integer brbuid);
	
	//���ݹ�˾id��ѯ����
	public BusinessRecruit getBusinessRecruitById(Integer brid);
	
	//ɾ��ְλ
	public int delBusinessRecruit(Integer id);
	//��ҵ��Ƹ��Ϣ��,��ҳ
    public List<BusinessRecruit1> getAlljobs(Integer from,Integer pageSize);
	//
    public int getCountBrt();
	//
    public BusinessRecruit1 getjobsinfo(int id);
	
	
	
	
}
