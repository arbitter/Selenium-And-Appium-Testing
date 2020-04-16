package com.appium.xample;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class GoogleSeleniumTest {
	
	static WebDriver driver;
	

	@BeforeClass
	public static void initDriver() {
		
		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
	}
	
	//verify title for Google Web Page
	@Test
	public void verifyGoogleHomePageTitle() {
		
		System.out.println("In verify title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Google"));
		
		if(title.contains("Google"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify title test case");
		System.out.println();
		
	}
	
	//verify tag for search button
	@Test
	public void verifySearchButtonTag() {
		
		System.out.println("In verify search button tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.className("gNO89b")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("Search button tag: " + actual_tag);
		System.out.println("Exiting verify search button tag test case");
		System.out.println();
		
	}
	
	//verify value for search button
	@Test
	public void verifySearchButtonValue() {
		
		System.out.println("In verify search button value test case");
		String expected_value = "Google Search";
		String actual_value = driver.findElement(By.className("gNO89b")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("Google Search"))
			System.out.println("Search button value: " + actual_value);
		System.out.println("Exiting verify search button value test case");
		System.out.println();
		
	}
	
	//verify tag for I'm Feeling Lucky Button
	@Test
	public void verifyImFeelingLuckyButtonTag() {
		
		System.out.println("In verify I'm Feeling Lucky button tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.id("gbqfbb")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("I'm Feeling Lucky button tag: " + actual_tag);
		System.out.println("Exiting verify I'm Feeling Lucky button tag test case");
		System.out.println();
		
	}
	
	//verify value for I'm Feeling Lucky button
	@Test
	public void verifyImFeelingLuckyButtonValue() {
		
		System.out.println("In verify I'm Feeling Lucky button value test case");
		String expected_value = "I'm Feeling Lucky";
		String actual_value = driver.findElement(By.id("gbqfbb")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("I'm Feeling Lucky"))
			System.out.println("Search button value: " + actual_value);
		System.out.println("Exiting verify I'm Feeling Lucky button value test case");
		System.out.println();
		
	}
	
	//verify tag for search bar
	@Test
	public void verifySearchBarTag() {
		
		System.out.println("In verify search bar tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.className("gLFyf")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("Search bar tag: " + actual_tag);
		System.out.println("Exiting verify search bar tag test case");
		System.out.println();
		
	}
	
	//verify title for search bar
	@Test
	public void verifySearchBarTitle() {
		
		System.out.println("In verify search bar title test case");
		String expected_value = "Search";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("title");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("Search"))
			System.out.println("Search bar title: " + actual_value);
		System.out.println("Exiting verify search bar title test case");
		System.out.println();
		
	}
	
	//verify name for search bar
	@Test 
	public void verifySearchBarName() {
		
		System.out.println("In verify search bar name test case");
		String expected_value = "q";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("name");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("q"))
			System.out.println("Search bar name: " + actual_value);
		System.out.println("Exiting verify search bar name test case");
		System.out.println();
		
	}
	
	//type contents into search bar, verify the contents
	@Test
	public void verifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.className("gLFyf")).sendKeys("Testing Contents");
		String expected_value = "Testing Contents";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
