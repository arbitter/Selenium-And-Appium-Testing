package com.appium.xample;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Appium3 {
	
	//private static RemoteWebDriver driver = null;
	private static WebDriver driver;
		
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "5.7\" Marshmallow (6.0.0); XHDPI Phone");
		caps.setCapability(CapabilityType.BROWSER_NAME, "Browser");
		caps.setCapability(CapabilityType.VERSION, "6.0");
		caps.setCapability("chromedriverExecutable", "C:\\Users\\Avery\\Documents\\chromedriver_2.17\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), caps);
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
		String actual_value = driver.findElement(By.id("search_button_homepage")).toString();
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
		String actual_value = driver.findElement(By.id("search_form_input_homepage")).getTagName();
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
		driver.findElement(By.id("search_button_homepage")).click();
		String expected_value = "Testing Contents";
		assertEquals(expected_value, "Testing Contents");
		
		
		if(expected_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + expected_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void GverifySearchPageTitle() {
		
		System.out.println("In verify new title test case");
		String title = driver.getTitle();
		assertEquals(title, "Testing Contents at DuckDuckGo");
		
		if(title.contains("Testing Contents at DuckDuckGo"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify new title test case");
		System.out.println();
		
	}
	
	@Test
	public void HverifyNewSearchBarName() {
		
		System.out.println("In verify new search bar name test case");
		String expected_value = "q";
		String actual_value = driver.findElement(By.id("search_form_input")).getTagName();
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
		String actual_value = driver.findElement(By.id("search_form_input")).getText();
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
		driver.findElement(By.id("search_button")).click();
		String expected_value = "Testing Contents 2";
		assertEquals(expected_value, "Testing Contents 2");
		
		
		if(expected_value.contains("Testing Contents 2"))
			System.out.println("Search bar contents: " + expected_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void KverifyNewSearchPageTitle() {
		
		System.out.println("In verify new title test case");
		String title = driver.getTitle();
		assertEquals(title, "Testing Contents 2 at DuckDuckGo");
		
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
		String actual_value = driver.findElement(By.id("search_form_input")).getText();
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
