@Grid
Feature: Test different actions on the static Table page

Background: Navigate to Table web app
    Given I navigate to the static table

Rule: The user can return values from the table and validate them
@smoke @regresion
Scenario:  As a test Engineer, I want to retrieve the value of an static table 
    Then I can return the value I wanted

@regresion
Scenario:  As a test Engineer, I want to validate the static table is displayed
    Then I can validate the table is displayed
