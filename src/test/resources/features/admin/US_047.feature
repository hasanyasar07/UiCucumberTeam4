Feature: As an administrator, I want to be able to prevent a user I choose from accessing the site

  @TC_01
  Scenario: As an administrator you should be able to select the desired user from the list of users  search box in the list
  and access the 'Detail' information

    * kullanici verilen "adminUrl" gider
    * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    * Manage Users is clicked
    * Active user clicked
    * The active user to search for is filtered
    * The filtered active user's information is verified
    * The browser closes

    @TC_02
    Scenario: The 'Ban User' button must be visible and active for the administrator to block the selected user from accessing the site
      * kullanici verilen "adminUrl" gider
      * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      * Manage Users is clicked
      * Active user clicked
      * The active user to search for is filtered
      * The filtered active user's block must be visible and active
      * The browser closes

     @TC_03
     Scenario: When access blocking is confirmed, the user should be prevented from logging into the site.
       * kullanici verilen "adminUrl" gider
       * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
       * Manage Users is clicked
       * Active user clicked
       * The active user to search for is filtered
       * User is Blocked
       * The reason for blocking is entered and the OK button is pressed
       * The browser closes

     @TC_04
     Scenario: The user's access status to the site (blocked or unblocked) should be clearly displayed.
     Access status must be stated in the user list or profile details.

       * kullanici verilen "adminUrl" gider
       * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
       * Manage Users is clicked
       * Banned Users is clicked
       * Filtering is done and the details of the blocked user are accessed
       * The user's access status to the site is clearly displayed
       * The browser closes






