package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;


public class BaseTest {

    public static final String BASE_URL = "https://staging-mobile.xyz/";

    @Before
    public void beforeMethodSignIn() {
        //Configuration.headless = true;
        Configuration.browserSize = "375x812";
        // Configuration.timeout = 5000;
        // Configuration.pageLoadTimeout = 5000;
        Configuration.clickViaJs = true;
        // Configuration.assertionMode = AssertionMode.SOFT;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
        open(BASE_URL);
        sleep(5000);
    }

}