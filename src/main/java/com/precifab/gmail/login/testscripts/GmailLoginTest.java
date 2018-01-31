package com.precifab.gmail.login.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GmailLoginTest {
	/*@Parameters({"userName","password"})
*/	
	@Test
	public void testGmailLogin(){
		
		System.setProperty("webdriver.chrome.driver", "D:/muna/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com/");
		driver.findElement(By.name("identifier")).sendKeys("deepankardas.017@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("muna.321");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		/*System.out.println(userName);
		System.out.println(password);*/
	}
}
