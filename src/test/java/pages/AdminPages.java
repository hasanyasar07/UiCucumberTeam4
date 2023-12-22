package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AdminPages {
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


    // ********** Dashboard **********



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



    // ********** Payment Gateways **********



    // ********** Deposits **********



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

    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
