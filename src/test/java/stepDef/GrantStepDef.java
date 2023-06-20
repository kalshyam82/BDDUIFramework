package stepDef;

import com.pages.GrantPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;

public class GrantStepDef {
    private GrantPage grantPage = new GrantPage(DriverFactory.getDriver());

    @And("click on Apply Grant")
    public void clickOnApplyGrant() throws InterruptedException {
        grantPage.applyGrant();
    }

    @And("click on IT sector")
    public void clickOnITSector() throws InterruptedException {
        grantPage.selectIT();
    }

    @And("select Option {int}")
    public void selectOption(int arg0) throws InterruptedException {
        grantPage.selectITOption();
    }

    @And("select Market Readiness Assistance option")
    public void selectMarketReadinessAssistanceOption() throws InterruptedException {
        grantPage.selectITMarket();
    }

    @And("click on Apply button and then Proceed button")
    public void clickOnApplyButton() throws InterruptedException {
        grantPage.clickApplynProceed();
    }


}
