Feature: Free CRM Deals Feature
Scenario: Free CRM Login Test Scenario
	Given user is already on Login Page
    When title of login Page is free crm
    Then user enters the username and password
    | username | password |
    | naveenk  | test@123 |
    Then user clicks on login button
    Then user is on the home page
  