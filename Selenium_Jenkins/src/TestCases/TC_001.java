package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {

	
	@Test
	public void Testcase01()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PSK Enterprises\\Desktop\\chromedriver\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("amit@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("fjeerjferkj");
		driver.quit();		
		
	}

}
