@us_40

Feature: As an administrator, I want to be able to see and manage payment plans of active users.

  Background: In this step, the registered user reaches the user home page by entering his username and password.
    Given Launch browser
    Given Navigate to "adminUrl"
    Given the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    Given  Verify that Admin homepage is visible successfully
    Given  Click Manage Users link on the DashboardPage


  Scenario: TC_01 The Active Ussers link under the Manege Ussers link should be viewed on the Dashboard page

    Given Verify Active Users link is appear on the DashboardPage
    Given   Close the page


  Scenario: TC_02 To access information about any user selected from the list,
            the 'Details' button must be visible and active.
            clicked, it should redirect to the 'User Detail - Username' page.

    Given  Click Manage Users link on the DashboardPage
    Given  Verify Active Users link is appear on the DashboardPage
    Given Click the details button for any user.
    Given Verify that the page is displayed.
    Given Close the page


  Scenario: TC_03 It should be able to reach the Details ussers page by clicking on the Details link of any user.

  * Click Manage Users link on the DashboardPage
  * Clicks on Active Users link.
  * Click the details button for any user.
  * Confirms that the User Detail-User Name page is accessed.
  * Close the page

  Scenario: TC_04  Under the title of 'withdRAWN', you should be able to go to
            the 'Withdrawals log' page and view the list.

    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * List and list headings are displayed on the page.
    * Close the page

  Scenario: TC_05 The links of 'Approved withdrawals', 'Pending Withdrawals',
          'Rejected Withdrawals' links should be visible.

    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Approved Withdrawals,Pending Withdrawals,Rejected Withdrawals links are displayed
    * Close the page

  Scenario: TC_06 The Details button on the Approved Withdrawals' page should be visible.

    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Click on the Approved Withdrawals link
    * The details button on the Approved Withdrawals page is displayed
    * Close the page



  Scenario: TC_07 User Withdrawals Information should be accessed and the list in the card should be displayed


    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Click on the Approved Withdrawals link
    * The details button on the Approved Withdrawals page is displayed
    * Clicks on the details button
    * The information in the card is displayed.
    * Close the page

  Scenario: TC_08 Pending withdrawn should be able to view the 'Pending' and 'Details' buttons under the title

    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Click on the Pending Withdrawn button
    * Confirms the visibility of the pending and details buttons on this page.
    * Close the page

  Scenario: TC_09 When the process detail page is entered, the 'Approve', 'Reject' buttons should be visible.

    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Click on the Pending Withdrawn button
    * Click on details button on the page that opens
    * Verifies the visibility of the Approve, Reject buttons on the page that opens
    * Close the page


  Scenario: TC_10 When Reject is rejected, the text "withdrawal Rejected Successfully" should be displayed.

    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Click on the Pending Withdrawn button
    * Click on details button on the page that opens
    * Click on the Reject button on the page, fill in the required field and click on the submit button
    * Withdrawal rejected successfully is displayed
    * Close the page

    Scenario: TC_11 When Approved is, the text "Withdrawal approved successFully" should be displayed.


      * Click Manage Users link on the DashboardPage
      * Clicks on Active Users link.
      * Click the details button for any user.
      * Click on link under Withdrawn and go to page
      * Click on the Pending Withdrawn button
      * Click on details button on the page that opens
      * Click on the Approved button on the page, fill in the required fields and press the submit button
      * Withdrawal approved successfully is displayed
      * Close the page

  Scenario: TC_12 When clicking on the Rejected Withdrawals link, it should be viewed that the status is 'Rejected'.

    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click the details button for any user.
    * Click on link under Withdrawn and go to page
    * Click on the Rejected Withdrawals link
    * It is seen that the status is Rejected
    * Close the page

    Scenario: TC_13  On the Rejected Withdrawals page, the card information should be displayed when the 'Details' button is disconnected.

      * Click Manage Users link on the DashboardPage
      * Clicks on Active Users link.
      * Click the details button for any user.
      * Click on link under Withdrawn and go to page
      * Click on the Rejected Withdrawals link
      * Clicks on the details button
      * The information in the card is displayed.
      * Close the page








