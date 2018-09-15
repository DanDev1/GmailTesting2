package gmailLogin.GmailTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;

public class stepDefinitionSOS {
	 public static WebDriver obj=null;
	@Given("^url opened$")
	public void url_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		/*
		//check which os the test is running in
		String os = System.getProperty("os.name").toLowerCase();
		Wedbriver driver = new ChromeDriver();
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver.exe");
		}
		driver.get("http:/www.google.com");
		*/
	
		//System.setProperty("webdriver.gecko.driver","geckodriver");
		//System.setProperty("webdriver.chrome.driver","chromedriver");
	//	System.setProperty("webdriver.chrome.driver", "/home/vin/Downloads/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/chromedriver");
	       // obj=new FirefoxDriver();
		obj=new ChromeDriver();

	        obj.manage().window().maximize();

	        obj.get("https://mail.google.com");
	}

	@Then("^enter user id and click next$")
	public void enter_user_id_and_click_next() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click login$")
	public void click_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
