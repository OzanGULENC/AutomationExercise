@Ozan
@TC05
Feature: TestCase05
  Scenario: Register User with existing email


  Given Navigate to url
  When Verify that home page is visible successfully
  Then Click on Signup Login button
  And Verify New User Signup is visible
  And Enter name and already registered email address
  And Click Signup button
  And Verify error Email Address already exist is visible