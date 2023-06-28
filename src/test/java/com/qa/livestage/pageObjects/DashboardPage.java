package com.qa.livestage.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	// 1. By Locators
	public WebDriver driver;
	private By dashboardSection=By.cssSelector("div#container-3 h4");
	
	
	
	// 2. Constructor of the page class
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// 3. page actions : Feature
	
	public String getMyAccountPageTitle(){
		
		return driver.getTitle();
	}
	
	public int getMyDashboardsectionCount(){
		return driver.findElements(dashboardSection).size();
		
	}
	public List<String> getMyDashboardSectionList(){
		
		List<String> myaccountList=new ArrayList<>();
		List<WebElement> dashboardHeaderList = driver.findElements(dashboardSection);
		
		for(WebElement e : dashboardHeaderList){
			String text = e.getText();
			System.out.println(text);
			myaccountList.add(text);
		}
		return myaccountList;
	}
}
