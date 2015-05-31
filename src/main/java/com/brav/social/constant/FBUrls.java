package com.brav.social.constant;

public class FBUrls {

	private static String VERSION = "v2.3";
	public static String BASE_SECURED_URL = "https://graph.facebook.com/";
	public static String BASE_SECURED_URL_WITH_VERSION = "https://graph.facebook.com/"
			+ VERSION + "/";

	public static String PAGE = BASE_SECURED_URL_WITH_VERSION;
	public static String ACCESS_TOKEN = BASE_SECURED_URL
			+ "/oauth/access_token";
}
