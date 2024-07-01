package com.selenium.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Keys;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@Test
	public void TestGoogle() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("CDAC", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	@Test
	public void TestWeb() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://codedamn.com/login");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com", Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
