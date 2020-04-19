package com.appium.xample;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Appium {
	
	static DesiredCapabilities capabilities = new DesiredCapabilities();
	static WebDriver driver;
	
	@BeforeClass
	public static void initDriver() throws MalformedURLException {
		
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("NoReset", "true");
		capabilities.setCapability("fullReset", "false");
		capabilities.setCapability("deviceName", "Samsung Galaxy Note4");
		capabilities.setCapability("platformVersion", "6.0.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Avery\\Desktop\\apkfiles");
		capabilities.setCapability("appPackage", "com.android.chrome_80.0.3987.162-398716210_minAPI19_maxAPI23(x86)(nodpi)_apkmirror.com");
		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("https://google.com/");
		
	}
	
	@Test
	public void exampleTest() throws MalformedURLException {
		
		System.out.println("In verify title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Google"));
		
		if(title.contains("Google"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify title test case");
		System.out.println();
		
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		
		
		driver.quit();
		
	}

}
