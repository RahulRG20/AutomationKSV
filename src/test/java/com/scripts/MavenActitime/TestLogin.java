package com.scripts.MavenActitime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.genrics.MavenActitime.BaseTest;
import com.pages.MavenActitime.POMCreateCustomer;
import com.pages.MavenActitime.POMCreateLeave;
import com.pages.MavenActitime.POMCreateWork;
import com.pages.MavenActitime.PomActitimeLogin;


public class TestLogin extends BaseTest
{

	@Test 
	public void Login() throws IOException {
		
		PomActitimeLogin Login=new PomActitimeLogin(driver);
		Login.loginMethod();
	}
	
	@Test(priority = 1)
	public void CreateCustomer() throws IOException, InterruptedException 
	{
		POMCreateCustomer CreateCustomer=new POMCreateCustomer(driver);
		CreateCustomer.TaskContainerMethod();
		CreateCustomer.AddNewMethod();
		CreateCustomer.NewCustomerMethod();
		CreateCustomer.CustomerNameMethod();
		CreateCustomer.CreateCustomerbutton();
		CreateCustomer.CustomerSearchBar();
		CreateCustomer.SearchedCustomer();
		CreateCustomer.SearchedCustomerEditPage();
		CreateCustomer.DeleteCustomer();
		CreateCustomer.DeleteConfirmation();
	
	}
	
	@Test(priority = 2)
	public void CreateWork() throws IOException 
	{
		POMCreateWork CreateWork=new POMCreateWork(driver);
		CreateWork.SettingTabMethod();
		CreateWork.TypesOfWorkLinkMethod();
		CreateWork.CreateTypeWorkButtonMethod();
		CreateWork.NameFieldMethod();
		CreateWork.StatusDropDown();
		CreateWork.SubmitButton();
		CreateWork.EditButton();
		CreateWork.SubmitButton();
	}
	
	@Test(priority = 3)
	public void CreateLeave() throws IOException, InterruptedException 
	{
		POMCreateLeave CreateLeave=new POMCreateLeave(driver);
		CreateLeave.SettingTab2();
		CreateLeave.LeaveTypeLink();
		CreateLeave.CreateLeaveTypeButon();
		CreateLeave.EnterLeaveTypeName();
		CreateLeave.CreateLeaveSubmitButton();
		CreateLeave.EditLeave();
		
	}
}
