Feature:
  Background:
    *  kullanici verilen "adminUrl" gider
  Scenario:
    Given kullaniciya verilen "yusufkuzkayaUsername" ve "adminPassword" bilgileri ile admin sayfasina login olur.
    Then "Loans" ogesne tiklanir.
    Then Loans menu basligi altindaki "Due Loans" sayfa linkine tiklandiginda "Due Loans" sayfasina gectiginin kontrolu yapilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda S.N. gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda Loan No. | Plan gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda User gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda Amount gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment Amount gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda Created | Next Installment gorunurlugu kontrol edilir.
    And Due Loans sayfasinda Due İnstallment Loans Tablosunda Status gorunurlugu kontrol edilir.
    Given Due Loans sayfasindaki Due Installment Loans tablosu uzerinde "Loan No ve Start Date - End Date" bilgileri ile alanında numara ve tarih girilerek arama yapilir.
    And Due Installment Loans tablosunda bulunan Action basligi altinda secilen kredinin Details ve Installment bilgilerine erisilebilirligi kontrol edilir.
    Given Details sayfasinda kredi detaylarina (Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine ) erisilebilmelidir.
    Then Installments sayfasinda Loan summary bilgileri (Loan Number, Plan, Loan Amount,  Per Installment, Total Installment, Given Installment,  Receivable, Delay Charge) goruntulenmelidir.
    And Installments sayfasinda taksitler S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenmelidir.
    Then Installments sayfasindan Due Loans sayfasina donus yapilabilmelidir.
    And Installments sayfasinda taksitler 20'den fazlaysa bir sonraki sayfada listelenmeye devam etmelidir.