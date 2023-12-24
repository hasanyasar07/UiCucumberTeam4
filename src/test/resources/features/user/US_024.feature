Feature: Bir kullanıcı (User )olarak dashboard yaptıgım ödemeleri,para çekme işlemlerini ve toplam kredilerimi görüp yönetebilmeliyim
  Background:
    * kullanici verilen "guestUrl" gider

  Scenario:dashboard (Successful Deposits,Successful Withdrawals,Total Loan) başlıkları görünür olmalı.
    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "guluzarataalpUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then dashboard sayfasinda successful deposits successful withdrawals total Loan baslıkları gorunur oldugunu test eder
    And sayfayi kapatir


  Scenario: dashboard sayfasinda toplam tutar,Submitted,Pending,Rejected edilen tutarlar ve kredi adetlerinin  gorunur oldugunu test eder
    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "guluzarataalpUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then dashboard sayfasinda toplam tutar submitted pending rejected edilen tutarlar ve kredi adetlerinin gorunur oldugunu test eder
    Then dashboard sayfasinda "Loan Number" sutunundaki toplam tutar submitted pending rejected edilen tutarlar ve kredi adetlerinin gorunur oldugunu test eder
    And sayfayi kapatir