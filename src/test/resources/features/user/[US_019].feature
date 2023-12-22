Feature:Kayıtlı bir kullanıcı (User) olarak işlemlerimi görüntüleyebileceğim bir sayfa olmasını istiyorum
  Background:
    * kullanici verilen "userUrl" gider
    * kullanici verilen "erengokUsername" ve "userPassword" bilgileri ile userpage de login olur

    Scenario: kullanici basarili bir sekilde login olduktan sonra acilan dashboard da Transactions linkinin gorundugunu dogrular ve linke tikladiginda My Transactions History sayfasina yonlendirildigini test eder

      Given kullanici acilan dashboard sayfasinda Transactions linkinin gorundugunu test eder
      Then Transactions linkine tiklar
      And My Transactions History sayfasina yonlendirildigini dogrular
      And Sayfada Transactions Number Search Box un gorunur ve aktif oldugunu dogrular
      Then Type dropdown menudeki (All,Plus,Minus) degerlerinin goruntulendigini ve aktif oldugunu dogrular
      Then Remark dropdown menudeki (Any, Application fee, Balance add,Deposit, Loan taken, Withdraw, Withdraw reject) gorunur ve aktif oldugunu dogrular
      And Listede filtre sectikten sonra  Title,Amount,charge,Post Balance,Details Bilgileri gorunur oldugunu dogrular
      And sayfalari kapatir
