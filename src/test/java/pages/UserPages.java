package pages;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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


    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButtonGorme;
  
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




    // ********** Take Loan **********



    // ********** My Loans **********

    @FindBy(xpath = "//*[text()='Plans']")
    public WebElement plansButton;

    @FindBy(xpath = "//*[@id='pills-standart-loan-tab']")
    public WebElement standartYaziElementi;

    @FindBy(xpath = "//*[@id='pills-car-loan-tab']")
    public WebElement carLoanButton;

    @FindBy(xpath = "//*[@id='pills-basic-loan-tab']")
    public WebElement basicLoanButton;

    @FindBy(xpath = "//h4[text()='Basic Loan 1']")
    public WebElement basicLoan1Button;

    @FindBy(xpath = "//h4[text()='Car Loan 9']")
    public WebElement carLoan9Button;
    @FindBy(xpath = "//h4[text()='Test Loan']")
    public WebElement testLoanButton;

    @FindBy(xpath = "(//*[@class='btn btn-md btn--xl xl-text w-100 btn--base loanBtn'])[5]")
    public WebElement applyNowButton;

    @FindBy(xpath = "//div[@class='cookies-card__btn mt-4']")
    public WebElement cookieButonu;

    @FindBy(xpath = "//*[@id='exampleModalLabel']")
    public WebElement applyForBasicLoan1Sayfasi;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement amountBox;

    @FindBy(xpath = "//*[@class='btn btn--base w-100']")
    public WebElement amountBoxConfirmButton;

    @FindBy(xpath = "//h5[text()='Application Form']")
    public WebElement applicationFormYazisi;

    @FindBy(xpath = "//*[@class='btn btn--base w-100']")
    public WebElement applyButton;

    @FindBy(xpath = "//div[@class='d-flex justify-content-between']")
    public WebElement myLoansSayfasi;

    @FindBy(xpath = "//*[@class='logo']")
    public WebElement LoanTechLogo;

    @FindBy(xpath = "//*[text()='Loan Plans']")
    public WebElement loanPlansYaziElementi;

    @FindBy(xpath = "//*[text()='Deposit Pending']")
    public WebElement depositPendingYaziElementi;
    @FindBy(xpath = "//*[text()='Successful Deposits']")
    public WebElement successfulDepositYaziElementi;

    @FindBy(xpath = "//*[text()='Successful Withdrawals']")
    public WebElement successfulWithdrawalsYaziElementi;

    @FindBy(xpath = "//*[text()='Total Loan']")
    public WebElement totalLoanYaziElementi;

    @FindBy(xpath = "(//*[text()='Submitted'])[1]")
    public WebElement myLoanSubmittedYaziElementi;

    @FindBy(xpath = "(//*[text()='Pending'])[1]")
    public WebElement myLoanPendingYaziElementi;

    @FindBy(xpath = "//tr/th")
    public List<WebElement> loanNumber;

    @FindBy(xpath = "(//*[text()='Rejected'])[1]")
    public WebElement myLoanRejectedYaziElementi;




    // ********** Deposit **********
    @FindBy(xpath = "//a[@class='btn btn--success btn--smd']")
    public WebElement depositButton;

    @FindBy(xpath = "//select[@class='form--control form-select']")
    public WebElement selectGateway;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement AmountBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement depositSubmitButton;

    @FindBy(xpath = "(//p[@class='text-muted font-size--14px'])[1]")
    public WebElement depositTransactionNo;



    // ********** Withdraw **********



    // ********** Transactions **********



    // ********** Support Ticket **********



    // ********** 2FA Setting **********



    // ********** Profile **********



    // ********** Change Password **********



    // ********** Logout **********
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='iziToast-body']")
    public WebElement alertYazisi;

}
