package org.stepdefinition;

import org.inm.BaseClass;
import org.inm.RedbusPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchData extends BaseClass{
	
	
	RedbusPojo r;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch url of redbus application")
	public void to_launch_url_of_redbus_application() {
		launchUrl("https://www.redbus.in/");
	    
	}

	@When("To click the {string} start button")
	public void to_click_the_start_button(String f) {
		r = new RedbusPojo();
		passText(f, r.getFrom());
	    
	}
	
	@When("To click the {string} to button")
	public void to_click_the_to_button(String t) {
		r = new RedbusPojo();
		passText(t, r.getTo());
	}


	@When("To click the date button")
	public void to_click_the_date_button() {
		r = new RedbusPojo();
		clickBtn(r.getClkbtn());
	    
	}

	@When("To select the date")
	public void to_select_the_date() throws InterruptedException {
		Thread.sleep(20000);
		r = new RedbusPojo();
		clickBtn(r.getDate());
	}

	@When("To click the search button")
	public void to_click_the_search_button() {
		r = new RedbusPojo();
		clickBtn(r.getSearch());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
//		closeEntireBrowser();
	}



}
