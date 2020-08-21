package com.kgc.pojo;
/**
 * 信息统计
 * @author Administrator
 *
 */
public class CountInfo {
	private int ciId;//信息编号
	private int maId;//管理员编号，外键
	private int biId;//企业信息编号，外键
	private int uiId;//用户信息编号，外键
	private int ciCount;//每日简历投递量
	private int ciJob;//每日订阅职位
	
	
	public int getCiId() {
		return ciId;
	}
	public void setCiId(int ciId) {
		this.ciId = ciId;
	}
	public int getMaId() {
		return maId;
	}
	public void setMaId(int maId) {
		this.maId = maId;
	}
	public int getBiId() {
		return biId;
	}
	public void setBiId(int biId) {
		this.biId = biId;
	}
	public int getUiId() {
		return uiId;
	}
	public void setUiId(int uiId) {
		this.uiId = uiId;
	}
	public int getCiCount() {
		return ciCount;
	}
	public void setCiCount(int ciCount) {
		this.ciCount = ciCount;
	}
	public int getCiJob() {
		return ciJob;
	}
	public void setCiJob(int ciJob) {
		this.ciJob = ciJob;
	}
	
	

}
