package com.brav.social.component;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brav.social.constant.FBUrls;
import com.brav.social.properties.FacebookProperties;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Component
public class FBTokenComponent {
	
	public static String ACCESS_TOKEN;
	
	@PostConstruct
	public void init() {
		try {
			ACCESS_TOKEN = retrieveAppAccessToken();
		} catch (UnirestException e) {
		}
	}
	
	@Autowired
	private FacebookProperties facebookProperties;

	public String retrieveAppAccessToken() throws UnirestException
	{
		String bodyResponse = Unirest.get(FBUrls.ACCESS_TOKEN)
				  .header("accept", "application/json")
				  .queryString("client_id", facebookProperties.getId())
				  .queryString("client_secret", facebookProperties.getSecret())
				  .queryString("grant_type", "client_credentials")
				  .asString().getBody();
		String[] split = bodyResponse.split("=");
		return split[1];
	}
}
