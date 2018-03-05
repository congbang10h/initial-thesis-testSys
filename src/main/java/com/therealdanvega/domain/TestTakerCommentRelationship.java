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
 * TestTakerCommentRelationship generated by hbm2java
 */
@Entity
@Table(name = "test_taker_comment_relationship", catalog = "mycontact")
public class TestTakerCommentRelationship implements java.io.Serializable {

	private Integer testTakerCommentRelationshipId;
	private TestTakerComment testTakerCommentByChildTestTakerCommentId;
	private TestTakerComment testTakerCommentByParentTestTakerCommentId;
	private String testTakerCommentRelationshipDesc;

	public TestTakerCommentRelationship() {
	}

	public TestTakerCommentRelationship(TestTakerComment testTakerCommentByChildTestTakerCommentId,
			TestTakerComment testTakerCommentByParentTestTakerCommentId, String testTakerCommentRelationshipDesc) {
		this.testTakerCommentByChildTestTakerCommentId = testTakerCommentByChildTestTakerCommentId;
		this.testTakerCommentByParentTestTakerCommentId = testTakerCommentByParentTestTakerCommentId;
		this.testTakerCommentRelationshipDesc = testTakerCommentRelationshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "test_taker_comment_relationship_id", unique = true, nullable = false)
	public Integer getTestTakerCommentRelationshipId() {
		return this.testTakerCommentRelationshipId;
	}

	public void setTestTakerCommentRelationshipId(Integer testTakerCommentRelationshipId) {
		this.testTakerCommentRelationshipId = testTakerCommentRelationshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_test_taker_comment_id")
	public TestTakerComment getTestTakerCommentByChildTestTakerCommentId() {
		return this.testTakerCommentByChildTestTakerCommentId;
	}

	public void setTestTakerCommentByChildTestTakerCommentId(
			TestTakerComment testTakerCommentByChildTestTakerCommentId) {
		this.testTakerCommentByChildTestTakerCommentId = testTakerCommentByChildTestTakerCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_test_taker_comment_id")
	public TestTakerComment getTestTakerCommentByParentTestTakerCommentId() {
		return this.testTakerCommentByParentTestTakerCommentId;
	}

	public void setTestTakerCommentByParentTestTakerCommentId(
			TestTakerComment testTakerCommentByParentTestTakerCommentId) {
		this.testTakerCommentByParentTestTakerCommentId = testTakerCommentByParentTestTakerCommentId;
	}

	@Column(name = "test_taker_comment_relationship_desc", length = 65535)
	public String getTestTakerCommentRelationshipDesc() {
		return this.testTakerCommentRelationshipDesc;
	}

	public void setTestTakerCommentRelationshipDesc(String testTakerCommentRelationshipDesc) {
		this.testTakerCommentRelationshipDesc = testTakerCommentRelationshipDesc;
	}

}
