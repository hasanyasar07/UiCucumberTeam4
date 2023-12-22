Feature: As an administrator, I want to have a list of users where I can see their balance amounts

  @TC_01
  Scenario: When you click on the withbalance link as an administrator, you should be able to access the Users with Balance list.

    *  kullanici verilen "adminUrl" gider
    *  kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    *  Manage Users is clicked
    *  With Balance is clicked
    *  Verifying that the list has been reached
    *  The browser closes


  @TC_02
  Scenario: As an administrator, the balance values of all users should be displayed in the balance users list

    *  kullanici verilen "adminUrl" gider
    *  kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    *  Manage Users is clicked
    *  With Balance is clicked
    *  In the balance users list, the balance values of all users are displayed
    *  The browser closes

  @TC_03
  Scenario: As an administrator, you should be able to select the desired user from the balance users list
  search box in the list and access the 'Detail' information.

    *  kullanici verilen "adminUrl" gider
    *  kullanici verilen "yasemintahtaliUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    *  Manage Users is clicked
    *  With Balance is clicked
    *  As an administrator, you should be able to select the desired user from the balance users list search box in the list
    *  Detailed information of the balance user listed should be accessible.
    *  The browser closes



