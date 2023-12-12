
package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.UserPages;

public class User {

    // ********** Login  **********
    UserPages userPages=new UserPages();
    @Given("kullanici verilen {string} gider")
    public void kullanici_verilen_gider(String url) {
       userPages.istenilenUrlGitme(url);
    }

    @Given("kullanici verilen {string} ve {string} bilgileri ile userpage de login olur")
    public void kullanici_verilen_ve_bilgileri_ile_userpage_de_login_olur(String username, String password) {
       userPages.userLoginMethod(username,password);
    }

    // ********** US_013  **********


    // ********** US_014  **********


    // ********** US_015  **********


    // ********** US_016  **********


    // ********** US_017  **********


    // ********** US_018  **********


    // ********** US_019  **********


    // ********** US_020  **********


    // ********** US_021  **********


    // ********** US_022  **********


    // ********** US_023  **********


    // ********** US_024  **********


}
