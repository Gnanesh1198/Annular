package com.annularTechnologies.developerConnect.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="jobs")
public class JobsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotNull
	private int jobsid;
	@Column
	private int recruiter_id;
	@Column
	private String job_title;
	@Column
	private String jobs_shore_desc;
	@Column
	private String job_description;
	@Column
	private String attachment;
	@Column
	private String skills;
	@Column
	private String recruitment_type;
	@Column
	private int per_hour_cost;
	@Column
	private String Budget_type;
	@Column
	private int salary;
	@Column
	private String project_status;
	@Column
	@CreationTimestamp
	private Date created_on;
	@Column
	@UpdateTimestamp
	private Date updated_on;
	
	public int getJobsid() {
		return jobsid;
	}
	public void setJobsid(int jobsid) {
		this.jobsid = jobsid;
	}
	public int getRecruiter_id() {
		return recruiter_id;
	}
	public void setRecruiter_id(int recruiter_id) {
		this.recruiter_id = recruiter_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJobs_shore_desc() {
		return jobs_shore_desc;
	}
	public void setJobs_shore_desc(String jobs_shore_desc) {
		this.jobs_shore_desc = jobs_shore_desc;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getRecruitment_type() {
		return recruitment_type;
	}
	public void setRecruitment_type(String recruitment_type) {
		this.recruitment_type = recruitment_type;
	}
	public int getPer_hour_cost() {
		return per_hour_cost;
	}
	public void setPer_hour_cost(int per_hour_cost) {
		this.per_hour_cost = per_hour_cost;
	}
	public String getBudget_type() {
		return Budget_type;
	}
	public void setBudget_type(String budget_type) {
		Budget_type = budget_type;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getProject_status() {
		return project_status;
	}
	public void setProject_status(String project_status) {
		this.project_status = project_status;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	
	
	
	
	

}
