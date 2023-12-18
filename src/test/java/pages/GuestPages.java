package pages;

import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class GuestPages {
    public GuestPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void mesajFormElementleriGorutuleme(){
        Assert.assertTrue(ContactUsNameBox.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(ContactUsEmailBox.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(ContactUsSubjectBox.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(ContactUsWriteMessageBox.isDisplayed());
    }

    public void mesajFormDoldurma(){
        ContactUsNameBox.sendKeys("TestName");
        ReusableMethods.wait(1);
        ContactUsEmailBox.sendKeys("testemail1@gmail.com");
        ReusableMethods.wait(1);
        ContactUsSubjectBox.sendKeys("testSubject");
        ReusableMethods.wait(1);
        ContactUsWriteMessageBox.sendKeys("This is a test text");
        ReusableMethods.wait(1);
        ContactUsSendMessageButon.click();
    }

    public void contactUsIletisimBilgileriDogrulama(){
        Assert.assertTrue(ContactUsOfficeAdress.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(ContactUsEmailAdress.isDisplayed());
        ReusableMethods.wait(1);
        Assert.assertTrue(ContactUsMobileNumber.isDisplayed());
    }

    public void footerKisminaInme(){
        ReusableMethods.wait(1);
        Actions actions=new Actions(Driver.getDriver());

        for (int i = 0; i <9; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
        }
    }

    public void socialMedyaIkonlariDogrulama(WebElement gidilecekSayfa,WebElement dogrularama){
        ReusableMethods.wait(1);
        String Loantech= Driver.getDriver().getWindowHandle();
        gidilecekSayfa.click();
        Driver.getDriver().switchTo().window(ReusableMethods.getNewWindowHandle());
        ReusableMethods.wait(2);
        Assert.assertTrue(dogrularama.isDisplayed());
        Driver.getDriver().switchTo().window(Loantech);
    }

    @FindBy(xpath = "//a[text()='Allow']")
    public WebElement cookieKabul;

    // ********** Header **********
    @FindBy(xpath = "(//*[@class='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement guestPageLoginButton;



    // ********** Footer **********
    @FindBy(xpath = "(//*[@class='t-link t-link--primary t-text-white text-capitalize'])[2]")
    public WebElement footerAboutButon;

    @FindBy(xpath = "//*[@class='mb-0 t-text-white text-center text-capitalize']")
    public WebElement telifHaklari;

    @FindBy(xpath = "(//*[@class='t-link t-link--primary t-text-white text-capitalize'])[3]")
    public WebElement footerContactUs;

    @FindBy(xpath = "(//*[@class='t-link social-icon--alt'])[1]")
    public WebElement facebookIkon;
    @FindBy(xpath = "//*[@id='email']")
    public WebElement facebookDogrulama;

    @FindBy(xpath = "(//*[@class='t-link social-icon--alt'])[2]")
    public WebElement xIkon;

    @FindBy(xpath = "(//*[@class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3'])[2]")
    public WebElement xDogrulama;

    @FindBy(xpath = "(//*[@class='t-link social-icon--alt'])[3]")
    public WebElement instagramIkon;

    @FindBy(xpath = "//*[@class='_ab1y']")
    public WebElement instagramDogrulama;

    @FindBy(xpath = "(//*[@class='t-link social-icon--alt'])[4]")
    public WebElement youtubeIkon;

    @FindBy(id = "search-input")
    public WebElement youtubeDogrulama;

    @FindBy(xpath = "(//*[@class='t-link social-icon--alt'])[5]")
    public WebElement linkedinIkon;

    @FindBy(xpath = "(//input[@class='text-color-text font-sans text-md outline-0 bg-color-transparent grow'])[1]")
    public WebElement linkedinDogrulama;


    // ********** Home Body **********
@FindBy(xpath = "//div[@class='section--sm']")
    public WebElement companyLogosSlider;

@FindBy(xpath = "//img[@class='img-fluid mx-auto']")
    public  WebElement companyLogosName;

    // **********  About Body **********

    @FindBy(xpath = "//a[@class=' nav-link']")
    public WebElement aboutButon;

    @FindBy(xpath = "//h2[text()='Fulfilling Financial Dreams']")
    public WebElement aboutBodyFulfillingFinancialBaslik;

    @FindBy(xpath = "//*[@class='t-link breadcrumbs__link text-uppercase t-text-white t-link--primary']")
    public WebElement aboutBodyHomeIknonu;

    @FindBy(xpath = "//*[@class=' t-link breadcrumbs__link text-uppercase t-text-white t-link--primary ']")
    public WebElement aboutBodyAboutIkonu;




    // ********** Plans Body **********

    @FindBy(xpath = "//a[@class='nav-link active']")
    public WebElement plansButton;

    @FindBy(xpath = "//*[@id='pills-standart-loan-tab']")
    public WebElement standartLoanButton;

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

    @FindBy(xpath = "//*[@data-planname='Basic Loan 1']")
    public WebElement basicLoan1ApplyNowButton;

    @FindBy(xpath = "//*[@id='exampleModalLabel']")
    public WebElement applyForBasicLoan1Sayfasi;

    @FindBy(xpath = "//*[@name='amount']")
    public WebElement amountBox;

    @FindBy(xpath = "//*[@class='btn btn--base w-100']")
    public WebElement amountBoxConfirmButton;

    @FindBy(xpath = "//h5[text()='Application Form']")
    public WebElement applicationFormYazisi;

    public WebElement anasayfaContactButon;

    @FindBy(xpath = "//*[@class='hero__content-title text-capitalize t-text-white']")
    public WebElement contactUsYaziElementi;

    @FindBy(xpath = "//*[@class='query bg--light-1']")
    public WebElement ContactUsMesajFormu;

    @FindBy(xpath = "(//*[@class='form-control form-control-custom form-control-custom--outline form-control-custom--outline-dark'])[1]")
    public WebElement ContactUsNameBox;

    @FindBy(xpath = "(//*[@class='form-control form-control-custom form-control-custom--outline form-control-custom--outline-dark'])[2]")
    public WebElement ContactUsEmailBox;

    @FindBy(xpath = "(//*[@class='form-control form-control-custom form-control-custom--outline form-control-custom--outline-dark'])[3]")
    public WebElement ContactUsSubjectBox;

    @FindBy(xpath = "//*[@class='form-control form-control-custom--outline form-control-custom--dark']")
    public WebElement ContactUsWriteMessageBox;

    @FindBy(xpath = "//*[@class='btn btn--xl btn--base text-capitalize']")
    public WebElement ContactUsSendMessageButon;

    @FindBy(xpath = "//*[text()='Ticket created successfully!']")
    public WebElement ContactUsTicketCreateDogrulamaYazisi;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center bg--light-1 p-3 p-lg-4'])[1]")
    public WebElement ContactUsOfficeAdress;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center bg--light-1 p-3 p-lg-4'])[2]")
    public WebElement ContactUsEmailAdress;

    @FindBy(xpath = "(//*[@class='d-flex align-items-center bg--light-1 p-3 p-lg-4'])[3]")
    public WebElement ContactUsMobileNumber;

    @FindBy(xpath = "//*[@class='container-fluid p-0']")
    public WebElement ContactUsHarita;

    @FindBy(xpath = "//*[@class=' t-link breadcrumbs__link text-uppercase t-text-white t-link--primary ']")
    public WebElement contactUsContactUsLink;

    @FindBy(xpath = "//*[@class='t-link breadcrumbs__link text-uppercase t-text-white t-link--primary']")
    public WebElement contactUsHomeLink;

}
