package pageModel;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class BaseModel extends Driver {
    WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(15));

    public WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        findElement(by).sendKeys(text);
    }

    public void clickElementWithoutWaiting(By by) {
        findElement(by).click();
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public boolean isElementDisplayed(By by) {
        try {
            return findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean isElementClickable(By by) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    public String getText(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }

    public String getElementValue(By by, String elementValue) {
        return findElement(by).getAttribute(elementValue);
    }

    public List<WebElement> findElements(By by) {
        return webDriver.findElements(by);
    }

    public void SwitchToNewWİndow() {
        String winHandleBefore = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
        }
    }

    public void clickElementWithJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        executor.executeScript("arguments[0].click();", element);
    }

    public  void scrollToElement(WebElement element,long waitSeconds){
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
        WebDriverWait w = new WebDriverWait(webDriver,Duration.ofSeconds(waitSeconds));
    }

    public String getBrowserTitle(){
        return webDriver.getTitle();
    }

    public void goBackPreviousPage(){
        webDriver.navigate().back();
    }



}

