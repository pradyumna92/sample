package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class ShowStatisticsPageObjects {

    public ShowStatisticsPageObjects() {

        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(id = "myChart")
    public WebElement img_Statistics;

    @FindBy(xpath = "//div[@class='inline-block']")
    public WebElement txt_CategoryValue;

    @FindBy(xpath = "//table[@class='tableList bordered']/tbody")
    public WebElement txt_AllCategoryValues;


}
