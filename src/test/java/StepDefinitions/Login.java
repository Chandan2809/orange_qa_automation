package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import configuration.Base;
import utility.TestUtil;
 
 
public class Login extends Base{
	
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(50));
	
	public void UserLogin() throws InterruptedException
	{
		Thread.sleep(2000);
				
		
		  driver.findElement(By.xpath(prop.getProperty("Username"))).sendKeys("Admin");
		  driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys("admin123");
		  driver.findElement(By.xpath(prop.getProperty("Submit"))).click();
		 
				
				/*
				 * driver.findElement(By.xpath("//input[@name='username']")).click();
				 * 
				 * logger.info("Clicked to enter Username"); Thread.sleep(1000);
				 * 
				 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
				 * logger.info("User name entered."); Thread.sleep(500);
				 * driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"
				 * ); logger.info("Password entered."); Thread.sleep(500);
				 * driver.findElement(By.xpath("//button[@type='submit']")).click();
				 * logger.info("Submit button clicked.");
				 */
				 
				  
			}
}