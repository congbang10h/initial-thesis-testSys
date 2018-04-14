package com.therealdanvega.domain;
// Generated Apr 14, 2018 9:37:20 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PostKeywordsId generated by hbm2java
 */
@Embeddable
public class PostKeywordsId implements java.io.Serializable {

	private long postId;
	private String keywords;

	public PostKeywordsId() {
	}

	public PostKeywordsId(long postId) {
		this.postId = postId;
	}

	public PostKeywordsId(long postId, String keywords) {
		this.postId = postId;
		this.keywords = keywords;
	}

	@Column(name = "post_id", nullable = false)
	public long getPostId() {
		return this.postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	@Column(name = "keywords")
	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PostKeywordsId))
			return false;
		PostKeywordsId castOther = (PostKeywordsId) other;

		return (this.getPostId() == castOther.getPostId())
				&& ((this.getKeywords() == castOther.getKeywords()) || (this.getKeywords() != null
						&& castOther.getKeywords() != null && this.getKeywords().equals(castOther.getKeywords())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getPostId();
		result = 37 * result + (getKeywords() == null ? 0 : this.getKeywords().hashCode());
		return result;
	}

}
