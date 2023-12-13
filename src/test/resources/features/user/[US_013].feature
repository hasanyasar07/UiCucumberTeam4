Feature: Kayıtlı bir kullanıcı(User) olarak kendime ait panele login olabilmek için anasayfadan login sayfasına eişimin olmasını istiyorum.

  Background:
    * kullanici verilen "guestUrl" gider

  Scenario:Kullanici guestUrl den login sayfasina gecis yaparak gerekli link ve login formunun gorunur ve aktif oldugunu dogruladiktan sonra basarili bir sekilde giris yapar

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then acilan login sayfasinda login formunun gorunur oldugunu test eder
    And login formunun icerisindeki Username textbox,Password textbox,Remember Me checkbox,Forgot password? link elementi,Login Butonlarinin gorunur oldugunu test eder
    Then Remember Me checkbox a tiklar
    Then kullanici verilen "erengokUsername" ve "userPassword" bilgileri ile userpage de login olur
    And basarili bir sekilde user olarak login oldugunu dogrular
    And sayfayi kapatir

    Scenario:Kullanici yanlis bilgilerle login olmaya calisir ve basarili giris yapamadigini dogrular

      Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
      Then kullanici verilen "yanlisUsername" ve "yanlisSifre" bilgileri ile userpage de login olur
      And giris yapamadigini dogrular
      Then kullanici verilen "yanlisUsername" ve "userPassword" bilgileri ile userpage de login olur
      And giris yapamadigini dogrular
      Then kullanici verilen "erengokUsername" ve "yanlisSifre" bilgileri ile userpage de login olur
      And giris yapamadigini dogrular
      And sayfayi kapatir

      Scenario: