
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.GuestPages;
import pages.UserPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class User {

    // ********** Login  **********
    GuestPages guestPages = new GuestPages();
    UserPages userPages = new UserPages();

    @Given("kullanici verilen {string} gider")
    public void kullanici_verilen_gider(String url) {
        userPages.istenilenUrlGitme(url);
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

    @And("giris yapamadigini dogrular")
    public void girisYapamadiginiDogrular() {
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


        // ********** US_019  **********


        // ********** US_020  **********


        // ********** US_021  **********


        // ********** US_022  **********


        // ********** US_023  **********


        // ********** US_024  **********


    }