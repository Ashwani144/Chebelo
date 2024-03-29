package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class LoginPageSteps {

	private static String title;
	WebDriver driver;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
	 
		DriverFactory.getDriver().get("https://app.newstaging.workstatus.io/auth/login");
		
	}

	@When("user enters email {string}")
	public void user_enters_email(String username) {
		  loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password1) {
		  loginPage.enterPassword(password1);
	}

	/*@When("user clicks on ecaptcha button")
	public void user_clicks_on_ecaptcha_button() {
		loginPage.clickOnecaptcha();
	    System.out.println("Captcha is clickable sucessfully");
	}*/

	@When("user clicks on Login button")
	public void user_clicks_on_login_button(){
		 loginPage.clickOnLogin();
	}

	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	  title=loginPage.getLoginPageTitle();
      System.out.println("page title is: "+ title);
		
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
		System.out.println("Dashboard Title page is matched :" + title);
	}
	
	/////////Login with Invalid Input- Step Definitions
	
	@When("user get the alert message pop up")
	public void user_get_the_alert_message_pop_up() {
		
		
		String actualmessagText = loginPage.getalertMessagePopUp();
		
		
		System.out.println("User get Pop up Message -Passed :" +actualmessagText); 
	}


	@Then("user gets the PopupAlert message should be {string}")
	public void user_gets_the_popup_alert_message_should_be(String expectedMessage) {
		
		
		 String expectedAlertMessage = "Entered login details doesnt match with our records - please try again.";
		 String actualmessagText = loginPage.getalertMessagePopUp();
		// String actualmessgae = driver.findElement(By.xpath("//div[text()='Entered login details doesnt match with our records - please try again.']")).getText();
		if(actualmessagText.contains(expectedAlertMessage))
		{
			Assert.assertTrue(true);//pass
			System.out.println("User get Pop up Message -Passed :" +expectedMessage);
			

		}
		else
		{
			Assert.assertTrue(false);//fail
			System.out.println("User get Pop up Message -Failed :" +expectedMessage);

		}
		
		
	}

	@Then("user click on OK button")
	public void user_click_on_ok_button() {
		
		loginPage.clickOnOKbutton();
		
	}

	@Then("user returns back on login page")
	public void user_returns_back_on_login_page() {
	
	}
	
	///////Forget Password Step Definitions
	
	@When("user click to forgot passoword button")
	public void user_click_to_forgot_passoword_button() {
	   loginPage.clickonForgetPassword();
	}

	@When("user enters email of registered ID {string}")
	public void user_enters_email_of_registered_id(String username1) {
	 loginPage.enterregisteredemail(username1);
	}

	
	@When("user click to Send Reset link")
	public void user_click_to_send_reset_link() {
	    loginPage.clickonsendresetlinkbutton();
	}
	
	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
	    
	}
	
	// To check when user enter the wrong email Id during the Forget Password 
	
	@Then("user get the alert message pop up with Incorrect emailId")
	public void user_get_the_alert_message_pop_up_with_incorrect_email_id() {
	  String actualalertmessage = loginPage.getAlertMessagewithInvalidEmail();
		
	  System.out.println("User get Pop up Message -Alert Message Information :" +actualalertmessage); 
	}

	@Then("user alert message should be {string}")
	public void user_alert_message_should_be(String expectedMessageInfo) {
	 
		String expectedAlertMessage = "Email not found.";
		String actualmessagText = loginPage.getAlertMessagewithInvalidEmail();
		
		if(actualmessagText.contains(expectedAlertMessage))
		{
			Assert.assertTrue(true);//pass
			System.out.println("User get Pop up Message -Passed :" +expectedMessageInfo);
			

		}
		else
		{
			Assert.assertTrue(false);//fail
			System.out.println("User get Pop up Message -Failed :" +expectedMessageInfo);

		}
		
	}

	
}
