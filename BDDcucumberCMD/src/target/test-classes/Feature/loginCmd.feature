Feature: login functionality tyest CMD

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enter valid username and password
    And user click login button
    Then user is navigated to the home page

@smoke
  Scenario: Check login with Invalid credentials
    Given user is on login page
    When user enter Invalid username and password
    And user click login button
    Then Error message is Displayed - Invalid Credentials
