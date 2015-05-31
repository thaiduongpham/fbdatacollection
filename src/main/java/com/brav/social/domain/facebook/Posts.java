package com.brav.social.domain.facebook;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "data", "paging" })
public class Posts {

	@JsonProperty("data")
	private List<Post> data = new ArrayList<Post>();
	@JsonProperty("paging")
	private Paging paging;

	@JsonProperty("data")
	public List<Post> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<Post> data) {
		this.data = data;
	}

	@JsonProperty("paging")
	public Paging getPaging() {
		return paging;
	}

	@JsonProperty("paging")
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

}
