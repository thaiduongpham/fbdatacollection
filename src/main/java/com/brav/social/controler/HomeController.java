package com.brav.social.controler;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.brav.social.constant.ViewConstants;

@Controller
public class HomeController {
	
	private static Logger logger = Logger.getLogger( HomeController.class );

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return ViewConstants.HOME;
	}
}
