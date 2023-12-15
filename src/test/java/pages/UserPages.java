package pages;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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

    // ********** Dashboard **********
    @FindBy(xpath = "//*[@class='btn btn--success btn--smd']")
    public WebElement yesilDepositButon;


    // ********** Take Loan **********



    // ********** My Loans **********



    // ********** Deposit **********



    // ********** Withdraw **********



    // ********** Transactions **********



    // ********** Support Ticket **********



    // ********** 2FA Setting **********



    // ********** Profile **********



    // ********** Change Password **********



    // ********** Logout **********







}
