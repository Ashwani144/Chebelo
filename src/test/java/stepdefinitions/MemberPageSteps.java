package stepdefinitions;

import java.util.List;
import java.util.Map;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.DashboardPage;
import com.qa.livestage.pageObjects.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MemberPageSteps {
	
	
	private LoginPage Memberpage=new LoginPage(DriverFactory.getDriver());
	//private MemberPage memberpage;
	
	//@Given("user has already logged in to application")
	//public void user_has_already_logged_in_to_application(DataTable credTable) {
	  
		//List<Map<String, String>> credList=credTable.asMaps();
		//String userName=credList.get(0).get("email");
		//String password=credList.get(0).get("password");
	//	DriverFactory.getDriver().get("https://app.newstaging.workstatus.io/auth/login");
		//memberpage = loginPage.doLogin(userName, password);
		
		
	@Given("user is on Member page")
	public void user_is_on_member_page() {
		
		
	}

	@When("user click to Invite New Member")
	public void user_click_to_invite_new_member() {
	   
	}

	@When("user enter Member EMail Id")
	public void user_enter_member_e_mail_id() {
	
	}

	@When("user select the role of this member")
	public void user_select_the_role_of_this_member() {
	
	}

	@When("user select the project of this Member")
	public void user_select_the_project_of_this_member() {
	    
	}

	@When("user click to Save button")
	public void user_click_to_save_button() {
	   
	}

	@Then("user get the alert message")
	public void user_get_the_alert_message() {
	  
		
	}

	
	
}
