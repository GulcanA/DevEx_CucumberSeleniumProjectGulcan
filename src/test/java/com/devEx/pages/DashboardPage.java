package com.devEx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//h1[@id='dashboard-h1']")
    public WebElement dashboardText;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logout;

}
