package constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPageConstant {
    public static By TXT_SEARCH_AREA = By.id("global-search");
    //public static By BTN_SEARCH = By.cssSelector(".page-section>p>button");
    public static By BTN_SEARCH = By.xpath("//button[text()='Search']");
    public static By TXT_RUSULTS = By.cssSelector(".item-link");
}
