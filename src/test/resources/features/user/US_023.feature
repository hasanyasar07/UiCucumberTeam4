Feature: Bir Kullanıcı (User ) olarak Anasayfada Loan Planlara ulaşabileceğim bir sayfa olmasını istiyorum

  Background:
    * kullanici verilen "guestUrl" gider

  Scenario:Anasayfa ustbarında Plans linki altında loan cardlar goruntulenmelidir

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "guluzarataalpUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then LoanTechLogo tiklar
    Then ansayfa ustbarından plans linkine tıklar
    And plans linki altında loan cardların gorunur oldugunu test eder ve basic loan butonuna tiklar
    Then basic loan buton tıklandığında acılan cardların başlıkları gorunur oldugunu test eder
    And sayfayi kapatir


  Scenario:Apply Now Butonu Görünür ve aktif olmalıdır. Tıklandığında "Apply for 'Seçilen card ismi ' "sayfası açılmalıdır.

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "guluzarataalpUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then  LoanTechLogo tiklar
    Then ansayfa ustbarından plans linkine tıklar
    And plans linki altında loan cardların gorunur oldugunu test eder ve basic loan butonuna tiklar
    Then basic loan buton tıklandığında acılan cardların başlıkları gorunur oldugunu test eder
    And cookie kabul edilir
    And Apply Now Butonu gorunur oldugunu test eder ve tiklandiginda Selected card name sayfası acildigini test eder
    And Applyfor Selected card name sayfasinin gorunur oldugunu test eder
    And sayfayi kapatir

  Scenario:Amount textbox'a digit minimum ve maximum değer aralığında değer girilmeli ve sayfadaki ok tuşları aktif oldugu test eder

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "guluzarataalpUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then LoanTechLogo tiklar
    Then ansayfa ustbarından plans linkine tıklar
    And  plans linki altında loan cardların gorunur oldugunu test eder ve basic loan butonuna tiklar
    Then basic loan buton tıklandığında acılan cardların başlıkları gorunur oldugunu test eder
    And cookie kabul edilir
    And Apply Now Butonu gorunur oldugunu test eder ve tiklandiginda Selected card name sayfası acildigini test eder
    And Applyfor Selected card name sayfasinin gorunur oldugunu test eder
    When Amount textbox'a digit minimum ve maximum deger aralıgında deger girilmelidir
    And sayfadaki ok tuşları tiknanir
    And sayfayi kapatir

  Scenario: Application Form sayfasinin gorunur ve apply butonuna tiklandiginda successfully mesaji goruntulenevilmelidir

    Given kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar
    Then kullanici verilen "guluzarataalpUsername" ve "userPassword" bilgileri ile userpage de login olur
    Then  LoanTechLogo tiklar
    Then ansayfa ustbarından plans linkine tıklar
    And plans linki altında loan cardların gorunur oldugunu test eder ve basic loan butonuna tiklar
    Then basic loan buton tıklandığında acılan cardların başlıkları gorunur oldugunu test eder
    And cookie kabul edilir
    And Apply Now Butonu gorunur oldugunu test eder ve tiklandiginda Selected card name sayfası acildigini test eder
    And Applyfor Selected card name sayfasinin gorunur oldugunu test eder
    When Amount textbox'a digit minimum ve maximum deger aralıgında deger girilmelidir
    And sayfadaki ok tuşları tiknanir
    When Confirm  butona tiklandiginda Application Form sayfasına gecis yapildigini test eder
    And  Apply buton aktif oldugunu test eder  ve tiklandiginda Loan application submitted successfully mesajinin gorunur oldugunu test eder
    And sayfayi kapatir


