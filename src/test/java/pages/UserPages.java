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

    @FindBy(xpath = "//a[text()='Allow']")
    public WebElement allowCokies;


    // ********** Dashboard **********
    @FindBy(xpath = "//*[@class='btn btn--success btn--smd']")
    public WebElement yesilDepositButon;

    @FindBy(xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement dashboardCookieKabul;




    // ********** Take Loan **********
    @FindBy(xpath = "//a[text()='Take Loan            ']")
    public WebElement takeLoanSidebarLink;

    @FindBy(xpath = "//h3[text()='Loan Plans']")
    public WebElement loanPlansTitle;

    @FindBy(xpath = "//button[@id='pills-car-loan-2-tab']")
    public WebElement carLoan2Button;

    @FindBy(xpath = "//*[text()='Personal Finance Loan']")
    public WebElement personelFinanceLoanTitle;

    @FindBy(xpath ="//*[text()='$2,000.00']" )
    public  WebElement takeMinumumAmount;

    @FindBy(xpath ="//*[text()='$5,000.00']" )
    public  WebElement  takeMaximumAmount;

    @FindBy(xpath ="//*[text()='4%']" )
    public  WebElement perInstallmentAmount;

    @FindBy(xpath ="(//span[@class='plan-feature-list-amount'])[2]" )
    public  WebElement installmentIntervalAmount;

    @FindBy(xpath ="(//span[@class='plan-feature-list-amount'])[3]" )
    public  WebElement totalInstallmentAmount;

    @FindBy(xpath ="//button[@data-id='52']" )
    public  WebElement applyButtonCarLoan2;

    @FindBy(xpath = "//h5//span[text()='Personal Finance Loan']")
    public WebElement applyForPersonelLoanTitle;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement enterAnAmounTextBox;

    @FindBy(xpath = "//*[text()='Confirm']")
    public WebElement confirmApplyForPersonalFinanceLoan;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement applicationFormApplyButton;

    @FindBy(xpath = "//div[@class='iziToast-body']")
    public WebElement applyForPersonelFinanceLoanAlertText;

    @FindBy(xpath = "//button[@id='pills-basic-loan-tab']")
    public WebElement basicLoanLinkElement;

    @FindBy(xpath = "//h4[text()='Basic Loan 1']")
    public WebElement basicLoan1LinkElement;

    @FindBy(xpath = "//button[@data-planname='Basic Loan 1']")
    public WebElement basicLoan1ApplyNowButton;

    @FindBy(xpath = "(//span[@class='value'])[1]")
    public WebElement planNameText;

    @FindBy(xpath = "(//span[@class='value'])[2]")
    public WebElement loanAmountText;

    @FindBy(xpath = "(//span[@class='value'])[3]")
    public WebElement totalInstallmentText;

    @FindBy(xpath = "(//span[@class='value'])[4]")
    public WebElement perInstallmenText;

    @FindBy(xpath = "(//span[@class='value'])[5]")
    public WebElement youWillNeedToPayText;

    @FindBy(xpath = "//h4[text()='Car Loan 9']")
    public WebElement carLoan9Title;

    @FindBy(xpath = "//button[@data-planname='Car Loan 9']")
    public WebElement carLoan9ApplyNowButton;

    @FindBy(xpath = "//h4[text()='Test Loan']")
    public WebElement testLoanTitle;

    @FindBy(xpath = "//button[@data-planname='Test Loan']")
    public WebElement testLoanApplyNowButton;



    // ********** My Loans **********
    @FindBy(xpath = "(//h6[@title='Loan Plan'])[1]")
    public WebElement myloansList1;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchByLoanNumberTextBox;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement loanStatusDropDownmenu;

    @FindBy(xpath = "(//*[text()='Running'])[1]")
    public WebElement runningListLabel;

    @FindBy(xpath = "(//a[@class='btn btn--outline-primary btn--sm '])[1]")
    public WebElement installmentButton;

    @FindBy(xpath = "//h3[text()='Loan Installments']")
    public WebElement loanInstallmentsTitle;

    @FindBy(xpath = "(//*[@class='top-0 fw-light me-1'])[1]")
    public WebElement loanNumbervalue;

    @FindBy(xpath = "(//*[@class='top-0 fw-light me-1'])[2]")
    public WebElement planValue;

    @FindBy(xpath = "(//*[@class='top-0 fw-light me-1'])[3]")
    public WebElement loanAmountValue;

    @FindBy(xpath = "(//*[@class='top-0 fw-light me-1'])[4]")
    public WebElement perInstantValue;

    @FindBy(xpath = "(//*[@class='top-0 fw-light me-1'])[5]")
    public WebElement needsToPayValue;

    @FindBy(xpath = "(//*[@class='top-0 fw-light me-1'])[7]")
    public WebElement delayChargeValue;

    @FindBy(xpath = "(//th)[1]")
    public WebElement snListHeader;

    @FindBy(xpath = "(//th)[2]")
    public WebElement installmentDateListHeader;

    @FindBy(xpath = "(//th)[3]")
    public WebElement givenOnListHeader;

    @FindBy(xpath = "(//th)[4]")
    public WebElement delayListHeader;

    @FindBy(xpath = "(//td)[1]")
    public WebElement snListValue;

    @FindBy(xpath = "(//td)[2]")
    public WebElement installmentDateListValue;

    @FindBy(xpath = "(//td)[3]")
    public WebElement givenOnListValue;

    @FindBy(xpath = "(//td)[4]")
    public WebElement delayListValue;

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
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[@class='iziToast-body']")
    public WebElement alertYazisi;

}
