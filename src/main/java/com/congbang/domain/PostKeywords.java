package com.congbang.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PostKeywords generated by hbm2java
 */
@Entity
@Table(name = "post_keywords", catalog = "testts")
public class PostKeywords implements java.io.Serializable {

	private PostKeywordsId id;
	private Post post;

	public PostKeywords() {
	}

	public PostKeywords(PostKeywordsId id, Post post) {
		this.id = id;
		this.post = post;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "postId", column = @Column(name = "post_id", nullable = false)),
			@AttributeOverride(name = "keywords", column = @Column(name = "keywords")) })
	public PostKeywordsId getId() {
		return this.id;
	}

	public void setId(PostKeywordsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_id", nullable = false, insertable = false, updatable = false)
	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
