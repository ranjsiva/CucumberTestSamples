package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class loginclass {

	WebDriver driver=null;
	loginclassPOM loginPOM;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/kumaran/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}

	@Given("^enter (.*) and (.*)$")
	public void enter_username_and_password(String username,String password) throws InterruptedException {
		
		loginPOM=new loginclassPOM(driver);
		driver.navigate().to("https://example.testproject.io/web/");
		loginPOM.enterusername(username);
		loginPOM.enterpassword(password);
//		 driver.findElement(By.id("name")).sendKeys(username);
//		   driver.findElement(By.id("password")).sendKeys(password);
		   Thread.sleep(1000);
	}

	@When("click login button")
	public void click_login_button() {
		loginPOM.login();
//	   driver.findElement(By.id("login")).click();
		
	}

	@Then("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException {
//	  driver.findElement(By.id("logout")).isDisplayed();
		loginPOM.logout();
	  Thread.sleep(1000);
	  driver.close();
	  driver.quit();
	  
	}
}
