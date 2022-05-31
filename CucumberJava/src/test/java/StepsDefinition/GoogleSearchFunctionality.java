package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchFunctionality {

	WebDriver driver=null;

	@Given("user is on search page")
	public void user_is_on_search_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/kumaran/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	@And("enter keyword to search")
	public void enter_keyword_to_search() {
		driver.navigate().to("https://www.google.com");
	}

	@When("click enter button")
	public void click_enter_button() {
		System.out.println("input");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@Then("user is on searched page")
	public void user_is_on_searched_page() throws InterruptedException {
		System.out.println("enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

}
