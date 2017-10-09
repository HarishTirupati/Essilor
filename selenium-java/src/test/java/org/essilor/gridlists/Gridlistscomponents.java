package org.essilor.gridlists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gridlistscomponents implements Gridlistselements {

	
	//returns single webelement from Gridlists page
	public WebElement getWebElement(WebDriver driver, String xpath) {
		
		WebElement webelement = driver.findElement(By.xpath(xpath));
		return webelement;
	}
	
	//enter text in searchbox
	public void enterText(WebDriver driver, WebElement webelement)
	{
		
	}
	
	//verify search Results
	public boolean verifyResult(String expectedtext, String actualtext)
	{
		return ;
	}
	
	
	//Enter Search text by Header
	public void enterSearchTextByHeaderName() {
		
	}
	
}
