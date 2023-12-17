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
    @FindBy(xpath = "//*[text()='Manage Users']")
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






    // ********** Categories **********



    // ********** Loan Plans **********



    // ********** Loans **********



    // ********** Payment Gateways **********



    // ********** Deposits **********



    // **********  Withdrawals **********



    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
