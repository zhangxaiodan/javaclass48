package com.kgc.service;

import com.kgc.dao.UinfoDao;
import com.kgc.dao.impl.UinfoDaoImpl;
import com.kgc.pojo.UserInfo;

public class UinfoService {
	 public int Uinfo(UserInfo ui){
		  int n=0;
		  UinfoDao ud=new UinfoDaoImpl(); 
		  n=ud.Uinfo(ui);
		  return n;//���n>0���޸ĳɹ�
	  }
}
