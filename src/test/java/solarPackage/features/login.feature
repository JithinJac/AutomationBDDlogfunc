Feature: Login
  Scenario: Login validation with admin valid credentials
    Given I am on the "http://solar.schoolnewgen.com/websolar/login"
    When  I enter valid username as"admin2@gmail.com"
    And   I enter valid password as"secret"
    And   I click on the sign in button
    Then  I should be navigated to the Dashboard page successfully