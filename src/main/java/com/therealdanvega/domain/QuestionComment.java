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
 * QuestionComment generated by hbm2java
 */
@Entity
@Table(name = "question_comment", catalog = "mycontact")
public class QuestionComment implements java.io.Serializable {

	private Integer questionCommentId;
	private Question question;
	private TestComment testComment;
	private TestReviewerDecision testReviewerDecision;
	private Date questionCommentDate;
	private Date questionCommentTime;
	private String questionCommentDesc;
	private Set<QuestionCommentRelationship> questionCommentRelationshipsForParentQuestionCommentId = new HashSet<QuestionCommentRelationship>(
			0);
	private Set<QuestionCommentRelationship> questionCommentRelationshipsForParentQuestionCommentId_1 = new HashSet<QuestionCommentRelationship>(
			0);
	private Set<QuestionCommentRelationship> questionCommentRelationshipsForChildQuestionCommentId = new HashSet<QuestionCommentRelationship>(
			0);
	private Set<QuestionCommentRelationship> questionCommentRelationshipsForChildQuestionCommentId_1 = new HashSet<QuestionCommentRelationship>(
			0);

	public QuestionComment() {
	}

	public QuestionComment(Question question, Date questionCommentDate, Date questionCommentTime,
			String questionCommentDesc) {
		this.question = question;
		this.questionCommentDate = questionCommentDate;
		this.questionCommentTime = questionCommentTime;
		this.questionCommentDesc = questionCommentDesc;
	}

	public QuestionComment(Question question, TestComment testComment, TestReviewerDecision testReviewerDecision,
			Date questionCommentDate, Date questionCommentTime, String questionCommentDesc,
			Set<QuestionCommentRelationship> questionCommentRelationshipsForParentQuestionCommentId,
			Set<QuestionCommentRelationship> questionCommentRelationshipsForParentQuestionCommentId_1,
			Set<QuestionCommentRelationship> questionCommentRelationshipsForChildQuestionCommentId,
			Set<QuestionCommentRelationship> questionCommentRelationshipsForChildQuestionCommentId_1) {
		this.question = question;
		this.testComment = testComment;
		this.testReviewerDecision = testReviewerDecision;
		this.questionCommentDate = questionCommentDate;
		this.questionCommentTime = questionCommentTime;
		this.questionCommentDesc = questionCommentDesc;
		this.questionCommentRelationshipsForParentQuestionCommentId = questionCommentRelationshipsForParentQuestionCommentId;
		this.questionCommentRelationshipsForParentQuestionCommentId_1 = questionCommentRelationshipsForParentQuestionCommentId_1;
		this.questionCommentRelationshipsForChildQuestionCommentId = questionCommentRelationshipsForChildQuestionCommentId;
		this.questionCommentRelationshipsForChildQuestionCommentId_1 = questionCommentRelationshipsForChildQuestionCommentId_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_comment_id", unique = true, nullable = false)
	public Integer getQuestionCommentId() {
		return this.questionCommentId;
	}

	public void setQuestionCommentId(Integer questionCommentId) {
		this.questionCommentId = questionCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id", nullable = false)
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "test_comment_id")
	public TestComment getTestComment() {
		return this.testComment;
	}

	public void setTestComment(TestComment testComment) {
		this.testComment = testComment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "test_reviewer_decision_id")
	public TestReviewerDecision getTestReviewerDecision() {
		return this.testReviewerDecision;
	}

	public void setTestReviewerDecision(TestReviewerDecision testReviewerDecision) {
		this.testReviewerDecision = testReviewerDecision;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "question_comment_date", nullable = false, length = 10)
	public Date getQuestionCommentDate() {
		return this.questionCommentDate;
	}

	public void setQuestionCommentDate(Date questionCommentDate) {
		this.questionCommentDate = questionCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "question_comment_time", nullable = false, length = 8)
	public Date getQuestionCommentTime() {
		return this.questionCommentTime;
	}

	public void setQuestionCommentTime(Date questionCommentTime) {
		this.questionCommentTime = questionCommentTime;
	}

	@Column(name = "question_comment_desc", nullable = false, length = 65535)
	public String getQuestionCommentDesc() {
		return this.questionCommentDesc;
	}

	public void setQuestionCommentDesc(String questionCommentDesc) {
		this.questionCommentDesc = questionCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionCommentByParentQuestionCommentId")
	public Set<QuestionCommentRelationship> getQuestionCommentRelationshipsForParentQuestionCommentId() {
		return this.questionCommentRelationshipsForParentQuestionCommentId;
	}

	public void setQuestionCommentRelationshipsForParentQuestionCommentId(
			Set<QuestionCommentRelationship> questionCommentRelationshipsForParentQuestionCommentId) {
		this.questionCommentRelationshipsForParentQuestionCommentId = questionCommentRelationshipsForParentQuestionCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionCommentByParentQuestionCommentId")
	public Set<QuestionCommentRelationship> getQuestionCommentRelationshipsForParentQuestionCommentId_1() {
		return this.questionCommentRelationshipsForParentQuestionCommentId_1;
	}

	public void setQuestionCommentRelationshipsForParentQuestionCommentId_1(
			Set<QuestionCommentRelationship> questionCommentRelationshipsForParentQuestionCommentId_1) {
		this.questionCommentRelationshipsForParentQuestionCommentId_1 = questionCommentRelationshipsForParentQuestionCommentId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionCommentByChildQuestionCommentId")
	public Set<QuestionCommentRelationship> getQuestionCommentRelationshipsForChildQuestionCommentId() {
		return this.questionCommentRelationshipsForChildQuestionCommentId;
	}

	public void setQuestionCommentRelationshipsForChildQuestionCommentId(
			Set<QuestionCommentRelationship> questionCommentRelationshipsForChildQuestionCommentId) {
		this.questionCommentRelationshipsForChildQuestionCommentId = questionCommentRelationshipsForChildQuestionCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionCommentByChildQuestionCommentId")
	public Set<QuestionCommentRelationship> getQuestionCommentRelationshipsForChildQuestionCommentId_1() {
		return this.questionCommentRelationshipsForChildQuestionCommentId_1;
	}

	public void setQuestionCommentRelationshipsForChildQuestionCommentId_1(
			Set<QuestionCommentRelationship> questionCommentRelationshipsForChildQuestionCommentId_1) {
		this.questionCommentRelationshipsForChildQuestionCommentId_1 = questionCommentRelationshipsForChildQuestionCommentId_1;
	}

}
