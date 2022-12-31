package com.qa.livestage.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	private WebDriver driver;
	
	//1. Locator
	private By fullName=By.id("mat-input-2");
	private By emailAdd=By.id("mat-input-3");
	private By phoneNumber=By.id("mat-input-4");
	private By password=By.id("mat-input-5");
	private By passwordConfirm=By.id("mat-input-6");
	private By checkBox=By.id("mat-checkbox-4");
	private By signupbutton=By.xpath("//a[text()=' Sign Up ']");
	private By signupbuttonofsignuppage=By.xpath("//span[text()=' Sign up ']");
	private By Thankbutton=By.xpath("//h1[text()='THANK YOU']");
	
	
	// 2. Constructor of the page class
	public SignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. Page Actions
	 
	public void enterFullName(String fullname) {
		driver.findElement(fullName).sendKeys(fullname);
	}
	
	public void enteremailaddress(String email) {
		driver.findElement(emailAdd).sendKeys(email);
	}
	
	public void enterPhoneNumber(String phonenumber) {
		driver.findElement(phoneNumber).sendKeys(phonenumber);
	}
	
	public void enterPassword(String passWord) {
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void enterPasswordAgain(String passWordAgain) {
		driver.findElement(passwordConfirm).sendKeys(passWordAgain);
	}
	public void clickOnCheckbox() {
		
		driver.findElement(checkBox).click();
	}
	public void clickOnSignUPbutton() {
		driver.findElement(signupbutton).click();
	}
	
	public void clickOnSignUPbuttonofsignupPage() {
		driver.findElement(signupbuttonofsignuppage).click();
	}
}
