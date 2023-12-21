Feature:Bir yönetici (admin) olarak profil bilgilerime erişip güncelleyebilmek istiyorum.
  Scenario:  admin page de verilen bilgiler ile login olunur
    * kullanici verilen "adminUrl" gider
    * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    Given acilan login sayfasinda admin ikonu gorunur oldugunu test eder ve admin ikonuna tiklar
    Then admin ikonuna tiklaninca acilan dropdown menüde Profile Password Logout linklerinin gorunur oldugunu test eder
    Then profil linkine tiklanir
    And aCılan sayfada name  email text boxları ve fotoğraf gUncellenip aktif oldugu dogrulanir
    And sayfayi kapatir

    Scenario: Password linkine tiklaninca ilgili sayfaya yonlendirildigi doğrulanmalı ve sifre guncellendigi dogrulanabilmeli
      * kullanici verilen "adminUrl" gider
      * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      Given acilan login sayfasinda admin ikonu gorunur oldugunu test eder ve admin ikonuna tiklar
      Then password linkine tiklanir ve password sayfasinin acldigi dogrulanmali
      And acilan sayfada ilgili alanlar doldurularak sifre guncellenir
      And sayfayi kapatir

      Scenario: Logout linkine tıklayarak sayfadan başaralı bir şekilde ayrıldığı doğrulanabilmeli
        * kullanici verilen "adminUrl" gider
        * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
        Given acilan login sayfasinda admin ikonu gorunur oldugunu test eder ve admin ikonuna tiklar
        Then Logout linkine tıklayarak sayfadan basaralı bir sekilde ayrıldıgı dogrulanabilmeli
        And sayfayi kapatir
