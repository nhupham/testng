package testng01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test001 {
	public WebDriver driver;

	@Test
	public void main() {

		driver.findElement(By.name("uid")).sendKeys("mgr123");
		driver.findElement(By.name("password")).sendKeys("mgr!23");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");


	}

	@BeforeMethod

	public void beforeMethod() {

		// Create a new instance of the Firefox driver

		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Launch the Online Store Website

		driver.get("http://demo.guru99.com/V4/");

	}

	@AfterMethod

	public void afterMethod() {

		// Close the driver

		driver.quit();

	}

}
