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
		System.out.println("Customer Created successfully");
		CreateCustomer.CustomerSearchBar();
		CreateCustomer.SearchedCustomer();
		CreateCustomer.SearchedCustomerEditPage();
		CreateCustomer.DeleteCustomer();
		CreateCustomer.DeleteConfirmation();
		System.out.println("Customer Deleted Successfully");
	}
	
	@Test(priority = 2)
	public void CreateWork() throws IOException, InterruptedException 
	{
		POMCreateWork CreateWork=new POMCreateWork(driver);
		CreateWork.SettingTabMethod();
		CreateWork.TypesOfWorkLinkMethod();
		CreateWork.CreateTypeWorkButtonMethod();
		CreateWork.NameFieldMethod();
		CreateWork.StatusDropDown();
		CreateWork.SubmitButton();
		System.out.println("Work Created Sussesfully");
		CreateWork.EditButton();
		CreateWork.SubmitButton();
		System.out.println("Work Updated Successfully");
		CreateWork.DeleteButton();
		System.out.println("Work Deleted Successfully");
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
		System.out.println("Leave Type created Sucessfully");
		CreateLeave.EditLeave();
		System.out.println("Leave Type Updated Successfully");
		CreateLeave.DeleteLeaveType();
		CreateLeave.DeleteConfirmation();
		System.out.println("Leave Type Deleted Successfully");
		
	}
}
