package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class RegisterPageObjects {

    public RegisterPageObjects() {

        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(id = "login")
    public WebElement txt_UserName;

    @FindBy(id = "password1")
    public WebElement txt_Password;

    @FindBy(id = "password2")
    public WebElement txt_RetypePassword;

    @FindBy(id = "submit")
    public WebElement btn_Submit;


}

