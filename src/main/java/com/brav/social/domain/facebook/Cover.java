package com.brav.social.domain.facebook;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "cover_id", "offset_x", "offset_y", "source", "id" })
public class Cover {

	@JsonProperty("cover_id")
	private String coverId;
	@JsonProperty("offset_x")
	private Integer offsetX;
	@JsonProperty("offset_y")
	private Integer offsetY;
	@JsonProperty("source")
	private String source;
	@JsonProperty("id")
	private String id;

	@JsonProperty("cover_id")
	public String getCoverId() {
		return coverId;
	}

	@JsonProperty("cover_id")
	public void setCoverId(String coverId) {
		this.coverId = coverId;
	}

	@JsonProperty("offset_x")
	public Integer getOffsetX() {
		return offsetX;
	}

	@JsonProperty("offset_x")
	public void setOffsetX(Integer offsetX) {
		this.offsetX = offsetX;
	}

	@JsonProperty("offset_y")
	public Integer getOffsetY() {
		return offsetY;
	}

	@JsonProperty("offset_y")
	public void setOffsetY(Integer offsetY) {
		this.offsetY = offsetY;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

}
