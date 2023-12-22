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

    @FindBy(xpath = "//*[@class='btn btn--primary h-45 w-100']")
    public WebElement profilSubmitButon;

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

    @FindBy(xpath = "//span[@class='menu-title' and text()='Active Users']")
    public WebElement activeUsersButton;

    @FindBy(xpath = "(//td[@data-label='User'])[5]")
    public WebElement selectActiveUsers;
    @FindBy(xpath = "(//*[@class='button--group'])[1]")
    public WebElement detailsButton;
    @FindBy(xpath = "//*[@id='search']")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@class='la la-search']")
    public WebElement searchBoxButton;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement userDetail;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--danger'])[1]")
    public WebElement withdrawnWiewAll;
    @FindBy(xpath = "(//*[@class='col-xl-4 col-sm-6 mb-30'])[1]")
    public WebElement approvedWithdrawals;
    @FindBy(xpath = "(//*[@class='col-xl-4 col-sm-6 mb-30'])[2]")
    public WebElement pendingWithdrawals;
    @FindBy(xpath = "(//*[@class='col-xl-4 col-sm-6 mb-30'])[3]")
    public WebElement rejectedWithdrawals;
    @FindBy(xpath = "(//tr//th)[1]")
    public WebElement gatewayTransaction;
    @FindBy(xpath = "(//tr//th)[2]")
    public WebElement initiated;
    @FindBy(xpath = "(//tr//th)[3]")
    public WebElement user;
    @FindBy(xpath = "(//tr//th)[4]")
    public WebElement amount;

    @FindBy(xpath = "(//tr//th)[5]")
    public WebElement conversion;

    @FindBy(xpath = "(//tr//th)[6]")
    public WebElement status;
    @FindBy(xpath = "(//tr//th)[7]")
    public WebElement action;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement pageTitlePendingWithdrawals;
    @FindBy(xpath = "//*[@class='card-title border-bottom pb-2']")
    public WebElement userCardInformation;
    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement detailsuserCardInformation;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement pwPageTittle;
    @FindBy(xpath = "//*[@class='btn btn-outline--success ms-1 approveBtn']")
    public WebElement pwApproveButton;
    @FindBy(xpath = "//*[@class='btn btn-outline--danger ms-1 rejectBtn']")
    public WebElement pwRejectButton;
    @FindBy (xpath = "//*[text()='Withdrawal approved successfully']")
    public WebElement approvedSuccesffulyMesaggeText;
    @FindBy (xpath = "//*[text()='Withdrawal rejected successfully']")
    public WebElement rejecteedSuccesffulyMesaggeText;
    @FindBy(xpath = "(//*[@id='details'])[2]")
    public WebElement rejectionTextArea;

    @FindBy(xpath = "(//*[@class='form-control pt-3'])[1]")
    public WebElement approvedTextArea;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement rejectionSubmitButton;

    @FindBy(xpath = "(//*[@*='submit'])[1]")
    public WebElement approvedSubmitButton;
    @FindBy(xpath = "(//*[@class='badge badge--danger'])[1]")
    public WebElement statusReject;












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
    @FindBy(xpath = "(//*[@class='la la-desktop'])[1]")
    public WebElement depositHistoryDatails;




    // ********** Categories **********



    // ********** Loan Plans **********



    // ********** Loans **********



    // ********** Payment Gateways **********



    // ********** Deposits **********
    @FindBy(xpath = "(//*[@class='menu-title'])[24]")
    public WebElement depositsLink;
    @FindBy(xpath = "(//*[@class='menu-title'])[26]")
    public WebElement approvedDepositsLink;
    @FindBy(xpath = "//table[@class='table table--light style--two']")
    public WebElement approvedDepositsTable;
    @FindBy(xpath = "//thead")
    public WebElement approvedDepositsLinkHeaders;
    @FindBy(xpath = "//tr")
    public WebElement approvedDepositsLinkInfos;
    @FindBy(xpath = "(//*[@*='Amount'])[1]")
    public WebElement pendingDepositAmount;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--success'])[1]")
    public WebElement viewAllDeposit;

    @FindBy(xpath = " (//*[@class='item-link'])[1]")
    public WebElement successfullyDeposit;
    @FindBy(xpath = " (//*[@class='item-link'])[2]")
    public WebElement pendingDeposit;
    @FindBy(xpath = " (//*[@class='item-link'])[3]")
    public WebElement rejectedDeposit;
    @FindBy(xpath = " (//*[@class='item-link'])[4]")
    public WebElement initiatedDeposit;

    @FindBy(xpath = "(//*[@*='page-title'])[1]")
    public WebElement depositPageTitle;

    @FindBy(xpath = "//*[@class='badge badge--success']")
    public WebElement approvedText;

    @FindBy(xpath = "//*[@id='date']")
    public WebElement dateBox;

    @FindBy(xpath = "(//*[@*='submit'])[2]")
    public WebElement yesButton;

    @FindBy(xpath = "//*[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement approvedButton;

    @FindBy(xpath = "//*[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement rejectButton;
    @FindBy(xpath = "(//*[@class='las la-check-double'])[1]")
    public WebElement depositHistoryApprove;
    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement depositHistoryApproveYes;

    @FindBy (xpath = "//*[text()='Deposit request approved Successfully']")
    public WebElement depositApprovedMessage;
    @FindBy (xpath = "//*[text()='Withdrawal rejected successfully']")
    public WebElement depositRejectedMessage;
    @FindBy (xpath = "//*[@id='message']")
    public WebElement depositRejectedTextBox;

    @FindBy (xpath = "(//*[@type='submit'])[1]")
    public WebElement depositRejectedTextBoxSubmit;

    // ********US_35********
    @FindBy(xpath = "(//*[@class='item-link'])[1]")
    public WebElement titleTotalUsers;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement allUsersPage;
    @FindBy(xpath = "(//*[@class='item-link'])[2]")
    public WebElement titleActiveUsers;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement activeUsersPage;
    @FindBy(xpath = "(//*[@class='item-link'])[3]")
    public WebElement titleEmailUnverifiedUsers;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement emailUnverifiedUsersPage;
    @FindBy(xpath = "(//*[@class='item-link'])[4]")
    public WebElement titleMobileUnverifiedUsers;
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement mobileUnverifiedUsersPage;




    // **********  Withdrawals **********



    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
