package com.kgc.service;

import java.util.List;

import com.kgc.dao.BusinessResumeDao;
import com.kgc.dao.impl.BusinessResumeDaoImpl;
import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessResume;

/**
 * 公司职位业务逻辑层
 * @author Administrator
 *
 */
public class BusinessResumeService {
	BusinessResumeDao dao=new BusinessResumeDaoImpl();
	public List<BusinessResume> getAllBusinessResume(Integer burBuid) {
		//调用数据访问层
		return dao.getAllBusinessResume(burBuid);
	}
	
		
		public BusinessResume getBusinessResumeById(Integer burid) {
			return dao.getBusinessResumeById(burid);
		}
		
		public int addBusinessResume(BusinessResume brs){
			return dao.addBusinessResume(brs);
		}
		//查看投递简历信息
		public BusinessResume exeuqueryBusiResume(Integer id){
			
			return dao.exeuqueryBusiResume(id);
		}
		//投递简历附件
		public int addBresumePath(BusinessResume resume){
			
			return dao.addBresumePath(resume);
		}
	
}
