package com.brav.social.domain.facebook;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "total_count" })
public class Summary {

	@JsonProperty("total_count")
	private Integer totalCount;

	@JsonProperty("total_count")
	public Integer getTotalCount() {
		return totalCount;
	}

	@JsonProperty("total_count")
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

}
