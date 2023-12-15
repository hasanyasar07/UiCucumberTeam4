package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestPages {
    public GuestPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Allow']")
    public WebElement cookieKabul;

    // ********** Header **********
    @FindBy(xpath = "(//*[@class='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement guestPageLoginButton;



    // ********** Footer **********
    @FindBy(xpath = "(//*[@class='t-link t-link--primary t-text-white text-capitalize'])[2]")
    public WebElement footerAboutButon;


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


}
