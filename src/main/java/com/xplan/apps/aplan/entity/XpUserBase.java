package com.xplan.apps.aplan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * XpUserBase entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "xp_user_base", catalog = "xplan")
public class XpUserBase implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String username;
	private String userpwd;
	private Integer roseId;

	// Constructors

	/** default constructor */
	public XpUserBase() {
	}

	/** full constructor */
	public XpUserBase(String username, String userpwd, Integer roseId) {
		this.username = username;
		this.userpwd = userpwd;
		this.roseId = roseId;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "userpwd", nullable = false, length = 18)
	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	@Column(name = "rose_id", nullable = false)
	public Integer getRoseId() {
		return this.roseId;
	}

	public void setRoseId(Integer roseId) {
		this.roseId = roseId;
	}

}