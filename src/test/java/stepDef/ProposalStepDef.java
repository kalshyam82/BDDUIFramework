package stepDef;

import com.pages.LoginPage;
import com.pages.ProposalPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class ProposalStepDef {

    private ProposalPage proposalPage = new ProposalPage(DriverFactory.getDriver());

    @And("user enter the details in proposal details page")
    public void userEntersProposalDetailsPage() throws InterruptedException {
        proposalPage.fillProposalDetails();
    }


}
