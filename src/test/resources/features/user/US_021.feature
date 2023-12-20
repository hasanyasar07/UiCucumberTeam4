Feature: US_21 As a User, I must be able to access the Home Page
  Background:
             *  user goes to homepage with "userUrl"

  Scenario: TC_01 Test reached at “https://qa.loantechexper.com/user”
    Given It tests that the opened page is “https://qa.loantechexper.com/user”
    And Closes the page

  Scenario: TC_02
    Given Tests that email, phone and address information are visible on the top bar of the home page.
    And Closes the page

  Scenario: TC_03
    Given It tests whether the site logo and menu titles (Home, About, Plans, Blogs, Contact, Login Icon, Get Started Icon) are visible and active on the home page top bar.
    And Closes the page

  Scenario: TC_04
    Given It tests whether you can go to the home page when you click on the logo on the top bar of the home page.
    And Closes the page

  Scenario: TC_05
    Given It tests whether you can switch to the relevant page when you click on the headings (Home, About, Plans, Blogs, Contact, Login Icon, Get Started Icon) at the top of the home page.
    And Closes the page
