package com.kgc.pojo;
/**
 * 招聘信息简历表
 * @author Administrator
 *
 */
public class BusinessRecruit {
	private Integer brId;//企业招聘信息编号
	private String brJob;//职位名称
	private String brNature;//工作性质
	private String brMoney;//月薪
	private String brCity;//工作城市
	private String brExperience;//工作经验
	private String brEducation;//学历
	private String brLikeJob;//职位诱惑
	private String brJobDescribe;//职位描述
	private String brAddress;//工作地址
	private String brEmail;//接收简历邮箱
	private String brTime;//发布时间
	private Integer brBuId;//企业信息编号 外键
//	private BigJobInfo bi=new BigJobInfo();
//	private BusinessInfo bd=new BusinessInfo();//企业信息编号 外键
//	private Collectionsjob jid=new Collectionsjob();//收藏表编号，外键
//	
//	private AreaInfo ai=new AreaInfo();
	
	
	
	
//	public AreaInfo getAi() {
//		return ai;
//	}
//	public void setAi(AreaInfo ai) {
//		this.ai = ai;
//	}
//	public BigJobInfo getBi() {
//		return bi;
//	}
//	public void setBi(BigJobInfo bi) {
//		this.bi = bi;
//	}
//	public BusinessInfo getBd() {
//		return bd;
//	}
//	public void setBd(BusinessInfo bd) {
//		this.bd = bd;
//	}
//	public Collectionsjob getJid() {
//		return jid;
//	}
//	public void setJid(Collectionsjob jid) {
//		this.jid = jid;
//	}
	public String getBrJob() {
		return brJob;
	}
	public void setBrJob(String brJob) {
		this.brJob = brJob;
	}
	public String getBrCity() {
		return brCity;
	}
	public void setBrCity(String brCity) {
		this.brCity = brCity;
	}
	public Integer getBrBuId() {
		return brBuId;
	}
	public void setBrBuId(Integer brBuId) {
		this.brBuId = brBuId;
	}
	public Integer getBrId() {
		return brId;
	}
	public void setBrId(Integer brId) {
		this.brId = brId;
	}

	public String getBrNature() {
		return brNature;
	}
	public void setBrNature(String brNature) {
		this.brNature = brNature;
	}
	public String getBrMoney() {
		return brMoney;
	}
	public void setBrMoney(String brMoney) {
		this.brMoney = brMoney;
	}
	
	public String getBrExperience() {
		return brExperience;
	}
	public void setBrExperience(String brExperience) {
		this.brExperience = brExperience;
	}
	public String getBrEducation() {
		return brEducation;
	}
	public void setBrEducation(String brEducation) {
		this.brEducation = brEducation;
	}
	public String getBrLikeJob() {
		return brLikeJob;
	}
	public void setBrLikeJob(String brLikeJob) {
		this.brLikeJob = brLikeJob;
	}
	public String getBrJobDescribe() {
		return brJobDescribe;
	}
	public void setBrJobDescribe(String brJobDescribe) {
		this.brJobDescribe = brJobDescribe;
	}
	public String getBrAddress() {
		return brAddress;
	}
	public void setBrAddress(String brAddress) {
		this.brAddress = brAddress;
	}
	public String getBrEmail() {
		return brEmail;
	}
	public void setBrEmail(String brEmail) {
		this.brEmail = brEmail;
	}
	public String getBrTime() {
		return brTime;
	}
	public void setBrTime(String brTime) {
		this.brTime = brTime;
	}
}
