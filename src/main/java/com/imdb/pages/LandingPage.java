package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.imdb.util.FBConstants;
import com.imdb.webdriver.WebConnector;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LandingPage extends WebConnector{
	
	public WebConnector con;
	public WebDriver driver;
	
	
	public LandingPage(WebConnector con){
		this.driver=driver;
		this.con=con;
	}
	
	public void checktvshow(){
		con.click("mainmenu_xpath");
		con.click("tvshow_xpath");
	}
	
}
