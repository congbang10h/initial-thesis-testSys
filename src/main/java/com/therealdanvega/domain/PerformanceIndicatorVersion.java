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
 * PerformanceIndicatorVersion generated by hbm2java
 */
@Entity
@Table(name = "performance_indicator_version", catalog = "mycontact")
public class PerformanceIndicatorVersion implements java.io.Serializable {

	private Integer performanceIndicatorVersionId;
	private StudentOutcome studentOutcome;
	private String performanceIndicatorVersionCode;
	private Date performanceIndicatorVersionDate;
	private boolean performanceIndicatorVersionIsused;
	private Set<PerformanceIndicator> performanceIndicators = new HashSet<PerformanceIndicator>(0);
	private Set<PerformanceIndicator> performanceIndicators_1 = new HashSet<PerformanceIndicator>(0);

	public PerformanceIndicatorVersion() {
	}

	public PerformanceIndicatorVersion(String performanceIndicatorVersionCode, Date performanceIndicatorVersionDate,
			boolean performanceIndicatorVersionIsused) {
		this.performanceIndicatorVersionCode = performanceIndicatorVersionCode;
		this.performanceIndicatorVersionDate = performanceIndicatorVersionDate;
		this.performanceIndicatorVersionIsused = performanceIndicatorVersionIsused;
	}

	public PerformanceIndicatorVersion(StudentOutcome studentOutcome, String performanceIndicatorVersionCode,
			Date performanceIndicatorVersionDate, boolean performanceIndicatorVersionIsused,
			Set<PerformanceIndicator> performanceIndicators, Set<PerformanceIndicator> performanceIndicators_1) {
		this.studentOutcome = studentOutcome;
		this.performanceIndicatorVersionCode = performanceIndicatorVersionCode;
		this.performanceIndicatorVersionDate = performanceIndicatorVersionDate;
		this.performanceIndicatorVersionIsused = performanceIndicatorVersionIsused;
		this.performanceIndicators = performanceIndicators;
		this.performanceIndicators_1 = performanceIndicators_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "performance_indicator_version_id", unique = true, nullable = false)
	public Integer getPerformanceIndicatorVersionId() {
		return this.performanceIndicatorVersionId;
	}

	public void setPerformanceIndicatorVersionId(Integer performanceIndicatorVersionId) {
		this.performanceIndicatorVersionId = performanceIndicatorVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "so_id")
	public StudentOutcome getStudentOutcome() {
		return this.studentOutcome;
	}

	public void setStudentOutcome(StudentOutcome studentOutcome) {
		this.studentOutcome = studentOutcome;
	}

	@Column(name = "performance_indicator_version_code", nullable = false, length = 10)
	public String getPerformanceIndicatorVersionCode() {
		return this.performanceIndicatorVersionCode;
	}

	public void setPerformanceIndicatorVersionCode(String performanceIndicatorVersionCode) {
		this.performanceIndicatorVersionCode = performanceIndicatorVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "performance_indicator_version_date", nullable = false, length = 10)
	public Date getPerformanceIndicatorVersionDate() {
		return this.performanceIndicatorVersionDate;
	}

	public void setPerformanceIndicatorVersionDate(Date performanceIndicatorVersionDate) {
		this.performanceIndicatorVersionDate = performanceIndicatorVersionDate;
	}

	@Column(name = "performance_indicator_version_isused", nullable = false)
	public boolean isPerformanceIndicatorVersionIsused() {
		return this.performanceIndicatorVersionIsused;
	}

	public void setPerformanceIndicatorVersionIsused(boolean performanceIndicatorVersionIsused) {
		this.performanceIndicatorVersionIsused = performanceIndicatorVersionIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "performanceIndicatorVersion")
	public Set<PerformanceIndicator> getPerformanceIndicators() {
		return this.performanceIndicators;
	}

	public void setPerformanceIndicators(Set<PerformanceIndicator> performanceIndicators) {
		this.performanceIndicators = performanceIndicators;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "performanceIndicatorVersion")
	public Set<PerformanceIndicator> getPerformanceIndicators_1() {
		return this.performanceIndicators_1;
	}

	public void setPerformanceIndicators_1(Set<PerformanceIndicator> performanceIndicators_1) {
		this.performanceIndicators_1 = performanceIndicators_1;
	}

}
