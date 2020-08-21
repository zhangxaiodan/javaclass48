package com.kgc.pojo;
/**
 * 招聘状态
 * @author Administrator
 *
 */
public class StateResume {
	private int srId;//申请编号
	private int biId;//企业信息编号 外键
	private int uiId;//用户信息编号 外键
	private String srTime;//申请简历时间
	private String srState;//申请状态
	private String srResult;//申请结果
	private String srJob;//申请职位
	private String srRemark;//申请备注
	public int getSrId() {
		return srId;
	}
	public void setSrId(int srId) {
		this.srId = srId;
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
	public String getSrTime() {
		return srTime;
	}
	public void setSrTime(String srTime) {
		this.srTime = srTime;
	}
	public String getSrState() {
		return srState;
	}
	public void setSrState(String srState) {
		this.srState = srState;
	}
	public String getSrResult() {
		return srResult;
	}
	public void setSrResult(String srResult) {
		this.srResult = srResult;
	}
	public String getSrJob() {
		return srJob;
	}
	public void setSrJob(String srJob) {
		this.srJob = srJob;
	}
	public String getSrRemark() {
		return srRemark;
	}
	public void setSrRemark(String srRemark) {
		this.srRemark = srRemark;
	}
	

}
