package com.brav.social.domain.facebook;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "id", "message", "full_picture", "created_time", "likes" })
public class Post {

	@JsonProperty("id")
	private String id;
	@JsonProperty("message")
	private String message;
	@JsonProperty("full_picture")
	private String fullPicture;
	@JsonProperty("created_time")
	private String createdTime;
	@JsonProperty("likes")
	private Likes likes;

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("full_picture")
	public String getFullPicture() {
		return fullPicture;
	}

	@JsonProperty("full_picture")
	public void setFullPicture(String fullPicture) {
		this.fullPicture = fullPicture;
	}

	@JsonProperty("created_time")
	public String getCreatedTime() {
		return createdTime;
	}

	@JsonProperty("created_time")
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	@JsonProperty("likes")
	public Likes getLikes() {
		return likes;
	}

	@JsonProperty("likes")
	public void setLikes(Likes likes) {
		this.likes = likes;
	}

}
