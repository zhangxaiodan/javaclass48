package com.kgc.service;

import java.util.List;

import com.kgc.dao.BusinessResumeDao;
import com.kgc.dao.impl.BusinessResumeDaoImpl;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessResume;

/**
 * ��˾ְλҵ���߼���
 * @author Administrator
 *
 */
public class BusinessResumeService {
	BusinessResumeDao dao=new BusinessResumeDaoImpl();
	public List<BusinessResume> getAllBusinessResume(Integer burBuid) {
		//�������ݷ��ʲ�
		return dao.getAllBusinessResume(burBuid);
	}
	
		
		public BusinessResume getBusinessResumeById(Integer burid) {
			return dao.getBusinessResumeById(burid);
		}
		
		public int addBusinessResume(BusinessResume brs){
			return dao.addBusinessResume(brs);
		}
		//�鿴Ͷ�ݼ�����Ϣ
		public BusinessResume exeuqueryBusiResume(Integer id){
			
			return dao.exeuqueryBusiResume(id);
		}
		//Ͷ�ݼ�������
		public int addBresumePath(BusinessResume resume){
			
			return dao.addBresumePath(resume);
		}
	
}
