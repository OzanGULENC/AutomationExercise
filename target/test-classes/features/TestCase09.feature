@Ozan
@TC09
Feature: Test Case 09
  Scenario: : Search Product

  Given Navigate to url
  When Verify that home page is visible successfully
  Then Click on Products button
  And Verify user is navigated to ALL PRODUCTS page successfully
  And Enter product name in search input and click search button
  And Verify "SEARCHED PRODUCTS" is visible
  And Verify all the products related to search are visible