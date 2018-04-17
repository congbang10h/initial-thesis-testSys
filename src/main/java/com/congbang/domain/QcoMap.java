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
 * QcoMap generated by hbm2java
 */
@Entity
@Table(name = "qco_map", catalog = "testts")
public class QcoMap implements java.io.Serializable {

	private Integer qcoId;
	private CourseOutcomeItem courseOutcomeItem;
	private Question question;
	private double qcoFactor;

	public QcoMap() {
	}

	public QcoMap(double qcoFactor) {
		this.qcoFactor = qcoFactor;
	}

	public QcoMap(CourseOutcomeItem courseOutcomeItem, Question question, double qcoFactor) {
		this.courseOutcomeItem = courseOutcomeItem;
		this.question = question;
		this.qcoFactor = qcoFactor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "qco_id", unique = true, nullable = false)
	public Integer getQcoId() {
		return this.qcoId;
	}

	public void setQcoId(Integer qcoId) {
		this.qcoId = qcoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coi_id")
	public CourseOutcomeItem getCourseOutcomeItem() {
		return this.courseOutcomeItem;
	}

	public void setCourseOutcomeItem(CourseOutcomeItem courseOutcomeItem) {
		this.courseOutcomeItem = courseOutcomeItem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Column(name = "qco_factor", nullable = false, precision = 22, scale = 0)
	public double getQcoFactor() {
		return this.qcoFactor;
	}

	public void setQcoFactor(double qcoFactor) {
		this.qcoFactor = qcoFactor;
	}

}