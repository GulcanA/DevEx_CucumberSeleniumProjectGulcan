package com.devEx.step_definitions;

import com.devEx.pages.DashboardPage;
import com.devEx.pages.LoginPage;
import com.devEx.utilities.BrowserUtils;
import com.devEx.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LogoutStepDef {
    DashboardPage dashboardPage=new DashboardPage();
    LoginPage loginpage= new LoginPage();

    @Then("User hover over My Account drop down menu")
    public void user_hover_over_my_account_drop_down_menu() {
        BrowserUtils.hover(dashboardPage.myAccount);





    }
    @Then("User clicks Logout and logout successfully")
    public void user_clicks_logout_and_logout_successfully() {
        dashboardPage.logout.click();
        Assert.assertTrue(loginpage.signIn.isDisplayed());
    }
    @Then("User clicks back icon on the browser and cannot login again")
    public void user_clicks_back_icon_on_the_browser_and_cannot_login_again() {
        Driver.get().navigate().back();
        Assert.assertFalse(Driver.get().getCurrentUrl().equals("http://eurotech.study/dashboard"));


    }
}
