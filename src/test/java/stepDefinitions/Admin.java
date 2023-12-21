package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPages;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.awt.*;



    public class Admin {
        AdminPages adminPages = new AdminPages();
        Select select;
        @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")

        public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
            adminPages.adminLoginMethod(username, password);
        }


        // ********** US_025  ********** YUSUF
    @Given("kullaniciya verilen {string} ve {string} bilgileri ile admin sayfasina login olur.")
    public void kullaniciya_verilen_ve_bilgileri_ile_admin_sayfasina_login_olur(String username, String adminpassword) {
      adminPages.adminLoginMethod(username,adminpassword);
    }
    @Then("Admin ekraninda {string} yazisinin gorunurlugu kontrol edilir.")
    public void admin_ekraninda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.LoansButton.isDisplayed());

    }
    @Given("{string} menusune tiklanir.")
    public void menusune_tiklanir(String string) {
        adminPages.LoansButton.click();
    }
    @Then("Pending Loans gorunurlugu kontrol edilir.")
    public void pending_loans_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.PendingLoansButton.isDisplayed());
    }
    @Then("Paid Loans gorunurlugu kontrol edilir.")
    public void paid_loans_gorunurlugu_kontrol_edilir() {

        Assert.assertTrue(adminPages.paidLoansButton.isDisplayed());
    }
    @Then("Rejected Loans gorunurlugu kontrol edilir.")
    public void rejected_loans_gorunurlugu_kontrol_edilir() {

        Assert.assertTrue(adminPages.rejectedLoansButton.isDisplayed());

    }
    @Given("Pending Loans tiklanir.")
    public void pending_loans_tiklanir() {
        adminPages.PendingLoansButton.click();
    }
    @Then("Pending Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void pending_loans_sayfasinda_yazisinin_ggrunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.PendingLoansButton.isDisplayed());
    }
    @Given("Running Loans tiklanir.")
    public void running_loans_tiklanir() {
        adminPages.runningLoansButton.click();

    }
    @Then("Running Loans sayfasinda\"Running Loans\" yazisinin gorunurlugu kontrol edilir.")
    public void running_loans_sayfasinda_running_loans_yazisinin_gorunurlugu_kontrol_edilir() {
        Assert.assertTrue(adminPages.runningLoansButton.isDisplayed());
    }
    @Then("Due Loans tiklanir.Due Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void due_loans_tiklanir_due_loans_sayfasinda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        adminPages.dueLoansButton.click();
        Assert.assertTrue(adminPages.dueLoansButton.isDisplayed());
    }
    @Given("Paid Loans tiklanir.")
    public void paid_loans_tiklanir() {
        adminPages.paidLoansButton.click();
    }
    @Then("Paid Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void paid_loans_sayfasinda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.paidLoansButton.isDisplayed());
    }
    @Given("Rejected Loans tiklanir.")
    public void rejected_loans_tiklanir() {
        adminPages.rejectedLoansButton.click();
    }
    @Then("Rejected Loans sayfasinda {string} yazisinin gorunurlugu kontrol edilir.")
    public void rejected_loans_sayfasinda_yazisinin_gorunurlugu_kontrol_edilir(String string) {
        Assert.assertTrue(adminPages.rejectedLoansButton.isDisplayed());
       
       }
      
      // ********** US_026  **********

      

      // ********** US_027  **********
      
      
      
      // ********** US_028  **********

      
    @Then("Loans menu basligi altindaki {string} sayfa linkine tiklandiginda {string} sayfasina gectiginin kontrolu yapilir.")
    public void loans_menu_basligi_altindaki_sayfa_linkine_tiklandiginda_sayfasina_gectiginin_kontrolu_yapilir(String string, String string2) {

    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda S.N. gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_s_n_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Loan No. | Plan gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_loan_no_plan_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda User gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_user_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_amount_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_amount_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Created | Next Installment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_created_next_ınstallment_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Status gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_status_gorunurlugu_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Due Loans sayfasindaki Due Installment Loans tablosu uzerinde {string} bilgileri ile alanında numara ve tarih girilerek arama yapilir.")
    public void due_loans_sayfasindaki_due_ınstallment_loans_tablosu_uzerinde_bilgileri_ile_alanında_numara_ve_tarih_girilerek_arama_yapilir(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Due Installment Loans tablosunda bulunan Action basligi altinda secilen kredinin Details ve Installment bilgilerine erisilebilirligi kontrol edilir.")
    public void due_ınstallment_loans_tablosunda_bulunan_action_basligi_altinda_secilen_kredinin_details_ve_ınstallment_bilgilerine_erisilebilirligi_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Details sayfasinda kredi detaylarina \\(Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine ) erisilebilmelidir.")
    public void details_sayfasinda_kredi_detaylarina_plan_date_of_application_loan_number_amount_per_ınstallment_total_ınstallment_given_ınstallment_total_payable_profit_status_bilgilerine_erisilebilmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasinda Loan summary bilgileri \\(Loan Number, Plan, Loan Amount,  Per Installment, Total Installment, Given Installment,  Receivable, Delay Charge) goruntulenmelidir.")
    public void ınstallments_sayfasinda_loan_summary_bilgileri_loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_goruntulenmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasinda taksitler S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenmelidir.")
    public void ınstallments_sayfasinda_taksitler_s_n_ınstallment_date_given_on_delay_charge_bilgileri_ile_goruntulenmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasindan Due Loans sayfasina donus yapilabilmelidir.")
    public void ınstallments_sayfasindan_due_loans_sayfasina_donus_yapilabilmelidir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Installments sayfasinda taksitler {int}'den fazlaysa bir sonraki sayfada listelenmeye devam etmelidir.")
    public void ınstallments_sayfasinda_taksitler_den_fazlaysa_bir_sonraki_sayfada_listelenmeye_devam_etmelidir(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

         // ********** US_029  **********


        // ********** US_030  **********


        // ********** US_031  **********


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
            Assert.assertTrue(adminPages.passwordSuccessfullYaziElementi.isDisplayed());
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
            ReusableMethods.wait(2);
            Assert.assertTrue(adminPages.unbannedSuccessfullyYaziElementi.isDisplayed());
            ReusableMethods.wait(2);

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
        public void baslikKismindaDoldurulmasiGerekenBosluklarDoldurulmadigindaUyariYazisiCikar() throws IOException {
            ReusableMethods.wait(2);
            String resim =ReusableMethods.getScreenshot("uyari");
            //Assert.assertTrue();
        }
        @Then("admin tempmail urle gider")
        public void adminTempmailUrleGider() {
            Driver.getDriver().get(ConfigReader.getProperty("tempMailUrl"));
        }
        @When("gonderilen mailin basligin {string} oldugunu dogrular")
        public void gonderilenMailinBasliginOldugunuDogrular(String baslik) {
            ReusableMethods.wait(20);
            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(adminPages.tempMailMailBox.getText().contains(baslik));

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

        
        // ********** US_056  **********


        // ********** US_057  **********

   // ********** US_058  **********


    @Given("admin enters {string} and {string} information where necessary.")
    public void admin_enters_and_information_where_necessary(String string, String string2) {
        adminPages.adminUsernameBox.sendKeys("selimebeyza");
        adminPages.adminPasswordBox.sendKeys("123123123");

    }
    @Then("he clicks the login button and logs in successfully as admin.")
    public void he_clicks_the_login_button_and_logs_in_successfully_as_admin() {
        adminPages.adminLoginButon.click();
        ReusableMethods.wait(1);
    }
    @Then("click on the Withdrawal button and then the Withdrawal Methods button.")
    public void click_on_the_withdrawal_button_and_then_the_withdrawal_methods_button() {
    adminPages.withdrawalsButton.click();
    adminPages.withdrawalsMethodsButton.click();
    ReusableMethods.wait(1);
    }
    @Then("it is tested that the Withdrawal Methods page can be accessed.")
    public void it_is_tested_that_the_withdrawal_methods_page_can_be_accessed() {
        Assert.assertTrue(adminPages.withdrawalsMethodsPage.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("it tests whether it can display the Method, Currency, Charge, Withdraw Limit, Status information.")
    public void it_tests_whether_it_can_display_the_method_currency_charge_withdraw_limit_status_information() {
        Assert.assertTrue(adminPages.withdrawalsMethodsPage.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("it tests whether it can reach the edit page under the action heading.")
    public void it_tests_whether_it_can_reach_the_edit_page_under_the_action_heading() {
        adminPages.withdrawalsActionEdit.click();
        Assert.assertTrue(adminPages.updateWithdrawalMethodPage.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("clicks on the edit page under the action link.")
    public void clicks_on_the_edit_page_under_the_action_link() {
        adminPages.withdrawalsActionEdit.click();
        ReusableMethods.wait(1);
    }
    @Then("it tests whether it can update.")
    public void it_tests_whether_it_can_update() {
        Assert.assertTrue(adminPages.withdrawMethodUpdatedSuccesfully.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("the visibility of the method selected under the action heading is tested.")
    public void the_visibility_of_the_method_selected_under_the_action_heading_is_tested() {
        Assert.assertTrue(adminPages.withdrawEnable.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("click on the add new button and fill in the necessary information.")
    public void click_on_the_add_new_button_and_fill_in_the_necessary_information() {
        adminPages.withdrawAddNew.click();
        adminPages.newWithdrawalMethodName.sendKeys("beyza korumaz");
        adminPages.newWithdrawalMethodCurrency.sendKeys("IT");
        adminPages.newWithdrawalMethodRate.sendKeys("20");
        adminPages.newWithdrawalMethodMinimumAmount.sendKeys("100");
        adminPages.newWithdrawalAmount.sendKeys("1000");
        adminPages.fixedCharge.sendKeys("100");
        adminPages.percentCharge.sendKeys("1000");

    }
    @Then("click on the Submit button.")
    public void click_on_the_submit_button() {
        adminPages.newWithdrawalMethodSubmit.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.succesfullyText.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Then("closes the page.")
    public void closes_the_page() {
        Driver.closeDriver();
    }

        // ********** US_059  **********


        
        // ********** US_060  **********



        // ********** US_061  **********


        

    // ********** US_062  **********

    @Then("click on the Withdrawals button and then the All Withdrawals link.")
    public void click_on_the_withdrawals_button_and_then_the_all_withdrawals_link() {
    adminPages.withdrawalsButton.click();
    adminPages.allWithdrawals.click();
    ReusableMethods.wait(1);
    }
    @Then("it tests whether it can view the Withdrawals Log page in the All Withdrawals link.")
    public void it_tests_whether_it_can_view_the_withdrawals_log_page_in_the_all_withdrawals_link() {
        Assert.assertTrue(adminPages.WithdrawalsLogPage2.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("it is tested whether the titles Gateway, Initiated, User, Amount, Conversion, Status, Action are displayed in the Withdrawals Log list.")
    public void it_is_tested_whether_the_titles_gateway_ınitiated_user_amount_conversion_status_action_are_displayed_in_the_withdrawals_log_list() {
        Assert.assertTrue(adminPages.gatewayTransaction.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Then("Withdrawals Log sayfasında Username,Transaction No ve Start Date, End Date bilgileri ile arama yapilabileceği test edilir.")
    public void withdrawals_log_sayfasında_username_transaction_no_ve_start_date_end_date_bilgileri_ile_arama_yapilabileceği_test_edilir() {
        Assert.assertTrue(adminPages.gatewayTransaction.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Then("it is tested that you can search with Username, Transaction No, Start Date, End Date information on the Withdrawals Log page.")
    public void it_is_tested_that_you_can_search_with_username_transaction_no_start_date_end_date_information_on_the_withdrawals_log_page() {
        adminPages.details.click();
        ReusableMethods.wait(1);

    }

    @Then("it tests whether it can access the details page under the action heading for the details of the payment transactions on the Withdrawals Log page.")
    public void it_tests_whether_it_can_access_the_details_page_under_the_action_heading_for_the_details_of_the_payment_transactions_on_the_withdrawals_log_page() {

        Assert.assertTrue(adminPages.detailsPage.isDisplayed());
        ReusableMethods.wait(1);

    }

    @Then("on the Withdrawals Log page, click on details under the action heading to accept or reject the payment transaction.")
    public void on_the_withdrawals_log_page_click_on_details_under_the_action_heading_to_accept_or_reject_the_payment_transaction() {
        adminPages.details.click();
        ReusableMethods.wait(1);

    }
    @Then("it tests whether it can access the details page under the action heading to accept or reject the payment transaction on the Withdrawals Log page.")
    public void it_tests_whether_it_can_access_the_details_page_under_the_action_heading_to_accept_or_reject_the_payment_transaction_on_the_withdrawals_log_page() {
        adminPages.details.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPages.detailsPage.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Then("it is tested that the Withdrawals Log page contains Approved Withdrawals, Pending Withdrawals, Rejected Withdrawals and redirects to the required page.")
    public void it_is_tested_that_the_withdrawals_log_page_contains_approved_withdrawals_pending_withdrawals_rejected_withdrawals_and_redirects_to_the_required_page() {

        adminPages.approvedWithdrawals2.click();
        Assert.assertTrue(adminPages.approvedWithdrawalsPage.isDisplayed());
        ReusableMethods.wait(2);
        adminPages.rejectedWithdrawals2.click();
        Assert.assertTrue(adminPages.rejectedWithdrawalsPage.isDisplayed());
        ReusableMethods.wait(2);
        adminPages.pendingWithdrawals2.click();
        Assert.assertTrue(adminPages.pendingWithdrawalsPage.isDisplayed());
        ReusableMethods.wait(2);
    }













       



    }
