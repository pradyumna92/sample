package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class ListExpensesPageObjects {

    public ListExpensesPageObjects() {
        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[1]")
    public WebElement text_Date;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[2]")
    public WebElement text_Category;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[3]")
    public WebElement text_Amount;

    @FindBy(xpath = "//table[@class='table']/tbody/tr/td[4]")
    public WebElement text_Reason;


}
