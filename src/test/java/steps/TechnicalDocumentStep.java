package steps;

import com.thoughtworks.gauge.Step;
import constants.TechnicalDocumentConstant;
import org.junit.jupiter.api.Assertions;
import pageModel.TechnicalDocumentModel;

public class TechnicalDocumentStep extends BaseStep{
    TechnicalDocumentModel technicalDocumentModel;
    public TechnicalDocumentStep(){
        this.technicalDocumentModel = new TechnicalDocumentModel();
    }

    @Step("I should see technical document page opened")
    public void checkTechnicalDocumentPageOpened(){
        Assertions.assertEquals(technicalDocumentModel.checkTechnicalDocumentPageOpened(),TechnicalDocumentConstant.pageTitle);
        log.info("I saw the technical document page opened");
    }

    @Step("Click on all documents combobox")
    public void clickOnAllDocumentsCombobox(){
        technicalDocumentModel.clickOnAllDocumentsComboBox();
        log.info("Clicked all documents combobox");
    }

    @Step("I set document name with <key>")
    public void setDocumentName(String documentName){
        technicalDocumentModel.setDocument(documentName);
        log.info("Set document name as: "+documentName);
    }

    @Step("I clicked on selected document")
    public void clickOnSelectedDocument(){
        technicalDocumentModel.clickOnSelectedDocument();
        log.info("Clicked on selectedDocument");
    }

    @Step("I scroll to catalogs")
    public void scrollToCatalogs(){
        technicalDocumentModel.scrollToCatalogs();
        log.info("Scrolled to catalogs");
    }

    @Step("I should see catalogs")
    public void checkCatalogs(){
        Assertions.assertTrue(technicalDocumentModel.isCatalogsListed(),"catalogs don't listed");
        log.info("I saw catalogs");
    }

    @Step("I clicked on view this document on catalogs")
    public void clickedOnViewThisDocumentOnCatalogs(){
        technicalDocumentModel.clickOnViewThisDocumentLink();
        log.info("I clicked on view this doucument on catalogs");
    }

    @Step("I should see selected document opened")
    public void iShouldSeeSelectedDocumnentOpened(){
        Assertions.assertTrue(technicalDocumentModel.isDocumentOpened(),"selected document did not open");
        technicalDocumentModel.switchToMainTab();
        log.info("I saw selected document opened");
    }

    @Step("Click on second download document button")
    public void clickOnSecondDownloadDocumentButton(){
        technicalDocumentModel.clickOnSecondDownloadDocumentButton();
        log.info("I clicked on second download document button");
    }

    @Step("I should see seleceted document downloaded")
    public void iShouldSeeSelecetedDocumentDownloaded() throws InterruptedException {
        Assertions.assertTrue(technicalDocumentModel.isFileDownloaded(TechnicalDocumentConstant.downloadPath,TechnicalDocumentConstant.fileName),"selected document did not download");
        log.info("I saw selected document downladed");
    }
}
