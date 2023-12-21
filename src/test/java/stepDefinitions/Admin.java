package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class Admin {
    AdminPages adminPages=new AdminPages();

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

   // ********** US_058  **********


    @Given("admin enters {string} and {string} information where necessary.")
    public void admin_enters_and_information_where_necessary(String string, String string2) {
        adminPages.adminUsernameBox.sendKeys("selimebeyza");
        adminPages.adminPasswordBox.sendKeys("123123123");

    }
    @Then("he clicks the login button and logs in successfully as admin.")
    public void he_clicks_the_login_button_and_logs_in_successfully_as_admin() {
        adminPages.adminLoginButon.click();
        ReusableMethods.wait(1);
    }
    @Then("click on the Withdrawal button and then the Withdrawal Methods button.")
    public void click_on_the_withdrawal_button_and_then_the_withdrawal_methods_button() {
    adminPages.withdrawalsButton.click();
    adminPages.withdrawalsMethodsButton.click();
    ReusableMethods.wait(1);
    }
    @Then("it is tested that the Withdrawal Methods page can be accessed.")
    public void it_is_tested_that_the_withdrawal_methods_page_can_be_accessed() {
        Assert.assertTrue(adminPages.withdrawalsMethodsPage.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("it tests whether it can display the Method, Currency, Charge, Withdraw Limit, Status information.")
    public void it_tests_whether_it_can_display_the_method_currency_charge_withdraw_limit_status_information() {
        Assert.assertTrue(adminPages.withdrawalsMethodsPage.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("it tests whether it can reach the edit page under the action heading.")
    public void it_tests_whether_it_can_reach_the_edit_page_under_the_action_heading() {
        adminPages.withdrawalsActionEdit.click();
        Assert.assertTrue(adminPages.updateWithdrawalMethodPage.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("clicks on the edit page under the action link.")
    public void clicks_on_the_edit_page_under_the_action_link() {
        adminPages.withdrawalsActionEdit.click();
        ReusableMethods.wait(1);
    }
    @Then("it tests whether it can update.")
    public void it_tests_whether_it_can_update() {
        Assert.assertTrue(adminPages.withdrawMethodUpdatedSuccesfully.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("the visibility of the method selected under the action heading is tested.")
    public void the_visibility_of_the_method_selected_under_the_action_heading_is_tested() {
        Assert.assertTrue(adminPages.withdrawEnable.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("click on the add new button and fill in the necessary information.")
    public void click_on_the_add_new_button_and_fill_in_the_necessary_information() {
        adminPages.withdrawAddNew.click();
        adminPages.newWithdrawalMethodName.sendKeys("beyza korumaz");
        adminPages.newWithdrawalMethodCurrency.sendKeys("IT");
        adminPages.newWithdrawalMethodRate.sendKeys("20");
        adminPages.newWithdrawalMethodMinimumAmount.sendKeys("100");
        adminPages.newWithdrawalAmount.sendKeys("1000");
        adminPages.fixedCharge.sendKeys("100");
        adminPages.percentCharge.sendKeys("1000");

    }
    @Then("click on the Submit button.")
    public void click_on_the_submit_button() {
        adminPages.newWithdrawalMethodSubmit.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.succesfullyText.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("closes the page.")
    public void closes_the_page() {
        Driver.closeDriver();
    }


    // ********** US_062  **********

    @Then("click on the Withdrawals button and then the All Withdrawals link.")
    public void click_on_the_withdrawals_button_and_then_the_all_withdrawals_link() {
    adminPages.withdrawalsButton.click();
    adminPages.allWithdrawals.click();
    ReusableMethods.wait(1);
    }
    @Then("it tests whether it can view the Withdrawals Log page in the All Withdrawals link.")
    public void it_tests_whether_it_can_view_the_withdrawals_log_page_in_the_all_withdrawals_link() {
        Assert.assertTrue(adminPages.WithdrawalsLogPage2.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("it is tested whether the titles Gateway, Initiated, User, Amount, Conversion, Status, Action are displayed in the Withdrawals Log list.")
    public void it_is_tested_whether_the_titles_gateway_ınitiated_user_amount_conversion_status_action_are_displayed_in_the_withdrawals_log_list() {
        Assert.assertTrue(adminPages.gatewayTransaction.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("Withdrawals Log sayfasında Username,Transaction No ve Start Date, End Date bilgileri ile arama yapilabileceği test edilir.")
    public void withdrawals_log_sayfasında_username_transaction_no_ve_start_date_end_date_bilgileri_ile_arama_yapilabileceği_test_edilir() {
        Assert.assertTrue(adminPages.gatewayTransaction.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Then("it is tested that you can search with Username, Transaction No, Start Date, End Date information on the Withdrawals Log page.")
    public void it_is_tested_that_you_can_search_with_username_transaction_no_start_date_end_date_information_on_the_withdrawals_log_page() {
        adminPages.details.click();
        ReusableMethods.wait(1);

    }

    @Then("it tests whether it can access the details page under the action heading for the details of the payment transactions on the Withdrawals Log page.")
    public void it_tests_whether_it_can_access_the_details_page_under_the_action_heading_for_the_details_of_the_payment_transactions_on_the_withdrawals_log_page() {

        Assert.assertTrue(adminPages.detailsPage.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Then("on the Withdrawals Log page, click on details under the action heading to accept or reject the payment transaction.")
    public void on_the_withdrawals_log_page_click_on_details_under_the_action_heading_to_accept_or_reject_the_payment_transaction() {
        adminPages.details.click();
        ReusableMethods.wait(1);

    }
    @Then("it tests whether it can access the details page under the action heading to accept or reject the payment transaction on the Withdrawals Log page.")
    public void it_tests_whether_it_can_access_the_details_page_under_the_action_heading_to_accept_or_reject_the_payment_transaction_on_the_withdrawals_log_page() {
        adminPages.details.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.detailsPage.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Then("it is tested that the Withdrawals Log page contains Approved Withdrawals, Pending Withdrawals, Rejected Withdrawals and redirects to the required page.")
    public void it_is_tested_that_the_withdrawals_log_page_contains_approved_withdrawals_pending_withdrawals_rejected_withdrawals_and_redirects_to_the_required_page() {

        adminPages.approvedWithdrawals2.click();
        Assert.assertTrue(adminPages.approvedWithdrawalsPage.isDisplayed());
        ReusableMethods.wait(2);
        adminPages.rejectedWithdrawals2.click();
        Assert.assertTrue(adminPages.rejectedWithdrawalsPage.isDisplayed());
        ReusableMethods.wait(2);
        adminPages.pendingWithdrawals2.click();
        Assert.assertTrue(adminPages.pendingWithdrawalsPage.isDisplayed());
        ReusableMethods.wait(2);
    }











}
