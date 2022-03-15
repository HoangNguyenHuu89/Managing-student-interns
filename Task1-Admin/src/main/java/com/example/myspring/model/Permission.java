package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permissions")
public class Permission {
	@Id
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private int type;

	@Column(name = "is_del_flg")
	private int status;

	@Column(name = "created_id")
	private int createdId;

	@Column(name = "created_at")
	private String createdAt;

	@Column(name = "modified_id")
	private int modifiedId;

	@Column(name = "modified_at")
	private String modified_at;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int isStatus() {
		return status;
	}

	public void setStatus(int status) {
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

	public String getModified_at() {
		return modified_at;
	}

	public void setModified_at(String modified_at) {
		this.modified_at = modified_at;
	}

}
