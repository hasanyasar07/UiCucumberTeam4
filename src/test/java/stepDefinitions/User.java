
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.GuestPages;
import pages.UserPages;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

public class User {

    // ********** Login  **********
    GuestPages guestPages = new GuestPages();
    UserPages userPages = new UserPages();

    @Given("kullanici verilen {string} gider")
    public void kullanici_verilen_gider(String url) {

        

       userPages.istenilenUrlGitme(url);

       ReusableMethods.wait(2);

    }

    @Given("kullanici verilen {string} ve {string} bilgileri ile userpage de login olur")
    public void kullanici_verilen_ve_bilgileri_ile_userpage_de_login_olur(String username, String password) {
        userPages.userLoginMethod(username, password);
    }

    // ********** US_013  **********
    @Given("kullanici verilen url e gittikten sonra login butonunun gorunur oldugunu test eder ve login butonuna tiklar")
    public void kullanici_verilen_url_e_gittikten_sonra_login_butonunun_gorunur_oldugunu_test_eder_ve_login_butonuna_tiklar() {
        Assert.assertTrue(guestPages.guestPageLoginButton.isDisplayed());
        ReusableMethods.wait(1);
        guestPages.guestPageLoginButton.click();
    }

    @Then("acilan login sayfasinda login formunun gorunur oldugunu test eder")
    public void acilan_login_sayfasinda_login_formunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.loginForm.isDisplayed());
    }

    @And("login formunun icerisindeki Username textbox,Password textbox,Remember Me checkbox,Forgot password? link elementi,Login Butonlarinin gorunur oldugunu test eder")
    public void loginFormununIcerisindekiUsernameTextboxPasswordTextboxRememberMeCheckboxForgotPasswordLinkElementiLoginButonlarininGorunurOldugunuTestEder() {
        userPages.loginFormDogrulama();
    }

    @Then("Remember Me checkbox a tiklar")
    public void remember_me_checkbox_a_tiklar() {
        ReusableMethods.wait(1);
        userPages.rememberMeButon.click();
    }

    @And("basarili bir sekilde user olarak login oldugunu dogrular")//user olarak basarili login test etme step
    public void basariliBirSekildeUserOlarakLoginOldugunuDogrular() {
        Assert.assertTrue(userPages.yesilDepositButon.isDisplayed());
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("These credentials do not match our records yazisini gorup giris yapamadigini dogrular")
    public void These_credentials_do_not_match_our_records_yazisini_gorup_giris_yapamadigini_dogrular() {
        userPages.loginBoxTemizleme();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.yanlisGirisUyariElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("login sayfasinda bulunan register now linkinin gorunur oldugunu dogrular ve linke tiklar")
    public void login_sayfasinda_bulunan_register_now_linkinin_gorunur_oldugunu_dogrular_ve_linke_tiklar() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", userPages.WelcomeBackYaziElementi);
        Assert.assertTrue(userPages.registerNow.isDisplayed());
        ReusableMethods.wait(1);
        userPages.registerNow.click();
    }

    @Then("acilan sayfanin register now sayfasi oldugunu dogrular")
    public void acilan_sayfanin_register_now_sayfasi_oldugunu_dogrular() {
        Assert.assertTrue(userPages.registerNowForm.isDisplayed());
    }



    @Then("forgot password linkinin gorunur oldugunu dogrular ve linke tiklar")
    public void forgot_password_linkinin_gorunur_oldugunu_dogrular_ve_linke_tiklar() {
        ReusableMethods.wait(1);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(userPages.forgotPassword.isDisplayed());
        ReusableMethods.wait(1);
        userPages.forgotPassword.click();

    }
    @Then("verify email sayfasina gectigini dogrular")
    public void verify_email_sayfasina_gectigini_dogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.verifyEmail.isDisplayed());
    }
    @Then("textBox'a Username email adresi girer ve submit butonuna tiklar")
    public void text_box_a_username_email_adresi_girer_ve_submit_butonuna_tiklar() {
        ReusableMethods.wait(1);
        userPages.forgotPasswordUsernameBox.sendKeys("pekah72328@getmola.com");
        ReusableMethods.wait(1);
        userPages.forgotPasswordSubmitBox.click();
    }
    @Then("Submit butonu tiklandiginda Password reset email sent successfully yazisini gordugunu test eder")
    public void submit_butonu_tiklandiginda_Password_reset_email_sent_successfullyyazisini_gordugunu_test_eder() {
        Assert.assertTrue(userPages.passwordResetSucces.isDisplayed());
    }

    @Then("Try to send again link elementi tiklandiginda  user password reset sayfasina yonlendirildigini dogrular")
    public void tryToSendAgainLinkElementiTiklandigindaUserPasswordResetSayfasinaYonlendirildiginiDogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.forgotPasswordTryToSendAgain.isDisplayed());
    }


    // ********** US_014  **********
    @Given("kullanici verilen url e gittikten sonra login login butonuna tiklar.")
    public void kullanici_verilen_url_e_gittikten_sonra_login_login_butonuna_tiklar() {
        guestPages.guestPageLoginButton.click();
        ReusableMethods.wait(1);
    }


    @Then("Clicks on the button and profile link where he can see his profile.")
    public void clicks_on_the_button_and_profile_link_where_he_can_see_his_profile() {
        userPages.profileButton.click();
        ReusableMethods.wait(1);

    }

    @Then("It edits the state, address and city fields.")
    public void ıt_edits_the_state_address_and_city_fields() {
        userPages.profileSettingCityBox.clear();
        userPages.profileSettingLastNameBox.clear();
        userPages.profileSettingAdressBox.clear();
        userPages.profileSettingFirstNameBox.clear();
    userPages.profileSettingCityBox.sendKeys("ABD");
    userPages.profileSettingLastNameBox.sendKeys("korumaz");
    userPages.profileSettingAdressBox.sendKeys("456 state, ABD");
    userPages.profileSettingFirstNameBox.sendKeys("byz");
    userPages.profileSettingStateBox.sendKeys("New York");
        ReusableMethods.wait(1);

    }

    @Then("Digit characters are entered into the zip code text box.")
    public void digit_characters_are_entered_into_the_zip_code_text_box() {
        Assert.assertTrue(userPages.profileSettingZipCodeBox.isDisplayed());
        userPages.profileSettingZipCodeBox.sendKeys("123456");
        ReusableMethods.wait(1);

    }
    @Then("Click on the submit button.")
    public void click_on_the_submit_button() {
    userPages.profileSettingSubmit.click();
    ReusableMethods.wait(1);
    }
    @Then("It is tested that the Profile Updated Succsessfuly text is displayed.")
    public void ıt_is_tested_that_the_profile_updated_succsessfuly_text_is_displayed() {
        Assert.assertTrue(userPages.profileUpdatedSuccsessfulyText02.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("Clicks the choose file button in the image section.")
    public void clicks_the_choose_file_button_in_the_image_section() {
    userPages.imageChooseFileButton.click();
    ReusableMethods.wait(1);
    }
    @Then("It tests whether you can upload photos to the image section.")
    public void ıt_tests_whether_you_can_upload_photos_to_the_image_section() {


    }
    @Then("He takes the profile card and tests what he can see.")
    public void he_takes_the_profile_card_and_tests_what_he_can_see() {
        Assert.assertTrue(userPages.profileSettingCard.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("It tests whether it can change the profile card.")
    public void ıt_tests_whether_it_can_change_the_profile_card() { ////////////


    }

    // ********** US_015  **********


        // ********** US_016  **********


        // ********** US_017  **********


    @Then("Click on the Withdraw button.")
    public void click_on_the_withdraw_button() {
        userPages.withdrawButton.click();
        ReusableMethods.wait(1);

    }

    @Then("The viewability of the Withdrawal page is tested.")
    public void the_viewability_of_the_withdrawal_page_is_tested() {
        Assert.assertTrue(userPages.withdrawMoneyPages.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("The Withdraw button is clicked and the Withdraw Money page is displayed.")
    public void the_withdraw_button_is_clicked_and_the_withdraw_money_page_is_displayed() {
        userPages.withdrawButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.withdrawMoneyPages.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Then("It is tested whether the method name can be selected from the method dropdown menu.")
    public void ıt_is_tested_whether_the_method_name_can_be_selected_from_the_method_dropdown_menu() {
     userPages.withdrawMethodBox.click();
     ReusableMethods.wait(1);


    }
    @Then("The method name is selected from the Method drop-down menu.")
    public void the_method_name_is_selected_from_the_method_drop_down_menu() {
        userPages.withdrawMethodBox.click();
        ReusableMethods.wait(1);


    }

    @Then("It is tested that a value between three hundred and eight thousand USD can be entered in the Amount text box.")
    public void ıt_is_tested_that_a_value_between_three_hundred_and_eight_thousand_usd_can_be_entered_in_the_amount_text_box() {

        userPages.withdrawAmountBox.click();
        userPages.withdrawAmountBox.sendKeys("40");
    }
    @Then("A value between three hundred and eight thousand USD is entered in the Amount textbox.")
    public void a_value_between_three_hundred_and_eight_thousand_usd_is_entered_in_the_amount_textbox() {
        userPages.withdrawAmountBox.sendKeys("40");
    }


    @Then("The Submit button is clicked and the Withdraw Via Method Update text is displayed.")
    public void the_submit_button_is_clicked_and_the_withdraw_via_method_update_text_is_displayed() {
        userPages.withdrawAmountBox.sendKeys("40");

    }
    @Then("Submit butona tıklanır ve Withdraw Via Method {int} Update yazısının goruntulenmesi test edilir.")
    public void submit_butona_tıklanır_ve_withdraw_via_method_update_yazısının_goruntulenmesi_test_edilir(Integer int1) {
        userPages.withdrawSubmit.click();
        ReusableMethods.wait(1);
        userPages.withdrawVia.sendKeys("ahdghad");

    }
    @Then("It is tested that the submit button is clickable.")
    public void ıt_is_tested_that_the_submit_button_is_clickable() {
        userPages.withdrawSubmitButton2.click();
        ReusableMethods.wait(1);

    }

    @Then("The viewability of the Withdraw request sent successfully text is tested..")
    public void the_viewability_of_the_withdraw_request_sent_successfully_text_is_tested() {
        Assert.assertTrue(userPages.withdrawSuccesfully.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("you click on the Withdraw Log button, you will be transferred to the Withdraw page.")
    public void you_click_on_the_withdraw_log_button_you_will_be_transferred_to_the_withdraw_page() {
        userPages.withdrawLogButton.click();
        Assert.assertTrue(userPages.withdrawHistoryPage.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Then("Withdraw History butonuna tıklandığında Withdraw Log sayfasına geçildiği test edilir.")
    public void withdraw_history_butonuna_tıklandığında_withdraw_log_sayfasına_geçildiği_test_edilir() {
        userPages.withdrawMoney.click();
        Assert.assertTrue(userPages.withdrawMoney.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("It is tested that the withdrawal made on the Withdraw History page is visible in the accordion table.")
    public void ıt_is_tested_that_the_withdrawal_made_on_the_withdraw_history_page_is_visible_in_the_accordion_table() {
        userPages.withdrawLogButton.click();
        Assert.assertTrue(userPages.withdrawHistoryPage.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("The withdrawal made on the Withdraw History page is recorded as a withdrawal in the accordion table.")
    public void the_withdrawal_made_on_the_withdraw_history_page_is_recorded_as_a_withdrawal_in_the_accordion_table() {
    userPages.withdrawParaCekme.click();
    ReusableMethods.wait(1);


    }
    @Then("Charge-After Charge-Conversion-Status values ​​should be displayed.")
    public void charge_after_charge_conversion_status_values_​​should_be_displayed() {
        Assert.assertTrue(userPages.withdrawParaCekmeIslem.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("when you click on the Withdraw Log button, you will be transferred to the Withdraw page.")
    public void when_you_click_on_the_withdraw_log_button_you_will_be_transferred_to_the_withdraw_page() {
        userPages.withdrawLogButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.withdrawHistoryPage.isDisplayed());
        ReusableMethods.wait(1);


    }
    @Then("when you click on the Withdraw History button, it is tested that you go to the Withdraw Log page.")
    public void when_you_click_on_the_withdraw_history_button_it_is_tested_that_you_go_to_the_withdraw_log_page() {
     userPages.withdrawMoney.click();
     ReusableMethods.wait(1);
     Assert.assertTrue(userPages.withdrawMoneyPages.isDisplayed());
     ReusableMethods.wait(1);

    }
    @Then("you click on the {string} button, it is tested that you go to the Withdraw History page.")
    public void you_click_on_the_button_it_is_tested_that_you_go_to_the_withdraw_history_page(String string) {
        userPages.withdrawLogButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.withdrawHistoryPage.isDisplayed());
        ReusableMethods.wait(1);
    }

    // ********** US_018  **********
    // US_018>TC_01
    @Given("The user goes to the given {string} and login in to the userpage with the given {string} and {string} information")
    public void the_user_goes_to_the_given_and_login_in_to_the_userpage_with_the_given_and_information(String userUrl, String username, String password) {
        ReusableMethods.navigateToTheRequestedUrl(userUrl);
        userPages.userLoginMethod(username,password);
        ReusableMethods.wait(4);
        if (userPages.allowCokies.isDisplayed()){
            userPages.allowCokies.click();
        }
        ReusableMethods.wait(2);


    }
    @Given("It is confirmed that the Take Loan link element is visible")
    public void ıt_is_confirmed_that_the_link_element_is_visible() {
        Assert.assertTrue(userPages.takeLoanSidebarLink.isDisplayed());
    }
    @Given("When clicking the Take Loan link element, it is confirmed that the Loan Plans is visible")
    public void when_clicking_the_link_element_it_is_confirmed_that_the_is_visible() {
        userPages.takeLoanSidebarLink.click();
        Assert.assertTrue(userPages.loanPlansTitle.isDisplayed());
    }


    @Given("On the Loan Plans page,click the Car Loan button and Personal Finance Loan, TAKE minimum $ {int} Take maximum $ {int}, Per Installment 4percent Installment {int}, Days Total Installment {int} and Apply Now button visible and active is confirmed")
    public void on_the_loan_plans_page_click_the_car_loan_button_and_personal_finance_loan_take_minimum_$_take_maximum_$_per_ınstallment_4percent_ınstallment_days_total_ınstallment_and_apply_now_button_visible_and_active_is_confirmed(Integer int1, Integer int2, Integer int3, Integer int4) {

        userPages.carLoan2Button.click();
        Assert.assertTrue(userPages.personelFinanceLoanTitle.isDisplayed());
        Assert.assertTrue(userPages.personelFinanceLoanTitle.isEnabled());
        Assert.assertTrue(userPages.takeMinumumAmount.isDisplayed());
        Assert.assertTrue(userPages.takeMinumumAmount.isEnabled());
        Assert.assertTrue(userPages.takeMaximumAmount.isDisplayed());
        Assert.assertTrue(userPages.takeMaximumAmount.isEnabled());
        Assert.assertTrue(userPages.perInstallmentAmount.isDisplayed());
        Assert.assertTrue(userPages.perInstallmentAmount.isEnabled());
        Assert.assertTrue(userPages.installmentIntervalAmount.isDisplayed());
        Assert.assertTrue(userPages.installmentIntervalAmount.isEnabled());
        Assert.assertTrue(userPages.totalInstallmentAmount.isDisplayed());
        Assert.assertTrue(userPages.totalInstallmentAmount.isEnabled());
        Assert.assertTrue(userPages.applyButtonCarLoan2.isDisplayed());
        Assert.assertTrue(userPages.applyButtonCarLoan2.isEnabled());
    }

    @Given("When clicked on the Apply Now button, it is confirmed that it switches to {string} page")
    public void when_clicked_on_the_apply_now_button_it_is_confirmed_that_it_switches_to_page(String string) {
        userPages.applyButtonCarLoan2.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.applyForPersonelLoanTitle.isDisplayed());
    }
    @Given("The Amount Textbox is entered between {int} and $ {int}, a value is entered and the Confirm button is pressed, press the {string} button on the opened page, and {string} is confirmed.")
    public void the_amount_textbox_is_entered_between_and_$_a_value_is_entered_and_the_confirm_button_is_pressed_press_the_button_on_the_opened_page_and_is_confirmed(Integer int1, Integer int2, String string, String string2) {

        userPages.enterAnAmounTextBox.sendKeys(ReusableMethods.generateRandomValue(2000,5000));
        userPages.confirmApplyForPersonalFinanceLoan.click();
        userPages.applicationFormApplyButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userPages.applyForPersonelFinanceLoanAlertText.getText().contains("Loan application submitted successfully"));


    }

    // US_018>TC_02
    @Given("Take Loan link element on the page opened Basic Loan link element is clicked")
    public void take_loan_link_element_on_the_page_opened_basic_loan_link_element_is_clicked() {
        userPages.takeLoanSidebarLink.click();
        userPages.basicLoanLinkElement.click();
    }
    @Given("It is confirmed that the Basic Loan {int} and the Apply Now button are visible and active and click on the Apply Now button in Basic Loan {int}")
    public void ıt_is_confirmed_that_the_basic_loan_and_the_apply_now_button_are_visible_and_active_and_click_on_the_apply_now_button_in_basic_loan(Integer int1, Integer int2) {
        ReusableMethods.wait(1);
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.basicLoan1ApplyNowButton);
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.basicLoan1LinkElement.isDisplayed());
        Assert.assertTrue(userPages.basicLoan1LinkElement.isEnabled());
        Assert.assertTrue(userPages.basicLoan1ApplyNowButton.isDisplayed());
        Assert.assertTrue(userPages.basicLoan1ApplyNowButton.isEnabled());
        userPages.basicLoan1ApplyNowButton.click();
    }
    @Given("Amount Textbox is entered between $ {int} and $ {int} and a value of random is entered and the Confirm button is pressed, the opened page is the Application Form page, where you are aplying to take loan \\(beefore confirm) under the title Plan Name, Loan Amount, Total Installment , Per Installment, You'll Need to Pay, Application Fee fields, Loan Card Name and Apply button selected under the Application form title is confirmed")
    public void amount_textbox_is_entered_between_$_and_$_and_a_value_of_random_is_entered_and_the_confirm_button_is_pressed_the_opened_page_is_the_application_form_page_where_you_are_aplying_to_take_loan_beefore_confirm_under_the_title_plan_name_loan_amount_total_ınstallment_per_ınstallment_you_ll_need_to_pay_application_fee_fields_loan_card_name_and_apply_button_selected_under_the_application_form_title_is_confirmed(Integer int1, Integer int2) {
        ReusableMethods.wait(2);
        userPages.enterAnAmounTextBox.sendKeys((ReusableMethods.generateRandomValue(1000,3000)));
        userPages.confirmApplyForPersonalFinanceLoan.click();
        Assert.assertTrue(userPages.planNameText.isDisplayed());
        Assert.assertTrue(userPages.loanAmountText.isDisplayed());
        Assert.assertTrue(userPages.totalInstallmentText.isDisplayed());
        Assert.assertTrue(userPages.perInstallmenText.isDisplayed());
        Assert.assertTrue(userPages.youWillNeedToPayText.isDisplayed());
        Assert.assertTrue(userPages.applicationFormApplyButton.isDisplayed());
    }
    @Given("When the Apply button is clicking, it is confirmed that the message Loan Application Submitted SuccessFully is displayed")
    public void when_the_apply_button_is_clicking_it_is_confirmed_that_the_message_loan_application_submitted_success_fully_is_displayed() {
        userPages.applicationFormApplyButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(userPages.applyForPersonelFinanceLoanAlertText.getText().contains("Loan application submitted successfully"));

    }
    @Given("It is confirmed that the process on the My Loans page is visible")
    public void ıt_is_confirmed_that_the_process_on_the_my_loans_page_is_visible() {
        Assert.assertTrue(userPages.myloansList1.isDisplayed());
    }
    @Given("To search for transactions, Search by Loan Number Text Box should be visible and active, it is confirmed that filtering can be made under the title Loan Status")
    public void to_search_for_transactions_search_by_loan_number_text_box_should_be_visible_and_active_it_is_confirmed_that_filtering_can_be_made_under_the_title_loan_status() {
        Assert.assertTrue(userPages.searchByLoanNumberTextBox.isDisplayed());
        Select select=new Select(userPages.loanStatusDropDownmenu);
        select.selectByIndex(1);
        ReusableMethods.wait(3);
        select.selectByIndex(2);
        ReusableMethods.wait(3);
        select.selectByIndex(3);
        ReusableMethods.wait(3);
        select.selectByIndex(0);

    }
    @Given("The Installments button is visible and active for the process that is running on the My Loans page. When clicking the button, the Loan Installments page is confirmed")
    public void the_ınstallments_button_is_visible_and_active_for_the_process_that_is_running_on_the_my_loans_page_when_clicking_the_button_the_loan_ınstallments_page_is_confirmed() {

        Select select=new Select(userPages.loanStatusDropDownmenu);
        select.selectByIndex(2);
        ReusableMethods.wait(1);
        userPages.runningListLabel.click();
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.installmentButton);
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.installmentButton.isDisplayed());
        Assert.assertTrue(userPages.installmentButton.isEnabled());
        userPages.installmentButton.click();
        Assert.assertTrue(userPages.loanInstallmentsTitle.isDisplayed());
    }
    @Given("Loan Number, Loan Amount, Plan, Per Installment, Needs to Pay, Delay Charge values ​​are visible, the list titles of the installment plan list \\(S.N., Installment Date, Given on, Delay) are visible and values ​​are visible in the list")
    public void loan_number_loan_amount_plan_per_ınstallment_needs_to_pay_delay_charge_values_​​are_visible_the_list_titles_of_the_installment_plan_list_s_n_ınstallment_date_given_on_delay_are_visible_and_values_​​are_visible_in_the_list() {

        Assert.assertTrue(userPages.loanNumbervalue.isDisplayed());
        Assert.assertTrue(userPages.planValue.isDisplayed());
        Assert.assertTrue(userPages.loanAmountValue.isDisplayed());
        Assert.assertTrue(userPages.perInstantValue.isDisplayed());
        Assert.assertTrue(userPages.needsToPayValue.isDisplayed());
        Assert.assertTrue(userPages.delayChargeValue.isDisplayed());

        Assert.assertTrue(userPages.snListHeader.isDisplayed());
        Assert.assertTrue(userPages.installmentDateListHeader.isDisplayed());
        Assert.assertTrue(userPages.givenOnListHeader.isDisplayed());
        Assert.assertTrue(userPages.delayListHeader.isDisplayed());
        Assert.assertTrue(userPages.snListValue.isDisplayed());
        Assert.assertTrue(userPages.installmentDateListValue.isDisplayed());
        Assert.assertTrue(userPages.givenOnListValue.isDisplayed());
        Assert.assertTrue(userPages.delayListValue.isDisplayed());

    }
    @Given("For the transition from My Loans to the Take Loan page, the Take Loan button is visible and confirmed to be active")
    public void for_the_transition_from_my_loans_to_the_take_loan_page_the_take_loan_button_is_visible_and_confirmed_to_be_active() {

        Assert.assertTrue(userPages.takeLoanSidebarLink.isDisplayed());
        Assert.assertTrue(userPages.takeLoanSidebarLink.isEnabled());
    }

    //TC_03>US_018
    @Given("It is confirmed that the Car Loan {int} and the Apply Now button is visible and active and click on the Apply Now button in Car Loan {int}")
    public void ıt_is_confirmed_that_the_car_loan_and_the_apply_now_button_is_visible_and_active_and_click_on_the_apply_now_button_in_car_loan(Integer int1, Integer int2) {
        ReusableMethods.wait(1);
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.carLoan9ApplyNowButton);
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.carLoan9Title.isDisplayed());
        Assert.assertTrue(userPages.carLoan9Title.isEnabled());
        Assert.assertTrue(userPages.carLoan9ApplyNowButton.isDisplayed());
        Assert.assertTrue(userPages.carLoan9ApplyNowButton.isEnabled());
        userPages.carLoan9ApplyNowButton.click();

    }
    @Given("Amount Textbox is entered between $ {int} and $ {int} and a value of random is entered and the Confirm button is pressed, the opened page is the Application Form page, where you are aplying to take loan \\(beefore confirm) under the title Plan name, Loan Amount, Total Installment , Per Installment, You'll Need to Pay, Application Fee fields, Loan Card Name and Apply button selected under the Application form title is confirmed")
    public void amount_textbox_is_entered_between_$_and_$_and_a_value_of_random_is_entered_and_the_confirm_button_is_pressed_the_opened_page_is_the_application_form_page_where_you_are_aplying_to_take_loan_beefore_confirm_under_the_title_plan_name_loan_amount_total_ınstallment_per_ınstallment_you_ll_need_to_pay_application_fee_fields_loan_card_name_and_apply_button_selected_under_the_application_form_title_is_confirmed(int min,int max) {
        ReusableMethods.wait(2);
        userPages.enterAnAmounTextBox.sendKeys((ReusableMethods.generateRandomValue(min,max)));
        userPages.confirmApplyForPersonalFinanceLoan.click();
        Assert.assertTrue(userPages.planNameText.isDisplayed());
        Assert.assertTrue(userPages.loanAmountText.isDisplayed());
        Assert.assertTrue(userPages.totalInstallmentText.isDisplayed());
        Assert.assertTrue(userPages.perInstallmenText.isDisplayed());
        Assert.assertTrue(userPages.youWillNeedToPayText.isDisplayed());
        Assert.assertTrue(userPages.applicationFormApplyButton.isDisplayed());

    }

    //TC_04>US_018
    @Given("It is confirmed that the Test Loan and the Apply Now button is visible and active and click on the Apply Now button in Test Loan")
    public void ıt_is_confirmed_that_the_test_loan_and_the_apply_now_button_is_visible_and_active_and_click_on_the_apply_now_button_in_test_loan() {
        ReusableMethods.wait(1);
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.testLoanApplyNowButton);
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.testLoanTitle.isDisplayed());
        Assert.assertTrue(userPages.testLoanTitle.isEnabled());
        Assert.assertTrue(userPages.testLoanApplyNowButton.isDisplayed());
        Assert.assertTrue(userPages.testLoanApplyNowButton.isEnabled());
        userPages.testLoanApplyNowButton.click();
    }


    // ********** US_019  **********
    @Given("kullanici acilan dashboard sayfasinda Transactions linkinin gorundugunu test eder")
    public void kullanici_acilan_dashboard_sayfasinda_transactions_linkinin_gorundugunu_test_eder() {
        Assert.assertTrue(userPages.userDahboardTransactionsButon.isDisplayed());
    }
    @Then("Transactions linkine tiklar")
    public void transactions_linkine_tiklar() {
        ReusableMethods.wait(3);
        userPages.dashboardCookieKabul.click();
        userPages.userDahboardTransactionsButon.click();
        ReusableMethods.wait(1);
    }
    @Then("My Transactions History sayfasina yonlendirildigini dogrular")
    public void my_transactions_history_sayfasina_yonlendirildigini_dogrular() {
        Assert.assertTrue(userPages.myTransactionsHistoryYazisi.isDisplayed());
    }
    @Then("Sayfada Transactions Number Search Box un gorunur ve aktif oldugunu dogrular")
    public void sayfada_transactions_number_search_box_un_gorunur_ve_aktif_oldugunu_dogrular() {
        Assert.assertTrue(userPages.transactionNumberSearchBox.isDisplayed());
        ReusableMethods.wait(3);
        userPages.dashboardCookieKabul.click();
        userPages.transactionSearchBoxAktiflikTesti();
    }
    @Then("Type dropdown menudeki \\(All,Plus,Minus) degerlerinin goruntulendigini ve aktif oldugunu dogrular")
    public void type_dropdown_menudeki_all_plus_minus_degerlerinin_goruntulendigini_ve_aktif_oldugunu_dogrular() {
        userPages.typeDropDownAktiflik();
        ReusableMethods.wait(1);
    }
    @Then("Remark dropdown menudeki \\(Any, Application fee, Balance add,Deposit, Loan taken, Withdraw, Withdraw reject) gorunur ve aktif oldugunu dogrular")
    public void remark_dropdown_menudeki_any_application_fee_balance_add_deposit_loan_taken_withdraw_withdraw_reject_gorunur_ve_aktif_oldugunu_dogrular() {
        userPages.remarkDropDownAktiflik();
        ReusableMethods.wait(1);
    }
    @Then("Listede filtre sectikten sonra  Title,Amount,charge,Post Balance,Details Bilgileri gorunur oldugunu dogrular")
    public void listede_filtre_sectikten_sonra_title_amount_charge_post_balance_details_bilgileri_gorunur_oldugunu_dogrular() {
        userPages.yapilanTransactions.click();
        ReusableMethods.wait(1);
        userPages.transactionsIcerikGoruntuleme();
    }



        // ********** US_020  **********


        // ********** US_021  **********

    @Given("user goes to homepage with {string}")
    public void user_goes_to_homepage_with(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("guestUrl"));
    }
    @Given("Verifies that the opened page is the home page")
    public void verifies_that_the_opened_page_is_the_home_page() {
        ReusableMethods.wait(2);
        guestPages.cookieKabul.click();
        Assert.assertTrue( guestPages.getStartedHomePage.isDisplayed());
    }
    @Given("Tests that e-mail, phone and address information appear on the top bar of the home page.")
    public void tests_that_e_mail_phone_and_address_information_appear_on_the_top_bar_of_the_home_page() {
        ReusableMethods.wait(2);
        guestPages.cookieKabul.click();
        Assert.assertTrue(guestPages.emailHomePageHeader.isDisplayed());
     ReusableMethods.wait(1);
     Assert.assertTrue(guestPages.addressHomePageHeader.isDisplayed());
        ReusableMethods.wait(1);
     Assert.assertTrue(guestPages.phoneHomePageHeader.isDisplayed());
    }


    @Given("It tests whether the site logo and menu titles \\(Home Page, About, Plans, Blogs, Contact, Login Icon, Getting Started Icon) are visible and active on the home page top bar.")
    public void ıt_tests_whether_the_site_logo_and_menu_titles_home_page_about_plans_blogs_contact_login_ıcon_getting_started_ıcon_are_visible_and_active_on_the_home_page_top_bar() {
        ReusableMethods.wait(2);
        guestPages.cookieKabul.click();
        Assert.assertTrue(guestPages.getStartedHomePage.isDisplayed());
        guestPages.getStartedHomePage.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.loginButonHomePage.isDisplayed());
        guestPages.loginButonHomePage.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.AboutButtonHomePageHeader.isDisplayed());
       guestPages.AboutButtonHomePageHeader.click();
        ReusableMethods.wait(1);

     Assert.assertTrue(guestPages.PlansButtonHomePageHeader.isDisplayed());
     guestPages.PlansButtonHomePageHeader.click();
     ReusableMethods.wait(1);

     Assert.assertTrue(guestPages.BlogsButtonHomePageHeader.isDisplayed());
      guestPages.BlogsButtonHomePageHeader.click();;
       ReusableMethods.wait(2);

     Assert.assertTrue(guestPages.ContactButtonHomePageHeader.isDisplayed());
     guestPages.ContactButtonHomePageHeader.click();
     ReusableMethods.wait(1);

     Assert.assertTrue(guestPages.HomeButtonHomePageHeader.isDisplayed());
        guestPages.contactPageHomeButon.click();
        ReusableMethods.wait(2);



    }
    @Given("It tests whether you can go to the home page when you click on the logo on the top bar of the home page.")
    public void ıt_tests_whether_you_can_go_to_the_home_page_when_you_click_on_the_logo_on_the_top_bar_of_the_home_page() {
       guestPages.LoantechIkonHomePage.click();
       ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.getStartedHomePage.isDisplayed());

    }
    @Given("It tests whether you can switch to the relevant page when you click on the headings \\(Home Page, About, Plans, Blogs, Contact, Login Icon, Getting Started Icon) on the home page top bar.")
    public void ıt_tests_whether_you_can_switch_to_the_relevant_page_when_you_click_on_the_headings_home_page_about_plans_blogs_contact_login_ıcon_getting_started_ıcon_on_the_home_page_top_bar() {
        guestPages.HomeButtonHomePageHeader.click();
        ReusableMethods.wait(1);
        String expectedUrlHomePage="https://qa.loantechexper.com/";
        String actualUrlHomePage=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(1);
        guestPages.getStartedHomePage.click();
        ReusableMethods.wait(1);
        String expectedUrlgetStartedHome="https://qa.loantechexper.com/user/register";
        String actualUrlgetStartedHome=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(2);
        guestPages.PlansButtonHomePageHeader.click();
        ReusableMethods.wait(1);
        String expectedUrlPlansHome="https://qa.loantechexper.com/loan";
        String actualUrlPlansHome=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(1);
        guestPages.AboutButtonHomePageHeader.click();
        ReusableMethods.wait(1);
        String expectedUrlAboutHome="https://qa.loantechexper.com/about";
        String actualUrlAboutHome=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(2);
        guestPages.BlogsButtonHomePageHeader.click();
        String expectedUrlBlogsHome="https://qa.loantechexper.com/blog";
        String actualUrlBlogsHome=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(1);
        guestPages.ContactButtonHomePageHeader.click();
        ReusableMethods.wait(1);
        String expectedUrlContactHome="https://qa.loantechexper.com/contact";
        String actualUrlContactHome=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(1);
        guestPages.loginButonHomePage.click();
        ReusableMethods.wait(1);
        String expectedUrlloginHome="https://qa.loantechexper.com/user/login";
        String actualUrlloginHome=Driver.getDriver().getCurrentUrl();
        ReusableMethods.wait(1);

    }



        // ********** US_022  **********


      

    @Given("kullaniciya verilen {string} ve {string} bilgileri ile user sayfasinda login olur")
    public void kullaniciya_verilen_ve_bilgileri_ile_user_sayfasinda_login_olur(String username, String password) {
      //  userPages.userLoginMethod(username,password);

        userPages.userLoginMethod(username,password);
    }
    @Given("User Dashboard ekraninda {string} yazisinin gorunurlugu kontrol edilir.")
    public void user_dashboard_ekraninda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(userPages.logoutButton.isDisplayed());
    }
    @Then("{string} alanina tiklanir.")
    public void alanina_tiklanir(String string) {

        userPages.logoutButton.click();
    }
    @Then("{string} yazisinin ciktigi kontrol edilir.")
    public void yazisinin_ciktigi_kontrol_edilir(String alert) {

/*
        ReusableMethods.wait(3);
        String expectedAlertYazisi="You have been Logged out.";

        //String actualAlertYazisi=Driver.getDriver().switchTo().alert().getText();

        String actualAlertYazisi=Driver.getDriver().switchTo().alert().getText();

        System.out.println("actual alert yazisi :"+actualAlertYazisi);

        Assert.assertEquals(expectedAlertYazisi,actualAlertYazisi);

 */
        ReusableMethods.wait(2);
        String expectedIcerik=alert;
        String actualAramaSonucu=userPages.alertYazisi.getText();


        System.out.println(expectedIcerik);
        System.out.println(actualAramaSonucu);


        //Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
        //Assert.assertEquals(actualAramaSonucu,expectedIcerik);

        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));

    }
    @Then("Anasayfada {string} yazisi gorunur olmasi halinde anasayfada oldugunun kontrolu yapilir")
    public void anasayfada_yazisi_gorunur_olmasi_halinde_anasayfada_oldugunun_kontrolu_yapilir(String string) {

        Assert.assertTrue(userPages.loginButtonGorme.isDisplayed());
    }



    // ********** US_023  **********
    @Then("LoanTechLogo tiklar")
    public void loantechlogoTiklar() {
        ReusableMethods.wait(1);
        userPages.LoanTechLogo.click();

    }
    @Then("ansayfa ustbarından plans linkine tıklar")
    public void ansayfaustbarindanPlansLinkineTiklar() {
        ReusableMethods.wait(1);
        userPages.plansButton.click();

    }
    @And("plans linki altında loan cardların gorunur oldugunu test eder ve basic loan butonuna tiklar")
    public void plansLinkiAltindaLoanCardlarinGorunurOldugunuTestEderVeBasicLoanButonunaTiklar() {


        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.basicLoanButton.isDisplayed());
        ReusableMethods.wait(1);
        userPages.basicLoanButton.click();
    }
    @Then("basic loan buton tıklandığında acılan cardların başlıkları gorunur oldugunu test eder")
    public void basicLoanButonTiklandigindaAcilanCardlarinBasliklariGorunurOldugunuTestEder() {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.appYaziElement);
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.basicLoan1Button.isDisplayed());
        ReusableMethods.wait(1);

    }
    @And("Applyfor Selected card name sayfasinin gorunur oldugunu test eder")
    public void applyforSelectedCardNameSayfasininGorunurOldugunuTestEder() {
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.amountBox.isDisplayed());
    }
    @And("Apply Now Butonu gorunur oldugunu test eder ve tiklandiginda Selected card name sayfası acildigini test eder")
    public void applyNowButonuGorunurOldugunuTestEderVeTiklandigindaSelectedCardNameSayfasiAcildiginiTestEder() {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.basicLoan1Button);
        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.applyNowButton.isDisplayed());
        ReusableMethods.wait(1);
        userPages.applyNowButton.click();
    }
    @And("cookie kabul edilir")
    public void cookieKabulEdilir() {
        ReusableMethods.wait(1);
        userPages.cookieButonu.click();

    }
    @When("Amount textbox'a digit minimum ve maximum deger aralıgında deger girilmelidir")
    public void amountTextboxADigitMinimumVeMaximumDegerAraligindaDegerGirilmelidir() {
        userPages.amountBox.sendKeys("1000");
        ReusableMethods.wait(1);

    }
    @And("sayfadaki ok tuşları tiknanir")
    public void sayfadakiOkTuslariTiknanir() {

        ReusableMethods.wait(1);
        userPages.amountBoxConfirmButton.click();
    }
    @When("Confirm  butona tiklandiginda Application Form sayfasına gecis yapildigini test eder")
    public void confirmButonaTiklandigindaApplicationFormSayfasinaGecisYapildiginiTestEder() {

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.applicationFormYazisi.isDisplayed());
    }
    @And("Apply buton aktif oldugunu test eder  ve tiklandiginda Loan application submitted successfully mesajinin gorunur oldugunu test eder")
    public void applyButonAktifOldugunuTestEderVeTiklandigindaLoanApplicationSubmittedSuccessfullyMesajininGorunurOldugunuTestEder() {
        ReusableMethods.wait(1);
        userPages.appButon.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(userPages.loansubmittedSuccessfullyMesaji.isDisplayed());

    }
    // ********** US_024  **********
    @Then("dashboard sayfasinda successful deposits successful withdrawals total Loan baslıkları gorunur oldugunu test eder")
    public void dashboardSayfasindaSuccessfulDepositsSuccessfulWithdrawalsTotalLoanBasliklariGorunurOldugunuTestEder() {

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.successfulDepositYaziElementi.isDisplayed());

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.successfulWithdrawalsYaziElementi.isDisplayed());

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.totalLoanYaziElementi.isDisplayed());
    }
    @Then("dashboard sayfasinda toplam tutar submitted pending rejected edilen tutarlar ve kredi adetlerinin gorunur oldugunu test eder")
    public void dashboardSayfasindaToplamTutarSubmittedPendingRejectedEdilenTutarlarVeKrediAdetlerininGorunurOldugunuTestEder() {

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.myLoanSubmittedYaziElementi.isDisplayed());

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.myLoanRejectedYaziElementi.isDisplayed());

        ReusableMethods.wait(1);
        Assert.assertTrue(userPages.myLoanPendingYaziElementi.isDisplayed());
    }

    @Then("dashboard sayfasinda {string} sutunundaki toplam tutar submitted pending rejected edilen tutarlar ve kredi adetlerinin gorunur oldugunu test eder")
    public void dashboardSayfasindaSutunundakiToplamTutarSubmittedPendingRejectedEdilenTutarlarVeKrediAdetlerininGorunurOldugunuTestEder(String istenenBaslik) {
        int istenenSutunIndexi = 0;
        List<WebElement> headerElementListesi = userPages.loanNumber;
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
}

