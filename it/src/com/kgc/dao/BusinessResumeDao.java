package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessRecruit;
import com.kgc.pojo.BusinessResume;


/**
 * 公司简历数据访问层接口
 * @author Administrator
 *
 */
public interface BusinessResumeDao {
	//查询收到的简历
	public List<BusinessResume> getAllBusinessResume(Integer burBuid);
	
	//根据ID获取简历对象
	public BusinessResume getBusinessResumeById(Integer burid);
	
	//投递个人简历的信息
	public int addBusinessResume(BusinessResume brs);
	//根据id查询投递信息
	public BusinessResume exeuqueryBusiResume(Integer id);
	//投递附件简历
	public int addBresumePath (BusinessResume resume);
	
}
