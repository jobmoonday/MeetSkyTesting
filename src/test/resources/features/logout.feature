Feature: MeetSky app log out functionality and verifications
  User Story: As a user, I should be able to log out

  Scenario: Verify that use can log out and ends up in the log in page
@wip
    Given user is on the main page
    When user clicks the avatar on the right-top corner of the page
    And user clicks the log out button
    Then User should be able to log out and see the login page

    Scenario: Verify that user can not go to home page again
    by clicking step back button after successfully logged out.

      Given user is on the login page
      When user clicks step back button


