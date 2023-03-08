package org.stepdefinition;

import java.util.List;

import org.inm.BaseClass;
import org.inm.FbloginPojo;

import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonData extends BaseClass {
	
	FbloginPojo f;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch url of amazon application")
	public void to_launch_url_of_amazon_application() {
	    launchUrl("https://www.amazon.in/");
	}

	@When("To click the account button")
	public void to_click_the_account_button() {
		f = new FbloginPojo();
		clickBtn(f.getAccount());
	    
	}

	@When("To pass email or mobileno in email box")
	public void to_pass_email_or_mobileno_in_email_box(DataTable d) {
		List<String> l = d.asList();
		f = new FbloginPojo();
		passText(l.get(2), f.getEmail());
	    
	}

	@When("To click continue button")
	public void to_click_continue_button() {
		f = new FbloginPojo();
	    clickBtn(f.getClkbtn());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box(DataTable d) {
		List<List<String>> l = d.asLists();
		f = new FbloginPojo();
		passText(l.get(1).get(0), f.getPass());
	    
	}

	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
	    f = new FbloginPojo();
	    clickBtn(f.getSumbit());
	    
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	    closeEntireBrowser();
	}


}
