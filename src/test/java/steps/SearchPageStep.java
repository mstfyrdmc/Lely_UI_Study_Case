package steps;

import com.thoughtworks.gauge.Step;
import org.junit.jupiter.api.Assertions;
import pageModel.SearchPageModel;

public class SearchPageStep extends BaseStep{
    SearchPageModel searchPageModel;

    public SearchPageStep(){
        this.searchPageModel= new SearchPageModel();
    }

    @Step("Search <key> text")
    public void setTextToSearchArea(String text){
        searchPageModel.setSearchText(text);
        log.info(text+ " setted");
    }

    @Step("Click on search button on search page")
    public void clickOnSearchButtonOnSearchPage(){
        searchPageModel.clickOnSearchButton();
        log.info("Search button clicked");
    }

    @Step("Scroll to search result title")
    public void scrollToSearchResultTitle(){
        searchPageModel.scrollToSearchResult();
        log.info("Scrolled to search title");
    }

    @Step("I should see descriptions of each of the search results contain the searched <key> word.")
    public void checkDescriptionsSearchResult(String searchedText){
        Assertions.assertTrue(searchPageModel.checkSearchResultContent(searchedText),"search result does not contain the searched word.");
        log.info("I saw despcriptions of each of the search results contain the searched key word");
    }
}
