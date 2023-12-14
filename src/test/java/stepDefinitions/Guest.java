package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    @Given("kullanici anasayfada footer kismindaki about linkinin oldugunu dogrular ve linke tiklar")
    public void kullanici_anasayfada_footer_kismindaki_about_linkinin_oldugunu_dogrular_ve_linke_tiklar() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",guestPages.footerAboutButon );
        ReusableMethods.wait(2);
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


    // ********** US_010  **********


    // ********** US_011  **********


    // ********** US_012  **********
}
