package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PeoiSoiMap generated by hbm2java
 */
@Entity
@Table(name = "peoi_soi_map", catalog = "testts")
public class PeoiSoiMap implements java.io.Serializable {

	private Integer psmiId;
	private PeoItem peoItem;
	private PeoSoMap peoSoMap;
	private StudentOutcomeItem studentOutcomeItem;

	public PeoiSoiMap() {
	}

	public PeoiSoiMap(PeoItem peoItem, PeoSoMap peoSoMap, StudentOutcomeItem studentOutcomeItem) {
		this.peoItem = peoItem;
		this.peoSoMap = peoSoMap;
		this.studentOutcomeItem = studentOutcomeItem;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "psmi_id", unique = true, nullable = false)
	public Integer getPsmiId() {
		return this.psmiId;
	}

	public void setPsmiId(Integer psmiId) {
		this.psmiId = psmiId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "peoi_id")
	public PeoItem getPeoItem() {
		return this.peoItem;
	}

	public void setPeoItem(PeoItem peoItem) {
		this.peoItem = peoItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "psm_id")
	public PeoSoMap getPeoSoMap() {
		return this.peoSoMap;
	}

	public void setPeoSoMap(PeoSoMap peoSoMap) {
		this.peoSoMap = peoSoMap;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soi_id")
	public StudentOutcomeItem getStudentOutcomeItem() {
		return this.studentOutcomeItem;
	}

	public void setStudentOutcomeItem(StudentOutcomeItem studentOutcomeItem) {
		this.studentOutcomeItem = studentOutcomeItem;
	}

}
