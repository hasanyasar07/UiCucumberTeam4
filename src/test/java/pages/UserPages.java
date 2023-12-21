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

    @FindBy(xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement alow;


    // ********** Dashboard **********
    @FindBy(xpath = "//*[@class='btn btn--success btn--smd']")
    public WebElement yesilDepositButon;

    @FindBy(xpath = "//a[@class='active']")
    public WebElement dashboardButton;

    @FindBy(xpath = "//button[@class='btn btn--base btn--xxl w-100 text-capitalize xl-text']")
    public WebElement loginButton2;




    // ********** Take Loan **********



    // ********** My Loans **********



    // ********** Deposit **********



    // ********** Withdraw **********
    @FindBy (xpath = "/html/body/div[3]/div/div[1]/ul/li[5]/a")
    public WebElement withdrawButton;

    @FindBy (xpath = "//div[@class='row justify-content-center']")
    public WebElement  withdrawMoneyPages;

    @FindBy (xpath = "//select[@class='form-select form--control']")
    public WebElement withdrawMethodBox;

    @FindBy (xpath = "//input[@type='number']")
    public WebElement withdrawAmountBox;

    @FindBy (xpath = "//button[@class='btn btn--base w-100 mt-3']")
    public WebElement withdrawSubmit;

    @FindBy (xpath = "//a[@class='btn btn--base btn--smd']")
    public WebElement withdrawLogButton;

    @FindBy (xpath = "//div[@class='dashboard-inner']")
    public WebElement withdrawHistoryPage;

    @FindBy (xpath = "//button[@class='accordion-button collapsed']")
    public WebElement withdrawParaCekme;

    @FindBy (xpath = "//div[@class='accordion-body']")
    public WebElement  withdrawParaCekmeIslem;

    @FindBy (xpath = "//a[@class='btn btn--base btn--smd']")
    public WebElement  withdrawMoney;
    @FindBy(xpath = "//div[@class='row justify-content-center']")
    public WebElement withdrawMoneyPage;

    @FindBy (xpath = "//input[@type='text']")
    public WebElement withdrawVia;

    @FindBy (xpath = "//div[@class='form-group']")
    public WebElement withdrawSubmitButton2;

    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement withdrawSuccesfully;

    // ********** Transactions **********



    // ********** Support Ticket **********



    // ********** 2FA Setting **********



    // ********** Profile **********
    @FindBy (xpath = "//a[@href='https://qa.loantechexper.com/user/profile-setting']")
    public WebElement profileButton;

    @FindBy (xpath = "//div[@class='row gy-4 justify-content-center']")
    public WebElement profileInformation;

    @FindBy (xpath = "//ul[@class='list-group list-group-flush mt-3']")
    public WebElement profileCard;

    @FindBy (xpath = "//input[@id='imageUpload']")
    public WebElement profileSettingImage;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement profileSubmitButton;

    @FindBy (xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement profileUpdatedSuccsessfulyText;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement profileSettingStateBox;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement profileSettingFirstNameBox;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement profileSettingLastNameBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement profileSettingCityBox;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement profileSettingAdressBox;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement profileSettingZipCodeBox;

    @FindBy(xpath = "//button[@class='btn btn--base mt-3 w-100']")
    public WebElement profileSettingSubmit;

    @FindBy(xpath = "//div[@class='iziToast-texts']")
    public WebElement profileUpdatedSuccsessfulyText02;

    @FindBy(xpath = "//input[@accept='.png, .jpg, .jpeg']")
    public WebElement imageChooseFileButton;

    @FindBy(xpath = "//div[@class='card-body p-3']")
    public WebElement profileSettingCard;


    // ********** Change Password **********



    // ********** Logout **********







}
