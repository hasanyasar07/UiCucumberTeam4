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



    // ********** Categories **********



    // ********** Loan Plans **********



    // ********** Loans **********



    // ********** Payment Gateways **********



    // ********** Deposits **********



    // **********  Withdrawals **********
    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[8]/a/span[1]")
    public WebElement withdrawalsButton;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[8]/div/ul/li[1]/a/span")
    public WebElement withdrawalsMethodsButton;

    @FindBy(xpath = "//div[@class='bodywrapper__inner']")
    public WebElement withdrawalsMethodsPage;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement withdrawalsActionEdit;

    @FindBy(xpath = "//input[@name='currency']")
    public WebElement withdrawCurrency;

    @FindBy(xpath = "//input[@name='rate']")
    public WebElement withdrawRate;


    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement withdrawMethodUpdatedSuccesfully;


    @FindBy(xpath = "//button[@class='btn btn-sm btn-outline--success ms-1 confirmationBtn']")
    public WebElement withdrawEnable;


    @FindBy(xpath =  "//a[@class='btn btn-outline--primary']")
    public WebElement withdrawAddNew;


    @FindBy(xpath =  "//input[@type='text']")
    public WebElement newWithdrawalMethodName;

    @FindBy(xpath =  "//input[@class='form-control border-radius-5']")
    public WebElement newWithdrawalMethodCurrency;


    @FindBy(xpath =  "//input[@type='number']")
    public WebElement newWithdrawalMethodRate;

    @FindBy(xpath =  "//input[@step='any']")
    public WebElement newWithdrawalMethodMinimumAmount;

    @FindBy(xpath =  "//input[@type='number']")
    public WebElement newWithdrawalAmount;

    @FindBy(xpath =   "//input[@type='number']")
    public WebElement fixedCharge;

    @FindBy(xpath =  "//input[@type='number']")
    public WebElement percentCharge;

    @FindBy(xpath =   "//button[@type='submit']")
    public WebElement newWithdrawalMethodSubmit;


    @FindBy(xpath =    "//p[@class='iziToast-message slideIn']")
    public WebElement succesfullyText;


    @FindBy(xpath =   "//div[@class='bodywrapper__inner']")
    public WebElement updateWithdrawalMethodPage;

    @FindBy(xpath = "/html/body/div/div[1]/div/div[2]/div[1]/ul/li[8]/div/ul/li[5]/a/span")
    public WebElement allWithdrawals;

    @FindBy(xpath = "//div[@class='bodywrapper__inne']")
    public WebElement WithdrawalsLogPage2;

    @FindBy(xpath = "//div[@class='col-lg-12']")
    public WebElement gatewayTransaction;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement details;

    @FindBy(xpath = "//div[@class='bodywrapper__inner']")
    public WebElement detailsPage;

    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/admin/withdraw/approved']")
    public WebElement approvedWithdrawals2;

    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/admin/withdraw/pending']'")
    public WebElement pendingWithdrawals2;


    @FindBy(xpath = "//a[@href='https://qa.loantechexper.com/admin/withdraw/rejected']")
    public WebElement rejectedWithdrawals2;

    @FindBy(xpath =  "//div[@class='bodywrapper__inner']")
    public WebElement approvedWithdrawalsPage;

    @FindBy(xpath = "//div[@class='bodywrapper__inner']")
    public WebElement pendingWithdrawalsPage;

    @FindBy(xpath = "//div[@class='bodywrapper__inner']")
    public WebElement rejectedWithdrawalsPage;


    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
