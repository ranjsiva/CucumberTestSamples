package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

	@FindBy(id="name")
	WebElement txt_username;

	@FindBy(id="password")
	WebElement txt_password;

	@FindBy(id="login")
	WebElement btn_login;
	
	WebDriver driverObj;
	
	public loginPageFactory(WebDriver driver) {
		this.driverObj=driver;
		PageFactory.initElements(driver, this);
	}


	public void enterUserName_password(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
	}

	public void btnClick() {
		btn_login.click();
	}


	
}
