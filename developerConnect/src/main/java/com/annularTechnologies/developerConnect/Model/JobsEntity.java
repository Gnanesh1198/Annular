package com.annularTechnologies.developerConnect.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="jobs")
public class JobsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotNull
	private int jobsid;
	@Column
	private String dev_user_id;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String jobstype;
	@Column
	private String salary;
	@Column
	private String hourlycharge;
	@Column
	private String explevel;
	@Column
	private String skillset;
	@Column
	private String noticeperiod;
	@Column
	private int hrsweek;
	@Column
	private int premiumjobs;
	@Column
	private byte[] attachment;
	
	public byte[] getAttachment() {
		return attachment;
	}
	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}
	public int getJobsid() {
		return jobsid;
	}
	public void setJobsid(int jobsid) {
		this.jobsid = jobsid;
	}
	public String getDev_user_id() {
		return dev_user_id;
	}
	public void setDev_user_id(String dev_user_id) {
		this.dev_user_id = dev_user_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getJobstype() {
		return jobstype;
	}
	public void setJobstype(String jobstype) {
		this.jobstype = jobstype;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getHourlycharge() {
		return hourlycharge;
	}
	public void setHourlycharge(String hourlycharge) {
		this.hourlycharge = hourlycharge;
	}
	public String getExplevel() {
		return explevel;
	}
	public void setExplevel(String explevel) {
		this.explevel = explevel;
	}
	public String getSkillset() {
		return skillset;
	}
	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}
	public String getNoticeperiod() {
		return noticeperiod;
	}
	public void setNoticeperiod(String noticeperiod) {
		this.noticeperiod = noticeperiod;
	}
	public int getHrsweek() {
		return hrsweek;
	}
	public void setHrsweek(int hrsweek) {
		this.hrsweek = hrsweek;
	}
	public int getPremiumjobs() {
		return premiumjobs;
	}
	public void setPremiumjobs(int premiumjobs) {
		this.premiumjobs = premiumjobs;
	}
	

}
