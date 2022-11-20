package stepDefinition;

import PageObjectModel.register_Page;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {
    register_Page rgs_page = new register_Page();
    private WebDriver driver;
    @Given("^Navigate to Website$")
    public void navigateToWebsite() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^click Sign in button$")
    public void clickSignInButton() {
        rgs_page.clickOnSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        rgs_page.typeEmail(email);

    }

    @And("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {
        rgs_page.clickOnSubmitButton();
    }

    @And("^choose title$")
    public void chooseTitle() {
        rgs_page.clickOnGender();
    }

    @And("^type firstname \"([^\"]*)\" and lastname\"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        rgs_page.typeFirstNameAndLastName(firstname,lastname);

    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
        rgs_page.typePassword(password);
    }

    @And("^type Company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable {
        rgs_page.typeCompany(company);
    }

    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) throws Throwable {
        rgs_page.typeAddress(address);
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }
}
