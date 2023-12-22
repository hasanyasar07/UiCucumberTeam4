
  Feature: Bir yonetici (admin) basariyla gerceklesen deposit islemlerini goruntuleyebilmelidir
    Background:
      When kullanici verilen "adminUrl" gider
      And kullanici verilen "tugbaasciUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

    Scenario: TC_13 Deposits menu basligi altindaki Successful Deposits sayfa linkine tiklandiginda admin/deposit/successful sayfasina erisilmelidir
      When admin Deposits linkine tiklar
      Then admin Succesful Deposits linkine tiklar
      Given admin mevcut sayfa uzantisinin "admin/deposit/successful" oldugunu dogrular
      And admin sayfayi kapatir

    Scenario: TC_14 Sayfada Successful Deposits listesi goruntulenmeli,listedeki basliklar ve altindaki bilgiler gorunur olmalidir.
      When admin Deposits linkine tiklar
      Then admin Succesful Deposits linkine tiklar
      Given admin Deposits listesinin goruntulenebilir oldugunu dogrular
      Then admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular
      And admin sayfayi kapatir

    Scenario: TC_15 Succesful olan depositin detayina ulasmak icin Details buton gorunur ve aktif olmalidir
      When admin Deposits linkine tiklar
      Then admin Succesful Deposits linkine tiklar
      Given admin Details butonun gorunur ve aktif oldugunu dogrular
      And admin sayfayi kapatir

    Scenario: TC_16 Listeden secilen para cekme isleminin detay sayfasinda bilgiler goruntulenmelidir
      When admin Deposits linkine tiklar
      Then admin Succesful Deposits linkine tiklar
      Given admin Details butonuna tiklar
      Then Details sayfasindaki bilgilerin goruntulendigi dogrulanir
      And admin sayfayi kapatir
