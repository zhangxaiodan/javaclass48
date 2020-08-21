package com.kgc.pojo;

public class BusinessRecruit1 {
	//属性
			private Integer brId;//企业招聘信息编号
			
			//private Integer biId;//职位编号(外键)
			private BigJobInfo bi=new BigJobInfo();
			//
			private String brJob;//职位名称
			private String brCity;//工作城市
			private BusinessInfo bd=new BusinessInfo();//企业信息编号 外键
			//
			private String brNature;//工作性质
			private String brMoney;//月薪
			
			//private Integer arId;//工作城市编号（外键）
			private AreaInfo ai=new AreaInfo();
			
			private String brExperience;//工作经验
			private String brEducation;//学历
			private String brLikeJob;//职位诱惑
			private String brJobDescribe;//职位描述
			private String brAddress;//工作详细地址
			private String brEmail;//接收简历邮箱
			private String brTime;//发布时间
			private Collectionsjob jid=new Collectionsjob();//收藏表编号，外键
			public Integer getBrId() {
				return brId;
			}
			public BigJobInfo getBi() {
				return bi;
			}
			public String getBrJob() {
				return brJob;
			}
			public String getBrCity() {
				return brCity;
			}
			public BusinessInfo getBd() {
				return bd;
			}
			public String getBrNature() {
				return brNature;
			}
			public String getBrMoney() {
				return brMoney;
			}
			public AreaInfo getAi() {
				return ai;
			}
			public String getBrExperience() {
				return brExperience;
			}
			public String getBrEducation() {
				return brEducation;
			}
			public String getBrLikeJob() {
				return brLikeJob;
			}
			public String getBrJobDescribe() {
				return brJobDescribe;
			}
			public String getBrAddress() {
				return brAddress;
			}
			public String getBrEmail() {
				return brEmail;
			}
			public String getBrTime() {
				return brTime;
			}
			public Collectionsjob getJid() {
				return jid;
			}
			public void setBrId(Integer brId) {
				this.brId = brId;
			}
			public void setBi(BigJobInfo bi) {
				this.bi = bi;
			}
			public void setBrJob(String brJob) {
				this.brJob = brJob;
			}
			public void setBrCity(String brCity) {
				this.brCity = brCity;
			}
			public void setBd(BusinessInfo bd) {
				this.bd = bd;
			}
			public void setBrNature(String brNature) {
				this.brNature = brNature;
			}
			public void setBrMoney(String brMoney) {
				this.brMoney = brMoney;
			}
			public void setAi(AreaInfo ai) {
				this.ai = ai;
			}
			public void setBrExperience(String brExperience) {
				this.brExperience = brExperience;
			}
			public void setBrEducation(String brEducation) {
				this.brEducation = brEducation;
			}
			public void setBrLikeJob(String brLikeJob) {
				this.brLikeJob = brLikeJob;
			}
			public void setBrJobDescribe(String brJobDescribe) {
				this.brJobDescribe = brJobDescribe;
			}
			public void setBrAddress(String brAddress) {
				this.brAddress = brAddress;
			}
			public void setBrEmail(String brEmail) {
				this.brEmail = brEmail;
			}
			public void setBrTime(String brTime) {
				this.brTime = brTime;
			}
			public void setJid(Collectionsjob jid) {
				this.jid = jid;
			}
}
