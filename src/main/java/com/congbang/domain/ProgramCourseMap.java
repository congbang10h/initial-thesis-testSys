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
 * ProgramCourseMap generated by hbm2java
 */
@Entity
@Table(name = "program_course_map", catalog = "testts")
public class ProgramCourseMap implements java.io.Serializable {

	private Integer pcmId;
	private Course course;
	private CourseRequiredLevel courseRequiredLevel;
	private EducationalProgram educationalProgram;
	private byte pcmTimeIndex;

	public ProgramCourseMap() {
	}

	public ProgramCourseMap(byte pcmTimeIndex) {
		this.pcmTimeIndex = pcmTimeIndex;
	}

	public ProgramCourseMap(Course course, CourseRequiredLevel courseRequiredLevel,
			EducationalProgram educationalProgram, byte pcmTimeIndex) {
		this.course = course;
		this.courseRequiredLevel = courseRequiredLevel;
		this.educationalProgram = educationalProgram;
		this.pcmTimeIndex = pcmTimeIndex;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "pcm_id", unique = true, nullable = false)
	public Integer getPcmId() {
		return this.pcmId;
	}

	public void setPcmId(Integer pcmId) {
		this.pcmId = pcmId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_required_level_id")
	public CourseRequiredLevel getCourseRequiredLevel() {
		return this.courseRequiredLevel;
	}

	public void setCourseRequiredLevel(CourseRequiredLevel courseRequiredLevel) {
		this.courseRequiredLevel = courseRequiredLevel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edu_program_id")
	public EducationalProgram getEducationalProgram() {
		return this.educationalProgram;
	}

	public void setEducationalProgram(EducationalProgram educationalProgram) {
		this.educationalProgram = educationalProgram;
	}

	@Column(name = "pcm_time_index", nullable = false)
	public byte getPcmTimeIndex() {
		return this.pcmTimeIndex;
	}

	public void setPcmTimeIndex(byte pcmTimeIndex) {
		this.pcmTimeIndex = pcmTimeIndex;
	}

}
