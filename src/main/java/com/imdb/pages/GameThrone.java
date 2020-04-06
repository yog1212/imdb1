package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.imdb.util.FBConstants;
import com.imdb.webdriver.WebConnector;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GameThrone extends WebConnector{
	
	public WebConnector con;
	public WebDriver driver;
	
	
	public GameThrone(WebConnector con){
		this.driver=driver;
		this.con=con;
	}
	
	public void checktgamethrone(String data){
		con.type("search_xpath", data);
		con.click("gamelast_xpath");
		
		String title=con.getObject("gamelasttitle_xpath").getText();
		if(!title.contains("The Last Watch")){
			con.reportFailure("title mismatch");
		}else{
			System.out.println("title matched");
		}
		
		String rating=con.getObject("thronerating_xpath").getText();
		if(!rating.contains("7.2")){
			con.reportFailure("rating mismatch");
		}else{
			System.out.println("rating matched");
		}
		
		String views=con.getObject("throneview_xpath").getText();
		if(!views.contains("5,261")){
			con.reportFailure("views mismatch");
		}else{
			System.out.println("views matched");
		}
	}
	
}
