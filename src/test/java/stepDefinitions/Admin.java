package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import utilities.ReusableMethods;

import java.awt.*;



    public class Admin {
        AdminPages adminPages = new AdminPages();
        Select select;
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

        // ********** US_032 HILAL **********

        @Given("Launch browser")
        public void launch_browser() {

        }

        @Given("Navigate to {string}")
        public void navigateTo(String arg0) {
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        }

        @Given("the user logs in to the admin page with the given {string} and {string} information")
        public void theUserLogsInToTheAdminPageWithTheGivenAndInformation(String username, String password) {
            adminPages.adminLoginMethod(username, password);
        }

        @Given("Verify that Admin homepage is visible successfully")
        public void verify_that_admin_homepage_is_visible_successfully() {
            adminPages.manageUsersButton.click();
            Assert.assertTrue(adminPages.manageUsersButton.isDisplayed());

        }

        @Given("Close the page")
        public void close_the_page() {
            Driver.closeDriver();

        }



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
        public void acılanSayfadaNameEmailTextBoxlarıVeFotoğrafGUncellenipAktifOlduguDogrulanir() throws AWTException {

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


            StringSelection resim = new StringSelection("C:\\Users\\Gülizar\\IdeaProjects\\UiCucumberTeam4\\src\\test\\java\\picture\\profil.png");
            //StringSelection resim=new StringSelection(System.getProperty("user.dir")+"SmartCardLink_Team3\\a.jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resim, null);
            Robot robot = new Robot();
            ReusableMethods.wait(1);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            ReusableMethods.wait(1);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_CONTROL);
            ReusableMethods.wait(5);
            robot.keyPress(KeyEvent.VK_ENTER);
            ReusableMethods.wait(3);



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

        @Then("admin sayfayi kapatir")
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

        // ********** US_051  **********


        // ********** US_052  **********
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

        @And("admin Deposits listesinin goruntulenebilir oldugunu dogrular")
        public void adminApprovedDepoitsListesininGoruntulenebilirOldugunuDogrular() {
            System.out.println("Deposit table "+adminPages.depositsTable.getText());
            Assert.assertTrue(adminPages.depositsTable.isDisplayed());
        }
        @When("admin Deposits listesindeki basliklarin ve altindaki bilgilerin goruntulenebilir oldugunu dogrular")
        public void admin_approved_deposits_listesindeki_basliklarin_ve_altindaki_bilgilerin_goruntulenebilir_oldugunu_dogrular() {
            System.out.println("headers " + adminPages.depositsLinkHeaders.getText());
            Assert.assertTrue(adminPages.depositsLinkHeaders.isDisplayed());
            Assert.assertTrue(adminPages.depositsTable.isDisplayed());
        }

        @And("admin Details butonun gorunur ve aktif oldugunu dogrular")
        public void adminDetailsButonunGorunurVeAktifOldugunuDogrular() {
            Assert.assertTrue(adminPages.detailsButton.isDisplayed());
            Assert.assertTrue(adminPages.detailsButton.isEnabled());
        }

        @And("admin Details butonuna tiklar")
        public void adminDetailsButonunaTiklar() {
            adminPages.detailsButton.click();
        }

        @Then("Details sayfasindaki bilgilerin goruntulendigi dogrulanir")
        public void detailsSayfasindakiBilgilerinGoruntulendigiDogrulanir() {
            ReusableMethods.wait(2);
            Assert.assertTrue(adminPages.DetailspageAllInfos.isDisplayed());
        }


        // ********** US_053  **********
        @Then("admin Succesful Deposits linkine tiklar")
        public void adminSuccesfulDepositsLinkineTiklar() {
            adminPages.succesfullDepositsLink.click();
        }

        // ********** US_054  **********
        @Then("admin Rejected Deposits linkine tiklar")
        public void adminRejectedDepositsLinkineTiklar() {
            adminPages.RejectedDepositsLink.click();
        }

        // ********** US_055  **********
        @Given("Initiated Deposits linkine tiklar")
        public void initiatedDepositsLinkineTiklar() {
            adminPages.InitiatedDepositsLink.click();
        }


    }
