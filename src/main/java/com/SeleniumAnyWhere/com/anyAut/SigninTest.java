package com.SeleniumAnyWhere.com.anyAut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SigninTest {

	public static WebDriver driver;
	@BeforeMethod
	public void setUpAgain(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	@Test
	public void doSignin(){
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("signin")).click();
		driver.findElement(By.id("signin")).click();
	}
	@AfterMethod
	public void tearDownAgain(){
		driver.quit();
	}
}
