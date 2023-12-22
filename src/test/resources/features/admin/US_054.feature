
  Feature: Bir yonetici (admin) tarafindan reddedilen deposit islemlerini goruntuleyebilmek icin Rejected Deposit sayfasi bulunmalidir
    Background:
      When kullanici verilen "adminUrl" gider
      And kullanici verilen "tugbaasciUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

    Scenario: TC_017 Deposits menu basligi altindaki Rejected Deposits sayfa linkine tiklandiginda admin/deposit/rejected sayfasina erisilmelidir
      When admin Deposits linkine tiklar
      Then admin Rejected Deposits linkine tiklar
      Given admin mevcut sayfa uzantisinin "admin/deposit/rejected" oldugunu dogrular
      Then admin sayfayi kapatir

    Scenario: TC_018 Sayfada Rejected Deposits listesi görüntülenmeli,listede 'Gateway,Initiated,'User','Amount','Conversion','Status','Action' basliklari ve altindaki bilgiler gorunur olmalidir
      When admin Deposits linkine tiklar
      Then admin Rejected Deposits linkine tiklar
      Given admin Deposits listesinin goruntulenebilir oldugunu dogrular
      And admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular
      Then admin sayfayi kapatir

    Scenario: TC_019 Rejected olan depositin detayina ulasmak icin Details buton gorunur ve aktif olmalidir
      When admin Deposits linkine tiklar
      Then admin Rejected Deposits linkine tiklar
      And admin Details butonun gorunur ve aktif oldugunu dogrular
      Then admin sayfayi kapatir

    Scenario: TC_020 Listeden secilen reddedilen para cekme isleminin detay sayfasinda 'Date,Trx Number,Username,Method,Amount,Charge,After Charge,Rate,Payable,Status,Admin Response' bilgileri goruntulenmelidir
      When admin Deposits linkine tiklar
      Then admin Rejected Deposits linkine tiklar
      And admin Details butonuna tiklar
      Then Details sayfasindaki bilgilerin goruntulendigi dogrulanir
      Then admin sayfayi kapatir