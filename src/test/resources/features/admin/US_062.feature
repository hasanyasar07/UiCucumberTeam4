

Feature: US_062 As an administrator, I want to have an All Withdrawals page so that I can view all withdrawals requests on the same page.

  Background:
    * kullanici verilen "adminUrl" gider

  Scenario: TC_01 The Withdrawals Log page should be accessible under the Withdrawals menu on the side bar in the admin panel.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawals button and then the All Withdrawals link.
    Then it tests whether it can view the Withdrawals Log page in the All Withdrawals link.
    And closes the page.

  Scenario: TC_02 SWithdrawals Log list should be displayed on the page, 'Gateway, Initiated,' User', 'Amount', 'Conversion', 'Status', 'Action' headings and the information below should be visible in the list.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawals button and then the All Withdrawals link.
    Then it is tested whether the titles Gateway, Initiated, User, Amount, Conversion, Status, Action are displayed in the Withdrawals Log list.
    And closes the page.


  Scenario: TC_03It should be possible to search the Withdrawals Log table using "Username/Transaction Number and Start Date - End Date" information.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawals button and then the All Withdrawals link.
    Then it is tested that you can search with Username, Transaction No, Start Date, End Date information on the Withdrawals Log page.
    And closes the page.

  Scenario: TC_04 To access the details of the rejected payment transaction selected from the list, the 'Details' page should be accessed under the Action heading.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawals button and then the All Withdrawals link.
    Then it tests whether it can access the details page under the action heading for the details of the payment transactions on the Withdrawals Log page.
    And closes the page.

  Scenario: TC_05 To access the details of the pending payment transaction selected from the list and to accept/reject it, the 'Details' page must be accessed under the Action heading.
    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawals button and then the All Withdrawals link.
    Then on the Withdrawals Log page, click on details under the action heading to accept or reject the payment transaction.
    Then it tests whether it can access the details page under the action heading to accept or reject the payment transaction on the Withdrawals Log page.
    And closes the page.


  Scenario: TC_06 There should be information boards (Approved Withdrwals, Pending Withdrawals, Rejected Withdrawals) on the page and redirect to the relevant page.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawals button and then the All Withdrawals link.
    Then it is tested that the Withdrawals Log page contains Approved Withdrawals, Pending Withdrawals, Rejected Withdrawals and redirects to the required page.
    And closes the page.