import com.codeborne.selenide.Configuration;
import com.easyqa.qa.pages.DashboardPage;
import com.easyqa.qa.pages.LoginPage;
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
        Configuration.browserSize="1600x1000";

    }

    @Test
    public void testUntitledTestCase() throws Exception {
        LoginPage loginPage = open("https://app.geteasyqa.com/users/sign_in",LoginPage.class);
        loginPage.enterLogin("stalkerskos@yandex.ru");
        loginPage.enterPassword("stalkerkos");
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.checkUserAuthorized();

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
       close();

    }


}
