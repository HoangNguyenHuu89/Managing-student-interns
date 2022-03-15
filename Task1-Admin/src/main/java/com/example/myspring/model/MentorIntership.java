package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_interships")
public class MentorIntership {
	@Id
	private int id;

	@Column(name = "mentor_id")
	private int mentorId;

	@Column(name = "intership_id")
	private int intershipId;

	@Column(name = "position_id")
	private int positionId;

	@Column(name = "is_del_flg")
	private boolean status;

	@Column(name = "created_id")
	private int createdId;

	@Column(name = "created_at")
	private String createdAt;

	@Column(name = "modified_id")
	private int modifiedId;

	@Column(name = "modified_at")
	private String modifiedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public int getIntershipId() {
		return intershipId;
	}

	public void setIntershipId(int intershipId) {
		this.intershipId = intershipId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
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
