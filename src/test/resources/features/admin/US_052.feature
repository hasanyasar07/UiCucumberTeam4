
  Feature: Bir yonetici (admin) olarak admin tarafindan onaylanan deposit islemlerini icin Approved Deposit sayfasi olmalidir

    Background:
      When kullanici verilen "adminUrl" gider
      And kullanici verilen "tugbaasciUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

    Scenario: TC_09 Deposits menu basligi altindaki Approved Deposits sayfa linkine tiklandiginda admin/deposit/approved sayfasina erisilmelidir
      Then admin Deposits linkine tiklar
      When Approved Deposits linkine tiklar
      And admin mevcut sayfa uzantisinin "admin/deposit/approved" oldugunu dogrular
      Given admin sayfayi kapatir
@tugba
    Scenario: TC_10 Sayfada Approved Deposits listesi goruntulenmeli listede basliklar altindaki bilgiler gorunur olmalidir
      Then admin Deposits linkine tiklar
      When Approved Deposits linkine tiklar
      And admin Deposits listesinin goruntulenebilir oldugunu dogrular
      * admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular
      Then admin sayfayi kapatir

    Scenario: TC_11 Approved olan depositin detayina ulasmak icin Details buton gorunur ve aktif olmalidir
      Then admin Deposits linkine tiklar
      When Approved Deposits linkine tiklar
      And admin Details butonun gorunur ve aktif oldugunu dogrular
      And admin sayfayi kapatir

    Scenario: TC_12 Listeden secilen para cekme isleminin detay sayfasindaki bilgiler goruntulenmelidir
      Then admin Deposits linkine tiklar
      When Approved Deposits linkine tiklar
      And admin Details butonuna tiklar
      Then Details sayfasindaki bilgilerin goruntulendigi dogrulanir
      And admin sayfayi kapatir