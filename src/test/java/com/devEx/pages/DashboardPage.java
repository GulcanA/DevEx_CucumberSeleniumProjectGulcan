package com.devEx.pages;

import com.devEx.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    @FindBy(xpath = "//h1[@id='dashboard-h1']")
    public WebElement dashboardText;

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logout;

    public void navigateMenu(String menuName){
        Driver.get().findElement(By.xpath("//*[text()='"+menuName+"']")).click();
    }
}
