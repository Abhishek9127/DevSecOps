package devOps_Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevOps_Base {

	public static Properties prop;
	public static WebDriver driver;
	static {

		prop = new Properties();
		try {
			FileInputStream b = new FileInputStream("target/data.properties");
			prop.load(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Screenshot() {

		TakesScreenshot scrn = (TakesScreenshot) driver;
		File SS = scrn.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SS, new File("devScreenshot/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//abhishek
	}
	
	public void explicitWait(WebElement abhi, int s) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(s));
	    wait.until(ExpectedConditions.visibilityOf(abhi));
	}
}
