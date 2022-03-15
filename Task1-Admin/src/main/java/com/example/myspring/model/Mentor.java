package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "mentors")
@SQLDelete(sql = "UPDATE mentors SET is_acitve_flg = false WHERE user_id=?")
public class Mentor {
	@Id
	@Column(name = "user_id")
	private String id;

	@Column(name = "max_intership")
	private String maxIntership;

	@Column(name = "is_acitve_flg")
	private boolean isAcitveFlg = true;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaxIntership() {
		return maxIntership;
	}

	public void setMaxIntership(String maxIntership) {
		this.maxIntership = maxIntership;
	}

	public boolean getIsAcitveFlg() {
		return isAcitveFlg;
	}

	public void setIsAcitveFlg(boolean isAcitveFlg) {
		this.isAcitveFlg = isAcitveFlg;
	}

}
