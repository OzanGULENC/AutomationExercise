package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class PageTestCase01 {
    public PageTestCase01(){ PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@href='/login']")
    public WebElement signUpLoginButton;

    @FindBy(xpath = "//div[@class='signup-form']")
    public WebElement signUpForm;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement signUpFormNameBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signupFormEmailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpFormSubmitButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccountInformationText;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement accountInformationTitleMRButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement accountInformationNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement accountInformationEmailBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement accountInformationPasswordBox;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement accountInformationBirthDay;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement accountInformationBirthMonth;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement accountInformationBirthYear;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement accountInformationNewsletterCheckBox;

    @FindBy(xpath = "//input[@id='optin']")
    public WebElement accountInformationReceiveSpecialCheckBox;

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement informationsFirstNameInputBox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement informationsLastNameInputBox;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement informationsCompanyInputBox;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement informationsAdress1InputBox;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement informationsCountryDropDown;

    @FindBy(xpath = "//input[@id='state']")
    public WebElement informationsStateInputBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement informationsCityInputBox;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement informationsZipcodeInputBox;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement informationsMobileNumberInputBox;

    @FindBy(xpath = "//section//button[@type='submit']")
    public WebElement informationCreateAccountSubmitButton;

    @FindBy(xpath = "//b[normalize-space(text())='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement accountCreatedContinueButton;


    @FindBy(xpath = "//iframe[@id='aswift_2']")
    public WebElement iframeOne;

    @FindBy(xpath = "//iframe[@id='ad_iframe']")
    public WebElement iframeTwo;

    @FindBy(xpath = "//div[@id='dismiss-button']")
    public WebElement iframeDismissButton;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav']/li/a)[10]")
    public WebElement loggedInAsNameButton;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    public WebElement accountDeletedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement deleteAccountContinueButton;

















}
