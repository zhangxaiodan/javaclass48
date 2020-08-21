package com.kgc.service;

import java.util.List;

import com.kgc.dao.UserInfoDao;
import com.kgc.dao.impl.UserInfoDaoImpl;
import com.kgc.pojo.BigJobInfo;
import com.kgc.pojo.UserInfo;
import com.kgc.util.PageUtil;

/**
 * ע����Ϣ��ҵ���߼���
 * @author Administrator
 *
 */
public class UserInfoService {
	//�������ݷ��ʲ����
	UserInfoDao uDao=new UserInfoDaoImpl();
	//��ѯ���е�ע����Ϣ
	public List<UserInfo> getAllUser() {
		List<UserInfo> list=uDao.getAllUser();
		return list;
	}
	//��ҳ
	public PageUtil<UserInfo> getUserByPage(String name, int uiId, int pageIndex,
				int pageSize) {
		//������ҳ����
		PageUtil<UserInfo> page=new PageUtil<UserInfo>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		//������
		int totalCount=uDao.getCount(name, uiId);
		page.setTotalCount(totalCount);
		List<UserInfo> list=uDao.getUserByPage(name, uiId, (pageIndex-1)*pageSize, pageSize);
		page.setList(list);
		return page;
		}
	
	//ɾ��
	public int del(Integer biid) {
		int n=uDao.del(biid);
		return n;
		}
	//��ѯ�û��ĵ�¼�˺ź�����
		public UserInfo login(String uiloginname, String uipwd){
			
			UserInfo u=uDao.getLoginAndPwd(uiloginname, uipwd);
			
			return u;
	    }
		
		//����id��ѯ
		public UserInfo getJlid(Integer id) {
			
			return uDao.getJlid(id);
		}
}
