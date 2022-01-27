package com.genrics.MavenActitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{

	
	public void SelectByVisibleText(WebElement element, String text) 
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void SelectByValue(WebElement element, String value) 
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void SelectByIndex(WebElement element, int index) 
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);	
	}
	
	public void Contextclick(WebDriver driver, WebElement onElement)
	{
		Actions act=new Actions(driver);
		act.contextClick(onElement).perform();
	}
}
