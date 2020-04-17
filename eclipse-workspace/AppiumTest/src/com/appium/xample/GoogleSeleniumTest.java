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
	public void AverifyGoogleHomePageTitle() {
		
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
	public void BverifySearchButtonTag() {
		
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
	public void CverifySearchButtonValue() {
		
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
	public void DverifyImFeelingLuckyButtonTag() {
		
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
	public void EverifyImFeelingLuckyButtonValue() {
		
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
	public void FverifySearchBarTag() {
		
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
	public void GverifySearchBarTitle() {
		
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
	public void HverifySearchBarName() {
		
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
	public void IverifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.className("gLFyf")).sendKeys("Testing Contents");
		driver.findElement(By.className("gLFyf")).submit();
		String expected_value = "Testing Contents";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	//verify the new title on the google search page
	@Test
	public void JverifyGoogleSearchPageTitle() {
		
		System.out.println("In verify search title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents - Google Search"));
		
		if(title.contains("Testing Contents - Google Search"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify search title test case");
		System.out.println();
		
	}
	
	//verify the clear button clears the contents in the google search bar
	@Test
	public void KverifyClearSearchBarContents() {
		System.out.println("In verify clear search bar contents test case");
		driver.findElement(By.className("clear-button")).click();
		String expected_value = "";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar is empty");
			System.out.println("Exiting verify clear search bar contents test case");
			System.out.println();
		
		
	}
	
	//verify the new search bar contents
	@Test
	public void LverifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case 2");
		driver.findElement(By.className("gLFyf")).sendKeys("Testing Contents 2");
		driver.findElement(By.className("gLFyf")).submit();
		String expected_value = "Testing Contents 2";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents 2"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case 2");
		System.out.println();
		
	}
	
	//verify the new google search page title 
	@Test
	public void MverifyGoogleSearchPageTitle() {
		
		System.out.println("In verify search title test case 2");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents 2 - Google Search"));
		
		if(title.contains("Testing Contents 2 - Google Search"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify search title test case 2");
		System.out.println();
		
	}
	
	//click the google search bar and verify its class name
	@Test
	public void NClickGoogleSearchBar() {
		
		System.out.println("In click google search bar test case");
		
		driver.findElement(By.className("gLFyf")).click();
		
		String expected_value = "gLFyf";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("class");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("gLFyf"))
			System.out.println("Search bar class name: " + actual_value);
		System.out.println("Exiting click google search bar test case");
		System.out.println();
		
	}
	
	//verify clearing the search bar using selenium's clear() function
	@Test
	public void OClearSearchBarContents() {
		
		System.out.println("In clear search bar test case");
		
		driver.findElement(By.className("gLFyf")).clear();
		
		String expected_value = "";
		String actual_value = driver.findElement(By.className("gLFyf")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar empty");
		System.out.println("Exiting clear search bar test case");
		System.out.println();
		
	}
	
	//tear down the created driver when the tests finish running 
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
