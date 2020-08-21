package com.kgc.service;

import com.kgc.dao.UserResumeDao;
import com.kgc.dao.impl.UserResumeimpl;
import com.kgc.pojo.UserResume;

public class UserResuService {
	//创建对象
	UserResumeDao urd=new UserResumeimpl();
			
	//添加所有列
	public int addUserResume(UserResume resume){
			
		return urd.addUserResume(resume);
			
		}
			
	//根据id查询数量，就可以看出有没有这个简历
	public int getCountById(Integer id){
				
			return urd.getCountById(id);
		}
			
	//根据id查询，简历表 getuserresume
	public UserResume getuserresume(Integer id) {
				
			return urd.getuserresume(id);
		}
			
	//添加期望工作
	public int updateexceptjob(UserResume resume) {
				
			return urd.updateexceptjob(resume);
		}
	//添加工作经历
	public int updatejingli(UserResume resume){
			
	return urd.updatejingli(resume);
	}	
			
	//更新工作项目经验
	public int updateproject(UserResume resume) {
				
			return urd.updateproject(resume);
		}
	//更新教育背景
	public int updateedu(UserResume resume){
				
			return urd.updateedu(resume);
		}
			
	//更新自我描述
	public int updateintroduce(UserResume resume) {
				
			return urd.updateintroduce(resume);
		}
			
	//更新作品展示
	public int updateshow(UserResume resume) {
			return urd.updateshow(resume);
		}
			
	//修改名字
	public int updatename(UserResume resume) {
				
			  return urd.updatename(resume);
		}
	//上传文件
	public int addjlpath(UserResume resume) {
				
			return urd.addjlpath(resume);
		}
			
	//统计简历的数量
	public int countuser(){
			return urd.countuser();
		}
	//更新简历设置
	public int updateuserid(UserResume resume){
				
			return urd.updateuserid(resume);
		}
	//更新基本信息
	public int updateinfo(UserResume resume) {
			
			return urd.updateinfo(resume);
		}	
	//投递简历
	public UserResume exeuqueryUserResume(Integer id) {
		
	   return urd.exeuqueryUserResume(id);
	}
	
	//查询简历的附件地址
	public UserResume chaxunjlpath(Integer id){
		return urd.chaxunjlpath(id);
	}
	//上传头像
	public int phonepath(UserResume resume){
	  return	urd.phonepath(resume);
	}
	//查询上传的头像
	public UserResume photopath(int uid){
		return urd.photopath(uid);
	}
	//默认用户设置投递简历
	public UserResume is_defaultradio(Integer uid){
		return urd.is_defaultradio(uid);
	}
	
}
