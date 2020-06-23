package com.orangehrm.steps;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.function.Constant;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;
import com.orangehrm.utils.Constans;
import com.orangehrm.utils.ExcelUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeSteps extends CommonMethods {

	LoginPage login;
	HomePage home;
	AddEmployeePage emp;
	
	@Given("I logged in into OrangeHrm")
	public void i_logged_in_into_OrangeHrm() {
		login = new LoginPage();
		home = new HomePage();
		emp = new AddEmployeePage();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
		click(home.PIM);
	}

	@When("I click on  Add Employee link")
	public void i_click_on_Add_Employee_link() {
		click(home.addEmployee);
	}
	
	@When("I provide {string}, {string}, {string} and {string}")
	public void i_provide_and(String fName, String mName, String lName, String location) {
		sendText(emp.firstName, fName);
		sendText(emp.middleName, mName);
		sendText(emp.lastName, lName);
		click(emp.location);
		selectList(emp.locationList, location);
	}
	
	@When("I click on save button")
	public void i_click_on_save_button() {
		click(emp.saveBtn);
	}
	
	@Then("I see {string}, {string} is displayed")
	public void i_see_is_displayed(String fName, String lName) {
		waitForElementBeClickable(emp.empCheck, 20);
		String empName=emp.empCheck.getText();
		Assert.assertEquals(fName+" "+lName, empName);
	}
	
	@Then("I see following labels")
	public void i_see_following_labels(DataTable addEmpLabels) {
		System.out.println("----Printing expected labels from cucumber dataTable----");
		List<String> expectedLabels = addEmpLabels.asList();
		for (String label : expectedLabels) {
			System.out.println(label);
		}
		// create an empty arraylist where we store labels text
		List<String> actualLabels = new ArrayList<String>();

		// get all label elements
		List<WebElement> labelList = emp.addEmpLabels;
		for (WebElement label : labelList) {
			String labeltxt = label.getText();
			// if text is not empty replace * and store it inside actualLabels
			if (!labeltxt.isEmpty()) {
				actualLabels.add(labeltxt.replace("*", ""));
			}
		}
		//Assert.assertTrue(actualLabels.equals(expectedLabels));
	}
	
	@When("I click on create login details")
	public void i_click_on_create_login_details() {
	    click(emp.createLoginDetails);
	}
	@When("I provide firstname,middlename,lastname and location from excelFile {string}")

	public void i_provide_firstname_middlename_lastname_and_location_from_excelFile(String Sheet1) throws InterruptedException {
		
		home = new HomePage();
		emp = new AddEmployeePage();
		
		ExcelUtility excel= new ExcelUtility();
		excel.openExcel(Constans.XL_FILEPATH, Sheet1);
		
		int rows=excel.getRowNum();
		int cols=excel.getColNum(0);
		
		for(int i=1;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				String firstname=excel.getCellData(i, j);
                sendText(emp.firstName, firstname);
				String middlename=excel.getCellData(i, ++j);
				sendText(emp.middleName, middlename);
				String lastname=excel.getCellData(i, ++j);
				sendText(emp.lastName, lastname);
				String location=excel.getCellData(i, ++j);
				click(emp.location);
				waitForElementBeVisible(emp.locationList, 100);
				selectList(emp.locationList, location);
				Thread.sleep(5000);
				click(emp.saveBtn);
				Thread.sleep(5000);
			}
			waitForElementBeClickable(home.addEmployee, 100);
			click(home.addEmployee);
		}
	}


}