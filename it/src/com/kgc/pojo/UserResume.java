package com.kgc.pojo;
/**
 * 用户简历表
 * @author Administrator
 *
 */
public class UserResume {
	private int    urid;//简历编号
	private String urname;//姓名
	private String urbirthday;//出生日期
	private String ursex;//性别
	private String urpolitical;//政治面貌
	private String urmarriage;//婚姻状况
	private String ureducation;//学历
	private String urexperience;//工作经验
	private String urphone;//联系电话
    private String uremail;//电子邮箱
	private String urnature;//期望工作性质
	private String    arid;//期望工作城市
	private String    biid;//期望职位
	
	private String urmoney;//期望月薪
	private String urjingli;//工作经历
	private String urproject;//项目经验
	private String urschool;//毕业学校
	private String ursubject;//专业名称
	private String uryear;//毕业年份
    private String urintroduce;//自我描述
	private String uraddress;//作品链接地址
	private String urdescribe;//作品描述
	private String urtime;//发布简历时间
	private String urpicture;//简历头像地址
	private String urjob;//投递的职位,用于记录简历投递量
	private String urjlpath ;//文件地址
	private int is_default;//上传默认方式
	private String currentState;//目前状态
	
	
	public int getIs_default() {
		return is_default;
	}
	public void setIs_default(int is_default) {
		this.is_default = is_default;
	}
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	public int getUrid() {
		return urid;
	}
	public String getUrjlpath() {
		return urjlpath;
	}
	public void setUrjlpath(String urjlpath) {
		this.urjlpath = urjlpath;
	}
	public String getUrname() {
		return urname;
	}
	public String getUrbirthday() {
		return urbirthday;
	}
	public String getUrsex() {
		return ursex;
	}
	public String getUrpolitical() {
		return urpolitical;
	}
	public String getUrmarriage() {
		return urmarriage;
	}
	public String getUreducation() {
		return ureducation;
	}
	public String getUrexperience() {
		return urexperience;
	}
	public String getUrphone() {
		return urphone;
	}
	public String getUremail() {
		return uremail;
	}
	public String getUrnature() {
		return urnature;
	}
	public String getArid() {
		return arid;
	}
	public String getBiid() {
		return biid;
	}
	public String getUrmoney() {
		return urmoney;
	}
	public String getUrjingli() {
		return urjingli;
	}
	public String getUrproject() {
		return urproject;
	}
	public String getUrschool() {
		return urschool;
	}
	public String getUrsubject() {
		return ursubject;
	}
	public String getUryear() {
		return uryear;
	}
	public String getUrintroduce() {
		return urintroduce;
	}
	public String getUraddress() {
		return uraddress;
	}
	public String getUrdescribe() {
		return urdescribe;
	}
	public String getUrtime() {
		return urtime;
	}
	public String getUrpicture() {
		return urpicture;
	}
	public String getUrjob() {
		return urjob;
	}
	public void setUrid(int urid) {
		this.urid = urid;
	}
	public void setUrname(String urname) {
		this.urname = urname;
	}
	public void setUrbirthday(String urbirthday) {
		this.urbirthday = urbirthday;
	}
	public void setUrsex(String ursex) {
		this.ursex = ursex;
	}
	public void setUrpolitical(String urpolitical) {
		this.urpolitical = urpolitical;
	}
	public void setUrmarriage(String urmarriage) {
		this.urmarriage = urmarriage;
	}
	public void setUreducation(String ureducation) {
		this.ureducation = ureducation;
	}
	public void setUrexperience(String urexperience) {
		this.urexperience = urexperience;
	}
	public void setUrphone(String urphone) {
		this.urphone = urphone;
	}
	public void setUremail(String uremail) {
		this.uremail = uremail;
	}
	public void setUrnature(String urnature) {
		this.urnature = urnature;
	}
	public void setArid(String arid) {
		this.arid = arid;
	}
	public void setBiid(String biid) {
		this.biid = biid;
	}
	public void setUrmoney(String urmoney) {
		this.urmoney = urmoney;
	}
	public void setUrjingli(String urjingli) {
		this.urjingli = urjingli;
	}
	public void setUrproject(String urproject) {
		this.urproject = urproject;
	}
	public void setUrschool(String urschool) {
		this.urschool = urschool;
	}
	public void setUrsubject(String ursubject) {
		this.ursubject = ursubject;
	}
	public void setUryear(String uryear) {
		this.uryear = uryear;
	}
	public void setUrintroduce(String urintroduce) {
		this.urintroduce = urintroduce;
	}
	public void setUraddress(String uraddress) {
		this.uraddress = uraddress;
	}
	public void setUrdescribe(String urdescribe) {
		this.urdescribe = urdescribe;
	}
	public void setUrtime(String urtime) {
		this.urtime = urtime;
	}
	public void setUrpicture(String urpicture) {
		this.urpicture = urpicture;
	}
	public void setUrjob(String urjob) {
		this.urjob = urjob;
	}
}
