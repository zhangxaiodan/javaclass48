package com.kgc.service;

import java.util.List;

import com.kgc.dao.ShowJobDao;
import com.kgc.dao.impl.ShowJobDaoImpl;
import com.kgc.pojo.BusinessInfo;


public class ShowJobService {
	private ShowJobDao sd=new ShowJobDaoImpl();
	 //显示所有招聘信息
	 public List<BusinessInfo> showAllJob(){	 
		 //调用数据访问层	 
		 return sd.showAllJob();	 
	 }
	 //获取招聘表根据公司
	 public List<BusinessInfo> getJobByB(String bname){		 
		 return sd.getJobByB(bname);	 
	 }
	 //获取招聘表根据职位
	 public List<BusinessInfo> getJobByJ(String jname){		 
		return sd.getJobByJ(jname);	 
	 }
	 //获取招聘表根据薪资
	 public List<BusinessInfo> getJobByP(String pname){
		 return sd.getJobByP(pname);
	 }
	 //获取招聘表根据城市
	 public List<BusinessInfo> getJobByC(String cname) {
		 return sd.getJobByC(cname);
	 }
	 //获取招聘表根据学历
	 public List<BusinessInfo> getJobByS(String sname) {
		 return sd.getJobByS(sname);
	 }
	 //获取招聘表根据经验
	 public List<BusinessInfo> getJobByE(String ename) {
		 return sd.getJobByE(ename);
	 }
	 //获取招聘表根据多参数
	 public List<BusinessInfo> getJobBy(String b,String j,String p,String c,String s,String e,String x){
		 return sd.getJobBy(b, j, p, c, s, e,x);	 	 
	 }
}
