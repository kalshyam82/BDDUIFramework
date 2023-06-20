package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;

	// 1. By Locators: OR
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");

	private By btn_GrantLogin = By.xpath("//div[@class='bgp-btn bgp-btn-loginCorpPass margin-top-sm margin-btm-md']");  //div[text()='Login']
	private By btn_CorpPassLogin = By.xpath("//button[@type='submit'][normalize-space()='Login']");



	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public void clickonGrantLogin(){
//		wait.until(ExpectedConditions.elementToBeClickable(btn_GrantLogin));
		driver.findElement(btn_GrantLogin).click();
	}

	public void clickonCorpPassLogin(){
		driver.findElement(btn_CorpPassLogin).click();
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}



}
