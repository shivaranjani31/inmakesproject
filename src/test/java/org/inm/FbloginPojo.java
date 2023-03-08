package org.inm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FbloginPojo extends BaseClass{
	
		public FbloginPojo() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "nav-link-accountList")
		private WebElement account;
		
		@FindBy(name = "email")
		private WebElement email;
		
		@FindBy(id = "continue")
		private WebElement clkbtn;
		
		@FindBy(id = "ap_password")
		private WebElement pass;
		
		@FindBy(id = "signInSubmit")
		private WebElement sumbit;

		public WebElement getAccount() {
			return account;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getClkbtn() {
			return clkbtn;
		}

		public WebElement getPass() {
			return pass;
		}

		public WebElement getSumbit() {
			return sumbit;
		}
		
		
		
		
		
		
		
		

}
