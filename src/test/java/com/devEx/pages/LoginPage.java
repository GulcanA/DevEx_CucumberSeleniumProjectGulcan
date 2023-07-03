package com.devEx.pages;

import com.devEx.utilities.BrowserUtils;
import com.devEx.utilities.ConfigurationReader;
import com.devEx.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@id='rcc-confirm-button']")
    public WebElement iUnderstandButton;

    @FindBy(name = "email")
    public WebElement inputBoxEmail;

    @FindBy(name = "password")
    public WebElement inputBoxPassword;

    @FindBy(xpath = "//input[@id='loginpage-form-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Sign Up']")
    public WebElement sigUpButton;

    @FindBy(xpath = "//*[text()='Forgot your password?']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//*[text()='Developers']")
    public WebElement developersMenu;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginMenu;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(xpath = "//h1[@id='loginpage-h1']")
    public WebElement signIn;

    @FindBy(xpath = "//*[contains(text(),'valid')]")
    public WebElement warningMessage;

    public String getWarningMessage(String expectedWarningMessage) {
        String actualMessage= null;
        if (expectedWarningMessage.contains("@")) {
            actualMessage = inputBoxEmail.getAttribute("validationMessage");

        } else if (inputBoxEmail.getAttribute("value").equals(""))
        {
            actualMessage = inputBoxEmail.getAttribute("validationMessage");
        }
        else if(expectedWarningMessage.contains("characters")) {
            actualMessage = inputBoxPassword.getAttribute("validationMessage");
        }
        else
        {actualMessage = warningMessage.getText();
        }
        return actualMessage;

    }


}
