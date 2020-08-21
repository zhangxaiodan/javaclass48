package com.kgc.pojo;
/**
 * 企业注册信息
 *  @author Administrator
 *
 */
public class BusinessInfo {
	private Integer buId; //企业信息编号
	private String buLoginName; //企业登录名
	private String buPwd; //密码
	private String buEmail; //邮箱
	private String buName;//公司全称
	private String bujName;//公司简称
	private String buLogo;//公司logo
	private String buHomePage;//公司主页
	private String buCity;//公司所在城市
	private String buBigJob;//公司行业领域
	private String buSize;//公司规模
	private String buDevelopment;//公司发展阶段
	private String buIntroduce;//公司简介
	private String buType;//公司类型
	private String buPicture;//公司营业执照地址
	private String buPhone;//联系电话
	private String buLable;//公司标签
	private String orName;//公司创始人姓名
	private String orJob;//当前职务
	private String orWeibo;//创始人微博
	private String orIntroduce;//创始人简历
	private String prPicture;//产品海报
	private String prName; //产品名称
	private String prAddress;//产品链接地址
	private String prIntroduce;//产品简介
	private String buxIntroduce;//公司详细介绍
	//private Integer brId;//企业招聘信息编号
	//企业招聘信息对象
	private BusinessRecruit recruit=new BusinessRecruit();
	
	public Integer getBuId() {
		return buId;
	}
	public void setBuId(Integer buId) {
		this.buId = buId;
	}
	public String getBuLoginName() {
		return buLoginName;
	}
	public void setBuLoginName(String buLoginName) {
		this.buLoginName = buLoginName;
	}
	public String getBuPwd() {
		return buPwd;
	}
	public void setBuPwd(String buPwd) {
		this.buPwd = buPwd;
	}
	public String getBuEmail() {
		return buEmail;
	}
	public void setBuEmail(String buEmail) {
		this.buEmail = buEmail;
	}
	public String getBuName() {
		return buName;
	}
	public void setBuName(String buName) {
		this.buName = buName;
	}
	public String getBujName() {
		return bujName;
	}
	public void setBujName(String bujName) {
		this.bujName = bujName;
	}
	public String getBuLogo() {
		return buLogo;
	}
	public void setBuLogo(String buLogo) {
		this.buLogo = buLogo;
	}
	public String getBuHomePage() {
		return buHomePage;
	}
	public void setBuHomePage(String buHomePage) {
		this.buHomePage = buHomePage;
	}
	public String getBuCity() {
		return buCity;
	}
	public void setBuCity(String buCity) {
		this.buCity = buCity;
	}
	public String getBuBigJob() {
		return buBigJob;
	}
	public void setBuBigJob(String buBigJob) {
		this.buBigJob = buBigJob;
	}
	public String getBuSize() {
		return buSize;
	}
	public void setBuSize(String buSize) {
		this.buSize = buSize;
	}
	public String getBuDevelopment() {
		return buDevelopment;
	}
	public void setBuDevelopment(String buDevelopment) {
		this.buDevelopment = buDevelopment;
	}
	public String getBuIntroduce() {
		return buIntroduce;
	}
	public void setBuIntroduce(String buIntroduce) {
		this.buIntroduce = buIntroduce;
	}
	public String getBuType() {
		return buType;
	}
	public void setBuType(String buType) {
		this.buType = buType;
	}
	public String getBuPicture() {
		return buPicture;
	}
	public void setBuPicture(String buPicture) {
		this.buPicture = buPicture;
	}
	public String getBuPhone() {
		return buPhone;
	}
	public void setBuPhone(String buPhone) {
		this.buPhone = buPhone;
	}
	public String getBuLable() {
		return buLable;
	}
	public void setBuLable(String buLable) {
		this.buLable = buLable;
	}
	public String getOrName() {
		return orName;
	}
	public void setOrName(String orName) {
		this.orName = orName;
	}
	public String getOrJob() {
		return orJob;
	}
	public void setOrJob(String orJob) {
		this.orJob = orJob;
	}
	public String getOrWeibo() {
		return orWeibo;
	}
	public void setOrWeibo(String orWeibo) {
		this.orWeibo = orWeibo;
	}
	public String getOrIntroduce() {
		return orIntroduce;
	}
	public void setOrIntroduce(String orIntroduce) {
		this.orIntroduce = orIntroduce;
	}
	public String getPrPicture() {
		return prPicture;
	}
	public void setPrPicture(String prPicture) {
		this.prPicture = prPicture;
	}
	public String getPrName() {
		return prName;
	}
	public void setPrName(String prName) {
		this.prName = prName;
	}
	public String getPrAddress() {
		return prAddress;
	}
	public void setPrAddress(String prAddress) {
		this.prAddress = prAddress;
	}
	public String getPrIntroduce() {
		return prIntroduce;
	}
	public void setPrIntroduce(String prIntroduce) {
		this.prIntroduce = prIntroduce;
	}
	public String getBuxIntroduce() {
		return buxIntroduce;
	}
	public void setBuxIntroduce(String buxIntroduce) {
		this.buxIntroduce = buxIntroduce;
	}
//	public Integer getBrId() {
//		return brId;
//	}
//	public void setBrId(Integer brId) {
//		this.brId = brId;
//	}
	public BusinessRecruit getRecruit() {
		return recruit;
	}
	public void setRecruit(BusinessRecruit recruit) {
		this.recruit = recruit;
	}

	

	
	
	
}
