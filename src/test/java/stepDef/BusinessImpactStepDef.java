package stepDef;

import com.pages.BusinessImpactPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;

public class BusinessImpactStepDef {

    public BusinessImpactPage businessImpactPage = new BusinessImpactPage(DriverFactory.getDriver());

    @And("user enter the details in Business Impact page")
    public void userEnterTheDetailsInBusinessImpactPage() {
        businessImpactPage.actionBusinessImpact();
    }
}
