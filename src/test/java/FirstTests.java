import com.codeborne.selenide.Configuration;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.*;


public class FirstTests {


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");
        Configuration.browser="chrome";

    }

    @Test
    public void testUntitledTestCase() throws Exception {
        open("https://app.geteasyqa.com/users/sign_in");
        $(UIMap.login).click();
        $(UIMap.login).clear();
        $(UIMap.login).sendKeys("stalkerskos@yandex.ru");

        $(UIMap.password).click();
        $(UIMap.password).clear();
        $(UIMap.password).sendKeys("stalkerkos");

        $(UIMap.loginBtn).click();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
       close();

    }


}
