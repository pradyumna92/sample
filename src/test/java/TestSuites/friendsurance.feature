Feature: Expenses Tracker Test cases

  Scenario:As a Customer ,I want to register new User
    Given User is on Expense Tracker HomePage
    When User enters "username" and "password1" and "password2" to register new user
    Then User clicks on register button

  Scenario:As a Customer ,I want to change my password
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on EditAccount from the navigation menu
    And user enter details to update the account
    Then User clicks on update button

  Scenario:As a Customer ,I want to login with valid credentials
    Given User is on Expense Tracker HomePage
    Then User enters valid "username" and "password"

  Scenario:As a Customer ,I want to login without Registering
    Given User is on Expense Tracker HomePage
    Then  User enters invalid "username" and "password"

  Scenario: As a Customer ,I want to create a category
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on ListCategories from the navigation menu
    And User clicks on add category link
    Then User enters "categoryName" and creates the category and validate the same

  Scenario: As a Customer ,I want to modify a category and
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on ListCategories from the navigation menu
    Then User "edit" the created category

  Scenario: As a Customer ,I want to delete the created category
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on ListCategories from the navigation menu
    Then User "deletes" the created category

  Scenario: As a Customer ,I want to create a category
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on ListCategories from the navigation menu
    And User clicks on add category link
    Then User enters "categoryName" and creates the category and validate the same

  Scenario: As a Customer ,I want to create an expense
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on AddExpenses from the navigation menu
    Then User enters all the "day" "month" "year" "amount" "reason" and other required details to crate the expense

  Scenario: As a Customer ,I want to validate  the created expenses
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    Then User validate the created expenses

  Scenario: As a Customer ,I want to see statistics for the Expenses created
    Given User is on Expense Tracker HomePage
    When User enters valid "username" and "password"
    And User clicks on ShowStatistics from the navigation menu
    Then User validates the statistics displayed on the page
