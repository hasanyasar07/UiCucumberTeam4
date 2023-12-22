Feature: I want a page where I, as an admin, can create categories and manage all categories

  @TC_01
  Scenario: The link to the Categories page on the Dashboard page must be visible and active.

    * kullanici verilen "adminUrl" gider
    * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    * The categories link must be visible and active
    * The browser closes

  @TC_02
  Scenario: On the Categories page, the admin must be able to create a new credit request. The created credit request must be created

      * kullanici verilen "adminUrl" gider
      * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      * click on the category menu
      * To add a new category, information is entered and the submit button is clicked.
      * New category added text appears.
      * The browser closes


  @TC_03
  Scenario: You must be able to access the credit plan correctly in the search box on the Categories page.

        * kullanici verilen "adminUrl" gider
        * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
        * click on the category menu
        * On the page that opens, enter the credit plan to be searched and click on the search button.
        * Verify that the loan scheme sought is listed
         * The browser closes


  @TC_04
  Scenario: Must be able to apply the disable, enable filter in the list of the saved credit plan.

        * kullanici verilen "adminUrl" gider
        * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
        * click on the category menu
        * Set the situation in the action section
        * Click Yes
        * action status changed successfully
        * The browser closes

  @TC_05
  Scenario: I should be able to rearrange the saved credit plan.

    * kullanici verilen "adminUrl" gider
    * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    * click on the category menu
    * Edit button must be clicked
    * Necessary changes are made
    * Click the submit button to complete the editing process.
    * The editing process should be confirmed with the message Successful
    * The browser closes











