package org.inm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPojo extends BaseClass{
	public RedbusPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement from;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement to;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement clkbtn;
	
	@FindBy(xpath = "//td[@class='current day']")
	private WebElement date;
	
	@FindBy(xpath = "//button[text()='Search Buses']")
	private WebElement search;

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getClkbtn() {
		return clkbtn;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	


}
