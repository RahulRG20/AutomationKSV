package com.pages.MavenActitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.genrics.MavenActitime.AutoConstant;
import com.genrics.MavenActitime.BasePage;
import com.genrics.MavenActitime.ExcelSheetLibrary;



public class POMCreateWork extends BasePage implements AutoConstant {

	// Settings Tab
	@FindBy(xpath = "//div[@class=\"topMenuButton preventPanelsHiding\"][2]")
	private WebElement SettingTab;

	// Types Of Work Link
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement TypesOfWorkLink;

	// Create Type Work Button
	@FindBy(xpath = "//div[@class=\"roundedBoxTag graphicButton button \"]")
	private WebElement CreateTypeWorkButton;

	// Create Type Of work Page name field
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement NameField;

	// Create Type Of work Page status Field
	@FindBy(xpath = "//select[@name=\"active\"]")
	private WebElement StatusDropDown;

	// Submit button
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement SubmitButton;

	// Edit Button
	@FindBy(xpath = "//a[.=\"IT Support\"]")
	private WebElement EditButton;

	public POMCreateWork(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void SettingTabMethod() {
		SettingTab.click();
	}

	public void TypesOfWorkLinkMethod() {
		TypesOfWorkLink.click();
	}

	public void CreateTypeWorkButtonMethod() {
		CreateTypeWorkButton.click();
	}

	public void NameFieldMethod() throws IOException {
		NameField.click();
		NameField.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName3, 1, 0));
	}

	public void StatusDropDown() {
		SelectByValue(StatusDropDown, "false");
	}

	public void SubmitButton() {
		SubmitButton.click();
	}
	
	public void EditButton() throws IOException 
	{
		EditButton.click();
		NameField.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName3, 2, 0));
	}

}
