package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.asserts.SoftAssert;
import pages.PageTestCase01;
import utilities.Driver;

public class StepDefinitionsTestCase03 {

    PageTestCase01 pageTC01=new PageTestCase01();
    SoftAssert softAssert=new SoftAssert();



    @And("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        softAssert.assertTrue(pageTC01.loginYourToAccountForm.isDisplayed());
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        pageTC01.loginAccountFormEmailInput.sendKeys("ozan123ozan@gmail.com");
        pageTC01.loginAccountFormPasswordInput.sendKeys("+aassdd1122+");

    }

    @And("Click login button")
    public void clickLoginButton() {
        pageTC01.loginAccountFormLoginButton.click();

    }

    @And("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        softAssert.assertTrue(pageTC01.loginAccountFormIncorrectText.isDisplayed());
        System.out.println(pageTC01.loginAccountFormIncorrectText.getText());
        softAssert.assertAll();
        Driver.getDriver().quit();

    }


}