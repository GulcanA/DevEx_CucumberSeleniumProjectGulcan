package com.devEx.step_definitions;

import com.devEx.pages.DashboardPage;
import com.devEx.pages.PostsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class PostCreateStepDef {
    PostsPage postsPage = new PostsPage();
    DashboardPage dashboardPage = new DashboardPage();




    @And("The user navigates to  {string} menu")
    public void theUserNavigatesToMenu(String menu) {
        dashboardPage.navigateMenu(menu);
    }




    @Then("The user should see {string} message")
    public void theUserShouldSeeMessage(String expectedMessage) {
        assertEquals(expectedMessage,postsPage.createdMessage.getText());
    }

    @And("The user fills Add a title fields as {string} and Create a post field as {string}")
    public void theUserFillsAddATitleFieldsAsAndCreateAPostFieldAs(String title, String post) {
        postsPage.createTitlePost(title, post);
//        System.out.println(postsPage.addTitle.getAttribute("validationMessage"));

    }

    @Then("The user should see error message")
    public void theUserShouldSeeErrorMessage() {
        System.out.println(postsPage.createPost.getAttribute("validationMessage"));
    }

    @Then("The user should see {string} error message")
    public void theUserShouldSeeErrorMessage(String expectedMessage) {
//        System.out.println(postsPage.addTitle.getAttribute("validationMessage"));
        assertEquals(expectedMessage,postsPage.getMessage());
//        System.out.println(postsPage.getMessage());
    }

}
