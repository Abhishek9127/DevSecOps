package devOps_Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DevOps_Hooks extends DevOps_Base {

	@Before
	public void Setup() {

		String brows = prop.getProperty("Browser");

		if (brows.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--incognito");
			option.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();

		} else if (brows.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("--incognito");
			option.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
		}

		else if (brows.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--incognito");
			option.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();

		}

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown(Scenario s) {
		if (s.isFailed()) {
			Screenshot();
		}
		driver.quit();
		System.out.println("Done");

	}

}