Feature: US_21 As a User, I must be able to access the Home Page
  Background:
             *  user goes to homepage with "guestUrl"

  Scenario: TC_01 Verifies that the opened page is the home page
  Given Verifies that the opened page is the home page
  Then Closes the page


  Scenario: TC_02 Tests that e-mail, phone and address information appear on the top bar of the home page.
  Given Tests that e-mail, phone and address information appear on the top bar of the home page.
  Then Closes the page


  Scenario: TC_03 It tests whether the site logo and menu titles are visible and active on the home page top bar.
  Given It tests whether the site logo and menu titles (Home Page, About, Plans, Blogs, Contact, Login Icon, Getting Started Icon) are visible and active on the home page top bar.
  Then Closes the page


  Scenario: TC_04 Test to reach the home page when you click on the logo in the top bar of the home page
  Given It tests whether you can go to the home page when you click on the logo on the top bar of the home page.
  Then Closes the page

  @tst
  Scenario: TC_05  When you click on the headings in the top bar of the home page, you can test the accessibility of the relevant page.
  Given It tests whether you can switch to the relevant page when you click on the headings (Home Page, About, Plans, Blogs, Contact, Login Icon, Getting Started Icon) on the home page top bar.
  Then Closes the page
