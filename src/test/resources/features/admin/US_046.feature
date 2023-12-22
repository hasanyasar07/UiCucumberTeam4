Feature: As an administrator, I want to have a page where I can manage the withdrawals methods that will be offered to users.

  @TC_01
  Scenario: To list withdrawal methods, the administrator must have the 'Withdrawal Methods' link visible and accessible on the admin dashboard page. The list that opens on the page should contain
  basic information such as Method, Currency, Charge, Withdraw Limit, Status, Action.

    * kullanici verilen "adminUrl" gider
    * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    * Withdrawals is clicked
    * Withdrawal Methods is clicked
    * Basic information should be displayed on the Withdrawal Methods page
    * The browser closes


   @TC_02
   Scenario: The 'Add New' button must be visible and active before the administrator can add a new capture method. The withdrawal method name, currency, rate, min-max amount, Range, Charge,
   Withdraw Instruction, User Data information to be added must be determined.

     * kullanici verilen "adminUrl" gider
     * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
     * Withdrawals is clicked
     * Withdrawal Methods is clicked
     * Add New Button must be visible and active
     * Add New Button is clicked
     * The withdrawal method name currency rate min max amount Range Charge Withdraw Instruction User Data information to be added must be determined.
     * Click on the Submit button
     * The browser closes


  @TC_03
  Scenario: The added capture method should be viewable in the List.
       * kullanici verilen "adminUrl" gider
       * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
       * Withdrawals is clicked
       * Withdrawal Methods is clicked
       * The method to be searched is searched by typing it in the search button.
       * Detailed information of the filtered method is verified
       * The browser closes


  @TC_04
  Scenario: The administrator must be able to update the information of available withdrawal methods.
       It should be checked whether the updated information is valid.
         * kullanici verilen "adminUrl" gider
         * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
         * Withdrawals is clicked
         * Withdrawal Methods is clicked
         * The method to be searched is written
         * To edit the current shooting method, click the Edit button
         * Necessary adjustments are made
         * It is checked whether the updated information is valid or not
         * The browser closes


  @TC_05
  Scenario: The administrator must be able to disable a withdrawal method. Deactivation must be confirmed with the confirmation scree
    * kullanici verilen "adminUrl" gider
    * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    * Withdrawals is clicked
    * Withdrawal Methods is clicked
    * The shooting method to be disabled is filtered
    * Deactivation must be verified with confirmation
    * The browser closes























