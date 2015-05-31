package com.brav.social.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.brav.social.constant.FBUrlTemplates;
import com.brav.social.domain.facebook.FBPage;

@Component
@EnableScheduling
public class JobSchedulerComponent {
	
	@Autowired
	private FBPageComponent fbPageComponent;
	/**
	 * 1000 = 1 second,
	 * 60.000 = 1 minute,
	 * 3.600.000 = 1 hour.
	 */
	@Scheduled(fixedRate = 3600000)
	public void fetchFaceBookData(){
		String pageID = "383923618322771";
		FBPage page = fbPageComponent.fetchPage(pageID, FBUrlTemplates.PAGE_POST);
		System.out.println("fetch data");
	}

}
