package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.imdb.util.FBConstants;
import com.imdb.webdriver.WebConnector;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LaunchPage extends WebConnector{
	
	public WebConnector con;
	public WebDriver driver;
	
	public LaunchPage(WebConnector con){
		this.driver=con.driver;
		this.con=con;
	}
	
	
	public void gotoimdbPage(String loginurl){
		// log
		con.navigate(loginurl);
	}
	

	

}
