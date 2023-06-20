package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EligibilityPage {
    WebDriver driver;
    ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());

    public EligibilityPage(WebDriver driver){
        this.driver =driver;
    }

    private By rBtnApplicant1 = By.xpath("//label[text()='Is the applicant registered in Singapore?']//ancestor::div/div/following-sibling::div/label");
    private By rBtnApplicant2 = By.xpath("//label[contains(text(),\"Is the applicant's group sales turnover less than \")]//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnApplicant3 = By.xpath("//label[contains(text(),'Does the applicant have at least 30% ')]//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnApplicant4 = By.xpath("//label/a[text() ='target market']//ancestor::div/div/following-sibling::div/label[1]");
   // private By rBtnApplicant5 = By.xpath("//label[contains(text(),'the following statements true for this project? ')]//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnApplicant5 = By.xpath("//label[contains(text(),'Are')]//ancestor::div/div/following-sibling::div/label[1]");
    private By rBtnApplicant6 = By.xpath("//button[@id='next-btn']");

    public void elibiligityPageActions(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(rBtnApplicant1));
        driver.findElement(rBtnApplicant1).click();
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(rBtnApplicant2).click();
        driver.findElement(rBtnApplicant3).click();
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(rBtnApplicant4).click();
        driver.findElement(rBtnApplicant5).click();
        driver.findElement(rBtnApplicant6).click();
      //  driver.findElement(rBtnApplicant7).click();
    }

}
