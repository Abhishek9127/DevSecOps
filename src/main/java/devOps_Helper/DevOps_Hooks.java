package devOps_Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DevOps_Hooks extends DevOps_Base {

	@Before
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		option.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver();
		 
	}
}
