package com.therealdanvega.domain;
// Generated Mar 4, 2018 2:56:35 PM by Hibernate Tools 4.3.5.Final

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
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question", catalog = "mycontact")
public class Question implements java.io.Serializable {

	private Integer questionId;
	private BloomLevel bloomLevel;
	private QuestionTypeDict questionTypeDict;
	private User user;
	private String questionDesc;
	private boolean questionInTest;
	private Set<Qsolution> qsolutions = new HashSet<Qsolution>(0);
	private Set<QgroupQuestionMap> qgroupQuestionMaps = new HashSet<QgroupQuestionMap>(0);
	private Set<QuestionTakerComment> questionTakerComments = new HashSet<QuestionTakerComment>(0);
	private Set<QuestionTakerComment> questionTakerComments_1 = new HashSet<QuestionTakerComment>(0);
	private Set<QuestionAccessMode> questionAccessModes = new HashSet<QuestionAccessMode>(0);
	private Set<QuestionCourseoutcomeMap> questionCourseoutcomeMaps = new HashSet<QuestionCourseoutcomeMap>(0);
	private Set<TestQuestionMap> testQuestionMapsForTestmodeQuestionId = new HashSet<TestQuestionMap>(0);
	private Set<QgroupQuestionMap> qgroupQuestionMaps_1 = new HashSet<QgroupQuestionMap>(0);
	private Set<QuestionComment> questionComments = new HashSet<QuestionComment>(0);
	private Set<QuestionCourseoutcomeMap> questionCourseoutcomeMaps_1 = new HashSet<QuestionCourseoutcomeMap>(0);
	private Set<QuestionContentMap> questionContentMaps = new HashSet<QuestionContentMap>(0);
	private Set<Qsolution> qsolutions_1 = new HashSet<Qsolution>(0);
	private Set<QuestionTopicMap> questionTopicMaps = new HashSet<QuestionTopicMap>(0);
	private Set<QuestionItem> questionItems = new HashSet<QuestionItem>(0);
	private Set<QuestionComment> questionComments_1 = new HashSet<QuestionComment>(0);
	private Set<TakerSolution> takerSolutions = new HashSet<TakerSolution>(0);
	private Set<QuestionTopicMap> questionTopicMaps_1 = new HashSet<QuestionTopicMap>(0);
	private Set<QuestionContentMap> questionContentMaps_1 = new HashSet<QuestionContentMap>(0);
	private Set<TestQuestionMap> testQuestionMapsForEditmodeQuestionId = new HashSet<TestQuestionMap>(0);
	private Set<QuestionInfo> questionInfos = new HashSet<QuestionInfo>(0);
	private Set<QuestionItem> questionItems_1 = new HashSet<QuestionItem>(0);
	private Set<QuestionInfo> questionInfos_1 = new HashSet<QuestionInfo>(0);
	private Set<QuestionAccessMode> questionAccessModes_1 = new HashSet<QuestionAccessMode>(0);
	private Set<TakerSolution> takerSolutions_1 = new HashSet<TakerSolution>(0);
	private Set<TestQuestionMap> testQuestionMapsForEditmodeQuestionId_1 = new HashSet<TestQuestionMap>(0);
	private Set<TestQuestionMap> testQuestionMapsForTestmodeQuestionId_1 = new HashSet<TestQuestionMap>(0);

	public Question() {
	}

	public Question(BloomLevel bloomLevel, QuestionTypeDict questionTypeDict, boolean questionInTest) {
		this.bloomLevel = bloomLevel;
		this.questionTypeDict = questionTypeDict;
		this.questionInTest = questionInTest;
	}

	public Question(BloomLevel bloomLevel, QuestionTypeDict questionTypeDict, User user, String questionDesc,
			boolean questionInTest, Set<Qsolution> qsolutions, Set<QgroupQuestionMap> qgroupQuestionMaps,
			Set<QuestionTakerComment> questionTakerComments, Set<QuestionTakerComment> questionTakerComments_1,
			Set<QuestionAccessMode> questionAccessModes, Set<QuestionCourseoutcomeMap> questionCourseoutcomeMaps,
			Set<TestQuestionMap> testQuestionMapsForTestmodeQuestionId, Set<QgroupQuestionMap> qgroupQuestionMaps_1,
			Set<QuestionComment> questionComments, Set<QuestionCourseoutcomeMap> questionCourseoutcomeMaps_1,
			Set<QuestionContentMap> questionContentMaps, Set<Qsolution> qsolutions_1,
			Set<QuestionTopicMap> questionTopicMaps, Set<QuestionItem> questionItems,
			Set<QuestionComment> questionComments_1, Set<TakerSolution> takerSolutions,
			Set<QuestionTopicMap> questionTopicMaps_1, Set<QuestionContentMap> questionContentMaps_1,
			Set<TestQuestionMap> testQuestionMapsForEditmodeQuestionId, Set<QuestionInfo> questionInfos,
			Set<QuestionItem> questionItems_1, Set<QuestionInfo> questionInfos_1,
			Set<QuestionAccessMode> questionAccessModes_1, Set<TakerSolution> takerSolutions_1,
			Set<TestQuestionMap> testQuestionMapsForEditmodeQuestionId_1,
			Set<TestQuestionMap> testQuestionMapsForTestmodeQuestionId_1) {
		this.bloomLevel = bloomLevel;
		this.questionTypeDict = questionTypeDict;
		this.user = user;
		this.questionDesc = questionDesc;
		this.questionInTest = questionInTest;
		this.qsolutions = qsolutions;
		this.qgroupQuestionMaps = qgroupQuestionMaps;
		this.questionTakerComments = questionTakerComments;
		this.questionTakerComments_1 = questionTakerComments_1;
		this.questionAccessModes = questionAccessModes;
		this.questionCourseoutcomeMaps = questionCourseoutcomeMaps;
		this.testQuestionMapsForTestmodeQuestionId = testQuestionMapsForTestmodeQuestionId;
		this.qgroupQuestionMaps_1 = qgroupQuestionMaps_1;
		this.questionComments = questionComments;
		this.questionCourseoutcomeMaps_1 = questionCourseoutcomeMaps_1;
		this.questionContentMaps = questionContentMaps;
		this.qsolutions_1 = qsolutions_1;
		this.questionTopicMaps = questionTopicMaps;
		this.questionItems = questionItems;
		this.questionComments_1 = questionComments_1;
		this.takerSolutions = takerSolutions;
		this.questionTopicMaps_1 = questionTopicMaps_1;
		this.questionContentMaps_1 = questionContentMaps_1;
		this.testQuestionMapsForEditmodeQuestionId = testQuestionMapsForEditmodeQuestionId;
		this.questionInfos = questionInfos;
		this.questionItems_1 = questionItems_1;
		this.questionInfos_1 = questionInfos_1;
		this.questionAccessModes_1 = questionAccessModes_1;
		this.takerSolutions_1 = takerSolutions_1;
		this.testQuestionMapsForEditmodeQuestionId_1 = testQuestionMapsForEditmodeQuestionId_1;
		this.testQuestionMapsForTestmodeQuestionId_1 = testQuestionMapsForTestmodeQuestionId_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_id", unique = true, nullable = false)
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bloom_level_id", nullable = false)
	public BloomLevel getBloomLevel() {
		return this.bloomLevel;
	}

	public void setBloomLevel(BloomLevel bloomLevel) {
		this.bloomLevel = bloomLevel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_type_id", nullable = false)
	public QuestionTypeDict getQuestionTypeDict() {
		return this.questionTypeDict;
	}

	public void setQuestionTypeDict(QuestionTypeDict questionTypeDict) {
		this.questionTypeDict = questionTypeDict;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "question_desc", length = 65535)
	public String getQuestionDesc() {
		return this.questionDesc;
	}

	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}

	@Column(name = "question_in_test", nullable = false)
	public boolean isQuestionInTest() {
		return this.questionInTest;
	}

	public void setQuestionInTest(boolean questionInTest) {
		this.questionInTest = questionInTest;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Qsolution> getQsolutions() {
		return this.qsolutions;
	}

	public void setQsolutions(Set<Qsolution> qsolutions) {
		this.qsolutions = qsolutions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QgroupQuestionMap> getQgroupQuestionMaps() {
		return this.qgroupQuestionMaps;
	}

	public void setQgroupQuestionMaps(Set<QgroupQuestionMap> qgroupQuestionMaps) {
		this.qgroupQuestionMaps = qgroupQuestionMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionTakerComment> getQuestionTakerComments() {
		return this.questionTakerComments;
	}

	public void setQuestionTakerComments(Set<QuestionTakerComment> questionTakerComments) {
		this.questionTakerComments = questionTakerComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionTakerComment> getQuestionTakerComments_1() {
		return this.questionTakerComments_1;
	}

	public void setQuestionTakerComments_1(Set<QuestionTakerComment> questionTakerComments_1) {
		this.questionTakerComments_1 = questionTakerComments_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionAccessMode> getQuestionAccessModes() {
		return this.questionAccessModes;
	}

	public void setQuestionAccessModes(Set<QuestionAccessMode> questionAccessModes) {
		this.questionAccessModes = questionAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionCourseoutcomeMap> getQuestionCourseoutcomeMaps() {
		return this.questionCourseoutcomeMaps;
	}

	public void setQuestionCourseoutcomeMaps(Set<QuestionCourseoutcomeMap> questionCourseoutcomeMaps) {
		this.questionCourseoutcomeMaps = questionCourseoutcomeMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionByTestmodeQuestionId")
	public Set<TestQuestionMap> getTestQuestionMapsForTestmodeQuestionId() {
		return this.testQuestionMapsForTestmodeQuestionId;
	}

	public void setTestQuestionMapsForTestmodeQuestionId(Set<TestQuestionMap> testQuestionMapsForTestmodeQuestionId) {
		this.testQuestionMapsForTestmodeQuestionId = testQuestionMapsForTestmodeQuestionId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QgroupQuestionMap> getQgroupQuestionMaps_1() {
		return this.qgroupQuestionMaps_1;
	}

	public void setQgroupQuestionMaps_1(Set<QgroupQuestionMap> qgroupQuestionMaps_1) {
		this.qgroupQuestionMaps_1 = qgroupQuestionMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionComment> getQuestionComments() {
		return this.questionComments;
	}

	public void setQuestionComments(Set<QuestionComment> questionComments) {
		this.questionComments = questionComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionCourseoutcomeMap> getQuestionCourseoutcomeMaps_1() {
		return this.questionCourseoutcomeMaps_1;
	}

	public void setQuestionCourseoutcomeMaps_1(Set<QuestionCourseoutcomeMap> questionCourseoutcomeMaps_1) {
		this.questionCourseoutcomeMaps_1 = questionCourseoutcomeMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionContentMap> getQuestionContentMaps() {
		return this.questionContentMaps;
	}

	public void setQuestionContentMaps(Set<QuestionContentMap> questionContentMaps) {
		this.questionContentMaps = questionContentMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<Qsolution> getQsolutions_1() {
		return this.qsolutions_1;
	}

	public void setQsolutions_1(Set<Qsolution> qsolutions_1) {
		this.qsolutions_1 = qsolutions_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionTopicMap> getQuestionTopicMaps() {
		return this.questionTopicMaps;
	}

	public void setQuestionTopicMaps(Set<QuestionTopicMap> questionTopicMaps) {
		this.questionTopicMaps = questionTopicMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionItem> getQuestionItems() {
		return this.questionItems;
	}

	public void setQuestionItems(Set<QuestionItem> questionItems) {
		this.questionItems = questionItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionComment> getQuestionComments_1() {
		return this.questionComments_1;
	}

	public void setQuestionComments_1(Set<QuestionComment> questionComments_1) {
		this.questionComments_1 = questionComments_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<TakerSolution> getTakerSolutions() {
		return this.takerSolutions;
	}

	public void setTakerSolutions(Set<TakerSolution> takerSolutions) {
		this.takerSolutions = takerSolutions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionTopicMap> getQuestionTopicMaps_1() {
		return this.questionTopicMaps_1;
	}

	public void setQuestionTopicMaps_1(Set<QuestionTopicMap> questionTopicMaps_1) {
		this.questionTopicMaps_1 = questionTopicMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionContentMap> getQuestionContentMaps_1() {
		return this.questionContentMaps_1;
	}

	public void setQuestionContentMaps_1(Set<QuestionContentMap> questionContentMaps_1) {
		this.questionContentMaps_1 = questionContentMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionByEditmodeQuestionId")
	public Set<TestQuestionMap> getTestQuestionMapsForEditmodeQuestionId() {
		return this.testQuestionMapsForEditmodeQuestionId;
	}

	public void setTestQuestionMapsForEditmodeQuestionId(Set<TestQuestionMap> testQuestionMapsForEditmodeQuestionId) {
		this.testQuestionMapsForEditmodeQuestionId = testQuestionMapsForEditmodeQuestionId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionInfo> getQuestionInfos() {
		return this.questionInfos;
	}

	public void setQuestionInfos(Set<QuestionInfo> questionInfos) {
		this.questionInfos = questionInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionItem> getQuestionItems_1() {
		return this.questionItems_1;
	}

	public void setQuestionItems_1(Set<QuestionItem> questionItems_1) {
		this.questionItems_1 = questionItems_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionInfo> getQuestionInfos_1() {
		return this.questionInfos_1;
	}

	public void setQuestionInfos_1(Set<QuestionInfo> questionInfos_1) {
		this.questionInfos_1 = questionInfos_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<QuestionAccessMode> getQuestionAccessModes_1() {
		return this.questionAccessModes_1;
	}

	public void setQuestionAccessModes_1(Set<QuestionAccessMode> questionAccessModes_1) {
		this.questionAccessModes_1 = questionAccessModes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set<TakerSolution> getTakerSolutions_1() {
		return this.takerSolutions_1;
	}

	public void setTakerSolutions_1(Set<TakerSolution> takerSolutions_1) {
		this.takerSolutions_1 = takerSolutions_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionByEditmodeQuestionId")
	public Set<TestQuestionMap> getTestQuestionMapsForEditmodeQuestionId_1() {
		return this.testQuestionMapsForEditmodeQuestionId_1;
	}

	public void setTestQuestionMapsForEditmodeQuestionId_1(
			Set<TestQuestionMap> testQuestionMapsForEditmodeQuestionId_1) {
		this.testQuestionMapsForEditmodeQuestionId_1 = testQuestionMapsForEditmodeQuestionId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionByTestmodeQuestionId")
	public Set<TestQuestionMap> getTestQuestionMapsForTestmodeQuestionId_1() {
		return this.testQuestionMapsForTestmodeQuestionId_1;
	}

	public void setTestQuestionMapsForTestmodeQuestionId_1(
			Set<TestQuestionMap> testQuestionMapsForTestmodeQuestionId_1) {
		this.testQuestionMapsForTestmodeQuestionId_1 = testQuestionMapsForTestmodeQuestionId_1;
	}

}
