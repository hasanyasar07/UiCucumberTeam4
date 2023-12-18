
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
    GuestPages guestPages=new GuestPages();
    UserPages userPages=new UserPages();
    @Given("kullanici verilen {string} gider")
    public void kullanici_verilen_gider(String url) {
       userPages.istenilenUrlGitme(url);

       ReusableMethods.wait(2);
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

    @And("giris yapamadigini dogrular")
    public void girisYapamadiginiDogrular() {
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

    // ********** US_014  **********


    // ********** US_015  **********


    // ********** US_016  **********


    // ********** US_017  **********


    // ********** US_018  **********


    // ********** US_019  **********


    // ********** US_020  **********


    // ********** US_021  **********


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


    // ********** US_024  **********


}
