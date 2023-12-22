package pages;

import com.fasterxml.jackson.core.JsonParser;
import io.cucumber.java.en.Then;
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

    public WebElement AdminManageUsersLink;
    @FindBy(xpath = "//*[@href='https://qa.loantechexper.com/admin/users/with-balance']")
    public WebElement WithBalance;
    @FindBy(xpath = "//*[@class='bodywrapper__inner']")
    public WebElement WithBalanList; // WithBalance listesi
    @FindBy(xpath = "//*[@class='form-control bg--white']")
    public WebElement UserWithBalanceSearchbox;
    @FindBy(xpath = "//*[@class='la la-search']")
    public WebElement UserWithBalanceAramaButton;
    @FindBy(xpath = "(//*[@href='https://qa.loantechexper.com/admin/users/detail/169'])[2]")
    public WebElement UserWithBalanceDetails;
    @FindBy(xpath = "(//*[@class='row gy-4'])[1]")
    public WebElement WithBalanceDetail1;
    @FindBy(xpath = "(//*[@class='row gy-4'])[2]")
    public WebElement WithBalanceDetail2;

    // Us_47 TC_01
    @FindBy(xpath = "(//*[@class='menu-title'])[3]")
    public WebElement ActiveUsers;   // aktif kullanıcılar
    @FindBy(xpath = "//*[@class='form-control bg--white']")
    public WebElement ActiveUsersTextbox; // Aktif kullanıcıları filtreleme butonu
    @FindBy(xpath = "//*[@class='la la-search']")
    public WebElement ActiveUsersTextboxAra; // büyüteç
    @FindBy(xpath = "(//*[@href='https://qa.loantechexper.com/admin/users/detail/82'])[2]")
    public WebElement ActiveUsersTextboxDetails;
    @FindBy(xpath = "//*[@class='bodywrapper__inner']")
    public WebElement ActiveUsersDetailsBilgi; // Aktif kullanıcı detayları
    // 47 TC_02
    @FindBy(xpath = "//*[@class='btn btn--warning btn--gradi btn--shadow w-100 btn-lg userStatus']")
    public WebElement BanUserButton; // aktif kulllanıcıyı engellemek için
    // 47 TC_03
    @FindBy(xpath = "//*[@name='reason']")
    public WebElement BanUserButtonReason;  // engelleme nedeni
    @FindBy(xpath = "(//*[@class='btn btn--primary h-45 w-100'])[2]")
    public WebElement BanUserButtonSubmit; // Engellemek için tamam tuşu
    // 47 TC_04
    @FindBy(xpath = "(//*[@class='menu-title'])[4]")
    public WebElement BannedUsers; // Engellenen kullanıcılar
    @FindBy(xpath = "//*[@class='form-control bg--white']")
    public WebElement BannedUsersTextbox;
    @FindBy(xpath = "//*[@class='la la-search']")
    public WebElement BannedUsersBuyutec;
    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--primary']")
    public WebElement BannedUsersDetails;
    @FindBy(xpath = "//*[@class='btn btn--success btn--gradi btn--shadow w-100 btn-lg userStatus']")
    public WebElement BannedUserUnbanUser; // Engellenmiş

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

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement userFirstNameBox;

    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement userLastNameBox;

    @FindBy(xpath = "(//*[@class='form-control'])[3]")
    public WebElement userEmailBox;

    @FindBy(xpath = "//*[@class='form-control checkUser']")
    public WebElement userPhoneNumberBox;

    @FindBy(xpath = "//*[@class='btn btn--primary w-100 h-45 mt-3']")
    public WebElement usersSubmitButon;

    @FindBy(xpath = "//*[text()='User details updated successfully']")
    public WebElement usersConfirmElementi;
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


    @FindBy(xpath = "(//span[@class='menu-title'])[3]")
    public WebElement activeUsersLink;

    @FindBy(xpath = "//h6[@class='page-title'])")
    public WebElement UserDetailUserNameText;

    @FindBy(xpath = "(//*[@class='las la-desktop'])[1]")
    public WebElement ActiveUserDetailButton;

    @FindBy(xpath = "(//a[@class='widget-two__btn btn btn-outline--primary'])[1]")
    public WebElement BalanceviewAllButton;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement TransactionLogsText;

    @FindBy(xpath ="//table[@class='table table--light style--two']")
    public WebElement TransactionLogsTable;

    @FindBy(xpath = "//button[@class='btn btn--primary w-100 h-45']")
    public WebElement ViewAllFilterButton;

    @FindBy(xpath = "//button[@class='btn btn--success btn--shadow w-100 btn-lg bal-btn']")
    public WebElement AddBalanceButton;


    @FindBy(xpath = "(//*[@class='required'])[4]")
    public WebElement AmountButton;

    @FindBy(xpath = "//*[@class='required'][5]")
    public WebElement RemarkButton;

    @FindBy(xpath ="//button['submit'][8]")
    public WebElement AmountSubmitButton;

    @FindBy(xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement AddSuccesfullyButton;



    @FindBy(xpath = "//*[text()='Please fill out this field.']")
    public WebElement warningText;



    // ********** Categories **********
    // US_39
    @FindBy(xpath = "//*[@href=\"https://qa.loantechexper.com/admin/category/index\"]")
    public WebElement CategoriesMenu;
    @FindBy(xpath = "(//*[@class=\"btn btn-sm btn-outline--primary cuModalBtn\"])[1]")
    public WebElement CategoriesAddNew;  // yeni categori eklemek için
    @FindBy(xpath = "//*[@name='name']")
    public WebElement CategoriesName;
    @FindBy(xpath = "//*[@name='description']")
    public WebElement CategoriesDescription;
    @FindBy(xpath = "//*[@class='btn btn--primary h-45 w-100']")
    public WebElement CategoriesSubmit;   // yeni categori eklemek için submit
    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement CategoriesMessage; // yeni category eklendi mesajı
    //TC_03 39
    @FindBy(xpath = "(//*[@type='search'])[2]")
    public WebElement CategoriesSearchBox;  // categories menüsü searchbox butonu
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[1]")
    public WebElement CategoriesSearchBoxAratma; // categories menüsü searchbox arama
    @FindBy(xpath = "//*[@data-label='Name']")
    public WebElement CategoriesDogrulama;
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--danger ms-1 confirmationBtn'])[2]")
    public WebElement CategoriesDisable;

    @FindBy(xpath = "(//*[@class='btn btn--primary'])[2]")
    public WebElement CategoriesDisableYes;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement StatusChangedSuccessfully;

    //TC_05
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary cuModalBtn'])[3]")
    public WebElement CategorisEditButton;
    @FindBy(xpath = "//*[@name='name']")
    public WebElement CategoriesEditName;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement CategoriesEditSubmit;
    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement CategoryUpdatedSuccessfully;

    // ********** Loan Plans **********
    @FindBy(xpath = "//*[@href=\"https://qa.loantechexper.com/admin/plans/loans/index\"]")
    public WebElement LoanPlansButton; // Admin Loan Plans butonu
    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement LoanPlansAllPlans;  // Admin loan plans listesi
    @FindBy(xpath = "//*[@class='bodywrapper__inner']")
    public WebElement loanplansbasicinformation;   // Loan plans temel başlık bilgileri
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement LoanPlansAddNewButton; // yeni plan ekleme
    @FindBy(xpath = "//*[@name='name']")
    public WebElement LoanPlansName;
    @FindBy(xpath = "//*[@name='title']")
    public WebElement LoanPlansTitle;
    @FindBy(xpath ="//*[@name='minimum_amount']")
    public WebElement LoanPlansMinimumAmount;
    @FindBy(xpath = "//*[@name='maximum_amount']")
    public WebElement LoanPlansMaximumAmount;
    @FindBy(xpath = "//*[@name='category_id']")
    public WebElement LoanPlansCategory;  // select ile seçilmesi gerekiyor dikkat
    @FindBy(xpath = "//*[@name='per_installment']")
    public WebElement LoanPlansPerInstallment;
    @FindBy(xpath = "//*[@name='installment_interval']")
    public WebElement LoanPlansInstallmentInterval;
    @FindBy(xpath = "//*[@name='total_installment']")
    public WebElement LoanPlansTotalInstallments;
    @FindBy(xpath = "//*[@name='application_fixed_charge']")
    public WebElement LoanPlansApplicationFixedCharge;
    @FindBy(xpath = "//*[@name='application_percent_charge']")
    public WebElement LoanPlansApplicationPercentCharge;
    @FindBy(xpath = "//*[@name='delay_value']")
    public WebElement LoanPlansChargeWillApplyIfDelay;
    @FindBy(xpath = "//*[@name='fixed_charge']")
    public WebElement LoanPlansFixedCharge;
    @FindBy(xpath = "//*[@name='percent_charge']")
    public WebElement LoanPlansPercentCharge;
    @FindBy(xpath = "//*[@class='btn btn--primary w-100 h-45 mt-3']")
    public WebElement LoanPlansAddNewSubmit; // Yeni plan ekle submit button
    @FindBy(xpath = "//*[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement LoanPlanYeniPlanEklendi;   // Güncelleme içinde kullanılabilir
    @FindBy(xpath = "//*[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement PlanUpdatedSuccessfully;
    // TC03
    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary'])[2]")
    public WebElement LoanPlansEdit;
    @FindBy(xpath = "(//*[@class='btn btn-sm confirmationBtn btn-outline--danger'])[1]")
    public WebElement LoanPlansDisable;
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[2]")
    public WebElement LoanPlansDisableYes;
    @FindBy(xpath = "//*[@class='iziToast iziToast-theme-light iziToast-color-green iziToast-animateInside iziToast-opened']")
    public WebElement LoanPlansDisableSuccessfully;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement TheFixedChargeMustBeGreater;  // eksi değer
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
    @FindBy(xpath = "(//span[@class='menu-title'])[25]")
    public WebElement PendingDepositsLink;

    @FindBy(xpath = "//button[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement PendingDepositApproveButton;

    @FindBy(xpath = "//button[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement PendingDepositRejectionButton;

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement PendingDepositYesButton;

    @FindBy(xpath = "//*[text()='Deposit request approved successfully']")
    public WebElement PendingAlertText;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement PendingAlertRejectBox;

    @FindBy(xpath = "//button[@type='submit'][1]")
    public WebElement PendingAlertSubmitButton;

    @FindBy(xpath = "(//tr[1])[2]")
    public WebElement PendingDepositsFirstRow;

    @FindBy(xpath = "(//span[@class='menu-title'])[30]")
    public WebElement AllDepositsLink;

    @FindBy(xpath = "//input[@class='form-control bg--white']")
    public WebElement SearchBox;

    @FindBy(xpath = "(//input[@type='search'])[3]")
    public WebElement StartEndDateBox;

    @FindBy(xpath = "//a[@class='item-link'][1]")
    public WebElement SuccessfullDepositBox;

    @FindBy(xpath = "//a[@class='item-link'][2]")
    public WebElement PendingDepositBox;

    @FindBy(xpath = "//a[@class='item-link'][3]")
    public WebElement RejectedDepositBox;

    @FindBy(xpath = "//a[@class='item-link'][4]")
    public WebElement InitiatedDepositBox;



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

    // **********  Withdrawals **********
     // Us-46
    @FindBy(xpath = "(//*[@class='menu-title'])[31]")
    public WebElement WithdrawalsMenu;

    @FindBy(xpath = "//*[@href='https://qa.loantechexper.com/admin/withdraw/method']")
    public WebElement WithdrawalMethods;

    @FindBy(xpath = "//*[@class='bodywrapper__inner']")
    public WebElement WithdrawalsMethodsDetails; // WithdrawalsMethods bilgileri

    // TC_02

    @FindBy(xpath = "//*[@class='btn btn-outline--primary']")
    public WebElement WithdrawalsMethodsAddNew;  // yeni metod ekleme

    @FindBy(xpath = "//*[@name='name']")
    public WebElement WithdrawalsName;

    @FindBy(xpath = "//*[@name='currency']")
    public WebElement WithdrawalsCurrency;

    @FindBy(xpath = "//*[@name='rate']")
    public WebElement WithdrawalsRate;

    @FindBy(xpath = "//*[@name='min_limit']")
    public WebElement WithdrawalsMinAmount;

    @FindBy(xpath = "//*[@name='max_limit']")
    public WebElement WithdrawalsMaxAmount;

    @FindBy(xpath = "//*[@name='fixed_charge']")
    public WebElement WithdrawalsFixedCharge;

     @FindBy(xpath = "//*[@name='percent_charge']")
    public WebElement WithdrawalsPercentCharge;

     @FindBy(xpath = "//*[@class='btn btn--primary w-100 h-45']")
    public WebElement WithdrawalsSubmitButton;

     @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement WithdrawalsMethodMessage; // Yeni method eklendi yazısı

    // TC_03
   @FindBy(xpath = "//*[@name='search_table']")
    public WebElement WithdrawalsMethodsSearchbox;

    @FindBy(xpath = "(//span[@class='menu-title'])[31]")
    public WebElement Withdrawalslink;

    @FindBy(xpath = "(//span[@class='menu-title'])[32]")
    public WebElement WithdrawalMethodsLink;

    @FindBy(xpath = "(//span[@class='menu-title'])[33]")
    public WebElement PendingWithdrawalsLink;

    @FindBy(xpath = "(//span[@class='menu-title'])[34]")
    public WebElement ApprovedWithdrawalsLink;

    @FindBy(xpath = "(//span[@class='menu-title'])[35]")
    public WebElement RejectedWithdrawalLink;

    @FindBy(xpath = "(//span[@class='menu-title'])[36]")
    public WebElement AllWithdrawalLink;


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

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[8]/a/span[1]")
    public WebElement withdrawalsButton;


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


    @FindBy(xpath =  "//input[@step='any']")
    public WebElement newWithdrawalMethodMinimumAmount;


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


   @FindBy(xpath = "//*[@class='btn btn--primary input-group-text']")
    public WebElement WithdrawalsMethodsSearchboxAra;  // Büyüteç

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement WithdrawalsMethosEditButton; // ysm4

    @FindBy(xpath = "//*[@class='bodywrapper__inner']")
    public WebElement WithdrawalsMethodsSearhDetails; // aratılan method bilgileri

    // TC_04
    @FindBy(xpath = "//*[@name='name']")
    public WebElement WithdrawalsMethodsEditNamee; // ysm4

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement WithdrawalsMethodsEditName;

    @FindBy(xpath ="//*[@class='btn btn--primary w-100 h-45']")
    public WebElement WithdrawalsMethodsEditSubmit;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement WithdrawalsMethodsEditMessage;

    // TC_05
    @FindBy(xpath = "//*[@class='form-control bg--white']")
    public WebElement WithdrawalsMethodsSearchboxx;
    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--danger ms-1 confirmationBtn']")
    public WebElement WithdrawalsMethodDisablee; // ysm2 olan
    @FindBy(xpath = "//*[@class='btn btn--primary']")
    public WebElement WithdrawalsMethodsDisableYes;
    @FindBy(xpath= "//*[@class='iziToast-message slideIn']")
    public WebElement WithdrawalsMethodsDisableMessage;

    @FindBy(xpath = "//*[@class='inbox-dataList']")
    public WebElement tempMailMailBox;

    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
