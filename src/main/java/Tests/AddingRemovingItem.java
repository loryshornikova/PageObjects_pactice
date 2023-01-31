package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.ItemsPage;
import Pages.LoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AddingRemovingItem {

       LoginPage loginPage=new LoginPage();
       UserInfo userInfo=new UserInfo();
       HomePage homePage=new HomePage("https://magento.softwaretestingboard.com/");
       ItemsPage itemsPage=new ItemsPage();
       CartPage cartPage= new CartPage();

       @BeforeAll

       static void BeforeAll() {
              Configuration.holdBrowserOpen = true;
       }

       @Test

       void FirstTest (){
              homePage.Open();
              homePage.ClickLoginButton();
              loginPage.login(userInfo.email, userInfo.password);

              itemsPage.MenClick();
              itemsPage.MenTopClick();
              itemsPage.StyleClick();
              itemsPage.RaincoatClick();
              itemsPage.ListViewClick();
              itemsPage.SortByPrice();
              itemsPage.ChooseColorSize();
              itemsPage.AddToCart();

              cartPage.ViewCartContent();

              cartPage.VerifyItemInCart();

              cartPage.DeleteItem();

              cartPage.ConfirmMessageAppears();

              cartPage.OkButtonClick();

              cartPage.VerifyNoItemsMessageAppears();

              loginPage.logout();
       }

       @Test

       void SecondTest() {
              homePage.Open();
              homePage.ClickLoginButton();
              loginPage.login(userInfo.email, userInfo.password);


              itemsPage.MenClick();
              itemsPage.MenTopClick();
              itemsPage.StyleClick();
              itemsPage.HoodedClick();
              itemsPage.ListViewClick();
              itemsPage.SortByPrice();
              itemsPage.ChooseColorSize();
              itemsPage.AddToCart();

              cartPage.ViewCartContent();

              cartPage.VerifyItemInCart();

              cartPage.DeleteItem();

              cartPage.ConfirmMessageAppears();

              cartPage.OkButtonClick();

              cartPage.VerifyNoItemsMessageAppears();

              loginPage.logout();

       }


}
