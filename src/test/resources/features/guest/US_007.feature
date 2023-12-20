Feature: US_007 I would like to have a page where I, as a visitor, can access and select Loan Plans

  Background:
             * Visitor goes to "guestUrl" homepage
  Scenario:TC_01 Test that the opened page is the 'Credit Plans' page
  Given Tests that the Plans button appears from the home page menu header
  Then Plans button is clicked
  Then Verifies that the opened page is the 'Loan Plans' page
  And  Closes the page

  Scenario: TC_02 Test that the 'Credit Plans' Link is visible and active under the Important Link heading in the Home Page Footer section
  Given Visitor goes to “guestUrl” homepage
  Then It tests whether the 'Credit Plans' Link is visible and active under the Important Link heading in the Home Page Footer section.
  And Closes the page

  Scenario: TC_03 The Credit Plans Page that opens has the title Basic Credit and Test where Credit Plan Cards appear under Basic Credit
  Given Visitor goes to “guestUrl” homepage
  Then Clicks Plans from the Home menu title
  Then Verifies that the Loan Plans Page that opens has the title Basic Loan.
  Then Tests that Credit Plan Cards appear under the Basic Credit heading
  And Closes the page

  Scenario: TC_04 Testing that the Apply Now buttons under the Credit Plan Cards under the Basic Credit heading on the Credit Plans Page are visible and active.
  Given Visitor goes to “guestUrl” homepage
  Then Clicks Plans from the Home menu title
  Then It tests whether the Apply Now buttons under the Credit Plan Cards under the Basic Credit heading on the opened Credit Plans Page are visible and active.
  And Closes the page

  Scenario: TC_05 On the Loan Plans Page, you click on the Housing\Loan Plans links and check that you go to the relevant pages.
  Given Visitor goes to “guestUrl” homepage
  Then Click Plans from the homepage menu header
  Then On the Loan Plans Page that opens, click on the Housing\Loan Plans links and test that you have gone to the relevant pages
  And Closes the page
