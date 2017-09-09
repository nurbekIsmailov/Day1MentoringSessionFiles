package headlessBrowserDemo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	static final Logger log = Logger.getLogger(Test2.class);

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/SuperUser/Documents/Libraries/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		log.info("Setting chromedriver");

		log.info("Browser Opened");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		driver.get("https://www.google.com");
		log.info("Url opened");

		driver.findElement(By.name("q")).sendKeys("Selenium" + Keys.ENTER);
		log.info("searching for selenium KEYWORD");

		log.info(driver.getTitle());

		String pageTitle = driver.getTitle();
		driver.quit();

	}

}
