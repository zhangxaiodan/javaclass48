package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessResume;


/**
 * ��˾�������ݷ��ʲ�ӿ�
 * @author Administrator
 *
 */
public interface BusinessResumeDao {
	//��ѯ�յ��ļ���
	public List<BusinessResume> getAllBusinessResume(Integer burBuid);
	
	//����ID��ȡ��������
	public BusinessResume getBusinessResumeById(Integer burid);
	
	//Ͷ�ݸ��˼�������Ϣ
	public int addBusinessResume(BusinessResume brs);
	//����id��ѯͶ����Ϣ
	public BusinessResume exeuqueryBusiResume(Integer id);
	//Ͷ�ݸ�������
	public int addBresumePath (BusinessResume resume);
	
}
