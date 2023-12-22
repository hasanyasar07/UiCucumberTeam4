package pages;

import io.cucumber.java.zh_cn.假如;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.JavascriptExecutor;
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

import java.security.PublicKey;
import java.util.List;
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

    @FindBy(xpath = "//a[@class='nav-link active']")
    public  WebElement homeHeaderButon;
    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement aboutHeaderButon;
    @FindBy(xpath = "(//a[@class='nav-link '])[1]")
    public WebElement plansHeaderButon;

    @FindBy(xpath = "(//*[@*='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement loginButonHomePage;
    @FindBy(xpath = "(//p[@*='label mb-0 fw-bold text-uppercase t-text-white'])[1]")
    public WebElement emailHomePageHeader;
    @FindBy(xpath = "(//p[@*='label mb-0 fw-bold text-uppercase t-text-white'])[2]")
    public WebElement addressHomePageHeader;
    @FindBy(xpath = "(//p[@*='label mb-0 fw-bold text-uppercase t-text-white'])[3]")
    public WebElement phoneHomePageHeader;

    @FindBy(xpath = "//*[@*='nav-link active']")
    public WebElement HomeButtonHomePageHeader;
    @FindBy(xpath = "//*[@*=' nav-link']")
    public WebElement AboutButtonHomePageHeader;
    @FindBy(xpath = "(//li[@class='nav-item'])[3]")
    public WebElement PlansButtonHomePageHeader;
    @FindBy(xpath = "(//a[@class='nav-link '])[2]")
    public WebElement  BlogsButtonHomePageHeader;
    @FindBy(xpath = "(//a[@class='nav-link '])[3]")
    public WebElement ContactButtonHomePageHeader;

    @FindBy(xpath = "//img[@*='viserhyip']")
    public  WebElement LoantechIkonHomePage;
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
    @FindBy(xpath = "(//a[@class='t-link t-link--primary t-text-white text-capitalize'])[1]")
    public  WebElement FooterLoanPlansHomePage;


    // ********** Home Body **********


    @FindBy(xpath = "//div[@class='section--sm']")
    public WebElement companyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[10]")
    public WebElement ExxonMobilcompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[11]")
    public WebElement PandGcompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[12]")
    public WebElement CVShealtcompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[13]")
    public WebElement BerkshireHathawaycompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[14]")
    public WebElement PelotoncompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[15]")
    public WebElement emergentcompanyLogosSlider;
    @FindBy(xpath = "(//*[@alt='client'])[16]")
    public WebElement SolarEdgecompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[17]")
    public WebElement SunBasketcompanyLogosSlider;

    @FindBy(xpath = "(//*[@alt='client'])[18]")
    public WebElement CovenantTransportcompanyLogosSlider;



@FindBy(xpath = "(//h5[@class='text-capitalize mt-0 t-body-font fw-md text-start'])[1]")
public  WebElement supportTitle;
@FindBy(xpath = "(//h5[@class='text-capitalize mt-0 t-body-font fw-md text-start'])[2]")
public  WebElement lowCostTitle;

@FindBy (xpath = "(//div[@class='flex-shrink-0 icon'])[1]")
public  WebElement supportIkon;
@FindBy (xpath = "(//div[@class='flex-shrink-0 icon'])[2]")
public  WebElement lowCostIkon;
@FindBy(xpath ="//div[@class='text-center text-lg-start']")
    public  WebElement featureBodyHomePage;

    @FindBy(xpath = "(//i[@style='color:rgb(0,0,0);font-size:0.875rem;'])[1]")
    public WebElement quickApprovalProcessesTitle;
    @FindBy(xpath = "(//i[@style='color:rgb(0,0,0);font-size:0.875rem;'])[2]")
    public WebElement variousLoanTypesTitle;

    @FindBy(xpath = "(//i[@style='color:rgb(0,0,0);font-size:0.875rem;'])[3]")
    public WebElement flexibleRepaymentTermsTitle;
    @FindBy(xpath = "(//i[@style='color:rgb(0,0,0);font-size:0.875rem;'])[4]")
    public WebElement competitiveInterestRatesTitle;
    @FindBy(xpath = "(//i[@style='color:rgb(0,0,0);font-size:0.875rem;'])[5]")
    public WebElement digitalApplicationProcessingTitle;

@FindBy(xpath = "(//p[@class='mb-0 text-capitalize text--primary xxl-text'])[3]")
public  WebElement featuredPlansTitle;

@FindBy(xpath = "(//*[@class='btn btn-md btn--xl xl-text w-100 btn--base loanBtn'])[1]")
public  WebElement applyButtonHomePage;
@FindBy(xpath = "(//span[@class='plan-feature-list-title'])[1]")
public  WebElement TakeMinimumHomePage;

@FindBy(xpath = "//h3[@class='text-center mt-3']")
public  WebElement YouAreNotLoginText;

@FindBy(xpath = "//a[@class='btn btn-sm btn--base']")
public  WebElement LoginButtonOnAlert;

@FindBy (xpath = "//a[@class='btn btn--xl xl-text btn--base mt-5']")
public  WebElement seeAllButtonHomePage;
@FindBy (xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
public  WebElement LoanPlans;
@FindBy(xpath = "(//p[@class='mb-0 t-text-white text-capitalize xxl-text text-center'])[1]")
public  WebElement CountryWideHomeBody;
    @FindBy(xpath = "(//p[@class='mb-0 t-text-white text-capitalize xxl-text text-center'])[2]")
    public  WebElement HappyClientHomeBody;
    @FindBy(xpath = "(//p[@class='mb-0 t-text-white text-capitalize xxl-text text-center'])[3]")
    public  WebElement WinningAwardsHomeBody;
    @FindBy(xpath = "(//p[@class='mb-0 t-text-white text-capitalize xxl-text text-center'])[4]")
    public  WebElement TotalLoanHomeBody;
    @FindBy(xpath = "(//section[@class='section--sm section--bottom'])[3]")
    public  WebElement FAQsectionHomeBody;
    @FindBy(xpath = "//div[@class='row justify-content-center g-4']")
    public WebElement FrequentlyAskedHomePageBody;

    @FindBy(xpath = "//button[@class='accordion-button vf-accordion__btn']")
    public  WebElement AccordionButton1FqaHomePageBody;
    @FindBy(xpath = "//*[@class='accordion-button vf-accordion__btn']")
    public  WebElement AccordionButton2FqaHomePageBody;
    @FindBy(xpath = "(//*[@*='accordion-button vf-accordion__btn collapsed'])[2]")
    public  WebElement AccordionButton3FqaHomePageBody;
    @FindBy(xpath = "(//*[@*='accordion-button vf-accordion__btn collapsed'])[3]")
    public  WebElement AccordionButton4FqaHomePageBody;
    @FindBy(xpath = "(//*[@*='accordion-button vf-accordion__btn collapsed'])[4]")
    public  WebElement AccordionButton5FqaHomePageBody;
    @FindBy(xpath = "(//*[@*='accordion-button vf-accordion__btn collapsed'])[5]")
    public  WebElement AccordionButton6FqaHomePageBody;
    @FindBy(xpath = "(//*[@*='accordion-button vf-accordion__btn collapsed'])[6]")
    public  WebElement AccordionButton7FqaHomePageBody;
    @FindBy(xpath = "//section[@class='feedback-section section']")
    public WebElement CompanyEmployeesSliderHomeBody;

    @FindBy(xpath = "//i[@class='bx bx-left-arrow-alt']")
    public  WebElement leftButtonCompanyEmployeesSlider;
    @FindBy(xpath = "//i[@class='bx bx-right-arrow-alt']")
    public  WebElement rightButtonCompanyEmployeesSlider;
    @FindBy(xpath = "//*[@class='section']")
    public WebElement BlogPostHomePageBody;

    @FindBy(xpath = "(//*[@class='col-md-6 col-lg-4'])[1]")
    public  WebElement Blog1HomePageBody;
    @FindBy(xpath = "(//*[@class='col-md-6 col-lg-4'])[2]")
    public  WebElement Blog2HomePageBody;

    @FindBy(xpath = "(//*[@class='col-md-6 col-lg-4'])[3]")
    public  WebElement Blog3HomePageBody;
    @FindBy(xpath="(//*[@class='t-link t-link--primary t-text'])[1]")
    public  WebElement dateBlog1HomePageBody;

    @FindBy(xpath = " //h3[@class=' text-capitalize mt-0 text-center text-md-start ps-xl-3']")
    public WebElement LikeToBecomeHeroHomePage;
    @FindBy(xpath = "//a[@class='btn btn--base text-capitalize']")
    public  WebElement TakeLoanButtonHomePage;
    @FindBy(xpath = "(//a[@class='t-link t-link--primary t-text'])[3]")
    public  WebElement Picter1BlogHomePageBody;
    @FindBy(xpath = "(//a[@class='nav-link '])[1]")
    public WebElement PlansButtonHomePage;


    // **********  About Body **********

    @FindBy(xpath = "//a[@class=' nav-link']")
    public WebElement aboutButon;

    @FindBy(xpath = "//h2[text()='Fulfilling Financial Dreams']")
    public WebElement aboutBodyFulfillingFinancialBaslik;

    @FindBy(xpath = "//*[@class='t-link breadcrumbs__link text-uppercase t-text-white t-link--primary']")
    public WebElement aboutBodyHomeIknonu;

    @FindBy(xpath = "//*[@class=' t-link breadcrumbs__link text-uppercase t-text-white t-link--primary ']")
    public WebElement aboutBodyAboutIkonu;
    @FindBy (xpath = "(//*[@class='nav-link '])[5]")
    public  WebElement basicLoanButtonHomeBody;
    @FindBy(xpath ="(//div[@class='row g-4'])[1]")
    public  WebElement featurePlansSectionHomePage;




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
    @FindBy(xpath = "//h2[@class='hero__content-title text-capitalize t-text-white']")
    public  WebElement LoanPlansPage;

    @FindBy(xpath = "(//*[@class='row justify-content-center gy-4 gx-sm-2 gx-md-4'])[6]")
    public  WebElement BasicLoanCardSection;


    @FindBy(xpath = "(//li[@class='list--row__item breadcrumbs__item'])[1]")
    public  WebElement homeButtonUnderLoanPlans;
    @FindBy(xpath = "//*[@*='btn btn--xl xl-text btn--base btn--outline mt-3']")
    public  WebElement getStartedHomePage;
    @FindBy(xpath = "(//li[@class='list--row__item breadcrumbs__item'])[2]")
    public  WebElement loanPlansButtonUnderLoanPlans;
    @FindBy(xpath = "//button[@data-id='25']")
    public  WebElement ApplyNow1ButtonUnderBasicLoan;
    @FindBy(xpath = "//button[@data-id='30']")
    public  WebElement ApplyNow2ButtonUnderBasicLoan;


   @FindBy(xpath = "(//div[@class='plan-card-header-body'])[4]")
    public  WebElement BasicLoan1Section;
    @FindBy(xpath = "//*[@*='btn btn-sm btn--dark']")
    public  WebElement closeAllertApplyNowButton;

    @FindBy (xpath = "//a[@aria-current='page']")
    public  WebElement contactPageHomeButon;

}


