package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.SignUpPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUpPageSteps {

	WebDriver driver;
	private SignUpPage signUpPage=new SignUpPage(DriverFactory.getDriver());
	@Given("user on the homepage")
	public void user_on_the_homepage() {
		DriverFactory.getDriver().get("https://app.staging.workstatus.io/auth/login");
	}

	@Given("user follows {string}")
	  public void user_follows(String string) {
	   signUpPage.clickOnSignUPbutton();
	}

	@When("user fills Full Name with {string}")
	public void user_fills_with(String fullname) {
	   signUpPage.enterFullName(fullname);
	}

	@When("user fills Email with {string}")
	public void user_fills_email_with(String email) {
	   signUpPage.enteremailaddress(email);
	}

	@When("user fills PhoneNumber with {string}")
	public void user_fills_phone_number_with(String phonenumber) {
	   signUpPage.enterPhoneNumber(phonenumber);
	}

	@When("user fills password with {string}")
	public void user_fills_password_with(String passWord) {
	    signUpPage.enterPassword(passWord);
	}

	@When("user fills confirm password with {string}")
	public void user_fills_confirm_password_with(String passWordAgain) {
	    signUpPage.enterPasswordAgain(passWordAgain);
	}
	
	
	
	
//	@When("user enters the following details")
//	public void user_enters_the_following_details(DataTable dataTable) {
//		
//		/*List<List<String>> userdetail=dataTable.asLists(String.class);
//		
//		signUpPage.enteremailaddress(email);
//		signUpPage.enterPhoneNumber(PhoneNumber1);
//		signUpPage.enterPassword(password);
//		signUpPage.enterPasswordAgain(Confirmpassword1);*/
//		
//		
//		
//	/*	for(List<String> e : userdetail){
//			System.out.println(e);
//		}*/
//	
//		
//		
//		
//		//List<Map<String, String>> credList = dataTable.asMaps();
//		
//		List<List<String>> credList=dataTable.asLists(String.class);
//		/*String email = credList.get(0).get(0);
//		String PhoneNumber1 = credList.get(0).get(1);
//		String password = credList.get(0).get(2);
//		String Confirmpassword1 = credList.get(0).get(3);
//		
//		signUpPage.enteremailaddress(email);
//		signUpPage.enterPhoneNumber(PhoneNumber1);
//		signUpPage.enterPassword(password);
//		signUpPage.enterPasswordAgain(Confirmpassword1);*/
//		
//		
//		
//	}

	@When("user clicks on checkBox of Term and condition")
	public void user_clicks_on_check_box_of_term_and_condition() {
	    signUpPage.clickOnCheckbox();
	}

	@When("user clicks SignUP button")
	public void user_clicks() {
		  signUpPage.clickOnSignUPbuttonofsignupPage();
	}

}
