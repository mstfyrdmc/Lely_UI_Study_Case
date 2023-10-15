package constants;

import org.openqa.selenium.By;

public class TechnicalDocumentConstant {
    public static By TXT_PAGE_TITLE = By.cssSelector(".page-header-title");
    public static String pageTitle = "Technical documents";
    public static By CBX_ALL_DOCUMENTS = By.id("select2-id_q-container");
    public static By TBX_SEARCH_DOCUMENTS = By.cssSelector(".select2-search__field");
    public static By TXT_SEARCHED_DOCUMENT = By.id("select2-id_q-results");
    public static By CATALOG_ITEMS = By.cssSelector(".item");
    public static By VIEW_THIS_DOCUMENT = By.xpath("//a[contains(text(),'View this document')]");
    public static By BTN_DOWNLOAD_DOCUMENT = By.xpath("//a[contains(text(),'Download')]");
    public static String downloadPath = "/Users/mustafayardimci/Downloads";
    public static String fileName = "D-S032VT_-.pdf";
}

