package com.kgc.pojo;

public class projectexperience {
    //项目经验
	private int pid;//项目经验编号
	private int urid;//简历外键编号
	private String projectname;//项目名字
	private String theposter;//产品负责人
	private String projectstarttime;//开始时间
	private String projectendtime;//结束时间
	private String projectdescription;//项目描述
    //封装
	public int getPid() {
		return pid;
	}
	public int getUrid() {
		return urid;
	}
	public String getProjectname() {
		return projectname;
	}
	public String getTheposter() {
		return theposter;
	}
	public String getProjectstarttime() {
		return projectstarttime;
	}
	public String getProjectendtime() {
		return projectendtime;
	}
	public String getProjectdescription() {
		return projectdescription;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setUrid(int urid) {
		this.urid = urid;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public void setTheposter(String theposter) {
		this.theposter = theposter;
	}
	public void setProjectstarttime(String projectstarttime) {
		this.projectstarttime = projectstarttime;
	}
	public void setProjectendtime(String projectendtime) {
		this.projectendtime = projectendtime;
	}
	public void setProjectdescription(String projectdescription) {
		this.projectdescription = projectdescription;
	}
}