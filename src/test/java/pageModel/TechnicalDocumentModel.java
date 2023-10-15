package pageModel;

import constants.TechnicalDocumentConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TechnicalDocumentModel extends BaseModel {
    TechnicalDocumentConstant technicalDocumentConstant;

    public String checkTechnicalDocumentPageOpened() {
        return getText(technicalDocumentConstant.TXT_PAGE_TITLE);
    }

    public void clickOnAllDocumentsComboBox() {
        clickElement(technicalDocumentConstant.CBX_ALL_DOCUMENTS);
    }

    public void setDocument(String documentName) {
        sendKeys(technicalDocumentConstant.TBX_SEARCH_DOCUMENTS, documentName);
    }

    public void clickOnSelectedDocument() {
        clickElement(technicalDocumentConstant.TXT_SEARCHED_DOCUMENT);
    }

    public void scrollToCatalogs() {
        WebElement element = findElement(By.cssSelector(".result-item"));
        scrollToElement(element, 1000);
    }

    public boolean isCatalogsListed() {
        List<WebElement> catalogs = findElements(TechnicalDocumentConstant.CATALOG_ITEMS);
        for (int i = 0; i < catalogs.size(); i++) {
            if (catalogs.get(i).isDisplayed()) {
                return true;
            }
        }
        return false;
    }

    public void clickOnViewThisDocumentLink() {
        clickElement(technicalDocumentConstant.VIEW_THIS_DOCUMENT);
    }

    public boolean isDocumentOpened() {
        return !webDriver.getCurrentUrl().equals("");
    }

    public void switchToMainTab() {
        if (webDriver.getWindowHandles().size() > 1) {
            ArrayList<String> switchTabs = new ArrayList<String>(webDriver.getWindowHandles());
            webDriver.switchTo().window(switchTabs.get(1));
            webDriver.close();
            webDriver.switchTo().window(switchTabs.get(0));
        } else {
            goBackPreviousPage();
        }
    }


    public void clickOnSecondDownloadDocumentButton() {
        List<WebElement> downloadButtons = findElements(technicalDocumentConstant.BTN_DOWNLOAD_DOCUMENT);
        for (int i = 0; i < downloadButtons.size(); i++) {
            if (i == 1) {
                clickElement(downloadButtons.get(i));
            }
        }
    }


    public boolean isFileDownloaded(String downloadPath, String fileName) throws InterruptedException {
        Thread.sleep(2000);
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                // File has been found, it can now be deleted:
                dirContents[i].delete();
                return true;
            }
        }
        return false;
    }
}
