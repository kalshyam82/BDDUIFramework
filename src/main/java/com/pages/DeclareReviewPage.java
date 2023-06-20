package com.pages;


import com.qa.factory.DriverFactory;
import com.qa.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.WeakHashMap;

public class DeclareReviewPage {

    private WebDriver driver;
    private DriverFactory driverFactory= new DriverFactory();
    private ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());
    public DeclareReviewPage(WebDriver driver){
        this.driver =driver;
    }

    private By rBtnNo1 = By.xpath("//label[text()='Has the applicant been or is currently being: ']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo2 =By.xpath("//label[text()='Has the applicant been or is currently being engaged in any civil suit or proceedings in any jurisdiction in the last 5 years?']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo3 =By.xpath("//label[text()='Is the applicant currently, or has been: ']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo4 =By.xpath("//label[text()='Has the applicant applied for or obtained any other grants or tax or financial incentives for this project?']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo5 =By.xpath("//label[text()='Has the applicant applied for or obtained any other incentives or concessions, e.g. Pioneer Incentive, Development & Expansion Incentives under the Economic Expansion Incentive Act (EEIA) and the Income Tax Act (ITA), from the Singapore government for other purchases or projects?']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo6 =By.xpath("//label[text()='Has the applicant commenced on the project prior to this application, such as signing any contract and making any form of payment to any supplier or service provider engaged?']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo7 =By.xpath("//label[text()='Do any of the suppliers and service providers engaged in this project have any relationship, connection, association or dealings with the applicant, its related companies or their directors, shareholders and corporate secretaries?']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo8 =By.xpath("//label[text()='Has the Applicant or any of its shareholders or directors been subject to a debarment (by ESG or other agencies) from participating in any Grant Schemes?']//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnNo9 =By.xpath("//label[text()='The Applicant has complied with all applicable safe distancing and other health measures (“SDMs”) set out in legislation, as well as directions, conditions and advisories issued by the Singapore Government and its agencies, including those issued by MOH (available at ']//ancestor::div/div/following-sibling::div/label[2]");
    private By rBtnNo10 =By.xpath("//label[text()='The Applicant agrees to comply with all applicable SDMs that may subsequently be issued by the Singapore Government and its agencies.']//ancestor::div/div/following-sibling::div/label[2]");
    private By chkboxAck = By.id("react-declaration-consent_acknowledgement_check");
    private By btnReview = By.id("review-btn");
    private By chkdeclaration = By.id("react-declaration-info_truthfulness_check");
    private By btnSubmit = By.id("submit-btn");
    private By txtReviewAppln = By.xpath("//h3[text()='Review Your Application']");
    private By txtApplnsubmit = By.xpath("//h3[text()='Your application has been submitted.']");

    public void DeclareReviewActions(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(rBtnNo1));
        driver.findElement(rBtnNo1).click();
        driver.findElement(rBtnNo2).click();
        driver.findElement(rBtnNo3).click();
        driver.findElement(rBtnNo4).click();
        driver.findElement(rBtnNo5).click();
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(rBtnNo6).click();
        driver.findElement(rBtnNo7).click();
        driver.findElement(rBtnNo8).click();
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(rBtnNo9).click();
        driver.findElement(rBtnNo10).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(rBtnNo1));
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(chkboxAck).click();
        driver.findElement(btnReview).click();

    }

    public boolean getReviewStatus(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(txtReviewAppln));
        return driver.findElement(txtReviewAppln).isDisplayed();
    }

public void submitApplication(){
    elementUtil.pageScrollToBottom(driver);
    driver.findElement(chkdeclaration).click();
    driver.findElement(btnSubmit).click();
}

public boolean verifySubmittedAppln() throws InterruptedException {
 //   new WebDriverWait(driver, 20).until(ExpectedConditions.textToBePresentInElement(driver.findElement(txtApplnsubmit),"Your application has been submitted."));//elementToBeClickable(txtApplnsubmit)
   Thread.sleep(5000);
    return driver.findElement(txtApplnsubmit).isDisplayed();

}


}
