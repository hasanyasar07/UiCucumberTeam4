package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestPages {
    public GuestPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // ********** Header **********




    // ********** Footer **********




    // ********** Home Body **********
@FindBy(xpath = "//div[@class='section--sm']")
    public WebElement companyLogosSlider;

@FindBy(xpath = "//img[@class='img-fluid mx-auto']")
    public  WebElement companyLogosName;

    // **********  About Body **********




    // ********** Plans Body **********





    // **********  Blogs Body **********





    // ********** Contact Body  **********


}
