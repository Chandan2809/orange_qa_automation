package StepDefinitions;


import java.time.Duration;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import io.cucumber.java.en.*;

public class OrangeHRM_Admin_StepDef extends Base {
	Login login;
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
	@When("Click on the Admin button")
	public void click_on_the_admin_button() throws InterruptedException {
		Thread.sleep(2000);
		login = new Login();
		login.UserLogin();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("AdminButton"))).click();
		logger.info("Clicked to the  Admin Button");
	   	Thread.sleep(1000);
	}

	
	  @Then("Click on the Add button") public void click_on_the_add_button() throws
	  InterruptedException {
	  driver.findElement(By.xpath(prop.getProperty("AddUser"))).click();
	  logger.info("Clicked to the  Add Button"); Thread.sleep(1000);
	  
	  }
	  
	  @Given("Enter the user details") public void enter_the_user_details() throws
	  InterruptedException {
	  driver.findElement(By.xpath(prop.getProperty("UserRoleDropdown"))).click();
	  logger.info("Clicked to the  user role Dropdown Button"); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("SelectUserRole2"))).click();
	  logger.info("Select User Role"); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("UserStatusDropdown"))).click();
	  logger.info("Clicked to the  user Status Dropdown Button");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("SelectUserStatus"))).click();
	  logger.info("Select User Enabled"); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("EmployeeName"))).sendKeys("Ranga");
	  logger.info("Enter Employee hint Name"); 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(prop.getProperty("SelectEmployeeName"))).click();
	  ; logger.info("Select Employee Name"); 
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(prop.getProperty("EnterUserName"))).sendKeys("ChandandINT"); 
	  logger.info("Enter Employee Name"); 
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(prop.getProperty("UserPassword"))).sendKeys("Chandan@2578#"); 
	  logger.info("Enter User Password"); 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath(prop.getProperty("UserConfirmPassword"))).sendKeys("Chandan@2578#"); 
	  logger.info("Enter User Confirm Password");
	  Thread.sleep(1000);
	  
	  }
	  
	  @Then("Click on the Save button") public void click_on_the_save_button()
	  throws InterruptedException {
	  driver.findElement(By.xpath(prop.getProperty("UserSaveButton"))).click();
	  logger.info("Click on user add save button"); 
	  Thread.sleep(5000);
	  
	  
	  }
	 
	@Given("Enter user Name")
	public void enter_user_name() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("UserSearch"))).sendKeys("ChandandINT");
		logger.info("Enter user Name for search");
		Thread.sleep(5000);
		
		  driver.findElement(By.xpath(prop.getProperty("UserRoleSearch"))).click();
		  logger.info("Click on user role dropdown"); Thread.sleep(2000);
		  driver.findElement(By.xpath(prop.getProperty("UserRoleSelect"))).click();
		  logger.info("Select user role"); Thread.sleep(2000);
		  driver.findElement(By.xpath(prop.getProperty("SearchEmployeeName"))).sendKeys
		  ("Ranga"); logger.info("Type employee hint"); Thread.sleep(3000);
		  driver.findElement(By.xpath(prop.getProperty("SelectSearchEmployeeName"))).
		  click(); logger.info("Select employee Name"); Thread.sleep(1000);
		  driver.findElement(By.xpath(prop.getProperty("UserSearchStatus"))).click();
		  logger.info("Click on user ststus"); Thread.sleep(1000);
		  driver.findElement(By.xpath(prop.getProperty("SelectUserSearchStatus"))).
		  click(); logger.info("Select user ststus"); Thread.sleep(1000);
		 
	}

	@Then("Click on Search button")
	public void click_on_search_button() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("ClickUserSearchButton"))).click();
	    logger.info("Click on the search button");
	    Thread.sleep(5000); // Test Push....
	}



}
