package com.devEx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostsPage extends BasePage {

    @FindBy(css = "#posts-heading")
    public WebElement postsTitle;

    @FindBy(id = "post-form-title")
    public WebElement addTitle;

    @FindBy(id = "post-form-textarea")
    public WebElement createPost;

    @FindBy(css = "#post-form-btn")
    public WebElement submitBtn;

    @FindBy(css = "#post-form")
    public WebElement textField;

    @FindBy(xpath = "//*[text()='Post Created']")
    public WebElement createdMessage;
//    public static String actualMessage;
    public void createTitlePost(String title,String post){
        addTitle.sendKeys(title);
        createPost.sendKeys(post);
        submitBtn.click();
//        System.out.println(addTitle.getAttribute("validationMessage"));
//        if(addTitle.getText().equals(null)) {
//            actualMessage = addTitle.getAttribute("validationMessage");
//        }
//        else if(createdMessage.getText().equals(null)) {
//            actualMessage = createPost.getAttribute("validationMessage");
//        }
//        else {
//            actualMessage = createdMessage.getText();
//        }
    }
    public String getMessage(){
        String actualMessage="";
//        if(!(addTitle.getAttribute("validationMessage").equals(""))) {
//            actualMessage = addTitle.getAttribute("validationMessage");
//        }else if(!(createPost.getAttribute("validationMessage").equals(""))) {
//            actualMessage = createPost.getAttribute("validationMessage");
//        }else {
//            actualMessage = createdMessage.getText();
//        }
        if(addTitle.getText().equals("")) {
            actualMessage = addTitle.getAttribute("validationMessage");
        }
        else if(createPost.getText().equals("")) {
            actualMessage = createPost.getAttribute("validationMessage");
        }
        else {
            actualMessage = createdMessage.getText();
        }
        System.out.println("actualMessage = " + actualMessage);

        return actualMessage;
    }

}
