package com.brav.social.domain.facebook;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "data", "summary" })
public class Likes {

	@JsonProperty("data")
	private List<Object> data = new ArrayList<Object>();
	@JsonProperty("summary")
	private Summary summary;

	@JsonProperty("data")
	public List<Object> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<Object> data) {
		this.data = data;
	}

	@JsonProperty("summary")
	public Summary getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(Summary summary) {
		this.summary = summary;
	}

}
