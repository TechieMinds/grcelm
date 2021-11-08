# Feature, Scenario, Given, When, Then, And, But, Scenario Outline, Examples, Background
# Cucumber - Testng
# Feature - Suite
# Scenario - TestCase
# Scenario outline, example - Data provider, test
# steps, given, when, then, and, but
#

@sanity
Feature: HerokuApp

Background: pre-reqs
		Given I am a background step

  Scenario: Validating the Disappearing Elements Link in HerokuApp Page
    Given I have to navigate to "The Internet HerokuApp"
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Disappearing Elements" link
    Then I have to see the "Disappearing Elements" heading on the page
    When I click on the "Home" link
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Disappearing Elements" link
    Then I have to see the "Disappearing Elements" heading on the page 
    When I click on the "About" link
    Then I have to see the "Not Found" text on the page

  Scenario: Validating the Form Authentication Link in HerokuApp Page
    Given I have to navigate to "The Internet HerokuApp"
    Then I should see the "Welcome to the-internet" heading on the page
    When I click on the "Form Authentication" link
    Then I have to see the "Login Page" text displayed on the page
    When I enter the "username" which is "tomsmith" in the textfield provided
    Then I have to print the "username" that is entered in the text field
    When I enter the "password" which is "SuperSecretPassword!" in the textfield provided
    Then I have to print the "password" that is entered in the text field
    When I click on "submit" button
    Then I have to see "flash" text displayed on the page
    When I click on "/logout" button link
    Then I have to see "flash" text loggedout successful displayed 

