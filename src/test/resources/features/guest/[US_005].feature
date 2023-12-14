Feature: Bir ziyaretci olarak şirket hakkında daha çok bilgiye sahip olmak için sitede About sayfasının olmasini istiyorum.
  Background:
    * kullanici verilen "guestUrl" gider

  Scenario:
    Given kullanici anasayfada about sekmesinin gorunur oldugunu dogrular ve about sekmesine tiklar
    Then about sekmesine tikladiktan sonra kendinin about sayfasina yonlendirildigini dogrular
    And sayfayi kapatir

    Scenario:
      Given kullanici anasayfada footer kismindaki about linkinin oldugunu dogrular ve linke tiklar
      Then gittigi sayfada Fulfilling Financial Dreams basliginin gorunur oldugunu dogrular
      Then ayni sayfadaki Home | About ikonlarinin gorunur oldugunu dogrular
      And aktif oldugunu dogrulamak icin About ikonuna tiklar
      And aktif oldugunu dogrulamak icin Home ikonuna tiklar
      Then anasayfaya dondugunu dogrular
      And sayfayi kapatir