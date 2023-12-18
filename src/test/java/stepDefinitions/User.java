
package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GuestPages;
import pages.UserPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class User {

    // ********** Login  **********
    GuestPages guestPages=new GuestPages();
    UserPages userPages=new UserPages();
    @Given("kullanici verilen {string} gider")
    public void kullanici_verilen_gider(String url) {
       userPages.istenilenUrlGitme(url);
    }

    @Given("kullanici verilen {string} ve {string} bilgileri ile userpage de login olur")
    public void kullanici_verilen_ve_bilgileri_ile_userpage_de_login_olur(String username, String password) {
       userPages.userLoginMethod(username,password);
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
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",userPages.WelcomeBackYaziElementi );
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


    // ********** US_015  **********


    // ********** US_016  **********


    // ********** US_017  **********


    // ********** US_018  **********


    // ********** US_019  **********


    // ********** US_020  **********


    // ********** US_021  **********


    // ********** US_022  **********


    // ********** US_023  **********


    // ********** US_024  **********


}
