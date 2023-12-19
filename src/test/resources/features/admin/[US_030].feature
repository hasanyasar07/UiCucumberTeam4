Feature:
  Background:
    * kullanici verilen "adminUrl" gider

    Scenario:

      Given kullaniciya verilen "yusufkuzkayaUsername" ve "adminPassword" bilgileri ile admin sayfasina login olur.
    Then "Loans" ogesine tiklanir.
    Then "All Loans" ogesine tiklanir.
    And "All Loans" yazisinin gorunur oldugunu dogrulayin.
    And "All Loans" sayfasinda "S.N." adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Loan No. | Plan" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "User" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Amount" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Installment Amount" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Installment" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Created | Next Installment" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Status" adinin gorundugunu dogrulayin.
    And "All Loans" sayfasinda "Action" adinin gorundugunu dogrulayin.
    Given "Loan No." alanina kredi numarasini girin.
    Then Kredi numarasinin arama kutusu simgesine tiklayin.
    And Kredi numarasi ile sorgulama islemi yaptiktan sonra ilk gelen krediyi dogrulayin.
    Given Kredilerin Baslangıc Tarihi - Bitis Tarihi metin kutusuna tıklayin.
    Then "Start Date" – "End Date" metin kutusuna “01.12.2023-12.12.2023” tarihleri yazilir.
    Given "Start Date" – "End Date" secme islemi yaptiktan sonra arama kutusu simgesine tiklanir.
    Then "All Loans" sayfasındaki "Start Date" – "End Date" bilgileri ile arama yapildigi dogrulanir.
    Given "All Loans" sayfasinda ilk satirda yer alan "Details" butonuna tiklanir.
    Then "Details" sayfasinda "Plan" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Date of Application" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Loan Number" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Amount" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Per Installment" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Total Installment" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Given Installment" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Total Payable" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Profit" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Status" adinin gorundugunu dogrulayin.
    And "Details" sayfasinda "Loan Form Submitted by User" yazisinin gorundugunu dogrulayin.
    And "All Loans"" alanina tiklayin. Geri donus yapin.
    And "All Loans"" sayfasındaki ilk satirda yer alan "Installments" butonuna tıklayin.
    And "Installments" sayfasında "Loan Number" gorundugunu dogrulayin.
    And "Installments" sayfasında "Plan" gorundugunu dogrulayin.
    And "Installments" sayfasında "Loan Amount" gorundugunu dogrulayin.
    And "Installments" sayfasında "Per Installment" gorundugunu dogrulayin.
    And "Installments" sayfasında "Total Installment" gorundugunu dogrulayin.
    And "Installments" sayfasında "Given Installment" gorundugunu dogrulayin.
    And "Installments" sayfasında "Receivable" gorundugunu dogrulayin.
    And "Installments" sayfasında "S.N." gorundugunu dogrulayin.
    And "Installments" sayfasında "Installment Date" gorundugunu dogrulayin.
    And "Installments" sayfasında "Given On"" gorundugunu dogrulayin.
    And "Installments" sayfasında "Delay"" gorundugunu dogrulayin.
    And "Installments" sayfasında "Charge"" gorundugunu dogrulayin.
    And "All Loans" sayfasina donmek icin  "Back" butonuna tiklayin.
    And "All Loans" sayfasına donuldugunu dogrulayin.
    Then "All Loans" sayfasinin sag alt köşesindeki "2" butonuna tiklayarak bir sonraki sayfaya gecin.
    And Sonraki sayfada oldugunuzu dogrulayin.
    And Sayfayi kapatin.