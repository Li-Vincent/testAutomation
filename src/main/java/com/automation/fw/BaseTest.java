package com.automation.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	private static WebDriver m_driver;

	public static WebDriver getDriver() {
		return m_driver;
	}

	public static void setDriver(WebDriver m_driver) {
		BaseTest.m_driver = m_driver;
	}

	public static void openBaidu() {
		m_driver = new ChromeDriver();
		m_driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		m_driver.get("https://www.baidu.com");
		m_driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void refresh() {
		m_driver.navigate().refresh();
	}

	public static void quit() {
		m_driver.quit();
	}
}
