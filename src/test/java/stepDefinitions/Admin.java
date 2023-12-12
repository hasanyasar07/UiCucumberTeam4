package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.AdminPages;

public class Admin {
    AdminPages adminPages=new AdminPages();

    @Given("kullanici verilen {string} ve {string} bilgileri ile admin sayfasinda login olur")
    public void kullanici_verilen_ve_bilgileri_ile_admin_sayfasinda_login_olur(String username, String password) {
        adminPages.adminLoginMethod(username,password);
    }

    // ********** US_025  **********



    // ********** US_026  **********



    // ********** US_027  **********



    // ********** US_028  **********



    // ********** US_029  **********



    // ********** US_030  **********



    // ********** US_031  **********



    // ********** US_032  **********



    // ********** US_033  **********



    // ********** US_034  **********



    // ********** US_035  **********



    // ********** US_036  **********



    // ********** US_037  **********



    // ********** US_038  **********



    // ********** US_039  **********



    // ********** US_040  **********



    // ********** US_041  **********



    // ********** US_042  **********



    // ********** US_043  **********



    // ********** US_044  **********



    // ********** US_045  **********



    // ********** US_046  **********



    // ********** US_047  **********



    // ********** US_048  **********



    // ********** US_049  **********



    // ********** US_050  **********



    // ********** US_051  **********



    // ********** US_052  **********



    // ********** US_053  **********



    // ********** US_054  **********



    // ********** US_055  **********



}
