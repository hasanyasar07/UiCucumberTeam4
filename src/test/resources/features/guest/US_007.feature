Feature: US_007 I would like to have a page where I, as a visitor, can access and select Loan Plans

  Background:
             * Visitor goes to "guestUrl" homepage

  Scenario:TC_01 Test that the opened page is the 'Credit Plans' page
  Given Tests that the Plans button appears from the home page menu header
  Then Plans button is clicked
  Then Verifies that the opened page is the 'Loan Plans' page
  And  Closes the page

  Scenario: TC_02 Test that the 'Credit Plans' Link is visible and active under the Important Link heading in the Home Page Footer section
  Then It tests whether the 'Credit Plans' Link is visible and active under the Important Link heading in the Home Page Footer section.
  And Closes the page

  Scenario: TC_03 The Credit Plans Page that opens has the title Basic Credit and Test where Credit Plan Cards appear under Basic Credit
  Then Clicks Plans from the Home menu header
  Then Verifies that the Loan Plans Page that opens has the title Basic Loan.
  Then Basic Loan is clicks
  Then Tests that Credit Plan Cards appear under the Basic Credit heading
  And Closes the page

  Scenario: TC_04 Testing that the Apply Now buttons under the Credit Plan Cards under the Basic Credit heading on the Credit Plans Page are visible and active.
  Then Clicks Plans from the Home menu header
  Then Basic Loan is clicked
  Then It tests whether the Apply Now buttons under the Credit Plan Cards under the Basic Credit heading on the opened Credit Plans Page are visible and active.
  And Closes the page

  Scenario: TC_05 On the Loan Plans Page, you click on the Housing  and Loan Plans links and check that you go to the relevant pages.
  Then Clicks Plans from the Home menu header
  Then Clicks on the Home link on the Loan Plans Page that opens and tests whether you can go to the relevant pages.
    Then Clicks Plans from the Home menu header
    Then Clicks on the Loan Plans link from the Loan Plans Page that opens and tests whether you can go to the relevant page.
  Then Closes the page