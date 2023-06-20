package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GrantPage {

    WebDriver driver;
    ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());

    public GrantPage(WebDriver driver){
        this.driver = driver;
    }

    private By btnApplyGrant = By.xpath("//a[@id='dashboard-menubox-app-apply-grant']//div[@class='dashboard-action-text-wrapper']");
    private By btnIT = By.xpath("//div[contains(text(),'IT')]");
    private By selectOption = By.xpath("//span[contains(text(),'Provides financial incentives to help businesses t')]");
    private By selMarket =By.xpath("//div[normalize-space()='Market Readiness Assistance']");
    private By btnApply = By.xpath("//button[normalize-space()='Apply']");
    private By btnProceed = By.xpath("//button[normalize-space()='Proceed']");
    /*

        DriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Apply']")).click();

        driverFactory.pageScroll(DriverFactory.getDriver());
        DriverFactory.getDriver().findElement(By.xpath("//button[normalize-space()='Proceed']")).click();

     */

    public void applyGrant(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(btnApplyGrant));
        driver.findElement(btnApplyGrant).click();
    }

    public void selectIT() throws InterruptedException {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(btnIT));
        Thread.sleep(5000);
        driver.findElement(btnIT).click();
    }

    public void selectITOption(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(selectOption));
        driver.findElement(selectOption).click();
    }

    public void selectITMarket(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(selMarket));
        driver.findElement(selMarket).click();
    }

    public void clickApplynProceed(){
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(btnApply));
        driver.findElement(btnApply).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(btnProceed));
        elementUtil.pageScrollByCordinate(driver);
        driver.findElement(btnProceed).click();
    }




}
