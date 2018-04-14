package com.therealdanvega.domain;
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
 * Peo generated by hbm2java
 */
@Entity
@Table(name = "peo", catalog = "testts")
public class Peo implements java.io.Serializable {

	private Integer peoId;
	private EducationalProgram educationalProgram;
	private String peoCode;
	private Date peoDate;
	private boolean peoIsused;
	private Set<PeoMissionMapVersion> peoMissionMapVersions = new HashSet<PeoMissionMapVersion>(0);
	private Set<PeoSoMap> peoSoMaps = new HashSet<PeoSoMap>(0);
	private Set<PeoItem> peoItems = new HashSet<PeoItem>(0);

	public Peo() {
	}

	public Peo(String peoCode, Date peoDate, boolean peoIsused) {
		this.peoCode = peoCode;
		this.peoDate = peoDate;
		this.peoIsused = peoIsused;
	}

	public Peo(EducationalProgram educationalProgram, String peoCode, Date peoDate, boolean peoIsused,
			Set<PeoMissionMapVersion> peoMissionMapVersions, Set<PeoSoMap> peoSoMaps, Set<PeoItem> peoItems) {
		this.educationalProgram = educationalProgram;
		this.peoCode = peoCode;
		this.peoDate = peoDate;
		this.peoIsused = peoIsused;
		this.peoMissionMapVersions = peoMissionMapVersions;
		this.peoSoMaps = peoSoMaps;
		this.peoItems = peoItems;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "peo_id", unique = true, nullable = false)
	public Integer getPeoId() {
		return this.peoId;
	}

	public void setPeoId(Integer peoId) {
		this.peoId = peoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "edu_program_id")
	public EducationalProgram getEducationalProgram() {
		return this.educationalProgram;
	}

	public void setEducationalProgram(EducationalProgram educationalProgram) {
		this.educationalProgram = educationalProgram;
	}

	@Column(name = "peo_code", nullable = false, length = 10)
	public String getPeoCode() {
		return this.peoCode;
	}

	public void setPeoCode(String peoCode) {
		this.peoCode = peoCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "peo_date", nullable = false, length = 10)
	public Date getPeoDate() {
		return this.peoDate;
	}

	public void setPeoDate(Date peoDate) {
		this.peoDate = peoDate;
	}

	@Column(name = "peo_isused", nullable = false)
	public boolean isPeoIsused() {
		return this.peoIsused;
	}

	public void setPeoIsused(boolean peoIsused) {
		this.peoIsused = peoIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoMissionMapVersion> getPeoMissionMapVersions() {
		return this.peoMissionMapVersions;
	}

	public void setPeoMissionMapVersions(Set<PeoMissionMapVersion> peoMissionMapVersions) {
		this.peoMissionMapVersions = peoMissionMapVersions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoSoMap> getPeoSoMaps() {
		return this.peoSoMaps;
	}

	public void setPeoSoMaps(Set<PeoSoMap> peoSoMaps) {
		this.peoSoMaps = peoSoMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoItem> getPeoItems() {
		return this.peoItems;
	}

	public void setPeoItems(Set<PeoItem> peoItems) {
		this.peoItems = peoItems;
	}

}
