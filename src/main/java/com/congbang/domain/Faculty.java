package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

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

/**
 * Faculty generated by hbm2java
 */
@Entity
@Table(name = "faculty", catalog = "testts")
public class Faculty implements java.io.Serializable {

	private Integer facultyId;
	private University university;
	private String facultyCode;
	private String facultyNameVn;
	private String facultyNameEn;
	private Set<Department> departments = new HashSet<Department>(0);
	private Set<EducationalProgram> educationalPrograms = new HashSet<EducationalProgram>(0);

	public Faculty() {
	}

	public Faculty(String facultyCode, String facultyNameVn, String facultyNameEn) {
		this.facultyCode = facultyCode;
		this.facultyNameVn = facultyNameVn;
		this.facultyNameEn = facultyNameEn;
	}

	public Faculty(University university, String facultyCode, String facultyNameVn, String facultyNameEn,
			Set<Department> departments, Set<EducationalProgram> educationalPrograms) {
		this.university = university;
		this.facultyCode = facultyCode;
		this.facultyNameVn = facultyNameVn;
		this.facultyNameEn = facultyNameEn;
		this.departments = departments;
		this.educationalPrograms = educationalPrograms;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "faculty_id", unique = true, nullable = false)
	public Integer getFacultyId() {
		return this.facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "univ_id")
	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Column(name = "faculty_code", nullable = false, length = 5)
	public String getFacultyCode() {
		return this.facultyCode;
	}

	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}

	@Column(name = "faculty_name_vn", nullable = false, length = 65535)
	public String getFacultyNameVn() {
		return this.facultyNameVn;
	}

	public void setFacultyNameVn(String facultyNameVn) {
		this.facultyNameVn = facultyNameVn;
	}

	@Column(name = "faculty_name_en", nullable = false, length = 65535)
	public String getFacultyNameEn() {
		return this.facultyNameEn;
	}

	public void setFacultyNameEn(String facultyNameEn) {
		this.facultyNameEn = facultyNameEn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "faculty")
	public Set<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "faculty")
	public Set<EducationalProgram> getEducationalPrograms() {
		return this.educationalPrograms;
	}

	public void setEducationalPrograms(Set<EducationalProgram> educationalPrograms) {
		this.educationalPrograms = educationalPrograms;
	}

}
