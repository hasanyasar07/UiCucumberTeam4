package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Admin {
    AdminPages adminPages=new AdminPages();
    Select select;
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

    @Then("sayfayi kapatir")
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
