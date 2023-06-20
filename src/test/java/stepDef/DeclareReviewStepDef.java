package stepDef;

import com.pages.DeclareReviewPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DeclareReviewStepDef {

    DeclareReviewPage declareReviewPage = new DeclareReviewPage(DriverFactory.getDriver());

    @And("user enter the details in Declare and Review page")
    public void userEnterTheDetailsInDeclareAndReviewPage() {
        declareReviewPage.DeclareReviewActions();
    }

    @Then("verify Review your Application is displayed")
    public void verifyReviewYourApplicationIsDisplayed() {
        Assert.assertTrue(declareReviewPage.getReviewStatus());
    }


    @And("check the bokx and click on Submit button")
    public void checkTheBokxAndClickOnSubmitButton() {
        declareReviewPage.submitApplication();
    }

    @Then("verify Application has been submitted is displayed")
    public void verifyApplicationHasBeenSubmittedIsDisplayed() throws InterruptedException {
        Assert.assertTrue(declareReviewPage.verifySubmittedAppln());
    }
}
