package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "issues")
@SQLDelete(sql = "UPDATE issues SET status = 0 WHERE id=?")
public class Issue {
	@Id
	private String id;

	@Column(name = "project_id")
	private String projectID;

	@Column(name = "issue_parrent_id")
	private String issueParrentId;

	@Column(name = "subject")
	private String subject;

	@Column(name = "descriptions")
	private String description;

	@Column(name = "status")
	private int status = 1;

	@Column(name = "priority")
	private int priority;

	@Column(name = "assignee")
	private String projectMemberId;

	@Column(name = "start_date")
	private String startDate;

	@Column(name = "due_date")
	private String dueDate;

	@Column(name = "progress")
	private int progress;

	@Column(name = "estimated_time")
	private int estimatedTime;

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

	public String getProjectID() {
		return projectID;
	}

	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}

	public String getIssueParrentId() {
		return issueParrentId;
	}

	public void setIssueParrentId(String issueParrentId) {
		this.issueParrentId = issueParrentId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getProjectMemberId() {
		return projectMemberId;
	}

	public void setProjectMemberId(String projectMemberId) {
		this.projectMemberId = projectMemberId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getEstimatedTime() {
		return estimatedTime;
	}

	public void setEstimatedTime(int estimatedTime) {
		this.estimatedTime = estimatedTime;
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
