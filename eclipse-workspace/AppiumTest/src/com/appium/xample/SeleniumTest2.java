package com.appium.xample;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SeleniumTest2 {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void initDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bing.com/");
	}
	
	@Test
	public void AverifyTitleName() {
	
		System.out.println("In verify title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Bing"));
		
		if(title.contains("Google"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify title test case");
		System.out.println();
	
	}
	
	//tear down the created driver when the tests finish running 
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
