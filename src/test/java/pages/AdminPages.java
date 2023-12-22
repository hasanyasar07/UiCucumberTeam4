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




    // **********  Withdrawals **********
    @FindBy(xpath = "//span[text()='Withdrawals ']")
    public WebElement withdrawalsSidebarLink;

    @FindBy(xpath = "//span[text()='Pending Withdrawals']")
    public WebElement pendingWithdrawalsSidebarLink;

    @FindBy(xpath = "//h6[text()='Pending Withdrawals']")
    public WebElement pendingWithdrawalsTitle;

    @FindBy(xpath = "(//th)[1]")
    public WebElement gatewayHeader;

    @FindBy(xpath = "(//th)[2]")
    public WebElement initiatedHeader;

    @FindBy(xpath = "(//th)[3]")
    public WebElement userHeader;

    @FindBy(xpath = "(//th)[4]")
    public WebElement amountHeader;

    @FindBy(xpath = "(//th)[5]")
    public WebElement conversionHeader;

    @FindBy(xpath = "(//th)[6]")
    public WebElement statusHeader;

    @FindBy(xpath = "(//th)[7]")
    public WebElement actionHeader;

    @FindBy(xpath = "(//td)[1]")
    public WebElement gatewayData;

    @FindBy(xpath = "(//td)[2]")
    public WebElement initiatedData;

    @FindBy(xpath = "(//td)[3]")
    public WebElement userData;

    @FindBy(xpath = "(//td)[4]")
    public WebElement amountData;

    @FindBy(xpath = "(//td)[5]")
    public WebElement conversionData;

    @FindBy(xpath = "(//td)[6]")
    public WebElement statusData;

    @FindBy(xpath = "(//td)[7]")
    public WebElement actionData;

    @FindBy(xpath = "//*[text()='User Withdraw Information']")
    public  WebElement userWithdrawInformationTitle;

    @FindBy(xpath = "//*[@class='btn btn-outline--success ms-1 approveBtn']")
    public WebElement approveWithdrowButton;

    @FindBy(xpath = "//*[@class='btn btn-outline--danger ms-1 rejectBtn']")
    public WebElement rejectWithdrowButton;

    @FindBy(xpath = "(//textarea[@name='details'])[1]")
    public WebElement withdrowalApproveOrRejectTextBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public  WebElement withdrowalApproveOrRejectSubmit;

    @FindBy(xpath = "//div[@class='iziToast-body']")
    public WebElement successfullyApproveWithdrawalConfirmation;

    @FindBy(xpath = "(//small)[1]")
    public WebElement transactionNo;

    @FindBy(xpath = "(//input[@type='search'])[2]")
    public WebElement searchTransaction;

    @FindBy(xpath = "(//input[@type='search'])[3]")
    public WebElement searchStartDataEndData;

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement searchTransactionButton;

    @FindBy(xpath = "//button[@class='btn btn--primary input-group-text']")
    public WebElement searchStartDataEndDataButton;

    @FindBy(xpath = "//span[text()='Approved Withdrawals']")
    public WebElement approvedWithdrawalsSideBarLink;

    @FindBy(xpath = "//h6[text()='Approved Withdrawals']")
    public WebElement approveWithdrawalsTitle;

    @FindBy(xpath = "//span[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawalsSideBarLink;

    @FindBy(xpath = "//h6[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawalsTitle;



    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
