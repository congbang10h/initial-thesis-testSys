package com.therealdanvega.domain;
// Generated Mar 4, 2018 2:56:35 PM by Hibernate Tools 4.3.5.Final

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
 * SoCommentRelationship generated by hbm2java
 */
@Entity
@Table(name = "so_comment_relationship", catalog = "mycontact")
public class SoCommentRelationship implements java.io.Serializable {

	private Integer soCommentRelationshipId;
	private SoComment soCommentByChildSoCommentId;
	private SoComment soCommentByParentSoCommentId;
	private String soCommentRelationshipDesc;

	public SoCommentRelationship() {
	}

	public SoCommentRelationship(SoComment soCommentByChildSoCommentId, SoComment soCommentByParentSoCommentId,
			String soCommentRelationshipDesc) {
		this.soCommentByChildSoCommentId = soCommentByChildSoCommentId;
		this.soCommentByParentSoCommentId = soCommentByParentSoCommentId;
		this.soCommentRelationshipDesc = soCommentRelationshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "so_comment_relationship_id", unique = true, nullable = false)
	public Integer getSoCommentRelationshipId() {
		return this.soCommentRelationshipId;
	}

	public void setSoCommentRelationshipId(Integer soCommentRelationshipId) {
		this.soCommentRelationshipId = soCommentRelationshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_so_comment_id")
	public SoComment getSoCommentByChildSoCommentId() {
		return this.soCommentByChildSoCommentId;
	}

	public void setSoCommentByChildSoCommentId(SoComment soCommentByChildSoCommentId) {
		this.soCommentByChildSoCommentId = soCommentByChildSoCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_so_comment_id")
	public SoComment getSoCommentByParentSoCommentId() {
		return this.soCommentByParentSoCommentId;
	}

	public void setSoCommentByParentSoCommentId(SoComment soCommentByParentSoCommentId) {
		this.soCommentByParentSoCommentId = soCommentByParentSoCommentId;
	}

	@Column(name = "so_comment_relationship_desc", length = 65535)
	public String getSoCommentRelationshipDesc() {
		return this.soCommentRelationshipDesc;
	}

	public void setSoCommentRelationshipDesc(String soCommentRelationshipDesc) {
		this.soCommentRelationshipDesc = soCommentRelationshipDesc;
	}

}
