Feature:Bir yonetici (admin) olarak kullanici kredi islemlerini yonetebilecegim
  sayfalara erismek icin admin panel uzerinde krediler menusunun olmasini istiyorum.
  Background:
    * kullanici verilen "adminUrl" gider

    Scenario: Kullanici admin olarak kredi islemlerini yönetme

    Given kullaniciya verilen "yusufkuzkayaUsername" ve "adminPassword" bilgileri ile admin sayfasina login olur.
    Then Admin ekraninda "Loans" yazisinin gorunurlugu kontrol edilir.
    Given "Loans" menusune tiklanir.
    Then Pending Loans gorunurlugu kontrol edilir.
    Then Paid Loans gorunurlugu kontrol edilir.
    Then Rejected Loans gorunurlugu kontrol edilir.
    Given Pending Loans tiklanir.
    Then Pending Loans sayfasinda "Pending Loans" yazisinin gorunurlugu kontrol edilir.
    Given Running Loans tiklanir.
    Then Running Loans sayfasinda"Running Loans" yazisinin gorunurlugu kontrol edilir.
    And Due Loans tiklanir.Due Loans sayfasinda "Due Loans" yazisinin gorunurlugu kontrol edilir.
    Given Paid Loans tiklanir.
    Then Paid Loans sayfasinda "Paid Loans" yazisinin gorunurlugu kontrol edilir.
    Given Rejected Loans tiklanir.
    Then Rejected Loans sayfasinda "Rejected Loans" yazisinin gorunurlugu kontrol edilir.