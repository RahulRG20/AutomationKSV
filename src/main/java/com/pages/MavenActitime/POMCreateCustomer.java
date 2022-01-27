package com.pages.MavenActitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.genrics.MavenActitime.AutoConstant;
import com.genrics.MavenActitime.ExcelSheetLibrary;



public class POMCreateCustomer implements AutoConstant
{
	
	public WebDriver driver;

	@FindBy(id = "container_tt")
	private WebElement TimeTrackContainer;

	@FindBy(id = "container_tasks")
	private WebElement TasksContainer;

	@FindBy(xpath = "//a[.='View Time-Track']")
	private WebElement TaskViewTimeTrackLink;

	@FindBy(xpath = "//div[.='Reports']")
	private WebElement ReportsContainer;

	@FindBy(xpath = "//a[.='Lock Time-Track']")
	private WebElement ReportsLockTimeTrackLink;

	@FindBy(xpath = "//div[.='Users']")
	private WebElement UserContainer;

	@FindBy(xpath = "//a[.='Approve Time-Track']")
	private WebElement UserApproveTimeTrackLink;

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement AddNewButton;

	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement AddNewCustomer;

	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement AddNewProject;

	@FindBy(xpath = "//div[.='+ New Tasks']")
	private WebElement AddNewTasks;

	@FindBy(xpath = "//div[.='Import Tasks from CSV']")
	private WebElement ImportTaskFromCSV;
	
// NEW Customer	

	@FindBy(xpath = "//span[.='DETAILS'][1]")
	private WebElement AddCustomer_DetailsTabtext;

	@FindBy(xpath = "(//input[@placeholder=\"Enter Customer Name\"])[2]")
	private WebElement EnterCustomerNameTextField;

	@FindBy(xpath = "//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement EnterDescriptionTextField;

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement CreateCustomerbutton;
	
	@FindBy(xpath = "//div[@class=\"greyButton cancelBtn\"]")
	private WebElement CreateCustomerCancelButton;

	@FindBy(xpath = "//span[.='ASSIGNED USERS (3)']")
	private WebElement AddCustomerAssignedUserTab;

	@FindBy(xpath = "//span[.='MANAGERS (3)']")
	private WebElement AddCustomerManagersTab;
	
	@FindBy(xpath = "//span[.='MANAGERS (3)']")
	private WebElement CustomersList;
	
	
//	EDIT CUSTOMER

	@FindBy(xpath = "//input[@placeholder=\"Start typing name ...\"][1]")
	private WebElement CustomerSearchBar;
	
	@FindBy(xpath = "//span[@class=\"highlightToken\"]/../../../div[@class=\"editButton\"]")
	private WebElement SearchedCustomer;
	
	@FindBy(xpath = "(//*[contains(text(),'ACTIONS')])[1]")
	private WebElement SearchedCustomerEditPage;
	
// Delete Button
	
	@FindBy(xpath = "(//div[contains(text(),'Delete')])[2]")
	private WebElement DeleteCustomer;
		
//Delete Confirmation
		
	@FindBy(xpath = "//span[.=\"Delete permanently\"]")
	private WebElement DeleteConfirmation;
	

	public POMCreateCustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void TimeTrackContainerMethod() {
		TimeTrackContainer.click();
	}

	public void TaskContainerMethod() {
		TasksContainer.click();
	}

	public void AddNewMethod() {
		// WebElement element =
		// waitForElementToBePresent(AddNewButton);
		AddNewButton.click();
	}

	public void NewCustomerMethod() {
		AddNewCustomer.click();
	}

	public void CustomerNameMethod() throws IOException {

		EnterCustomerNameTextField.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName2, 1, 0));
		EnterDescriptionTextField.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName2, 1, 1));
		
	}
	
	public void CreateCustomerbutton() {
		CreateCustomerbutton.click();
	}
	
	public void CustomerSearchBar() throws IOException {
		CustomerSearchBar.sendKeys(ExcelSheetLibrary.getCellValue(ExcelSheet, SheetName2, 1, 0));
	}
	
	public void SearchedCustomer() {
		SearchedCustomer.click();
	}
	
	
	public void SearchedCustomerEditPage() throws InterruptedException {
		Thread.sleep(2000);
		SearchedCustomerEditPage.click();
	}
	
	public void DeleteCustomer() {
		DeleteCustomer.click();
	}
	
	public void DeleteConfirmation() {
		DeleteConfirmation.click();
		
	}
}
