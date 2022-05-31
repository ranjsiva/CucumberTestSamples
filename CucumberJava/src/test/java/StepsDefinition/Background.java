package StepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Background {

	WebDriver driver=null;
	@Given("user is on orangehrm login page")
	public void user_is_on_orangehrm_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/kumaran/eclipse-workspace/CucumberJava/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@And("enter login details in  orangehrm login page")
	public void enter_login_details_in_orangehrm_login_page() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("click login button in  orangehrm login page")
	public void click_login_button_in_orangehrm_login_page() {
		

	}

	@Then("user is on orangehrm homepage")
	public void user_is_on_orangehrm_homepage() {

	}

	@When("check dasboard tab")
	public void check_dasboard_tab() {


	}

	@Then("check dashboard menus")
	public void check_dashboard_menus() {

	}

	@When("check leave tab")
	public void check_leave_tab() {

	}

	@Then("check leave list menus")
	public void check_leave_list_menus() {

	}

}
