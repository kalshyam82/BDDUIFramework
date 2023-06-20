package stepDef;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.ContactDetailsPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactDetailsSteps {
	
	private ContactDetailsPage contactDetailsPage = new ContactDetailsPage(DriverFactory.getDriver());


	@When("user enter the details in Contact Details page")
	public void iEnterTheDetailsInContactDetailsPage() throws InterruptedException {
		contactDetailsPage.fillContactsPage();

	}
}
