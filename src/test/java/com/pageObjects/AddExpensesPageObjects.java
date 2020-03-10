package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class AddExpensesPageObjects {

    public AddExpensesPageObjects() {
        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//a[@id='go_add_category']")
    public WebElement link_AddCategory;

    @FindBy(id = "day")
    public WebElement txt_Day;

    @FindBy(id = "month")
    public WebElement txt_Month;

    @FindBy(id = "year")
    public WebElement txt_Year;

    @FindBy(id = "category")
    public WebElement dropDown_Category;

    @FindBy(id = "amount")
    public WebElement txt_Amount;

    @FindBy(id = "reason")
    public WebElement txt_Reason;

    @FindBy(id = "submit")
    public WebElement btn_CreateExpense;


}
