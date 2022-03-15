package com.example.myspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "interships")
public class Intership {
	@Id
	@Column(name = "user_id")
	private String id;

	@Column(name = "birthday")
	private String birthday;

	@Column(name = "university_id")
	private int universityId;

	@Column(name = "scholastic")
	private int scholastic;

	@Column(name = "indentify_card")
	private String indentiftCard;

	@Column(name = "mentor_id")
	private int mentorId;

	@Column(name = "company_card_id")
	private String companyCardId;

	@Column(name = "position_id")
	private int positionId;

	@Column(name = "status")
	private int status;

	@Column(name = "level")
	private int level;

	@Column(name = "memo")
	private String memo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public int getScholastic() {
		return scholastic;
	}

	public void setScholastic(int scholastic) {
		this.scholastic = scholastic;
	}

	public String getIndentiftCard() {
		return indentiftCard;
	}

	public void setIndentiftCard(String indentiftCard) {
		this.indentiftCard = indentiftCard;
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getCompanyCardId() {
		return companyCardId;
	}

	public void setCompanyCardId(String companyCardId) {
		this.companyCardId = companyCardId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

}
