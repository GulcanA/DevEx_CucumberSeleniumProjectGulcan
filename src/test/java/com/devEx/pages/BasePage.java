package com.devEx.pages;

import com.devEx.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    //Page Object Model --> Design pattern in selenium
    //Page Factory --> is class in Selenium using which we can create page object model.


    public BasePage(){
        PageFactory.initElements(Driver.get(),this); //It allows reaching web elements and methods in this class
    }




}
