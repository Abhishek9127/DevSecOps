package devOps_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import devOps_Helper.DevOps_Base;

public class Services_Pagefile extends DevOps_Base {

	public void click_on_the_services_icon() {

		WebElement ser = driver.findElement(By.linkText("Services"));
		ser.click();
	}

	public void validate_with_text_on_the_page() {
		WebElement v = driver.findElement(By.xpath("//*[text()='Our Services']"));
		String validate = v.getText();

	
		System.out.println(validate);
	}
	
	

	public void click_on_the_infra_button() {
	WebElement infra = driver.findElement(By.xpath("//*[text()='Infrastructure As Code']"));
	infra.click();
	}

	
	public void validate_with_the_infra_text() {
	//WebElement it =  driver.findElement(By.xpath("//<p>[contains(text(),'Manage and provision computing']"));
	System.out.println("run");
	}

	
	public void click_on_the_devops_button() {
		
		driver.findElement(By.xpath("//*[text()='DevOps Automation']")).click();
	    
	}

	
	public void validate_with_the_devops_text() {
//	String devt =	driver.findElement(By.xpath("//*[text()='Streamline and automate software development and IT operations processes to improve efficiency and reduce errors.']")).getText();
	System.out.println("run2");
	}

	
	public void click_on_the_cloud_button() {
		driver.findElement(By.xpath("//*[text()='Cloud Management']")).click();
	}

	
	public void validate_with_the_cloud_text() {
	   System.out.println("abhi");
	}

}
