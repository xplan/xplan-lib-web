package com.xplan.apps.aplan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * XpRose entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "xp_rose", catalog = "xplan")
public class XpRose implements java.io.Serializable {

	// Fields

	private Integer roseId;
	private String roseName;

	// Constructors

	/** default constructor */
	public XpRose() {
	}

	/** full constructor */
	public XpRose(String roseName) {
		this.roseName = roseName;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "rose_id", unique = true, nullable = false)
	public Integer getRoseId() {
		return this.roseId;
	}

	public void setRoseId(Integer roseId) {
		this.roseId = roseId;
	}

	@Column(name = "rose_name", nullable = false, length = 20)
	public String getRoseName() {
		return this.roseName;
	}

	public void setRoseName(String roseName) {
		this.roseName = roseName;
	}

}