package org.stepdefinition;

import org.inm.BaseClass;
import org.inm.MyntraPojo;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraSignin extends BaseClass {
	
	MyntraPojo m;
	@Given("to launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the myntra application")
	public void to_launch_the_url_of_the_myntra_application() {
	   launchUrl("https://www.myntra.com/"); 
	}

	@When("To move to element in signin")
	public void to_move_to_element_in_signin() throws InterruptedException {
		Thread.sleep(2000);
		m = new MyntraPojo();
	    Actions a = new Actions(driver);
	    a.moveToElement(m.getProfile()).perform();
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		m = new MyntraPojo();
		clickBtn(m.getLogin());
	    
	}

	@When("To pass the email or mobileno in email box")
	public void to_pass_the_email_or_mobileno_in_email_box() {
		m = new MyntraPojo();
		passText("7639288001", m.getEmail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		m = new MyntraPojo();
		clickBtn(m.getSumbit());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}



}
