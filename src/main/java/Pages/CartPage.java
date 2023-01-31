package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class CartPage {
    String noItems = "You have no items in your shopping cart";
    String removeItemFromCart = "Are you sure you would like to remove this item from the shopping cart?";

    private SelenideElement removeItem = $(By.xpath
            ("//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a"));

    private static SelenideElement cart = $(By.xpath
            ("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]"));
    private static SelenideElement cartItemsView = $(By.xpath("//*[@id=\"ui-id-1\"]"));
    private static String message = "1 Item in Cart";
    private static SelenideElement removeModalWindow = $
            (By.xpath("/html/body/div[4]/aside[2]/div[2]/div/div"));
    private static SelenideElement okButton =
            $(By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]/span"));
    private static SelenideElement infoMessage = $(By.xpath("//*[@id=\"ui-id-1\"]"));



    public static void ViewCartContent () {
        cart.click();
    }

     public void VerifyItemInCart (){
         cartItemsView.shouldHave(text(message));
     }

     public void DeleteItem (){
        removeItem.click();
     }

     public void ConfirmMessageAppears (){
     removeModalWindow.shouldHave(text(removeItemFromCart));
     }
     public void OkButtonClick() {
        okButton.click();
            }
     public void VerifyNoItemsMessageAppears() {
        infoMessage.shouldHave(text(noItems));
     }
}
