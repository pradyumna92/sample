package com.methods;

import com.pageObjects.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import runner.TestInit;

import java.util.List;
import java.util.Properties;
import java.util.Random;

public class commonMethods {

    private WebDriver driver;
    private Properties prop;

    public commonMethods() {
        this.driver = TestInit.getDriver();
        this.prop = TestInit.getProp();
    }

    public void launchApp() {
        driver.get(prop.getProperty("url"));
    }

    public void userClicksOnRegisterButton() {
        LoginPageObjects login = new LoginPageObjects();
        HomePageObjects homepage = new HomePageObjects();
        RegisterPageObjects register = new RegisterPageObjects();
        register.btn_Submit.click();
        if (homepage.link_Logout.isDisplayed()) {
            Assert.assertTrue("Success", homepage.link_Logout.isDisplayed());
        } else {
            String message = login.msg_InvalidLogin.getText();
            Assert.assertEquals("password1 wasn't equal to password2", message);
        }
    }

    public void userClicksOnUpdateButton() {
        LoginPageObjects login = new LoginPageObjects();
        HomePageObjects homepage = new HomePageObjects();
        login.btn_Submit.click();
        Assert.assertTrue("User is successfully loggedIn", homepage.link_Logout.isDisplayed());
    }

    public void login(String arg, String username, String password) {
        LoginPageObjects login = new LoginPageObjects();
        HomePageObjects homepage = new HomePageObjects();

        switch (arg) {
            case "valid":
                login.txt_UserName.sendKeys(prop.getProperty("username"));
                login.txt_Password.sendKeys(prop.getProperty("password"));
                login.btn_Submit.click();
                Assert.assertTrue("Successfully logged In", homepage.link_Logout.isDisplayed());
                break;
            case "invalid":
                login.txt_UserName.sendKeys(prop.getProperty("invalidUsername"));
                login.txt_Password.sendKeys(prop.getProperty("invalidPassword"));
                login.btn_Submit.click();
                String s = login.msg_InvalidLogin.getText();
                Assert.assertEquals("unknown login or wrong password", s);
                /*registerNewUser(prop.getProperty("registerUserName"), prop.getProperty("registerPassword"), prop.getProperty("registerPassword"));*/
                break;
        }
    }

    public void registerNewUser(String username, String password1, String password2) {
        LoginPageObjects login = new LoginPageObjects();
        RegisterPageObjects register = new RegisterPageObjects();
        Boolean b = login.link_RegisterUser.isDisplayed();
        login.link_RegisterUser.click();
        register.txt_UserName.sendKeys(prop.getProperty("registerUserName"));
        register.txt_Password.sendKeys(prop.getProperty("registerPassword"));
        register.txt_RetypePassword.sendKeys(prop.getProperty("registerPassword"));
    }

    public void addCategory() {
        ListCategoriesPageObjects category = new ListCategoriesPageObjects();
        category.link_AddCategory.click();
    }

    public void showStats() {
        ShowStatisticsPageObjects stats = new ShowStatisticsPageObjects();
        Assert.assertTrue("Statistics chart is displayed", stats.img_Statistics.isDisplayed());
        Assert.assertTrue("Category Values are displayed", stats.txt_CategoryValue.isDisplayed());
        List<WebElement> statisticsDetails = driver.findElements(By.cssSelector(".tableList tbody tr"));
        statisticsDetails.forEach(e -> System.out.println(e.getText()));
    }

    public void createsCategory(String categoryName) {
        ListCategoriesPageObjects category = new ListCategoriesPageObjects();
        category.txt_NameOfTheCategory.sendKeys(prop.getProperty("categoryName"));
        category.btn_CreateCategory.click();
    }

    public void validateCategory(String categoryName) {
        ListCategoriesPageObjects category = new ListCategoriesPageObjects();
        String nameOfTheCategoryText = category.txt_NameOfTheCategory.getText();
        if (categoryName.equals(nameOfTheCategoryText)) {
            Assert.assertTrue("Created Category Name is displayed in the list", true);
        } else {
            System.out.println("Assertion failed");
        }
    }

    public void editAccount() {
        EditAccountPageObjects editPage = new EditAccountPageObjects();
        /*Assert.assertFalse("UserName field is not disabled", editPage.txt_UserName.isEnabled());*/
        editPage.txt_Password.sendKeys(prop.getProperty("password"));
        editPage.txt_NewPassword.sendKeys(prop.getProperty("newPassword1"));
        editPage.txt_RepeatNewPassword.sendKeys(prop.getProperty("newPassword1"));
    }

    public void editCategory() {
        ListCategoriesPageObjects category = new ListCategoriesPageObjects();
        List<WebElement> l = driver.findElements(By.xpath("//a[contains(@href ,'editcategory')]"));
        Random r = new Random();
        l.get(r.nextInt(l.size())).click();
        category.txt_CategoryName.clear();
        category.txt_NameOfTheCategory.sendKeys(prop.getProperty("modifiedCategoryName"));
        category.btn_CreateCategory.click();
        /*Assert.assertFalse("Successfully modified", category.btn_CreateCategory.isDisplayed());*/
    }

    public void deleteCategory() {
        List<WebElement> listOfCategories = driver.findElements(By.cssSelector(".table tr "));
        Random r = new Random();
        listOfCategories.get(r.nextInt(listOfCategories.size())).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        List<WebElement> newList = driver.findElements(By.cssSelector(".table tr "));
        Assert.assertEquals(listOfCategories.size() - 1, newList.size());
    }

    public void validateExpenses() {
        List<WebElement> expensesDetails = driver.findElements(By.cssSelector(".table tbody tr"));
        expensesDetails.forEach(e -> System.out.println(e.getText()));
    }

    public void navLinks(String arg) {
        HomePageObjects homepage = new HomePageObjects();
        if (arg.equalsIgnoreCase("AddExpenses")) {
            homepage.link_AddExpenses.click();
        } else if (arg.equalsIgnoreCase("ListExpenses")) {
            homepage.link_ListExpenses.click();
        } else if (arg.equalsIgnoreCase("ListCategories")) {
            homepage.link_ListCategories.click();
        } else if (arg.equalsIgnoreCase("ShowStatistics")) {
            homepage.link_ShowStatistics.click();
        } else
            homepage.link_EditAccount.click();
    }

    public void addExpenses(String day, String month, String year, String amount, String reason) {
        AddExpensesPageObjects expenses = new AddExpensesPageObjects();
        expenses.txt_Day.sendKeys(prop.getProperty("day"));
        expenses.txt_Month.clear();
        expenses.txt_Month.sendKeys(prop.getProperty("month"));
        expenses.txt_Year.sendKeys(prop.getProperty("year"));
        WebElement selectCategory = driver.findElement(By.xpath("//select[@id='category']"));
        selectCategory.click();
        Select s = new Select(selectCategory);
        s.selectByIndex(1);
        expenses.txt_Amount.sendKeys(prop.getProperty("amount"));
        expenses.txt_Reason.sendKeys(prop.getProperty("reason"));
        expenses.btn_CreateExpense.click();
    }

}
