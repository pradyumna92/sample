package com.stepdefs;

import com.methods.commonMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStepdefs {

    commonMethods com = new commonMethods();

    @Given("^User is on Expense Tracker HomePage$")
    public void userIsOnExpenseTrackerHomePage() throws Exception {
        com.launchApp();
    }

    @And("^User enters (valid|invalid) \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersValidAnd(String arg, String username, String password) throws Throwable {
        com.login(arg, username, password);
    }

    @And("^User clicks on (register|update) button$")
    public void userClicksOnRegisterButton(String link) {
        if (link.equalsIgnoreCase("register")) {
            com.userClicksOnRegisterButton();
        } else {
            com.userClicksOnUpdateButton();
        }
    }

    @And("^User clicks on (AddExpenses|ListExpenses|ListCategories|ShowStatistics|EditAccount) from the navigation menu$")
    public void userClicksOnAddExpensesFromTheNavigationMenu(String arg) {
        com.navLinks(arg);
    }

    @And("^User clicks on add category link$")
    public void userClicksOnAddCategoryLink() {
        com.addCategory();
    }

    @And("^User validates the statistics displayed on the page$")
    public void userValidatesTheStatisticsDisplayedOnThePage() {
        com.showStats();
    }

    @And("^User enters \"([^\"]*)\" and creates the category and validate the same$")
    public void userEntersAndCreatesTheCategoryAndValidateTheSame(String categoryName) throws Throwable {
        com.createsCategory("Insurance");
        com.validateCategory(categoryName);
    }

    @And("^User enters all the \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and other required details to crate the expense$")
    public void userEntersAndOtherRequiredDetailsToCrateTheExpense(String day, String month, String year, String amount, String reason) throws Throwable {
        com.addExpenses(day, month, year, amount, reason);
    }

    @And("^user enter details to update the account$")
    public void userEnterDetailsToUpdateTheAccount() {
        com.editAccount();
    }

    @And("^User \"([^\"]*)\" the created category$")
    public void userTheCreatedCategory(String arg0) throws InterruptedException {
        if (arg0.equalsIgnoreCase("edit")) {
            com.editCategory();
        } else
            com.deleteCategory();
    }

    @And("^User validate the created expenses$")
    public void userValidateTheCreatedExpenses() {
        com.validateExpenses();
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" to register new user$")
    public void userEntersAndAndToRegisterNewUser(String username, String password1, String password2) throws Throwable {
        com.registerNewUser(username, password1, password2);
    }


}
