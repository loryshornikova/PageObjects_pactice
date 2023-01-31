package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends Page {

    private SelenideElement signInButton =
            $(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
    private SelenideElement welcomeMessage =
            $(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[1]/span"));


    public HomePage(String pageUrl) {
        super(pageUrl);
    }
    public void ClickLoginButton() {
        signInButton.click();
    }

     public void VerifyUserLoggedIn(){

         welcomeMessage.shouldHave(text("Welcome"));
     }

}
