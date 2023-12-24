Feature: Kayıtlı bir kullanıcı(User) olarak siteden güvenli bir şekilde çıkış yapabilmek istiyorum

Background:
* kullanici verilen "userUrl" gider

Scenario: Kullanıcı olarak siteye giris yapar ve güvenli sekilde çikis yapar.

  Given kullaniciya verilen "yusufkuzkayaUsername" ve "userPassword" bilgileri ile user sayfasinda login olur
  And User Dashboard ekraninda "Logout" yazisinin gorunurlugu kontrol edilir.
  Then "Logout" alanina tiklanir.
  And "You have been logged out." yazisinin ciktigi kontrol edilir.
  And Anasayfada "Login" yazisi gorunur olmasi halinde anasayfada oldugunun kontrolu yapilir