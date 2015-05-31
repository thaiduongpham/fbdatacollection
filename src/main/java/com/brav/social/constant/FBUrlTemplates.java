package com.brav.social.constant;

public class FBUrlTemplates {
	
	public static String PAGE = "https://graph.facebook.com/v2.3/{appid}/?fields=id,name,category,cover,link,website,likes,posts.limit(5){add}";
	public static String PAGE_POST = "{id,message,full_picture,likes.limit(0).summary(true)}";
}
