package com.selenium.facebook.pages.inbox;

import org.openqa.selenium.WebDriver;

import com.selenium.facebook.base.Page;

public class LandingPage extends Page {
	
	public MyProfilePage gotoProfile(){
	     click("go_to_profile");
	     return new MyProfilePage();
		
		}
		
}
