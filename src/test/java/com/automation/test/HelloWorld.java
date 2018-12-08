package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloWorld {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Page title is: " + driver.getTitle());
		driver.quit();
	}

	@Test
	public void test_case3() {
		driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		WebElement element = driver.findElement(By.name("wd"));
		element.sendKeys("hello Selenium!");
		element.submit();
	}

}