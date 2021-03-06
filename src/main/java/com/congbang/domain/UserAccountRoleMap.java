package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserAccountRoleMap generated by hbm2java
 */
@Entity
@Table(name = "user_account_role_map", catalog = "testts")
public class UserAccountRoleMap implements java.io.Serializable {

	private Integer id;
	private Role role;
	private User user;
	private UserAccount userAccount;
	private Date grantedDate;

	public UserAccountRoleMap() {
	}

	public UserAccountRoleMap(Role role, User user, UserAccount userAccount) {
		this.role = role;
		this.user = user;
		this.userAccount = userAccount;
	}

	public UserAccountRoleMap(Role role, User user, UserAccount userAccount, Date grantedDate) {
		this.role = role;
		this.user = user;
		this.userAccount = userAccount;
		this.grantedDate = grantedDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id", nullable = false)
	public UserAccount getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "granted_date", length = 10)
	public Date getGrantedDate() {
		return this.grantedDate;
	}

	public void setGrantedDate(Date grantedDate) {
		this.grantedDate = grantedDate;
	}

}
