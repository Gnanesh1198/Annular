package com.annularTechnologies.developerConnect.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "developer")
public class DeveloperEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String username;
	@Column
	private String mobile;
	@Column
	private String skills;
	@Column
	private String experience;
	@Column
	private String project;
	
//	@OneToMany(targetEntity = DeveloperEntity.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "dev_id", referencedColumnName = "id")
//	private List<DeveloperEntity> devEntity = new ArrayList<>();
	
//	@OneToMany(targetEntity = PostEntity.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "dev_id", referencedColumnName = "id")
//	private List<PostEntity> posts = new ArrayList<>();
//
//	public DeveloperEntity(List<PostEntity> posts) {
//		super();
//		this.posts = posts;
//	}

//	@Column
//	private String password;
	
	
	
//	
//	public List<PostEntity> getPost() {
//		return posts;
//	}
//
//	public void setPost(List<PostEntity> posts) {
//		this.posts = posts;
//	}

	public DeveloperEntity() {
		super();
	}

	public DeveloperEntity(Long id, String username,String mobile, String skills, String experience, String project) {
		super();
		this.id = id;
		this.username = username;
		this.skills = skills;
		this.experience = experience;
		this.project = project;
		this.mobile = mobile;
//		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
}

	