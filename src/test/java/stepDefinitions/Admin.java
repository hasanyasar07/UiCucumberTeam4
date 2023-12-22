package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.awt.*;

public class Admin {
    AdminPages adminPages=new AdminPages();
    Select select;
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")
    public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
        adminPages.adminLoginMethod(username,password);
    }

    // ********** US_025  **********



    // ********** US_026  **********



    // ********** US_027  **********



    // ********** US_028  **********



    // ********** US_029  **********



    // ********** US_030  **********



    // ********** US_031  **********



    // ********** US_032 HILAL **********

    @Given("Launch browser")
    public void launch_browser() {

    }
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
        Assert.assertTrue(adminPages.depositApprovedMessage.isDisplayed());

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
        ReusableMethods.wait(1);

    }
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
    @Then("notification sayfasinda submit butonuna basar")
    public void notification_sayfasinda_submit_butonuna_basar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        adminPages.notificationSubmitButton.click();
        ReusableMethods.wait(10);
    }

   // @Then("sayfayi kapatir")
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
        System.out.println(Driver.getDriver().switchTo().alert().toString());
    }

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



    // ********** US_055  **********



}
