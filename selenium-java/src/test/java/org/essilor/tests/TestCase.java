package org.essilor.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * authorname:
 * createdDate
 * Purpose:
 * 
 * 
 * 
 * Usage:
 * Scope:
 * ExceptionHandlers:
 */


public class TestCase {

	public static void main(String[] args) {

//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Essilor Training\\Day1\\Labs\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.igniteui.com/grid/overview");
		String strText = driver.getTitle();

		
		if (strText.contains("Data Grid Control")) {
			System.out.println("APPlication is launched successfully  with title: "+strText);}
			else {
				System.out.println("APPlication is not launched successfully  with title: "+strText);
			}
	
		driver.quit();
	}
}


