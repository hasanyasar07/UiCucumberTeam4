
@us_38
Feature: As a User (Admin), I want to have a page where I can see active users
          on the site and manage Deposit (withdrawal) transactions.

  Background: In this step, the registered user reaches the user home page by entering his username and password.
    Given Launch browser
    Given Navigate to "adminUrl"
    Given the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    Given  Verify that Admin homepage is visible successfully
    Given  Click Manage Users link on the DashboardPage



  Scenario: TC_01 To verify that on the Dashboard page, within the Navbar, the 'Active Users' link is visible


    Given  Verify Active Users link is appear on the DashboardPage
    Given   Close the page

  Scenario: TC_02 To verify that the 'Details' button associated with any user selected from the list is both visible and functional.

    * Verify Active Users link is appear on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click  all deposit button
    * Verify that the text x requested x USD should be displayed
    * Close the page


  Scenario: TC_03 To confirm that page 'Deposit Card' is correctly displayed. The card should include titles and values


    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on the Details button
    * Click  all deposit button
    * Verify that Deposit Card and Date, Transaction Number, Username, Method, Amount, Charge, After Charge, Rate, Payable, Status titles is visible
    *  Close the page


  Scenario: TC_04  To validate that on a designated page, the titles 'Successful Deposit,' 'Pending Deposit,' 'Rejected Deposit,' and
            'Initiated Deposit' are visibly displayed.
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on the Details button
    * Click  all deposit button
    * Verify that "Successful Deposit', 'Pending Deposit', 'Rejected Deposit', 'Initiated Deposit' titles and values are visible
    *  Close the page


  Scenario: TC_05 To validate the functionality and interactivity of the 'Successful Deposits' page.

    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on the Details button
    * Click  all deposit button
    * Click on the Successful Deposits heading
    * Verify that Succesful Deposits page is visible
    * Enter the credentilas in the Filtering and Search boxes
    * Verify that Filtering and Search buttons are fonctional
    * Verify that a list of successful deposits are displayed
    *  Close the page

  Scenario: TC_06 To validate the functionality and interactivity of the 'Pending Deposits' section.
    * Clicks on Active Users link.
    * Click on the view all icon
    * Click the details button for any user.
    * Click on the Details button
    * Click  all deposit button
    * Click the Pending Deposits Heading
    * Verify that Pending Deposits page is visible
    * Click on the Details button
    * Verify that Details button is active
    * Verify that Approve and Reject buttons on the Transaction Detail page
    *  Close the page


  Scenario: TC_07 To validate the functionality and confirmation process when rejecting a deposit request

    * Clicks on Active Users link.
    * Click on the Details button
    * Click on the view all icon
    * Click the details button for any user.
    * Click on the Details button
    * Click  all deposit button
    * Click the Pending Deposits Heading
    * Click on the spesific user Details button
    * Click on the Approve button
    * On the page that appears click on the Yes button
    * Verify that Deposit request approved successfully is appeared
    * Close the page

    @a
