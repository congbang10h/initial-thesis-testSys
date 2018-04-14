package com.therealdanvega.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TestQues generated by hbm2java
 */
@Entity
@Table(name = "_test_ques", catalog = "testts")
public class TestQues implements java.io.Serializable {

	private int questionId;

	public TestQues() {
	}

	public TestQues(int questionId) {
		this.questionId = questionId;
	}

	@Id

	@Column(name = "question_id", unique = true, nullable = false)
	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

}
