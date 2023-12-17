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
      And These credentials do not match our records yazisini gorup giris yapamadigini dogrular
      Then kullanici verilen "yanlisUsername" ve "userPassword" bilgileri ile userpage de login olur
      And These credentials do not match our records yazisini gorup giris yapamadigini dogrular
      Then kullanici verilen "erengokUsername" ve "yanlisSifre" bilgileri ile userpage de login olur
      And These credentials do not match our records yazisini gorup giris yapamadigini dogrular
      And sayfayi kapatir

      Scenario:Kullanici login sayfasinda bulunan register now linkine gider ve linkin kendisini register now sayfasina yonlendirdigini dogrular

        Then kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
        And login sayfasinda bulunan register now linkinin gorunur oldugunu dogrular ve linke tiklar
        Then acilan sayfanin register now sayfasi oldugunu dogrular
        And sayfayi kapatir

        Scenario:

          Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
          Then forgot password linkinin gorunur oldugunu dogrular ve linke tiklar
          And verify email sayfasina gectigini dogrular
          Then textBox'a Username email adresi girer ve submit butonuna tiklar
          Then Submit butonu tiklandiginda Password reset email sent successfully yazisini gordugunu test eder
          And sayfayi kapatir

          Scenario:
            Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
            Then forgot password linkinin gorunur oldugunu dogrular ve linke tiklar
            And textBox'a Username email adresi girer ve submit butonuna tiklar
            Then Try to send again link elementi tiklandiginda  user password reset sayfasina yonlendirildigini dogrular
            And sayfayi kapatir
