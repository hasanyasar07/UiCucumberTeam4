
Feature: Bir yonetici (admin) kullanici tarafindan baslatilan ama tamamlanmamis deposit isteklerini goruntuleyebilmek icin Initiated Deposit sayfasini goruntuleyebilmelidir
  Background:
    When kullanici verilen "adminUrl" gider
    And kullanici verilen "tugbaasciUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

  Scenario: TC_021 Deposits menu basligi altindaki "Initiated Deposits" sayfa linkine tiklandiginda admin/deposit/initiated sayfasina erisilmelidir
    When admin Deposits linkine tiklar
    Given Initiated Deposits linkine tiklar
    Then admin mevcut sayfa uzantisinin "admin/deposit/initiated" oldugunu dogrular
    Then admin sayfayi kapatir

  Scenario: TC_022 Sayfada Initiated Deposits listesi görüntülenmeli,listede 'Gateway,Initiated,'User','Amount','Conversion','Status','Action' başlıkları ve altindaki bilgiler gorunur olmalidir
    When admin Deposits linkine tiklar
    Then Initiated Deposits linkine tiklar
    Then admin Deposits listesinin goruntulenebilir oldugunu dogrular
    Then admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular
    And admin sayfayi kapatir

  Scenario: TC_023 Rejected olan depositin detayina ulasmak için Details buton gorunur ve aktif olmalidir
    When admin Deposits linkine tiklar
    Then Initiated Deposits linkine tiklar
    Then admin Details butonun gorunur ve aktif oldugunu dogrular
    And admin sayfayi kapatir

  Scenario: TC_024 Listeden secilen tamamlanmayan para cekme isleminin detay sayfasinda 'Date,Trx Number,Username,Method,Amount,Charge,After Charge,Rate,Payable,Status' bilgileri goruntulenmelidir
    When admin Deposits linkine tiklar
    Then Initiated Deposits linkine tiklar
    When admin Details butonuna tiklar
    Then Details sayfasindaki bilgilerin goruntulendigi dogrulanir
    And admin sayfayi kapatir