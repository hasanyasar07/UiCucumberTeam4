package stepDefinitions;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.geom.RectangularShape;
import java.util.List;
import utilities.ReusableMethods;

import java.awt.*;



public class Admin {
    AdminPages adminPages = new AdminPages();
    Select select;
    @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")

    public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
        adminPages.adminLoginMethod(username, password);
    }


    // ********** US_025  ********** YUSUF
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


    @Then("{string} ogesne tiklanir.")
    public void ogesneTiklanir(String arg0) {
        adminPages.LoansButton.click();
    }
    @Then("Loans menu basligi altindaki {string} sayfa linkine tiklandiginda {string} sayfasina gectiginin kontrolu yapilir.")
    public void loans_menu_basligi_altindaki_sayfa_linkine_tiklandiginda_sayfasina_gectiginin_kontrolu_yapilir(String string, String string2) {
        adminPages.dueLoansButton.click();
        Assert.assertTrue(adminPages.dueLoansButton.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda S.N. gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_s_n_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansSn.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Loan No. | Plan gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_loan_no_plan_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansNoPlan.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda User gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_user_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansUser.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_amount_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansAmount.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_amount_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansInstallmentAmount.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansInstallment.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Created | Next Installment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_created_next_ınstallment_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansCreatedNextInstallment.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Status gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_status_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.loansStatus.isDisplayed());
    }
    @Given("Due Loans sayfasindaki Due Installment Loans tablosu uzerinde {string} bilgileri ile alanında numara ve tarih girilerek arama yapilir.")
    public void due_loans_sayfasindaki_due_ınstallment_loans_tablosu_uzerinde_bilgileri_ile_alanında_numara_ve_tarih_girilerek_arama_yapilir(String string) {

    }
    @Given("Due Installment Loans tablosunda bulunan Action basligi altinda secilen kredinin Details ve Installment bilgilerine erisilebilirligi kontrol edilir.")
    public void due_ınstallment_loans_tablosunda_bulunan_action_basligi_altinda_secilen_kredinin_details_ve_ınstallment_bilgilerine_erisilebilirligi_kontrol_edilir() {

    }
    @Given("Details sayfasinda kredi detaylarina \\(Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine ) erisilebilmelidir.")
    public void details_sayfasinda_kredi_detaylarina_plan_date_of_application_loan_number_amount_per_ınstallment_total_ınstallment_given_ınstallment_total_payable_profit_status_bilgilerine_erisilebilmelidir() {

    }
    @Then("Installments sayfasinda Loan summary bilgileri \\(Loan Number, Plan, Loan Amount,  Per Installment, Total Installment, Given Installment,  Receivable, Delay Charge) goruntulenmelidir.")
    public void ınstallments_sayfasinda_loan_summary_bilgileri_loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_goruntulenmelidir() {

    }
    @Then("Installments sayfasinda taksitler S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenmelidir.")
    public void ınstallments_sayfasinda_taksitler_s_n_ınstallment_date_given_on_delay_charge_bilgileri_ile_goruntulenmelidir() {

    }
    @Then("Installments sayfasindan Due Loans sayfasina donus yapilabilmelidir.")
    public void ınstallments_sayfasindan_due_loans_sayfasina_donus_yapilabilmelidir() {

    }
    @Then("Installments sayfasinda taksitler {int}'den fazlaysa bir sonraki sayfada listelenmeye devam etmelidir.")
    public void ınstallments_sayfasinda_taksitler_den_fazlaysa_bir_sonraki_sayfada_listelenmeye_devam_etmelidir(Integer int1) {

    }

    // ********** US_029  **********


    // ********** US_030  **********



    @Then("{string} ogesine tiklanir.")
    public void ogesineTiklanir(String arg0) {
        adminPages.LoansButton.click();
    }
    @Then("Daha sonra {string} ogesine tiklanir.")
    public void dahaSonraOgesineTiklanir(String arg0) {
        adminPages.allLoansButton.click();
    }
    @Then("{string} yazisinin gorunur oldugunu dogrulayin.")
    public void yazisininGorunurOldugunuDogrulayin(String arg0) {
        Assert.assertTrue(adminPages.allLoansButton.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorundugunu dogrulayin.")
    public void sayfasindaAdininGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansSn.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin  gorunurlugunu dogrulayin.")
    public void sayfasindaAdininGorunurlugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansNoPlan.isDisplayed());
    }
    @Then("{string} sayfasinda {string} aDinin  Gorundugunu dogrulayin.")
    public void sayfasindaADininGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansUser.isDisplayed());
    }
    @Then("{string} Sayfasinda {string} adinin gorundugu_nu dogrulayin.")
    public void sayfasindaAdininGorundugu_nuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansAmount.isDisplayed());
    }
    @Then("{string} Sayfasinda  {string} adinin gorundugunu dogrulay_in.")
    public void sayfasindaAdininGorundugunuDogrulay_in(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansInstallmentAmount.isDisplayed());
    }
    @Then("{string} sayfasind_a  {string} Adinin gorundugunu dogrulayin.")
    public void sayfasind_aAdininGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansInstallment.isDisplayed());
    }
    @Then("{string} sayfa_sinda {string} adinin gorundugunu  dogrulayin.")
    public void sayfa_sindaAdininGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansCreatedNextInstallment.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorundugunu dog_rulayin.")
    public void sayfasindaAdininGorundugunuDog_rulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.loansStatus.isDisplayed());
    }

    @Then("{string} sayfasinda {string}  adinin g_orundugunu Dogrulayin.")
    public void sayfasindaAdininG_orundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.allLoansAction.isDisplayed());
    }

    @Then("{string} alanina kredi numarasini girin.")
    public void alaninaKrediNumarasiniGirin(String arg0) {
        adminPages.loanNo.sendKeys("EPEGJ1CXNW47");
    }

    @Then("Kredi numarasinin arama kutusu simgesine tiklayin.")
    public void krediNumarasininAramaKutusuSimgesineTiklayin() {
        adminPages.loansSearchButton.click();

        adminPages.loanNo.clear();
    }

    @Then("Kredi numarasi ile sorgulama islemi yaptiktan sonra ilk gelen krediyi dogrulayin.")
    public void krediNumarasiIleSorgulamaIslemiYaptiktanSonraIlkGelenKrediyiDogrulayin() {
        Assert.assertTrue(adminPages.loanNoDogrulama.isDisplayed());
    }
    @Then("Kredilerin Baslangıc Tarihi - Bitis Tarihi metin kutusuna tıklayin.")
    public void kredilerinBaslangıcTarihiBitisTarihiMetinKutusunaTıklayin() {
        adminPages.startDateEndDate.click();
    }

    @Then("{string} – {string} metin kutusuna “{double}.{int}-{int}.{int}.{int}” tarihleri yazilir.")
    public void metin_kutusuna_tarihleri_yazilir(String string, String string2, Double double1, Integer int1, Integer int2, Integer int3, Integer int4) {
        adminPages.startDateEndDate.sendKeys("01.12.2023-16.12.2023");
    }

    @Then("{string} – {string} secme islemi yaptiktan sonra arama kutusu simgesine tiklanir.")
    public void secmeIslemiYaptiktanSonraAramaKutusuSimgesineTiklanir(String arg0, String arg1) {
        adminPages.loansSearchButton.click();
        ReusableMethods.wait(2);
    }

    @Then("{string} sayfasindaki {string} – {string} bilgileri ile arama yapildigi dogrulanir.")
    public void sayfasindakiBilgileriIleAramaYapildigiDogrulanir(String arg0, String arg1, String arg2) {
        Assert.assertTrue(adminPages.startDateEndDateDogrulama.isDisplayed());
    }
    @Then("{string} sayfasinda ilk satirda yer alan {string} butonuna tiklanir.")
    public void sayfasindaIlkSatirdaYerAlanButonunaTiklanir(String arg0, String arg1) {
        adminPages.detailsButtonu.click();
        ReusableMethods.wait(2);
    }

    @Then("{string} sayfasinda {string} adi_nin gorundugunu dogrulayin.")
    public void sayfasindaAdi_ninGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsPlan.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adİnin gorundugunu dogrulayin.")
    public void sayfasindaAdİninGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsDateOfApplication.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorUndugunu dogrulayin.")
    public void sayfasindaAdininGorUndugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsLoanNumber.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorunDugunu dogrulayin.")
    public void sayfasindaAdininGorunDugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsAmount.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorunduGunu dogrulayin.")
    public void sayfasindaAdininGorunduGunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsPerInstallment.isDisplayed());
    }
    @Then("{string} sayfasindA {string} aDinin gorundugUnu dogrulayin.")
    public void sayfasindaADininGorundugUnuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsTotalInstallment.isDisplayed());
    }
    @Then("{string} sayFasinda {string} adinin gorundugunu dogrulayiN.")
    public void sayfasindaAdininGorundugunuDogrulayiN(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsGivenInstallment.isDisplayed());
    }
    @Then("{string} sayfasinda {string} yazisinin gorundugunu dogrulayin.")
    public void sayfasindaYazisininGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsTotalPayable.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorundugunu dogruLayin.")
    public void sayfasindaAdininGorundugunuDogruLayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsProfit.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin gorundugUnu dogrulayin.")
    public void sayfasindaAdininGorundugUnuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsStatus.isDisplayed());
    }
    @Then("{string} sayfasinda {string} adinin goruNdugunu dogrulayin.")
    public void sayfasindaAdininGoruNdugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.detailsLfSByUser.isDisplayed());
    }

    @Then("{string} alanina tiklayin. Geri donus yapin.")
    public void alaninaTiklayinGeriDonusYapin(String arg0) {
        adminPages.allLoansButton.click();
        ReusableMethods.wait(2);
    }
    @Then("{string} sayfasındaki ilk satirda yer alan {string} butonuna tıklayin.")
    public void sayfasındakiIlkSatirdaYerAlanButonunaTıklayin(String arg0, String arg1) {
        adminPages.InstallmentsButton.click();
        ReusableMethods.wait(2);
    }

    @Then("{string} sayfa_sinda {string} gorundugunu dogrulayin.")
    public void sayfa_sindaGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsLoanNumber.isDisplayed());
    }
    @Then("{string} sayfasind_a {string} gorundugunu dogrulayin.")
    public void sayfasind_aGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsPlan.isDisplayed());
    }
    @Then("{string} sayfasinda {string} gorun_dugunu dogrulayin.")
    public void sayfasindaGorun_dugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsLoanAmount.isDisplayed());
    }
    @Then("{string} saYfasinda {string} gorundugunu dogrulayin.")
    public void sayfasindaGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsPerInstallment.isDisplayed());
    }
    @Then("{string} sayfasi_nda {string} gorundugunu dogrulayin.")
    public void sayfasi_ndaGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsTotalInstallment.isDisplayed());
    }
    @Then("{string} sayfasinda {string} gor_undugunu dogrulayin.")
    public void sayfasindaGor_undugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsGivenInstallment.isDisplayed());
    }

    @Then("{string} sayfas_inda {string} gorundugunu dogrulayin.")
    public void sayfas_indaGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsReceivable.isDisplayed());
    }
    @Then("{string} sayfasinda {string} gorundugun_u dogrulayin.")
    public void sayfasindaGorundugun_uDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentSN.isDisplayed());
    }
    @Then("{string} s_ayfasinda {string} gorundugunu dogrulayin.")
    public void s_ayfasindaGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsInstallmentDate.isDisplayed());
    }
    @Then("{string} sayfasinda {string} _gorundugunu dogrulayin.")
    public void sayfasinda_gorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InsttalmentsGivenOn.isDisplayed());
    }
    @Then("{string} _sayfasinda {string} gorundugunu dogrulayin.")
    public void _sayfasindaGorundugunuDogrulayin(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallmentsDelay.isDisplayed());
    }
    @Then("{string} sayfasinda {string} gorundugunu dogrulayi_n.")
    public void sayfasindaGorundugunuDogrulayi_n(String arg0, String arg1) {
        Assert.assertTrue(adminPages.InstallemntsCharge.isDisplayed());
    }
    @Then("{string} sayfasina donmek icin  {string} butonuna tiklayin.")
    public void sayfasinaDonmekIcinButonunaTiklayin(String arg0, String arg1) {
        adminPages.InstallmentsBack.click();
    }
    @Then("{string} sayfasına donuldugunu dogrulayin.")
    public void sayfasınaDonuldugunuDogrulayin(String arg0) {
        Assert.assertTrue(adminPages.allLoansButton.isDisplayed());
    }
    @Then("{string} sayfasinin sag alt kosesindeki {string} butonuna tiklayarak bir sonraki sayfaya gecin.")
    public void sayfasininSagAltKosesindekiButonunaTiklayarakBirSonrakiSayfayaGecin(String arg0, String arg1) {
        ReusableMethods.wait(2);
        adminPages.InstallmentsPageSayfa.sendKeys(Keys.ENTER);
    }
    @Then("Sonraki sayfada oldugunuzu dogrulayin.")
    public void sonrakiSayfadaOldugunuzuDogrulayin() {
        Assert.assertTrue(adminPages.twosayfa.isDisplayed());
    }
    @And("Sayfayi kapatin.")
    public void sayfayiKapatin() {
        Driver.closeDriver();
    }


    // ********** US_031  **********

    @Then("{string} menusune gidilerek tiklanir.")
    public void menusune_gidilerek_tiklanir(String string) {
        adminPages.depositsLink.click();
        ReusableMethods.wait(2);
    }
    @Then("{string} yazisinin gorunurlugu kontrol edilir.")
    public void yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.depositsLink.isDisplayed());
    }
    @Then("{string} alanina Tiklanir. {string} yazisinin gorunurlugu kontrol edilir.")
    public void alanina_tiklanir_yazisinin_gorunurlugu_kontrol_edilir(String string, String string2) {
        ReusableMethods.wait(2);
        adminPages.pendingDepositsButton.click();
        Assert.assertTrue(adminPages.pendingDepositsButton.isDisplayed());
    }
    @Then("{string} aLanina tiklanir. {string} yazisinin Gorunurlugu kontrol edilir.")
    public void a_lanina_tiklanir_yazisinin_gorunurlugu_kontrol_edilir(String string, String string2) {
        ReusableMethods.wait(2);
        adminPages.approvedDepositsLink.click();
        Assert.assertTrue(adminPages.approvedDepositsLink.isDisplayed());
    }
    @Then("{string} alanA tiklanir. {string} yazisi gorunurlugu Kontrol eder.")
    public void alan_a_tiklanir_yazisi_gorunurlugu_kontrol_eder(String string, String string2) {
        adminPages.succesfullDepositsLink.click();
        Assert.assertTrue(adminPages.succesfullDepositsLink.isDisplayed());
        ReusableMethods.wait(2);
    }
    @Then("{string} alanina tiklanir. {string} Yazisinin gorunurlugu kontrol edilir.")
    public void alanina_tiklanir_yazisinİn_gorunurlugu_kontrol_edilir(String string, String string2) {
        adminPages.RejectedDepositsLink.click();
        Assert.assertTrue(adminPages.RejectedDepositsLink.isDisplayed());
        ReusableMethods.wait(2);
    }
    @Then("{string} Alanina tiklanir. {string} gorunur oldugu kontrol edilir.")
    public void alanina_tiklanir_gorunur_oldugu_kontrol_edilir(String string, String string2) {
        adminPages.InitiatedDepositsLink.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPages.InitiatedDepositsLink.isDisplayed());
    }
    @Then("{string} alanina tiklar. {string} gorunurlugu kont_rol Edilir.")
    public void alanina_tiklar_gorunurlugu_kont_rol_edilir(String string, String string2) {
        ReusableMethods.wait(2);
        adminPages.AllDepositsButton.click();
        Assert.assertTrue(adminPages.depositHistory.isDisplayed());
    }
    @Then("Sayfa kapatilir.")
    public void sayfa_kapatilir() {
        Driver.closeDriver();

    }




    // ********** US_032 HILAL **********

    @Given("Launch browser")
    public void launch_browser() {


    }

    @Given("Navigate to {string}")
    public void navigateTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

    }

    @Given("the user logs in to the admin page with the given {string} and {string} information")
    public void theUserLogsInToTheAdminPageWithTheGivenAndInformation(String username, String password) {
        adminPages.adminLoginMethod(username, password);
    }

    @Given("Verify that Admin homepage is visible successfully")
    public void verify_that_admin_homepage_is_visible_successfully() {
        adminPages.manageUsersButton.click();
        Assert.assertTrue(adminPages.manageUsersButton.isDisplayed());

    }

    @Given("Close the page")
    public void close_the_page() {
        Driver.closeDriver();

    }



    // ********** US_033  **********


    // ********** US_034  **********
    @Given("acilan login sayfasinda admin ikonu gorunur oldugunu test eder ve admin ikonuna tiklar")

    public void acilanLoginSayfasindaAdminIkonuGorunurOldugunuTestEderVeAdminIkonunaTiklar() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.adminIkonu.isDisplayed());
        ReusableMethods.wait(1);
        adminPages.adminIkonu.click();

        ReusableMethods.wait(2);

    }

    @Then("admin ikonuna tiklaninca acilan dropdown menüde Profile Password Logout linklerinin gorunur oldugunu test eder")
    public void adminIkonunaTiklanincaAcilanDropdownMenüdeProfilePasswordLogoutLinklerininGorunurOldugunuTestEder() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.profilLinkElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Then("profil linkine tiklanir")
    public void profilLinkineTiklanir() {
        adminPages.profilLinkElementi.click();

        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.profileInformationYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("aCılan sayfada name  email text boxları ve fotoğraf gUncellenip aktif oldugu dogrulanir")
    public void acılanSayfadaNameEmailTextBoxlarıVeFotoğrafGUncellenipAktifOlduguDogrulanir() throws AWTException {

        adminPages.ProfilNameBox.clear();
        ReusableMethods.wait(1);
        adminPages.ProfilNameBox.sendKeys("Gulizar");

        ReusableMethods.wait(1);
        adminPages.ProfilEmailBox.clear();
        ReusableMethods.wait(1);
        adminPages.ProfilEmailBox.sendKeys("gul.ataalp@gmail.com");
        ReusableMethods.wait(2);
        adminPages.uploadImageButon.click();
        ReusableMethods.wait(2);


        StringSelection resim = new StringSelection("C:\\Users\\Gülizar\\IdeaProjects\\UiCucumberTeam4\\src\\test\\java\\picture\\profil.png");
        //StringSelection resim=new StringSelection(System.getProperty("user.dir")+"SmartCardLink_Team3\\a.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resim, null);
        Robot robot = new Robot();
        ReusableMethods.wait(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        ReusableMethods.wait(1);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_CONTROL);
        ReusableMethods.wait(5);
        robot.keyPress(KeyEvent.VK_ENTER);
        ReusableMethods.wait(3);



    }

    @Then("password linkine tiklanir ve password sayfasinin acldigi dogrulanmali")
    public void passwordLinkineTiklanirVePasswordSayfasininAcldigiDogrulanmali() {
        adminPages.passwordLinkElementi.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(adminPages.changePasswordYaziElementi.isDisplayed());
        ReusableMethods.wait(2);
    }

    @And("acilan sayfada ilgili alanlar doldurularak sifre guncellenir")
    public void acilanSayfadaIlgiliAlanlarDoldurularakSifreGuncellenir() {
        adminPages.profilPasswordBox.click();
        ReusableMethods.wait(1);
        adminPages.profilPasswordBox.sendKeys("123123123");
        ReusableMethods.wait(3);
        adminPages.profilNewPasswordBox.click();
        ReusableMethods.wait(2);
        adminPages.profilNewPasswordBox.sendKeys("123456789");
        ReusableMethods.wait(2);
        adminPages.profilConfirmPasswordBox.click();
        ReusableMethods.wait(2);
        adminPages.profilConfirmPasswordBox.sendKeys("123456789");
        ReusableMethods.wait(2);
        adminPages.passwordSubmitButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPages.passwordSuccessfullYaziElementi.isDisplayed());
        ReusableMethods.wait(2);


    }

    @Then("Logout linkine tıklayarak sayfadan basaralı bir sekilde ayrıldıgı dogrulanabilmeli")
    public void logoutLinkineTıklayarakSayfadanBasaralıBirSekildeAyrıldıgıDogrulanabilmeli() {
        ReusableMethods.wait(1);
        adminPages.logoutLinkElementi.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(adminPages.WelcomeToYaziElementi.isDisplayed());
        ReusableMethods.wait(2);
    }


    // ********** US_035  **********


    // ********** US_036  **********


    // ********** US_037  **********


    // ********** US_038  **********


    // ********** US_039  **********


    // ********** US_040  **********


    // ********** US_041  **********

    @Given("acilan login sayfasinda manage users butonunu tılanır")
    public void acilanLoginSayfasindaManageUsersButonunuTılanır() {

        ReusableMethods.wait(1);
        adminPages.manageUsersButton.click();
        ReusableMethods.wait(1);
    }

    @Then("active users butonun linklerinin gorunur oldugunu ve aktif oldugu dogrulanır")
    public void activeUsersButonunLinklerininGorunurOldugunuVeAktifOlduguDogrulanır() {
        adminPages.activeUsersButton.isEnabled();
        ReusableMethods.wait(1);
        adminPages.activeUsersButton.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.activeUsersButton.click();
        ReusableMethods.wait(2);

    }

    @Then("active users butonuna tiklandiginda {string} sutunundaki active users listesi ve basliklarinin gorunur oldugunu test eder")
    public void activeUsersButonunaTiklandigindaSutunundakiActiveUsersListesiVeBasliklarininGorunurOldugunuTestEder(String istenenBaslik) {

        int istenenSutunIndexi = 0;
        List<WebElement> headerElementListesi = adminPages.userListesi;
        for (int i = 0; i < headerElementListesi.size(); i++) {

            if (headerElementListesi.get(i).getText().equals(istenenBaslik)) {
                istenenSutunIndexi = i + 1;
            }
        }
        String dinamikSutunXpath = "//tr/td[" + istenenSutunIndexi + "]";
        List<WebElement> istenenSutunElementleriListesi = Driver.getDriver().findElements(By.xpath(dinamikSutunXpath));
        for (int i = 0; i < istenenSutunElementleriListesi.size(); i++) {
            System.out.println(istenenSutunElementleriListesi.get(i).getText());

        }
    }

    @Then("details butonun gorunur ve aktif oldugu dogrulanır")
    public void detailsButonunGorunurVeAktifOlduguDogrulanır() {

        adminPages.detailsButtonElement.isEnabled();
        ReusableMethods.wait(1);
        adminPages.detailsButtonElement.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.detailsButtonElement.click();
        ReusableMethods.wait(2);
    }

    @And("user Detail sayfasina yonlendirildigi dogrulanir")
    public void userDetailSayfasinaYonlendirildigiDogrulanir() {
        Assert.assertTrue(adminPages.userDetailSayfasi.isDisplayed());
        ReusableMethods.wait(2);
    }

    @And("transactions butonuna tiklanir")
    public void transactionsButonunaTiklanir() {
        adminPages.viewAllButonu.click();
        ReusableMethods.wait(2);
    }

    @Then("filtreleme içeriğindeki alanlar işlevsel ve aktif olmalıdır.")
    public void filtrelemeIçeriğindekiAlanlarIşlevselVeAktifOlmalıdır() {
        adminPages.typeAllButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.typeAllButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.typeAllButonu.click();

        adminPages.remarkAnyButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.remarkAnyButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.remarkAnyButonu.click();

        adminPages.dateStartButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.dateStartButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.dateStartButonu.click();
    }
    // ********** US_042  **********


    // ********** US_043  **********


    // ********** US_044  **********


    // ********** US_045  **********


    // ********** US_046  **********


    // ********** US_047  **********


    // ********** US_048  **********
    @Given("yonetici olarak banned users buton Link Gorunur ve aktif olmali,tiklandiginda banned users sayfasına yonlendirildigi dogrulanmalıdır")
    public void yoneticiOlarakBannedUsersButonLinkGorunurVeAktifOlmaliTiklandigindaBannedUsersSayfasınaYonlendirildigiDogrulanmalıdır() {

        adminPages.bannedUsersButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.bannedUsersButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.bannedUsersButonu.click();
        Assert.assertTrue(adminPages.bannedUsersYaziElementi.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Then("banned users butonuna tiklandiginda {string} sutunundaki banned users listesi ve basliklarinin gorunur oldugunu test eder")
    public void bannedUsersButonunaTiklandigindaSutunundakiBannedUsersListesiVeBasliklarininGorunurOldugunuTestEder(String istenenBaslik) {

        int istenenSutunIndexi = 0;
        List<WebElement> headerElementListesi = adminPages.userListeBasliklari;
        for (int i = 0; i < headerElementListesi.size(); i++) {

            if (headerElementListesi.get(i).getText().equals(istenenBaslik)) {
                istenenSutunIndexi = i + 1;
            }
            System.out.println(headerElementListesi.get(i).getText());
        }
    }

    @Then("search box'dan istenen kullanıcıyı seçebilmeli ve detail bilgilerine erisebildigini test eder")
    public void searchBoxDanIstenenKullanıcıyıSeçebilmeliVeDetailBilgilerineErisebildiginiTestEder() {
        adminPages.bannedSearcBox.click();
        adminPages.bannedSearcBox.sendKeys("asyaturk");
        ReusableMethods.wait(1);
        adminPages.bannedSearchIkonu.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.arananIsimElementi.isDisplayed());
        ReusableMethods.wait(2);
        adminPages.bannedDetailButonu.click();
    }

    @Then("Unban User butonu gorunur ve aktif oldugunu dogrular")
    public void unbanUserButonuGorunurVeAktifOldugunuDogrular() {

        adminPages.unbanUserButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.unbanUserButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.unbanUserButonu.click();
        ReusableMethods.wait(1);
        adminPages.unbanUserYesButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.unbanUserYesButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.unbanUserYesButonu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPages.unbannedSuccessfullyYaziElementi.isDisplayed());
        ReusableMethods.wait(2);






    }

    @Then("active users sayfasinda search box'a  kullanıcıyı aratip ve detail bilgilerine erisebildigini test eder")
    public void activeUsersSayfasindaSearchBoxAKullanıcıyıAratipVeDetailBilgilerineErisebildiginiTestEder() {
        ReusableMethods.wait(2);
        adminPages.activeUsersButton.click();
        ReusableMethods.wait(2);

        adminPages.activeUserSearchBox.click();
        adminPages.activeUserSearchBox.sendKeys("asyaturk");
        ReusableMethods.wait(1);
        adminPages.activeUsersSearchIkon.click();
        ReusableMethods.wait(1);
        adminPages.detailsButtonElement.click();

        Assert.assertTrue(adminPages.userDetailSayfasi.isDisplayed());
        ReusableMethods.wait(2);
    }

    // ********** US_049  **********



    // ********** US_050  **********
    @When("admin basarili bir sekilde giris yaptigini {string} dogrular")
    public void admin_basarili_bir_sekilde_giris_yaptigini_dogrular(String isim) {
        Assert.assertTrue(adminPages.kisiselIsimMenu.getText().equals(isim));
    }
    @When("admin manage users linkine tiklar")
    public void admin_manage_users_linkine_tiklar() {
        adminPages.manageUsersLink.click();
    }

    @When("admin notification to all linkine tiklar")
    public void admin_notification_to_all_linkine_tiklar() {
        adminPages.notificationToAllLink.click();
    }

    @Then("notification to all linkinin goruntulendigi dogrulanir")
    public void notification_to_all_linkinin_goruntulendigi_dogrulanir() {
        Assert.assertTrue(adminPages.notificationToAllLink.isDisplayed());
    }

    @And("notification to all linkinin aktif oldugu dogrulanir")
    public void notificationToAllLinkininAktifOlduguDogrulanir() {
        Assert.assertTrue(adminPages.notificationToAllLink.isEnabled());
    }

    @When("admin {string} sayfasinda {string} basligi oldugunu dogrular")
    public void adminAdminUsersSendNotificationSayfasindaBeingSentBasligiOldugunuDogrular(String urlUzantisi,String baslik) {
        String expectedUrl = ConfigReader.getProperty("guestUrl")+urlUzantisi;
        ReusableMethods.wait(2);
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        String actualBaslik= adminPages.beingSendText.getText();
        Assert.assertTrue(actualBaslik.contains(baslik));
    }
    @When("Notification sayfasinda {string} secer")
    public void tum_kullanicilari_secer(String user) {
        select = new Select(adminPages.DropDownChooseUserBox);
        select.selectByVisibleText(user);
    }
    @Then("baslik {string} yazar")
    public void baslik_yazar(String subject) {
        adminPages.SubjectTitleBox.sendKeys(subject);
    }
    @When("mesaj {string} yazar")
    public void mesaj_yazar(String messsage) {
        adminPages.messageBox.sendKeys(messsage);
    }
    @Then("start form alanina {int} degeri girer")
    public void start_form_alanina_degeri_girer(int sayi) {
        adminPages.startFormBox.sendKeys(String.valueOf(sayi));
    }
    @Given("per batch alanina {int} degeri girer")
    public void per_batch_alanina_degeri_girer(Integer int1) {
        adminPages.perBatchBox.sendKeys(String.valueOf(int1));
    }
    @Given("cooling period alanina {int} degeri girer")
    public void cooling_period_alanina_degeri_girer(Integer int1) {
        adminPages.coolingPeriodBox.sendKeys(String.valueOf(int1));

    }
    @Then("notification sayfasinda submit butonuna basar")
    public void notification_sayfasinda_submit_butonuna_basar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        adminPages.notificationSubmitButton.click();
        ReusableMethods.wait(10);
    }

    @Then("admin sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Userlardan {string} secilir")
    public void userlardanSecilir(String userEmail) {
        select = new Select(adminPages.DropDownChooseUserBox);
        adminPages.selectUserBox.sendKeys(userEmail);
        ReusableMethods.wait(2);
        adminPages.selectedUserConfirm.click();
        ReusableMethods.wait(2);
    }
    @When("basarili bir sekilde mesajini gonderdigini dogrular ve kutuyu kapatir")
    public void basariliBirSekildeMesajiniGonderdiginiDogrularVeKutuyuKapatir() {
        Assert.assertTrue(adminPages.succesfullyDoneText.isDisplayed());
        adminPages.succesfullyDoneCloseButton.click();
    }

    @And("baslik kisminda doldurulmasi gereken bosluklar doldurulmadiginda uyari yazisi cikar")
    public void baslikKismindaDoldurulmasiGerekenBosluklarDoldurulmadigindaUyariYazisiCikar() {
        Assert.assertTrue(adminPages.warningText.isDisplayed());
    }

    // ********** US_051  **********


    // ********** US_052  **********
    @Then("admin Deposits linkine tiklar")
    public void adminDepositsLinkineTiklar() {
        adminPages.depositsLink.click();
    }

    @When("Approved Deposits linkine tiklar")
    public void approvedDepositsLinkineTiklar() {
        adminPages.approvedDepositsLink.click();
    }

    @And("admin mevcut sayfa uzantisinin {string} oldugunu dogrular")
    public void adminMevcutSayfaUzantisininOldugunuDogrular(String urlUzanti) {
        String actualData=Driver.getDriver().getCurrentUrl();
        String expectedData=ConfigReader.getProperty("guestUrl")+urlUzanti;
        Assert.assertEquals(expectedData,actualData);
    }

    @And("admin Deposits listesinin goruntulenebilir oldugunu dogrular")
    public void adminApprovedDepoitsListesininGoruntulenebilirOldugunuDogrular() {
        System.out.println("Deposit table "+adminPages.depositsTable.getText());
        Assert.assertTrue(adminPages.depositsTable.isDisplayed());
    }
    @When("admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular")
    public void admin_approved_deposits_listesindeki_basliklarin_ve_altindaki_bilgilerin_goruntulenebilir_oldugunu_dogrular() {
        System.out.println("headers " + adminPages.depositsLinkHeaders.getText());
        Assert.assertTrue(adminPages.depositsLinkHeaders.isDisplayed());
        Assert.assertTrue(adminPages.depositsTable.isDisplayed());
    }

    @And("admin Details butonun gorunur ve aktif oldugunu dogrular")
    public void adminDetailsButonunGorunurVeAktifOldugunuDogrular() {
        Assert.assertTrue(adminPages.detailsButton.isDisplayed());
        Assert.assertTrue(adminPages.detailsButton.isEnabled());
    }

    @And("admin Details butonuna tiklar")
    public void adminDetailsButonunaTiklar() {
        adminPages.detailsButton.click();
    }

    @Then("Details sayfasindaki bilgilerin goruntulendigi dogrulanir")
    public void detailsSayfasindakiBilgilerinGoruntulendigiDogrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPages.DetailspageAllInfos.isDisplayed());
    }


    // ********** US_053  **********
    @Then("admin Succesful Deposits linkine tiklar")
    public void adminSuccesfulDepositsLinkineTiklar() {
        adminPages.succesfullDepositsLink.click();
    }

    // ********** US_054  **********
    @Then("admin Rejected Deposits linkine tiklar")
    public void adminRejectedDepositsLinkineTiklar() {
        adminPages.RejectedDepositsLink.click();
    }

    // ********** US_055  **********
    @Given("Initiated Deposits linkine tiklar")
    public void initiatedDepositsLinkineTiklar() {
        adminPages.InitiatedDepositsLink.click();
    }

}
