package com.therealdanvega.domain;
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
 * PrevilegeRelstionship generated by hbm2java
 */
@Entity
@Table(name = "previlege_relstionship", catalog = "testts")
public class PrevilegeRelstionship implements java.io.Serializable {

	private Integer previlegeRelstionshipId;
	private Previlege previlegeByParentPrevilegeId;
	private Previlege previlegeByChildPrevilegeId;
	private String previlegeRelstionshipDesc;

	public PrevilegeRelstionship() {
	}

	public PrevilegeRelstionship(String previlegeRelstionshipDesc) {
		this.previlegeRelstionshipDesc = previlegeRelstionshipDesc;
	}

	public PrevilegeRelstionship(Previlege previlegeByParentPrevilegeId, Previlege previlegeByChildPrevilegeId,
			String previlegeRelstionshipDesc) {
		this.previlegeByParentPrevilegeId = previlegeByParentPrevilegeId;
		this.previlegeByChildPrevilegeId = previlegeByChildPrevilegeId;
		this.previlegeRelstionshipDesc = previlegeRelstionshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "previlege_relstionship_id", unique = true, nullable = false)
	public Integer getPrevilegeRelstionshipId() {
		return this.previlegeRelstionshipId;
	}

	public void setPrevilegeRelstionshipId(Integer previlegeRelstionshipId) {
		this.previlegeRelstionshipId = previlegeRelstionshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_previlege_id")
	public Previlege getPrevilegeByParentPrevilegeId() {
		return this.previlegeByParentPrevilegeId;
	}

	public void setPrevilegeByParentPrevilegeId(Previlege previlegeByParentPrevilegeId) {
		this.previlegeByParentPrevilegeId = previlegeByParentPrevilegeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_previlege_id")
	public Previlege getPrevilegeByChildPrevilegeId() {
		return this.previlegeByChildPrevilegeId;
	}

	public void setPrevilegeByChildPrevilegeId(Previlege previlegeByChildPrevilegeId) {
		this.previlegeByChildPrevilegeId = previlegeByChildPrevilegeId;
	}

	@Column(name = "previlege_relstionship_desc", nullable = false, length = 65535)
	public String getPrevilegeRelstionshipDesc() {
		return this.previlegeRelstionshipDesc;
	}

	public void setPrevilegeRelstionshipDesc(String previlegeRelstionshipDesc) {
		this.previlegeRelstionshipDesc = previlegeRelstionshipDesc;
	}

}