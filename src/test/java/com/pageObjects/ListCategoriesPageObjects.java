package com.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import runner.TestInit;

import java.util.concurrent.TimeUnit;

public class ListCategoriesPageObjects {

    public ListCategoriesPageObjects() {

        WebDriver driver = TestInit.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @FindBy(xpath = "//a[@id='go_add_category']")
    public WebElement link_AddCategory;

    /*@FindBy(xpath = "//a[@id='go_add_category']")
    public WebElement txt_listCategories;*/

    @FindBy(id = "name")
    public WebElement txt_CategoryName;

    @FindBy(id = "submit")
    public WebElement btn_CreateCategory;

    @FindBy(id = "name")
    public WebElement txt_NameOfTheCategory;

    @FindBy(xpath = "//a[contains(@href ,'editcategory')]")
    public WebElement img_EditCategory;

    @FindBy(xpath = "//a[contains(@href ,'deletecategory')]")
    public WebElement img_DeleteCategory;



}
