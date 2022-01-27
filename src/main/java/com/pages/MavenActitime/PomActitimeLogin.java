package com.pages.MavenActitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.genrics.MavenActitime.AutoConstant;
import com.genrics.MavenActitime.ExcelSheetLibrary;


public class PomActitimeLogin implements AutoConstant
{

	@FindBy(id="username")
	private WebElement  UserNameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement PasswordTextField;
	
	@FindBy(id="keepLoggedInLabel")
	private WebElement KeepmeLoggedInCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement Loginbutton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement ForgotYourPasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement ActiTimeIncLink;
	
	public  PomActitimeLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException 
	{
		UserNameTextField.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName, 1, 0));
		PasswordTextField.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName, 1, 1));
		KeepmeLoggedInCheckbox.click();
		Loginbutton.click();
	}
}