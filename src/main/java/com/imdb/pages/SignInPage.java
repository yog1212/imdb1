package com.imdb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.imdb.util.FBConstants;
import com.imdb.webdriver.WebConnector;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SignInPage extends WebConnector{
	
	public WebConnector con;
	public WebDriver driver;
	
	
	public SignInPage(WebConnector con){
		this.driver=driver;
		this.con=con;
	}
	
	public void newaccountCreation(String name,String email,String password){
		con.click("Signin_xpath");
		con.click("signinway_xpath");
		con.type("name_xpath", name);
		con.type("email_xpath", email);
		con.type("pwd_xpath", password);
		con.type("pwd1_xpath", password);
		con.click("createbtn_xpath");
		con.click("lgt_xpath");   //we can put here if next element present then ac creation is successful
		con.click("signout_xpath");
}
	public void verifyloginnewuser(String email,String password){
		con.click("Signin_xpath");
		con.click("signwith_imdb_xpath");
		con.type("signemail_xpath", "Test034641604@gmail.com");
		con.type("signpwd_xpath", "Test034641604");
		con.click("signbttn_xpath"); 
		con.click("lgt_xpath");  //we can put here if next element present then login is successful
		con.click("signout_xpath");
	}
}
