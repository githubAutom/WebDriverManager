package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@Test
	public void doLogin() throws InterruptedException {
		driver.get("http://gmail.com");
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("divyamoturi2504@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("abc");
	}
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
