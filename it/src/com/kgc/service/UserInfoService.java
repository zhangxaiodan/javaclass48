package com.kgc.service;

import java.util.List;

import com.kgc.dao.UserInfoDao;
import com.kgc.dao.impl.UserInfoDaoImpl;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.UserInfo;
import com.kgc.util.PageUtil;

/**
 * 注册信息的业务逻辑层
 * @author Administrator
 *
 */
public class UserInfoService {
	//创建数据访问层对象
	UserInfoDao uDao=new UserInfoDaoImpl();
	//查询所有的注册信息
	public List<UserInfo> getAllUser() {
		List<UserInfo> list=uDao.getAllUser();
		return list;
	}
	//分页
	public PageUtil<UserInfo> getUserByPage(String name, int uiId, int pageIndex,
				int pageSize) {
		//创建分页对象
		PageUtil<UserInfo> page=new PageUtil<UserInfo>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		//总条数
		int totalCount=uDao.getCount(name, uiId);
		page.setTotalCount(totalCount);
		List<UserInfo> list=uDao.getUserByPage(name, uiId, (pageIndex-1)*pageSize, pageSize);
		page.setList(list);
		return page;
		}
	
	//删除
	public int del(Integer biid) {
		int n=uDao.del(biid);
		return n;
		}
	//查询用户的登录账号和密码
		public UserInfo login(String uiloginname, String uipwd){
			
			UserInfo u=uDao.getLoginAndPwd(uiloginname, uipwd);
			
			return u;
	    }
		
		//根据id查询
		public UserInfo getJlid(Integer id) {
			
			return uDao.getJlid(id);
		}
}
