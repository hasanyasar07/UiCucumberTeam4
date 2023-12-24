@smokeTest
Feature: Negative and positive login test

  Background:
    * kullanici verilen "guestUrl" gider

  Scenario: Positive login test

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then acilan login sayfasinda login formunun gorunur oldugunu test eder
    And login formunun icerisindeki Username textbox,Password textbox,Remember Me checkbox,Forgot password? link elementi,Login Butonlarinin gorunur oldugunu test eder
    Then Remember Me checkbox a tiklar
    Then kullanici verilen "erengokUsername" ve "userPassword" bilgileri ile userpage de login olur
    And basarili bir sekilde user olarak login oldugunu dogrular
    And sayfayi kapatir

  Scenario: Negative login test

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "yanlisUsername" ve "yanlisSifre" bilgileri ile userpage de login olur
    And These credentials do not match our records yazisini gorup giris yapamadigini dogrular
    Then kullanici verilen "yanlisUsername" ve "userPassword" bilgileri ile userpage de login olur
    And These credentials do not match our records yazisini gorup giris yapamadigini dogrular
    Then kullanici verilen "erengokUsername" ve "yanlisSifre" bilgileri ile userpage de login olur
    And These credentials do not match our records yazisini gorup giris yapamadigini dogrular
    And sayfayi kapatir
