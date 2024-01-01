Feature: Bir Yönetici (Admin ) olarak sitede aktif kullanıcıları görüp,Balance işlemlerini yönetebileceğim bir sayfa olmasını istiyorum

  Background:
  When kullanici verilen "adminUrl" gider
  And kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
  Given admin Manage Users linkine tiklar
  Then admin Active Users linkine tiklar

  Scenario: TC_001 Dashboard sayfasında bulunan Nawbar'da 'Manage Users' linki altında 'Active Users' Linki görünür ve aktif olmalıdır



    And  admin active Users linkinin gorunur ve aktif oldugunu dogrular
    Then admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular
    Then sayfayi kapatir



    Scenario: TC_003 Listeden seçilen herhangi bir kullanıcıya ait bilgilere ulaşmak için 'Details' butonu görünür ve aktif olmalı
    ve tıklandığında 'User Detail - Username' sayfasına yönlendirmelidir





      And  admin Details butonun gorunur ve aktif oldugunu dogrular
      Then admin Active Users Details butonuna tiklar
      And sayfada User Detail Username gorulmelidir
      Then sayfayi kapatir

   Scenario: TC_004 User Detail sayfasında 'Balance' başlığı altında 'view all' ikonunu görünür ve aktif olmalıdır.İkona tıklandığında
      'Transaction Logs' sayfasına yönlendirmelidir.
      Açılan sayfada Liste ve liste başlıkları görüntülenebilmelidir.
      Liste içinde arama yapmak için fltreleme ikonları görünür ve aktif olmalıdır.




        Then admin Active Users Details butonuna tiklar
        And balance view all butonunun gorunur ve aktif oldugunu dogrular
        Then view all butonunu tiklar ve Transaction Logs sayfasi gorulur
        And Liste ve liste basliklari goruntulenebilmelidir
        And Filtre ikonu gorunur ve aktif oldugu dogrulanir
        Then sayfayi kapatir

   Scenario:TC_005 Active Users Sayfasında 'Add Balance' Butonu görünür ve aktif olmalıdır.Tıklandığında Add Balance sayfasına yönlendirmelidir
  Add Balance sayfasındaki Amount ve Remark text boxlar görüntülenebilmeli ve  girilebilmelidir.
    Sayfadaki 'Submit Buton' görünür ve aktif olmalıdır.Tıklandığında '$x added successfully' yazısı görüntülenebilmelidir.
     Then admin Active Users Details butonuna tiklar
     And Add Balance butonu gorunur ve aktif oldugunu dogrular
     Then Amount text box gorunur olmalidir
     And amount textbox a 1000 girin
     And Remark text box gorunur ve tiklanabilir  olmalidir
     And Remark text box a "Hello" yazsin
     And Amount Submit buttonu gorunur olmalidir ve tiklanir
     Then $x added succesfully yazisi goruntulenmelidir
     And sayfayi kapatir







