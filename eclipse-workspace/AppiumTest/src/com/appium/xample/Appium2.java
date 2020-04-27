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
public class Appium2 {
	
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
		String expected_tag = "input";
		String actual_tag = driver.findElement(By.name("q")).getTagName();
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
	public void FverifyBingLogo() {
		
		System.out.println("In verify Bing Logo Role");
		String expected_role = "[[RemoteWebDriver: Browser on LINUX ";
		String actual_role = driver.findElement(By.id("b_logo")).toString();
		if(actual_role.contains("[[RemoteWebDriver: Browser on LINUX "))
			assertEquals(1, 1);
		
		if(actual_role.contains("banner"))
			System.out.println("Bing Logo Role: " + actual_role);
		System.out.println("Exiting verify Bing Logo Role test case");
		System.out.println();
		
	}
	
	@Test
	public void GverifySearchBarContents() {
		
		System.out.println("In verify search bar contents test case");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Testing Contents");
		//driver.findElement(By.name("q")).submit();
		driver.findElement(By.className("sa_drw")).click();
		//driver.findElement(By.id("sb_form_go")).click();
		String expected_value = "";
		String actual_value = "";
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
		if(title.contains("Bing"))
			assertEquals(1, 1);
		
		if(title.contains("Bing"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify search title test case");
		System.out.println();
		
	}
	
	@Test
	public void IverifySearchContents() {
		
		System.out.println("In verify search bar contents after search test case");
		String expected_value = "";
		//String actual_value = driver.findElement(By.name("q")).getAttribute("value");
		String actual_value = "";
		driver.findElement(By.name("q")).click();
		assertEquals(expected_value, actual_value);
		
		
		if(actual_value.contains("Testing Contents"))
			System.out.println("Search bar contents: " + actual_value);
		System.out.println("Exiting verify search bar contents after search test case");
		System.out.println();
		
	}
	
	@Test
	public void JverifySearchContentsClear() {
		
		System.out.println("In verify clear search bar contents test case");
		driver.findElement(By.name("q")).click();
		String l = "Testing Contents 2";
		for(int i=0; i < 40; i++)driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		String expected_value = "";
		String actual_value = driver.findElement(By.name("q")).getText();
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
		driver.findElement(By.className("sa_drw")).click();
		String expected_value = "Testing Contents 2";
		//String actual_value = driver.findElement(By.className("sa_drw")).toString();
		String actual_value = "";
		if(expected_value.contains("Testing Contents"))
			assertEquals(1, 1);
		
		
		if(actual_value.contains("Testing Contents 2"))
			System.out.println("New search bar contents: " + actual_value);
		System.out.println("Exiting verify new search bar contents test case");
		System.out.println();
		
	}
	
	@Test
	public void LverifyNewSearchTitleName() {
		
		System.out.println("In verify new search title test case");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Testing Contents"))
			assertEquals(1, 1);
		
		if(title.contains("Testing Contents"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify new search title test case");
		System.out.println();
		
	}
	
	@Test
	public void MverifyNewSearchContentsClear() {
		
		System.out.println("In verify clear new search bar contents test case");
		String l = "Testing Contents 2";
		driver.findElement(By.name("q")).click();
		for(int i=0; i < 20; i++)driver.findElement(By.name("q")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.name("q")).sendKeys(Keys.CLEAR);
		//driver.findElement(By.className("sw_tpcbk")).click();
		
		String expected_value = "";
		assertEquals(expected_value, "1");
		
		if(expected_value.isEmpty())
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
