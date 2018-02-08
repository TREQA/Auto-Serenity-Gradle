package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.DownloadProgressPage;

/**
 * Created by dgurau on 08-Feb-18.
 */
public class DownloadProgressSteps {

    DownloadProgressPage downloadProgressPage;

    @Given("^I am on the selenium website download page$")
    public void iAmOnTheSeleniumWebsiteDownloadPage(){
        downloadProgressPage.open();
    }


    @And("^I click on Download File$")
    public void iClickOnDownloadFile() {
        downloadProgressPage.clickOn(downloadProgressPage.downloadBtn);
    }

    @Then("^I click on Close button when download is finished$")
    public void iClickOnCloseButtonWhenDownloadIsFinished() {
        downloadProgressPage.clickOn(downloadProgressPage.closeBtn3());
    }
}
