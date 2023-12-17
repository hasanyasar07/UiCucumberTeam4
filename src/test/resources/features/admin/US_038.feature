
@us_38
Feature: As a User (Admin), I want to have a page where I can see active users
          on the site and manage Deposit (withdrawal) transactions.

  Background: In this step, the registered user reaches the user home page by entering his username and password.



  Scenario: TC_01 To verify that on the Dashboard page, within the Navbar, the 'Active Users' link is visible

    Given Launch browser
    Given Navigate to "adminUrl"
    Given the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    Given  Verify that Admin homepage is visible successfully
    Given  Click Manage Users link on the DashboardPage
    Given  Verify Active Users link is appear on the DashboardPage
    Given   Close the page

  Scenario: TC_02 To verify that 'Active Users' link is clicked, the 'Active Users List' is visible

    Given Launch browser
    Given Navigate to "adminUrl"
    Given the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    Given  Verify that Admin homepage is visible successfully
    Given  Click Manage Users link on the DashboardPage
    Given  Verify Active Users link is appear on the DashboardPage
    Given  Verify 'Active Users List' and list titles is displayed
    Given Close the page


