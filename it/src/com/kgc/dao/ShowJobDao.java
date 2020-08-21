package com.kgc.dao;

import java.util.List;


import com.kgc.pojo.BusinessInfo;


public interface ShowJobDao {
	//获取所有招聘表
	  public List<BusinessInfo> showAllJob();
	  //获取招聘表根据公司
	  public List<BusinessInfo> getJobByB(String bname);
	  //获取招聘表根据职位
	  public List<BusinessInfo> getJobByJ(String jname);
	  //获取招聘表根据薪资
	  public List<BusinessInfo> getJobByP(String pname);
	  //获取招聘表根据城市
	  public List<BusinessInfo> getJobByC(String cname);
	  //获取招聘表根据学历
	  public List<BusinessInfo> getJobByS(String sname);
	  //获取招聘表根据经验
	  public List<BusinessInfo> getJobByE(String ename);
	  //获取招聘表根据多参数
	  public List<BusinessInfo> getJobBy(String b,String j,String p,String c,String s,String e,String x);
}