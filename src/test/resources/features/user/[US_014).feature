
Feature: US_014 As a registered user, I want to be able to access and update my profile information.

  Background:
    * kullanici verilen "userUrl" gider

  Scenario: TC_01 After logging in to the site as a user, profile information should be visible and edited on the user dashboard page.

    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Clicks on the button and profile link where he can see his profile.
    Then It edits the state, address and city fields.
    And sayfayi kapatir

  Scenario: TC_02 Card custom--card information (profile-image-username-e-mail-phone-Country) should be displayed on the "Profile Setting" page.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Clicks on the button and profile link where he can see his profile.
    And sayfayi kapatir

  Scenario: TC_03 Mandatory profile card information should be visible and editable.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Clicks on the button and profile link where he can see his profile.
    Then He takes the profile card and tests what he can see.
    Then It tests whether it can change the profile card.
    And sayfayi kapatir

  Scenario: TC_04 When the choose file button is clicked in the image section, the image should be selected and uploaded.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Clicks on the button and profile link where he can see his profile.
    Then Clicks the choose file button in the image section.
    Then It tests whether you can upload photos to the image section.
    And sayfayi kapatir


  Scenario: TC_05 No characters other than digits should be entered into the Zip code text box. When entered, a warning message should be displayed.
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Clicks on the button and profile link where he can see his profile.
    Then Digit characters are entered into the zip code text box.
    And sayfayi kapatir

  Scenario: TC_06 When the Submit button is clicked, it should be displayed that the update process has been completed successfully ('Profile Updated Successfully' text).
    Given kullanici verilen url e gittikten sonra login login butonuna tiklar.
    Then kullanici verilen "selimebeyzaUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then Clicks on the button and profile link where he can see his profile.
    Then It edits the state, address and city fields.
    Then Click on the submit button.
    Then It is tested that the Profile Updated Succsessfuly text is displayed.
    And sayfayi kapatir














