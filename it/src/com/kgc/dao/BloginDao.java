package com.kgc.dao;

import com.kgc.pojo.BusinessInfo;

/**
 *  ��ҵ�û����ݷ��ʲ�
 * @author Administrator
 *
 */
public interface BloginDao {
	//��ҵ��¼
	public BusinessInfo Blogin (String email,String pwd);
}
