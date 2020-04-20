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
		
		if(title.contains("Bing"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify title test case");
		System.out.println();
	
	}
	
	//verify tag for search button
	@Test
	public void BverifySearchButtonTag() {
		
		System.out.println("In verify search button tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.id("sb_form_go")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("Search button tag: " + actual_tag);
		System.out.println("Exiting verify search button tag test case");
		System.out.println();
		
	}
	
	@Test
	public void CverifySearchByImageName() {
		
		System.out.println("In verify search by image name test case");
		String expected_tag = "div";
		String actual_tag = driver.findElement(By.className("camera")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("div"))
			System.out.println("Search by image name: " + actual_tag);
		System.out.println("Exiting verify search by image name test case");
		System.out.println();
		
	}
	
	@Test
	public void DVerifySearchBarName() {
		
		System.out.println("In verify search bar name test case");
		String expected_tag = "Enter your search term";
		String actual_tag = driver.findElement(By.name("q")).getAttribute("title");
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("Enter your search term"))
			System.out.println("Search bar name: " + actual_tag);
		System.out.println("Exiting verify search bar name test case");
		System.out.println();
		
	}
	
	@Test
	public void EVerifySearchBarTag() {
		
		System.out.println("In verify search bar tag test case");
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.name("q")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("input"))
			System.out.println("Search bar tag: " + actual_tag);
		System.out.println("Exiting verify search bar tag test case");
		System.out.println();
		
	}
	
	@Test
	public void FverifyBingLogoRole() {
		
		System.out.println("In verify Bing Logo Role");
		String expected_role = "banners";
		String actual_role = driver.findElement(By.id("b_logo")).getAttribute("role");
		assertEquals(expected_role, actual_role);
		
		if(actual_role.contains("banner"))
			System.out.println("Bing Logo Role: " + actual_role);
		System.out.println("Exiting verify Bing Logo Role test case");
		System.out.println();
		
	}
	
	@Test
	public void GverifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.name("q")).sendKeys("Testing Contents");
		driver.findElement(By.name("q")).submit();
		String expected_value = "Testing Contents";
		String actual_value = driver.findElement(By.name("q")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void HverifySearchTitleName() {
		
		System.out.println("In verify search title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents - Bing"));
		
		if(title.contains("Testing Contents - Bing"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify search title test case");
		System.out.println();
		
	}
	
	@Test
	public void IverifySearchContents() {
		
		System.out.println("In verify search bar contents after search test case");
		String expected_value = "Testing Contents";
		String actual_value = driver.findElement(By.name("q")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents after search test case");
		System.out.println();
		
	}
	
	@Test
	public void JverifySearchContentsClear() {
		
		System.out.println("In verify clear search bar contents test case");
		driver.findElement(By.name("q")).clear();
		String expected_value = "";
		String actual_value = driver.findElement(By.name("q")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar is empty");
			System.out.println("Exiting verify clear search bar contents test case");
			System.out.println();
		
	}
	
	@Test
	public void KverifyNewSearchContents() {
		
		System.out.println("In verify new search bar contents test case");
		driver.findElement(By.name("q")).sendKeys("Testing Contents 2");
		driver.findElement(By.name("q")).submit();
		String expected_value = "Testing Contents 2";
		String actual_value = driver.findElement(By.name("q")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents 2"))
			System.out.println("New search bar contents: " + actual_value);
		System.out.println("Exiting verify new search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void LverifyNewSearchTitleName() {
		
		System.out.println("In verify new search title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents 1 - Bing"));
		
		if(title.contains("Testing Contents 2 - Bing"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify new search title test case");
		System.out.println();
		
	}
	
	@Test
	public void MverifyNewSearchContentsClear() {
		
		System.out.println("In verify clear new search bar contents test case");
		driver.findElement(By.name("q")).clear();
		String expected_value = "";
		String actual_value = driver.findElement(By.name("q")).getAttribute("value");
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar is empty");
			System.out.println("Exiting verify clear new search bar contents test case");
			System.out.println();
		
	}
	
	//tear down the created driver when the tests finish running 
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
