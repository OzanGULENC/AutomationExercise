package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.PageAutomationExercise;
import utilities.Driver;

public class StepDefinitionTestCase09 {

    PageAutomationExercise pageAE=new PageAutomationExercise();
    SoftAssert softAssert=new SoftAssert();


    @Then("Click on Products button")
    public void clickOnProductsButton() {
        pageAE.homePageProductsButton.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Driver.getDriver().switchTo().frame(pageAE.productsPageIframeOne);
        Driver.getDriver().switchTo().frame(pageAE.productsPageIframeTwo);
        pageAE.productsPageIframeDismissButton.click();
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().parentFrame();
        String expectedProductsUrl="https://automationexercise.com/products";
        String actualProductsUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualProductsUrl,expectedProductsUrl);

    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        String searchWord="Tshirt";
        pageAE.searchProductInputBox.sendKeys(searchWord);
        pageAE.searchProductSubmitButton.click();
    }

    @And("Verify {string} is visible")
    public void verifySEARCHEDPRODUCTSIsVisible(String searchProduct) {
        softAssert.assertEquals(searchProduct,pageAE.searchedProductsTitleText.getText());

    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {

        softAssert.assertAll();
        Driver.quitDriver();
    }

}
