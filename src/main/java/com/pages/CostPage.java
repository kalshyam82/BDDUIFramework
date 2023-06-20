package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CostPage {

    private WebDriver driver;
    private DriverFactory driverFactory= new DriverFactory();
    private ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());

    public CostPage(WebDriver driver){
        this.driver=driver;
    }

    private By panelThirdPartyCost =By.id("react-project_cost-vendors-accordion-header");
    private By panelRentalCost =By.id("react-project_cost-office_rentals-accordion-header");
    private By panelSalaryCost =By.id("react-project_cost-salaries-accordion-header");
    private By panelThirdPartyAddItem = By.id("react-project_cost-vendors-add-item");
    private By panelRentalAddItem = By.id("react-project_cost-office_rentals-add-item");
    private By panelSalaryAddItem = By.id("react-project_cost-salaries-add-item");
    private By btnNext =By.id("next-btn");
    private By btnSave = By.id("save-btn");
    private By btnPrevious = By.id("back-btn");
    private By rBtnVendorReg = By.xpath("//div[@class='controls bgp-radio-text-format']//label[1]//span[1]");
    private By btnVendorselction = By.id("react-project_cost-vendors-0-local_vendor-false"); //
    private By txtForeignVendorName = By.id("react-project_cost-vendors-0-vendor_name");
    private By btnFileUpload = By.id("react-project_cost-vendors-0-attachments-btn");
    private By txtBillingCost = By.id("react-project_cost-vendors-0-amount_in_billing_currency");
    private By txtVendorRemarks = By.id("react-project_cost-vendors-0-remarks");


    public void ActionCostPage() throws AWTException, InterruptedException {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(panelThirdPartyCost));
        driver.findElement(panelThirdPartyCost).click();
        driver.findElement(panelThirdPartyAddItem).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(rBtnVendorReg));
        driver.findElement(rBtnVendorReg).click();
        driver.findElement(btnVendorselction).click();
        driver.findElement(txtForeignVendorName).sendKeys("Automatuin");
        driver.findElement(btnFileUpload).click();
        elementUtil.pageScrollByCordinate(driver);

        // creating object of Robot class
        Robot rb = new Robot();

        // copying File path to Clipboard
        String str1 = new String(System.getProperty("user.dir")+"\\src\\test\\resources\\Files\\Singapore-Featured.jpg");
        StringSelection str = new StringSelection(str1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        elementUtil.pageScrollByCordinate(driver);
        Thread.sleep(25000);
        driver.findElement(txtBillingCost).sendKeys("30000");
        driver.findElement(txtVendorRemarks).sendKeys("Automation");
        driver.findElement(btnNext).click();
    }
}
