Feature:
  Background:
    *  kullanici verilen "adminUrl" gider
  Scenario:
    Given kullaniciya verilen "yusufkuzkayaUsername" ve "adminPassword" bilgileri ile admin sayfasina login olur.
    Then "Deposits" menusune gidilerek tiklanir.
    Then "Deposits" yazisinin gorunurlugu kontrol edilir.
    And "Pending Deposits" alanina Tiklanir. "Pending Deposits" yazisinin gorunurlugu kontrol edilir.
    And "Approved Deposits" aLanina tiklanir. "Approved Deposits" yazisinin Gorunurlugu kontrol edilir.
    And "Successfull Deposits" alanA tiklanir. "Successfull Deposits" yazisi gorunurlugu Kontrol eder.
    And "Rejected Deposits" alanina tiklanir. "Rejected Deposits" Yazisinin gorunurlugu kontrol edilir.
    And "İnitiated Deposits" Alanina tiklanir. "İnitiated Deposits" gorunur oldugu kontrol edilir.
    And "All Deposits" alanina tiklar. "All Deposits" gorunurlugu kont_rol Edilir.
    And Sayfa kapatilir.