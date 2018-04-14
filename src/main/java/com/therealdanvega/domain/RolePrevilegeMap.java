package com.therealdanvega.domain;
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
 * RolePrevilegeMap generated by hbm2java
 */
@Entity
@Table(name = "role_previlege_map", catalog = "testts")
public class RolePrevilegeMap implements java.io.Serializable {

	private Integer rolePrevilegeMapId;
	private Previlege previlege;
	private Role role;

	public RolePrevilegeMap() {
	}

	public RolePrevilegeMap(Previlege previlege, Role role) {
		this.previlege = previlege;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "role_previlege_map_id", unique = true, nullable = false)
	public Integer getRolePrevilegeMapId() {
		return this.rolePrevilegeMapId;
	}

	public void setRolePrevilegeMapId(Integer rolePrevilegeMapId) {
		this.rolePrevilegeMapId = rolePrevilegeMapId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "previlege_id")
	public Previlege getPrevilege() {
		return this.previlege;
	}

	public void setPrevilege(Previlege previlege) {
		this.previlege = previlege;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
