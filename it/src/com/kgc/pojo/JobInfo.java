package com.kgc.pojo;
/**
 * ְλ
 * @author Administrator
 *
 */
public class JobInfo {
	private int jiId;//ְλ���
	private String jiJob;//ְλ����
	private int biId;//��ҵ����
	private BigJobInfo bj=new BigJobInfo();//��ҵ�������
	
	
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
