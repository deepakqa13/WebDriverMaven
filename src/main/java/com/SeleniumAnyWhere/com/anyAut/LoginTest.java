package com.SeleniumAnyWhere.com.anyAut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void doLogin(){
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("Logout")).click();
		driver.findElement(By.id("LogInagain")).click();
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
