package com.qa.livestage.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators
	private By email = By.id("mat-input-1");
	private By password = By.id("mat-input-2");
//	private By ecaptcha1 = By.id("recaptcha-anchor");
	private By loginButton = By.xpath("//span[text()=' Proceed To Login ']");
//	private By loginbtn1 = By.cssSelector("button[aria-label='LOG IN']");
//	private By logout = By.xpath("//span[text()=' Logout']");
	private By expectedmessagepopup = By
 		.xpath("//div[text()='Entered login details doesnt match with our records - please try again.']");
	private By okbutton=By.xpath("//button[text()='OK']");
	private By regemailofforgetPwd=By.id("mat-input-3");
	private By forgetpassword=By.xpath("//a[text()=' Forgot Password ']");
	private By sendresetlink=By.xpath("//span[text()=' Send reset link ']");
	
	private By alertmessageInvalid=By.id("swal2-content");
	private By alertpopupmessagewithInvalidEmail=By.id("swal2-title");

	// 2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions : Feature
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void enterUserName(String username) {
		driver.findElement(email).sendKeys(username);
	}

	public void enterPassword(String password1) {
		driver.findElement(password).sendKeys(password1);
	}

	/*
	 * public void clickOnecaptcha() {
	 * 
	 * WebDriverWait wait = new WebDriverWait(driver, 10);
	 * wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(
	 * "//iframe[@title='reCAPTCHA']")));
	 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
	 * "//div[@class='recaptcha-checkbox-border']")));
	 * driver.findElement(ecaptcha1).click();
	 * 
	 * }
	 */

	public void clickOnLogin() {
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		//System.out.println(driver.findElement(By.xpath("//button[@aria-label='LOG IN']")));
		driver.findElement(loginButton).click();

	}

	public DashboardPage doLogin(String email1, String pwd) {
		System.out.println("login with: " + email1 + " and " + pwd);
		driver.findElement(email).sendKeys(email1);
		driver.findElement(password).sendKeys(pwd);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
		//driver.findElement(ecaptcha1).click();
	//	driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
	//	System.out.println(driver.findElement(By.xpath("//button[@aria-label='LOG IN']")));
		driver.findElement(loginButton).click();
		return new DashboardPage(driver);

	}

	
	public void clickOnOKbutton()  {
		
		WebDriverWait some_element = new WebDriverWait(driver,10); 
	    some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Invalid credential']")));
		driver.findElement(okbutton).click();
	}
	
	public String getalertMessagePopUp() {
		
		WebDriverWait some_element = new WebDriverWait(driver,10); 
	    some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='swal2-html-container']")));
		return driver.findElement(alertmessageInvalid).getText();
	}
	
	// public void clickOnLogout(){
	//
	// driver.findElement(logout).click();
	// }

	public void clickonForgetPassword(){
		driver.findElement(forgetpassword).click();
	}
	
	public void enterregisteredemail(String username) {
		driver.findElement(regemailofforgetPwd).sendKeys(username);
	}
	
	public void clickonsendresetlinkbutton(){
		driver.findElement(sendresetlink).click();
	}
	
	public String getAlertMessagewithInvalidEmail(){
		
		WebDriverWait wait = new WebDriverWait(driver,10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Email not found.']")));
		return driver.findElement(alertpopupmessagewithInvalidEmail).getText();
		
	}
}
