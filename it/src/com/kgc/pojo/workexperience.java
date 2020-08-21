package com.kgc.pojo;

public class workexperience {
    //工作经历表
	private int wid;//工作经历编号
	private int urid;//简历外键编号
	private String company;//公司名称
	private String jobname;//职位名称
	private String starttime ;//开始时间 
	private String overtime;//结束时间 
	public int getWid() {
		return wid;
	}
	public int getUrid() {
		return urid;
	}
	public String getCompany() {
		return company;
	}
	public String getJobname() {
		return jobname;
	}
	public String getStarttime() {
		return starttime;
	}
	public String getOvertime() {
		return overtime;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public void setUrid(int urid) {
		this.urid = urid;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public void setOvertime(String overtime) {
		this.overtime = overtime;
	}
}
