package com.selenium.facebook.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.selenium.facebook.base.Page;
import com.selenium.facebook.pages.inbox.LandingPage;

public class LoginPage extends Page {

	// null - if login is not success
		// LandingPage - if login is success
		public LandingPage doLogin(String userName,String password){
			try{
				Assert.assertEquals("XXXWelcome to Facebook — Log in, sign up or learn more", driver.getTitle());
				}catch(Throwable t){
				 Page.takeScreenshot("Login.jpg");
				}
			driver.get(CONFIG.getProperty("testSiteLandingPageURL"));
			System.out.println(isElementPresent("//*[@id='email']"));
			input("EMAIL",userName);
			input("PASSWORD",password);
			click("LOGIN_BUTTON");
			if(isElementPresent("go_to_profile"))
				return new LandingPage();
			else 
				return null;
			
			// initialize TopMenu
			//topMenu = new TopMenu();
		}
		// default - correct , username password
		public LandingPage doLogin(){
			
			return doLogin(CONFIG.getProperty("defaultUserName"),CONFIG.getProperty("defaultPassword"));
		}
		
	

	}


