package com.kgc.dao;

import java.util.List;

import com.kgc.pojo.BusinessInfo;
import com.kgc.pojo.BusinessResume;
import com.kgc.pojo.UserResume;

public interface UserResumeDao {
	//
	public int addUserResume(UserResume resume);
	//
	public int getCountById(Integer id);
	//
	public UserResume getuserresume(Integer id);
	//
	public int updateexceptjob(UserResume resume);
	
	public int updatejingli(UserResume resume);
	//
	public int updateproject(UserResume resume);
	//
	public int updateedu(UserResume resume);
	//
	public int updateintroduce(UserResume resume);
	//
	public int updateshow(UserResume resume);
	//
	public int updatename(UserResume resume);
	//
	public int addjlpath(UserResume resume);
	//
	public int countuser();
	//
	public int updateuserid(UserResume resume);
	//
	public int updateinfo(UserResume resume);
	//
	public UserResume exeuqueryUserResume(Integer id);
	//
	public UserResume chaxunjlpath(Integer id);
	//����ͷ���ַ
	public int phonepath(UserResume resume);
	//��ѯͷ������ʾͷ��
	public UserResume photopath(int uid);
	//�û����ü���Ĭ��ֵ��ѯ
	public UserResume is_defaultradio(Integer uid);
	//ͼƬ
	public List<BusinessInfo> getAllphoto();
}
