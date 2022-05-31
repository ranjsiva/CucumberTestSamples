package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPageFactory {

	@FindBy(id="logout")
	WebElement btn_logout;
	
	WebDriver driverObj;
	
	public logoutPageFactory(WebDriver driver) {
		this.driverObj=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logoutbtnClick() {
		btn_logout.click();
	
	}
}
