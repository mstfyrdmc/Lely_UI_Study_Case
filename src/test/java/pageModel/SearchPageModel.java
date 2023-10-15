package pageModel;

import constants.SearchPageConstant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPageModel extends BaseModel{
    SearchPageConstant searchPageConstant;

    public void setSearchText(String text){
        sendKeys(searchPageConstant.TXT_SEARCH_AREA,text);
    }

    public void clickOnSearchButton(){
        clickElement(searchPageConstant.BTN_SEARCH);
    }

    public void scrollToSearchResult(){
        WebElement TXT_SEARCH_RESULT_TITLE = findElement(By.cssSelector(".search-results-title"));
        scrollToElement(TXT_SEARCH_RESULT_TITLE,1000);
    }

    public boolean checkSearchResultContent(String searchedText){
        List<WebElement> searchedResults = findElements(searchPageConstant.TXT_RUSULTS);
        for (int i = 0; i < searchedResults.size(); i++) {
            if(searchedResults.get(i).getText().contains(searchedText)){
                return true;
            }
        }
        return false;
    }
}
