package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GuestPages;
import utilities.Driver;
import utilities.ReusableMethods;


public class Guest {
    GuestPages guestPages=new GuestPages();

    // ********** US_001  **********


    // ********** US_002  **********


    // ********** US_003  **********


    // ********** US_004  **********


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
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",guestPages.contactUsYaziElementi );
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
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",guestPages.contactUsYaziElementi );
        ReusableMethods.wait(1);
        guestPages.contactUsIletisimBilgileriDogrulama();
    }
    @Then("Adres bilgilerinin, sirketin contact us sayfasindaki konumunu gosteren haritada gorundugunu dogrular")
    public void adres_bilgilerinin_sirketin_contact_us_sayfasindaki_konumunu_gosteren_haritada_gorundugunu_dogrular() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);

        Assert.assertTrue(guestPages.ContactUsHarita.isDisplayed());

    }

    // ********** US_010  **********


    // ********** US_011  **********


    // ********** US_012  **********
    @Given("{string} butonunun gorunur ve aktif oldugu dogrulanir")
    public void butonunun_gorunur_ve_aktif_oldugu_dogrulanir(String string) {

    }
    @Given("{string} butonuna tiklandiginda {string} e gittigi dogrulanir")
    public void butonuna_tiklandiginda_e_gittigi_dogrulanir(String string, String string2) {

    }

}
