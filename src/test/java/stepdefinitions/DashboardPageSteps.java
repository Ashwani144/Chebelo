package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.livestage.factory.DriverFactory;
import com.qa.livestage.pageObjects.DashboardPage;
import com.qa.livestage.pageObjects.LoginPage;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardPageSteps {

	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashboardPage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
	  
		List<Map<String, String>> credList=credTable.asMaps();
		String userName=credList.get(0).get("email");
		String password=credList.get(0).get("password");
		DriverFactory.getDriver().get("https://app.workstatus.io/dashboard/analytics");
		dashboardPage=loginPage.doLogin(userName, password);
		
	}

	@Given("user is on Dashboard page")
	public void user_is_on_accounts_page() {
		String title = dashboardPage.getMyAccountPageTitle();
		System.out.println("Dashboard Page title is:" +title);
	}

	@Then("page title should  be {string}")
	public void page_title_should_be(String string) {
	   
	}

	/*@Given("user is on Dashboard page")
	public void user_is_on_dashboard_page() {
	  
	}*/

	@Then("user gets Dashboard section")
	public void user_gets_dashboard_section(DataTable sectionsTable) {
		List<String> expDashboardSectionsList=sectionsTable.asList();
		
		List<String> actualDashboardSectionsList=dashboardPage.getMyDashboardSectionList();
		
		Assert.assertTrue(expDashboardSectionsList.containsAll(actualDashboardSectionsList));
	}

	@Then("dashboard section count should be {int}")
	public void dashboard_section_count_should_be(Integer actualSectionCount) {
	   
		Assert.assertTrue(dashboardPage.getMyDashboardsectionCount() ==actualSectionCount);
	}

	
}
