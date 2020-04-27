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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.URL;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Appium {
	
	//private static RemoteWebDriver driver = null;
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Browser");
		//caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "5.7\" Marshmallow (6.0.0); XHDPI Phone");
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "5.7\" Marshmallow (6.0.0); XHDPI Phone");
		caps.setCapability(CapabilityType.BROWSER_NAME, "Browser");
		caps.setCapability(CapabilityType.VERSION, "6.0");
		caps.setCapability("chromedriverExecutable", "C:\\Users\\Avery\\Documents\\chromedriver_2.17\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Avery\\Documents\\chromedriver_2.17\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), caps);
		driver.get("https://google.com/");
	}
	
	@Test
	public void AverifyGoogleHomePageTitle() {
		
		System.out.println("In verify new search bar name test case");
		String expected_value = "Google";
		String actual_value = driver.getTitle();
		System.out.println(actual_value);
		assertEquals(expected_value, actual_value);
		
		if(actual_value == "Google")
			System.out.println("Page Title: " + actual_value);
		System.out.println("Exiting verify page title test case");
		System.out.println();
		
	}
	
	//verify tag for search button
	@Test
	public void BverifyTitleTag() {
		
		System.out.println("In verify search button tag test case");
		String expected_tag = "img";
		String actual_tag = driver.findElement(By.id("hplogo")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("img"))
		System.out.println("Search button tag: " + actual_tag);
		System.out.println("Exiting verify search button tag test case");
		System.out.println();
		
	}
	
	//verify value for search button
	@Test
	public void CverifySearchButtonValue() {
		
		System.out.println("In verify search button value test case");
		String expected_value = "a";
		String actual_value = driver.findElement(By.className("active")).getTagName();
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("a"))
			System.out.println("Search button value: " + actual_value);
		System.out.println("Exiting verify search button value test case");
		System.out.println();
		
	}
	
	//verify tag for I'm Feeling Lucky Button
	@Test
	public void DverifyImFeelingLuckyButtonTag() {
		
		System.out.println("In verify search button tag test case");
		String expected_tag = "button";
		//String actual_tag = driver.findElement(By.className("SDkEP")).getTagName();
		String actual_tag = driver.findElement(By.className("Cdl0yb")).getTagName();
		assertEquals(expected_tag, actual_tag);
		
		if(actual_tag.contains("button"))
			System.out.println("Search button tag: " + actual_tag);
		System.out.println("Exiting verify I'm Feeling Lucky button tag test case");
		System.out.println();
		
	}
	
	//verify value for I'm Feeling Lucky button
	@Test
	public void EverifySubmitButtonTag() {
		
		System.out.println("In verify submit button value test case");
		String expected_value = "button";
		String actual_value = driver.findElement(By.className("Tg7LZd")).getTagName();
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("button"))
			System.out.println("Search button tag: " + actual_value);
		System.out.println("Exiting verify submit button tag test case");
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
	public void GverifySearchBarClass() {
		
		System.out.println("In verify search bar class test case");
		String expected_value = "org.openqa.selenium.remote.RemoteWebElement";
		String actual_value = driver.findElement(By.className("gLFyf")).getClass().getName();
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains("org.openqa.selenium.remote.RemoteWebElement"))
			System.out.println("Search bar title: " + actual_value);
		System.out.println("Exiting verify search bar class test case");
		System.out.println();
		
	}
	
	//verify name for search bar
	@Test 
	public void HverifySearchBarContentsNOKEYS() {
		
		System.out.println("In verify search bar contents NO KEYS case");
		String expected_value = "";
		String actual_value = driver.findElement(By.className("gLFyf")).getText();
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar empty");
		System.out.println("Exiting verify search bar contents NO KEYS test case");
		System.out.println();
		
	}
	
	//type contents into search bar, verify the contents
	@Test
	public void IverifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.className("gLFyf")).sendKeys("Testing Contents");
		//driver.findElement(By.className("gLFyf")).submit();
		//driver.findElement(By.className("Tg7LZd")).click();
		String expected_value = "Testing Contents";
		String actual_value = driver.findElement(By.className("gLFyf")).getText();
		//String actual_value = "";
		assertEquals(expected_value, actual_value);
		driver.findElement(By.className("Tg7LZd")).click();
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents test case");
		System.out.println();
		
	}
	
	//verify the new title on the google search page
	@Test
	public void JverifyGoogleSearchPageTitle() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("In verify search title test case 2");
		String title = driver.getTitle();
		assertEquals(title, "Google");
		
		if(title.contains("Google"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify search title test case");
		System.out.println();
		
	}
	
	//verify the clear button clears the contents in the google search bar
	@Test
	public void KverifyClearSearchBarContents() {
		
		System.out.println("In verify clear search bar contents test case");
		driver.findElement(By.className("gLFyf")).clear();
		String expected_value = "";
		String actual_value = driver.findElement(By.className("gLFyf")).getText();
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
		driver.findElement(By.className("Tg7LZd")).click();
		String expected_value = "[[RemoteWebDriver: Browser on LINUX";
		String actual_value = driver.findElement(By.className("gLFyf")).toString();
		
		
		if(actual_value.contains("[[RemoteWebDriver: Browser on LINUX"))
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
		
		String expected_value = "";
		String actual_value = driver.findElement(By.className("gLFyf")).getText();
		assertEquals(expected_value, actual_value);
		
		if(actual_value.contains(""))
			System.out.println("Search bar clicked");
		System.out.println("Exiting click google search bar test case");
		System.out.println();
		
	}
	
	//verify clearing the search bar using selenium's clear() function
	@Test
	public void OClearSearchBarContents() {
		
		System.out.println("In clear search bar test case");
		
		driver.findElement(By.className("gLFyf")).clear();
		
		String expected_value = "";
		String actual_value = driver.findElement(By.className("gLFyf")).getText();
		assertEquals(expected_value, actual_value);
		
		if(actual_value.isEmpty())
			System.out.println("Search bar empty");
		System.out.println("Exiting clear search bar test case");
		System.out.println();
		
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
		
	}



}
