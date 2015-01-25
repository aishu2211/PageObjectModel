package com.selenium.facebook.testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.selenium.facebook.base.Page;
import com.selenium.facebook.pages.inbox.LandingPage;
import com.selenium.facebook.pages.inbox.MyProfilePage;
import com.selenium.facebook.pages.login.LoginPage;
import com.selenium.util.TestUtil;

public class ChangePicTest {
	
	
	@Test
	public void changePic(){
		
		if(!TestUtil.isExecutable("ChangePicTest",Page.xls1))
			 throw new SkipException("Runmode set to NO");
		LandingPage landingPage=null;
		// logged in
		if(!Page.isLoggedIn){
			LoginPage loginPage = new LoginPage();
			landingPage= loginPage.doLogin();
		}else{
		// i am logged in
			landingPage =  Page.topMenu.gotoLandingPage();
		}
		
		MyProfilePage profilePage = landingPage.gotoProfile();
		profilePage.changePic("D:\\Application\\Aishwarya_Selenium\\General.ProfilePic.jpg");
	}

}
