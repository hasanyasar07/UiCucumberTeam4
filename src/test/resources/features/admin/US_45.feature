Feature:Bir yönetici (admin) olarak seçtiğim bir kullanıcının profil bilgilerini düzenleyebilmek istiyorum
  Scenario: Bir yönetici (admin) olarak seçtiğim bir kullanıcının profil bilgilerini düzenleyebilmek istiyorum
    Given kullanici verilen "adminUrl" gider
    Then kullanici verilen "rumeysaaslanUsername" ve "adminPassword" bilgileri ile admin sayfasinda login olur
    Then manage users altindaki active users in gorunur oldugunu dogrular
    And active users linkine tiklar
    Then active uselari goruntuledigini dogrular
    Then kullanici secmek icin arama kutusuna kullanici adini girerek arama yapar
    And gelen kullanicida details kisminin goruntulendigini dogrular ve details a tiklar
    Then secilen kullanici bilgilerinin duzenlendigini test etmek icin ad ve soyad a ekleme yapar
    And kullanici duzenleme sayfasinda submite tiklar
    Then onay yazisinin ciktigini dogrular
    Then e postanin dogru oldugunu kontrol eder
    And e posta isim soyisim ve telefon numarasi kutularinin bos olmadigini test eder
    And sayfayi kapatir