package devOps_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import devOps_Helper.DevOps_Base;

public class Services_Pagefile extends DevOps_Base {

	public void click_on_the_services_icon() {

		WebElement ser = driver.findElement(By.xpath(
				"(//a[@class='block py-2 px-3 text-white rounded hover:bg-gray-700 md:hover:bg-transparent md:hover:text-blue-500 md:p-0 text-md'])[1]"));
		ser.click();
	}

	public void validate_with_text_on_the_page() {
		WebElement v = driver.findElement(By.xpath("//h1[@class='text-3xl md:text-5xl font-semibold px-4 md:px-12']"));
		String validate = v.getText();

		System.out.println(validate);
	}
}
