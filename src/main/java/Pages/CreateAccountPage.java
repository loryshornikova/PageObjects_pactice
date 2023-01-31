package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class CreateAccountPage extends Page{

private static SelenideElement firstNameField = $(By.xpath("//*[@id=\"firstname\"]"));
private static SelenideElement lastNameField = $(By.xpath("//*[@id=\"lastname\"]"));
private static SelenideElement emailField = $(By.xpath("//*[@id=\"email_address\"]"));
private static SelenideElement passwordField = $(By.xpath("//*[@id=\"password\"]"));
private static SelenideElement confirmPasswordField = $(By.xpath("//*[@id=\"password-confirmation\"]"));
private static SelenideElement createAccountButton = $(By.xpath
        ("//*[@id=\"form-validate\"]/div/div[1]/button/span"));




    public CreateAccountPage(String pageUrl) {
        super(pageUrl);
    }

    public static void enterFirstName(String firstname){
    firstNameField.setValue(firstname);
    }

    public static void enterLastName(String lastName) {
        lastNameField.setValue(lastName);
    }

    public static void enterPassword(String password) {
        passwordField.setValue(password);
    }

    public static void confirmPassword(String password) {
        confirmPasswordField.setValue(password);
    }

     public static void enterEmail(String email) {
        emailField.setValue(email);
     }

     public static CustomerPage completeRegistration() {
        createAccountButton.click();
        return new CustomerPage ("https://magento.softwaretestingboard.com/customer/account/");
     }
}

