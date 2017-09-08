package log4j;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Google {
	static final Logger log = Logger.getLogger(Google.class);
	SoftAssert s_assert = new SoftAssert();

	@Test
	public void googleSearchTest() {
		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		log.info("Browser Opened");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 log.debug("Implicit wait given");
		
		 driver.get("https://www.google.com");
		log.info("Url opened");
		
		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		log.info("search keyword typed");

		log.info(driver.getTitle());

		String pageTitle = driver.getTitle();
		driver.quit();

		s_assert.assertTrue(pageTitle.contains("Selenium"),"SOft Assert Message: Page title doesn't match!");
		
		
	
		log.assertLog(pageTitle.contains("Selenium"), "PAGE TITLE DOES NOT MATCH!");
		
		s_assert.assertAll();

	}

}