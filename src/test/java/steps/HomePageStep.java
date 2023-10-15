package steps;

import com.thoughtworks.gauge.Step;
import constants.HomePageConstant;
import org.junit.jupiter.api.Assertions;
import pageModel.HomePageModel;


public class HomePageStep extends BaseStep {
    HomePageModel homePageModel;
    private String url;

    public HomePageStep(){
        this.homePageModel= new HomePageModel();
    }

    @Step("Enter <key> site")
    public void  initializeWebSite(String url) throws Exception {
        this.url = url;
        homePageModel.GoToUrl(url);
        log.info("entered " +url);

    }

    @Step("Click on reject cookies button")
    public void clickOnRejectCookiesButton(){
        homePageModel.clickOnRejectCookiesButton();
        log.info("Reject button clicked");
    }

    @Step("Click on search button")
    public void clickOnSearchButton(){
        homePageModel.clickOnSearchButton();
        log.info("Search button clicked");
    }

    @Step("Search area should be open")
    public void checkSearchArea(){
        String x = homePageModel.isSearchPageOpen();
        Assertions.assertEquals(homePageModel.isSearchPageOpen(), HomePageConstant.searchTitle);
        log.info("Search area opened");
    }

}
