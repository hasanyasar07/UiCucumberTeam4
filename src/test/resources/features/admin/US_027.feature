Feature: US_27 As an administrator, I want to have a Running Loans page to access and process existing loans.

  Background:
             * Admin "adminUrl" goes to home page

    Scenario: TC_01 Accessibility test to "Running Loans" page
      Given Clicks the Loans menu title
      Then Click on the "Running Loans" page link under the Loans menu heading.
      Then Verifies that the opened page is the "Running Loans" page
      And Closes the page

    Scenario: TC_02 Test that the Recurring Loans Table is visible on the Recurring Loans page
      Given Clicks on the Loans menu title
      Then Clicks on the "Running Loans" page link under the Loans menu heading.
      Then It tests that the Running Loans Table (with S.N., Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status information) is visible on the Running Loans page that opens.
      And Closes the page

    Scenario: TC_03 Testing that the Recurring Loans table on the Recurring Loans page is searchable with "Loan Number and Start Date - End Date" information
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then It tests that the Running Loans table on the Running Loans page that opens is searchable with the "Loan No and Start Date - End Date" information.
    And Closes the page

   Scenario: TC_04 Accessibility test for the Detail and Installment information of the loan selected under the Action heading in the Continuous Loans table
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then It tests the accessibility of the Detail and Installment information of the loan selected under the Action heading in the Recurring Loans table.
    And Closes the page

    Scenario: TC_05 Accessibility test for the Detail and Installment information of the loan selected under the Action heading in the Recurring Loans table
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then It tests the accessibility of the Detail and Installment information of the loan selected under the Action heading in the Recurring Loans table
    And Closes the page

    Scenario: TC_06 Loan details visibility test on details page
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then Clicks on the Details button of the selected loan under the Action heading in the Running Loans table.
    Then It tests that the loan details (Plan, Date of Application, Loan Number, Amount, Per Installment, Total Installment, Given Installment, Total Payable, Profit, Status information) are visible on the Details page that opens.
    And Closes the page

   Scenario: TC_07 Visibility testing of user credit form status in the User Credit Form window on the Details page
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then Clicks on the Details button of the selected loan under the Action heading in the Running Loans table.
    Then Tests that the user credit form status is visible in the User Credit Form window on the Details page
    And Closes the page

    Scenario: TC_08 Test where credit summary information appears on the Installments page
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then Clicks on the Installments button of the selected loan under the Action heading in the Running Loans table.
    Then It tests that the Credit summary information (Loan Number, Plan, Loan Amount, Per Installment, Total Installment, Given Installment, Receivable, Late Fee) appears on the opened Installments page.
    And Closes the page

    Scenario: TC_09 Test that installments are visible with S.N., Installment Date, Issue Date, Delay and Fee information on the Installments page.
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then Clicks on the Installments button of the selected loan under the Action heading in the Running Loans table.
    Then On the Installments page that opens, it tests that the installments are visible with S.N., Installment Date, Issue Date, Delay and Fee information.
    And Closes the page

    Scenario: TC_10 Test that it is possible to return to the Continuous Loans page from the Installments page
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then Clicks on the Installments button of the selected loan under the Action heading in the Running Loans table.
    Then It tests whether you can return to the Continuous Loans page from the Installments page.
    And Closes the page

    Scenario: TC_11 Test that if there are more than 20 installments on the installments page, they continue to be listed on the next page.
    Given Clicks on the Loans menu title
    Then Clicks on the "Running Loans" page link under the Loans menu heading.
    Then Clicks on the Installments button of the selected loan under the Action heading in the Running Loans table.
    Then If there are more than 20 installments on the Installments page that opens, it tests that they continue to be listed on the next page.
    And Closes the page
