package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
            adminPages.dueLoansButton.click();
            Assert.assertTrue(adminPages.dueLoansButton.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda S.N. gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_s_n_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansSn.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Loan No. | Plan gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_loan_no_plan_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansNoPlan.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda User gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_user_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansUser.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_amount_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansAmount.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment Amount gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_amount_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansInstallmentAmount.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda İnstallment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_installment_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansInstallment.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Created | Next Installment gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_created_next_ınstallment_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansCreatedNextInstallment.isDisplayed());
    }
    @Then("Due Loans sayfasinda Due İnstallment Loans Tablosunda Status gorunurlugu kontrol edilir.")
    public void due_loans_sayfasinda_due_installment_loans_tablosunda_status_gorunurlugu_kontrol_edilir() {
            Assert.assertTrue(adminPages.loansStatus.isDisplayed());
    }
    @Given("Due Loans sayfasindaki Due Installment Loans tablosu uzerinde {string} bilgileri ile alanında numara ve tarih girilerek arama yapilir.")
    public void due_loans_sayfasindaki_due_installment_loans_tablosu_uzerinde_bilgileri_ile_alanında_numara_ve_tarih_girilerek_arama_yapilir(String string) {

    }
    @Given("Due Installment Loans tablosunda bulunan Action basligi altinda secilen kredinin Details ve Installment bilgilerine erisilebilirligi kontrol edilir.")
    public void due_installment_loans_tablosunda_bulunan_action_basligi_altinda_secilen_kredinin_details_ve_ınstallment_bilgilerine_erisilebilirligi_kontrol_edilir() {

    }
    @Given("Details sayfasinda kredi detaylarina \\(Plan, Date of Application, Loan Number,Amount,  Per Installment, Total Installment, Given Installment,  Total Payable, Profit, Status bilgilerine ) erisilebilmelidir.")
    public void details_sayfasinda_kredi_detaylarina_plan_date_of_application_loan_number_amount_per_ınstallment_total_ınstallment_given_ınstallment_total_payable_profit_status_bilgilerine_erisilebilmelidir() {

    }
    @Then("Installments sayfasinda Loan summary bilgileri \\(Loan Number, Plan, Loan Amount,  Per Installment, Total Installment, Given Installment,  Receivable, Delay Charge) goruntulenmelidir.")
    public void installments_sayfasinda_loan_summary_bilgileri_loan_number_plan_loan_amount_per_ınstallment_total_ınstallment_given_ınstallment_receivable_delay_charge_goruntulenmelidir() {

    }
    @Then("Installments sayfasinda taksitler S.N., Installment Date, Given On, Delay, Charge bilgileri ile goruntulenmelidir.")
    public void installments_sayfasinda_taksitler_s_n_installment_date_given_on_delay_charge_bilgileri_ile_goruntulenmelidir() {

    }
    @Then("Installments sayfasindan Due Loans sayfasina donus yapilabilmelidir.")
    public void installments_sayfasindan_due_loans_sayfasina_donus_yapilabilmelidir() {

    }
    @Then("Installments sayfasinda taksitler {int}'den fazlaysa bir sonraki sayfada listelenmeye devam etmelidir.")
    public void installments_sayfasinda_taksitler_den_fazlaysa_bir_sonraki_sayfada_listelenmeye_devam_etmelidir(Integer int1) {

    }

         // ********** US_029  **********


        // ********** US_030  **********

        @Then("{string} ogesine tiklanir.")
        public void ogesine_tiklanir(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} yazisinin gorunur oldugunu dogrulayin.")
        public void all_loans_yazisinin_gorunur_oldugunu_dogrulayin() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasinda {string} adinin gorundugunu dogrulayin.")
        public void sayfasinda_adinin_gorundugunu_dogrulayin(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Given("{string} alanina kredi numarasini girin.")
        public void alanina_kredi_numarasini_girin(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("Kredi numarasinin arama kutusu simgesine tiklayin.")
        public void kredi_numarasinin_arama_kutusu_simgesine_tiklayin() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("Kredi numarasi ile sorgulama islemi yaptiktan sonra ilk gelen krediyi dogrulayin.")
        public void kredi_numarasi_ile_sorgulama_islemi_yaptiktan_sonra_ilk_gelen_krediyi_dogrulayin() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Given("Kredilerin Baslangıc Tarihi - Bitis Tarihi metin kutusuna tıklayin.")
        public void kredilerin_baslangic_tarihi_bitis_tarihi_metin_kutusuna_tiklayin() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} – {string} metin kutusuna “{double}.{int}-{int}.{int}.{int}” tarihleri yazilir.")
        public void metin_kutusuna_tarihleri_yazilir(String string, String string2, Double double1, Integer int1, Integer int2, Integer int3, Integer int4) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Given("{string} – {string} secme islemi yaptiktan sonra arama kutusu simgesine tiklanir.")
        public void secme_islemi_yaptiktan_sonra_arama_kutusu_simgesine_tiklanir(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasındaki {string} – {string} bilgileri ile arama yapildigi dogrulanir.")
        public void sayfasindaki_bilgileri_ile_arama_yapildigi_dogrulanir(String string, String string2, String string3) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Given("{string} sayfasinda ilk satirda yer alan {string} butonuna tiklanir.")
        public void sayfasinda_ilk_satirda_yer_alan_butonuna_tiklanir(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasinda {string} yazisinin gorundugunu dogrulayin.")
        public void sayfasinda_yazisinin_gorundugunu_dogrulayin(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string}\" alanina tiklayin. Geri donus yapin.")
        public void alanina_tiklayin_geri_donus_yapin(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string}\" sayfasındaki ilk satirda yer alan \"Installments\" butonuna tıklayin.")
        public void sayfasindaki_ilk_satirda_yer_alan_ınstallments_butonuna_tıklayin(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasında {string} gorundugunu dogrulayin.")
        public void sayfasinda_gorundugunu_dogrulayin(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasında {string}\" gorundugunu dogrulayin.")
        public void sayfasinda_gorundugunu_dogrulayin(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasina donmek icin  {string} butonuna tiklayin.")
        public void sayfasina_donmek_icin_butonuna_tiklayin(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasına donuldugunu dogrulayin.")
        public void sayfasina_donuldugunu_dogrulayin(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("{string} sayfasinin sag alt köşesindeki {string} butonuna tiklayarak bir sonraki sayfaya gecin.")
        public void sayfasinin_sag_alt_kosesindeki_butonuna_tiklayarak_bir_sonraki_sayfaya_gecin(String string, String string2) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("Sonraki sayfada oldugunuzu dogrulayin.")
        public void sonraki_sayfada_oldugunuzu_dogrulayin() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @Then("Sayfayi kapatin.")
        public void sayfayi_kapatin() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }



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
