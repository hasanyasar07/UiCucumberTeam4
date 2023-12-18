
Feature:Bir yonetici (admin)  tum kullanıcılara bildirim gonderebilmeli
  Background:
    When kullanici verilen "adminUrl" gider
    And kullanici verilen "tugbaasciUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

  Scenario: TC_01 Kayitli admin olarak basarili bir sekilde giris yapar
    And admin basarili bir sekilde giris yaptigini "tugbaasci" dogrular
    Then admin sayfayi kapatir

  Scenario: TC_02 Yonetici dashboardda  Notification to All Linki goruntuler
    When admin manage users linkine tiklar
    And admin notification to all linkine tiklar
    Then notification to all linkinin goruntulendigi dogrulanir
    Then admin sayfayi kapatir

  Scenario: TC_03 Yonetici dashboardda  Notification to All Linki aktif oldugu dogrulanir
    When admin manage users linkine tiklar
    Then admin notification to all linkine tiklar
    And notification to all linkinin aktif oldugu dogrulanir
    Then admin sayfayi kapatir

  Scenario: TC_04 admin/users/send-notification sayfasinda 'Being Sent' basligi altinda filtreleme ikonu bulunur
    Given admin manage users linkine tiklar
    Then admin notification to all linkine tiklar
    When admin "admin/users/send-notification" sayfasinda "Being Sent" basligi oldugunu dogrular
    Then admin sayfayi kapatir

  Scenario: TC_05 Yonetici tum kullanicilara konu basligi mesaj iceren belirli baslama tarihi ve period belirleyip mesaj gonderir
    Given admin manage users linkine tiklar
    When admin notification to all linkine tiklar
    And Notification sayfasinda "All Users" secer
    Then baslik "important" yazar
    When mesaj "onemli duyuru" yazar
    Then start form alanina 20 degeri girer
    Given per batch alanina 20 degeri girer
    And cooling period alanina 2 degeri girer
    Then notification sayfasinda submit butonuna basar
    Then admin sayfayi kapatir

  Scenario: TC_06 Yonetici secebileceği kullanicilara konu basligi mesaj iceren belirli baslama tarihi period belirleyip mesaj gonderir
    Given admin manage users linkine tiklar
    Then admin notification to all linkine tiklar
    When Notification sayfasinda "Selected Users" secer
    Then Userlardan "velobi3310@arsus.com" secilir
    Then baslik "important" yazar
    When mesaj "onemli duyuru" yazar
    Given per batch alanina 3 degeri girer
    Then cooling period alanina 2 degeri girer
    Then notification sayfasinda submit butonuna basar
    Then admin sayfayi kapatir

  Scenario: TC_07 Admin basarili bir gonderme isleminden sonra uyari mesaji alir
    When admin manage users linkine tiklar
    Then admin notification to all linkine tiklar
    When Notification sayfasinda "Selected Users" secer
    Then Userlardan "velobi3310@arensus.com" secilir
    Then baslik "important" yazar
    When mesaj "onemli duyuru" yazar
    Given per batch alanina 3 degeri girer
    Then cooling period alanina 2 degeri girer
    Then notification sayfasinda submit butonuna basar
    When basarili bir sekilde mesajini gonderdigini dogrular ve kutuyu kapatir
    And admin sayfayi kapatir

  Scenario: TC_08 Admin sayfada doldurulmasi gereken alanlari bos biraktiginda hata mesaji alir
    When admin manage users linkine tiklar
    Then admin notification to all linkine tiklar
    And Notification sayfasinda "Selected Users" secer
    Then Userlardan "velobi3310@arensus.com" secilir
    When notification sayfasinda submit butonuna basar
    And baslik kisminda doldurulmasi gereken bosluklar doldurulmadiginda uyari yazisi cikar


