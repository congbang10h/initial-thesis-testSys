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
 * Test generated by hbm2java
 */
@Entity
@Table(name = "test", catalog = "testts")
public class Test implements java.io.Serializable {

	private Integer testId;
	private Course course;
	private User user;
	private String testCode;
	private String testHeader;
	private String testFooter;
	private String testDesc;
	private Date testCreationTime;
	private Date testStartTime;
	private Date testEndTime;
	private int testDuration;
	private Set<TakerTestMap> takerTestMaps = new HashSet<TakerTestMap>(0);
	private Set<TestAccessMode> testAccessModes = new HashSet<TestAccessMode>(0);
	private Set<TestSection> testSections = new HashSet<TestSection>(0);
	private Set<TestReview> testReviews = new HashSet<TestReview>(0);

	public Test() {
	}

	public Test(String testCode, String testHeader, String testFooter, Date testStartTime, Date testEndTime,
			int testDuration) {
		this.testCode = testCode;
		this.testHeader = testHeader;
		this.testFooter = testFooter;
		this.testStartTime = testStartTime;
		this.testEndTime = testEndTime;
		this.testDuration = testDuration;
	}

	public Test(Course course, User user, String testCode, String testHeader, String testFooter, String testDesc,
			Date testCreationTime, Date testStartTime, Date testEndTime, int testDuration,
			Set<TakerTestMap> takerTestMaps, Set<TestAccessMode> testAccessModes, Set<TestSection> testSections,
			Set<TestReview> testReviews) {
		this.course = course;
		this.user = user;
		this.testCode = testCode;
		this.testHeader = testHeader;
		this.testFooter = testFooter;
		this.testDesc = testDesc;
		this.testCreationTime = testCreationTime;
		this.testStartTime = testStartTime;
		this.testEndTime = testEndTime;
		this.testDuration = testDuration;
		this.takerTestMaps = takerTestMaps;
		this.testAccessModes = testAccessModes;
		this.testSections = testSections;
		this.testReviews = testReviews;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "test_id", unique = true, nullable = false)
	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
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
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "test_code", nullable = false, length = 10)
	public String getTestCode() {
		return this.testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	@Column(name = "test_header", nullable = false, length = 65535)
	public String getTestHeader() {
		return this.testHeader;
	}

	public void setTestHeader(String testHeader) {
		this.testHeader = testHeader;
	}

	@Column(name = "test_footer", nullable = false, length = 65535)
	public String getTestFooter() {
		return this.testFooter;
	}

	public void setTestFooter(String testFooter) {
		this.testFooter = testFooter;
	}

	@Column(name = "test_desc", length = 65535)
	public String getTestDesc() {
		return this.testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "test_creation_time", length = 19)
	public Date getTestCreationTime() {
		return this.testCreationTime;
	}

	public void setTestCreationTime(Date testCreationTime) {
		this.testCreationTime = testCreationTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "test_start_time", nullable = false, length = 19)
	public Date getTestStartTime() {
		return this.testStartTime;
	}

	public void setTestStartTime(Date testStartTime) {
		this.testStartTime = testStartTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "test_end_time", nullable = false, length = 19)
	public Date getTestEndTime() {
		return this.testEndTime;
	}

	public void setTestEndTime(Date testEndTime) {
		this.testEndTime = testEndTime;
	}

	@Column(name = "test_duration", nullable = false)
	public int getTestDuration() {
		return this.testDuration;
	}

	public void setTestDuration(int testDuration) {
		this.testDuration = testDuration;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TakerTestMap> getTakerTestMaps() {
		return this.takerTestMaps;
	}

	public void setTakerTestMaps(Set<TakerTestMap> takerTestMaps) {
		this.takerTestMaps = takerTestMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestAccessMode> getTestAccessModes() {
		return this.testAccessModes;
	}

	public void setTestAccessModes(Set<TestAccessMode> testAccessModes) {
		this.testAccessModes = testAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestSection> getTestSections() {
		return this.testSections;
	}

	public void setTestSections(Set<TestSection> testSections) {
		this.testSections = testSections;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestReview> getTestReviews() {
		return this.testReviews;
	}

	public void setTestReviews(Set<TestReview> testReviews) {
		this.testReviews = testReviews;
	}

}