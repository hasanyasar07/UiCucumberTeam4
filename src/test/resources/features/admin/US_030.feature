Feature:
  Background:
    * kullanici verilen "adminUrl" gider

  Scenario:

    Given kullaniciya verilen "yusufkuzkayaUsername" ve "adminPassword" bilgileri ile admin sayfasina login olur.
    Then "Loans" ogesine tiklanir.
    Then Daha sonra "All Loans" ogesine tiklanir.
    Then "All Loans" yazisinin gorunur oldugunu dogrulayin.
    Then "All Loans" sayfasinda "S.N." adinin gorundugunu dogrulayin.
    Then "All Loans" sayfasinda "Loan No. | Plan" adinin  gorunurlugunu dogrulayin.
    Then "All Loans" sayfasinda "User" aDinin  Gorundugunu dogrulayin.
    Then "All Loans" Sayfasinda "Amount" adinin gorundugu_nu dogrulayin.
    Then "All Loans" Sayfasinda  "Installment Amount" adinin gorundugunu dogrulay_in.
    Then "All Loans" sayfasind_a  "Installment" Adinin gorundugunu dogrulayin.
    Then "All Loans" sayfa_sinda "Created | Next Installment" adinin gorundugunu  dogrulayin.
    Then "All Loans" sayfasinda "Status" adinin gorundugunu dog_rulayin.
    Then "All Loans" sayfasinda "Action"  adinin g_orundugunu Dogrulayin.
    Then "Loan No." alanina kredi numarasini girin.
    Then Kredi numarasinin arama kutusu simgesine tiklayin.
    Then Kredi numarasi ile sorgulama islemi yaptiktan sonra ilk gelen krediyi dogrulayin.
    Then Kredilerin Baslangıc Tarihi - Bitis Tarihi metin kutusuna tıklayin.
    Then "Start Date" – "End Date" metin kutusuna “01.12.2023-16.12.2023” tarihleri yazilir.
    Then "Start Date" – "End Date" secme islemi yaptiktan sonra arama kutusu simgesine tiklanir.
    Then "All Loans" sayfasindaki "Start Date" – "End Date" bilgileri ile arama yapildigi dogrulanir.
    Then "All Loans" sayfasinda ilk satirda yer alan "Details" butonuna tiklanir.
    Then "Details" sayfasinda "Plan" adi_nin gorundugunu dogrulayin.
    Then "Details" sayfasinda "Date of Application" adİnin gorundugunu dogrulayin.
    Then "Details" sayfasinda "Loan Number" adinin gorUndugunu dogrulayin.
    Then "Details" sayfasinda "Amount" adinin gorunDugunu dogrulayin.
    Then "Details" sayfasinda "Per Installment" adinin gorunduGunu dogrulayin.
    Then "Details" sayfasindA "Total Installment" aDinin gorundugUnu dogrulayin.
    Then "Details" sayFasinda "Given Installment" adinin gorundugunu dogrulayiN.
    Then "Details" sayfasinda "Total Payable" adinin gorundugunu dogruLayin.
    Then "Details" sayfasinda "Profit" adinin gorundugUnu dogrulayin.
    Then "Details" sayfasinda "Status" adinin goruNdugunu dogrulayin.
    Then "Details" sayfasinda "Loan Form Submitted by User" yazisinin gorundugunu dogrulayin.
    Then "All Loans" alanina tiklayin. Geri donus yapin.
    Then "All Loans" sayfasındaki ilk satirda yer alan "Installments" butonuna tıklayin.
    Then "Installments" sayfa_sinda "Loan Number" gorundugunu dogrulayin.
    Then "Installments" sayfasind_a "Plan" gorundugunu dogrulayin.
    Then "Installments" sayfasinda "Loan Amount" gorun_dugunu dogrulayin.
    Then "Installments" saYfasinda "Per Installment" gorundugunu dogrulayin.
    Then "Installments" sayfasi_nda "Total Installment" gorundugunu dogrulayin.
    Then "Installments" sayfasinda "Given Installment" gor_undugunu dogrulayin.
    Then "Installments" sayfas_inda "Receivable" gorundugunu dogrulayin.
    Then "Installments" sayfasinda "S.N." gorundugun_u dogrulayin.
    Then "Installments" s_ayfasinda "Installment Date" gorundugunu dogrulayin.
    Then "Installments" sayfasinda "Given On" _gorundugunu dogrulayin.
    Then "Installments" _sayfasinda "Delay" gorundugunu dogrulayin.
    Then "Installments" sayfasinda "Charge" gorundugunu dogrulayi_n.
    Then "All Loans" sayfasina donmek icin  "Back" butonuna tiklayin.
    Then "All Loans" sayfasına donuldugunu dogrulayin.
    Then "All Loans" sayfasinin sag alt kosesindeki "2" butonuna tiklayarak bir sonraki sayfaya gecin.
    Then Sonraki sayfada oldugunuzu dogrulayin.
    And Sayfayi kapatin.