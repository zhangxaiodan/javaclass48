package com.kgc.dao;

import com.kgc.pojo.BusinessInfo;

/**
 *  企业用户数据访问层
 * @author Administrator
 *
 */
public interface BloginDao {
	//企业登录
	public BusinessInfo Blogin (String email,String pwd);
}
