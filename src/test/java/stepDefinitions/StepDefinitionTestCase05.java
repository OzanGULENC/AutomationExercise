package stepDefinitions;

import io.cucumber.java.en.And;
import org.testng.asserts.SoftAssert;
import pages.PageAutomationExercise;
import utilities.ConfigReader;
import utilities.Driver;

public class StepDefinitionTestCase05 {

    PageAutomationExercise pageAE=new PageAutomationExercise();
    SoftAssert softAssert=new SoftAssert();


    @And("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        pageAE.signUpFormNameBox.sendKeys(ConfigReader.getProperty("correctName"));
        pageAE.signupFormEmailBox.sendKeys(ConfigReader.getProperty("correctEmail"));
    }

    @And("Verify error Email Address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        softAssert.assertTrue(pageAE.signUpFormEmailAddressAlreadyExistText.isDisplayed());
        String expectedText="Email Address already exist!";
        softAssert.assertEquals(pageAE.signUpFormEmailAddressAlreadyExistText.getText(),expectedText);
        System.out.println(pageAE.signUpFormEmailAddressAlreadyExistText.getText());
        softAssert.assertAll();
        Driver.getDriver().quit();
    }
}
