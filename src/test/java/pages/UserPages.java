package pages;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class UserPages {
    public UserPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void userLoginMethod(String username, String password){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",WelcomeBackYaziElementi );
        ReusableMethods.wait(1);
        usernameBox.sendKeys(ConfigReader.getProperty(username));
        ReusableMethods.wait(1);
        passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(1);
        loginButon.click();
    }
    public void loginFormDogrulama(){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);",WelcomeBackYaziElementi );
        Assert.assertTrue(usernameBox.isDisplayed());
        Assert.assertTrue(passwordBox.isDisplayed());
        Assert.assertTrue(rememberMeButon.isDisplayed());
        Assert.assertTrue(forgotPassword.isDisplayed());
        Assert.assertTrue(loginButon.isDisplayed());
    }

    public void loginBoxTemizleme(){
        usernameBox.clear();
        passwordBox.clear();
    }

    public void transactionSearchBoxAktiflikTesti(){
        ReusableMethods.wait(1);
        transactionNumberSearchBox.sendKeys("123");
        searchBoxSearchIkonu.click();
        ReusableMethods.wait(1);
        transactionNumberSearchBox.clear();
        searchBoxSearchIkonu.click();
    }

    public void typeDropDownAktiflik(){
        Select select=new Select(typeDropDown);
        select.selectByVisibleText("All");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("All"));
        ReusableMethods.wait(1);
        select.selectByVisibleText("Plus");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Plus"));
        ReusableMethods.wait(1);
        select.selectByVisibleText("Minus");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Minus"));
        ReusableMethods.wait(1);
    }

    public void remarkDropDownAktiflik(){
        Select select=new Select(remarkDropDown);
        select.selectByVisibleText("Any");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Any"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Application fee");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Application fee"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Balance add");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Balance add"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Balance subtract");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Balance subtract"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Deposit");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Deposit"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Loan installment");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Loan installment"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Loan taken");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Loan taken"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Withdraw");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Withdraw"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Withdraw reject");
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Withdraw reject"));
        ReusableMethods.wait(1);

        select.selectByVisibleText("Any");
    }

    public void transactionsIcerikGoruntuleme(){
        Assert.assertTrue(transactionsTitle.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(transactionsAmount.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(transactionsCharge.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(transactionsPostBalance.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(transactionsDetails.isDisplayed());
    }

    public void istenilenUrlGitme(String url){
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    // ********** Login  **********
    @FindBy(xpath = "//*[@class='auth-form__content section']")
    public WebElement loginForm;
    @FindBy(xpath = "(//input[@class='auth-form__input'])[1]")
    public WebElement usernameBox;
    @FindBy(xpath = "(//input[@class='auth-form__input'])[2]")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@id='remember']")
    public WebElement rememberMeButon;
    @FindBy(xpath = "//*[@class='forgot-pass text-decoration-none']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//*[@class='text-decoration-none']")
    public WebElement registerNow;
    @FindBy(xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']")
    public WebElement loginButon;

    @FindBy(xpath = "//*[@class='row g-4 verify-gcaptcha']")
    public WebElement registerNowForm;
    @FindBy(xpath = "//*[@class='text-capitalize text-center mt-0 mb-4']")
    public WebElement WelcomeBackYaziElementi;

    @FindBy(xpath = "//*[@id='VGhlc2UlMjBjcmVkZW50aWFscyUyMGRvJTIwbm90JTIwbWF0Y2glMjBvdXIlMjByZWNvcmRzLnJlZA']")
    public WebElement yanlisGirisUyariElementi;

    @FindBy(xpath = "//*[text()='These credentials do not match our records']")
    public WebElement notMatchOurRecords;

    @FindBy(xpath = "//*[text()='Verify Email']")
    public WebElement verifyEmail;

    @FindBy(xpath = "//*[@class='auth-form__input']")
    public WebElement forgotPasswordUsernameBox;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text mt-3']")
    public WebElement forgotPasswordSubmitBox;

    @FindBy(xpath = "//*[text()='Password reset email sent successfully']")
    public WebElement passwordResetSucces;

    @FindBy(xpath = "//*[text()='Try to send again']")
    public WebElement forgotPasswordTryToSendAgain;


    // ********** Dashboard **********
    @FindBy(xpath = "//*[@class='btn btn--success btn--smd']")
    public WebElement yesilDepositButon;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement dashboardCookieKabul;


    // ********** Take Loan **********



    // ********** My Loans **********



    // ********** Deposit **********



    // ********** Withdraw **********



    // ********** Transactions **********

    @FindBy(xpath = "//*[text()='Transactions']")
    public WebElement userDahboardTransactionsButon;

    @FindBy(xpath = "//h3[text()='My Transactions History']")
    public WebElement myTransactionsHistoryYazisi;

    @FindBy(xpath = "//*[@id='search']")
    public WebElement transactionNumberSearchBox;
    @FindBy(xpath = "//*[@class='icon-area']")
    public WebElement searchBoxSearchIkonu;

    @FindBy(xpath = "//*[@id='trx_type']")
    public WebElement typeDropDown;

    @FindBy(xpath = "//*[@id='remark']")
    public WebElement remarkDropDown;

    @FindBy(xpath = "(//*[@class='accordion-button collapsed'])[1]")
    public WebElement yapilanTransactions;

    @FindBy(xpath = "(//*[@class='trans-title'])[1]")
    public WebElement transactionsTitle;

    @FindBy(xpath = "(//*[@class='col-lg-4 col-sm-3 col-4 order-sm-3 order-2 text-end amount-wrapper'])[1]")
    public WebElement transactionsAmount;

    @FindBy(xpath = "(//*[@class='value'])[1]")
    public WebElement transactionsCharge;

    @FindBy(xpath = "(//*[@class='value'])[2]")
    public WebElement transactionsPostBalance;

    @FindBy(xpath = "(//*[@class='value'])[3]")
    public WebElement transactionsDetails;

    // ********** Support Ticket **********



    // ********** 2FA Setting **********



    // ********** Profile **********



    // ********** Change Password **********



    // ********** Logout **********







}
