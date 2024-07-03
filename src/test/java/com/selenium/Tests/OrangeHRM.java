package com.selenium.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	
	@Test
	public void LaunchApp() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.quit();
	}
	
	// @Test
	// public void EnterLoginDetails() {
	// 	WebDriverManager.edgedriver().setup();
	// 	driver = new EdgeDriver();
	// 	driver.manage().window().maximize();
	// 	driver.get("https://opensource-demo.orangehrmlive.com/");
	// 	//driver.findElement(By.name("username")).sendKeys("Admin");
	// 	//driver.findElement(By.name("password")).sendKeys("admin123");
	// 	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	// }
	
	// @Test
	// public void NavigateToMyInfo() {
	// 	driver.findElement(By.xpath("//p[@class=\'oxd-icon oxd-main-menu-item--icon\']")).click();
	// }
	
	// @Test
	// public void VerifyMyInfo() {
	// 	System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
	// 	driver.quit();
	// }
	
	// @Test
	// public void VerifyLogin() {
	// 	WebElement element = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name' and text()='manda user']"));
	// 	System.out.println(element.isDisplayed());
	// 	System.out.println(element.getText());
	// 	driver.quit();
	// }

}
