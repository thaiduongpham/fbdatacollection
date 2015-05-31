package com.brav.social.domain.facebook;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "id", "name", "category", "cover", "link", "website",
		"likes", "posts" })
public class FBPage {

	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("category")
	private String category;
	@JsonProperty("cover")
	private Cover cover;
	@JsonProperty("link")
	private String link;
	@JsonProperty("website")
	private String website;
	@JsonProperty("likes")
	private Integer likes;
	@JsonProperty("posts")
	private Posts posts;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("cover")
	public Cover getCover() {
		return cover;
	}

	@JsonProperty("cover")
	public void setCover(Cover cover) {
		this.cover = cover;
	}

	@JsonProperty("link")
	public String getLink() {
		return link;
	}

	@JsonProperty("link")
	public void setLink(String link) {
		this.link = link;
	}

	@JsonProperty("website")
	public String getWebsite() {
		return website;
	}

	@JsonProperty("website")
	public void setWebsite(String website) {
		this.website = website;
	}

	@JsonProperty("likes")
	public Integer getLikes() {
		return likes;
	}

	@JsonProperty("likes")
	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	@JsonProperty("posts")
	public Posts getPosts() {
		return posts;
	}

	@JsonProperty("posts")
	public void setPosts(Posts posts) {
		this.posts = posts;
	}

}
