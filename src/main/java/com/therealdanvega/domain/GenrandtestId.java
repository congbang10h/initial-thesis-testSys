package com.therealdanvega.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GenrandtestId generated by hbm2java
 */
@Embeddable
public class GenrandtestId implements java.io.Serializable {

	private Integer coiId;
	private long qcount;
	private int flag;
	private int total;

	public GenrandtestId() {
	}

	public GenrandtestId(long qcount, int flag, int total) {
		this.qcount = qcount;
		this.flag = flag;
		this.total = total;
	}

	public GenrandtestId(Integer coiId, long qcount, int flag, int total) {
		this.coiId = coiId;
		this.qcount = qcount;
		this.flag = flag;
		this.total = total;
	}

	@Column(name = "coi_id")
	public Integer getCoiId() {
		return this.coiId;
	}

	public void setCoiId(Integer coiId) {
		this.coiId = coiId;
	}

	@Column(name = "qcount", nullable = false)
	public long getQcount() {
		return this.qcount;
	}

	public void setQcount(long qcount) {
		this.qcount = qcount;
	}

	@Column(name = "flag", nullable = false)
	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Column(name = "total", nullable = false)
	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GenrandtestId))
			return false;
		GenrandtestId castOther = (GenrandtestId) other;

		return ((this.getCoiId() == castOther.getCoiId()) || (this.getCoiId() != null && castOther.getCoiId() != null
				&& this.getCoiId().equals(castOther.getCoiId()))) && (this.getQcount() == castOther.getQcount())
				&& (this.getFlag() == castOther.getFlag()) && (this.getTotal() == castOther.getTotal());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCoiId() == null ? 0 : this.getCoiId().hashCode());
		result = 37 * result + (int) this.getQcount();
		result = 37 * result + this.getFlag();
		result = 37 * result + this.getTotal();
		return result;
	}

}
