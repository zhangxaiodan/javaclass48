package com.kgc.dao.impl;

import com.kgc.dao.UinfoDao;
import com.kgc.pojo.UserInfo;
//修改个人信息
public class UinfoDaoImpl extends BaseDao implements UinfoDao{
	public int Uinfo(UserInfo userinfo){
		int n=-1;
		String sql="UPDATE userInfo SET uiname=?,uisex=?,uibirthday=?,uiphone=?,uiaddress=? WHERE uiemail=?";
		Object [] objs={userinfo.getUiName(),userinfo.getUiSex(),userinfo.getUiBirthday(),userinfo.getUiPhone(),userinfo.getUiAddress(),userinfo.getUiEmail()};		
		//调用增删改
		n=this.executeUpdate(sql, objs);
		return n;	//如果n>0,更新成功
	}
}
