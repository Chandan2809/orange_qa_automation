package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeLogin_StepDef extends Base {
	
	 WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(50));

	@Given("click on Username Text Box")
	public void click_on_username_text_box() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("Username"))).click();
   	 logger.info("Clicked to enter Username");
   	Thread.sleep(1000);
	}

	@Then("Enter the Username")
	public void enter_the_username() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys("Admin");
	   	 logger.info("User name entered.");
	   	Thread.sleep(500);
	}

	@Then("Enter the Password")
	public void enter_the_password() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys("admin123");
	   	 logger.info("Password entered.");
	   	Thread.sleep(500);
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath(prop.getProperty("Submit"))).click();
	   	 logger.info("Submit button clicked.");
	}

}





