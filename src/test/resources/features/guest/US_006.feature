Feature: Bir ziyaretci olarak şirkete ait sosyal medya hesaplarına kolay erişim için Anasayfada linklerinin olmasını istiyorum
  Background:
    * kullanici verilen "guestUrl" gider

    Scenario: kullanici acilan sayfada footer kismina iner ve bulunan youtube facebook ve x sosyal medya ikonlarinin gorunur ve aktif oldugunu dogrular

      Given kullanici anasayfada footer kismina iner
      Then youtube facebook ve x ikonlarinin gorunurlugunu dogrular
      And facebook ikonuna tiklar ve acilan sayfada facebook a yonlendirildigini dogrular
      And youtube ikonuna tiklar ve acilan sayfada youtube a yonlendirildigini dogrular
      And x ikonuna tiklar ve acilan sayfada x e yonlendirildigini dogrular
      Then sayfalari kapatir

      Scenario: kullanici acilan sayfada footer kismina iner ve bulunan linkedin ve instagram sosyal medya ikonlarinin gorunur ve aktif oldugunu dogrular
        Given kullanici anasayfada footer kismina iner
        Then linkedin ve instagram ikonlarinin gorunurlugunu dogrular
        And linkedin ikonuna tiklar ve acilan sayfada linkedin e yonlendirildigini dogrular
        And instagram ikonuna tiklar ve acilan sayfada instagram a yonlendirildigini dogrular
        Then sayfalari kapatir


