package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.asserts.SoftAssert;
import pages.PageAutomationExercise;
import utilities.Driver;

public class StepDefinitionTestCase03 {

    PageAutomationExercise pageTC03=new PageAutomationExercise();
    SoftAssert softAssert=new SoftAssert();



    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        softAssert.assertTrue(pageTC03.loginYourToAccountForm.isDisplayed());
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        pageTC03.loginAccountFormEmailInput.sendKeys("ozan123ozan@gmail.com");
        pageTC03.loginAccountFormPasswordInput.sendKeys("+aassdd1122+");

    }

    @And("Click login button")
    public void clickLoginButton() {
        pageTC03.loginAccountFormLoginButton.click();

    }

    @And("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        softAssert.assertTrue(pageTC03.loginAccountFormIncorrectText.isDisplayed());
        System.out.println(pageTC03.loginAccountFormIncorrectText.getText());
        softAssert.assertAll();
        Driver.getDriver().quit();

    }


}