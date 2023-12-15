package pages;

import io.cucumber.java.zh_cn.假如;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

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


    // ********** Home Body **********




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





    // **********  Blogs Body **********





    // ********** Contact Body  **********

    @FindBy(xpath = "(//*[@class='nav-link '])[3]")
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

}
