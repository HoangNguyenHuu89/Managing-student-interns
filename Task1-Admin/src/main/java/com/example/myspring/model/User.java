package com.example.myspring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private String id;

	private String username;
	private String password;
	private boolean enabled;
//	private String email;
//	private String fullName;
//	private String phoneNumber;
//	private String skype;
//	private int role;
//	private boolean isDelFlg;
//	private int createdId;
//	private String createdAt;
//	private int modifiedID;
//	private String modifiedAt;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getFullName() {
//		return fullName;
//	}
//
//	public void setFullName(String fullName) {
//		this.fullName = fullName;
//	}
//
//	public String getPhoneNumber() {
//		return phoneNumber;
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//	public String getSkype() {
//		return skype;
//	}
//
//	public void setSkype(String skype) {
//		this.skype = skype;
//	}
//
//	public int getRole() {
//		return role;
//	}
//
//	public void setRole(int role) {
//		this.role = role;
//	}
//
//	public boolean isDelFlg() {
//		return isDelFlg;
//	}
//
//	public void setDelFlg(boolean isDelFlg) {
//		this.isDelFlg = isDelFlg;
//	}
//
//	public int getCreatedId() {
//		return createdId;
//	}
//
//	public void setCreatedId(int createdId) {
//		this.createdId = createdId;
//	}
//
//	public String getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(String createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public int getModifiedID() {
//		return modifiedID;
//	}
//
//	public void setModifiedID(int modifiedID) {
//		this.modifiedID = modifiedID;
//	}
//
//	public String getModifiedAt() {
//		return modifiedAt;
//	}
//
//	public void setModifiedAt(String modifiedAt) {
//		this.modifiedAt = modifiedAt;
//	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
