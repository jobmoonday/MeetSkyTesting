Feature: MeetSky app login functionality and verifications
  User Story: As a user, I should be able to login.

Scenario:User can login with valid credentials
 Given user is on the login page
 When user enters a valid username in the username input box
 And user enters a valid password in the password box
 Then user clicks the log in button