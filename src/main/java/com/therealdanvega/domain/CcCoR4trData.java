package com.therealdanvega.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CcCoR4trData generated by hbm2java
 */
@Entity
@Table(name = "_cc_co_r4tr_data", catalog = "testts")
public class CcCoR4trData implements java.io.Serializable {

	private int courseContentId;
	private Integer numberTaker;
	private Integer coi1;
	private Integer coi1Total;
	private Integer coi2;
	private Integer coi2Total;
	private Integer coi30;
	private Integer coi30Total;

	public CcCoR4trData() {
	}

	public CcCoR4trData(int courseContentId) {
		this.courseContentId = courseContentId;
	}

	public CcCoR4trData(int courseContentId, Integer numberTaker, Integer coi1, Integer coi1Total, Integer coi2,
			Integer coi2Total, Integer coi30, Integer coi30Total) {
		this.courseContentId = courseContentId;
		this.numberTaker = numberTaker;
		this.coi1 = coi1;
		this.coi1Total = coi1Total;
		this.coi2 = coi2;
		this.coi2Total = coi2Total;
		this.coi30 = coi30;
		this.coi30Total = coi30Total;
	}

	@Id

	@Column(name = "course_content_id", unique = true, nullable = false)
	public int getCourseContentId() {
		return this.courseContentId;
	}

	public void setCourseContentId(int courseContentId) {
		this.courseContentId = courseContentId;
	}

	@Column(name = "number_taker")
	public Integer getNumberTaker() {
		return this.numberTaker;
	}

	public void setNumberTaker(Integer numberTaker) {
		this.numberTaker = numberTaker;
	}

	@Column(name = "coi_1")
	public Integer getCoi1() {
		return this.coi1;
	}

	public void setCoi1(Integer coi1) {
		this.coi1 = coi1;
	}

	@Column(name = "coi_1_total")
	public Integer getCoi1Total() {
		return this.coi1Total;
	}

	public void setCoi1Total(Integer coi1Total) {
		this.coi1Total = coi1Total;
	}

	@Column(name = "coi_2")
	public Integer getCoi2() {
		return this.coi2;
	}

	public void setCoi2(Integer coi2) {
		this.coi2 = coi2;
	}

	@Column(name = "coi_2_total")
	public Integer getCoi2Total() {
		return this.coi2Total;
	}

	public void setCoi2Total(Integer coi2Total) {
		this.coi2Total = coi2Total;
	}

	@Column(name = "coi_30")
	public Integer getCoi30() {
		return this.coi30;
	}

	public void setCoi30(Integer coi30) {
		this.coi30 = coi30;
	}

	@Column(name = "coi_30_total")
	public Integer getCoi30Total() {
		return this.coi30Total;
	}

	public void setCoi30Total(Integer coi30Total) {
		this.coi30Total = coi30Total;
	}

}
