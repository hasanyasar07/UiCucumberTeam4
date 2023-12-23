package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import com.sun.source.tree.AssertTree;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.AdminPages;
import utilities.Driver;
import utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.bytebuddy.agent.builder.AgentBuilder;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pages.AdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import pages.UserPages;
import utilities.ConfigReader;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.geom.RectangularShape;
import java.io.IOException;
import java.util.List;

import java.awt.*;
public class Admin {
    AdminPages adminPages=new AdminPages();
    UserPages userPages = new UserPages();
    Select select;
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    String kisiselTransactionNo;
    @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")
    public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
        adminPages.adminLoginMethod(username,password);
    }

    // ********** US_025  **********



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


    // ********** US_026  **********




    // ********** US_027  **********



    // ********** US_028  **********



    // ********** US_029  **********



    // ********** US_030  **********



    // ********** US_031  **********



    // ********** US_032 HILAL **********

    @Given("Navigate to {string}")
    public void navigateTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

    }

    @Given("click with find coordinate method.")
    public void click_with_find_coordinate_method() throws AWTException {
       ReusableMethods.coordinateClick(433,324);
       ReusableMethods.coordinateClick(433,324);

    }
    @Given("the user logs in to the admin page with the given {string} and {string} information")
    public void theUserLogsInToTheAdminPageWithTheGivenAndInformation(String username, String password)  {
        adminPages.adminLoginMethod(username,password);
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



    // ********** US_035  **********
    @Given("Verify summary board titles: Total Users, Active Users, Email Unverified Users, Mobile Unverified Users,")
    public void verify_summary_board_titles_total_users_active_users_email_unverified_users_mobile_unverified_users() {
        Assert.assertTrue(adminPages.titleTotalUsers.isDisplayed());
        Assert.assertTrue(adminPages.titleTotalUsers.isEnabled());
        adminPages.titleTotalUsers.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.allUsersPage.isDisplayed());

        Assert.assertTrue(adminPages.titleActiveUsers.isDisplayed());
        Assert.assertTrue(adminPages.titleActiveUsers.isEnabled());
        adminPages.titleActiveUsers.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.activeUsersPage.isDisplayed());

        Assert.assertTrue(adminPages.titleEmailUnverifiedUsers.isDisplayed());
        Assert.assertTrue(adminPages.titleEmailUnverifiedUsers.isEnabled());
        adminPages.titleEmailUnverifiedUsers.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.emailUnverifiedUsersPage.isDisplayed());

        Assert.assertTrue(adminPages.titleMobileUnverifiedUsers.isDisplayed());
        Assert.assertTrue(adminPages.titleMobileUnverifiedUsers.isEnabled());
        adminPages.titleMobileUnverifiedUsers.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.mobileUnverifiedUsersPage.isDisplayed());
    }
    @Given("Verify summary board titles: Running Loan, Pending Loan, Due Loan, Paid Loan, Total Deposited, Pending Deposits,")
    public void verify_summary_board_titles_running_loan_pending_loan_due_loan_paid_loan_total_deposited_pending_deposits() {

    }
    @Given("Verify summary board titles: Rejected Deposits, Deposited Charge, Total Withdrawn, Pending Withdrawals, Rejected Withdrawals, Withdrawal Charge.")
    public void verify_summary_board_titles_rejected_deposits_deposited_charge_total_withdrawn_pending_withdrawals_rejected_withdrawals_withdrawal_charge() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click View All buttons next to each title and verify redirection.")
    public void click_view_all_buttons_next_to_each_title_and_verify_redirection() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify the display of charts: Monthly Deposit & Withdraw Report \\(Last {int} Month) and Transactions Report \\(Last {int} Days).")
    public void verify_the_display_of_charts_monthly_deposit_withdraw_report_last_month_and_transactions_report_last_days(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Verify the display of login charts: Login By Browser \\(Last {int} days), Login By OS \\(Last {int} days), Login By Country \\(Last {int} days).")
    public void verify_the_display_of_login_charts_login_by_browser_last_days_login_by_os_last_days_login_by_country_last_days(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    // ********** US_036  **********



    // ********** US_037  **********



    // ********** US_038 Hilal **********
    @Given("Click Manage Users link on the DashboardPage")
    public void click_link_on_the_dashboard_page() {
        adminPages.manageUsersButton.click();

    }
    @Given("Verify Active Users link is appear on the DashboardPage")
    public void verify_link_is_appear_on_the_dashboard_page() {
        adminPages.activeUsersButton.click();


    }

    @Given("Verify Active Users List and list titles is displayed")
    public void verify_and_list_titles_is_displayed() {

        ReusableMethods.usersTableList("User");

    }

    @Given("Clicks on Active Users link.")
    public void clicks_on_active_users_link() {
        adminPages.activeUsersButton.click();

    }
    @Given("Click the details button for any user.")
    public void click_the_details_button_for_any_user() {
        js.executeScript("window.scrollBy(-100,0)");
        ReusableMethods.wait(3);
        adminPages.searchBox.sendKeys("hilal");
        adminPages.searchBoxButton.click();
        ReusableMethods.wait(3);
        adminPages.detailsButton.click();


    }
    @Given("Confirms that the User Detail-User Name page is accessed.")
    public void confirms_that_the_user_detail_user_name_page_is_accessed() {
        String expectedValue="User Detail - hilalciftci";
        String actualValue= adminPages.userDetail.getText();
        Assert.assertEquals(expectedValue,actualValue);



    }




    @Given("Verify that the text x requested x USD should be displayed")
    public void verify_that_the_text_x_requested_x_usd_should_be_displayed() {
        System.out.println(adminPages.pendingDepositAmount.getText()+ "requested");

    }


    @Given("Click on the view all icon")
    public void click_on_the_view_all_icon() {


    }
    @Given("Click on the Details button")
    public void click_on_the_details_button() {

    }
    @Given("Click  all deposit button")
    public void click_all_deposit_button() {
        adminPages.viewAllDeposit.click();

    }
    @Given("Verify that Deposit Card and Date, Transaction Number, Username, Method, Amount, Charge, After Charge, Rate, Payable, Status titles is visible")
    public void verify_that_deposit_card_and_date_transaction_number_username_method_amount_charge_after_charge_rate_payable_status_titles_is_visible() {

        Assert.assertTrue(adminPages.gatewayTransaction.isDisplayed());
        Assert.assertTrue(adminPages.initiated.isDisplayed());
        Assert.assertTrue(adminPages.user.isDisplayed());
        Assert.assertTrue(adminPages.amount.isDisplayed());
        Assert.assertTrue(adminPages.conversion.isDisplayed());
        Assert.assertTrue(adminPages.status.isDisplayed());
        Assert.assertTrue(adminPages.action.isDisplayed());

    }



    @Given("Verify that \"Successful Deposit', 'Pending Deposit', 'Rejected Deposit', 'Initiated Deposit' titles and values are visible")
    public void verify_that_successful_deposit_pending_deposit_rejected_deposit_ınitiated_deposit_titles_and_values_are_visible() {

        Assert.assertTrue(adminPages.successfullyDeposit.isDisplayed());
        Assert.assertTrue(adminPages.pendingDeposit.isDisplayed());
        Assert.assertTrue(adminPages.rejectedDeposit.isDisplayed());
        Assert.assertTrue(adminPages.initiatedDeposit.isDisplayed());


    }



    @Given("Click on the Successful Deposits heading")
    public void click_on_the_successful_deposits_heading() {
        adminPages.successfullyDeposit.click();

    }
    @Given("Verify that Succesful Deposits page is visible")
    public void verify_that_succesful_deposits_page_is_visible() {
        Assert.assertTrue(adminPages.depositPageTitle.isDisplayed());

    }
    @Given("Enter the credentilas in the Filtering and Search boxes")
    public void enter_the_credentilas_in_the_filtering_and_search_boxes() throws AWTException {

        adminPages.dateBox.click();
        ReusableMethods.wait(3);
        ReusableMethods.coordinateClick(1215, 402);
        ReusableMethods.coordinateClick(1215, 402);
        adminPages.searchBox.sendKeys("hilal");
        adminPages.searchBoxButton.click();
        ReusableMethods.wait(3);





    }
    @Given("Verify that Filtering and Search buttons are fonctional")
    public void verify_that_filtering_and_search_buttons_are_fonctional() {
        Assert.assertTrue(adminPages.approvedText.isDisplayed());

    }
    @Given("Verify that a list of successful deposits are displayed")
    public void verify_that_a_list_of_successful_deposits_are_displayed() {

    }



    @Given("Click the Pending Deposits Heading")
    public void click_the_pending_deposits_heading() {
        adminPages.pendingDeposit.click();

    }
    @Given("Verify that Pending Deposits page is visible")
    public void verify_that_pending_deposits_page_is_visible() {
        Assert.assertTrue(adminPages.depositPageTitle.isDisplayed());

    }
    @Given("Verify that Details button is active")
    public void verify_that_details_button_is_active() {
        adminPages.searchBox.sendKeys("hilal");
        adminPages.searchBoxButton.click();
        ReusableMethods.wait(3);
        js.executeScript("window.scrollBy(-100,0)");
        adminPages.detailsuserCardInformation.click();

    }
    @Given("Verify that Approve and Reject buttons on the Transaction Detail page")
    public void verify_that_approve_and_reject_buttons_on_the_transaction_detail_page() {
        Assert.assertTrue(adminPages.approvedButton.isDisplayed());
        Assert.assertTrue(adminPages.rejectButton.isDisplayed());

    }
    @Given("Click on the spesific user Details button")
    public void click_on_the_spesific_user_details_button() {
        adminPages.searchBox.sendKeys("hilal");
        adminPages.searchBoxButton.click();
        ReusableMethods.wait(3);
        adminPages.depositHistoryDatails.click();

    }

    @Given("Click on the Approve button")
    public void click_on_the_approve_button() {
        adminPages.depositHistoryApprove.click();

    }
    @Given("On the page that appears click on the Yes button")
    public void on_the_page_that_appears_click_on_the_yes_button() {
        adminPages.depositHistoryApproveYes.click();

    }
    @Given("Verify that Deposit request approved successfully is appeared")
    public void verify_that_deposit_request_approved_successfully_is_appeared() {
       String expectedText = "Deposit request approved successfully";
       String actualText = adminPages.depositApprovedMessage.getText();

        Assert.assertEquals(expectedText,actualText);

    }


    // ********** US_039  **********



    // ********** US_040  **********

    @Given("Find and click on the {string} button for a selected user.")
    public void find_and_click_on_the_button_for_a_selected_user(String userNumber) {
        String userXPath = String.format("(//td[@data-label='User'])[%d]//button", userNumber);

        Driver.getDriver().findElement(By.xpath(userXPath)).click();

    }

    //(//td[@data-label='User'])[5]
    public static String getAnyUser(int user) {
        return "(//td[@data-label='User'])[" + user + "]";
    }
    @Given("Verify that the page is displayed.")
    public void verify_that_the_page_is_displayed() {
        Assert.assertTrue(adminPages.userDetail.isDisplayed());
    }


    @Given("Click on link under Withdrawn and go to page")
    public void click_on_link_under_withdrawn_and_go_to_page() {
      adminPages.withdrawnWiewAll.click();
    }
    @Given("List and list headings are displayed on the page.")
    public void list_and_list_headings_are_displayed_on_the_page() {
        Assert.assertTrue(adminPages.approvedWithdrawals.isEnabled());
        Assert.assertTrue(adminPages.pendingWithdrawals.isEnabled());
        Assert.assertTrue(adminPages.rejectedWithdrawals.isEnabled());
        Assert.assertTrue(adminPages.gatewayTransaction.isDisplayed());
        Assert.assertTrue(adminPages.initiated.isDisplayed());
        Assert.assertTrue(adminPages.initiated.isDisplayed());
        Assert.assertTrue(adminPages.amount.isDisplayed());
        Assert.assertTrue(adminPages.status.isDisplayed());
        Assert.assertTrue(adminPages.conversion.isDisplayed());
        Assert.assertTrue(adminPages.action.isDisplayed());

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

    // ********** US_036  **********
    //TC_01
    @Given("Click on the loan plan link")
    public void click_on_the_loan_plan_link() {
      adminPages.LoanPlansButton.click();
    }
    @Given("On the admin-plans-loans page, list the available loan plans registered in the system.")
    public void on_the_admin_plans_loans_page_list_the_available_loan_plans_registered_in_the_system() {
        Assert.assertTrue(adminPages.LoanPlansAllPlans.isDisplayed());
    }
    @Given("Each loan plan is displayed with basic information such as title, interest rate, maturity period, loan limit, etc.")
    public void each_loan_plan_is_displayed_with_basic_information_such_as_title_interest_rate_maturity_period_loan_limit_etc() {
       adminPages.loanplansbasicinformation.isDisplayed();
    }
    @Given("The browser closes")
    public void the_browser_closes() {
        Driver.closeDriver();
    }

    // TC_02
    @Given("Click Add New to add a new Plan")
    public void click_add_new_to_add_a_new_plan() {
       adminPages.LoanPlansAddNewButton.click();
    }
    @Given("Necessary information is entered to add a new Plan")
    public void necessary_information_is_entered_to_add_a_new_plan() {
        adminPages.LoanPlansName.sendKeys("Luna");
        ReusableMethods.wait(1);
        adminPages.LoanPlansTitle.sendKeys("yasemin");
        ReusableMethods.wait(1);
        adminPages.LoanPlansMinimumAmount.sendKeys("1000");
        ReusableMethods.wait(1);
        adminPages.LoanPlansMaximumAmount.sendKeys("5000");
        ReusableMethods.wait(1);
        ReusableMethods.selectByValue(adminPages.LoanPlansCategory,"40");

        adminPages.LoanPlansPerInstallment.sendKeys("10");
        ReusableMethods.wait(1);

        adminPages.LoanPlansInstallmentInterval.sendKeys("28");
        ReusableMethods.wait(1);
        adminPages.LoanPlansTotalInstallments.sendKeys("36");
        ReusableMethods.wait(1);
        adminPages.LoanPlansFixedCharge.sendKeys("100");
        ReusableMethods.wait(1);
        adminPages.LoanPlansApplicationFixedCharge.sendKeys("5");
        ReusableMethods.wait(1);
        adminPages.LoanPlansChargeWillApplyIfDelay.sendKeys("1");
        ReusableMethods.wait(1);
        js.executeScript("window.scrollTo(0, document.body.scrollDown)");
        adminPages.LoanPlansFixedCharge.sendKeys("5");
        ReusableMethods.wait(1);
        adminPages.LoanPlansApplicationPercentCharge.sendKeys("5");
        ReusableMethods.wait(1);

        // adminPages.delayApplyCharge.sendKeys("100");
        // ReusableMethods.wait(1);
        // adminPages.delayFixedCharge.sendKeys("100");
        // ReusableMethods.wait(1);
         adminPages.delayPercentCharge.sendKeys("10");
         ReusableMethods.wait(2);
//

    }
    @Given("After the information is entered, the submit button is clicked")
    public void after_the_information_is_entered_the_submit_button_is_clicked() {
        adminPages.LoanPlansAddNewSubmit.submit();
        ReusableMethods.wait(1);
    }
    @Given("You will receive a warning that the new credit plan has been added successfully")
    public void you_will_receive_a_warning_that_the_new_credit_plan_has_been_added_successfully() {
       Assert.assertTrue(adminPages.LoanPlanYeniPlanEklendi.isDisplayed());
        ReusableMethods.wait(4);

    }

    // TC_03
    @Given("Edit button is clicked")
    public void edit_button_is_clicked() {
        adminPages.LoanPlansEdit.click();
    }
    @Given("Information to be updated is entered")
    public void ınformation_to_be_updated_is_entered() {
        adminPages.LoanPlansName.clear();
        adminPages.LoanPlansName.sendKeys("Kredi3");
    }
    @Given("The text {string} appears")
    public void the_text_appears(String string) {
       Assert.assertTrue(adminPages.PlanUpdatedSuccessfully.isDisplayed());
    }

    // TC_04
    @Given("Negative information is entered")
    public void negative_information_is_entered() {
        adminPages.LoanPlansName.sendKeys("Kredi1");
        adminPages.LoanPlansTitle.sendKeys("yasemin");
        adminPages.LoanPlansMinimumAmount.sendKeys("1000");
        adminPages.LoanPlansMaximumAmount.sendKeys("5000");
        adminPages.LoanPlansPerInstallment.sendKeys("10");
        ReusableMethods.wait(1);
        adminPages.LoanPlansInstallmentInterval.sendKeys("-5");
        ReusableMethods.wait(1);
        adminPages.LoanPlansTotalInstallments.sendKeys("36");
        adminPages.LoanPlansFixedCharge.sendKeys("100");
        adminPages.LoanPlansApplicationFixedCharge.sendKeys("5");
        adminPages.LoanPlansChargeWillApplyIfDelay.sendKeys("1");
        adminPages.LoanPlansFixedCharge.sendKeys("5");
        adminPages.LoanPlansApplicationPercentCharge.sendKeys("5");
        adminPages.LoanPlansAddNewSubmit.submit();
    }
    @Given("A {string} record appears")
    public void a_record_appears(String string) {
        Assert.assertTrue(adminPages.TheFixedChargeMustBeGreater.isDisplayed());
          }
    // TC_05
    @Given("Takes the necessary action to remove the existing credit plan")
    public void takes_the_necessary_action_to_remove_the_existing_credit_plan() {
        adminPages.LoanPlansDisable.click();
        adminPages.LoanPlansDisableYes.click();
    }
    @Given("Verifying that the credit plan has been removed")
    public void verifying_that_the_credit_plan_has_been_removed() {
       Assert.assertTrue(adminPages.CategoryUpdatedSuccessfully.isDisplayed());

    }

   // ********** US_037  **********



    // ********** US_038  **********



    // ********** US_039  **********

        //TC_01
        @Given("The categories link must be visible and active")
        public void the_categories_link_must_be_visible_and_active() {
            Assert.assertTrue(adminPages.CategoriesMenu.isDisplayed());
            Assert.assertTrue(adminPages.CategoriesMenu.isEnabled());
        }

        // TC_02
        @Given("click on the category menu")
        public void click_on_the_category_menu() {
          adminPages.CategoriesMenu.click();
        }
    @Given("To add a new category, information is entered and the submit button is clicked.")
    public void to_add_a_new_category_information_is_entered_and_the_submit_button_is_clicked() {
      adminPages.CategoriesAddNew.click();
      adminPages.CategoriesName.sendKeys("Car70");
      adminPages.CategoriesDescription.sendKeys("Elaa");
      adminPages.CategoriesSubmit.submit();
    }
    @Given("New category added text appears.")
    public void new_category_added_text_appears() {
       Assert.assertTrue(adminPages.CategoriesMessage.isDisplayed());
    }
    // TC_03
    @Given("On the page that opens, enter the credit plan to be searched and click on the search button.")
    public void on_the_page_that_opens_enter_the_credit_plan_to_be_searched_and_click_on_the_search_button() {
       adminPages.CategoriesSearchBox.sendKeys("Car70");
       adminPages.CategoriesSearchBoxAratma.click();
    }
    @Given("Verify that the loan scheme sought is listed")
    public void verify_that_the_loan_scheme_sought_is_listed() {
        Assert.assertTrue(adminPages.CategoriesDogrulama.isDisplayed());
    }
    // TC_04
    @Given("Set the situation in the action section")
    public void set_the_situation_in_the_action_section() {
       adminPages.CategoriesDisable.click();
    }
    @Given("Click Yes")
    public void click_yes() {
      adminPages.CategoriesDisableYes.click();
    }
    @Given("action status changed successfully")
    public void action_status_changed_successfully() {
      Assert.assertTrue(adminPages.StatusChangedSuccessfully.isDisplayed());
    }
     // TC_05
     @Given("Edit button must be clicked")
     public void edit_button_must_be_clicked() {
        adminPages.CategorisEditButton.click();
     }
    @Given("Necessary changes are made")
     public void necessary_changes_are_made() {
        adminPages.CategoriesEditName.sendKeys("");
       adminPages.CategoriesEditName.sendKeys("Car43");
     }
    @Given("Click the submit button to complete the editing process.")
    public void click_the_submit_button_to_complete_the_editing_process() {
       adminPages.CategoriesEditSubmit.submit();
    }

    @Given("The editing process should be confirmed with the message Successful")
    public void the_editing_process_should_be_confirmed_with_the_message_successful() {
      Assert.assertTrue(adminPages.CategoryUpdatedSuccessfully.isDisplayed());
    }
    // ********** US_040  **********



    // ********** US_041  **********



    // ********** US_042  **********



    // ********** US_043  **********



    // ********** US_044  **********



    // ********** US_045  **********



    // ********** US_046  **********
    // TC_01
    @Given("Withdrawals is clicked")
    public void withdrawals_is_clicked() {
       adminPages.WithdrawalsMenu.click();
    }
    @Given("Withdrawal Methods is clicked")
    public void withdrawal_methods_is_clicked() {
        adminPages.WithdrawalMethods.click();
    }
    @Given("Basic information should be displayed on the Withdrawal Methods page")
    public void basic_information_should_be_displayed_on_the_withdrawal_methods_page() {
       Assert.assertTrue(adminPages.WithdrawalsMethodsDetails.isDisplayed());
    }
     // TC_02
     @Given("Add New Button must be visible and active")
     public void add_new_button_must_be_visible_and_active() {
     Assert.assertTrue(adminPages.WithdrawalsMethodsAddNew.isDisplayed());
     Assert.assertTrue(adminPages.WithdrawalsMethodsAddNew.isEnabled());
     }
    @Given("Add New Button is clicked")
    public void add_new_button_is_clicked() {
       adminPages.WithdrawalsMethodsAddNew.click();
    }
    @Given("The withdrawal method name currency rate min max amount Range Charge Withdraw Instruction User Data information to be added must be determined.")
    public void the_withdrawal_method_name_currency_rate_min_max_amount_range_charge_withdraw_ınstruction_user_data_information_to_be_added_must_be_determined() {
       adminPages.WithdrawalsName.sendKeys("ysm4");
       adminPages.WithdrawalsCurrency.sendKeys("dolar");
       adminPages.WithdrawalsRate.sendKeys("100");
       adminPages.WithdrawalsMinAmount.sendKeys("1000");
       adminPages.WithdrawalsMaxAmount.sendKeys("20000");
       adminPages.WithdrawalsFixedCharge.sendKeys("15");
       adminPages.WithdrawalsPercentCharge.sendKeys("5");
    }
    @Given("Click on the Submit buttonn")
    public void click_on_the_submit_buttonn() {
     adminPages.WithdrawalsSubmitButton.submit();
     //Assert.assertTrue(adminPages.WithdrawalsMethodMessage.isDisplayed());
    }
     // TC_03
     @Given("The method to be searched is searched by typing it in the search button.")
     public void the_method_to_be_searched_is_searched_by_typing_it_in_the_search_button() {
        adminPages.WithdrawalsMethodsSearchbox.sendKeys("ysm4");
        adminPages.WithdrawalsMethodsSearchboxAra.click();
     }
    @Given("Detailed information of the filtered method is verified")
    public void detailed_information_of_the_filtered_method_is_verified() {
       Assert.assertTrue(adminPages.WithdrawalsMethodsSearhDetails.isDisplayed());
    }
     // TC_04
     @Given("The method to be searched is written")
     public void the_method_to_be_searched_is_written() {
        adminPages.WithdrawalsMethodsSearchbox.sendKeys("ysm4");
        adminPages.WithdrawalsMethodsSearchboxAra.click();
     }
    @Given("To edit the current shooting method, click the Edit button")
    public void to_edit_the_current_shooting_method_click_the_edit_button() {
      adminPages.WithdrawalsMethosEditButton.click();
    }
    @Given("Necessary adjustments are made")
    public void necessary_adjustments_are_made() {
        adminPages.WithdrawalsMethodsEditNamee.clear();
        ReusableMethods.wait(2);
        adminPages.WithdrawalsMethodsEditNamee.sendKeys("ela");
        ReusableMethods.wait(2);
        adminPages.WithdrawalsMethodsEditSubmit.submit();
    }
    @Given("It is checked whether the updated information is valid or not")
    public void ıt_is_checked_whether_the_updated_information_is_valid_or_not() {
        Assert.assertTrue(adminPages.WithdrawalsMethodsEditMessage.isDisplayed());
    }
    // TC_05

    @Given("The shooting method to be disabled is filtered")
    public void the_shooting_method_to_be_disabled_is_filtered() {
       adminPages.WithdrawalsMethodsSearchboxx.sendKeys("ysm2");
      // adminPages.WithdrawalsMethodsSearchboxAra.click();
       adminPages.WithdrawalsMethodDisablee.click();
       adminPages.WithdrawalsMethodsDisableYes.click();
    }
    @Given("Deactivation must be verified with confirmation")
    public void deactivation_must_be_verified_with_confirmation() {
        Assert.assertTrue(adminPages.WithdrawalsMethodsDisableMessage.isDisplayed());
    }
    // ********** US_047  **********
    @Given("Active user clicked")
    public void active_user_clicked() {
       adminPages.AdminManageUsersLink.click();
    }
    @Given("The active user to search for is filtered")
    public void the_active_user_to_search_for_is_filtered() {
     adminPages.ActiveUsers.click();
     adminPages.ActiveUsersTextbox.sendKeys("yasemin");
     adminPages.ActiveUsersTextboxAra.click();
     adminPages.ActiveUsersTextboxDetails.click();
    }
    @Given("The filtered active user's information is verified")
    public void the_filtered_active_user_s_information_is_verified() {
      adminPages.ActiveUsersDetailsBilgi.click();
    }
    // TC_02
    @Given("The filtered active user's block must be visible and active")
    public void the_filtered_active_user_s_block_must_be_visible_and_active() {
        Assert.assertTrue(adminPages.BanUserButton.isDisplayed());
        Assert.assertTrue(adminPages.BanUserButton.isEnabled());
    }
    // TC_03
    @Given("User is Blocked")
    public void user_is_blocked() {
        adminPages.BanUserButton.click();
    }
    @Given("The reason for blocking is entered and the OK button is pressed")
    public void the_reason_for_blocking_is_entered_and_the_ok_button_is_pressed() {
       adminPages.BanUserButtonReason.sendKeys("nedensiz");
       adminPages.BanUserButtonSubmit.click();
    }
    //TC_04
    @Given("Banned Users is clicked")
    public void banned_users_is_clicked() {
        adminPages.BannedUsers.click();

    }
    @Given("Filtering is done and the details of the blocked user are accessed")
    public void filtering_is_done_and_the_details_of_the_blocked_user_are_accessed() {
      adminPages.BannedUsersTextbox.sendKeys("yasemin");
      adminPages.BannedUsersBuyutec.click();
      adminPages.BannedUsersDetails.click();
    }
    @Given("The user's access status to the site is clearly displayed")
    public void the_user_s_access_status_to_the_site_is_clearly_displayed() {
      Assert.assertTrue(adminPages.BannedUserUnbanUser.isDisplayed());
    }

    // ********** US_048  **********



    // ********** US_049  **********
    @Given("Manage Users is clicked")
    public void manage_users_is_clicked() {
       adminPages.AdminManageUsersLink.click();
    }
    @Given("With Balance is clicked")
    public void with_balance_is_clicked() {
    adminPages.WithBalance.click();
    }
    @Given("Verifying that the list has been reached")
    public void verifying_that_the_list_has_been_reached() {

        String expectedUrl = "https://qa.loantechexper.com/admin/users/with-balance";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    // TC_02
    @Given("In the balance users list, the balance values of all users are displayed")
    public void ın_the_balance_users_list_the_balance_values_of_all_users_are_displayed() {
      Assert.assertTrue(adminPages.WithBalanList.isDisplayed());
    }
   // TC_03
   @Given("As an administrator, you should be able to select the desired user from the balance users list search box in the list")
   public void as_an_administrator_you_should_be_able_to_select_the_desired_user_from_the_balance_users_list_search_box_in_the_list() {
    adminPages.UserWithBalanceSearchbox.sendKeys("kaan");
    adminPages.UserWithBalanceAramaButton.click();
    adminPages.UserWithBalanceDetails.click();
   }
    @Given("Detailed information of the balance user listed should be accessible.")
    public void detailed_information_of_the_balance_user_listed_should_be_accessible() {
     Assert.assertTrue(adminPages.WithBalanceDetail1.isDisplayed());
     Assert.assertTrue(adminPages.WithBalanceDetail2.isDisplayed());
    }
    // ********** US_050  **********

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
    }

        // ********** US_037  **********
        @Then("admin Active Users linkine tiklar")
        public void adminActiveUsersLinkineTiklar() {
            adminPages.activeUsersButton.click();
        }
        @And("admin active Users linkinin gorunur ve aktif oldugunu dogrular")
        public void adminActiveUsersLinkininGorunurOldugunuDogrular() {
           Assert.assertTrue(adminPages.activeUsersLink.isDisplayed());
           Assert.assertTrue(adminPages.activeUsersLink.isEnabled());
        }
        @And("active Users listesi gorunur olmalidir")
        public void activeUsersListesiGorunurOlmalidir() {
          Assert.assertTrue(adminPages.approvedDepositsTable.isDisplayed());
        }
        @And("sayfada User Detail Username gorulmelidir")
        public void sayfadaUserDetailUsernameGorulmelidir() {
            Assert.assertTrue(adminPages.UserDetailUserNameText.isDisplayed());
        }

        @Then("admin Active Users Details butonuna tiklar")
        public void adminActiveUsersDetailsButonunaTiklar() {
            adminPages.ActiveUserDetailButton.click();
        }

        @Then("balance view all butonunun gorunur ve aktif oldugunu dogrular")
        public void balance_view_all_butonunun_gorunur_ve_aktif_oldugunu_dogrular() {
            Assert.assertTrue(adminPages.BalanceviewAllButton.isDisplayed());
            Assert.assertTrue(adminPages.BalanceviewAllButton.isEnabled());

        }
        @Then("view all butonunu tiklar ve Transaction Logs sayfasi gorulur")
        public void view_all_butonunu_tiklar_ve_transaction_logs_sayfasi_gorulur(){
            adminPages.BalanceviewAllButton.click();
           Assert.assertTrue(adminPages.TransactionLogsText.isDisplayed());

        }
        @Then("Liste ve liste basliklari goruntulenebilmelidir")
        public void liste_ve_liste_basliklari_goruntulenebilmelidir() {
            Assert.assertTrue(adminPages.TransactionLogsTable.isDisplayed());

        }
        @Then("Filtre ikonu gorunur ve aktif oldugu dogrulanir")
        public void filtre_ikonu_gorunur_ve_aktif_oldugu_dogrulanir() {
            Assert.assertTrue(adminPages.ViewAllFilterButton.isDisplayed());
            ReusableMethods.wait(3);
            Assert.assertTrue(adminPages.ViewAllFilterButton.isEnabled());
        }

        @And("Add Balance butonu gorunur ve aktif oldugunu dogrular")
        public void addBalanceButonuGorunurVeAktifOldugunuDogrular() {
            Assert.assertTrue(adminPages.AddBalanceButton.isDisplayed());
            ReusableMethods.wait(3);
            Assert.assertTrue(adminPages.AddBalanceButton.isEnabled());
            adminPages.AddBalanceButton.click();
            ReusableMethods.wait(3);
        }

        @Then("Amount text box gorunur olmalidir")
        public void amountTextBoxGorunurOlmalidir() {
           Assert.assertTrue(adminPages.AmountButton.isDisplayed());
           ReusableMethods.wait(3);

        }

        @And("Remark text box gorunur ve tiklanabilir  olmalidir")
        public void remarkTextBoxGorunurOlmalidir() {
            Assert.assertTrue(adminPages.RemarkButton.isDisplayed());
            ReusableMethods.wait(3);
            Assert.assertTrue(adminPages.RemarkButton.isEnabled());


        }

        @And("Amount Submit buttonu gorunur olmalidir ve tiklanir")
        public void amountSubmitButtonuGorunurOlmalidir() {
            Assert.assertTrue(adminPages.AmountSubmitButton.isDisplayed());
            ReusableMethods.wait(3);
            adminPages.AmountSubmitButton.click();

        }
        @Then("$x added succesfully yazisi goruntulenmelidir")
        public void $xAddedSuccesfullyYazisiGoruntulenmelidir() {
            Assert.assertTrue(adminPages.AddSuccesfullyButton.isDisplayed());
        }

        @And("amount textbox a {int} girin")
        public void amountTextboxAGirin(int miktar) {
            adminPages.AmountButton.click();
            adminPages.AmountButton.sendKeys(String.valueOf(miktar));
        }
        @And("Remark text box a {string} yazsin")
        public void remarkTextBoxAYazsin(String text) {
            adminPages.RemarkButton.sendKeys(text);
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

        @Then("manage users altindaki active users in gorunur oldugunu dogrular")
        public void manage_users_altindaki_active_users_in_gorunur_oldugunu_dogrular() {
            adminPages.manageUsersButton.click();
            ReusableMethods.wait(1);
            Assert.assertTrue(adminPages.activeUsersButton.isDisplayed());
        }
        @Then("active users linkine tiklar")
        public void active_users_linkine_tiklar() {
            ReusableMethods.wait(1);
            adminPages.activeUsersButton.click();
        }
        @Then("active uselari goruntuledigini dogrular")
        public void active_uselari_goruntuledigini_dogrular() {
            ReusableMethods.wait(1);
            Assert.assertTrue(adminPages.userListesi.get(1).isDisplayed());
        }
        @Then("kullanici secmek icin arama kutusuna kullanici adini girerek arama yapar")
        public void kullanici_secmek_icin_arama_kutusuna_kullanici_adini_girerek_arama_yapar() {
            adminPages.activeUserSearchBox.sendKeys("erengk");
            adminPages.activeUsersSearchIkon.click();
        }
        @Then("gelen kullanicida details kisminin goruntulendigini dogrular ve details a tiklar")
        public void gelen_kullanicida_details_kisminin_goruntulendigini_dogrular_ve_details_a_tiklar() {
            ReusableMethods.wait(1);
            Assert.assertTrue(adminPages.detailsButtonElement.isDisplayed());
            ReusableMethods.wait(1);
            adminPages.detailsButtonElement.click();
        }
        @Then("secilen kullanici bilgilerinin duzenlendigini test etmek icin ad ve soyad a ekleme yapar")
        public void secilen_kullanici_bilgilerinin_duzenlendigini_test_etmek_icin_ad_ve_soyad_a_ekleme_yapar() {
            adminPages.userFirstNameBox.sendKeys("e");
            ReusableMethods.wait(1);
            adminPages.userLastNameBox.sendKeys("deneme");
            ReusableMethods.wait(1);
        }
        @Then("kullanici duzenleme sayfasinda submite tiklar")
        public void kullanici_duzenleme_sayfasinda_submite_tiklar() {
            ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",adminPages.usersSubmitButon );
            ReusableMethods.wait(1);
            adminPages.usersSubmitButon.click();
        }
        @Then("onay yazisinin ciktigini dogrular")
        public void onay_yazisinin_ciktigini_dogrular() {
            ReusableMethods.wait(1);
            Assert.assertTrue(adminPages.usersConfirmElementi.isDisplayed());
            ReusableMethods.wait(1);
        }
        @Then("e postanin dogru oldugunu kontrol eder")
        public void e_postanin_dogru_oldugunu_kontrol_eder() {
            adminPages.userEmailBox.click();
            Assert.assertTrue(adminPages.userEmailBox.toString().contains("@"));
            //Assert.assertTrue(adminPages.userEmailBox.getText().endsWith(".com"));
            Assert.assertTrue(adminPages.userEmailBox.toString().length()>8);
            ReusableMethods.wait(1);


        }

        @And("e posta isim soyisim ve telefon numarasi kutularinin bos olmadigini test eder")
        public void ePostaIsimSoyisimVeTelefonNumarasiKutularininBosOlmadiginiTestEder() {
            ReusableMethods.wait(1);
            Assert.assertFalse(adminPages.userEmailBox.toString().isEmpty());
            Assert.assertFalse(adminPages.userPhoneNumberBox.toString().isEmpty());
            Assert.assertFalse(adminPages.userFirstNameBox.toString().isEmpty());
            Assert.assertFalse(adminPages.userLastNameBox.toString().isEmpty());
        }


    // ********** US_041  **********

        // ********** US_046  **********
      


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

        @And("baslik kisminda doldurulmasi gereken bosluklar doldurulmadiginda uyari yazisi cikar")
        public void baslikKismindaDoldurulmasiGerekenBosluklarDoldurulmadigindaUyariYazisiCikar() throws IOException {
            ReusableMethods.wait(2);
            String resim =ReusableMethods.getScreenshot("uyari");
            //Assert.assertTrue();
        }
        @Then("admin tempmail urle gider")
        public void adminTempmailUrleGider() {
            Driver.getDriver().get(ConfigReader.getProperty("tempMailUrl"));
        }
        @When("gonderilen mailin basligin {string} oldugunu dogrular")
        public void gonderilenMailinBasliginOldugunuDogrular(String baslik) {
            ReusableMethods.wait(20);
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Assert.assertTrue(adminPages.tempMailMailBox.getText().contains(baslik));
        }

        // ********** US_051  **********
        @Then("admin Pending Deposits linkine tiklar")
        public void adminPendingDepositsLinkineTiklar() {
            adminPages.PendingDepositsLink.click ();
        }

        @Then("admin approve reject butonlarinin gorunur ve aktif oldugunu dogrular")
        public void adminApproveRejectButonlarininGorunurVeAktifOldugunuDogrular() {
            Assert.assertTrue (adminPages.PendingDepositApproveButton.isDisplayed ());
            Assert.assertTrue (adminPages.PendingDepositApproveButton.isEnabled ());
            Assert.assertTrue (adminPages.PendingDepositRejectionButton.isDisplayed ());
            Assert.assertTrue (adminPages.PendingDepositRejectionButton.isEnabled ());

        }
        @And("admin approve  butonuna tiklar ve cikan uyari sayfasindan yes butonuna basar")
        public void adminApproveButonunaTiklarVeCikanUyariSayfasindanYesButonunaBasar() {
            adminPages.PendingDepositApproveButton.click();
            ReusableMethods.wait(3);
            adminPages.PendingDepositYesButton.click();

        }

        @Then("admin approve yaptiktan sonra cikan alert yazisini goruntulendigini dogrular")
        public void adminApproveYaptiktanSonraCikanAlertYazisiniGoruntulendiginiDogrular() {
            Assert.assertTrue(adminPages.PendingAlertText.isDisplayed());
        }

        @And("admin reject e bastiktan sonra cikan kutuya {string} yazar")
        public void adminRejectEBastiktanSonraCikanKutuyaRedddetmeSebebiniYazar(String Sebep) {
            adminPages.PendingAlertRejectBox.sendKeys(Sebep);
        }

        @Then("cikan kutu kapatilir")
        public void cikanKutuKapatilir() {
            adminPages.PendingAlertSubmitButton.click();
        }

        @Then("kullanici deposit linkine tiklar ve odeme seklini secer")
        public void kullaniciDepositLinkineTiklarVeOdemeSekliniSecer() {
            userPages.depositButton.click();
            ReusableMethods.wait(5);
            select = new Select( userPages.selectGateway);
            select.selectByVisibleText("Manual");



        }

        @And("kullanici miktari {int} girer ve submit tusuna basar")
        public void kullaniciMiktariGirerVeSubmitTusunaBasar(int miktar) {
            userPages.amountBox.sendKeys(String.valueOf(miktar));
            userPages.depositSubmitButton.click();
            ReusableMethods.wait(5);
            userPages.depositSubmitButton.click();
            kisiselTransactionNo = userPages.depositTransactionNo.getText();


        }


        @Then("admin secilen kullanicinin details butonuna tiklar")
        public void adminSecilenKullanicininDetailsButonunaTiklar() {
            adminPages.detailsButton.click();
            }




        @And("{int} saniye bekler")
        public void saniyeBekler(int bekleme) {
            ReusableMethods.wait(bekleme);
        }


        




    // ********** US_051  **********
      
      
    // ********** US_052  **********


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
        @And("admin approve  butonuna tiklar")
        public void adminApproveButonunaTiklar() {
        }

        //*****56*****

        @Given("Given kullanici verilen {string} gider")
        public void given_kullanici_verilen_gider(String string) {

        }
        @Then("All Deposits linkine tiklar")
        public void all_deposits_linkine_tiklar() {
            adminPages.AllDepositsLink.click();

        }
        @Then("search box ve Start Date - End Date search box görünür ve aktif olmalı")
        public void search_box_ve_start_date_end_date_search_box_görünür_ve_aktif_olmalı() {

            Assert.assertTrue(adminPages.StartEndDateBox.isDisplayed());
            Assert.assertTrue(adminPages.StartEndDateBox.isEnabled());

            ReusableMethods.wait(1);


        }
        @Then("Successful Deposit','Pending Deposit','Rejected Deposit','Initiated Deposit' özet box'ları görünür ve aktif olmalı tiklanabilmeli")
        public void successful_deposit_pending_deposit_rejected_deposit_ınitiated_deposit_özet_box_ları_görünür_ve_aktif_olmalı_tiklanabilmeli() {}

        // ********** US_056  **********


        // ********** US_057  **********


        // ********** US_058  **********


        // ********** US_059  **********

        @Given("The user goes to the given {string} and login in to the adminpage with the given {string} and {string} information")
        public void the_user_goes_to_the_given_and_login_in_to_the_adminpage_with_the_given_and_information(String url, String username, String password) {
            ReusableMethods.navigateToTheRequestedUrl(url);
            adminPages.adminLoginMethod(username,password);
        }
        @Given("In the admin panel, it is confirmed that the Pending Withdrawals page under the title of the Menu on the Side bar is confirmed")
        public void ın_the_admin_panel_it_is_confirmed_that_the_pending_withdrawals_page_under_the_title_of_the_menu_on_the_side_bar_is_confirmed() {
            adminPages.withdrawalsSidebarLink.click();
            adminPages.pendingWithdrawalsSidebarLink.click();
            Assert.assertTrue(adminPages.pendingWithdrawalsTitle.isDisplayed());
        }
        @Given("On the page, the Pending Withdrawals list should be displayed, the list is confirmed that Gateway, Initiated, User , Amount , Conversion , Status, Action and the information below is confirmed")
        public void on_the_page_the_pending_withdrawals_list_should_be_displayed_the_list_is_confirmed_that_gateway_ınitiated_user_amount_conversion_status_action_and_the_information_below_is_confirmed() {
            Assert.assertTrue(adminPages.gatewayHeader.isDisplayed());
            Assert.assertTrue(adminPages.initiatedHeader.isDisplayed());
            Assert.assertTrue(adminPages.userHeader.isDisplayed());
            Assert.assertTrue(adminPages.amountHeader.isDisplayed());
            Assert.assertTrue(adminPages.conversionHeader.isDisplayed());
            Assert.assertTrue(adminPages.statusHeader.isDisplayed());
            Assert.assertTrue(adminPages.actionHeader.isDisplayed());
            Assert.assertTrue(adminPages.gatewayData.isDisplayed());
            Assert.assertTrue(adminPages.initiatedData.isDisplayed());
            Assert.assertTrue(adminPages.userData.isDisplayed());
            Assert.assertTrue(adminPages.amountData.isDisplayed());
            Assert.assertTrue(adminPages.conversionData.isDisplayed());
            Assert.assertTrue(adminPages.statusData.isDisplayed());
            Assert.assertTrue(adminPages.actionData.isDisplayed());
        }
        @Given("In order to reach and reject reject the selected payment process selected from the list, click the Details button under the Action title and the User Withdraw Information title is displayed")
        public void ın_order_to_reach_and_reject_reject_the_selected_payment_process_selected_from_the_list_click_the_details_button_under_the_action_title_and_the_user_withdraw_ınformation_title_is_displayed() {
            adminPages.actionData.click();
            Assert.assertTrue(adminPages.userWithdrawInformationTitle.isDisplayed());

        }
        @Given("For the payment process on the Details page, clicking the Approve button is opened in the window that opens Textbox a random, a sentence is entered and clicked on the submit button and confirmed that  the Withdrowal approved successfully alert appears")
        public void for_the_payment_process_on_the_details_page_clicking_the_approve_button_is_opened_in_the_window_that_opens_textbox_a_random_a_sentence_is_entered_and_clicked_on_the_submit_button_and_confirmed_that_the_withdrowal_approved_successfully_alert_appears() {
            adminPages.approveWithdrowButton.click();
            Faker faker=new Faker();
            adminPages.withdrowalApproveOrRejectTextBox.sendKeys(faker.lorem().sentence(5));
            adminPages.withdrowalApproveOrRejectSubmit.click();
            ReusableMethods.wait(2);
            Assert.assertTrue(adminPages.successfullyApproveWithdrawalConfirmation.getText().contains("Withdrawal approved successfully"));





        }



        //*****57*****
        @Then("admin Withdrawal menu basligini goruntulenmelidir ve tiklamalidir")
        public void admin_withdrawal_menu_basligini_goruntulenmelidir_ve_tiklamalidir() {
            Assert.assertTrue(adminPages.Withdrawalslink.isDisplayed());
            adminPages.Withdrawalslink.click();
        }
        @Then("Withdrawals method linkini goruntulenmelidir ve aktif olmalidir")
        public void withdrawals_method_linkini_goruntulenmelidir_ve_aktif_olmalidir() {
            Assert.assertTrue(adminPages.WithdrawalMethodsLink.isDisplayed());
            Assert.assertTrue(adminPages.WithdrawalMethodsLink.isEnabled());

        }
        @Then("Pending Withdrawals method linkini goruntulenmelidir ve aktif olmalidir")
        public void pending_withdrawals_method_linkini_goruntulenmelidir_ve_aktif_olmalidir() {
            Assert.assertTrue(adminPages.PendingWithdrawalsLink.isDisplayed());
            Assert.assertTrue(adminPages.PendingWithdrawalsLink.isEnabled());

        }
        @Then("Approved Withdrawals method linkini goruntulenmelidir ve aktif olmalidir")
        public void approved_withdrawals_method_linkini_goruntulenmelidir_ve_aktif_olmalidir() {
            Assert.assertTrue(adminPages.ApprovedWithdrawalsLink.isDisplayed());
            Assert.assertTrue(adminPages.ApprovedWithdrawalsLink.isEnabled());

        }
        @Then("Rejected Withdrawals method linkini goruntulenmelidir ve aktif olmalidir")
        public void rejected_withdrawals_method_linkini_goruntulenmelidir_ve_aktif_olmalidir() {
            Assert.assertTrue(adminPages.RejectedWithdrawalLink.isDisplayed());
            Assert.assertTrue(adminPages.RejectedWithdrawalLink.isEnabled());

        }
        @Then("All Withdrawals method linkini goruntulenmelidir ve aktif olmalidir")
        public void all_withdrawals_method_linkini_goruntulenmelidir_ve_aktif_olmalidir() {
            Assert.assertTrue(adminPages.AllWithdrawalLink.isDisplayed());
            Assert.assertTrue(adminPages.AllWithdrawalLink.isEnabled());}

        @Given("It is confirmed that on the Pending withdrwals table, it can be searched with Username Transaction No and Start Date  End Date information")
        public void ıt_is_confirmed_that_on_the_pending_withdrwals_table_it_can_be_searched_with_username_transaction_no_and_start_date_end_date_information() {

            adminPages.searchTransaction.click();
            adminPages.searchTransaction.sendKeys(adminPages.transactionNo.getText());
            adminPages.searchTransactionButton.click();
            ReusableMethods.wait(3);
            adminPages.searchTransaction.clear();
            adminPages.searchTransactionButton.click();
            ReusableMethods.wait(3);
            adminPages.searchStartDataEndData.click();
            adminPages.searchStartDataEndData.sendKeys("12/01/2023 - 12/20/2023");
            adminPages.searchStartDataEndDataButton.click();
            ReusableMethods.wait(3);
            adminPages.searchStartDataEndData.clear();
            adminPages.searchStartDataEndDataButton.click();


        }




        // ********** US_060  **********



        @Given("On the admin panel, it is confirmed that the Approved withdrawals page can be accessed under the title of the Menu on the Side Bar")
        public void on_the_admin_panel_it_is_confirmed_that_the_approved_withdrawals_page_can_be_accessed_under_the_title_of_the_menu_on_the_side_bar() {
            adminPages.withdrawalsSidebarLink.click();
            adminPages.approvedWithdrawalsSideBarLink.click();
            Assert.assertTrue(adminPages.approveWithdrawalsTitle.isDisplayed());

        }
        @Given("On the page, Approved withdrawals list should be displayed, the list Gateway, Initiated, User , Amount , Conversion ,Status, Action headlines and below information is confirmed to be visible")
        public void on_the_page_approved_withdrawals_list_should_be_displayed_the_list_gateway_ınitiated_user_amount_conversion_status_action_headlines_and_below_information_is_confirmed_to_be_visible() {
            Assert.assertTrue(adminPages.gatewayHeader.isDisplayed());
            Assert.assertTrue(adminPages.initiatedHeader.isDisplayed());
            Assert.assertTrue(adminPages.userHeader.isDisplayed());
            Assert.assertTrue(adminPages.amountHeader.isDisplayed());
            Assert.assertTrue(adminPages.conversionHeader.isDisplayed());
            Assert.assertTrue(adminPages.statusHeader.isDisplayed());
            Assert.assertTrue(adminPages.actionHeader.isDisplayed());
            Assert.assertTrue(adminPages.gatewayData.isDisplayed());
            Assert.assertTrue(adminPages.initiatedData.isDisplayed());
            Assert.assertTrue(adminPages.userData.isDisplayed());
            Assert.assertTrue(adminPages.amountData.isDisplayed());
            Assert.assertTrue(adminPages.conversionData.isDisplayed());
            Assert.assertTrue(adminPages.statusData.isDisplayed());
            Assert.assertTrue(adminPages.actionData.isDisplayed());
        }

        @Given("In order to reach the details of the accepted payment process selected from the list, it is confirmed that the Details page is accessible under the Action title")
        public void ın_order_to_reach_the_details_of_the_accepted_payment_process_selected_from_the_list_it_is_confirmed_that_the_details_page_is_accessible_under_the_action_title() {
            adminPages.actionData.click();
            Assert.assertTrue(adminPages.userWithdrawInformationTitle.isDisplayed());
            Driver.getDriver().navigate().back();

        }

        // ********** US_061  **********
        @Given("In the admin panel, it is confirmed that the Rejected Withdrawals page can be accessed under the title of the Menu on the Side Bar")
        public void ın_the_admin_panel_it_is_confirmed_that_the_rejected_withdrawals_page_can_be_accessed_under_the_title_of_the_menu_on_the_side_bar() {
            adminPages.withdrawalsSidebarLink.click();
            adminPages.rejectedWithdrawalsSideBarLink.click();
            Assert.assertTrue(adminPages.rejectedWithdrawalsTitle.isDisplayed());
        }
        @Given("On the page, the list of Rejected Withdrawals should be displayed, the list Gateway, Initiated, User , Amount , Conversion , Status, Action headlines and below information is confirmed that the information below is visible")
        public void on_the_page_the_list_of_rejected_withdrawals_should_be_displayed_the_list_gateway_ınitiated_user_amount_conversion_status_action_headlines_and_below_information_is_confirmed_that_the_information_below_is_visible() {
            Assert.assertTrue(adminPages.gatewayHeader.isDisplayed());
            Assert.assertTrue(adminPages.initiatedHeader.isDisplayed());
            Assert.assertTrue(adminPages.userHeader.isDisplayed());
            Assert.assertTrue(adminPages.amountHeader.isDisplayed());
            Assert.assertTrue(adminPages.conversionHeader.isDisplayed());
            Assert.assertTrue(adminPages.statusHeader.isDisplayed());
            Assert.assertTrue(adminPages.actionHeader.isDisplayed());
            Assert.assertTrue(adminPages.gatewayData.isDisplayed());
            Assert.assertTrue(adminPages.initiatedData.isDisplayed());
            Assert.assertTrue(adminPages.userData.isDisplayed());
            Assert.assertTrue(adminPages.amountData.isDisplayed());
            Assert.assertTrue(adminPages.conversionData.isDisplayed());
            Assert.assertTrue(adminPages.statusData.isDisplayed());
            Assert.assertTrue(adminPages.actionData.isDisplayed());
        }


   // ********** US_058  **********


    @Given("admin enters {string} and {string} information where necessary.")
    public void admin_enters_and_information_where_necessary(String string, String string2) {
        adminPages.adminUsernameBox.sendKeys("selimebeyza");
        adminPages.adminPasswordBox.sendKeys("123123123");
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


    @Given("Approved Withdrawals,Pending Withdrawals,Rejected Withdrawals links are displayed")
    public void approved_withdrawals_pending_withdrawals_rejected_withdrawals_links_are_displayed() {
        Assert.assertTrue(adminPages.approvedWithdrawals.isDisplayed());
        Assert.assertTrue(adminPages.pendingWithdrawals.isDisplayed());
        Assert.assertTrue(adminPages.rejectedWithdrawals.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("Click on the Approved Withdrawals link")
    public void click_on_the_approved_withdrawals_link() {
        adminPages.approvedWithdrawals.click();

    }
    @Given("The details button on the Approved Withdrawals page is displayed")
    public void the_details_button_on_the_approved_withdrawals_page_is_displayed() {
        String expectedValue= "Approved Withdrawals";
        String actualValue= adminPages.pageTitlePendingWithdrawals.getText();
        Assert.assertEquals(expectedValue,actualValue);

    }
    @Given("Clicks on the details button")
    public void clicks_on_the_details_button() {
        adminPages.searchBox.sendKeys("hilal");
        adminPages.searchBoxButton.click();
        ReusableMethods.wait(3);
        adminPages.detailsuserCardInformation.click();


    }
    @Given("The information in the card is displayed.")
    public void the_information_in_the_card_is_displayed() {
        Assert.assertTrue(adminPages.userCardInformation.isDisplayed());

    }

    @Given("Click on the Pending Withdrawn button")
    public void click_on_the_pending_withdrawn_button() {
        adminPages.pendingWithdrawals.click();


    }
    @Given("Confirms the visibility of the pending and details buttons on this page.")
    public void confirms_the_visibility_of_the_pending_and_details_buttons_on_this_page() {
        String expectedValue= "Pending Withdrawals";
        String actualValue= adminPages.pwPageTittle.getText();
        Assert.assertEquals(expectedValue,actualValue);

    }
    @Given("Click on details button on the page that opens")
    public void click_on_details_button_on_the_page_that_opens() {
        adminPages.searchBox.sendKeys("hilal");
        adminPages.searchBoxButton.click();
        ReusableMethods.wait(3);
        adminPages.detailsuserCardInformation.click();


    }
    @Given("Verifies the visibility of the Approve, Reject buttons on the page that opens")
    public void verifies_the_visibility_of_the_buttons_on_the_page_that_opens() {
       Assert.assertTrue(adminPages.pwApproveButton.isDisplayed());
       Assert.assertTrue(adminPages.pwRejectButton.isDisplayed());
       ReusableMethods.wait(3);


    }
    @Given("Click on the Reject button on the page, fill in the required field and click on the submit button")
    public void click_on_the_button_on_the_page_fill_in_the_required_field_and_click_on_the_submit_button() {
        adminPages.pwRejectButton.click();
        adminPages.rejectionTextArea.sendKeys(ConfigReader.getProperty("rejectionReason"));
        adminPages.rejectionSubmitButton.click();
        ReusableMethods.wait(3);


    }
    @Given("Withdrawal rejected successfully is displayed")
    public void withdrawal_rejected_successfully_is_displayed() {
        Assert.assertTrue(adminPages.rejecteedSuccesffulyMesaggeText.isDisplayed());
        ReusableMethods.wait(3);
    }

    @Given("Click on the Approved button on the page, fill in the required fields and press the submit button")
    public void click_on_the_approved_button_on_the_page_fill_in_the_required_fields_and_press_the_submit_button() {
        adminPages.pwApproveButton.click();
        adminPages.approvedTextArea.sendKeys(ConfigReader.getProperty("approvedReason"));
        adminPages.approvedSubmitButton.click();
        ReusableMethods.wait(3);


    }
    @Given("Withdrawal approved successfully is displayed")
    public void withdrawal_approved_successfully_is_displayed() {
        Assert.assertTrue(adminPages.approvedSuccesffulyMesaggeText.isDisplayed());

    }
    @Given("Click on the Rejected Withdrawals link")
    public void click_on_the_rejected_withdrawals_link() {
        adminPages.rejectedWithdrawals.click();


    }
    @Given("It is seen that the status is Rejected")
    public void ıt_is_seen_that_the_status_is_rejected() {
        String expectedValue= "Rejected";
        String actualValue= adminPages.statusReject.getText();
        Assert.assertEquals(expectedValue,actualValue);

    }




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

   // @Then("sayfayi kapatir")

    @Then("notification sayfasinda submit butonuna basar")
    public void notification_sayfasinda_submit_butonuna_basar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        adminPages.notificationSubmitButton.click();
        ReusableMethods.wait(10);
    }

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

    @And("baslik kisminda doldurulmasi gereken bosluklar doldurulmadiginda uyari yazisi cikarr")
    public void baslikKismindaDoldurulmasiGerekenBosluklarDoldurulmadigindaUyariYazisiCikarr() {
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
        adminPages.approvedDepositsLink.click();

    }

    @And("admin mevcut sayfa uzantisinin {string} oldugunu dogrular")
    public void adminMevcutSayfaUzantisininOldugunuDogrular(String urlUzanti) {
        String actualData=Driver.getDriver().getCurrentUrl();
        String expectedData=ConfigReader.getProperty("guestUrl")+urlUzanti;
        Assert.assertEquals(expectedData,actualData);
    }


    @And("admin Approved Depoits listesinin goruntulenebilir oldugunu dogrular")
    public void adminApprovedDepoitsListesininGoruntulenebilirOldugunuDogrular() {
        System.out.println("Deposit table "+adminPages.approvedDepositsTable.getText());
        Assert.assertTrue(adminPages.approvedDepositsTable.isDisplayed());
    }
    @When("admin Approved Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular")
    public void admin_approved_deposits_listesindeki_basliklarin_ve_altindaki_bilgilerin_goruntulenebilir_oldugunu_dogrular() {
        System.out.println("headers "+adminPages.approvedDepositsLinkHeaders.getText());
        Assert.assertTrue(adminPages.approvedDepositsLinkHeaders.isDisplayed());
        Assert.assertTrue(adminPages.approvedDepositsTable.isDisplayed());
    }




    // ********** US_051  **********



    // ********** US_052  **********



    // ********** US_053  **********



    // ********** US_054  **********



    // ********** US_055  *********

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


