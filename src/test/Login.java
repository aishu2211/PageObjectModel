package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.facebook.pages.inbox.LandingPage;
import com.selenium.facebook.pages.login.LoginPage;

public class Login {

	public static void main(String[] args) {


		
		LoginPage l = new LoginPage();
		LandingPage p = l.doLogin("","");
		p.gotoProfile();
		
		
		
		
		

	}

}
