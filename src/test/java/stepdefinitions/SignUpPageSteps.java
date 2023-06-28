package stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.SignUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignUpPageSteps {
	
	WebDriver driver;
	private SignUpPage signuppage=new SignUpPage(DriverFactory.getDriver());
	
	@Given("user is on signup page")
	public void user_is_on_signup_page() {
	    DriverFactory.getDriver().get("https://app.newstaging.workstatus.io/auth/register");
	}

	@When("user enters fullName {string}")
	public void user_enters_full_name(String fullname1) {
	    signuppage.enterFullName(fullname1);
	}

	@When("user enters emailAdd {string}")
	public void user_enters_email_add(String email1) {
	    signuppage.enteremailaddress(email1);
	}

	//@When("user select the india country code")
//	public void user_select_the_india_country_code() {
	//	signuppage.selectcountrycode();
	//}
	
	@When("user enters phoneNumber {string}")
	public void user_enters_phone_number(String phonenumber1) {
	   signuppage.enterPhoneNumber(phonenumber1);
	}

	@When("user enters password1st {string}")
	public void user_enters_password1st(String passWord1) {
	  signuppage.enterPassword(passWord1);
	}

	@When("user enters confirm password {string}")
	public void user_enters_confirm_password(String passWordAgain1) throws Exception {
	   signuppage.enterPasswordAgain(passWordAgain1);
	}

	@When("user clicks on checkbox of term and condition")
	public void user_clicks_on_checkbox_of_term_and_condition() {
	   signuppage.clickOnCheckbox();
	}

	@When("user clicks on Proceed To Sign up button")
	public void user_clicks_on_proceed_to_sign_up_button() {
	   signuppage.clickOnSignUPbutton();
	}
}
