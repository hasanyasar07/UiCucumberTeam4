package stepDefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
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
       adminPages.LoanPlansName.sendKeys("Kredi1");
       adminPages.LoanPlansTitle.sendKeys("yasemin");
       adminPages.LoanPlansMinimumAmount.sendKeys("1000");
       adminPages.LoanPlansMaximumAmount.sendKeys("5000");
        // adminPages.LoanPlansCategory.sendKeys();
        adminPages.LoanPlansPerInstallment.sendKeys("10");
        adminPages.LoanPlansInstallmentInterval.sendKeys("28");
        adminPages.LoanPlansTotalInstallments.sendKeys("36");
        adminPages.LoanPlansFixedCharge.sendKeys("100");
        adminPages.LoanPlansApplicationFixedCharge.sendKeys("5");
        adminPages.LoanPlansChargeWillApplyIfDelay.sendKeys("1");
        adminPages.LoanPlansFixedCharge.sendKeys("5");
        adminPages.LoanPlansApplicationPercentCharge.sendKeys("5");

    }
    @Given("After the information is entered, the submit button is clicked")
    public void after_the_information_is_entered_the_submit_button_is_clicked() {
        adminPages.LoanPlansAddNewSubmit.submit();
    }
    @Given("You will receive a warning that the new credit plan has been added successfully")
    public void you_will_receive_a_warning_that_the_new_credit_plan_has_been_added_successfully() {
       Assert.assertTrue(adminPages.LoanPlanYeniPlanEklendi.isDisplayed());

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
    @Given("Click on the Submit button")
    public void click_on_the_submit_button() {
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



    // ********** US_051  **********



    // ********** US_052  **********



    // ********** US_053  **********



    // ********** US_054  **********



    // ********** US_055  **********



}
