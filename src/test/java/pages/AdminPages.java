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



    // **********  Withdrawals **********



    // ********** Support Ticket **********



    // ********** Report **********



    // ********** Subscribers **********



    // ********** Cron Job Setting **********




}
