package stepDef;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class HomePageStepDef {
    private HomePage homePage = new HomePage(DriverFactory.getDriver());


    @Then("User click on Grant Login button")
    public void userClickOnGrantLoginButton() throws InterruptedException {
        homePage.clickonGrantLogin();
    }

    @Then("verify Apply Grant panel is displayed")
    public void verifyApplyGrantPanelIsDisplayed() {
        boolean actValue = homePage.isPresentGrantLogin();
        Assert.assertTrue(actValue);
    }


}
