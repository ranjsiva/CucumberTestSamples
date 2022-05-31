package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginclassPOM {
	WebDriver driverObj;
	
	By txt_username=By.id("name");
	By txt_password=By.id("password");
	By txt_login=By.id("login");
	By txt_logout=By.id("logout");
	
	public loginclassPOM(WebDriver driver) {
		this.driverObj=driver;
	}
	
	public void enterusername(String username) {
		driverObj.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driverObj.findElement(txt_password).sendKeys(password);
	}
	
	public void login() {
		driverObj.findElement(txt_login).click();
	}
	
	public void logout() {
		driverObj.findElement(txt_login).isDisplayed();
	}

	
	
	
}
