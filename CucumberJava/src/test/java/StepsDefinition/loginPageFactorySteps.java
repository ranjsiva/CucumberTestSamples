package StepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import pageFactory.loginPageFactory;
import pageFactory.logoutPageFactory;

public class loginPageFactorySteps {
	
	loginPageFactory login;
	logoutPageFactory logout;
	WebDriver driver=null;
	
	@Before(order=1)
	public void initial() {
		
		System.out.println("initial");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/kumaran/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Before(order=0)
	public void initial1() {
		System.out.println("initial1");
	}
	
	@BeforeStep
	public void befrestep() {
		System.out.println("beforestep");
	}
	
	@Given("user lands on login page")
	public void user_lands_on_login_page() {
	System.out.println("user lands on login page");
	}
	
	@Given("^user enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username,String password) throws InterruptedException {
		driver.navigate().to("https://example.testproject.io/web/");
		login=new loginPageFactory(driver);
		login.enterUserName_password(username,password);
		Thread.sleep(1000);
		
	}

	@And("click login button with valid")
	public void click_login_button_with_valid() {
		login.btnClick();
	}

	@Then("user lands on homepage")
	public void user_lands_on_homepage() {
		logout=new logoutPageFactory(driver);
		logout.logoutbtnClick();
	}
	
	@AfterStep
	public void afterstep() {
		System.out.println("afterstep");
	}
	
	@After
	public void teardown() {
		System.out.println("close");
		driver.close();
		driver.quit();
	}
}
