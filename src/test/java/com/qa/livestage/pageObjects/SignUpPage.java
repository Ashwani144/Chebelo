package com.qa.livestage.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	private WebDriver driver;

	// 1. Locator
	private By fullName = By.id("mat-input-3");
	private By emailAdd = By.id("mat-input-4");
	private By countrycode = By.id("mat-select-value-5");
	////span[text()='India +91']
	private By phoneNumber = By.id("mat-input-5");
	private By password = By.id("mat-input-6");
	private By passwordConfirm = By.id("mat-input-7");
	//private By checkBox = By.id("mat-checkbox-2");
	//span[contains(text(),"read and accept")]
	private By checkBox = By.xpath("//span[contains(text(),'read and accept')]");
	private By signupbutton = By.xpath("//span[text()=' Proceed To Sign up ']");
	private By signupbuttonofsignuppage = By.xpath("//mat-panel-title[text()=' Set up your Workstatus account ']");
	private By Thankbutton = By.xpath("//h1[text()='THANK YOU']");

	// 2. Constructor of the page class
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page Actions

	public void enterFullName(String fullname1) {

		driver.findElement(fullName).sendKeys(fullname1);
	}

	public void enteremailaddress(String email1) {

		driver.findElement(emailAdd).sendKeys(email1);
	}

	/*public void selectcountrycode() {

		Select s=new Select(driver.findElement(By.id("mat-select-value-5")));
		s.selectByValue("India +91");
	}*/
	
	public void enterPhoneNumber(String phonenumber1) {

		driver.findElement(phoneNumber).sendKeys(phonenumber1);
	}

	public void enterPassword(String passWord1) {

		driver.findElement(password).sendKeys(passWord1);
	}

	public void enterPasswordAgain(String passWordAgain1) throws Exception {

		Thread.sleep(10000);
		driver.findElement(passwordConfirm).sendKeys(passWordAgain1);
	}

	public void clickOnCheckbox() {
 
		////span[contains(text(),"I've")]
		WebDriverWait wait = new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='terms and conditions']")));
		
		driver.findElement(checkBox).click();
	}

	public void clickOnSignUPbutton() {

		driver.findElement(signupbutton).click();
	}

}
