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
public class SeleniumTest3 {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://duckduckgo.com/");
		
	}
	
	@Test
	public void AverifyTitleName() {
		
		System.out.println("In verify title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("DuckDuckGo — Privacy, simplified."));
		
		if(title.contains("DuckDuckGo — Privacy, simplified."))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify title test case");
		System.out.println();
		
	}
	
	@Test
	public void BverifySearchButtonTag() {
		
		System.out.println("In verify search button tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.id("search_button_homepage")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("Search button tag: " + actual_tag);
		System.out.println("Exiting verify search button tag test case");
		System.out.println();
		
	}
	
	@Test
	public void CverifySearchButtonType() {
		
		System.out.println("In verify search button type test case");
		String expected_value = "submit";
		String actual_value = driver.findElement(By.id("search_button_homepage")).getAttribute("type");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("submit"))
			System.out.println("Search button type: " + actual_value);
		System.out.println("Exiting verify search button type test case");
		System.out.println();
		
	}
	
	@Test
	public void DverifySearchBar() {
		
		System.out.println("In verify search bar tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.id("search_button_homepage")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("Search bar tag: " + actual_tag);
		System.out.println("Exiting verify search bar tag test case");
		System.out.println();
		
	}
	
	@Test
	public void EverifySearchBarName() {
		
		System.out.println("In verify search bar name test case");
		String expected_value = "q";
		String actual_value = driver.findElement(By.id("search_button_homepage")).getAttribute("name");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("q"))
			System.out.println("Search bar name: " + actual_value);
		System.out.println("Exiting verify search bar name test case");
		System.out.println();
		
	}
	
	
	@Test
	public void FverifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.id("search_form_input_homepage")).sendKeys("Testing Contents");
		driver.findElement(By.id("search_form_input_homepage")).submit();
		String expected_value = "Testing Contents";
		String actual_value = driver.findElement(By.id("search_form_input")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void GverifySearchPageTitle() {
		
		System.out.println("In verify new title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents - at DuckDuckGo"));
		
		if(title.contains("Testing Contents at DuckDuckGo"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify new title test case");
		System.out.println();
		
	}
	
	@Test
	public void HverifyNewSearchBarName() {
		
		System.out.println("In verify new search bar name test case");
		String expected_value = "q";
		String actual_value = driver.findElement(By.id("search_form_input")).getAttribute("name");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("q"))
			System.out.println("Search bar name: " + actual_value);
		System.out.println("Exiting verify new search bar name test case");
		System.out.println(); 
		
	}
	
	@Test
	public void IverifySearchBarContentsClear() {
		
		System.out.println("In verify clear search bar contents test case");
		driver.findElement(By.id("search_form_input")).clear();
		String expected_value = "";
		String actual_value = driver.findElement(By.id("search_form_input")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar is empty");
			System.out.println("Exiting verify clear search bar contents test case");
			System.out.println();
		
	}
	
	@Test
	public void JverifyNewSearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.id("search_form_input")).sendKeys("Testing Contents 2");
		driver.findElement(By.id("search_form_input")).submit();
		String expected_value = "Testing Contents 2";
		String actual_value = driver.findElement(By.id("search_form_input")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents 2"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void KverifyNewSearchPageTitle() {
		
		System.out.println("In verify new title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents 2 - at DuckDuckGo"));
		
		if(title.contains("Testing Contents 2 at DuckDuckGo"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify new title test case");
		System.out.println();
		
	}
	
	@Test
	public void LverifyNewSearchBarContentsClear() {
	
		System.out.println("In verify clear search bar contents test case");
		driver.findElement(By.id("search_form_input")).clear();
		String expected_value = "";
		String actual_value = driver.findElement(By.id("search_form_input")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar is empty");
			System.out.println("Exiting verify clear search bar contents test case");
			System.out.println();
		
	}
	
	//tear down the created driver when the tests finish running 
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
