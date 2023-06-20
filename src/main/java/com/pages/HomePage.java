package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private By btn_GrantLogin = By.xpath("//div[@class='bgp-btn bgp-btn-loginCorpPass margin-top-sm margin-btm-md']");
    private By btnApplyGrant = By.xpath("//a[@id='dashboard-menubox-app-apply-grant']//div[@class='dashboard-action-text-wrapper']");

    public void clickonGrantLogin() throws InterruptedException {
		//new wait.until(ExpectedConditions.elementToBeClickable(btn_GrantLogin));
        Thread.sleep(5000);
        driver.findElement(btn_GrantLogin).click();
    }

    public boolean isPresentGrantLogin(){
        return driver.findElement(btn_GrantLogin).isEnabled();
    }


}
