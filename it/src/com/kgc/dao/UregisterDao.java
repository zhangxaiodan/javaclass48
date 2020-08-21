package com.kgc.dao;

/**
 *  普通用户数据访问层
 * @author Administrator
 *
 */
public interface UregisterDao {
  //普通用户注册
  public int Uregist(String email,String pwd);
  //普通用户验证用户名是否已注册
  public int Ucheck(String email);
}

