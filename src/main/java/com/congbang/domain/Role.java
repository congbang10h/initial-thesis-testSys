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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "testts")
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String roleCode;
	private String roleDesc;
	private Set<QuestionAccessMode> questionAccessModes = new HashSet<QuestionAccessMode>(0);
	private Set<TestAccessMode> testAccessModes = new HashSet<TestAccessMode>(0);
	private Set<RolePrevilegeMap> rolePrevilegeMaps = new HashSet<RolePrevilegeMap>(0);
	private Set<ProgramAccessMode> programAccessModes = new HashSet<ProgramAccessMode>(0);
	private Set<TopicAccessMode> topicAccessModes = new HashSet<TopicAccessMode>(0);
	private Set<CourseAccessMode> courseAccessModes = new HashSet<CourseAccessMode>(0);
	private Set<UserAccountRoleMap> userAccountRoleMaps = new HashSet<UserAccountRoleMap>(0);

	public Role() {
	}

	public Role(String roleCode, String roleDesc) {
		this.roleCode = roleCode;
		this.roleDesc = roleDesc;
	}

	public Role(String roleCode, String roleDesc, Set<QuestionAccessMode> questionAccessModes,
			Set<TestAccessMode> testAccessModes, Set<RolePrevilegeMap> rolePrevilegeMaps,
			Set<ProgramAccessMode> programAccessModes, Set<TopicAccessMode> topicAccessModes,
			Set<CourseAccessMode> courseAccessModes, Set<UserAccountRoleMap> userAccountRoleMaps) {
		this.roleCode = roleCode;
		this.roleDesc = roleDesc;
		this.questionAccessModes = questionAccessModes;
		this.testAccessModes = testAccessModes;
		this.rolePrevilegeMaps = rolePrevilegeMaps;
		this.programAccessModes = programAccessModes;
		this.topicAccessModes = topicAccessModes;
		this.courseAccessModes = courseAccessModes;
		this.userAccountRoleMaps = userAccountRoleMaps;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "role_id", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "role_code", nullable = false, length = 100)
	public String getRoleCode() {
		return this.roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Column(name = "role_desc", nullable = false, length = 65535)
	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<QuestionAccessMode> getQuestionAccessModes() {
		return this.questionAccessModes;
	}

	public void setQuestionAccessModes(Set<QuestionAccessMode> questionAccessModes) {
		this.questionAccessModes = questionAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<TestAccessMode> getTestAccessModes() {
		return this.testAccessModes;
	}

	public void setTestAccessModes(Set<TestAccessMode> testAccessModes) {
		this.testAccessModes = testAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<RolePrevilegeMap> getRolePrevilegeMaps() {
		return this.rolePrevilegeMaps;
	}

	public void setRolePrevilegeMaps(Set<RolePrevilegeMap> rolePrevilegeMaps) {
		this.rolePrevilegeMaps = rolePrevilegeMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<ProgramAccessMode> getProgramAccessModes() {
		return this.programAccessModes;
	}

	public void setProgramAccessModes(Set<ProgramAccessMode> programAccessModes) {
		this.programAccessModes = programAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<TopicAccessMode> getTopicAccessModes() {
		return this.topicAccessModes;
	}

	public void setTopicAccessModes(Set<TopicAccessMode> topicAccessModes) {
		this.topicAccessModes = topicAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<CourseAccessMode> getCourseAccessModes() {
		return this.courseAccessModes;
	}

	public void setCourseAccessModes(Set<CourseAccessMode> courseAccessModes) {
		this.courseAccessModes = courseAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<UserAccountRoleMap> getUserAccountRoleMaps() {
		return this.userAccountRoleMaps;
	}

	public void setUserAccountRoleMaps(Set<UserAccountRoleMap> userAccountRoleMaps) {
		this.userAccountRoleMaps = userAccountRoleMaps;
	}

}
