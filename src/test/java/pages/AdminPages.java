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
        adminLoginButon.click();
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
    public WebElement manageUsersButton;

    @FindBy(xpath = "//span[@class='menu-title' and text()='Active Users']")
    public WebElement activeUsersButton;



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
