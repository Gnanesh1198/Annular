package com.annularTechnologies.developerConnect.dto;

import com.annularTechnologies.developerConnect.Model.DeveloperEntity;

public class DeveloperSignUpDto {
	
	
	
//	private DeveloperEntity developer;
//
//	public DeveloperSignUpDto() {
//		super();
//	}
//
//	public DeveloperSignUpDto(DeveloperEntity developer) {
//		super();
//		this.developer = developer;
//	}
//
//	public DeveloperEntity getDeveloper() {
//		return developer;
//	}
//
//	public void setDeveloper(DeveloperEntity developer) {
//		this.developer = developer;
//	}
	
	
	

	private String username;
	private String mobile;
	private String skills;
	private String experience;
	private String project;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	
	
}