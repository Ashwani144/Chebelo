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
	private By email = By.id("mat-input-0");
	private By password = By.id("mat-input-1");
	private By ecaptcha1 = By.id("recaptcha-anchor");
	private By loginButton = By.xpath("//span[text()=' Log in ']");
	private By loginbtn1 = By.cssSelector("button[aria-label='LOG IN']");
	private By logout = By.xpath("//span[text()=' Logout']");
	private By expectedmessagepopup = By
			.xpath("//div[text()='Entered login details doesnt match with our records - please try again.']");
	private By okbutton=By.xpath("//button[text()='OK']");
	private By regemailofforgetPwd=By.id("mat-input-5");
	private By forgetpassword=By.xpath("//a[text()=' Forgot password? ']");
	private By sendresetlink=By.xpath("//span[text()=' Send reset link ']");

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
		System.out.println(driver.findElement(By.xpath("//button[@aria-label='LOG IN']")));
		driver.findElement(loginButton).click();

	}

	public DashboardPage doLogin(String email1, String pwd) {
		System.out.println("login with: " + email1 + " and " + pwd);
		driver.findElement(email).sendKeys(email1);
		driver.findElement(password).sendKeys(pwd);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
		driver.findElement(ecaptcha1).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//button[@aria-label='LOG IN']")));
		driver.findElement(loginButton).click();
		return new DashboardPage(driver);

	}

	
	public void clickOnOKbutton()  {
		driver.findElement(okbutton).click();
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
}
