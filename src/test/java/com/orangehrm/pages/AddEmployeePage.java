package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

	public class AddEmployeePage extends BaseClass{
		
		@FindBy(id="firstName")
	    public WebElement firstName;
	    
	    @FindBy(id="middleName")
	    public WebElement middleName;
	    
	    @FindBy(id="lastName")
	    public WebElement lastName;
	    
	    @FindBy(id="employeeId")
	    public WebElement employeeId;
	    
	    @FindBy(xpath="//div[@id='location_inputfileddiv']//input")
	    public WebElement location;
	    
	    @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
	    public WebElement locationList;
	    
	    @FindBy(xpath="//input[@id='chkLogin']")
	    public WebElement createLoginDetails;
	    
	    @FindBy(id="systemUserSaveBtn")
	    public WebElement saveBtn;
	    
	    @FindBy(xpath="//span[@id='pim.navbar.employeeName']")
	    public WebElement empCheck;
	    
	    @FindBy(xpath="//form[@id='pimAddEmployeeForm']//label")
	    public List<WebElement> addEmpLabels;
	    
	   @FindBy (css="input#username")
	   public WebElement username;
	   
	   @FindBy (css="input#password")
	   public WebElement password;
	   
	   @FindBy (css="input#confirmPassword")
	   public WebElement confirmPassword;
	   
	  @FindBy (xpath="//input[@class='select-dropdown ng-invalid']")
	  public WebElement ESS;
	  
	  @FindBy(xpath="//input[@value='Default ESS']")
	  public WebElement listESS;
	  
	  @FindBy(xpath="//input[@value='Default Supervisor']")
	  public WebElement Super;
	    
	  @FindBy(xpath="//ul[contains(@id,'-0a104c600cc8')]")
	  public WebElement Superlist;
	    public AddEmployeePage() {
	        PageFactory.initElements(driver,this);
	    } 
	}
	