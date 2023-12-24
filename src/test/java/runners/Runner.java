package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "junit:target/xml-report/cucumber.xml"},
        features = {"src/test/resources/features/admin","src/test/resources/features/guest","src/test/resources/features/user"},
        glue ="stepDefinitions",
        //tags = "@smokeTest",
        //tags ="@regressionTest",
        //tags ="@e2e",
        dryRun = false

)
public class Runner {
    /*
       tags = "@smokeTest",
       tags ="@regressionTest",
       tags ="@e2e",
     */
}



