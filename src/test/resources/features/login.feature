Feature: MeetSky app login functionality and verifications
  User Story: As a user, I should be able to login.

  Scenario:User can login with valid credentials
    Given user is on the login page
    When user enters a valid "username" in the username input box
    And user enters a valid "password" in the password box
    Then user clicks the log in button


  Scenario: User can not login with any invalid password
    Given user is on the login page
    When user enters a valid "username" in the username input box
    And user enters an "invalid_password" into password input box
    Then user clicks the log in button
    And Wrong username or password message is displayed for invalid credentials

  Scenario: User can not login without a username
    Given user is on the login page
    When user leaves the username input box blank
    And user enters a valid "password" in the password box
    And user clicks the log in button
    Then Please fill out this field message is displayed if the password or username is empty

    Scenario: User can see the password in a form of dots by default
      Given user is on the login page
      When user leaves the username input box blank
      And user enters a valid "password" in the password box
      Then user sees the password in a form of dots by default

Scenario: Verify that user can see the password explicitly if needed
  Given user is on the login page
  When user leaves the username input box blank
  And user enters a valid "password" in the password box
  And user clicks eye icon
  Then user sees the "password" explicitly

  Scenario: User can see the "Forgot password?" link on the login page and
  can see the "Reset Password" button on the next page after clicking on forget password link
    Given user is on the login page
    When user sees the forgot password link on the page
    And user clicks on forgot password link
    Then user sees reset password button on the next page


  Scenario: Verify that user can see valid placeholders on Username and Password fields
    Given user is on the login page
    And user sees valid placeholder on username
    Then user sees valid placeholder on password
