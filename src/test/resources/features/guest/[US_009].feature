Feature: Bir ziyaretci olarak  şirket ile iletişime geçebilmek için sitede, içerisinde iletişim bilgilerinin olduğu Contact sayfasının olmasını istiyorum
  Background:
    * kullanici verilen "guestUrl" gider

    Scenario: Kullanıcı gittiği URL'de yer alan Ana menü başlığından bize ulasin tıklandığında 'Bize Ulaşın' sayfasına erişir ve eriştiği sayfada mesaj göndermek için gerekli kutucukları doldurarak mesaj gönderdiğini doğrular

      Given Kullanici, contact sekmesinin ana sayfada gorundugunu dogrular ve contact sekmesine tiklar
      Then contact sayfasina basariyla gecis yaptigini dogrular
      And Sirkete mesaj gonderme formunun iletisim sayfasinda goruntulendigini dogrular
      Then Name Box, MailBox, Subject TextBox, Message Text Box, Send Message Button ogelerinin formda gorunur oldugunu dogrular
      And Name Box, MailBox, Subject TextBox, Message Text Box, kutularina gerekli bilgileri gondererek Send Message butonuna basar
      Then Mesaj gonderdiginize dair onay bildirimini gordugunu dogrular
      Then sayfayi kapatir


      Scenario:Kullanıcı, URL'nin footer bölümüne gider ve bize ulaşın bağlantısının görüntülendiğini doğrular ve bize ulaşın bağlantısını tıklar. Açılan bize ulaşın sayfasında gerekli adres ve iletişim bilgilerini görebildiğinizi doğrular

        Given kullanici anasayfada footer kismina iner
        Then contact baglantisinin gorunur oldugunu dogrular ve contact linkine tiklar
        Then contact sayfasina basariyla gecis yaptigini dogrular
        And Sirketin e-posta, telefon ve adres iletisim bilgilerinin contact us sayfasinda gorunur oldugunu dogrular
        Then Adres bilgilerinin, sirketin contact us sayfasindaki konumunu gosteren haritada gorundugunu dogrular
        And sayfayi kapatir

        Scenario:Kullanıcı gittiği URL'de yer alan Ana menü başlığından bize ulasin tıklandığında contact us ve home linklerinin gorunur ve aktif oldugunu dogrular

          Given Kullanici, contact sekmesinin ana sayfada gorundugunu dogrular ve contact sekmesine tiklar
          Then home ve contact linkerinin goruntulendigini dogrular
          And contact linkinin calistigini test etmek icin tiklar
          And home linkinin calistigini test etmek icin tiklar
          Then sayfayi kapatir
