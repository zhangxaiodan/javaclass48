package com.kgc.service;

import com.kgc.util.EmailUtil;

public class EmailService {
	public void email(String eemail,String title,String content) throws Exception{
		EmailUtil.content=content;
		EmailUtil.title=title;
		EmailUtil.receiveMailAccount=eemail;
		EmailUtil util=new EmailUtil();
			util.get();
	}
}
