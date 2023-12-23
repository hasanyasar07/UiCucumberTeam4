Feature: Bir yonetici (admin) olarak kullanici Withdrawals islemlerini yonetebilmek icin admin panelde Withdrawals menusunun olmasini istiyorum.
@r
  Scenario: TC_001,TC
  Admin panel side bar uzerinde Withdrawals menu basligi goruntulenmelidir.
  Withdrawals menu basligi altinda Withdrawal Methods,  Pending Withdrawals,Approved Withdrawals,  Rejected Withdrawals, All withdrawals sayfa basliklari goruntulenmelidir.
  Withdrawals menu basligi altindaki sayfa basliklari ilgili sayfalara yonlendirme yapmalidir.

    Given kullanici verilen "adminUrl" gider
    Then kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    Then admin Withdrawal menu basligini goruntulenmelidir ve tiklamalidir
    And Withdrawals method linkini goruntulenmelidir ve aktif olmalidir
    And Pending Withdrawals method linkini goruntulenmelidir ve aktif olmalidir
    And Approved Withdrawals method linkini goruntulenmelidir ve aktif olmalidir
    And Rejected Withdrawals method linkini goruntulenmelidir ve aktif olmalidir
    And All Withdrawals method linkini goruntulenmelidir ve aktif olmalidir
    Then sayfayi kapatir