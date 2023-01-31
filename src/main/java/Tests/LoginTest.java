package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoginTest {

LoginPage loginPage = new LoginPage();
UserInfo userInfo = new UserInfo();
HomePage homePage=new HomePage("https://magento.softwaretestingboard.com/");

    @BeforeAll

    static void BeforeAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test

          void LoginFlow() {
          homePage.Open();
          homePage.ClickLoginButton();
          loginPage.login(userInfo.email, userInfo.password);
          homePage.VerifyUserLoggedIn();
    }
}
