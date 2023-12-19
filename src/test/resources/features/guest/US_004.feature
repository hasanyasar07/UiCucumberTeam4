Feature: US_004 As a visitor, I want to have a home page where I can access general information on the site.

  Background:
              *   Visitor goes to “guestUrl” homepage

  Scenario: TC_01 Testing that when you click on Home Page in the menu title on the home page, you are directed to the 'Home Page' page.
    And   Click on Home Page in the menu title on the home page.
    Then Verifies that the opened page is 'Home'
    Then  Closes the page

  Scenario: TC_02 You can access the About page from the body of the home page.
      And Click About from the body section of the home page.
      Then Tests whether the about page has been reached
      Then  Closes the page

  Scenario: TC_03 The Feature section and its subheadings should appear in the body section of the home page.
      And It tests that the Feature section and 'Quick Approval Processes', 'Various Loan Types', 'Flexible Repayment Terms', 'Competitive Interest Rates', 'Digital Application and Processing' headings are visible in the body section of the home page.
      Then Closes the page

  Scenario: TC_04 '24/7 Support' and 'Low Cost' titles and icons should appear in the body section of the home page
      And Tests that "24/7 Support" and "Low Cost" titles and icons are visible in the body section of the home page.
      Then  Closes the page

  Scenario: TC_05 There must be a 'Featured Plans' section in the body of the home page
      And  It tests that there is a "Featured Plans" section in the body of the homepage.
      Then  Closes the page

  Scenario: TC_06 'Basic Credit' button should be visible and active under Featured plans
      And Tests that the "Basic Loan" button is visible and active under Featured plans
      Then Closes the page

  Scenario: TC_07 'Test Loan Card' should appear under Featured plans
    And   Tests that "Test Loan Card" is visible under Featured plans
    Then  Closes the page

  Scenario: TC_08 The Apply Now button must be present and active under Featured plans
    And Tests that the Apply Now button is present and active under Featured plans
    Then  Closes the page

  Scenario: TC_09 When the Apply Now button is clicked, 'You are not logged in!' message should be displayed.
    And Clicks the Apply Now button under Featured plans
    Then It tests that when the Apply Now button is clicked, the "You are not logged in!" message appears in the window that opens and there is a link button that directs you to the login page.
    Then Closes the page

  Scenario: TC_10 A 'See All' button should appear under Featured plans
    And Tests that the "See All" button is visible under Featured plans
    Then  Closes the page

  Scenario: TC_11 Clicks the 'See All' button under featured plans and the page that opens should be the page where the plans are displayed
    And Clicks the "See All" button under Featured plans
    Then Verifies that the opened page is the page where the plans are displayed
    Then Closes the page

  Scenario: TC_12 Information about the Site should appear in the Body Section of the Home Page
    And It tests whether information about the Site (Countrywide, Happy Customers, Rewards Won, Total Credits) is visible in the Body Section of the Home Page.
    Then Closes the page

  Scenario: TC_13 There should be a Frequently Asked Questions section in the Body Section of the Home Page
    And  It tests that there is a Frequently Asked Questions section in the Body Section of the Home Page.
    Then Closes the page

  Scenario: TC_14  Frequently asked questions in the Frequently Asked Questions section should appear in the Body of the Home Page
    And Tests that frequently asked questions in the Frequently Asked Questions section appear in the Body Section of the Home Page.
    Then Closes the page
  @tst
  Scenario: TC_15 Accordion buttons in the Frequently Asked Questions section in the Body Section of the Home Page must be visible and active.
    And It tests whether the accordion buttons in the Frequently Asked Questions section in the Body Section of the Home Page are visible and active.
    Then Closes the page

  Scenario: TC_16 There should be a slider section in the Body Section of the Home Page that introduces Company Employees
    And Tests that a slider introducing Company Employees is visible in the Body Section of the Home Page.
    Then  Closes the page

  Scenario: TC_17 The left/right buttons on the Slider introducing Company Employees in the Body Section of the home page must be active and visible.
    And It tests whether the left/right buttons on the Slider introducing Company Employees in the Body Section of the home page are active and visible.
    Then Closes the page

  Scenario: TC_18 There should be a Blog Post section in the Body Section of the home page and the blogs written should be visible with date and time information.
    And It tests that there is a Blog Post section in the Body Section of the home page.
    Then It tests whether the blogs written in the Blog Post section are visible with date and time information.
    Then  Closes the page

  Scenario: TC_19 The title 'I Love Being a Hero' and the 'Get Credit' button should appear in the Body Section of the home page and the 'Get Credit' button should be active.
    And Tests that the 'Like To Become A Hero' title is visible in the Body Section of the Home page
    Then Tests that the 'Take Loan' button is visible and active in the Body Section of the Home page.
    Then Closes the page