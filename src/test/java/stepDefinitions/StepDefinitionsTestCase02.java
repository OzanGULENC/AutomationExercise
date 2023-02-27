package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.PageTestCase02;
import utilities.ConfigReader;
import utilities.Driver;

public class StepDefinitionsTestCase02 {
    PageTestCase02 pc2=new PageTestCase02();

    @Given("Tevfik Navigate to url")
    public void tevfik_navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("baseUrl"));

    }
    @When("Tevfik Verify that home page is visible successfully")
    public void tevfik_verify_that_home_page_is_visible_successfully() {
        String expectedURL="https://automationexercise.com/";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);



    }
}
