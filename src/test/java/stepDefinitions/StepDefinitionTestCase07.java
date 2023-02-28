package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PageAutomationExercise;
import utilities.Driver;


public class StepDefinitionTestCase07 {

    PageAutomationExercise pageAE=new PageAutomationExercise();


    @Then("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        pageAE.homePageTestCaseButton.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Driver.getDriver().switchTo().frame(pageAE.testCasePageİframeOne);
        Driver.getDriver().switchTo().frame(pageAE.testCasePageİframeTwo);
        pageAE.iframeDismissButton.click();
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().parentFrame();
        String expectedTestCasesUrl="https://automationexercise.com/test_cases";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),expectedTestCasesUrl);
        Driver.getDriver().quit();


    }
}
