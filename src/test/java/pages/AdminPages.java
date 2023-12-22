package pages;

import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;

public class AdminPages {
    public JsonParser firstrowElement;

    public AdminPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // ********** Admin Login Page ***********
    public void adminLoginMethod(String username, String password){
        adminUsernameBox.sendKeys(ConfigReader.getProperty(username));
        adminPasswordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(1);
        adminLoginButon.submit();
    }





    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement adminUsernameBox;
    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement adminPasswordBox;
    @FindBy(xpath = "//*[@class='btn cmn-btn w-100']")
    public WebElement adminLoginButon;
    @FindBy(xpath = "//*[@class='navbar-user__name']")//Admin anasayfa kisiselisim acilir menu(sag ust kose)
    public WebElement kisiselIsimMenu;

    // ********** Dashboard **********

    @FindBy(xpath = "//*[@class='las la-chevron-circle-down']")
    public WebElement adminIkonu;


    @FindBy(xpath = "//*[@class='dropdown-menu__caption'][1]")
    public WebElement profilLinkElementi;

    @FindBy(xpath = "(//*[@class='dropdown-menu__item d-flex align-items-center px-3 py-2'])[2]")
    public WebElement passwordLinkElementi;

    @FindBy(xpath = "(//*[@class='dropdown-menu__caption'])[3]")
    public WebElement logoutLinkElementi;

    @FindBy(xpath = "//*[text()='Profile Information']")
    public WebElement profileInformationYaziElementi;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement ProfilNameBox;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement ProfilEmailBox;

    @FindBy(xpath = "//*[@class='bg--success']")
    public WebElement uploadImageButon;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement profilSubmitButon;

    @FindBy(xpath = "//*[text()='Password changed successfully.']")
    public WebElement passwordSuccessfullYaziElementi;


    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement changePasswordYaziElementi;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement profilPasswordBox;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement profilNewPasswordBox;

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public WebElement profilConfirmPasswordBox;

    @FindBy(xpath = "//*[@class='btn btn--primary w-100 btn-lg h-45']")
    public WebElement passwordSubmitButton;

    @FindBy(xpath = "//*[text()='Welcome to '] ")
    public WebElement WelcomeToYaziElementi;




    // ********** Manage Users **********
    @FindBy(xpath = "(//*[@class='menu-title'])[2]")
    public WebElement manageUsersButton;



    @FindBy(xpath = "//*[text()='Active Users']")
    public WebElement activeUsersButton;

    @FindBy(xpath = "//*[@class='form-control bg--white']")
    public  WebElement activeUserSearchBox;

    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement activeUsersSearchIkon;
    @FindBy(xpath = "//tr/th")
    public List<WebElement> userListesi;

    @FindBy(xpath = "//tr/th")
    public List<WebElement> userListeBasliklari;


    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--primary']")
    public WebElement detailsButtonElement;

    @FindBy(xpath = "//*[@class='d-flex mb-30 flex-wrap gap-3 justify-content-between align-items-center']")
    public WebElement userDetailSayfasi;

    @FindBy(xpath = "//*[@class='widget-two__btn btn btn-outline--info']")
    public WebElement viewAllButonu;
    @FindBy(xpath = "//*[@id='trx_type']")
    public WebElement typeAllButonu;
    @FindBy(xpath = "//*[@id='remark']")
    public WebElement remarkAnyButonu;
    @FindBy(xpath = "//*[@class='datepicker-here form-control']")
    public WebElement dateStartButonu;

    @FindBy(xpath = "(//*[text()='Banned Users'])[1]")
    public WebElement bannedUsersButonu;
    @FindBy(xpath = "(//*[text()='Banned Users'])[2]")
    public WebElement bannedUsersYaziElementi;

    @FindBy(xpath = "//*[@class='form-control bg--white']")
    public WebElement bannedSearcBox;

    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement bannedSearchIkonu;
    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--primary']")
    public WebElement bannedDetailButonu;
    @FindBy(xpath = "//*[text()='Asya Turk']")
    public WebElement arananIsimElementi;
    @FindBy(xpath = "//*[@class='btn btn--success btn--gradi btn--shadow w-100 btn-lg userStatus']")
    public WebElement unbanUserButonu;
    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement unbanUserYesButonu;
    @FindBy(xpath = "//*[text()='User unbanned successfully']")
    public WebElement unbannedSuccessfullyYaziElementi;




    @FindBy(xpath = "(//*[@class='menu-title'])[2]")
    public WebElement manageUsersLink;
    @FindBy(xpath = "(//*[@class='menu-title'])[11]")//Manage Users >>Notification To All
    public WebElement notificationToAllLink;
    @FindBy(xpath = "//label[@for='being_sent_to']")//Manage >> Notification To All >> Being Sent
    public WebElement beingSendText;
    @FindBy(xpath = "(//*[@class='form-control'])[1]")//Manage Users >>Notification To All >> DropDownMenu
    public WebElement DropDownChooseUserBox;
    @FindBy(xpath = "//span[@role='combobox']")
    public WebElement selectUserBox;
    @FindBy(xpath = "//li[@role='option']")
    public WebElement selectedUserConfirm;
    @FindBy(xpath = "(//*[@class='form-control'])[2]")//Manage Users >>Notification To All >>Subject
    public WebElement SubjectTitleBox;
    @FindBy(xpath = "//*[@contenteditable='true']")
    public WebElement messageBox;
    @FindBy(xpath = "(//*[@class='form-control'])[3]")//Manage Users >>Notification To All >>StartForm
    public WebElement startFormBox;
    @FindBy(xpath = "(//*[@class='form-control'])[4]")//Manage Users >>Notification To All >>Per Batch
    public WebElement perBatchBox;
    @FindBy(xpath = "(//*[@class='form-control'])[5]")//Manage Users >>Notification To All >>Cooling Period
    public WebElement coolingPeriodBox;
    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement notificationSubmitButton;
    @FindBy(xpath = "//*[@class='mail-icon text--success fw-bold text-center']")
    public WebElement succesfullyDoneText;
    @FindBy(xpath = "//button[@class='btn btn--danger']")
    public WebElement succesfullyDoneCloseButton;

    @FindBy(xpath = "//*[text()='Please fill out this field.']")
    public WebElement warningText;

    // ********** Categories **********



    // ********** Loan Plans **********



    // ********** Loans **********

    // loans yazısının görünürlügü ve butonun locati
    @FindBy(xpath = "//span[text()='Loans']")
    public WebElement LoansButton;

    //Pending Loans butonun görünürlügü
    @FindBy(xpath = "//span[text()='Pending Loans']")
    public WebElement PendingLoansButton;

    // Paid Loans butonu
    @FindBy(xpath = "//span[text()='Paid Loans']")
    public WebElement paidLoansButton;

    // Rejected Loans butonu
    @FindBy(xpath = "//span[text()='Rejected Loans']")
    public WebElement rejectedLoansButton;

    //Running loans butonu
    @FindBy(xpath = "//span[text()='Running Loans']")
    public WebElement runningLoansButton;

    //Due Loans butonu
    @FindBy(xpath = "//span[text()='Due Loans']")
    public WebElement dueLoansButton;

    // Due Installment Loans ekranında S.N. alanini goruntuleme
    @FindBy(xpath = "//*[text()='S.N.']")
    public WebElement loansSn;

    //Due Installment Loans ekranında Loan No. | Plan alanini goruntuleme
    @FindBy(xpath = "//*[text()='Loan No. | Plan']")
    public WebElement loansNoPlan;

    //Due Installment Loans ekranında User alanini goruntuleme
    @FindBy(xpath = "//*[text()='User']")
    public WebElement loansUser;

    //Due Installment Loans ekranında Amount alanini goruntuleme

    @FindBy(xpath = "//*[text()='Amount']")
    public WebElement loansAmount;

    //Due Installment Loans ekranında Installment Amount alanini goruntuleme
    @FindBy(xpath = "//*[text()='Installment Amount']")
    public WebElement loansInstallmentAmount;

    //Due Installment Loans ekranında Installment alanini goruntuleme
    @FindBy(xpath = "//*[text()='Installment']")
    public WebElement loansInstallment;

    //Due Installment Loans ekranında Created Next Installment alanini goruntuleme

    @FindBy(xpath = "//th[contains(text(),'Created |')]")
    public WebElement loansCreatedNextInstallment;

    //Due Installment Loans ekranında Status alanini goruntuleme
    @FindBy(xpath = "//*[text()='Status']")
    public WebElement loansStatus;

    // All loans action

    @FindBy(xpath = "//*[text()='Action']")
    public WebElement allLoansAction;

    //All Loans alanina tiklama
    @FindBy(xpath = "//*[text()='All Loans']")
    public WebElement allLoansButton;

    // all loans alanında loan no alani
    @FindBy(xpath = "//input[@placeholder='Loan No.']")
    public WebElement loanNo;

    // all loans arama kutusu
    @FindBy(xpath = "(//i[@class='la la-search'])[1]")
    public WebElement loansSearchButton;

    // all loans arama isleminde dogrulama
    @FindBy(xpath = "//span[text()='EPEGJ1CXNW47']")
    public WebElement loanNoDogrulama;

    // all loans date
    @FindBy(xpath = "//input[@placeholder='Start Date - End Date']")
    public WebElement startDateEndDate;

    // all loans start date en date sorgulaması dogrulama
    @FindBy(xpath = "//span[text()='ZNT25BEA2PFA']")
    public WebElement startDateEndDateDogrulama;

    // all loans tarih yazildiktan sonra arama islemini yapar.

    @FindBy(xpath = "//button[@class='btn btn--primary input-group-text']")
    public WebElement searchButton;

    // details butonu
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary'][normalize-space()='Details'])[1]")
    public WebElement detailsButtonu;

    // details plan gorunurlugu
    @FindBy(xpath = "//span[text()='Plan']")
    public WebElement detailsPlan;

    // details date of application yazisi gorunurlugu
    @FindBy(xpath = "//span[text()='Date of Application']")
    public WebElement detailsDateOfApplication;

    //details loan number gorunurlugu
    @FindBy(xpath = "//span[text()='Loan Number']")
    public WebElement detailsLoanNumber;

    // details amount yazisi
    @FindBy(xpath = "//span[text()='Amount ']")
    public WebElement detailsAmount;

    // details Per Installment

    @FindBy(xpath ="//span[text()='Per Installment']")
    public WebElement detailsPerInstallment;

    // details Total Installment
    @FindBy(xpath = "//span[text()='Total Installment']")
    public WebElement detailsTotalInstallment;

    // details Given Installment
    @FindBy(xpath = "//span[text()='Given Installment']")
    public WebElement detailsGivenInstallment;

    // details  Total Payable

    @FindBy(xpath = "//span[text()='Total Payable']")
    public WebElement detailsTotalPayable;

    // details Profit
    @FindBy(xpath = "//span[text()='Profit']")
    public WebElement detailsProfit;

    // details Status
    @FindBy(xpath = "//span[text()='Status']")
    public WebElement detailsStatus;

    // details Loan Form Submitted by User

    @FindBy(xpath = "//*[text()='Loan Form Submitted by User']")
    public WebElement detailsLfSByUser;

    // All loans Installments butonu

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--success'])[1]")
    public WebElement InstallmentsButton;

    // Installments Loan Number
    @FindBy(xpath = "//span[text()='Loan Number']")
    public WebElement InstallmentsLoanNumber;

    //Installments Plan
    @FindBy(xpath = "//span[text()='Plan']")
    public WebElement InstallmentsPlan;

    // Installments loan Amount

    @FindBy(xpath = "//span[text()='Loan Amount']")
    public WebElement InstallmentsLoanAmount;

    // Installments per Installment
    @FindBy(xpath = "//span[text()='Per Installment']")
    public WebElement InstallmentsPerInstallment;

    //Total Installment

    @FindBy(xpath = "//span[text()='Total Installment']")
    public WebElement InstallmentsTotalInstallment;

    // Installments Given Installment
    @FindBy(xpath = "//span[text()='Given Installment']")
    public WebElement InstallmentsGivenInstallment;

    // Insttallments Receivable
    @FindBy(xpath = "//span[text()='Receivable']")
    public WebElement InstallmentsReceivable;

    // Installments S.N.
    @FindBy(xpath = "//*[text()='S.N.']")
    public WebElement InstallmentSN;

    // Installments Installment Date

    @FindBy(xpath = "//*[text()='Installment Date']")
    public WebElement InstallmentsInstallmentDate;

    // Installment Given On
    @FindBy(xpath = "//*[text()='Given On']")
    public WebElement InsttalmentsGivenOn;

    // Installments Delay
    @FindBy(xpath = "//*[text()='Delay']")
    public WebElement InstallmentsDelay;

    // Installments Delay

    @FindBy(xpath = "//*[text()='Charge']")
    public WebElement InstallemntsCharge;

    // Installments Delay Charge
    @FindBy(xpath = "//span[text()='Delay Charge']")
    public  WebElement InstallmentsDelayCharge;

    // Installments Back
    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement InstallmentsBack;

    // Installments ikinci sayfaya gecis yapma

    @FindBy(xpath = "//a[normalize-space()='2']")
    public  WebElement InstallmentsPageSayfa;

    // Installments ikinci sayfada oldugu dogrulama
    @FindBy(xpath = "//span[text()='D8JSH7OR1YK1']")
    public WebElement twosayfa;

    // ********** Payment Gateways **********



    // ********** Deposits **********
    @FindBy(xpath = "(//*[@class='menu-title'])[24]")
    public WebElement depositsLink;
    @FindBy(xpath = "(//*[@class='menu-title'])[26]")
    public WebElement approvedDepositsLink;
    @FindBy(xpath = "//table[@class='table table--light style--two']")
    public WebElement depositsTable;
    @FindBy(xpath = "//thead")
    public WebElement depositsLinkHeaders;
    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement detailsButton;
    @FindBy(xpath = "//*[@class='card-body']")
    public WebElement DetailspageAllInfos;
    @FindBy(xpath = "(//span[@class='menu-title'])[27]")
    public WebElement succesfullDepositsLink;
    @FindBy(xpath = "(//span[@class='menu-title'])[28]")
    public WebElement RejectedDepositsLink;
    @FindBy(xpath = "(//span[@class='menu-title'])[29]")
    public WebElement InitiatedDepositsLink;

    // Deposits altindaki Pending Deposit alanina tiklar
    @FindBy(xpath = "//span[text()='Pending Deposits']")
    public WebElement pendingDepositsButton;

    // Deposits altindaki All Deposits
    @FindBy(xpath = "//span[text()='All Deposits']")
    public WebElement AllDepositsButton;

    // Deposit altindaki All Deposits Deposit History goruntulenmesi
    @FindBy(xpath = "//h6[text()='Deposit History']")
    public WebElement depositHistory;


    // **********  Withdrawals **********



    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
