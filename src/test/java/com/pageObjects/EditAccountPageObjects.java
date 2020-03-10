package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class EditAccountPageObjects {

    public EditAccountPageObjects() {

        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(id = "login")
    public WebElement txt_UserName;

    @FindBy(id = "password")
    public WebElement txt_Password;

    @FindBy(id = "submit")
    public WebElement btn_UpdateAccount;

    @FindBy(id = "newpassword1")
    public WebElement txt_NewPassword;

    @FindBy(id = "newpassword2")
    public WebElement txt_RepeatNewPassword;

}
