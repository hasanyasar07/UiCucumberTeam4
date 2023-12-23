
Feature: Bir yonetici (admin) olarak bekleyen deposit isteklerini yonetebilmek icin Pending Deposit sayfasinin olmasini istiyorum



  Scenario: TC_001 Pending Deposits e tiklayarak Deposits menu basligi altindaki admin/deposit/pending sayfalarina ulasmalidir
    When kullanici verilen "adminUrl" gider
    And kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

    Given admin Deposits linkine tiklar
    Then admin Pending Deposits linkine tiklar
    And admin mevcut sayfa uzantisinin "admin/deposit/pending" oldugunu dogrular
    Then admin sayfayi kapatir

    Scenario: TC_002 Sayfada Pending Deposits listesi görüntülenmeli,listede başlıkları 'kullanıcı adı,miktar,başlatılma tarihi' gibi temel bilgiler içermelidir.
      When kullanici verilen "adminUrl" gider
      And kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

      Given admin Deposits linkine tiklar
      Then admin Pending Deposits linkine tiklar
      And admin Deposits listesinin goruntulenebilir oldugunu dogrular

      Scenario: TC_003 Kullanicinin Deposit request isteklerine ulasmak
      ve kabul/red islemlerine ulasmak icin Details butonu gorunebilir
      ve aktif olmalidir

        When kullanici verilen "adminUrl" gider
        And kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
        Given admin Deposits linkine tiklar
        Then admin Pending Deposits linkine tiklar
        And admin Details butonun gorunur ve aktif oldugunu dogrular
        And admin sayfayi kapatir

        Scenario: TC_004 Deposits page details butonu tiklandiginda,approve/reject butonlari gorunur ve aktif olmali
                         Approve/Reject gerceklesirse sayfada uyari mesaji gorulmeli
                         Sayfadan silindigi Pending Deposits list sayfasinda gorulmeli
         Given kullanici verilen "userUrl" gider
         And kullanici verilen "rumeysaaslanUsername" ve "userPassword" bilgileri ile userpage de login olur
         Then kullanici deposit linkine tiklar ve odeme seklini secer
         And kullanici miktari 2000 girer ve submit tusuna basar


          When kullanici verilen "adminUrl" gider
          And 3 saniye bekler
          And kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur

          Given admin Deposits linkine tiklar
          Then admin Pending Deposits linkine tiklar
          Then admin secilen kullanicinin details butonuna tiklar
          Then admin approve reject butonlarinin gorunur ve aktif oldugunu dogrular
          And admin approve  butonuna tiklar ve cikan uyari sayfasindan yes butonuna basar
          Then admin approve yaptiktan sonra cikan alert yazisini goruntulendigini dogrular
          Then cikan kutu kapatilir
          And  sayfayi kapatir






