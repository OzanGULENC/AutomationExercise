package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PageTestCase01;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StepDefinitionsTestCase01 {

    PageTestCase01 pageTC01=new PageTestCase01();
    Faker faker=new Faker();

    @Given("Navigate to url")
    public void navigateToUrl() {

        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));
        System.out.println(Driver.getDriver().getCurrentUrl());

    }


    @When("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedURL="https://automationexercise.com/";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }


    @Then("Click on Signup Login button")
    public void clickOnSignupLoginButton() {
        pageTC01.signUpLoginButton.click();
    }

    @And("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertTrue(pageTC01.signUpForm.isDisplayed());
    }

    @And("Enter name and email address")
    public void enterNameAndEmailAddress() {
        String userName=faker.name().name();
        System.out.println(userName);
        pageTC01.signUpFormNameBox.sendKeys(userName);

        String email=faker.internet().emailAddress();
        System.out.println(email);
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
        assertTrue(pageTC01.enterAccountInformationText.isDisplayed());
        assertEquals(expectedAccountInformationText,actualAccountInformationText);
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
    }

    @And("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
    }

    @And("Select checkbox Receive special offers from our partners")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
    }

    @And("Fill details: First name, Last name, Company, Address, Address{int}, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(int arg0) {
    }

    @And("Click Create Account button")
    public void clickCreateAccountButton() {
    }

    @And("Verify that ACCOUNT CREATED is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
    }

    @And("Click Continue button")
    public void clickContinueButton() {
    }

    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
    }

    @And("Click Delete Account button")
    public void clickDeleteAccountButton() {
    }

    @And("Verify that ACCOUNT DELETED is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
    }


}
