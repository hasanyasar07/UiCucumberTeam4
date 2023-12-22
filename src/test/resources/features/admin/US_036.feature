Feature: As an administrator (Admin), I want to be able to access the Loan Plans page and manage loan plans transactions

  @TC01
  Scenario: The administrator should be able to access the loan plans page via the Loan Plans link.
  The admin/plans/loans page should list the available loan plans registered in the system.
  Each loan plan should be displayed with basic information such as title, interest rate, maturity period, loan limit.

    * kullanici verilen "adminUrl" gider
    * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    * Click on the loan plan link
    * On the admin-plans-loans page, list the available loan plans registered in the system.
    * Each loan plan is displayed with basic information such as title, interest rate, maturity period, loan limit, etc.
    * The browser closes

    @TC02
    Scenario: The administrator should be able to add a new credit plan.
    The attached loan plan must contain necessary information such as title, interest rate, maturity period, credit limit, etc.

      * kullanici verilen "adminUrl" gider
      * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      * Click on the loan plan link
      * Click Add New to add a new Plan
      * Necessary information is entered to add a new Plan
      * After the information is entered, the submit button is clicked
      * You will receive a warning that the new credit plan has been added successfully
      * The browser closes

    @TC_03
    Scenario: The manager must be able to update the information of existing credit plans.
      It should be checked whether the updated information is valid.

      * kullanici verilen "adminUrl" gider
      * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      * Click on the loan plan link
      * Edit button is clicked
      * Information to be updated is entered
      * After the information is entered, the submit button is clicked
      * The text "Plan Updated Successfully" appears
      * The browser closes


      @TC_04
        Scenario: The validity of added or updated credit plans should be checked. For example,
      checks that the interest rate is a positive value or that the maturity period is within a valid range

        * kullanici verilen "adminUrl" gider
        * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
        * Click on the loan plan link
        * Click Add New to add a new Plan
        * Negative information is entered
        * A "Plan Updated Unsuccessfully" record appears
        * The browser closes



      @TC_05
      Scenario: The administrator must be able to remove an existing credit plan from the system.

        * kullanici verilen "adminUrl" gider
        * kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
        * Click on the loan plan link
        * Takes the necessary action to remove the existing credit plan
        * Verifying that the credit plan has been removed
        * The browser closes





















