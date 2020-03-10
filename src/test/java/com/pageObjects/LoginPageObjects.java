package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class LoginPageObjects {

    public LoginPageObjects() {
        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(id = "login")
    public WebElement txt_UserName;

    @FindBy(id = "password")
    public WebElement txt_Password;

    @FindBy(id = "submit")
    public WebElement btn_Submit;

    @FindBy(xpath = "//a[@href='register.jsp']")
    public WebElement link_RegisterUser;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement msg_InvalidLogin;


}
