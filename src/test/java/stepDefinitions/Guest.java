package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.GuestPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;


public class Guest {
    GuestPages guestPages = new GuestPages();

    Faker faker = new Faker();
    String password;

    // ********** US_001  **********


    // ********** US_002  **********


    // ********** US_003  ********** // Erdal

    @Given("Visitor goes to “guestUrl” homepage")
    public void visitor_goes_to_guest_url_homepage() {

    }
    @Then("It tests whether a slider consisting of partner company logos is visible on the home page.")
    public void ıt_tests_whether_a_slider_consisting_of_partner_company_logos_is_visible_on_the_home_page() {
         }
    @Then("Closes the page")
    public void closes_the_page() {

    }


    @Then("It tests whether the logos flowing on the slider consisting of partner company logos on the home page \\(Sun Basket, Peloton, BerkShire Hathaway, Emergent biosolutions*, Solar Edge architects of energy, Covenant Transport services, Exxon Mobile, P&G, CVS Health, EverNote) are visible.")
    public void ıt_tests_whether_the_logos_flowing_on_the_slider_consisting_of_partner_company_logos_on_the_home_page_sun_basket_peloton_berk_shire_hathaway_emergent_biosolutions_solar_edge_architects_of_energy_covenant_transport_services_exxon_mobile_p_g_cvs_health_ever_note_are_visible() {

    }
    @Then("Closes the pag")
    public void closes_the_pag() {

    }

    // ********** US_004.feature  **********


    // ********** US_005  **********

    @Given("kullanici anasayfada about sekmesinin gorunur oldugunu dogrular ve about sekmesine tiklar")
    public void kullanici_anasayfada_about_sekmesinin_gorunur_oldugunu_dogrular_ve_about_sekmesine_tiklar() {
        Assert.assertTrue(guestPages.aboutButon.isDisplayed());
        ReusableMethods.wait(1);
        guestPages.aboutButon.click();
    }

    @Then("about sekmesine tikladiktan sonra kendinin about sayfasina yonlendirildigini dogrular")
    public void about_sekmesine_tikladiktan_sonra_kendinin_about_sayfasina_yonlendirildigini_dogrular() {
        Assert.assertTrue(guestPages.aboutBodyFulfillingFinancialBaslik.isDisplayed());
    }

    @Then("footer kismindaki about linkinin oldugunu dogrular ve linke tiklar")
    public void footerKismindakiAboutLinkininOldugunuDogrularVeLinkeTiklar() {
        Assert.assertTrue(guestPages.footerAboutButon.isDisplayed());
        ReusableMethods.wait(1);
        guestPages.footerAboutButon.click();
    }

    @Then("gittigi sayfada Fulfilling Financial Dreams basliginin gorunur oldugunu dogrular")
    public void gittigi_sayfada_fulfilling_financial_dreams_basliginin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(guestPages.aboutBodyFulfillingFinancialBaslik.isDisplayed());
    }

    @Then("ayni sayfadaki Home | About ikonlarinin gorunur oldugunu dogrular")
    public void ayni_sayfadaki_home_about_ikonlarinin_gorunur_oldugunu_dogrular() {
        Assert.assertTrue(guestPages.aboutBodyHomeIknonu.isDisplayed());
        Assert.assertTrue(guestPages.aboutBodyAboutIkonu.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Then("aktif oldugunu dogrulamak icin About ikonuna tiklar")
    public void aktif_oldugunu_dogrulamak_icin_about_ikonuna_tiklar() {
        guestPages.aboutBodyAboutIkonu.click();
        Assert.assertTrue((guestPages.aboutBodyAboutIkonu.getDomAttribute("href")).contains("https://qa.loantechexper.com/about"));
    }

    @Then("aktif oldugunu dogrulamak icin Home ikonuna tiklar")
    public void aktif_oldugunu_dogrulamak_icin_home_ikonuna_tiklar() {
        guestPages.aboutBodyHomeIknonu.click();
    }

    @Then("anasayfaya dondugunu dogrular")
    public void anasayfaya_dondugunu_dogrular() {
        Assert.assertTrue(guestPages.aboutButon.isDisplayed());
    }


    // ********** US_006  **********

    @Then("youtube facebook ve x ikonlarinin gorunurlugunu dogrular")
    public void youtubeFacebookVeXIkonlarininGorunurlugunuDogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.youtubeIkon.isDisplayed());
        Assert.assertTrue(guestPages.facebookIkon.isDisplayed());
        Assert.assertTrue(guestPages.xIkon.isDisplayed());
        ReusableMethods.wait(1);
        guestPages.cookieKabul.click();
    }


    @And("youtube ikonuna tiklar ve acilan sayfada youtube a yonlendirildigini dogrular")
    public void youtubeIkonunaTiklarVeAcilanSayfadaYoutubeAYonlendirildiginiDogrular() {
        guestPages.socialMedyaIkonlariDogrulama(guestPages.youtubeIkon,guestPages.youtubeDogrulama);
    }

    @And("facebook ikonuna tiklar ve acilan sayfada facebook a yonlendirildigini dogrular")
    public void facebookIkonunaTiklarVeAcilanSayfadaFacebookAYonlendirildiginiDogrular() {
        guestPages.socialMedyaIkonlariDogrulama(guestPages.facebookIkon,guestPages.facebookDogrulama);
    }

    @And("x ikonuna tiklar ve acilan sayfada x e yonlendirildigini dogrular")
    public void xIkonunaTiklarVeAcilanSayfadaXEYonlendirildiginiDogrular() {
        guestPages.socialMedyaIkonlariDogrulama(guestPages.xIkon,guestPages.xDogrulama);
    }

    @Then("linkedin ve instagram ikonlarinin gorunurlugunu dogrular")
    public void linkedinVeInstagramIkonlarininGorunurlugunuDogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.linkedinIkon.isDisplayed());
        Assert.assertTrue(guestPages.instagramIkon.isDisplayed());
        ReusableMethods.wait(1);
        guestPages.cookieKabul.click();
    }

    @And("linkedin ikonuna tiklar ve acilan sayfada linkedin e yonlendirildigini dogrular")
    public void linkedinIkonunaTiklarVeAcilanSayfadaLinkedinEYonlendirildiginiDogrular() {
        guestPages.socialMedyaIkonlariDogrulama(guestPages.linkedinIkon,guestPages.linkedinDogrulama);
    }

    @And("instagram ikonuna tiklar ve acilan sayfada instagram a yonlendirildigini dogrular")
    public void instagramIkonunaTiklarVeAcilanSayfadaInstagramAYonlendirildiginiDogrular() {
        guestPages.socialMedyaIkonlariDogrulama(guestPages.instagramIkon,guestPages.instagramDogrulama);
    }

    @Then("sayfalari kapatir")
    public void sayfalariKapatir() {
        Driver.getDriver().quit();
    }


    // ********** US_007  **********


    // ********** US_008  **********


    // ********** US_009  **********

    @Given("Kullanici, contact sekmesinin ana sayfada gorundugunu dogrular ve contact sekmesine tiklar")
    public void kullanici_contact_sekmesinin_ana_sayfada_gorundugunu_dogrular_ve_contact_sekmesine_tiklar() {
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.anasayfaContactButon.isDisplayed());
        guestPages.anasayfaContactButon.click();
    }

    @Then("contact sayfasina basariyla gecis yaptigini dogrular")
    public void contact_sayfasina_basariyla_gecis_yaptigini_dogrular() {
        Assert.assertTrue(guestPages.contactUsYaziElementi.isDisplayed());
    }

    @Then("Sirkete mesaj gonderme formunun iletisim sayfasinda goruntulendigini dogrular")
    public void sirkete_mesaj_gonderme_formunun_iletisim_sayfasinda_goruntulendigini_dogrular() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", guestPages.contactUsYaziElementi);
        Assert.assertTrue(guestPages.ContactUsMesajFormu.isDisplayed());
    }

    @Then("Name Box, MailBox, Subject TextBox, Message Text Box, Send Message Button ogelerinin formda gorunur oldugunu dogrular")
    public void name_box_mail_box_subject_text_box_message_text_box_send_message_button_ogelerinin_formda_gorunur_oldugunu_dogrular() {
        guestPages.mesajFormElementleriGorutuleme();
    }

    @And("Name Box, MailBox, Subject TextBox, Message Text Box, kutularina gerekli bilgileri gondererek Send Message butonuna basar")
    public void nameBoxMailBoxSubjectTextBoxMessageTextBoxKutularinaGerekliBilgileriGondererekSendMessageButonunaBasar() {
        ReusableMethods.wait(1);
        guestPages.mesajFormDoldurma();
    }

    @Then("Mesaj gonderdiginize dair onay bildirimini gordugunu dogrular")
    public void mesaj_gonderdiginize_dair_onay_bildirimini_gordugunu_dogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.ContactUsTicketCreateDogrulamaYazisi.isDisplayed());
    }

    @Given("kullanici anasayfada footer kismina iner")
    public void kullaniciAnasayfadaFooterKisminaIner() {
        guestPages.footerKisminaInme();
    }

    @Then("contact baglantisinin gorunur oldugunu dogrular ve contact linkine tiklar")
    public void contact_baglantisinin_gorunur_oldugunu_dogrular_ve_contact_linkine_tiklar() {
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.footerContactUs.isDisplayed());
        ReusableMethods.wait(1);
        guestPages.footerContactUs.click();
    }

    @Then("Sirketin e-posta, telefon ve adres iletisim bilgilerinin contact us sayfasinda gorunur oldugunu dogrular")
    public void sirketin_e_posta_telefon_ve_adres_iletisim_bilgilerinin_contact_us_sayfasinda_gorunur_oldugunu_dogrular() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", guestPages.contactUsYaziElementi);
        ReusableMethods.wait(1);
        guestPages.contactUsIletisimBilgileriDogrulama();
    }

    @Then("Adres bilgilerinin, sirketin contact us sayfasindaki konumunu gosteren haritada gorundugunu dogrular")
    public void adres_bilgilerinin_sirketin_contact_us_sayfasindaki_konumunu_gosteren_haritada_gorundugunu_dogrular() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);

        Assert.assertTrue(guestPages.ContactUsHarita.isDisplayed());

    }

    @Then("home ve contact linkerinin goruntulendigini dogrular")
    public void homeVeContactLinkerininGoruntulendiginiDogrular() {
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.contactUsContactUsLink.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(guestPages.contactUsHomeLink.isDisplayed());
    }

    @And("contact linkinin calistigini test etmek icin tiklar")
    public void contactLinkininCalistiginiTestEtmekIcinTiklar() {
        ReusableMethods.wait(1);
        Assert.assertTrue((guestPages.contactUsContactUsLink.getDomAttribute("href")).contains("https://qa.loantechexper.com/contact_us"));

    }

    @And("home linkinin calistigini test etmek icin tiklar")
    public void homeLinkininCalistiginiTestEtmekIcinTiklar() {
        ReusableMethods.wait(1);
        guestPages.contactUsHomeLink.click();
    }

    // ********** US_010  **********


    // ********** US_011  **********

    @Given("Accessing the homepage as a visitor and the presence of the Newsletter title in the footer section going down on the homepage are tested.")
    public void accessing_the_homepage_as_a_visitor_and_the_presence_of_the_newsletter_title_in_the_footer_section_going_down_on_the_homepage_are_tested() {
        guestPages.footerKisminaInme();
        Assert.assertTrue(guestPages.footerNewLetter.isDisplayed());
        ReusableMethods.wait(1);
    }


    @Then("The visibility of the email text box under the visitor Newsletter heading is tested.")
    public void the_visibility_of_the_email_text_box_under_the_visitor_newsletter_heading_is_tested() {
        Assert.assertTrue(guestPages.newLetterMailTextBox.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Then("Enters e-mail address in the e-mail text box.")
    public void enters_e_mail_address_in_the_e_mail_text_box() {
        guestPages.newLetterMailTextBox.sendKeys("beyzakorumaz32@hotmail.com");
        ReusableMethods.wait(1);
    }

    @Then("Click on the button next to the email text box.")
    public void click_on_the_button_next_to_the_email_text_box() {
        guestPages.footerNewLetterMailButton.click();
        ReusableMethods.wait(1);
    }

    @Then("Tests whether it was sent to the e-mail.")
    public void tests_whether_it_was_sent_to_the_e_mail() {
        Assert.assertTrue(guestPages.nemLetterMailNotification.isDisplayed());
        ReusableMethods.wait(1);
    }


    // ********** US_012  ********** hasan
    @Given("The Visitor opens Browser and goes {string}")
    public void the_visitor_opens_browser_and_goes(String url) {
       ReusableMethods.navigateToTheRequestedUrl(url);
    }
    @Given("It is confirmed that the Get Started button is visible and active")
    public void ıt_is_confirmed_that_the_button_is_visible_and_active() {
        Assert.assertTrue(guestPages.getStartedButton.isDisplayed());
        Assert.assertTrue(guestPages.getStartedButton.isEnabled());
    }
    @Given("When clicking the Get Started button, it is confirmed that It went to {string}")
    public void when_clicking_the_button_it_is_confirmed_that_ıt_went_to(String registerUrl) {
        ReusableMethods.navigateToTheRequestedUrl(registerUrl);

    }

<<<<<<< HEAD
    @Given("{string} butonuna tiklandiginda {string} e gittigi dogrulanir")
    public void butonuna_tiklandiginda_e_gittigi_dogrulanir(String string, String string2) {

    }
=======
    @Given("The Visitor opens Browser and go to {string}")
    public void the_visitor_opens_browser_and_go_to(String registerUrl) {
        ReusableMethods.navigateToTheRequestedUrl(registerUrl);
    }
    @Given("It is confirmed that the registration form is visible")
    public void ıt_is_confirmed_that_the_registration_form_is_visible() {
        Assert.assertTrue(guestPages.formElement.isDisplayed());
    }
    @Given("In the form, username, email address, country dropdown, mobile number, password, confirm Password Text Boxes are confirmed that visible is")
    public void ın_the_form_username_email_address_country_dropdown_mobile_number_password_confirm_password_text_boxes_are_confirmed_that_visible_is() {
        Assert.assertTrue(guestPages.usernameTextBox.isDisplayed());
        Assert.assertTrue(guestPages.emailTextBox.isDisplayed());
        Assert.assertTrue(guestPages.countryDropDownList.isDisplayed());
        Assert.assertTrue(guestPages.mobilTextBox.isDisplayed());
        Assert.assertTrue(guestPages.passwordTextBox.isDisplayed());
        Assert.assertTrue(guestPages.passwordConfirmationTextBox.isDisplayed());
    }
    @Given("Username random {int}-character uniq username is entered")
    public void username_random_character_uniq_username_is_entered(Integer int1) {

        String username=ReusableMethods.generateUsername();

        guestPages.usernameTextBox.sendKeys(username);
        ReusableMethods.wait(1);
        System.out.println(username);
    }
    @Given("An e-mail information with Email Text Random @")
    public void an_e_mail_information_with_email_text_random() {
        guestPages.emailTextBox.sendKeys(faker.internet().emailAddress());
    }
    @Given("Country menu is chosen a country")
    public void country_menu_is_chosen_a_country() {
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",guestPages.usernameTextBox );
        Random random=new Random();
        ReusableMethods.wait(1);
        guestPages.countryDropDownList.click();
        ReusableMethods.wait(1);
        guestPages.countriesList.get(random.nextInt(241)).click();
    }
    @Given("Telephone TextBox is a maximum of {int}-digit random unique a phone number")
    public void telephone_text_box_is_a_maximum_of_digit_random_unique_a_phone_number(Integer int1) {
        guestPages.mobilTextBox.sendKeys(faker.phoneNumber().subscriberNumber(14));

    }
    @Given("Password TextBox includes a {int}-digit password containing at least \\(a capital letter , a figure, lowercase, character) and hidden and  unhidden in the written password")
    public void password_text_box_includes_a_digit_password_containing_at_least_a_capital_letter_a_figure_lowercase_character_and_hidden_and_unhidden_in_the_written_password(Integer int1) {

        password = ReusableMethods.generatePassword();
        ReusableMethods.wait(1);
        guestPages.passwordTextBox.sendKeys(password);
        guestPages.passwordVisible.click();
        ReusableMethods.wait(2);
        guestPages.passwordVisible.click();




    }
    @Given("Password determined in Confirm Textbox")
    public void password_determined_in_confirm_textbox() {
        guestPages.passwordConfirmationTextBox.sendKeys(password);
        guestPages.passwordConfirmationVisible.click();
        ReusableMethods.wait(2);
        guestPages.passwordConfirmationVisible.click();

    }
    @Given("I Agree with Privacy Policy, Terms of Service, Rapid Policy 'Check Box Click here")
    public void ı_agree_with_privacy_policy_terms_of_service_rapid_policy_check_box_click_here() {
        guestPages.agreeCheckBox.click();
    }
    @Given("By clicking the Register button, the user registration form is sent to the user data page to complete the registration")
    public void by_clicking_the_register_button_the_user_registration_form_is_sent_to_the_user_data_page_to_complete_the_registration() {
        guestPages.registerButton.click();
        ReusableMethods.wait(2);
    }
    @Given("It is confirmed that it is visible and active in the Form \\(Firstname, Lastname, Address, State, Zip, City, Submit, Submit button) opened on the user data page")
    public void ıt_is_confirmed_that_it_is_visible_and_active_in_the_form_firstname_lastname_address_state_zip_city_submit_submit_button_opened_on_the_user_data_page() {
        Assert.assertTrue(guestPages.firstname.isDisplayed());
        Assert.assertTrue(guestPages.firstname.isEnabled());
        Assert.assertTrue(guestPages.lastname.isDisplayed());
        Assert.assertTrue(guestPages.lastname.isEnabled());
        Assert.assertTrue(guestPages.address.isDisplayed());
        Assert.assertTrue(guestPages.address.isEnabled());
        Assert.assertTrue(guestPages.state.isDisplayed());
        Assert.assertTrue(guestPages.state.isEnabled());
        Assert.assertTrue(guestPages.zip.isDisplayed());
        Assert.assertTrue(guestPages.zip.isEnabled());
        Assert.assertTrue(guestPages.city.isDisplayed());
        Assert.assertTrue(guestPages.city.isEnabled());
        Assert.assertTrue(guestPages.submitButton.isDisplayed());
        Assert.assertTrue(guestPages.submitButton.isEnabled());

    }

    @Given("It should be confirmed that the registration process can be completed by completing the compulsory fields in the form \\(firstname,Lastname,Address Textboxes) as random")
    public void ıt_should_be_confirmed_that_the_registration_process_can_be_completed_by_completing_the_compulsory_fields_in_the_form_firstname_lastname_address_textboxes_as_random() {

        guestPages.firstname.sendKeys(faker.name().name());
        guestPages.lastname.sendKeys(faker.name().lastName());
        guestPages.address.sendKeys(faker.address().streetAddress());
        guestPages.state.sendKeys(faker.address().state());
        guestPages.zip.sendKeys(faker.address().zipCode());
        guestPages.city.sendKeys(faker.address().city());
        guestPages.submitButton.submit();
        ReusableMethods.wait(2);
        Assert.assertTrue(guestPages.registerAlertText.getText().contains("Registration process completed successfully"));


    }


>>>>>>> main
}


