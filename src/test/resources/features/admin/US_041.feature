Feature:Bir yonetici (admin) olarak aktif kullanıcıların Transactions bilgilerini görebilmek istiyorum
  Scenario:  admin page de verilen bilgiler ile login olunur
    * kullanici verilen "adminUrl" gider
    * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur


    Given acilan login sayfasinda manage users butonunu tılanır
    Then active users butonun linklerinin gorunur oldugunu ve aktif oldugu dogrulanır
    Then active users butonuna tiklandiginda "User" sutunundaki active users listesi ve basliklarinin gorunur oldugunu test eder
    And sayfayi kapatir

    Scenario: details butonu görünür ve aktif oldugu dogrulanir ve tiklandiginda  User Detail - Username sayfasına gittigi dogrulanir
      * kullanici verilen "adminUrl" gider
      * kullanici verilen "guluzarataalpUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
      Given acilan login sayfasinda manage users butonunu tılanır
      Then active users butonun linklerinin gorunur oldugunu ve aktif oldugu dogrulanır
      Then details butonun gorunur ve aktif oldugu dogrulanır
      And user Detail sayfasina yonlendirildigi dogrulanir
      And transactions butonuna tiklanir
      Then filtreleme içeriğindeki alanlar işlevsel ve aktif olmalıdır.
      And sayfayi kapatir
