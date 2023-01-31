package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

      private SelenideElement emailField = $(By.xpath("//*[@id=\"email\"]"));
      private SelenideElement passwordField =$(By.xpath("//*[@id=\"pass\"]"));
      private SelenideElement signInButton =$(By.xpath("//*[@id=\"send2\"]/span"));
      private SelenideElement headerLink = $(".customer-welcome");
      private SelenideElement signOut = $(".authorization-link");

      public void login (String email, String password) {

            emailField.setValue(email);
            passwordField.setValue(password);
            signInButton.click();
      }

      public void logout () {

            headerLink.click();
            signOut.click();
      }

}
