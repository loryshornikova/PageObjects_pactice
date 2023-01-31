package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class ItemsPage {


    private static SelenideElement menLink = $(By.xpath
            ("//nav[@class='navigation']//span[text() = 'Men']"));
    private static SelenideElement menTop = $(By.xpath
            ("//ol/li/a[@href='https://magento.softwaretestingboard.com/men/tops-men.html']"));
    private static SelenideElement style = $(By.xpath
            ("//*[@id=\"narrow-by-list\"]/div[2]/div[1]"));
    private static SelenideElement raincoat = $(By.xpath
            ("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[6]/a"));
    private static SelenideElement hooded =
            $(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[4]/a"));
    private static SelenideElement listView = $(By.cssSelector("#mode-list"));
    private static SelenideElement sortOptions = $(By.cssSelector("#sorter.sorter-options"));
    private static SelenideElement sortByPrice =$(By.cssSelector("#sorter > option:nth-child(3)"));
    private static SelenideElement size143 = $(By.xpath("//*[@id=\"option-label-size-143-item-170\"]"));
    private static SelenideElement color =$(By.xpath("//*[@id=\"option-label-color-93-item-60\"]"));
    private static SelenideElement addToCart = $(By.xpath("//button[@title='Add to Cart']"));
    private static SelenideElement cart = $(By.xpath
            ("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]"));


    public static void MenClick() {
        menLink.click();
    }
    public static void MenTopClick() {
        menTop.click();
    }
    public static void StyleClick() {
        style.click();
    }

    public static void RaincoatClick () {
        raincoat.click();
    }
    public static void HoodedClick (){
        hooded.click();
    }
    public static void ListViewClick () {
        listView.click();
    }
    public static void SortByPrice () {
        sortOptions.click();
        sortByPrice.click();
    }
    public static void ChooseColorSize () {
        size143.click();
        color.click();
    }
    public static void AddToCart () {
        addToCart.click();
    }

}
