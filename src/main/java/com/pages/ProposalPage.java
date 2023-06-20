package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.Constants;
import com.qa.util.ElementUtil;
import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProposalPage {

    private WebDriver driver;
    private DriverFactory driverFactory= new DriverFactory();
    ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());

    public ProposalPage(WebDriver driver){
        this.driver=driver;
    }
    private By txtProjectTitle = By.id("react-project-title");
    private By elemStartDate = By.id("react-project-start_date");
    private By elemTodaysDate = By.xpath("//td[@class = 'rdtDay rdtToday'][1]");
    private By elemEndDate = By.id("react-project-end_date");
    private By txtProjDesc = By.id("react-project-description");
    private By tdMonthPicker = By.xpath("//div[@class='rdt rdtOpen']//span[contains(text(),'›')]");
    private By getElemEndDatePicker = By.xpath("//body[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]");
    private By selActivity = By.xpath("//div[text()='Select...']");
    private By selActivityValueFTA = By.xpath("//div[@id='react-select-project-activity--option-0' and text() ='FTA Consultancy']");
    private By selTargetMarket = By.xpath("//span[@id='react-select-project-primary_market--value']/div[text()='Select...']");
    private By selTargetMarketVal = By.id("react-select-project-primary_market--option-3");
    private By btnTargetMarkettrue = By.xpath("//input[@id='react-project-is_first_time_expand-true']");
    private By txtRemark = By.id("react-project-remarks");
    private By btnNext = By.id("next-btn");


    public void fillProposalDetails() throws InterruptedException {
        driver.findElement(txtProjectTitle).sendKeys("Automation");
        driver.findElement(elemStartDate).click();
        driver.findElement(elemTodaysDate).click();
        driver.findElement(elemEndDate).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(tdMonthPicker));
        driver.findElement(tdMonthPicker).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(getElemEndDatePicker)).click();
        driver.findElement(txtProjDesc).sendKeys("Automation");
        driver.findElement(selActivity).click();
        driver.findElement(selActivityValueFTA).click();
        driver.findElement(selTargetMarket).click();
        driver.findElement(selTargetMarketVal).click();
        driver.findElement(btnTargetMarkettrue).click();
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(txtRemark).sendKeys("Automation Project");
        driver.findElement(btnNext).click();
    }



}
