package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactDetailsPage {
	
	private WebDriver driver;
	public ContactDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	ElementUtil elementUtil = new ElementUtil(DriverFactory.getDriver());

	private  By txtName = By.id("react-contact_info-name");
	private  By txtDesignation = By.id("react-contact_info-designation");
	private By txtPhoneNo = By.id("react-contact_info-phone");
	private By txtPrimaryEmail =By.id("react-contact_info-primary_email");
	private By txtSecondaryEmail =By.id("react-contact_info-secondary_email");
	private By txtPostalCode= By.id("react-contact_info-correspondence_address-postal");
	private By txtLevel =By.id("react-contact_info-correspondence_address-level");
	private By txtUnitNo =By.id("react-contact_info-correspondence_address-unit");
	private By txtBuildingName =By.id("react-contact_info-correspondence_address-building_name");
	private By txtCEOName =By.id("react-contact_info-offeree_name");
	private By txtAddresseDesignation =By.id("react-contact_info-offeree_designation");
	private By txtAddressEmail =By.id("react-contact_info-offeree_email");
	private By btnNext =By.id("next-btn");


	public void fillContactsPage() throws InterruptedException {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(txtName));
		driver.findElement(txtName).sendKeys("Test one");
		driver.findElement(txtDesignation).sendKeys("Manager");
		driver.findElement(txtPhoneNo).sendKeys("78965432");
		driver.findElement(txtPrimaryEmail).sendKeys("test@test.com");
		driver.findElement(txtSecondaryEmail).sendKeys("one@test.com");
		driver.findElement(txtPostalCode).sendKeys("460001");
		driver.findElement(txtLevel).sendKeys("1");
		driver.findElement(txtUnitNo).sendKeys("919");
		elementUtil.pageScrollByCordinate(driver);
		driver.findElement(txtBuildingName).sendKeys("NA");
		driver.findElement(txtCEOName).sendKeys("Two Test");
		driver.findElement(txtAddresseDesignation).sendKeys("Sr Manager");
		driver.findElement(txtAddressEmail).sendKeys("two@test.com");
		driver.findElement(btnNext).click();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//div[text()='Select...']")).click();

//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[text()='Select...']")).click();
//	//	driver.findElement(By.xpath("//div[text()='Select...']")).sendKeys("In-market Business Development");
//		driver.findElement(By.xpath("//div[@id='react-select-project-activity--option-0' and text() ='FTA Consultancy']")).click();
//
//		driver.findElement(By.xpath("//span[@id='react-select-project-primary_market--value']/div[text()='Select...']")).click();
//		driver.findElement(By.id("react-select-project-primary_market--option-3")).click();

		//driver.findElement(By.xpath("")).sendKeys("");
	}
	
	
	
	

}
