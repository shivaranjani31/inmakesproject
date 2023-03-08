package org.inm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPojo extends BaseClass{
	public MyntraPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='desktop-userIconsContainer']")
	private WebElement profile;
	
	@FindBy(xpath = "//a[@class='desktop-linkButton']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement email;
	
	@FindBy(xpath = "//div[text()='CONTINUE']")
	private WebElement sumbit;

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSumbit() {
		return sumbit;
	}
	
	

}
