package devOps_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import devOps_Helper.DevOps_Base;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Services_Pagefile extends DevOps_Base {

	public void click_on_the_services_icon() {
		
		 
		WebElement ser = driver.findElement(By.xpath("(//a[@class='block py-2 px-3 text-white rounded hover:bg-gray-700 md:hover:bg-transparent md:hover:text-blue-500 md:p-0 text-md'])[1]"));
		 
		ser.click();
		
	}

	public void validate_with_text_on_the_page() {
		
		WebElement v = driver.findElement(By.xpath("//*[text()='Our Services']"));

		
		

		System.out.println(validate);

	}

	public void click_on_the_infra_button() {
		WebElement infra = driver.findElement(By.xpath("//*[text()='Infrastructure As Code']"));
		

		
		infra.click();

	}

	public void validate_with_the_infra_text() {
		// WebElement it = driver.findElement(By.xpath("//<p>[contains(text(),'Manage
		// and provision computing']"));
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
		driver.findElement(By.xpath("//div[@class='absolute inset-y-0 right-0 flex items-center']")).click();
	}

	public void validate_with_the_cloud_text() {
		System.out.println("abhi");
	}

}
