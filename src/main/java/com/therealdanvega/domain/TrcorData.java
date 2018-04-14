package com.therealdanvega.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TrcorData generated by hbm2java
 */
@Entity
@Table(name = "_trcor_data", catalog = "testts")
public class TrcorData implements java.io.Serializable {

	private int testId;
	private Integer numberTaker;
	private Integer coi1Rq;
	private Integer coi1Nq;
	private Integer coi2Rq;
	private Integer coi2Nq;
	private Integer coi30Rq;
	private Integer coi30Nq;

	public TrcorData() {
	}

	public TrcorData(int testId) {
		this.testId = testId;
	}

	public TrcorData(int testId, Integer numberTaker, Integer coi1Rq, Integer coi1Nq, Integer coi2Rq, Integer coi2Nq,
			Integer coi30Rq, Integer coi30Nq) {
		this.testId = testId;
		this.numberTaker = numberTaker;
		this.coi1Rq = coi1Rq;
		this.coi1Nq = coi1Nq;
		this.coi2Rq = coi2Rq;
		this.coi2Nq = coi2Nq;
		this.coi30Rq = coi30Rq;
		this.coi30Nq = coi30Nq;
	}

	@Id

	@Column(name = "test_id", unique = true, nullable = false)
	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	@Column(name = "number_taker")
	public Integer getNumberTaker() {
		return this.numberTaker;
	}

	public void setNumberTaker(Integer numberTaker) {
		this.numberTaker = numberTaker;
	}

	@Column(name = "coi_1_rq")
	public Integer getCoi1Rq() {
		return this.coi1Rq;
	}

	public void setCoi1Rq(Integer coi1Rq) {
		this.coi1Rq = coi1Rq;
	}

	@Column(name = "coi_1_nq")
	public Integer getCoi1Nq() {
		return this.coi1Nq;
	}

	public void setCoi1Nq(Integer coi1Nq) {
		this.coi1Nq = coi1Nq;
	}

	@Column(name = "coi_2_rq")
	public Integer getCoi2Rq() {
		return this.coi2Rq;
	}

	public void setCoi2Rq(Integer coi2Rq) {
		this.coi2Rq = coi2Rq;
	}

	@Column(name = "coi_2_nq")
	public Integer getCoi2Nq() {
		return this.coi2Nq;
	}

	public void setCoi2Nq(Integer coi2Nq) {
		this.coi2Nq = coi2Nq;
	}

	@Column(name = "coi_30_rq")
	public Integer getCoi30Rq() {
		return this.coi30Rq;
	}

	public void setCoi30Rq(Integer coi30Rq) {
		this.coi30Rq = coi30Rq;
	}

	@Column(name = "coi_30_nq")
	public Integer getCoi30Nq() {
		return this.coi30Nq;
	}

	public void setCoi30Nq(Integer coi30Nq) {
		this.coi30Nq = coi30Nq;
	}

}
