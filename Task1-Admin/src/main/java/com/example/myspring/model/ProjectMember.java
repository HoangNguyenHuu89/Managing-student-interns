package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "project_members")
@SQLDelete(sql = "UPDATE project_members SET is_del_flg = true WHERE id=?")
public class ProjectMember {
	@Id
	private String id;

	@Column(name = "project_id")
	private String projectId;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "project_permission_id")
	private int projectPermissionId;

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

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getProjectPermissionId() {
		return projectPermissionId;
	}

	public void setProjectPermissionId(int projectPermissionId) {
		this.projectPermissionId = projectPermissionId;
	}

	public boolean isStatus() {
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
