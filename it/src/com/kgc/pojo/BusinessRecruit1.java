package com.kgc.pojo;

public class BusinessRecruit1 {
	//����
			private Integer brId;//��ҵ��Ƹ��Ϣ���
			
			//private Integer biId;//ְλ���(���)
			private BigJobInfo bi=new BigJobInfo();
			//
			private String brJob;//ְλ����
			private String brCity;//��������
			private BusinessInfo bd=new BusinessInfo();//��ҵ��Ϣ��� ���
			//
			private String brNature;//��������
			private String brMoney;//��н
			
			//private Integer arId;//�������б�ţ������
			private AreaInfo ai=new AreaInfo();
			
			private String brExperience;//��������
			private String brEducation;//ѧ��
			private String brLikeJob;//ְλ�ջ�
			private String brJobDescribe;//ְλ����
			private String brAddress;//������ϸ��ַ
			private String brEmail;//���ռ�������
			private String brTime;//����ʱ��
			private Collectionsjob jid=new Collectionsjob();//�ղر��ţ����
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
