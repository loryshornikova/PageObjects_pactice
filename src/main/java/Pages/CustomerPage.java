package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CustomerPage  extends Page {

    private static SelenideElement messageText =
            $(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
    public static String successRegistrationMessage=
            "Thank you for registering with Fake Online Clothing Store.";


    public CustomerPage(String pageUrl) {
        super(pageUrl);
    }

    public void VerifySuccessRegistration(String successRegistrationMessage){
messageText.shouldHave(text(successRegistrationMessage));
    }

}


