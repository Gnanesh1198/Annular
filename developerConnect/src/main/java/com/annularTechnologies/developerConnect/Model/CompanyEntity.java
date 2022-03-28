package com.annularTechnologies.developerConnect.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Company")
public class CompanyEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	@NotNull
	private Long id;
	@Column
	@NotNull
	private String name;
	@Column
	@NotNull
	private String location;
	@Column
	@NotNull
	private String password;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CompanyEntity() {
		super();
	}
	public CompanyEntity(@NotNull Long id, @NotNull String name, @NotNull String location, @NotNull String password) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.password = password;
	}
	
//	@OneToMany(mappedBy = "company")
//	@JsonIgnore
//	private Set<DeveloperEntity> developers = new HashSet<>();
	
	
	
	
}