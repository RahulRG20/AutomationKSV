package com.pages.MavenActitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.genrics.MavenActitime.AutoConstant;
import com.genrics.MavenActitime.ExcelSheetLibrary;

public class POMCreateLeave implements AutoConstant {

	public String randomString;
	public WebDriver driver;

// ------ Settings Tab
	@FindBy(xpath = "//div[@class=\"topMenuButton preventPanelsHiding\"][2]")
	private WebElement SettingTab2;

// ------ LeaveTypeLinkInMenu
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement LeaveTypeLink;

// ------ CreateLeaveTypeButton
	@FindBy(xpath = "//div[@class=\"roundedBoxTag graphicButton button \"]")
	private WebElement CreateLeaveTypeButon;

// ------ EnterLeaveTypeName
	@FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder\"]")
	private WebElement EnterLeaveTypeName;

// ------ CreateLeaveSubmitButton
	@FindBy(xpath = "//div[@class=\"greyButton withIcon commitBtn\"]")
	private WebElement CreateLeaveSubmitButton;

// ------ EditLeaveType
	@FindBy(xpath = "(//td[.=\"HappyLeave\"])[1]")
	private WebElement EditLeavebtn;

	@FindBy(xpath = "//input[@id=\"inputDiv\"]")
	private WebElement EditLeaveBtn2;

	@FindBy(xpath = "//input[@id=\"inputDiv\"]/../..//td//div[@class=\"applyButton\"]")
	private WebElement ApplyBtn;

// -------DeleteLeaveType

	@FindBy(xpath = "(//span[.='UrgentLeave'])[1]/../../../../../../td[@class=\"leaveTypeDeleteCell last\"]")
	private WebElement DeleteLeaveType;

//	@FindBy(xpath = "//span[.='Delete permanently']")
//	private WebElement DeleteConfirmation;

//	// DeleteLeaveButton
//	@FindBy(xpath = "(//*[.='fsfsdf']/../..//*[contains(text(),'delete')])")
//	private WebElement DeleteLeaveButton;

//	@FindBy(xpath = "(.//tr/td/div/span[text()=''"+randomString+"''])[1]/ancestor::tr[2]/td[7]")
//	private WebElement deleteBtn;

	public POMCreateLeave(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SettingTab2() {
		SettingTab2.click();
	}

	public void LeaveTypeLink() {
		LeaveTypeLink.click();
	}

	public void CreateLeaveTypeButon() {
		CreateLeaveTypeButon.click();
	}

//	public void EnterLeaveTypeName() {
//		randomString = ReusableMethod.getrandomString();
//		EnterLeaveTypeName.sendKeys(randomString);
//	}

	public void EnterLeaveTypeName() throws InterruptedException, IOException {
		Thread.sleep(2000);
		EnterLeaveTypeName.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName4, 1, 0));
	}

	public void CreateLeaveSubmitButton() {
		CreateLeaveSubmitButton.click();
	}

	public void EditLeave() throws InterruptedException, IOException 
	{
		EditLeavebtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		EditLeaveBtn2.clear();
		Thread.sleep(2000);
		EditLeaveBtn2.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName4, 2, 0));
		ApplyBtn.click();
	}

// ------- Delete
	public void DeleteLeaveType() throws InterruptedException {
		Thread.sleep(3000);
		DeleteLeaveType.click();

	}

// ------ DeleteConfirmation.click();
	public void DeleteConfirmation() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
