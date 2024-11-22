package devOps_pages;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import devOps_Helper.DevOps_Base;
import junit.framework.Assert;

public class LoginPagefile extends DevOps_Base {

	
	
	public void click_on_the_homepage_login_button() {
	WebElement btn =    driver.findElement(By.xpath("//button[@class='text-black bg-[#34B9D2]  focus:ring-4 focus:outline-none focus:ring-blue-800 font-medium rounded-lg text-md px-4 py-2 text-center']"));
	btn.click();
	}

	
	public void enter_the_email_and_password() {
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("13.himanshuraj@gmail.com");
	 
	 WebElement pass = driver.findElement(By.id("password"));
	 pass.sendKeys("Himanshu@1");
	}


	
	public void click_on_login() {
	  WebElement cli =  driver.findElement(By.xpath("//button[@class='w-full bg-cyan-400 text-black py-2 px-4 rounded-lg hover:bg-cyan-500 focus:outline-none focus:shadow-outline flex items-center justify-center']"));
	    cli.click();
	    
	}
	
	
	public void validate_the_login() {
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));	
	  WebElement val = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Our Services']")));
	  
	 String st = val.getText();
		org.junit.Assert.assertEquals("Abhishek is a good boy", "Our Services", st);
	}

		
	}

