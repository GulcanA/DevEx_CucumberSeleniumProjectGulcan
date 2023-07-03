package com.devEx.step_definitions;

import com.devEx.pages.DashboardPage;
import com.devEx.pages.LoginPage;
import com.devEx.utilities.ConfigurationReader;
import com.devEx.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.awt.image.DataBufferShort;

public class LoginStepDef {
    LoginPage loginPage=new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.iUnderstandButton.click();
        Assert.assertTrue(loginPage.signIn.isDisplayed());

    }
    @When("The user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        loginPage.inputBoxEmail.sendKeys(ConfigurationReader.get("username"));
        loginPage.inputBoxPassword.sendKeys(ConfigurationReader.get("password"));

    }
    @When("The user clicks login button")
    public void the_user_clicks_login_button() {
        loginPage.loginButton.click();

    }
    @Then("The user logs in successfully")
    public void the_user_logs_in_successfully() {
        Assert.assertTrue(dashboardPage.dashboardText.isDisplayed());

    }


    @When("The user logs in using {string} and {string} credentials")
    public void the_user_logs_in_using_and_credentials(String username, String password) {
       loginPage.inputBoxEmail.sendKeys(username);
       loginPage.inputBoxPassword.sendKeys(password);
       loginPage.loginButton.click();

    }
    @Then("The warning message contains {string}")
    public void the_warning_message_contains(String expectedMessage) {
        String actualMessage=loginPage.getWarningMessage(expectedMessage);
        Assert.assertEquals(expectedMessage,actualMessage);



    }



}
