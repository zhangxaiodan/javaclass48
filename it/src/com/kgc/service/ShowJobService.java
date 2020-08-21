package com.kgc.service;

import java.util.List;

import com.kgc.dao.ShowJobDao;
import com.kgc.dao.impl.ShowJobDaoImpl;
import com.kgc.pojo.BusinessInfo;


public class ShowJobService {
	private ShowJobDao sd=new ShowJobDaoImpl();
	 //��ʾ������Ƹ��Ϣ
	 public List<BusinessInfo> showAllJob(){	 
		 //�������ݷ��ʲ�	 
		 return sd.showAllJob();	 
	 }
	 //��ȡ��Ƹ����ݹ�˾
	 public List<BusinessInfo> getJobByB(String bname){		 
		 return sd.getJobByB(bname);	 
	 }
	 //��ȡ��Ƹ�����ְλ
	 public List<BusinessInfo> getJobByJ(String jname){		 
		return sd.getJobByJ(jname);	 
	 }
	 //��ȡ��Ƹ�����н��
	 public List<BusinessInfo> getJobByP(String pname){
		 return sd.getJobByP(pname);
	 }
	 //��ȡ��Ƹ����ݳ���
	 public List<BusinessInfo> getJobByC(String cname) {
		 return sd.getJobByC(cname);
	 }
	 //��ȡ��Ƹ�����ѧ��
	 public List<BusinessInfo> getJobByS(String sname) {
		 return sd.getJobByS(sname);
	 }
	 //��ȡ��Ƹ����ݾ���
	 public List<BusinessInfo> getJobByE(String ename) {
		 return sd.getJobByE(ename);
	 }
	 //��ȡ��Ƹ����ݶ����
	 public List<BusinessInfo> getJobBy(String b,String j,String p,String c,String s,String e,String x){
		 return sd.getJobBy(b, j, p, c, s, e,x);	 	 
	 }
}
