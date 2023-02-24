package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.PageTestCase01;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitionsTestCase01 {

    PageTestCase01 pageTC01=new PageTestCase01();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();
    JavascriptExecutor jse=(JavascriptExecutor) Driver.getDriver();
    Select select;
    ReusableMethods reusableMethods;

    String fakerName=faker.name().firstName();
    String email=faker.internet().emailAddress();


    @Given("Navigate to url")
    public void navigateToUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        System.out.println(Driver.getDriver().getCurrentUrl());

    }


    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedURL="https://automationexercise.com/";
        String actualURL=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedURL, actualURL);
    }


    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        pageTC01.signUpLoginButton.click();
    }

    @And("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
//        softAssert.assertTrue(pageTC01.signUpForm.isDisplayed());
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        pageTC01.signUpFormNameBox.sendKeys(fakerName);
        pageTC01.signupFormEmailBox.sendKeys(email);
    }

    @And("Click Signup button")
    public void clickSignupButton() {
        pageTC01.signUpFormSubmitButton.click();
    }

    @And("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        String expectedAccountInformationText="ENTER ACCOUNT INFORMATION";
        String actualAccountInformationText=pageTC01.enterAccountInformationText.getText();
        softAssert.assertTrue(pageTC01.enterAccountInformationText.isDisplayed());
        softAssert.assertEquals(expectedAccountInformationText,actualAccountInformationText);
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth(){
        pageTC01.accountInformationTitleMRButton.click();
        // String accountName=faker.name().firstName();
        // System.out.println(accountName);
        // pageTC01.accountInformationNameBox.sendKeys(accountName);
        // String accountEmail=faker.internet().emailAddress();
        // System.out.println(accountEmail);
        // pageTC01.accountInformationEmailBox.sendKeys(accountEmail);
        String accountPassword=faker.internet().password();
        System.out.println(accountPassword);
        pageTC01.accountInformationPasswordBox.sendKeys(accountPassword);
        Select selectBirthDayDropDown=new Select(pageTC01.accountInformationBirthDay);
        selectBirthDayDropDown.selectByIndex(10);
        Select selectBirthMonthDropDown=new Select(pageTC01.accountInformationBirthMonth);
        selectBirthMonthDropDown.selectByIndex(10);
        Select selectBirthYearDropDown=new Select(pageTC01.accountInformationBirthYear);
        selectBirthYearDropDown.selectByValue("2000");


    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        jse.executeScript("arguments[0].click();",pageTC01.accountInformationNewsletterCheckBox);

    }

    @And("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        jse.executeScript("arguments[0].click();",pageTC01.accountInformationReceiveSpecialCheckBox);
    }

    @And("Fill details: First name, Last name, Company, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressCountryStateCityZipcodeMobileNumber() {
        pageTC01.informationsFirstNameInputBox.sendKeys(fakerName);
        pageTC01.informationsLastNameInputBox.sendKeys(faker.name().lastName());
        pageTC01.informationsCompanyInputBox.sendKeys(faker.company().name());
        pageTC01.informationsAdress1InputBox.sendKeys(faker.address().fullAddress());
        select=new Select(pageTC01.informationsCountryDropDown);
        select.selectByValue("Canada");
        pageTC01.informationsStateInputBox.sendKeys(faker.address().state());
        pageTC01.informationsCityInputBox.sendKeys(faker.address().city());
        pageTC01.informationsZipcodeInputBox.sendKeys(faker.address().zipCode());
        pageTC01.informationsMobileNumberInputBox.sendKeys(faker.phoneNumber().cellPhone());

    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
        jse.executeScript("arguments[0].click();",pageTC01.informationCreateAccountSubmitButton);
    }

    @And("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        softAssert.assertTrue(pageTC01.accountCreatedText.isDisplayed());
        softAssert.assertEquals(pageTC01.accountCreatedText.getText(),"ACCOUNT CREATED!");

    }

    @And("Click Continue button")
    public void clickContinueButton() {
        pageTC01.accountCreatedContinueButton.click();

    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        // Driver.getDriver().switchTo().alert().dismiss();
        Driver.getDriver().switchTo().frame(pageTC01.iframeOne);
        Driver.getDriver().switchTo().frame(pageTC01.iframeTwo);
        pageTC01.iframeDismissButton.click();
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().parentFrame();
        pageTC01.loggedInAsNameButton.isDisplayed();
        System.out.println(pageTC01.loggedInAsNameButton.getText());
        softAssert.assertEquals(pageTC01.loggedInAsNameButton.getText(),("Logged in as "+fakerName));

    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
        pageTC01.deleteAccountButton.click();
    }

    @And("Verify that ACCOUNT DELETED is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        softAssert.assertTrue(pageTC01.accountDeletedText.isDisplayed());
        softAssert.assertEquals(pageTC01.accountDeletedText.getText(),"ACCOUNT DELETED!");
        pageTC01.deleteAccountContinueButton.click();


        softAssert.assertAll();
    }

}
