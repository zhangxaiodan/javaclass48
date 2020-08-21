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
	//更新头像地址
	public int phonepath(UserResume resume);
	//查询头像并且显示头像
	public UserResume photopath(int uid);
	//用户设置简历默认值查询
	public UserResume is_defaultradio(Integer uid);
	//图片
	public List<BusinessInfo> getAllphoto();
}
