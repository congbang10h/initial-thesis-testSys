package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

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
 * StudentOutcome generated by hbm2java
 */
@Entity
@Table(name = "student_outcome", catalog = "testts")
public class StudentOutcome implements java.io.Serializable {

	private Integer soId;
	private EducationalProgram educationalProgram;
	private String soCode;
	private Date soDate;
	private boolean soIsused;
	private Set<CoSoMap> coSoMaps = new HashSet<CoSoMap>(0);
	private Set<StudentOutcomeItem> studentOutcomeItems = new HashSet<StudentOutcomeItem>(0);
	private Set<PeoSoMap> peoSoMaps = new HashSet<PeoSoMap>(0);

	public StudentOutcome() {
	}

	public StudentOutcome(String soCode, Date soDate, boolean soIsused) {
		this.soCode = soCode;
		this.soDate = soDate;
		this.soIsused = soIsused;
	}

	public StudentOutcome(EducationalProgram educationalProgram, String soCode, Date soDate, boolean soIsused,
			Set<CoSoMap> coSoMaps, Set<StudentOutcomeItem> studentOutcomeItems, Set<PeoSoMap> peoSoMaps) {
		this.educationalProgram = educationalProgram;
		this.soCode = soCode;
		this.soDate = soDate;
		this.soIsused = soIsused;
		this.coSoMaps = coSoMaps;
		this.studentOutcomeItems = studentOutcomeItems;
		this.peoSoMaps = peoSoMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "so_id", unique = true, nullable = false)
	public Integer getSoId() {
		return this.soId;
	}

	public void setSoId(Integer soId) {
		this.soId = soId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edu_program_id")
	public EducationalProgram getEducationalProgram() {
		return this.educationalProgram;
	}

	public void setEducationalProgram(EducationalProgram educationalProgram) {
		this.educationalProgram = educationalProgram;
	}

	@Column(name = "so_code", nullable = false, length = 10)
	public String getSoCode() {
		return this.soCode;
	}

	public void setSoCode(String soCode) {
		this.soCode = soCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "so_date", nullable = false, length = 10)
	public Date getSoDate() {
		return this.soDate;
	}

	public void setSoDate(Date soDate) {
		this.soDate = soDate;
	}

	@Column(name = "so_isused", nullable = false)
	public boolean isSoIsused() {
		return this.soIsused;
	}

	public void setSoIsused(boolean soIsused) {
		this.soIsused = soIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<CoSoMap> getCoSoMaps() {
		return this.coSoMaps;
	}

	public void setCoSoMaps(Set<CoSoMap> coSoMaps) {
		this.coSoMaps = coSoMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<StudentOutcomeItem> getStudentOutcomeItems() {
		return this.studentOutcomeItems;
	}

	public void setStudentOutcomeItems(Set<StudentOutcomeItem> studentOutcomeItems) {
		this.studentOutcomeItems = studentOutcomeItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentOutcome")
	public Set<PeoSoMap> getPeoSoMaps() {
		return this.peoSoMaps;
	}

	public void setPeoSoMaps(Set<PeoSoMap> peoSoMaps) {
		this.peoSoMaps = peoSoMaps;
	}

}
