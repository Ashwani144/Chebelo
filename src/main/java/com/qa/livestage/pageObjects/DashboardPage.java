package com.qa.livestage.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	public WebDriver driver;
	private By dashboardSection=By.cssSelector("div#container-3 h4");
	
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
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
