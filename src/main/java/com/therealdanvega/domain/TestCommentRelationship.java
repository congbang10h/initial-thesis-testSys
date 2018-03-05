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
 * TestCommentRelationship generated by hbm2java
 */
@Entity
@Table(name = "test_comment_relationship", catalog = "mycontact")
public class TestCommentRelationship implements java.io.Serializable {

	private Integer testCommentRelationshipId;
	private TestComment testCommentByParentTestCommentId;
	private TestComment testCommentByChildTestCommentId;
	private String testCommentRelationshipDesc;

	public TestCommentRelationship() {
	}

	public TestCommentRelationship(TestComment testCommentByParentTestCommentId,
			TestComment testCommentByChildTestCommentId, String testCommentRelationshipDesc) {
		this.testCommentByParentTestCommentId = testCommentByParentTestCommentId;
		this.testCommentByChildTestCommentId = testCommentByChildTestCommentId;
		this.testCommentRelationshipDesc = testCommentRelationshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "test_comment_relationship_id", unique = true, nullable = false)
	public Integer getTestCommentRelationshipId() {
		return this.testCommentRelationshipId;
	}

	public void setTestCommentRelationshipId(Integer testCommentRelationshipId) {
		this.testCommentRelationshipId = testCommentRelationshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_test_comment_id")
	public TestComment getTestCommentByParentTestCommentId() {
		return this.testCommentByParentTestCommentId;
	}

	public void setTestCommentByParentTestCommentId(TestComment testCommentByParentTestCommentId) {
		this.testCommentByParentTestCommentId = testCommentByParentTestCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_test_comment_id")
	public TestComment getTestCommentByChildTestCommentId() {
		return this.testCommentByChildTestCommentId;
	}

	public void setTestCommentByChildTestCommentId(TestComment testCommentByChildTestCommentId) {
		this.testCommentByChildTestCommentId = testCommentByChildTestCommentId;
	}

	@Column(name = "test_comment_relationship_desc", length = 65535)
	public String getTestCommentRelationshipDesc() {
		return this.testCommentRelationshipDesc;
	}

	public void setTestCommentRelationshipDesc(String testCommentRelationshipDesc) {
		this.testCommentRelationshipDesc = testCommentRelationshipDesc;
	}

}
