package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.PageAutomationExercise;

public class StepDefinitionTestCase09 {

    PageAutomationExercise pageAE=new PageAutomationExercise();

    @Then("Click on {string} button")
    public void clickOnProductsButton() {
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
    }

    @And("Verify {string} is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
    }
}
