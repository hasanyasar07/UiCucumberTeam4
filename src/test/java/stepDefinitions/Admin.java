package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPages;

public class Admin {
    AdminPages adminPages=new AdminPages();

    @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")
    public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
        adminPages.adminLoginMethod(username,password);
    }

    // ********** US_025  **********
    @Given("kullaniciya verilen {string} ve {string} bilgileri ile admin sayfasina login olur.")
    public void kullaniciya_verilen_ve_bilgileri_ile_admin_sayfasina_login_olur(String username, String adminpassword) {
      adminPages.adminLoginMethod(username,adminpassword);
    }
    @Then("Admin ekraninda {string} yazisinin gorunurlugu kontrol edilir.")
    public void admin_ekraninda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.LoansButton.isDisplayed());

    }
    @Given("{string} menusune tiklanir.")
    public void menusune_tiklanir(String string) {
        adminPages.LoansButton.click();
    }
    @Then("Pending Loans gorunurlugu kontrol edilir.")
    public void pending_loans_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.PendingLoansButton.isDisplayed());
    }
    @Then("Paid Loans gorunurlugu kontrol edilir.")
    public void paid_loans_gorunurlugu_kontrol_edilir() {

        Assert.assertTrue(adminPages.paidLoansButton.isDisplayed());
    }
    @Then("Rejected Loans gorunurlugu kontrol edilir.")
    public void rejected_loans_gorunurlugu_kontrol_edilir() {

        Assert.assertTrue(adminPages.rejectedLoansButton.isDisplayed());

    }
    @Given("Pending Loans tiklanir.")
    public void pending_loans_tiklanir() {
        adminPages.PendingLoansButton.click();
    }
    @Then("Pending Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void pending_loans_sayfasinda_yazisinin_ggrunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.PendingLoansButton.isDisplayed());
    }
    @Given("Running Loans tiklanir.")
    public void running_loans_tiklanir() {
        adminPages.runningLoansButton.click();

    }
    @Then("Running Loans sayfasinda\"Running Loans\" yazisinin gorunurlugu kontrol edilir.")
    public void running_loans_sayfasinda_running_loans_yazisinin_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.runningLoansButton.isDisplayed());
    }
    @Then("Due Loans tiklanir.Due Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void due_loans_tiklanir_due_loans_sayfasinda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        adminPages.dueLoansButton.click();
        Assert.assertTrue(adminPages.dueLoansButton.isDisplayed());
    }
    @Given("Paid Loans tiklanir.")
    public void paid_loans_tiklanir() {
        adminPages.paidLoansButton.click();
    }
    @Then("Paid Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void paid_loans_sayfasinda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.paidLoansButton.isDisplayed());
    }
    @Given("Rejected Loans tiklanir.")
    public void rejected_loans_tiklanir() {
        adminPages.rejectedLoansButton.click();
    }
    @Then("Rejected Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void rejected_loans_sayfasinda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.rejectedLoansButton.isDisplayed());

    }


    // ********** US_026  **********



    // ********** US_027  **********



    // ********** US_028  **********

    @Then("Loans menu basligi altindaki {string} sayfa linkine tiklandiginda {string} sayfasina gectiginin kontrolu yapilir.")
    public void loans_menu_basligi_altindaki_sayfa_linkine_tiklandiginda_sayfasina_gectiginin_kontrolu_yapilir(String string, String string2) {

    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda S.N. gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_s_n_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Loan No. | Plan gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_loan_no_plan_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda User gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_user_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_amount_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_amount_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Created | Next Installment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_created_next_ınstallment_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Status gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_status_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Due Loans sayfasindaki Due Installment Loans tablosu uzerinde {string} bilgileri ile alanında numara ve tarih girilerek arama yapilir.")
    public void due_loans_sayfasindaki_due_ınstallment_loans_tablosu_uzerinde_bilgileri_ile_alanında_numara_ve_tarih_girilerek_arama_yapilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Due Installment Loans tablosunda bulunan Action basligi altinda secilen kredinin Details ve Installment bilgilerine erisilebilirligi kontrol edilir.")
    public void due_ınstallment_loans_tablosunda_bulunan_action_basligi_altinda_secilen_kredinin_details_ve_ınstallment_bilgilerine_erisilebilirligi_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Details sayfasinda kredi detaylarina \\(Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine ) erisilebilmelidir.")
    public void details_sayfasinda_kredi_detaylarina_plan_date_of_application_loan_number_amount_per_ınstallment_total_ınstallment_given_ınstallment_total_payable_profit_status_bilgilerine_erisilebilmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasinda Loan summary bilgileri \\(Loan Number, Plan, Loan Amount,  Per Installment, Total Installment, Given Installment,  Receivable, Delay Charge) goruntulenmelidir.")
    public void ınstallments_sayfasinda_loan_summary_bilgileri_loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_goruntulenmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasinda taksitler S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenmelidir.")
    public void ınstallments_sayfasinda_taksitler_s_n_ınstallment_date_given_on_delay_charge_bilgileri_ile_goruntulenmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasindan Due Loans sayfasina donus yapilabilmelidir.")
    public void ınstallments_sayfasindan_due_loans_sayfasina_donus_yapilabilmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasinda taksitler {int}'den fazlaysa bir sonraki sayfada listelenmeye devam etmelidir.")
    public void ınstallments_sayfasinda_taksitler_den_fazlaysa_bir_sonraki_sayfada_listelenmeye_devam_etmelidir(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    // ********** US_029  **********



    // ********** US_030  **********



    // ********** US_031  **********



    // ********** US_032  **********



    // ********** US_033  **********



    // ********** US_034  **********



    // ********** US_035  **********



    // ********** US_036  **********



    // ********** US_037  **********



    // ********** US_038  **********



    // ********** US_039  **********



    // ********** US_040  **********



    // ********** US_041  **********



    // ********** US_042  **********



    // ********** US_043  **********



    // ********** US_044  **********



    // ********** US_045  **********



    // ********** US_046  **********



    // ********** US_047  **********



    // ********** US_048  **********



    // ********** US_049  **********



    // ********** US_050  **********



    // ********** US_051  **********



    // ********** US_052  **********



    // ********** US_053  **********



    // ********** US_054  **********



    // ********** US_055  **********



}
