package stepDef;

import com.pages.CostPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;

import java.awt.*;

public class CostStepDef {

    CostPage costPage = new CostPage(DriverFactory.getDriver());
    @And("user enter the details in Cost page")
    public void userEnterTheDetailsInCostPage() throws InterruptedException, AWTException {
        costPage.ActionCostPage();
    }
}
