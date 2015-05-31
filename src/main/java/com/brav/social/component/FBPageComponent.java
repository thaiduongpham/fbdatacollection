package com.brav.social.component;

import org.apache.log4j.Logger;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.stereotype.Component;

import com.brav.social.constant.FBUrlTemplates;
import com.brav.social.domain.facebook.FBPage;

@Component
public class FBPageComponent {

	private static Logger logger = Logger.getLogger(FBPageComponent.class);

	public FBPage fetchPage(String pageId, String postTemplate) {
		FBPage result = null;
		Facebook facebook = new FacebookTemplate(FBTokenComponent.ACCESS_TOKEN);
		try {
			result = facebook.restOperations().getForObject(FBUrlTemplates.PAGE,
					FBPage.class, pageId, postTemplate);
		} catch (Exception e) {
			logger.debug(e);
		}
		return result;
	}
}
