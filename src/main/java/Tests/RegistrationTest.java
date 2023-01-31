package Tests;

import Pages.CreateAccountPage;
import Pages.CustomerPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static Pages.CustomerPage.successRegistrationMessage;

public class RegistrationTest {

    CreateAccountPage createAccount = new CreateAccountPage
        ("https://magento.softwaretestingboard.com/customer/account/create/");

    UserInfo userInfo = new UserInfo();

    @BeforeAll

     static void beforeAll() {

        Configuration.browserSize = "1920x1080";
    }

    @Test

    void Registration () {

        CreateAccountPage.Open();
        CreateAccountPage.enterFirstName(userInfo.firstName);
        CreateAccountPage.enterLastName(userInfo.lastName);
        CreateAccountPage.enterEmail(userInfo.emailForRegistration);
        CreateAccountPage.enterPassword(userInfo.password);
        CreateAccountPage.confirmPassword(userInfo.password);

        CustomerPage customerInfo = CreateAccountPage.completeRegistration();

        customerInfo.VerifySuccessRegistration(successRegistrationMessage);

    }
}
