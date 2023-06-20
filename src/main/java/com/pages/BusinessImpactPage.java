package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessImpactPage {
    private WebDriver driver;
    private DriverFactory driverFactory= new DriverFactory();
    ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());

    public BusinessImpactPage(WebDriver driver){
        this.driver=driver;
    }

    private By dateFYEndDate = By.id("react-project_impact-fy_end_date_0");
    private By dateMonthPicker = By.xpath("//span[contains(text(),'›')][1]");
    private By dateFYEndDateSelection = By.xpath("//td[normalize-space()='31']");
    private By txtOverseasSales1 = By.id("react-project_impact-overseas_sales_0");
    private By txtOverseasSales2 = By.id("react-project_impact-overseas_sales_1");
    private By txtOverseasSales3 = By.id("react-project_impact-overseas_sales_2");
    private By txtOverseasSales4 = By.id("react-project_impact-overseas_sales_3");
    private By txtOverseasInvestment1 = By.id("react-project_impact-overseas_investments_0");
    private By txtOverseasInvestment2 = By.id("react-project_impact-overseas_investments_1");
    private By txtOverseasInvestment3 = By.id("react-project_impact-overseas_investments_2");
    private By txtOverseasInvestment4 = By.id("react-project_impact-overseas_investments_3");
    private By txtRationalProj = By.id("react-project_impact-rationale_remarks");
    private By txtNonTangible = By.id("react-project_impact-benefits_remarks");
    private By btnNext =By.id("next-btn");
    private By btnSave = By.id("save-btn");
    private By btnPrevious = By.id("back-btn");

    public void actionBusinessImpact(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(dateFYEndDate));
        driver.findElement(dateFYEndDate).click();
        driver.findElement(dateFYEndDateSelection).click();
        driver.findElement(txtOverseasSales1).sendKeys("10000");
        driver.findElement(txtOverseasSales2).sendKeys("20000");
        driver.findElement(txtOverseasSales3).sendKeys("30000");
        driver.findElement(txtOverseasSales4).sendKeys("40000");
        driver.findElement(txtOverseasInvestment1).sendKeys("10000");
        driver.findElement(txtOverseasInvestment2).sendKeys("10000");
        driver.findElement(txtOverseasInvestment3).sendKeys("10000");
        driver.findElement(txtOverseasInvestment4).sendKeys("10000");
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(txtRationalProj).sendKeys("Test message");
        driver.findElement(txtNonTangible).sendKeys("Test Message");
        driver.findElement(btnNext).click();
    }
}
