package pageModel;

import constants.HomePageConstant;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;


public class HomePageModel extends BaseModel {
HomePageConstant homePageConstant;

    public void GoToUrl(String url) {
        webDriver.get(url);
    }

    public void clickOnRejectCookiesButton(){
        clickElement(homePageConstant.BTN_REJECT_COOKIES);
    }

    public void clickOnSearchButton(){
        clickElement(homePageConstant.BTN_SEARCH);
    }

    public String isSearchPageOpen(){
      return  getText(homePageConstant.TXT_SEARCH_TITLE);
    }

}
