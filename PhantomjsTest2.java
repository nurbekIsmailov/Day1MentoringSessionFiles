package log4j;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PhantomjsTest2 {

	WebDriver driver;


	@Test
	public void GoogleSearch() {
		System.setProperty("phantomjs.binary.path", "./src/test/resources/drivers/phantomjs.exe");		
        WebDriver driver = new PhantomJSDriver();
     driver.get("http://www.google.com"); 

     // 	System.setProperty("webdriver.chrome.driver",
//			   "/Users/SuperUser/Documents/Libraries/drivers/chromedriver.exe");
//	driver=new ChromeDriver();
	
	 System.out.println("title is "+ driver.getTitle());
	 
	 driver.get("http://www.google.com");         
     WebElement element = driver.findElement(By.name("q"));	
     element.sendKeys("Guru99");					
     element.submit();         			
     System.out.println("Page title is: " + driver.getTitle());		
     driver.quit();	
	}
	

	
}
