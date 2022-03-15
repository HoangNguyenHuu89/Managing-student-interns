package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "projects")
@SQLDelete(sql = "UPDATE projects SET is_del_flg = true WHERE id=?")
public class Project {
	@Id
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "descriptions")
	private String description;

	@Column(name = "technology")
	private String technology;

	@Column(name = "is_del_flg")
	private boolean status = false;

	@Column(name = "created_id")
	private int createdId;

	@Column(name = "created_at")
	private String createdAt;

	@Column(name = "modified_id")
	private int modifiedId;

	@Column(name = "modified_at")
	private String modifiedAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCreatedId() {
		return createdId;
	}

	public void setCreatedId(int createdId) {
		this.createdId = createdId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public int getModifiedId() {
		return modifiedId;
	}

	public void setModifiedId(int modifiedId) {
		this.modifiedId = modifiedId;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
