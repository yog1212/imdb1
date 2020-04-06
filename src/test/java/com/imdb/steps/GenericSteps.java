package com.imdb.steps;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.AssertJProxySetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import com.imdb.pages.GameThrone;
import com.imdb.pages.LandingPage;
import com.imdb.pages.LaunchPage;
import com.imdb.pages.SignInPage;
import com.imdb.webdriver.WebConnector;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
// pico container
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericSteps extends WebConnector{

	public WebConnector con;
	public WebDriver driver;
	
    String s=java.time.LocalTime.now().toString();
    String s1=s.replace(":","");
    String s3=s1.replace(".","");
    //String s3=s2.replaceAll("","_");
    String name1="";
    String email1="";
    String pwd1="";
    //System.out.Println("s3");
	
	public GenericSteps(WebConnector con) {
		this.con=con;
	    this.driver=driver;
	}
	
	@Before
	public void before(Scenario s) {
		System.out.println("***Bef*** "+s.getName());
		con.initReports(s.getName());
	}
	
	@After
	public void after() {
		System.out.println("***Aft***");	
		con.quit();
	}
	
	
	@Given("^I open (.*)$")
	public void openBrowser(String browserName) {		
		//System.out.println("Opening Browser "+con.name);
		con.infoLog("Opening Browser "+browserName);
		con.openBrowser(browserName);
	}
	
	@And("^I go to (.*)$")
	public void navigate(String url) {
		//System.out.println("Navigating to "+ con.name);
		con.infoLog("Navigating to "+ url);
		LaunchPage LaunchPage = new LaunchPage(con);
		PageFactory.initElements(driver, LaunchPage);
		LaunchPage.gotoimdbPage(url);
	}
	
	@Then("^User check for TV_shows$")
	public void checktvshow() {
		LandingPage LandingPage = new LandingPage(con);
		PageFactory.initElements(driver, LandingPage);
		LandingPage.checktvshow();
	}
	@Then("^User check Search for (.*)$")
	public void checkgamethrone(String searchkey) {
		GameThrone GameThrone = new GameThrone(con);
		PageFactory.initElements(driver, GameThrone);
		GameThrone.checktgamethrone(searchkey);
	}
	
	@Then("^User click on Signin and Create New Account with (.*) and (.*) and (.*)$")
	public void signin(String name,String email,String password) {
		name1=name.concat(s3);
		email1=email.concat(s3+"@gmail.com");
		pwd1=password.concat(s3);
		System.out.println(email1);
		System.out.println(pwd1);
		SignInPage SignInPage = new SignInPage(con);
		PageFactory.initElements(driver, SignInPage);
		//SignInPage.newaccountCreation(name1, email1, pwd1);
		SignInPage.verifyloginnewuser(email1, pwd1);
	}
	
	
	

	@And("^I type (.*) in (.*) field$")
	public void type(String data,String locatorKey) {
		con.infoLog("Typing in "+locatorKey+". Data "+data);
		con.type(locatorKey, data);
	}
	@And("^I clear (.*)$")
	public void clear(String locatorKey) {
		con.infoLog("Clearing in "+locatorKey);
		con.clear(locatorKey);
	}
	
	@And("^I click on (.*)$")
	public void click(String locatorKey) {
		con.infoLog("Clicking on "+ locatorKey);
		con.click(locatorKey);	
	}
	
	@And("^I click (.*) and wait for (.*)$")
	public void clickAndWait(String src,String target) {
		con.infoLog("Clicking on "+ src);
		con.clickAndWait(src, target, 20);	
	}
	@And("I select (.*) from (.*)")
	public void select(String data,String locatorKey) {
		con.infoLog("Selecting from "+ locatorKey);
		con.select(locatorKey,data);
	}

	@And("^I wait for page to load$")
	public void waitForPageToLoad() {
		con.waitForPageToLoad();
	}
	
	@When("^I accept alert$")
	public void iAcceptAlert() {
		con.acceptAlertIfPresent();
	}
	
}
