package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.DashboardPage;
import pages.DownloadProgressPage;
import pages.SelectDropdownPage;
import utils.TestData;

/**
 * Created by dgurau on 08-Feb-18.
 */
public class DashboardPageSteps {

    DashboardPage dashboardPage;
    SelectDropdownPage selectDropdownPage;
    DownloadProgressPage downloadProgressPage;

    @Given("^I am on the selenium website homepage for test$")
    public void iAmOnTheSeleniumWebsiteHomepageForTest() {
        dashboardPage.open();
        Assert.assertTrue(dashboardPage.driver.getTitle().equals(TestData.HOME_PAGE_TITLE));
    }

    @When("^I click start practising$")
    public void iClickStartPractising() {
        dashboardPage.clickOn(dashboardPage.startPracticeBtn);
    }

    @And("^I select the category \"([^\"]*)\"$")
    public void iSelectTheCategory(String category) {
        dashboardPage.clickOn(dashboardPage.category(category));
    }


    @Then("^I am on \"([^\"]*)\" page$")
    public void iAmOnPage(String Title) {
        Assert.assertTrue(selectDropdownPage.simpleSelectElement.getText().trim().equals(Title));
    }


}
