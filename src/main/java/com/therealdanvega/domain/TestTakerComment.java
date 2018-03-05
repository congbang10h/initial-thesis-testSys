package com.therealdanvega.domain;
// Generated Mar 4, 2018 2:56:35 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TestTakerComment generated by hbm2java
 */
@Entity
@Table(name = "test_taker_comment", catalog = "mycontact")
public class TestTakerComment implements java.io.Serializable {

	private Integer testTakerCommentId;
	private TakerTestMap takerTestMap;
	private Date testTakerCommentDate;
	private Date testTakerCommentTime;
	private String testTakerCommentDesc;
	private Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForChildTestTakerCommentId = new HashSet<TestTakerCommentRelationship>(
			0);
	private Set<QuestionTakerComment> questionTakerComments = new HashSet<QuestionTakerComment>(0);
	private Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForParentTestTakerCommentId = new HashSet<TestTakerCommentRelationship>(
			0);
	private Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForParentTestTakerCommentId_1 = new HashSet<TestTakerCommentRelationship>(
			0);
	private Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForChildTestTakerCommentId_1 = new HashSet<TestTakerCommentRelationship>(
			0);
	private Set<QuestionTakerComment> questionTakerComments_1 = new HashSet<QuestionTakerComment>(0);

	public TestTakerComment() {
	}

	public TestTakerComment(Date testTakerCommentDate, String testTakerCommentDesc) {
		this.testTakerCommentDate = testTakerCommentDate;
		this.testTakerCommentDesc = testTakerCommentDesc;
	}

	public TestTakerComment(TakerTestMap takerTestMap, Date testTakerCommentDate, Date testTakerCommentTime,
			String testTakerCommentDesc,
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForChildTestTakerCommentId,
			Set<QuestionTakerComment> questionTakerComments,
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForParentTestTakerCommentId,
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForParentTestTakerCommentId_1,
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForChildTestTakerCommentId_1,
			Set<QuestionTakerComment> questionTakerComments_1) {
		this.takerTestMap = takerTestMap;
		this.testTakerCommentDate = testTakerCommentDate;
		this.testTakerCommentTime = testTakerCommentTime;
		this.testTakerCommentDesc = testTakerCommentDesc;
		this.testTakerCommentRelationshipsForChildTestTakerCommentId = testTakerCommentRelationshipsForChildTestTakerCommentId;
		this.questionTakerComments = questionTakerComments;
		this.testTakerCommentRelationshipsForParentTestTakerCommentId = testTakerCommentRelationshipsForParentTestTakerCommentId;
		this.testTakerCommentRelationshipsForParentTestTakerCommentId_1 = testTakerCommentRelationshipsForParentTestTakerCommentId_1;
		this.testTakerCommentRelationshipsForChildTestTakerCommentId_1 = testTakerCommentRelationshipsForChildTestTakerCommentId_1;
		this.questionTakerComments_1 = questionTakerComments_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "test_taker_comment_id", unique = true, nullable = false)
	public Integer getTestTakerCommentId() {
		return this.testTakerCommentId;
	}

	public void setTestTakerCommentId(Integer testTakerCommentId) {
		this.testTakerCommentId = testTakerCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taker_test_map_id")
	public TakerTestMap getTakerTestMap() {
		return this.takerTestMap;
	}

	public void setTakerTestMap(TakerTestMap takerTestMap) {
		this.takerTestMap = takerTestMap;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "test_taker_comment_date", nullable = false, length = 10)
	public Date getTestTakerCommentDate() {
		return this.testTakerCommentDate;
	}

	public void setTestTakerCommentDate(Date testTakerCommentDate) {
		this.testTakerCommentDate = testTakerCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "test_taker_comment_time", length = 8)
	public Date getTestTakerCommentTime() {
		return this.testTakerCommentTime;
	}

	public void setTestTakerCommentTime(Date testTakerCommentTime) {
		this.testTakerCommentTime = testTakerCommentTime;
	}

	@Column(name = "test_taker_comment_desc", nullable = false, length = 65535)
	public String getTestTakerCommentDesc() {
		return this.testTakerCommentDesc;
	}

	public void setTestTakerCommentDesc(String testTakerCommentDesc) {
		this.testTakerCommentDesc = testTakerCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testTakerCommentByChildTestTakerCommentId")
	public Set<TestTakerCommentRelationship> getTestTakerCommentRelationshipsForChildTestTakerCommentId() {
		return this.testTakerCommentRelationshipsForChildTestTakerCommentId;
	}

	public void setTestTakerCommentRelationshipsForChildTestTakerCommentId(
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForChildTestTakerCommentId) {
		this.testTakerCommentRelationshipsForChildTestTakerCommentId = testTakerCommentRelationshipsForChildTestTakerCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testTakerComment")
	public Set<QuestionTakerComment> getQuestionTakerComments() {
		return this.questionTakerComments;
	}

	public void setQuestionTakerComments(Set<QuestionTakerComment> questionTakerComments) {
		this.questionTakerComments = questionTakerComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testTakerCommentByParentTestTakerCommentId")
	public Set<TestTakerCommentRelationship> getTestTakerCommentRelationshipsForParentTestTakerCommentId() {
		return this.testTakerCommentRelationshipsForParentTestTakerCommentId;
	}

	public void setTestTakerCommentRelationshipsForParentTestTakerCommentId(
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForParentTestTakerCommentId) {
		this.testTakerCommentRelationshipsForParentTestTakerCommentId = testTakerCommentRelationshipsForParentTestTakerCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testTakerCommentByParentTestTakerCommentId")
	public Set<TestTakerCommentRelationship> getTestTakerCommentRelationshipsForParentTestTakerCommentId_1() {
		return this.testTakerCommentRelationshipsForParentTestTakerCommentId_1;
	}

	public void setTestTakerCommentRelationshipsForParentTestTakerCommentId_1(
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForParentTestTakerCommentId_1) {
		this.testTakerCommentRelationshipsForParentTestTakerCommentId_1 = testTakerCommentRelationshipsForParentTestTakerCommentId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testTakerCommentByChildTestTakerCommentId")
	public Set<TestTakerCommentRelationship> getTestTakerCommentRelationshipsForChildTestTakerCommentId_1() {
		return this.testTakerCommentRelationshipsForChildTestTakerCommentId_1;
	}

	public void setTestTakerCommentRelationshipsForChildTestTakerCommentId_1(
			Set<TestTakerCommentRelationship> testTakerCommentRelationshipsForChildTestTakerCommentId_1) {
		this.testTakerCommentRelationshipsForChildTestTakerCommentId_1 = testTakerCommentRelationshipsForChildTestTakerCommentId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testTakerComment")
	public Set<QuestionTakerComment> getQuestionTakerComments_1() {
		return this.questionTakerComments_1;
	}

	public void setQuestionTakerComments_1(Set<QuestionTakerComment> questionTakerComments_1) {
		this.questionTakerComments_1 = questionTakerComments_1;
	}

}
