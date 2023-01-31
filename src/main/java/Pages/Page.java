package Pages;
import com.codeborne.selenide.Selenide;

public class Page {
    protected static String pageUrl;

    public  Page(String pageUrl){
        this.pageUrl = pageUrl;
    }

    public static void Open() {
        Selenide.open(pageUrl);
    }
}
