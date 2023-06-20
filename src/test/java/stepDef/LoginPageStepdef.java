package stepDef;

import io.cucumber.java.en.And;
import org.junit.Assert;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class LoginPageStepdef {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DriverFactory driverFactory= new DriverFactory();


	@Given("user is on login page")
	public void user_is_on_login_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() throws InterruptedException {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@And("click on login in Stub corp pass page")
	public void clickOnLoginInStubCorpPassPage() {
		loginPage.clickonCorpPassLogin();
	}

}
