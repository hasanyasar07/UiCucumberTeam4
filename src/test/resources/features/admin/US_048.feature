Feature:Bir yönetici (admin) engellenen kullanıcıları görmek ve istediğimde engelini kaldırabilmek istiyorum
  Scenario:  admin page de verilen bilgiler ile login olunur
    * kullanici verilen "adminUrl" gider
    * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    Given acilan login sayfasinda manage users butonunu tılanır
    Then yonetici olarak banned users buton Link Gorunur ve aktif olmali,tiklandiginda banned users sayfasına yonlendirildigi dogrulanmalıdır
    Then banned users butonuna tiklandiginda "istenenBaslik" sutunundaki banned users listesi ve basliklarinin gorunur oldugunu test eder
    And sayfayi kapatir

Scenario: yonetici olarak engellenen kullanicilari search box'dan  secebilmeli ve detail bilgilerine erisebildigini dogrulanmalıdır
  * kullanici verilen "adminUrl" gider
  * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
  Given acilan login sayfasinda manage users butonunu tılanır
  Then yonetici olarak banned users buton Link Gorunur ve aktif olmali,tiklandiginda banned users sayfasına yonlendirildigi dogrulanmalıdır
  Then search box'dan istenen kullanıcıyı seçebilmeli ve detail bilgilerine erisebildigini test eder
  And sayfayi kapatir

  Scenario:  engelli kullanıcının site erisim engelini kaldırmak için Unban User butonu gorunur ve aktif oldugunu dogrular
    * kullanici verilen "adminUrl" gider
    * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    Given acilan login sayfasinda manage users butonunu tılanır
    Then yonetici olarak banned users buton Link Gorunur ve aktif olmali,tiklandiginda banned users sayfasına yonlendirildigi dogrulanmalıdır
    Then search box'dan istenen kullanıcıyı seçebilmeli ve detail bilgilerine erisebildigini test eder
    Then  Unban User butonu gorunur ve aktif oldugunu dogrular
    And sayfayi kapatir

    Scenario: Kullanıcının erisim durumu aktive users listesinde ve profil detaylarinda dorulanmalıdır
      * kullanici verilen "adminUrl" gider
      * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      Given acilan login sayfasinda manage users butonunu tılanır
      Then yonetici olarak banned users buton Link Gorunur ve aktif olmali,tiklandiginda banned users sayfasına yonlendirildigi dogrulanmalıdır
      Then search box'dan istenen kullanıcıyı seçebilmeli ve detail bilgilerine erisebildigini test eder
      Then  Unban User butonu gorunur ve aktif oldugunu dogrular
      Then active users sayfasinda search box'a  kullanıcıyı aratip ve detail bilgilerine erisebildigini test eder
      And sayfayi kapatir