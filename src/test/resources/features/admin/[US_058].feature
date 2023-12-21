

Feature: US_058 As an administrator, I want to have a page where I can manage the withdrawals methods that will be offered to users.

  Background:
* kullanici verilen "adminUrl" gider

  Scenario: TC_01 The Withdrawal Methods page should be accessible under the Withdrawals menu on the side bar in the admin panel.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawal button and then the Withdrawal Methods button.
    Then it is tested that the Withdrawal Methods page can be accessed.
    And closes the page.

  Scenario: TC_02 Payment methods (with Method, Currency, Charge, Withdrawal Limit, Status information) should be displayed in the Withdrawal Methods Table on the page.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawal button and then the Withdrawal Methods button.
    Then it tests whether it can display the Method, Currency, Charge, Withdraw Limit, Status information.
    And closes the page.

  Scenario: TC_03 In order to edit the method selected in the Withdrawal Methods Table, the edit page must be accessed under the Action heading.
    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawal button and then the Withdrawal Methods button.
    Then it tests whether it can reach the edit page under the action heading.
    And closes the page.

  Scenario: TC_04 The Withdraw method must be updated by entering valid information on the Edit page.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawal button and then the Withdrawal Methods button.
    Then clicks on the edit page under the action link.
    Then it tests whether it can update.
    And closes the page.


  Scenario: TC_05 The visibility of the selected method should be controlled under the action heading in the Withdrawal Methods Table.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawal button and then the Withdrawal Methods button.
    Then the visibility of the method selected under the action heading is tested.
    And closes the page.

  Scenario: TC_06 A new method should be created on the Withdrawal Methods page.

    Given admin enters "selimebeyzaUsername" and "adminPassword" information where necessary.
    Then he clicks the login button and logs in successfully as admin.
    Then click on the Withdrawal button and then the Withdrawal Methods button.
    Then click on the add new button and fill in the necessary information.
    Then click on the Submit button.
    And closes the page.



