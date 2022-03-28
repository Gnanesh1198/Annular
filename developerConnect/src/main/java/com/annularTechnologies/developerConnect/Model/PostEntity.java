package com.annularTechnologies.developerConnect.Model;


import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="post")
public class PostEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	private String query;
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	private Date created_at;
	
	@ManyToOne(targetEntity = DeveloperEntity.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "dev_id", referencedColumnName = "id")
	@JsonIgnore
	private DeveloperEntity developerEntity;
	
	
	public DeveloperEntity getDeveloperEntity() {
		return developerEntity;
	}



	public void setDeveloperEntity(DeveloperEntity developerEntity) {
		this.developerEntity = developerEntity;
	}



	@PrePersist
	private void onCreate() {
		created_at = new Date();
	}
	
	
	
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public PostEntity() {
		super();
	}
	public PostEntity( String query) {
		super();
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	
	
}
