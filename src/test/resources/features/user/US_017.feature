

Feature: US_017 As a registered user, I would like to have a page to manage my payment transactions.

  Background:
    * kullanici verilen "userUrl" gider

  Scenario: TC_01 There should be a "Withdraw" button on the Dashboard page to manage withdrawal transactions..

    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Click on the Withdraw button.
    And sayfayi kapatir

  Scenario: TC_02 When the Withdraw button is clicked, it should redirect to the "Withdraw Money" page.

    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Click on the Withdraw button.
    Then The viewability of the Withdrawal page is tested.
    And sayfayi kapatir

  Scenario: TC_03 Method dropdown menuden method name seçilmelidir.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then It is tested whether the method name can be selected from the method dropdown menu.
    And sayfayi kapatir

  Scenario: TC_04 A value between 300.00 USD - 8000.00 USD should be entered in the Amount textbox.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then The method name is selected from the Method drop-down menu.
    Then It is tested that a value between three hundred and eight thousand USD can be entered in the Amount text box.
    And sayfayi kapatir


  Scenario: TC_05 SWhen the Submit button is clicked, the text "Withdraw Via Method 5 Updatedé" should be displayed.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then The method name is selected from the Method drop-down menu.
    Then A value between three hundred and eight thousand USD is entered in the Amount textbox.
    Then The Submit button is clicked and the Withdraw Via Method Update text is displayed.
    And sayfayi kapatir

  Scenario: TC_06 The Submit button should be clickable and the text "Withdraw request sent successfully" should be displayed.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then The method name is selected from the Method drop-down menu.
    Then A value between three hundred and eight thousand USD is entered in the Amount textbox.
    Then It is tested that the submit button is clickable.
    Then The viewability of the Withdraw request sent successfully text is tested..
    And sayfayi kapatir

  Scenario: TC_07 The withdrawal made on the Withdraw History page must be visible in the accordion table.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then you click on the Withdraw Log button, you will be transferred to the Withdraw page.
    Then It is tested that the withdrawal made on the Withdraw History page is visible in the accordion table.
    And sayfayi kapatir


  Scenario: TC_08 Charge-After Charge-Conversion-Status values should be displayed in a selected withdrawal transaction in the accordion table.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then you click on the Withdraw Log button, you will be transferred to the Withdraw page.
    Then The withdrawal made on the Withdraw History page is recorded as a withdrawal in the accordion table.
    Then Charge-After Charge-Conversion-Status values ​​should be displayed.
    And sayfayi kapatir

  Scenario: TC_09 When you click on the "Withdraw Money" button on the Withdraw History page, you should go to the "Withdraw Money" page.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then when you click on the Withdraw Log button, you will be transferred to the Withdraw page.
    Then when you click on the Withdraw History button, it is tested that you go to the Withdraw Log page.
    And sayfayi kapatir

  Scenario: TC_10 When you click on the "Withdraw Log" button on the "Withdraw Money" page, you should go to the Withdraw History page.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then The Withdraw button is clicked and the Withdraw Money page is displayed.
    Then you click on the "Withdraw Log" button, it is tested that you go to the Withdraw History page.
    And sayfayi kapatir


