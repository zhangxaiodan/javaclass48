package com.kgc.dao;

import java.util.List;


import com.kgc.pojo.BusinessInfo;


public interface ShowJobDao {
	//��ȡ������Ƹ��
	  public List<BusinessInfo> showAllJob();
	  //��ȡ��Ƹ����ݹ�˾
	  public List<BusinessInfo> getJobByB(String bname);
	  //��ȡ��Ƹ�����ְλ
	  public List<BusinessInfo> getJobByJ(String jname);
	  //��ȡ��Ƹ�����н��
	  public List<BusinessInfo> getJobByP(String pname);
	  //��ȡ��Ƹ����ݳ���
	  public List<BusinessInfo> getJobByC(String cname);
	  //��ȡ��Ƹ�����ѧ��
	  public List<BusinessInfo> getJobByS(String sname);
	  //��ȡ��Ƹ����ݾ���
	  public List<BusinessInfo> getJobByE(String ename);
	  //��ȡ��Ƹ����ݶ����
	  public List<BusinessInfo> getJobBy(String b,String j,String p,String c,String s,String e,String x);
}