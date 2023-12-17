package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminPages;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import utilities.ReusableMethods;

import java.awt.*;

public class Admin {
    AdminPages adminPages = new AdminPages();

    @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")
    public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
        adminPages.adminLoginMethod(username, password);
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
    @Given("acilan login sayfasinda admin ikonu gorunur oldugunu test eder ve admin ikonuna tiklar")
    public void acilanLoginSayfasindaAdminIkonuGorunurOldugunuTestEderVeAdminIkonunaTiklar() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.adminIkonu.isDisplayed());
        ReusableMethods.wait(1);
        adminPages.adminIkonu.click();

        ReusableMethods.wait(2);

    }
    @Then("admin ikonuna tiklaninca acilan dropdown menüde Profile Password Logout linklerinin gorunur oldugunu test eder")
    public void adminIkonunaTiklanincaAcilanDropdownMenüdeProfilePasswordLogoutLinklerininGorunurOldugunuTestEder() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.profilLinkElementi.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("profil linkine tiklanir")
    public void profilLinkineTiklanir() {
        adminPages.profilLinkElementi.click();

        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.profileInformationYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }
    @And("aCılan sayfada name  email text boxları ve fotoğraf gUncellenip aktif oldugu dogrulanir")
    public void acılanSayfadaNameEmailTextBoxlarıVeFotoğrafGUncellenipAktifOlduguDogrulanir() {

        adminPages.ProfilNameBox.clear();
        ReusableMethods.wait(1);
        adminPages.ProfilNameBox.sendKeys("Gulizar");

        ReusableMethods.wait(1);
        adminPages.ProfilEmailBox.clear();
        ReusableMethods.wait(1);
        adminPages.ProfilEmailBox.sendKeys("gul.ataalp@gmail.com");
        ReusableMethods.wait(2);
        adminPages.uploadImageButon.click();
        ReusableMethods.wait(2);
    }

    @Then("password linkine tiklanir ve password sayfasinin acldigi dogrulanmali")
    public void passwordLinkineTiklanirVePasswordSayfasininAcldigiDogrulanmali() {
        adminPages.passwordLinkElementi.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(adminPages.changePasswordYaziElementi.isDisplayed());
        ReusableMethods.wait(2);
    }
    @And("acilan sayfada ilgili alanlar doldurularak sifre guncellenir")
    public void acilanSayfadaIlgiliAlanlarDoldurularakSifreGuncellenir() {
        adminPages.profilPasswordBox.click();
        ReusableMethods.wait(1);
        adminPages.profilPasswordBox.sendKeys("123123123");
        ReusableMethods.wait(3);
        adminPages.profilNewPasswordBox.click();
        ReusableMethods.wait(2);
        adminPages.profilNewPasswordBox.sendKeys("123456789");
        ReusableMethods.wait(2);
        adminPages.profilConfirmPasswordBox.click();
        ReusableMethods.wait(2);
        adminPages.profilConfirmPasswordBox.sendKeys("123456789");
        ReusableMethods.wait(2);
        adminPages.passwordSubmitButton.click();
        ReusableMethods.wait(2);
    }
    @Then("Logout linkine tıklayarak sayfadan basaralı bir sekilde ayrıldıgı dogrulanabilmeli")
    public void logoutLinkineTıklayarakSayfadanBasaralıBirSekildeAyrıldıgıDogrulanabilmeli() {
        ReusableMethods.wait(1);
        adminPages.logoutLinkElementi.click();
        ReusableMethods.wait(1);

        Assert.assertTrue(adminPages.WelcomeToYaziElementi.isDisplayed());
        ReusableMethods.wait(2);
    }


    // ********** US_035  **********


    // ********** US_036  **********


    // ********** US_037  **********


    // ********** US_038  **********


    // ********** US_039  **********


    // ********** US_040  **********


    // ********** US_041  **********

    @Given("acilan login sayfasinda manage users butonunu tılanır")
    public void acilanLoginSayfasindaManageUsersButonunuTılanır() {

        ReusableMethods.wait(1);
        adminPages.manageUsersButton.click();
        ReusableMethods.wait(1);
    }
    @Then("active users butonun linklerinin gorunur oldugunu ve aktif oldugu dogrulanır")
    public void activeUsersButonunLinklerininGorunurOldugunuVeAktifOlduguDogrulanır() {
        adminPages.activeUsersButton.isEnabled();
        ReusableMethods.wait(1);
        adminPages.activeUsersButton.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.activeUsersButton.click();
        ReusableMethods.wait(2);

    }
    @Then("active users butonuna tiklandiginda {string} sutunundaki active users listesi ve basliklarinin gorunur oldugunu test eder")
    public void activeUsersButonunaTiklandigindaSutunundakiActiveUsersListesiVeBasliklarininGorunurOldugunuTestEder(String istenenBaslik) {

        int istenenSutunIndexi = 0;
        List<WebElement> headerElementListesi = adminPages.userListesi;
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
    @Then("details butonun gorunur ve aktif oldugu dogrulanır")
    public void detailsButonunGorunurVeAktifOlduguDogrulanır() {

        adminPages.detailsButtonElement.isEnabled();
        ReusableMethods.wait(1);
        adminPages.detailsButtonElement.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.detailsButtonElement.click();
        ReusableMethods.wait(2);
    }
    @And("user Detail sayfasina yonlendirildigi dogrulanir")
    public void userDetailSayfasinaYonlendirildigiDogrulanir() {
        Assert.assertTrue(adminPages.userDetailSayfasi.isDisplayed());
        ReusableMethods.wait(2);
    }
    @And("transactions butonuna tiklanir")
    public void transactionsButonunaTiklanir() {
        adminPages.viewAllButonu.click();
        ReusableMethods.wait(2);
    }
    @Then("filtreleme içeriğindeki alanlar işlevsel ve aktif olmalıdır.")
    public void filtrelemeIçeriğindekiAlanlarIşlevselVeAktifOlmalıdır() {
        adminPages.typeAllButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.typeAllButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.typeAllButonu.click();

        adminPages.remarkAnyButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.remarkAnyButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.remarkAnyButonu.click();

        adminPages.dateStartButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.dateStartButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.dateStartButonu.click();
    }
    // ********** US_042  **********


        // ********** US_043  **********


        // ********** US_044  **********


        // ********** US_045  **********


        // ********** US_046  **********


        // ********** US_047  **********


        // ********** US_048  **********
        @Given("yonetici olarak banned users buton Link Gorunur ve aktif olmali,tiklandiginda banned users sayfasına yonlendirildigi dogrulanmalıdır")
        public void yoneticiOlarakBannedUsersButonLinkGorunurVeAktifOlmaliTiklandigindaBannedUsersSayfasınaYonlendirildigiDogrulanmalıdır() {

            adminPages.bannedUsersButonu.isEnabled();
            ReusableMethods.wait(1);
            adminPages.bannedUsersButonu.isDisplayed();
            ReusableMethods.wait(1);
            adminPages.bannedUsersButonu.click();
            Assert.assertTrue(adminPages.bannedUsersYaziElementi.isDisplayed());
            ReusableMethods.wait(2);
    }
    @Then("banned users butonuna tiklandiginda {string} sutunundaki banned users listesi ve basliklarinin gorunur oldugunu test eder")
    public void bannedUsersButonunaTiklandigindaSutunundakiBannedUsersListesiVeBasliklarininGorunurOldugunuTestEder(String istenenBaslik) {

        int istenenSutunIndexi = 0;
        List<WebElement> headerElementListesi = adminPages.userListeBasliklari;
        for (int i = 0; i < headerElementListesi.size(); i++) {

            if (headerElementListesi.get(i).getText().equals(istenenBaslik)) {
                istenenSutunIndexi = i + 1;
            }
            System.out.println(headerElementListesi.get(i).getText());
        }
    }
    @Then("search box'dan istenen kullanıcıyı seçebilmeli ve detail bilgilerine erisebildigini test eder")
    public void searchBoxDanIstenenKullanıcıyıSeçebilmeliVeDetailBilgilerineErisebildiginiTestEder() {
        adminPages.bannedSearcBox.click();
       adminPages.bannedSearcBox.sendKeys("asyaturk");
       ReusableMethods.wait(1);
        adminPages.bannedSearchIkonu.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.arananIsimElementi.isDisplayed());
        ReusableMethods.wait(2);
        adminPages.bannedDetailButonu.click();
    }
    @Then("Unban User butonu gorunur ve aktif oldugunu dogrular")
    public void unbanUserButonuGorunurVeAktifOldugunuDogrular() {

        adminPages.unbanUserButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.unbanUserButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.unbanUserButonu.click();
        ReusableMethods.wait(1);
        adminPages.unbanUserYesButonu.isEnabled();
        ReusableMethods.wait(1);
        adminPages.unbanUserYesButonu.isDisplayed();
        ReusableMethods.wait(1);
        adminPages.unbanUserYesButonu.click();
    }
    @Then("active users sayfasinda search box'a  kullanıcıyı aratip ve detail bilgilerine erisebildigini test eder")
    public void activeUsersSayfasindaSearchBoxAKullanıcıyıAratipVeDetailBilgilerineErisebildiginiTestEder() {
        ReusableMethods.wait(2);
        adminPages.activeUsersButton.click();
        ReusableMethods.wait(2);

        adminPages.activeUserSearchBox.click();
        adminPages.activeUserSearchBox.sendKeys("asyaturk");
        ReusableMethods.wait(1);
        adminPages.activeUsersSearchIkon.click();
        ReusableMethods.wait(1);
        adminPages.detailsButtonElement.click();

        Assert.assertTrue(adminPages.userDetailSayfasi.isDisplayed());
        ReusableMethods.wait(2);
    }

    // ********** US_049  **********


        // ********** US_050  **********


        // ********** US_051  **********


        // ********** US_052  **********


        // ********** US_053  **********


        // ********** US_054  **********


        // ********** US_055  **********


    }
