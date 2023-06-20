package stepDef;

import com.pages.EligibilityPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;

public class EligibilityStepDef {

    private EligibilityPage eligibility = new EligibilityPage(DriverFactory.getDriver());

    @And("user enter data in eligibility page")
    public void userEnterDataInEligibilityPage() {

        eligibility.elibiligityPageActions();
    }
}
