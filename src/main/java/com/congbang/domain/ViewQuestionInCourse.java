package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ViewQuestionInCourse generated by hbm2java
 */
@Entity
@Table(name = "_view_question_in_course", catalog = "testts")
public class ViewQuestionInCourse implements java.io.Serializable {

	private ViewQuestionInCourseId id;

	public ViewQuestionInCourse() {
	}

	public ViewQuestionInCourse(ViewQuestionInCourseId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "courseContentId", column = @Column(name = "course_content_id", nullable = false)),
			@AttributeOverride(name = "courseId", column = @Column(name = "course_id")),
			@AttributeOverride(name = "questionId", column = @Column(name = "question_id", nullable = false)),
			@AttributeOverride(name = "questionTypeId", column = @Column(name = "question_type_id", nullable = false)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id")),
			@AttributeOverride(name = "bloomLevelId", column = @Column(name = "bloom_level_id", nullable = false)),
			@AttributeOverride(name = "questionDesc", column = @Column(name = "question_desc", length = 65535)),
			@AttributeOverride(name = "questionInTest", column = @Column(name = "question_in_test")) })
	public ViewQuestionInCourseId getId() {
		return this.id;
	}

	public void setId(ViewQuestionInCourseId id) {
		this.id = id;
	}

}