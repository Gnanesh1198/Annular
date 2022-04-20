package com.annularTechnologies.developerConnect.Model;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Blogs")
public class BlogsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	private String content;
	@Lob
	private byte[] image;
	
	@ManyToOne(targetEntity = DeveloperEntity.class, cascade = CascadeType.PERSIST)
	@JoinColumn(name= "dev_id", referencedColumnName = "id")
	private DeveloperEntity developerEntity;
	
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DeveloperEntity getDeveloperEntity() {
		return developerEntity;
	}

	public void setDeveloperEntity(DeveloperEntity developerEntity) {
		this.developerEntity = developerEntity;
	}

	public BlogsEntity() {
		
	}

//	public BlogsEntity(String string, String filename, String contentType, byte[] bytes) {
//		// TODO Auto-generated constructor stub
//	}
}
