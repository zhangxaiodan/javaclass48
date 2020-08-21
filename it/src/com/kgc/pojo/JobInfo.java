package com.kgc.pojo;
/**
 * 职位
 * @author Administrator
 *
 */
public class JobInfo {
	private int jiId;//职位编号
	private String jiJob;//职位名称
	private int biId;//行业领域
	private BigJobInfo bj=new BigJobInfo();//行业领域对象
	
	
	public int getBiId() {
		return biId;
	}
	public void setBiId(int biId) {
		this.biId = biId;
	}
	public int getJiId() {
		return jiId;
	}
	public void setJiId(int jiId) {
		this.jiId = jiId;
	}
	public String getJiJob() {
		return jiJob;
	}
	public void setJiJob(String jiJob) {
		this.jiJob = jiJob;
	}
	public BigJobInfo getBj() {
		return bj;
	}
	public void setBj(BigJobInfo bj) {
		this.bj = bj;
	}
	
	
}
