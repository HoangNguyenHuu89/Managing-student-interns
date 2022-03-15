package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "timesheets")
@SQLDelete(sql = "UPDATE timesheets SET is_del_flg = 1 WHERE id=?")
public class Timesheet {
	@Id
	private String id;

	@Column(name = "intership_id")
	private String intershipId;

	@Column(name = "working_day")
	private String workingDay;

	@Column(name = "time")
	private String time;

	@Column(name = "is_del_flg")
	private int isDelFlg = 0;

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

	public String getIntershipId() {
		return intershipId;
	}

	public void setIntershipId(String intershipId) {
		this.intershipId = intershipId;
	}

	public String getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(String workingDay) {
		this.workingDay = workingDay;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int isDelFlg() {
		return isDelFlg;
	}

	public void setDelFlg(int isDelFlg) {
		this.isDelFlg = isDelFlg;
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
