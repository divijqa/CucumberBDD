package Cucumber.com.FB.stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signIn {
     
	  WebDriver d ;
	
	@Given("^user is in Facebook\\.com$")
	public void user_is_in_Facebook_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters First name and Last Name$")
	public void user_enters_First_name_and_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^User eneters mobile number or Email-id$")
	public void user_eneters_mobile_number_or_Email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user re enters email-id$")
	public void user_re_enters_email_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^uesr enters password$")
	public void uesr_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user enters date of birth$")
	public void user_enters_date_of_birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^user clicks on sex male or female$")
	public void user_clicks_on_sex_male_or_female() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	    
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	
	
	
}

