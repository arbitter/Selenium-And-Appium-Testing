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

public class GoogleSearchSeleniumTest {
	
static WebDriver driver;
	

	@BeforeClass
	public static void initDriver() {
		
		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/search?sxsrf=ALeKk02_iwcTvItFXQGcDoFzds2T8uHfEg%3A1586284292513&source=hp&ei=BMeMXoqwHNCWsQWMjoqgCw&q=Testing+Contents&oq=Testing+Contents&gs_lcp=CgZwc3ktYWIQAzIICAAQFhAKEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yBggAEBYQHjIGCAAQFhAeMgYIABAWEB4yCAgAEBYQChAeMgYIABAWEB4yCAgAEBYQChAeOgcIIxDqAhAnOgQIIxAnOgUIABCRAjoFCAAQgwE6AggAOgQIABBDSikIFxIlMGcxMDFnMTAwZzgyZzc0Zzk4ZzczZzgyZzg0ZzE1M2c3OWc5NUobCBgSFzBnMWcxZzFnMWcxZzFnMWcxZzFnNWcyUKmWHFj-ohxgk6QcaARwAHgAgAGSAYgBqwqSAQQxNC4ymAEAoAEBqgEHZ3dzLXdperABCg&sclient=psy-ab&ved=0ahUKEwiKwo---dboAhVQS6wKHQyHArQQ4dUDCAk&uact=5");
	}
	
	@Test
	public void verifyGoogleSearchPageTitle() {
		
		System.out.println("In verify title test case");
		String title = driver.getTitle();
		assertTrue(title.contains("Testing Contents - Google Search"));
		
		if(title.contains("Testing Contents - Google Search"))
			System.out.println("Title: " + title);
		System.out.println("Exiting verify title test case");
		System.out.println();
		
	}
	
	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
