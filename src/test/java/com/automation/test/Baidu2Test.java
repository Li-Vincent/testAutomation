package com.automation.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.fw.BaseTest;

public class Baidu2Test {

	@BeforeMethod
	public void beforeMethod() {
		BaseTest.openBaidu();
	}

	@AfterMethod
	public void afterMethod() {
		BaseTest.quit();
	}

	@Test
	public void test() {
        BaseTest.getDriver().findElement(By.xpath(".//*[@id='kw']")).sendKeys("selenium");
        BaseTest.getDriver().findElement(By.xpath(".//*[@id='su']")).click();

        try {
        	Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        Assert.assertTrue(BaseTest.getDriver().getPageSource().contains("浏览器自动化测试框架"));
        Reporter.log("搜索Selenium的测试用例");
	}

}