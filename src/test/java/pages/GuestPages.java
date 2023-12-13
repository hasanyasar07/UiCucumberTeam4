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




    // ********** Home Body **********




    // **********  About Body **********




    // ********** Plans Body **********





    // **********  Blogs Body **********





    // ********** Contact Body  **********


}
