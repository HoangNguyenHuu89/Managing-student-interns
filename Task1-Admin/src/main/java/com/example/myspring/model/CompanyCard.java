package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "comapany_cards")
@SQLDelete(sql = "UPDATE comapany_cards SET is_del_flg = true WHERE id=?")
public class CompanyCard {
	@Id
	private String id;

	@Column(name = "using_flg")
	private boolean using;

	@Column(name = "is_del_flg")
	private boolean delStatus = false;

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

	public boolean isUsing() {
		return using;
	}

	public void setUsing(boolean using) {
		this.using = using;
	}

	public boolean isDelStatus() {
		return delStatus;
	}

	public void setDelStatus(boolean delStatus) {
		this.delStatus = delStatus;
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
