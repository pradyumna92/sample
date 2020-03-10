package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class HomePageObjects {
    public HomePageObjects() {
        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//a[@id='go_add_expense']")
    public WebElement link_AddExpenses;

    @FindBy(xpath = "//a[@href='listexpenses']")
    public WebElement link_ListExpenses;

    @FindBy(xpath = "//a[@id='go_list_categories']")
    public WebElement link_ListCategories;

    @FindBy(xpath = "//a[@href='showstatistics']")
    public WebElement link_ShowStatistics;

    @FindBy(id = "editaccount")
    public WebElement link_EditAccount;

    @FindBy(id = "logout")
    public WebElement link_Logout;
}

